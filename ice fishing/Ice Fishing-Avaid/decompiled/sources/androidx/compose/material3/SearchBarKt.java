package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputInterceptor;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000®\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a\\\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ar\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aµ\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0099\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\b*\u0010+\u001a\u0099\u0001\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\b-\u0010+\u001a>\u0010.\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020'2\u001d\u0010(\u001a\u0019\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00010/¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u00102\u001a¢\u0001\u00103\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u00104\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u000e2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u0002082\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\b9\u0010:\u001a\u0084\u0001\u0010;\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u0002082\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\b<\u0010=\u001a@\u0010>\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u0002082\u0006\u0010?\u001a\u0002072\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b@\u0010A\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010B\u001a\u00020C2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\bE\u0010F\u001a\u008e\u0001\u0010G\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010B\u001a\u00020C2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\bH\u0010I\u001a7\u0010J\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020O0NH\u0007¢\u0006\u0002\u0010Q\u001aW\u0010R\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020O0NH\u0007¢\u0006\u0002\u0010U\u001aW\u0010V\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020O0N2\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020O0NH\u0007¢\u0006\u0002\u0010U\u001a\f\u0010W\u001a\u00020O*\u00020\u0016H\u0000\u001a\u0019\u0010X\u001a\u000207*\u00020\u001f2\u0006\u0010Y\u001a\u00020OH\u0001¢\u0006\u0002\u0010Z\u001a\u0019\u0010[\u001a\u000207*\u00020\u001f2\u0006\u0010Y\u001a\u00020OH\u0001¢\u0006\u0002\u0010Z\u001a\u0090\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020]2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010`\u001a\u00020C2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020C2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010f\u001a\u0004\u0018\u00010g2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\bh\u0010i\u001a\u0086\u0002\u0010G\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020]2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00010\u001c2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010`\u001a\u00020C2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020C2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010g2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0004\bj\u0010k\u001aÄ\u0001\u0010p\u001a\u00020\u00012\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020s0r2\u0006\u0010t\u001a\u00020u2\u0014\u0010v\u001a\u0010\u0012\f\u0012\n\u0018\u00010xj\u0004\u0018\u0001`y0w2\u0014\u0010z\u001a\u0010\u0012\f\u0012\n\u0018\u00010xj\u0004\u0018\u0001`y0w2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0001¢\u0006\u0004\b{\u0010|\u001a \u0001\u0010}\u001a\u00020\u00012\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020s0r2\u0006\u0010t\u001a\u00020u2\u0014\u0010v\u001a\u0010\u0012\f\u0012\n\u0018\u00010xj\u0004\u0018\u0001`y0w2\u0014\u0010z\u001a\u0010\u0012\f\u0012\n\u0018\u00010xj\u0004\u0018\u0001`y0w2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010~\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u007f\u001a\u0088\u0001\u0010\u0080\u0001\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001aq\u0010\u0084\u0001\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0007\u0010\u0085\u0001\u001a\u00020C2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0096\u0001\u0010\u0088\u0001\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u0002012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0007\u0010\u008a\u0001\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0007\u0010\u008b\u0001\u001a\u00020C2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0010\u0010\u008e\u0001\u001a\u00020O*\u0005\u0018\u00010\u008f\u0001H\u0002\u001a\"\u0010\u0090\u0001\u001a\u00020\u00012\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0003\u0010\u0091\u0001\u001a'\u0010\u0097\u0001\u001a\u00020\u00012\u0007\u0010f\u001a\u00030\u0098\u00012\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0003\u0010\u009a\u0001\u001a0\u0010\u009b\u0001\u001a\u00020O2\u000e\u0010z\u001a\n\u0018\u00010xj\u0004\u0018\u0001`y2\u0007\u0010\u009c\u0001\u001a\u00020O2\u0006\u0010t\u001a\u00020OH\u0002¢\u0006\u0003\u0010\u009d\u0001\u001aS\u0010\u009e\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030\u009f\u00012\u000e\u0010z\u001a\n\u0018\u00010xj\u0004\u0018\u0001`y2\b\u0010£\u0001\u001a\u00030¤\u00012\u0007\u0010\u009c\u0001\u001a\u00020O2\u0007\u0010¥\u0001\u001a\u00020OH\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001ad\u0010¨\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030\u009f\u00012\u000e\u0010z\u001a\n\u0018\u00010xj\u0004\u0018\u0001`y2\u000e\u0010v\u001a\n\u0018\u00010xj\u0004\u0018\u0001`y2\b\u0010©\u0001\u001a\u00030\u009f\u00012\b\u0010ª\u0001\u001a\u00030\u009f\u00012\u0007\u0010¥\u0001\u001a\u00020OH\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001\"\u001e\u0010l\u001a\u00020C*\u00020\u00038BX\u0082\u0004¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bl\u0010o\"#\u0010\u0092\u0001\u001a\u00030\u0093\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u000f\u0012\u0005\b\u0094\u0001\u0010n\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0010\u0010\u00ad\u0001\u001a\u00030®\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000f\u0010¯\u0001\u001a\u00020]X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010°\u0001\u001a\u00020]X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010±\u0001\u001a\u00020]X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010²\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0012\u0010¶\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0005\n\u0003\u0010µ\u0001\"\u001a\u0010·\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\b¸\u0001\u0010´\u0001\"\u001a\u0010¹\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u0012\u0006\bº\u0001\u0010»\u0001\"\u0012\u0010¼\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0005\n\u0003\u0010µ\u0001\"\u001a\u0010½\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\b¾\u0001\u0010´\u0001\"\u000f\u0010¿\u0001\u001a\u00020OX\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010À\u0001\u001a\u00020OX\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010Á\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\bÂ\u0001\u0010´\u0001\"\u001a\u0010Ã\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\bÄ\u0001\u0010´\u0001\"\u001a\u0010Å\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\r\n\u0003\u0010µ\u0001\u001a\u0006\bÆ\u0001\u0010´\u0001\"\u0012\u0010Ç\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0005\n\u0003\u0010µ\u0001\"\u000f\u0010È\u0001\u001a\u00020OX\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010É\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0005\n\u0003\u0010µ\u0001\"\u000f\u0010Ê\u0001\u001a\u00020OX\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010Ë\u0001\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0005\n\u0003\u0010µ\u0001\"\u0010\u0010Ì\u0001\u001a\u00030\u009f\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010Í\u0001\u001a\u00030\u009f\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010Î\u0001\u001a\u00030\u009f\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010Ï\u0001\u001a\u00030Ð\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Ñ\u0001\u001a\u00030Ð\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020O0Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020O0Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020O0Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030×\u00010Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Ù\u0001\u001a\u00030Ú\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Û\u0001\u001a\u00030Ü\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020O0Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020O0Ó\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006ß\u0001²\u0006\n\u0010[\u001a\u000207X\u008a\u0084\u0002²\u0006\u000b\u0010à\u0001\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u000b\u0010á\u0001\u001a\u00020CX\u008a\u0084\u0002²\u0006\u000b\u0010â\u0001\u001a\u00020CX\u008a\u0084\u0002²\u0006\f\u0010ã\u0001\u001a\u00030ä\u0001X\u008a\u0084\u0002"}, d2 = {"SearchBar", "", "state", "Landroidx/compose/material3/SearchBarState;", "inputField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "SearchBar-nbWgWpA", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/runtime/Composer;II)V", "TopSearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "scrollBehavior", "Landroidx/compose/material3/SearchBarScrollBehavior;", "TopSearchBar-qKj4JfE", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/SearchBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "AppBarWithSearch", "navigationIcon", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/material3/AppBarWithSearchColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "AppBarWithSearch-ii5sN6A", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/AppBarWithSearchColors;FFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/SearchBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "ExpandedFullScreenContainedSearchBar", "collapsedShape", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "ExpandedFullScreenContainedSearchBar-_UtchM0", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ExpandedFullScreenSearchBar", "ExpandedFullScreenSearchBar-_UtchM0", "ExpandedFullScreenSearchBarImpl", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/material3/internal/PredictiveBackState;", "(Landroidx/compose/material3/SearchBarState;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ExpandedDockedSearchBarWithGap", "dropdownShape", "dropdownGapSize", "dropdownScrimColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/window/PopupProperties;", "ExpandedDockedSearchBarWithGap-AX2PdCw", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;FJLandroidx/compose/material3/SearchBarColors;FFLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ExpandedDockedSearchBar", "ExpandedDockedSearchBar-qKj4JfE", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ExpandedDockedSearchBarImpl", "scrimColor", "ExpandedDockedSearchBarImpl-FNF3uiM", "(Landroidx/compose/material3/SearchBarState;Landroidx/compose/ui/window/PopupProperties;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "expanded", "", "onExpandedChange", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DockedSearchBar", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberSearchBarState", "initialValue", "Landroidx/compose/material3/SearchBarValue;", "animationSpecForExpand", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpecForCollapse", "(Landroidx/compose/material3/SearchBarValue;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarState;", "rememberContainedSearchBarState", "animationSpecForContentFadeIn", "animationSpecForContentFadeOut", "(Landroidx/compose/material3/SearchBarValue;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarState;", "rememberWithGapSearchBarState", "overlappedFraction", "searchBarContainerColor", "colorTransitionFraction", "(Landroidx/compose/material3/AppBarWithSearchColors;F)J", "appBarContainerColor", "query", "", "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "isExpanded", "isExpanded$annotations", "(Landroidx/compose/material3/SearchBarState;)V", "(Landroidx/compose/material3/SearchBarState;)Z", "SearchBarImpl", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "finalBackProgress", "Landroidx/compose/runtime/MutableFloatState;", "firstBackEvent", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "Landroidx/compose/material3/internal/BackEventCompat;", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarLayout", "surface", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DockedSearchBarLayout", "searchBarShape", "DockedSearchBarLayout-gLs90yA", "(Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/unit/Dp;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DockedSearchBarLayoutImpl", "hasGap", "DockedSearchBarLayoutImpl-1tP8Re8", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SearchBarColors;FFZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FullScreenSearchBarLayout", "predictiveBackState", "inputFieldPadding", "isContained", "FullScreenSearchBarLayout-BXK5RNM", "(Landroidx/compose/material3/SearchBarState;Landroidx/compose/material3/internal/PredictiveBackState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "transform", "Landroidx/compose/material3/internal/BackEventProgress$InProgress;", "DisableSoftKeyboard", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "collapsedBounds", "Landroidx/compose/ui/unit/IntRect;", "getCollapsedBounds$annotations", "getCollapsedBounds", "(Landroidx/compose/material3/SearchBarState;)Landroidx/compose/ui/unit/IntRect;", "DetectClickFromInteractionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "onClick", "(Landroidx/compose/foundation/interaction/InteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "calculatePredictiveBackMultiplier", NotificationCompat.CATEGORY_PROGRESS, "(Landroidx/activity/BackEventCompat;FF)F", "calculatePredictiveBackOffsetX", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minMargin", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetY", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "LayoutIdInputField", "LayoutIdSurface", "LayoutIdSearchContent", "SearchBarAsTopBarPadding", "getSearchBarAsTopBarPadding", "()F", "F", "AppBarWithSearchHorizontalPadding", "AppBarWithSearchVerticalPadding", "getAppBarWithSearchVerticalPadding", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "FullScreenExpandedHorizontalPadding", "DockedExpandedTableMinHeight", "getDockedExpandedTableMinHeight", "DockedExpandedTableMaxHeightScreenRatio", "DockedExpandedWithGapTableMaxHeightScreenRatio", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarMaxWidth", "getSearchBarMaxWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "SearchBarIconOffsetX", "SearchBarPredictiveBackMinScale", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "AnimationEnterDurationMillis", "AnimationExitDurationMillis", "AnimationDelayMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationExitEasing", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationExitFloatSpec", "AnimationPredictiveBackExitFloatSpec", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitSizeSpec", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "AnimationForContentFadeInSpec", "AnimationForContentFadeOutSpec", "material3", "searchBarColors", "useFullScreenShape", "showContent", "backEvent", "Landroidx/compose/material3/internal/BackEventProgress;"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationForContentFadeInSpec;
    private static final FiniteAnimationSpec<Float> AnimationForContentFadeOutSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final float AppBarWithSearchHorizontalPadding;
    private static final float AppBarWithSearchVerticalPadding;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedWithGapTableMaxHeightScreenRatio = 0.5f;
    private static final float FullScreenExpandedHorizontalPadding;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarAsTopBarPadding;
    private static final float SearchBarIconOffsetX;
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), new TextSelectionColors(Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), null), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), null);
    private static final float SearchBarCornerRadius = Dp.m9732constructorimpl(SearchBarDefaults.INSTANCE.m3825getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedExpandedTableMinHeight = Dp.m9732constructorimpl(240);
    private static final float SearchBarMinWidth = Dp.m9732constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m9732constructorimpl(720);
    private static final float SearchBarPredictiveBackMaxOffsetY = Dp.m9732constructorimpl(24);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarWithSearch_ii5sN6A$lambda$9(SearchBarState searchBarState, Function2 function2, Modifier modifier, Function2 function22, Function3 function3, Shape shape, AppBarWithSearchColors appBarWithSearchColors, float f, float f2, PaddingValues paddingValues, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m3862AppBarWithSearchii5sN6A(searchBarState, function2, modifier, function22, function3, shape, appBarWithSearchColors, f, f2, paddingValues, windowInsets, searchBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetectClickFromInteractionSource$lambda$1(InteractionSource interactionSource, Function0 function0, int i, Composer composer, int i2) {
        DetectClickFromInteractionSource(interactionSource, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisableSoftKeyboard$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        DisableSoftKeyboard(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$2(Shape shape, SearchBarState searchBarState, Function2 function2, Modifier modifier, SearchBarColors searchBarColors, float f, float f2, boolean z, Function2 function22, int i, Composer composer, int i2) {
        m3866DockedSearchBarLayoutImpl1tP8Re8(shape, searchBarState, function2, modifier, searchBarColors, f, f2, z, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayout_gLs90yA$lambda$2(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, Shape shape2, Dp dp, SearchBarColors searchBarColors, float f, float f2, Function3 function3, int i, Composer composer, int i2) {
        m3865DockedSearchBarLayoutgLs90yA(searchBarState, function2, modifier, shape, shape2, dp, searchBarColors, f, f2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBar_EQC0FA8$lambda$2(Function2 function2, boolean z, Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3863DockedSearchBarEQC0FA8(function2, z, function1, modifier, shape, searchBarColors, f, f2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBar_eWTbjVg$lambda$1(String str, Function1 function1, Function1 function12, boolean z, Function1 function13, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3864DockedSearchBareWTbjVg(str, function1, function12, z, function13, modifier, z2, function2, function22, function23, shape, searchBarColors, f, f2, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0(SearchBarState searchBarState, PopupProperties popupProperties, long j, Function3 function3, int i, Composer composer, int i2) {
        m3868ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3(SearchBarState searchBarState, PopupProperties popupProperties, long j, Function3 function3, int i, Composer composer, int i2) {
        m3868ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, Shape shape2, float f, long j, SearchBarColors searchBarColors, float f2, float f3, PopupProperties popupProperties, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3869ExpandedDockedSearchBarWithGapAX2PdCw(searchBarState, function2, modifier, shape, shape2, f, j, searchBarColors, f2, f3, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBar_qKj4JfE$lambda$1(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3867ExpandedDockedSearchBarqKj4JfE(searchBarState, function2, modifier, shape, searchBarColors, f, f2, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2 function22, DialogProperties dialogProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3870ExpandedFullScreenContainedSearchBar_UtchM0(searchBarState, function2, modifier, shape, searchBarColors, f, f2, function22, dialogProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBarImpl$lambda$0(SearchBarState searchBarState, DialogProperties dialogProperties, Function4 function4, int i, int i2, Composer composer, int i3) {
        ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBarImpl$lambda$3(SearchBarState searchBarState, DialogProperties dialogProperties, Function4 function4, int i, int i2, Composer composer, int i3) {
        ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBar__UtchM0$lambda$2(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2 function22, DialogProperties dialogProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3871ExpandedFullScreenSearchBar_UtchM0(searchBarState, function2, modifier, shape, searchBarColors, f, f2, function22, dialogProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenSearchBarLayout_BXK5RNM$lambda$11(SearchBarState searchBarState, PredictiveBackState predictiveBackState, Function2 function2, PaddingValues paddingValues, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3872FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, function2, paddingValues, modifier, shape, searchBarColors, f, f2, windowInsets, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$7(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, Function2 function2, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3876SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier, function2, shape, searchBarColors, f, f2, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarLayout$lambda$4(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i, Composer composer, int i2) {
        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_WuY5d9Q$lambda$1(String str, Function1 function1, Function1 function12, boolean z, Function1 function13, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3873SearchBarWuY5d9Q(str, function1, function12, z, function13, modifier, z2, function2, function22, function23, shape, searchBarColors, f, f2, windowInsets, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_Y92LkZI$lambda$7(Function2 function2, boolean z, Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3874SearchBarY92LkZI(function2, z, function1, modifier, shape, searchBarColors, f, f2, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_nbWgWpA$lambda$1(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, int i, int i2, Composer composer, int i3) {
        m3875SearchBarnbWgWpA(searchBarState, function2, modifier, shape, searchBarColors, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopSearchBar_qKj4JfE$lambda$0(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m3877TopSearchBarqKj4JfE(searchBarState, function2, modifier, shape, searchBarColors, f, f2, windowInsets, searchBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getCollapsedBounds$annotations(SearchBarState searchBarState) {
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    private static /* synthetic */ void isExpanded$annotations(SearchBarState searchBarState) {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0093  */
    /* renamed from: SearchBar-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3875SearchBarnbWgWpA(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Composer composer, final int i, final int i2) {
        SearchBarState searchBarState2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        int i6;
        boolean z;
        final float f7;
        final Modifier modifier4;
        final Shape shape4;
        final SearchBarColors searchBarColors4;
        final float f8;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1234122643);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)N(state,inputField,modifier,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp)266@13328L382,266@13308L402:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            searchBarState2 = searchBarState;
            i3 = (startRestartGroup.changed(searchBarState2) ? 4 : 2) | i;
        } else {
            searchBarState2 = searchBarState;
            i3 = i;
        }
        if ((i & 48) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    f4 = f2;
                    i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "261@13105L15,262@13170L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                            shape4 = shape2;
                            searchBarColors4 = searchBarColors2;
                            f8 = f3;
                            f7 = f4;
                            i6 = 6;
                            z = true;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                z = true;
                                i3 &= -57345;
                                i6 = 6;
                                searchBarColors2 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                            } else {
                                i6 = 6;
                                z = true;
                            }
                            float m3827getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                            if (i5 != 0) {
                                modifier4 = companion;
                                shape4 = shape2;
                                searchBarColors4 = searchBarColors2;
                                f8 = m3827getTonalElevationD9Ej5fM;
                                f7 = SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM();
                            } else {
                                f7 = f2;
                                modifier4 = companion;
                                shape4 = shape2;
                                searchBarColors4 = searchBarColors2;
                                f8 = m3827getTonalElevationD9Ej5fM;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1234122643, i3, -1, "androidx.compose.material3.SearchBar (SearchBar.kt:265)");
                        }
                        final SearchBarState searchBarState3 = searchBarState2;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                        DisableSoftKeyboard(ComposableLambdaKt.rememberComposableLambda(-615762271, z, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda50
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SearchBar_nbWgWpA$lambda$0;
                                SearchBar_nbWgWpA$lambda$0 = SearchBarKt.SearchBar_nbWgWpA$lambda$0(Modifier.this, searchBarState3, shape4, searchBarColors4, f8, f7, function23, (Composer) obj, ((Integer) obj2).intValue());
                                return SearchBar_nbWgWpA$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, i6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        shape3 = shape4;
                        searchBarColors3 = searchBarColors4;
                        f5 = f8;
                        f6 = f7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        searchBarColors3 = searchBarColors2;
                        f5 = f;
                        f6 = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda51
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SearchBar_nbWgWpA$lambda$1;
                                SearchBar_nbWgWpA$lambda$1 = SearchBarKt.SearchBar_nbWgWpA$lambda$1(SearchBarState.this, function2, modifier3, shape3, searchBarColors3, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return SearchBar_nbWgWpA$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                f4 = f2;
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            f4 = f2;
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        f4 = f2;
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_nbWgWpA$lambda$0(Modifier modifier, final SearchBarState searchBarState, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C268@13400L30,271@13529L38,267@13338L366:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615762271, i, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:267)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 957946751, "CC(remember):SearchBar.kt#9igjgp");
            boolean changed = composer.changed(searchBarState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SearchBar_nbWgWpA$lambda$0$0$0;
                        SearchBar_nbWgWpA$lambda$0$0$0 = SearchBarKt.SearchBar_nbWgWpA$lambda$0$0$0(SearchBarState.this, (LayoutCoordinates) obj);
                        return SearchBar_nbWgWpA$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.m4112SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue), shape, searchBarColors.getContainerColor(), ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors.getContainerColor(), composer, 0), f, f2, null, function2, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_nbWgWpA$lambda$0$0$0(SearchBarState searchBarState, LayoutCoordinates layoutCoordinates) {
        searchBarState.setCollapsedCoords(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "Renamed to `AppBarWithSearch`", replaceWith = @ReplaceWith(expression = "AppBarWithSearch(state, inputField, modifier, navigationIcon, actions, shape, colors, tonalElevation, windowInsets, scrollBehavior)", imports = {}))
    /* renamed from: TopSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3877TopSearchBarqKj4JfE(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        WindowInsets windowInsets2;
        int i6;
        final WindowInsets windowInsets3;
        final SearchBarScrollBehavior searchBarScrollBehavior2;
        Composer composer2;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Modifier modifier3;
        int i7;
        int i8;
        WindowInsets windowInsets4;
        SearchBarScrollBehavior searchBarScrollBehavior3;
        SearchBarColors searchBarColors3;
        float f7;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(782822734);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopSearchBar)N(state,inputField,modifier,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,scrollBehavior)342@17034L272,336@16861L614:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    shape2 = shape;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f3 = f;
            } else {
                f3 = f;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i9 = 4194304;
                    i3 |= i9;
                } else {
                    windowInsets2 = windowInsets;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(searchBarScrollBehavior) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "329@16540L15,330@16605L8,333@16786L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        searchBarScrollBehavior3 = searchBarScrollBehavior;
                        searchBarColors3 = searchBarColors2;
                        f7 = f3;
                    } else {
                        Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                        } else {
                            shape3 = shape2;
                        }
                        int i13 = i3;
                        if ((i2 & 16) != 0) {
                            i8 = i6;
                            modifier3 = companion;
                            i7 = 6;
                            i13 &= -57345;
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                        } else {
                            modifier3 = companion;
                            i7 = 6;
                            i8 = i6;
                        }
                        if (i4 != 0) {
                            f3 = SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM();
                        }
                        float m3826getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                        if ((i2 & 128) != 0) {
                            windowInsets4 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, i7);
                            i13 &= -29360129;
                        } else {
                            windowInsets4 = windowInsets;
                        }
                        if (i8 != 0) {
                            searchBarScrollBehavior3 = null;
                            modifier2 = modifier3;
                        } else {
                            modifier2 = modifier3;
                            searchBarScrollBehavior3 = searchBarScrollBehavior;
                        }
                        windowInsets2 = windowInsets4;
                        f4 = m3826getShadowElevationD9Ej5fM;
                        searchBarColors3 = searchBarColors2;
                        f7 = f3;
                        shape2 = shape3;
                        i3 = i13;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(782822734, i3, -1, "androidx.compose.material3.TopSearchBar (SearchBar.kt:335)");
                    }
                    searchBarColors2 = searchBarColors3;
                    int i14 = i3 << 6;
                    float f8 = f7;
                    SearchBarScrollBehavior searchBarScrollBehavior4 = searchBarScrollBehavior3;
                    Modifier modifier4 = modifier2;
                    Shape shape4 = shape2;
                    float f9 = f4;
                    WindowInsets windowInsets5 = windowInsets2;
                    m3862AppBarWithSearchii5sN6A(searchBarState, function2, modifier4, null, null, shape4, SearchBarDefaults.INSTANCE.m3820appBarWithSearchColorsHformbs(searchBarColors3, Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6821getTransparent0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU(), 0L, 0L, startRestartGroup, ((i3 >> 12) & 14) | 1576368, 48), f8, f9, null, windowInsets5, searchBarScrollBehavior4, startRestartGroup, (i3 & 1022) | (458752 & i14) | (29360128 & i14) | (i14 & 234881024), (i3 >> 21) & 126, 536);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    shape2 = shape4;
                    f5 = f8;
                    f6 = f9;
                    windowInsets3 = windowInsets5;
                    searchBarScrollBehavior2 = searchBarScrollBehavior4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    windowInsets3 = windowInsets;
                    searchBarScrollBehavior2 = searchBarScrollBehavior;
                    composer2 = startRestartGroup;
                    f5 = f3;
                    f6 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TopSearchBar_qKj4JfE$lambda$0;
                            TopSearchBar_qKj4JfE$lambda$0 = SearchBarKt.TopSearchBar_qKj4JfE$lambda$0(SearchBarState.this, function2, modifier2, shape2, searchBarColors2, f5, f6, windowInsets3, searchBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TopSearchBar_qKj4JfE$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /* renamed from: AppBarWithSearch-ii5sN6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3862AppBarWithSearchii5sN6A(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Shape shape, AppBarWithSearchColors appBarWithSearchColors, float f, float f2, PaddingValues paddingValues, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        Shape shape2;
        AppBarWithSearchColors appBarWithSearchColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final WindowInsets windowInsets2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Shape shape3;
        final AppBarWithSearchColors appBarWithSearchColors3;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final float f3;
        final float f4;
        final PaddingValues paddingValues2;
        final SearchBarScrollBehavior searchBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Composer composer3;
        final AppBarWithSearchColors appBarWithSearchColors4;
        WindowInsets windowInsets3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        final Shape shape4;
        final float f5;
        final float f6;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        int i16;
        SearchBarScrollBehavior searchBarScrollBehavior3;
        boolean z;
        int i17;
        Object valueOf;
        boolean z2;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Object rememberedValue4;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1363748353);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBarWithSearch)N(state,inputField,modifier,navigationIcon,actions,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,contentPadding,windowInsets,scrollBehavior)418@21214L69,421@21363L489,434@21991L7,434@21913L86,437@22036L185,444@22262L24,453@22609L27,456@22806L2302,443@22227L2881:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function22;
                i4 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        appBarWithSearchColors2 = appBarWithSearchColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(appBarWithSearchColors2)) ? 1048576 : 524288;
                    } else {
                        appBarWithSearchColors2 = appBarWithSearchColors;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                        i9 = i8;
                    } else {
                        i9 = i8;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                        i11 = i10;
                    } else {
                        i11 = i10;
                        if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                    }
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0 && startRestartGroup.changed(windowInsets)) {
                            i18 = 4;
                            i12 = i2 | i18;
                        }
                        i18 = 2;
                        i12 = i2 | i18;
                    } else {
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i14 = i13;
                        i15 = i12 | 48;
                    } else {
                        i14 = i13;
                        if ((i2 & 48) == 0) {
                            i12 |= startRestartGroup.changed(searchBarScrollBehavior) ? 32 : 16;
                        }
                        i15 = i12;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "406@20623L15,407@20695L24,411@20968L12");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 1024) != 0) {
                                i15 &= -15;
                            }
                            f5 = f;
                            f6 = f2;
                            paddingValues3 = paddingValues;
                            windowInsets3 = windowInsets;
                            composer3 = startRestartGroup;
                            function34 = function32;
                            shape4 = shape2;
                            appBarWithSearchColors4 = appBarWithSearchColors2;
                            companion = modifier2;
                            function25 = function23;
                            i16 = i15;
                        } else {
                            companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                function23 = null;
                            }
                            if (i6 != 0) {
                                function32 = null;
                            }
                            if ((i3 & 32) != 0) {
                                shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                appBarWithSearchColors4 = SearchBarDefaults.INSTANCE.m3820appBarWithSearchColorsHformbs(null, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                composer3 = startRestartGroup;
                                i4 &= -3670017;
                            } else {
                                composer3 = startRestartGroup;
                                appBarWithSearchColors4 = appBarWithSearchColors2;
                            }
                            float m3827getTonalElevationD9Ej5fM = i7 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                            float m3826getShadowElevationD9Ej5fM = i9 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                            PaddingValues appBarContentPadding = i11 != 0 ? SearchBarDefaults.INSTANCE.getAppBarContentPadding() : paddingValues;
                            if ((i3 & 1024) != 0) {
                                windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                i15 &= -15;
                            } else {
                                windowInsets3 = windowInsets;
                            }
                            function34 = function32;
                            shape4 = shape2;
                            f5 = m3827getTonalElevationD9Ej5fM;
                            f6 = m3826getShadowElevationD9Ej5fM;
                            paddingValues3 = appBarContentPadding;
                            function25 = function23;
                            i16 = i15;
                            if (i14 != 0) {
                                searchBarScrollBehavior3 = null;
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1363748353, i4, i16, "androidx.compose.material3.AppBarWithSearch (SearchBar.kt:413)");
                                }
                                MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
                                ComposerKt.sourceInformationMarkerStart(composer3, 597169606, "CC(remember):SearchBar.kt#9igjgp");
                                int i20 = (3670016 & i4) ^ 1572864;
                                z = (i20 <= 1048576 && composer3.changed(appBarWithSearchColors4)) || (i4 & 1572864) == 1048576;
                                Object rememberedValue5 = composer3.rememberedValue();
                                if (!z || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    searchBarScrollBehavior2 = searchBarScrollBehavior3;
                                    i17 = i4;
                                    valueOf = Boolean.valueOf(Color.m6787equalsimpl0(appBarWithSearchColors4.getAppBarContainerColor(), Color.INSTANCE.m6821getTransparent0d7_KjU()));
                                    composer3.updateRememberedValue(valueOf);
                                } else {
                                    i17 = i4;
                                    valueOf = rememberedValue5;
                                    searchBarScrollBehavior2 = searchBarScrollBehavior3;
                                }
                                final boolean booleanValue = ((Boolean) valueOf).booleanValue();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerStart(composer3, 597174794, "CC(remember):SearchBar.kt#9igjgp");
                                z2 = ((i20 <= 1048576 && composer3.changed(appBarWithSearchColors4)) || (i17 & 1572864) == 1048576) | ((i16 & 112) != 32);
                                rememberedValue = composer3.rememberedValue();
                                if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Pair AppBarWithSearch_ii5sN6A$lambda$1$0;
                                            AppBarWithSearch_ii5sN6A$lambda$1$0 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$1$0(SearchBarScrollBehavior.this, appBarWithSearchColors4);
                                            return AppBarWithSearch_ii5sN6A$lambda$1$0;
                                        }
                                    });
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Pair pair = (Pair) ((State) rememberedValue).getValue();
                                long m6796unboximpl = ((Color) pair.component1()).m6796unboximpl();
                                long m6796unboximpl2 = ((Color) pair.component2()).m6796unboximpl();
                                final State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(m6796unboximpl, MotionSchemeKt.value(motionSchemeKeyTokens, composer3, 6), null, null, composer3, 0, 12);
                                ComposerKt.sourceInformationMarkerStart(composer3, 597196026, "CC(remember):SearchBar.kt#9igjgp");
                                changed = composer3.changed(m6796unboximpl2);
                                rememberedValue2 = composer3.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SearchBarColors.m3804copyjxsXWHM$default(appBarWithSearchColors4.getSearchBarColors(), m6796unboximpl2, 0L, null, 6, null), null, 2, null);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerStart(composer3, 597203097, "CC(remember):SearchBar.kt#9igjgp");
                                changed2 = composer3.changed(m200animateColorAsStateeuL9pac);
                                rememberedValue3 = composer3.rememberedValue();
                                if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (ColorProducer) new ColorProducer() { // from class: androidx.compose.material3.SearchBarKt$AppBarWithSearch$2$1
                                        @Override // androidx.compose.ui.graphics.ColorProducer
                                        /* renamed from: invoke-0d7_KjU */
                                        public final long mo3041invoke0d7_KjU() {
                                            long AppBarWithSearch_ii5sN6A$lambda$2;
                                            AppBarWithSearch_ii5sN6A$lambda$2 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$2(m200animateColorAsStateeuL9pac);
                                            return AppBarWithSearch_ii5sN6A$lambda$2;
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue3);
                                }
                                ColorProducer colorProducer = (ColorProducer) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (searchBarScrollBehavior2 != null || (r2 = searchBarScrollBehavior2.searchBarScrollBehavior(Modifier.INSTANCE)) == null) {
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                }
                                Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion.then(companion2), 0.0f, 1, null), windowInsets3);
                                ComposerKt.sourceInformationMarkerStart(composer3, 597214204, "CC(remember):SearchBar.kt#9igjgp");
                                rememberedValue4 = composer3.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AppBarWithSearch_ii5sN6A$lambda$7$0;
                                            AppBarWithSearch_ii5sN6A$lambda$7$0 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$7$0((SemanticsPropertyReceiver) obj);
                                            return AppBarWithSearch_ii5sN6A$lambda$7$0;
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                final AppBarWithSearchColors appBarWithSearchColors5 = appBarWithSearchColors4;
                                SurfaceKt.m4116Surfacevz2T9sI(colorProducer, SemanticsModifierKt.semantics$default(windowInsetsPadding, false, (Function1) rememberedValue4, 1, null), booleanValue ? f5 : Dp.m9732constructorimpl(0), booleanValue ? f6 : Dp.m9732constructorimpl(0), ComposableLambdaKt.rememberComposableLambda(1374718147, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit AppBarWithSearch_ii5sN6A$lambda$8;
                                        AppBarWithSearch_ii5sN6A$lambda$8 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$8(PaddingValues.this, function25, searchBarState, function34, appBarWithSearchColors5, function2, shape4, booleanValue, f5, f6, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                                        return AppBarWithSearch_ii5sN6A$lambda$8;
                                    }
                                }, composer3, 54), composer3, 24576, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                composer2 = composer3;
                                windowInsets2 = windowInsets3;
                                paddingValues2 = paddingValues3;
                                function24 = function25;
                                function33 = function34;
                                appBarWithSearchColors3 = appBarWithSearchColors5;
                                shape3 = shape4;
                                f3 = f5;
                                f4 = f6;
                            }
                        }
                        searchBarScrollBehavior3 = searchBarScrollBehavior;
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.DefaultEffects;
                        ComposerKt.sourceInformationMarkerStart(composer3, 597169606, "CC(remember):SearchBar.kt#9igjgp");
                        int i202 = (3670016 & i4) ^ 1572864;
                        if (i202 <= 1048576) {
                        }
                        Object rememberedValue52 = composer3.rememberedValue();
                        if (z) {
                        }
                        searchBarScrollBehavior2 = searchBarScrollBehavior3;
                        i17 = i4;
                        valueOf = Boolean.valueOf(Color.m6787equalsimpl0(appBarWithSearchColors4.getAppBarContainerColor(), Color.INSTANCE.m6821getTransparent0d7_KjU()));
                        composer3.updateRememberedValue(valueOf);
                        final boolean booleanValue2 = ((Boolean) valueOf).booleanValue();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 597174794, "CC(remember):SearchBar.kt#9igjgp");
                        z2 = ((i202 <= 1048576 && composer3.changed(appBarWithSearchColors4)) || (i17 & 1572864) == 1048576) | ((i16 & 112) != 32);
                        rememberedValue = composer3.rememberedValue();
                        if (!z2) {
                        }
                        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Pair AppBarWithSearch_ii5sN6A$lambda$1$0;
                                AppBarWithSearch_ii5sN6A$lambda$1$0 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$1$0(SearchBarScrollBehavior.this, appBarWithSearchColors4);
                                return AppBarWithSearch_ii5sN6A$lambda$1$0;
                            }
                        });
                        composer3.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Pair pair2 = (Pair) ((State) rememberedValue).getValue();
                        long m6796unboximpl3 = ((Color) pair2.component1()).m6796unboximpl();
                        long m6796unboximpl22 = ((Color) pair2.component2()).m6796unboximpl();
                        final State<Color> m200animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(m6796unboximpl3, MotionSchemeKt.value(motionSchemeKeyTokens2, composer3, 6), null, null, composer3, 0, 12);
                        ComposerKt.sourceInformationMarkerStart(composer3, 597196026, "CC(remember):SearchBar.kt#9igjgp");
                        changed = composer3.changed(m6796unboximpl22);
                        rememberedValue2 = composer3.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SearchBarColors.m3804copyjxsXWHM$default(appBarWithSearchColors4.getSearchBarColors(), m6796unboximpl22, 0L, null, 6, null), null, 2, null);
                        composer3.updateRememberedValue(rememberedValue2);
                        final MutableState mutableState2 = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 597203097, "CC(remember):SearchBar.kt#9igjgp");
                        changed2 = composer3.changed(m200animateColorAsStateeuL9pac2);
                        rememberedValue3 = composer3.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue3 = (ColorProducer) new ColorProducer() { // from class: androidx.compose.material3.SearchBarKt$AppBarWithSearch$2$1
                            @Override // androidx.compose.ui.graphics.ColorProducer
                            /* renamed from: invoke-0d7_KjU */
                            public final long mo3041invoke0d7_KjU() {
                                long AppBarWithSearch_ii5sN6A$lambda$2;
                                AppBarWithSearch_ii5sN6A$lambda$2 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$2(m200animateColorAsStateeuL9pac2);
                                return AppBarWithSearch_ii5sN6A$lambda$2;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                        ColorProducer colorProducer2 = (ColorProducer) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (searchBarScrollBehavior2 != null) {
                        }
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier windowInsetsPadding2 = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(companion.then(companion22), 0.0f, 1, null), windowInsets3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 597214204, "CC(remember):SearchBar.kt#9igjgp");
                        rememberedValue4 = composer3.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final AppBarWithSearchColors appBarWithSearchColors52 = appBarWithSearchColors4;
                        SurfaceKt.m4116Surfacevz2T9sI(colorProducer2, SemanticsModifierKt.semantics$default(windowInsetsPadding2, false, (Function1) rememberedValue4, 1, null), booleanValue2 ? f5 : Dp.m9732constructorimpl(0), booleanValue2 ? f6 : Dp.m9732constructorimpl(0), ComposableLambdaKt.rememberComposableLambda(1374718147, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AppBarWithSearch_ii5sN6A$lambda$8;
                                AppBarWithSearch_ii5sN6A$lambda$8 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$8(PaddingValues.this, function25, searchBarState, function34, appBarWithSearchColors52, function2, shape4, booleanValue2, f5, f6, mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                                return AppBarWithSearch_ii5sN6A$lambda$8;
                            }
                        }, composer3, 54), composer3, 24576, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        composer2 = composer3;
                        windowInsets2 = windowInsets3;
                        paddingValues2 = paddingValues3;
                        function24 = function25;
                        function33 = function34;
                        appBarWithSearchColors3 = appBarWithSearchColors52;
                        shape3 = shape4;
                        f3 = f5;
                        f4 = f6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        windowInsets2 = windowInsets;
                        function33 = function32;
                        shape3 = shape2;
                        appBarWithSearchColors3 = appBarWithSearchColors2;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        function24 = function23;
                        f3 = f;
                        f4 = f2;
                        paddingValues2 = paddingValues;
                        searchBarScrollBehavior2 = searchBarScrollBehavior;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AppBarWithSearch_ii5sN6A$lambda$9;
                                AppBarWithSearch_ii5sN6A$lambda$9 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$9(SearchBarState.this, function2, modifier3, function24, function33, shape3, appBarWithSearchColors3, f3, f4, paddingValues2, windowInsets2, searchBarScrollBehavior2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return AppBarWithSearch_ii5sN6A$lambda$9;
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function32 = function3;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function23 = function22;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function32 = function3;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair AppBarWithSearch_ii5sN6A$lambda$1$0(SearchBarScrollBehavior searchBarScrollBehavior, AppBarWithSearchColors appBarWithSearchColors) {
        float f = (searchBarScrollBehavior != null ? overlappedFraction(searchBarScrollBehavior) : 0.0f) > 0.01f ? 1.0f : 0.0f;
        return new Pair(Color.m6776boximpl(appBarContainerColor(appBarWithSearchColors, f)), Color.m6776boximpl(searchBarContainerColor(appBarWithSearchColors, f)));
    }

    private static final SearchBarColors AppBarWithSearch_ii5sN6A$lambda$4(MutableState<SearchBarColors> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarWithSearch_ii5sN6A$lambda$7$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarWithSearch_ii5sN6A$lambda$8(PaddingValues paddingValues, Function2 function2, SearchBarState searchBarState, final Function3 function3, AppBarWithSearchColors appBarWithSearchColors, Function2 function22, Shape shape, boolean z, float f, float f2, MutableState mutableState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C457@22816L2286:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374718147, i, -1, "androidx.compose.material3.AppBarWithSearch.<anonymous> (SearchBar.kt:457)");
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1469434966, "C473@23504L865:SearchBar.kt#uh7d8r");
            if (function2 == null) {
                composer.startReplaceGroup(-1469475485);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1469475484);
                ComposerKt.sourceInformation(composer, "*462@23000L275");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, AppBarWithSearchHorizontalPadding, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default);
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
                Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 428134054, "C463@23087L170:SearchBar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(appBarWithSearchColors.getAppBarNavigationIconColor())), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Unit unit = Unit.INSTANCE;
                composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            Modifier alpha = AlphaKt.alpha(RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), !searchBarState.getExpandsToFullScreen$material3() || !isExpanded(searchBarState) || searchBarState.getTargetValue() == SearchBarValue.Expanded ? 1.0f : 0.0f);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, alpha);
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
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 732678266, "C474@23591L764:SearchBar.kt#uh7d8r");
            m3875SearchBarnbWgWpA(searchBarState, function22, boxScopeInstance2.align(SizeKt.m1277widthInVpY3zN4(PaddingKt.m1202paddingVpY3zN4(Modifier.INSTANCE, SearchBarAsTopBarPadding, AppBarWithSearchVerticalPadding), SearchBarMinWidth, SearchBarMaxWidth), Alignment.INSTANCE.getCenter()), shape, AppBarWithSearch_ii5sN6A$lambda$4(mutableState), z ? f : Dp.m9732constructorimpl(0), z ? f2 : Dp.m9732constructorimpl(0), composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function3 == null) {
                composer.startReplaceGroup(-1468061699);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1468061698);
                ComposerKt.sourceInformation(composer, "*493@24519L265,500@24801L277");
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(862714396, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AppBarWithSearch_ii5sN6A$lambda$8$0$2$0;
                        AppBarWithSearch_ii5sN6A$lambda$8$0$2$0 = SearchBarKt.AppBarWithSearch_ii5sN6A$lambda$8$0$2$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                        return AppBarWithSearch_ii5sN6A$lambda$8$0$2$0;
                    }
                }, composer, 54);
                Modifier m1205paddingqDBjuR0$default2 = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, AppBarWithSearchHorizontalPadding, 0.0f, 11, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m5864constructorimpl4 = Updater.m5864constructorimpl(composer);
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1679183958, "C501@24886L174:SearchBar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(appBarWithSearchColors.getAppBarActionIconColor())), rememberComposableLambda, composer, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Unit unit3 = Unit.INSTANCE;
                composer.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarWithSearch_ii5sN6A$lambda$8$0$2$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C494@24545L217:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(862714396, i, -1, "androidx.compose.material3.AppBarWithSearch.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:494)");
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0(Composer composer, int i) {
        composer.startReplaceGroup(-685482430);
        ComposerKt.sourceInformation(composer, "C550@27652L22:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685482430, i, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous> (SearchBar.kt:550)");
        }
        WindowInsets fullScreenWindowInsets = SearchBarDefaults.INSTANCE.getFullScreenWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fullScreenWindowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExpandedFullScreenContainedSearchBar-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3870ExpandedFullScreenContainedSearchBar_UtchM0(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, DialogProperties dialogProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        int i6;
        int i7;
        Composer composer2;
        final DialogProperties dialogProperties2;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        final float f5;
        final float f6;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        ScopeUpdateScope endRestartGroup;
        int i8;
        final Modifier modifier4;
        final SearchBarColors searchBarColors4;
        final float f7;
        DialogProperties dialogProperties3;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1392095440);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedFullScreenContainedSearchBar)N(state,inputField,modifier,collapsedShape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,properties,content)555@27899L849,555@27827L921:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    shape2 = shape;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    f4 = f2;
                    i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            function23 = function22;
                            if (startRestartGroup.changedInstance(function23)) {
                                i9 = 8388608;
                                i3 |= i9;
                            }
                        } else {
                            function23 = function22;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    } else {
                        function23 = function22;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(dialogProperties) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "546@27364L15,547@27429L30");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    SearchBarColors containedColors = SearchBarDefaults.INSTANCE.containedColors(searchBarState, startRestartGroup, (i3 & 14) | 48);
                                    i3 &= -57345;
                                    searchBarColors2 = containedColors;
                                }
                                if (i4 != 0) {
                                    f3 = SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM();
                                }
                                if (i5 != 0) {
                                    f4 = SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM();
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                    function23 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda24
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            WindowInsets ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0;
                                            ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0 = SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                                            return ExpandedFullScreenContainedSearchBar__UtchM0$lambda$0;
                                        }
                                    };
                                }
                                if (i7 != 0) {
                                    float f8 = f4;
                                    i8 = i3;
                                    modifier4 = modifier2;
                                    searchBarColors4 = searchBarColors2;
                                    f7 = f8;
                                    dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                                    final Shape shape4 = shape2;
                                    final float f9 = f3;
                                    final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25 = function23;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1392095440, i8, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar (SearchBar.kt:553)");
                                    }
                                    searchBarState.setExpandsToFullScreen$material3(true);
                                    DialogProperties dialogProperties4 = dialogProperties3;
                                    ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties4, ComposableLambdaKt.rememberComposableLambda(-1513710947, true, new Function4() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda25
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                            Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1;
                                            ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1 = SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1(SearchBarState.this, modifier4, shape4, searchBarColors4, f9, f7, function25, function3, function2, (FocusRequester) obj, (PredictiveBackState) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                            return ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i8 & 14) | 384 | ((i8 >> 21) & 112), 0);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    dialogProperties2 = dialogProperties4;
                                    function24 = function25;
                                    f6 = f7;
                                    f5 = f9;
                                    searchBarColors3 = searchBarColors4;
                                    shape3 = shape4;
                                    modifier3 = modifier4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                            }
                            float f10 = f4;
                            i8 = i3;
                            modifier4 = modifier2;
                            searchBarColors4 = searchBarColors2;
                            f7 = f10;
                            dialogProperties3 = dialogProperties;
                            final Shape shape42 = shape2;
                            final float f92 = f3;
                            final Function2 function252 = function23;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            searchBarState.setExpandsToFullScreen$material3(true);
                            DialogProperties dialogProperties42 = dialogProperties3;
                            ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties42, ComposableLambdaKt.rememberComposableLambda(-1513710947, true, new Function4() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1;
                                    ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1 = SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1(SearchBarState.this, modifier4, shape42, searchBarColors4, f92, f7, function252, function3, function2, (FocusRequester) obj, (PredictiveBackState) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                    return ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i8 & 14) | 384 | ((i8 >> 21) & 112), 0);
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            dialogProperties2 = dialogProperties42;
                            function24 = function252;
                            f6 = f7;
                            f5 = f92;
                            searchBarColors3 = searchBarColors4;
                            shape3 = shape42;
                            modifier3 = modifier4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            dialogProperties2 = dialogProperties;
                            modifier3 = modifier2;
                            shape3 = shape2;
                            searchBarColors3 = searchBarColors2;
                            f5 = f3;
                            f6 = f4;
                            function24 = function23;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2;
                                    ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2 = SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2(SearchBarState.this, function2, modifier3, shape3, searchBarColors3, f5, f6, function24, dialogProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ExpandedFullScreenContainedSearchBar__UtchM0$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if ((i & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f4 = f2;
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            f4 = f2;
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        f4 = f2;
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1(SearchBarState searchBarState, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2 function2, Function3 function3, final Function2 function22, final FocusRequester focusRequester, PredictiveBackState predictiveBackState, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(focusRequester,predictiveBackState)561@28098L231,575@28654L14,558@27964L778:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(focusRequester) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState) ? 32 : 16;
        }
        if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1513710947, i2, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous> (SearchBar.kt:558)");
            }
            m3872FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, ComposableLambdaKt.rememberComposableLambda(-1926369040, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0;
                    ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0 = SearchBarKt.ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0(FocusRequester.this, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0;
                }
            }, composer, 54), PaddingKt.m1196PaddingValuesYgX7TsA$default(FullScreenExpandedHorizontalPadding, 0.0f, 2, null), modifier, shape, searchBarColors, f, f2, (WindowInsets) function2.invoke(composer, 0), true, function3, composer, (i2 & 112) | 3456, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenContainedSearchBar__UtchM0$lambda$1$0(FocusRequester focusRequester, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C562@28116L199:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1926369040, i, -1, "androidx.compose.material3.ExpandedFullScreenContainedSearchBar.<anonymous>.<anonymous> (SearchBar.kt:562)");
            }
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, focusRequester2);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1980708863, "C566@28285L12:SearchBar.kt#uh7d8r");
            function2.invoke(composer, 0);
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
    public static final WindowInsets ExpandedFullScreenSearchBar__UtchM0$lambda$0(Composer composer, int i) {
        composer.startReplaceGroup(-2028768625);
        ComposerKt.sourceInformation(composer, "C619@31122L22:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2028768625, i, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:619)");
        }
        WindowInsets fullScreenWindowInsets = SearchBarDefaults.INSTANCE.getFullScreenWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fullScreenWindowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExpandedFullScreenSearchBar-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3871ExpandedFullScreenSearchBar_UtchM0(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, DialogProperties dialogProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        int i6;
        final Modifier modifier2;
        final float f5;
        final DialogProperties dialogProperties2;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        Composer composer2;
        final float f6;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        boolean z;
        int i7;
        Composer composer3;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        int i8;
        DialogProperties dialogProperties3;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function26;
        final float f7;
        final Shape shape5;
        int i9;
        final SearchBarColors searchBarColors4;
        final float f8;
        final Modifier modifier3;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-909632031);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedFullScreenSearchBar)N(state,inputField,modifier,collapsedShape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,properties,content)624@31369L899,624@31297L971:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            if ((i & 3072) != 0) {
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
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i11 = 16384;
                        i3 |= i11;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i11 = 8192;
                i3 |= i11;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f3 = f;
            } else {
                f3 = f;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        function23 = function22;
                        if (startRestartGroup.changedInstance(function23)) {
                            i10 = 8388608;
                            i3 |= i10;
                        }
                    } else {
                        function23 = function22;
                    }
                    i10 = 4194304;
                    i3 |= i10;
                } else {
                    function23 = function22;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(dialogProperties) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "615@30856L15,616@30921L8");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        dialogProperties3 = dialogProperties;
                        z = true;
                        shape5 = shape2;
                        searchBarColors4 = searchBarColors2;
                        f8 = f4;
                        composer3 = startRestartGroup;
                        function26 = function23;
                        f7 = f3;
                        i9 = i3;
                        modifier3 = modifier;
                    } else {
                        Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        int i14 = i3;
                        if ((i2 & 16) != 0) {
                            i7 = i6;
                            z = true;
                            composer3 = startRestartGroup;
                            i14 &= -57345;
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                        } else {
                            z = true;
                            i7 = i6;
                            composer3 = startRestartGroup;
                        }
                        if (i4 != 0) {
                            f3 = SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM();
                        }
                        float m3826getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                        if ((i2 & 128) != 0) {
                            function25 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda53
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    WindowInsets ExpandedFullScreenSearchBar__UtchM0$lambda$0;
                                    ExpandedFullScreenSearchBar__UtchM0$lambda$0 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                                    return ExpandedFullScreenSearchBar__UtchM0$lambda$0;
                                }
                            };
                            i8 = i14 & (-29360129);
                        } else {
                            function25 = function22;
                            i8 = i14;
                        }
                        if (i7 != 0) {
                            function26 = function25;
                            dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties3 = dialogProperties;
                            function26 = function25;
                        }
                        f7 = f3;
                        shape5 = shape4;
                        i9 = i8;
                        searchBarColors4 = searchBarColors2;
                        f8 = m3826getShadowElevationD9Ej5fM;
                        modifier3 = companion;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-909632031, i9, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar (SearchBar.kt:622)");
                    }
                    searchBarState.setExpandsToFullScreen$material3(z);
                    Composer composer4 = composer3;
                    DialogProperties dialogProperties4 = dialogProperties3;
                    ExpandedFullScreenSearchBarImpl(searchBarState, dialogProperties4, ComposableLambdaKt.rememberComposableLambda(1121571796, z, new Function4() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda55
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1;
                            ExpandedFullScreenSearchBar__UtchM0$lambda$1 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$1(SearchBarState.this, modifier3, shape5, searchBarColors4, f7, f8, function26, function2, function3, (FocusRequester) obj, (PredictiveBackState) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                            return ExpandedFullScreenSearchBar__UtchM0$lambda$1;
                        }
                    }, composer3, 54), composer4, (i9 & 14) | 384 | ((i9 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dialogProperties2 = dialogProperties4;
                    composer2 = composer4;
                    function24 = function26;
                    f5 = f8;
                    f6 = f7;
                    searchBarColors3 = searchBarColors4;
                    shape3 = shape5;
                    modifier2 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    f5 = f2;
                    dialogProperties2 = dialogProperties;
                    shape3 = shape2;
                    searchBarColors3 = searchBarColors2;
                    composer2 = startRestartGroup;
                    f6 = f3;
                    function24 = function22;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda56
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExpandedFullScreenSearchBar__UtchM0$lambda$2;
                            ExpandedFullScreenSearchBar__UtchM0$lambda$2 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$2(SearchBarState.this, function2, modifier2, shape3, searchBarColors3, f6, f5, function24, dialogProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ExpandedFullScreenSearchBar__UtchM0$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1(SearchBarState searchBarState, Modifier modifier, Shape shape, final SearchBarColors searchBarColors, float f, float f2, Function2 function2, final Function2 function22, final Function3 function3, final FocusRequester focusRequester, PredictiveBackState predictiveBackState, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(focusRequester,predictiveBackState)630@31568L231,644@32076L14,646@32147L104,627@31434L828:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(focusRequester) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState) ? 32 : 16;
        }
        if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121571796, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:627)");
            }
            m3872FullScreenSearchBarLayoutBXK5RNM(searchBarState, predictiveBackState, ComposableLambdaKt.rememberComposableLambda(-1695579103, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1$0;
                    ExpandedFullScreenSearchBar__UtchM0$lambda$1$0 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$1$0(FocusRequester.this, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedFullScreenSearchBar__UtchM0$lambda$1$0;
                }
            }, composer, 54), PaddingKt.m1196PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), modifier, shape, searchBarColors, f, f2, (WindowInsets) function2.invoke(composer, 0), false, ComposableLambdaKt.rememberComposableLambda(577596443, true, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1$1;
                    ExpandedFullScreenSearchBar__UtchM0$lambda$1$1 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$1$1(SearchBarColors.this, function3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ExpandedFullScreenSearchBar__UtchM0$lambda$1$1;
                }
            }, composer, 54), composer, (i2 & 112) | 3456, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1$0(FocusRequester focusRequester, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C631@31586L199:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1695579103, i, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:631)");
            }
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, focusRequester2);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1879113348, "C635@31755L12:SearchBar.kt#uh7d8r");
            function2.invoke(composer, 0);
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
    public static final Unit ExpandedFullScreenSearchBar__UtchM0$lambda$1$1(SearchBarColors searchBarColors, Function3 function3, ColumnScope columnScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C647@32165L46,648@32228L9:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i |= composer.changed(columnScope) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(577596443, i, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:647)");
            }
            DividerKt.m3057HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.getDividerColor(), composer, 0, 3);
            function3.invoke(columnScope, composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ExpandedFullScreenSearchBarImpl(final SearchBarState searchBarState, DialogProperties dialogProperties, final Function4<? super FocusRequester, ? super PredictiveBackState, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        DialogProperties dialogProperties2;
        final Function4<? super FocusRequester, ? super PredictiveBackState, ? super Composer, ? super Integer, Unit> function42;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer startRestartGroup = composer.startRestartGroup(-609556993);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedFullScreenSearchBarImpl)N(state,properties,content)663@32587L24,666@32667L56,668@32764L750,665@32617L897:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dialogProperties2 = dialogProperties;
            i3 |= startRestartGroup.changed(dialogProperties2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function4) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                function42 = function4;
                startRestartGroup.skipToGroupEnd();
                dialogProperties3 = dialogProperties2;
            } else {
                DialogProperties dialogProperties4 = i4 != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-609556993, i3, -1, "androidx.compose.material3.ExpandedFullScreenSearchBarImpl (SearchBar.kt:660)");
                }
                if (!isExpanded(searchBarState)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final DialogProperties dialogProperties5 = dialogProperties4;
                        function2 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExpandedFullScreenSearchBarImpl$lambda$0;
                                ExpandedFullScreenSearchBarImpl$lambda$0 = SearchBarKt.ExpandedFullScreenSearchBarImpl$lambda$0(SearchBarState.this, dialogProperties5, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExpandedFullScreenSearchBarImpl$lambda$0;
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                function42 = function4;
                DialogProperties dialogProperties6 = dialogProperties4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1668707241, "CC(remember):SearchBar.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | ((i3 & 14) == 4);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExpandedFullScreenSearchBarImpl$lambda$1$0;
                            ExpandedFullScreenSearchBarImpl$lambda$1$0 = SearchBarKt.ExpandedFullScreenSearchBarImpl$lambda$1$0(CoroutineScope.this, searchBarState);
                            return ExpandedFullScreenSearchBarImpl$lambda$1$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog((Function0) rememberedValue2, null, dialogProperties6, false, false, ComposableLambdaKt.rememberComposableLambda(1825392111, true, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit ExpandedFullScreenSearchBarImpl$lambda$2;
                        ExpandedFullScreenSearchBarImpl$lambda$2 = SearchBarKt.ExpandedFullScreenSearchBarImpl$lambda$2(Function4.this, searchBarState, (PredictiveBackState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return ExpandedFullScreenSearchBarImpl$lambda$2;
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 896) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dialogProperties3 = dialogProperties6;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Function4<? super FocusRequester, ? super PredictiveBackState, ? super Composer, ? super Integer, Unit> function43 = function42;
                function2 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ExpandedFullScreenSearchBarImpl$lambda$3;
                        ExpandedFullScreenSearchBarImpl$lambda$3 = SearchBarKt.ExpandedFullScreenSearchBarImpl$lambda$3(SearchBarState.this, dialogProperties3, function43, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ExpandedFullScreenSearchBarImpl$lambda$3;
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        dialogProperties2 = dialogProperties;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBarImpl$lambda$1$0(CoroutineScope coroutineScope, SearchBarState searchBarState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchBarKt$ExpandedFullScreenSearchBarImpl$2$1$1(searchBarState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedFullScreenSearchBarImpl$lambda$2(Function4 function4, SearchBarState searchBarState, PredictiveBackState predictiveBackState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(predictiveBackState)669@32818L29,671@32857L44,675@33051L33,675@33030L54,679@33317L7,680@33367L141,680@33333L175:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(predictiveBackState) : composer.changedInstance(predictiveBackState) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1825392111, i, -1, "androidx.compose.material3.ExpandedFullScreenSearchBarImpl.<anonymous> (SearchBar.kt:669)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1855163660, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusRequester();
                composer.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            function4.invoke(focusRequester, predictiveBackState, composer, Integer.valueOf(((i << 3) & 112) | 6));
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1855171120, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1(focusRequester, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 6);
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume;
            SearchBarValue targetValue = searchBarState.getTargetValue();
            ComposerKt.sourceInformationMarkerStart(composer, 1855181340, "CC(remember):SearchBar.kt#9igjgp");
            boolean changed = composer.changed(searchBarState) | composer.changed(softwareKeyboardController);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function2) new SearchBarKt$ExpandedFullScreenSearchBarImpl$3$2$1(searchBarState, softwareKeyboardController, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(targetValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* renamed from: ExpandedDockedSearchBarWithGap-AX2PdCw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3869ExpandedDockedSearchBarWithGapAX2PdCw(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, Shape shape2, float f, long j, SearchBarColors searchBarColors, float f2, float f3, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape3;
        Shape shape4;
        int i5;
        int i6;
        long j2;
        SearchBarColors searchBarColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final float f4;
        final PopupProperties popupProperties2;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        final SearchBarColors searchBarColors3;
        final Shape shape5;
        final Shape shape6;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Shape shape7;
        long j4;
        Modifier modifier4;
        int i13;
        boolean z;
        SearchBarColors searchBarColors4;
        int i14;
        PopupProperties popupProperties3;
        final SearchBarColors searchBarColors5;
        final float f7;
        final Shape shape8;
        final float f8;
        final Shape shape9;
        int i15;
        final Modifier modifier5;
        final float f9;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-1620616561);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedDockedSearchBarWithGap)N(state,inputField,modifier,shape,dropdownShape,dropdownGapSize:c#ui.unit.Dp,dropdownScrimColor:c#ui.graphics.Color,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,properties,content)740@36585L662,736@36453L794:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shape3 = shape;
                    if (startRestartGroup.changed(shape3)) {
                        i18 = 2048;
                        i4 |= i18;
                    }
                } else {
                    shape3 = shape;
                }
                i18 = 1024;
                i4 |= i18;
            } else {
                shape3 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    shape4 = shape2;
                    if (startRestartGroup.changed(shape4)) {
                        i17 = 16384;
                        i4 |= i17;
                    }
                } else {
                    shape4 = shape2;
                }
                i17 = 8192;
                i4 |= i17;
            } else {
                shape4 = shape2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
            }
            if ((i & 1572864) != 0) {
                i6 = i19;
                j2 = j;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
            } else {
                i6 = i19;
                j2 = j;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i16 = 8388608;
                        i4 |= i16;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i16 = 4194304;
                i4 |= i16;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i9 = i8;
                i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (startRestartGroup.changed(popupProperties) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                if ((i2 & 48) == 0) {
                    i12 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                }
                if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "726@35902L11,729@36098L24,730@36172L8");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        f8 = f;
                        f7 = f2;
                        f9 = f3;
                        searchBarColors5 = searchBarColors2;
                        modifier5 = modifier2;
                        shape9 = shape3;
                        shape8 = shape4;
                        i13 = i12;
                        z = true;
                        i15 = -1620616561;
                        popupProperties3 = popupProperties;
                    } else {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                            shape7 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                        } else {
                            shape7 = shape3;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            shape4 = SearchBarDefaults.INSTANCE.getDockedDropdownShape();
                        }
                        float m3823getDockedDropdownGapSizeD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m3823getDockedDropdownGapSizeD9Ej5fM() : f;
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            j4 = SearchBarDefaults.INSTANCE.getDockedDropdownScrimColor(startRestartGroup, 6);
                        } else {
                            j4 = j2;
                        }
                        int i20 = i4;
                        if ((i3 & 128) != 0) {
                            modifier4 = companion;
                            i13 = i12;
                            z = true;
                            searchBarColors4 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                            i14 = i20 & (-29360129);
                        } else {
                            modifier4 = companion;
                            i13 = i12;
                            z = true;
                            searchBarColors4 = searchBarColors2;
                            i14 = i20;
                        }
                        float m3827getTonalElevationD9Ej5fM = i7 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f2;
                        float m3826getShadowElevationD9Ej5fM = i9 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f3;
                        popupProperties3 = i11 != 0 ? new PopupProperties(true, false, false, false, false, 22, (DefaultConstructorMarker) null) : popupProperties;
                        searchBarColors5 = searchBarColors4;
                        i4 = i14;
                        f7 = m3827getTonalElevationD9Ej5fM;
                        shape8 = shape4;
                        f8 = m3823getDockedDropdownGapSizeD9Ej5fM;
                        shape9 = shape7;
                        i15 = -1620616561;
                        modifier5 = modifier4;
                        long j5 = j4;
                        f9 = m3826getShadowElevationD9Ej5fM;
                        j2 = j5;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i15, i4, i13, "androidx.compose.material3.ExpandedDockedSearchBarWithGap (SearchBar.kt:736)");
                    }
                    PopupProperties popupProperties4 = popupProperties3;
                    m3868ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties4, j2, ComposableLambdaKt.rememberComposableLambda(929406661, z, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0;
                            ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0 = SearchBarKt.ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0(SearchBarState.this, modifier5, shape9, shape8, f8, searchBarColors5, f7, f9, function3, function2, (FocusRequester) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i13 << 3) & 112) | (i4 & 14) | 3072 | ((i4 >> 12) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    popupProperties2 = popupProperties3;
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    f5 = f8;
                    searchBarColors3 = searchBarColors5;
                    f6 = f7;
                    f4 = f9;
                    j3 = j2;
                    shape5 = shape9;
                    shape6 = shape8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f4 = f3;
                    popupProperties2 = popupProperties;
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    j3 = j2;
                    searchBarColors3 = searchBarColors2;
                    shape5 = shape3;
                    shape6 = shape4;
                    f5 = f;
                    f6 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda41
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1;
                            ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1 = SearchBarKt.ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1(SearchBarState.this, function2, modifier3, shape5, shape6, f5, j3, searchBarColors3, f6, f4, popupProperties2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0(SearchBarState searchBarState, Modifier modifier, Shape shape, Shape shape2, float f, SearchBarColors searchBarColors, float f2, float f3, Function3 function3, final Function2 function2, final FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(focusRequester)743@36688L231,741@36613L628:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(focusRequester) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929406661, i2, -1, "androidx.compose.material3.ExpandedDockedSearchBarWithGap.<anonymous> (SearchBar.kt:741)");
            }
            m3865DockedSearchBarLayoutgLs90yA(searchBarState, ComposableLambdaKt.rememberComposableLambda(2021987022, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0;
                    ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0 = SearchBarKt.ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0(FocusRequester.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0;
                }
            }, composer, 54), modifier, shape, shape2, Dp.m9730boximpl(f), searchBarColors, f2, f3, function3, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarWithGap_AX2PdCw$lambda$0$0(FocusRequester focusRequester, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C744@36706L199:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2021987022, i, -1, "androidx.compose.material3.ExpandedDockedSearchBarWithGap.<anonymous>.<anonymous> (SearchBar.kt:744)");
            }
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, focusRequester2);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1842924701, "C748@36875L12:SearchBar.kt#uh7d8r");
            function2.invoke(composer, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExpandedDockedSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3867ExpandedDockedSearchBarqKj4JfE(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        PopupProperties popupProperties2;
        final Modifier modifier2;
        final PopupProperties popupProperties3;
        Composer composer2;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Modifier modifier3;
        boolean z;
        Composer composer3;
        int i7;
        final Modifier modifier4;
        final float f7;
        final SearchBarColors searchBarColors3;
        final float f8;
        final Shape shape4;
        int i8;
        PopupProperties popupProperties4;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1121062437);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedDockedSearchBar)N(state,inputField,modifier,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,properties,content)804@39687L642,800@39556L773:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f3 = f;
            } else {
                f3 = f;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "793@39214L11,794@39275L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier;
                            z = true;
                            searchBarColors3 = searchBarColors2;
                            f7 = f4;
                            popupProperties4 = popupProperties2;
                            f8 = f3;
                            i8 = -1121062437;
                            shape4 = shape2;
                            composer3 = startRestartGroup;
                        } else {
                            Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape2;
                            }
                            int i12 = i3;
                            if ((i2 & 16) != 0) {
                                i7 = i6;
                                composer3 = startRestartGroup;
                                modifier3 = companion;
                                z = true;
                                searchBarColors2 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, composer3, 3072, 7);
                                i3 = i12 & (-57345);
                            } else {
                                modifier3 = companion;
                                z = true;
                                composer3 = startRestartGroup;
                                i7 = i6;
                                i3 = i12;
                            }
                            if (i4 != 0) {
                                f3 = SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM();
                            }
                            float m3826getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                            if (i7 != 0) {
                                modifier4 = modifier3;
                                f7 = m3826getShadowElevationD9Ej5fM;
                                searchBarColors3 = searchBarColors2;
                                f8 = f3;
                                shape4 = shape3;
                                popupProperties4 = new PopupProperties(true, false, false, false, false, 22, (DefaultConstructorMarker) null);
                                i8 = -1121062437;
                            } else {
                                modifier4 = modifier3;
                                f7 = m3826getShadowElevationD9Ej5fM;
                                searchBarColors3 = searchBarColors2;
                                f8 = f3;
                                shape4 = shape3;
                                i8 = -1121062437;
                                popupProperties4 = popupProperties;
                            }
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i8, i3, -1, "androidx.compose.material3.ExpandedDockedSearchBar (SearchBar.kt:800)");
                        }
                        Composer composer4 = composer3;
                        m3868ExpandedDockedSearchBarImplFNF3uiM(searchBarState, popupProperties4, Color.INSTANCE.m6822getUnspecified0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(1363493521, z, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit ExpandedDockedSearchBar_qKj4JfE$lambda$0;
                                ExpandedDockedSearchBar_qKj4JfE$lambda$0 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$0(SearchBarState.this, modifier4, shape4, searchBarColors3, f8, f7, function3, function2, (FocusRequester) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return ExpandedDockedSearchBar_qKj4JfE$lambda$0;
                            }
                        }, composer3, 54), composer4, (i3 & 14) | 3456 | ((i3 >> 18) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        popupProperties3 = popupProperties4;
                        composer2 = composer4;
                        modifier2 = modifier4;
                        shape2 = shape4;
                        searchBarColors2 = searchBarColors3;
                        f5 = f8;
                        f6 = f7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        popupProperties3 = popupProperties;
                        composer2 = startRestartGroup;
                        f5 = f3;
                        f6 = f2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExpandedDockedSearchBar_qKj4JfE$lambda$1;
                                ExpandedDockedSearchBar_qKj4JfE$lambda$1 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$1(SearchBarState.this, function2, modifier2, shape2, searchBarColors2, f5, f6, popupProperties3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExpandedDockedSearchBar_qKj4JfE$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                popupProperties2 = popupProperties;
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f2;
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBar_qKj4JfE$lambda$0(SearchBarState searchBarState, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function3 function3, final Function2 function2, final FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(focusRequester)807@39790L231,805@39715L608:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(focusRequester) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1363493521, i2, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous> (SearchBar.kt:805)");
            }
            m3865DockedSearchBarLayoutgLs90yA(searchBarState, ComposableLambdaKt.rememberComposableLambda(-1496620198, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedDockedSearchBar_qKj4JfE$lambda$0$0;
                    ExpandedDockedSearchBar_qKj4JfE$lambda$0$0 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$0$0(FocusRequester.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedDockedSearchBar_qKj4JfE$lambda$0$0;
                }
            }, composer, 54), modifier, shape, null, null, searchBarColors, f, f2, function3, composer, 221232);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBar_qKj4JfE$lambda$0$0(FocusRequester focusRequester, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C808@39808L199:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1496620198, i, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous>.<anonymous> (SearchBar.kt:808)");
            }
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, focusRequester2);
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
            ComposerKt.sourceInformationMarkerStart(composer, -714084649, "C812@39977L12:SearchBar.kt#uh7d8r");
            function2.invoke(composer, 0);
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

    /* renamed from: ExpandedDockedSearchBarImpl-FNF3uiM, reason: not valid java name */
    private static final void m3868ExpandedDockedSearchBarImplFNF3uiM(final SearchBarState searchBarState, final PopupProperties popupProperties, final long j, final Function3<? super FocusRequester, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final Function3<? super FocusRequester, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer startRestartGroup = composer.startRestartGroup(-1062209726);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExpandedDockedSearchBarImpl)N(state,properties,scrimColor:c#ui.graphics.Color,content)846@41081L24,847@41140L47,853@41327L1176,849@41193L1310:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(popupProperties) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function32 = function3;
            i2 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062209726, i3, -1, "androidx.compose.material3.ExpandedDockedSearchBarImpl (SearchBar.kt:833)");
            }
            if (isExpanded(searchBarState)) {
                final boolean z = (Color.m6787equalsimpl0(j, Color.INSTANCE.m6822getUnspecified0d7_KjU()) || Color.m6787equalsimpl0(j, Color.INSTANCE.m6821getTransparent0d7_KjU())) ? false : true;
                PopupPositionProvider popupPositionProvider = new PopupPositionProvider() { // from class: androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBarImpl$positionProvider$1
                    @Override // androidx.compose.ui.window.PopupPositionProvider
                    /* renamed from: calculatePosition-llwVHH4 */
                    public long mo490calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
                        IntRect collapsedBounds;
                        if (z) {
                            return IntOffset.INSTANCE.m9875getZeronOccac();
                        }
                        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
                        return collapsedBounds.m9893getTopLeftnOccac();
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1418693777, "CC(remember):SearchBar.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | ((i3 & 14) == 4);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0;
                            ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0 = SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0(CoroutineScope.this, searchBarState);
                            return ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final Function0 function0 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final boolean z2 = z;
                composer2 = startRestartGroup;
                AndroidPopup_androidKt.Popup(popupPositionProvider, function0, popupProperties, ComposableLambdaKt.rememberComposableLambda(-757931804, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2;
                        ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2 = SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2(z2, j, searchBarState, function0, function3, (Composer) obj, ((Integer) obj2).intValue());
                        return ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2;
                    }
                }, startRestartGroup, 54), composer2, ((i3 << 3) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0;
                            ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0 = SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0(SearchBarState.this, popupProperties, j, function32, i, (Composer) obj, ((Integer) obj2).intValue());
                            return ExpandedDockedSearchBarImpl_FNF3uiM$lambda$0;
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3;
                    ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3 = SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3(SearchBarState.this, popupProperties, j, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedDockedSearchBarImpl_FNF3uiM$lambda$3;
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$1$0(CoroutineScope coroutineScope, SearchBarState searchBarState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchBarKt$ExpandedDockedSearchBarImpl$onDismiss$1$1$1(searchBarState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2(boolean z, long j, final SearchBarState searchBarState, Function0 function0, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C854@41358L29,873@42040L33,873@42019L54,877@42306L7,878@42356L141,878@42322L175:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757931804, i, -1, "androidx.compose.material3.ExpandedDockedSearchBarImpl.<anonymous> (SearchBar.kt:854)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1771977697, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusRequester();
                composer.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (z) {
                composer.startReplaceGroup(-903201356);
                ComposerKt.sourceInformation(composer, "863@41724L33,858@41488L339");
                Modifier m399clickableoSLSa3U$default = ClickableKt.m399clickableoSLSa3U$default(BackgroundKt.m353backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6785copywmQWz5c$default(j, Color.m6788getAlphaimpl(j) * searchBarState.getProgress(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, null, function0, 15, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1771989413, "CC(remember):SearchBar.kt#9igjgp");
                boolean changed = composer.changed(searchBarState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda49
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            IntOffset ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0;
                            ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0 = SearchBarKt.ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0(SearchBarState.this, (Density) obj);
                            return ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier offset = OffsetKt.offset(m399clickableoSLSa3U$default, (Function1) rememberedValue2);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, offset);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1053275303, "C865@41790L23:SearchBar.kt#uh7d8r");
                function3.invoke(focusRequester, composer, 6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-902784561);
                ComposerKt.sourceInformation(composer, "868@41857L23");
                function3.invoke(focusRequester, composer, 6);
                composer.endReplaceGroup();
            }
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1771999525, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function2) new SearchBarKt$ExpandedDockedSearchBarImpl$2$3$1(focusRequester, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 6);
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume;
            SearchBarValue targetValue = searchBarState.getTargetValue();
            ComposerKt.sourceInformationMarkerStart(composer, 1772009745, "CC(remember):SearchBar.kt#9igjgp");
            boolean changed2 = composer.changed(searchBarState) | composer.changed(softwareKeyboardController);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function2) new SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1(searchBarState, softwareKeyboardController, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(targetValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ExpandedDockedSearchBarImpl_FNF3uiM$lambda$2$1$0(SearchBarState searchBarState, Density density) {
        return IntOffset.m9855boximpl(getCollapsedBounds(searchBarState).m9893getTopLeftnOccac());
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3874SearchBarY92LkZI(final Function2<? super Composer, ? super Integer, Unit> function2, boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        WindowInsets windowInsets2;
        final boolean z2;
        Composer composer2;
        final float f4;
        final float f5;
        final WindowInsets windowInsets3;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        Composer composer3;
        float f6;
        WindowInsets windowInsets4;
        float f7;
        SearchBarColors searchBarColors4;
        Shape shape5;
        int i6;
        Boolean bool;
        Shape shape6;
        String str;
        Composer composer4;
        int i7;
        MutableFloatState mutableFloatState;
        Animatable animatable;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1451547856);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)N(inputField,expanded,onExpandedChange,modifier,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,content)939@45342L24,940@45395L64,941@45488L43,942@45557L51,943@45636L51,945@45718L638,945@45693L663,961@46381L27,962@46455L1149,962@46413L1191,990@47610L458:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i9 = 131072;
                        i3 |= i9;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i9 = 65536;
                i3 |= i9;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i3 |= i8;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "932@45004L15,933@45069L8,936@45250L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        f7 = f2;
                        windowInsets4 = windowInsets2;
                        shape5 = shape2;
                        searchBarColors4 = searchBarColors2;
                        f6 = f3;
                        composer3 = startRestartGroup;
                        i6 = i3;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            composer3 = startRestartGroup;
                            i3 &= -458753;
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                        } else {
                            composer3 = startRestartGroup;
                        }
                        float m3827getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                        float m3826getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                        if ((i2 & 256) != 0) {
                            windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composer3, 6);
                            i3 &= -234881025;
                        }
                        f6 = m3827getTonalElevationD9Ej5fM;
                        windowInsets4 = windowInsets2;
                        f7 = m3826getShadowElevationD9Ej5fM;
                        searchBarColors4 = searchBarColors2;
                        shape5 = shape4;
                        i6 = i3;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1451547856, i6, -1, "androidx.compose.material3.SearchBar (SearchBar.kt:938)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926862896, "CC(remember):SearchBar.kt#9igjgp");
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    Animatable animatable2 = (Animatable) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926859941, "CC(remember):SearchBar.kt#9igjgp");
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926857725, "CC(remember):SearchBar.kt#9igjgp");
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState = (MutableState) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926855197, "CC(remember):SearchBar.kt#9igjgp");
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Boolean valueOf = Boolean.valueOf(z);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926851986, "CC(remember):SearchBar.kt#9igjgp");
                    boolean changedInstance = composer3.changedInstance(animatable2) | ((i6 & 112) == 32);
                    SearchBarKt$SearchBar$3$1 rememberedValue6 = composer3.rememberedValue();
                    if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        bool = valueOf;
                        shape6 = shape5;
                        str = "CC(remember):SearchBar.kt#9igjgp";
                        z2 = z;
                        rememberedValue6 = new SearchBarKt$SearchBar$3$1(animatable2, z2, mutableFloatState2, mutableState, mutableState2, null);
                        composer3.updateRememberedValue(rememberedValue6);
                    } else {
                        bool = valueOf;
                        shape6 = shape5;
                        str = "CC(remember):SearchBar.kt#9igjgp";
                        z2 = z;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    int i12 = (i6 >> 3) & 14;
                    EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer3, i12);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926831381, str);
                    Object rememberedValue7 = composer3.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new MutatorMutex();
                        composer3.updateRememberedValue(rememberedValue7);
                    }
                    MutatorMutex mutatorMutex = (MutatorMutex) rememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -926827891, str);
                    boolean changedInstance2 = composer3.changedInstance(animatable2) | ((i6 & 896) == 256) | composer3.changedInstance(coroutineScope);
                    SearchBarKt$SearchBar$4$1 rememberedValue8 = composer3.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        composer4 = composer3;
                        i7 = i6;
                        mutableFloatState = mutableFloatState2;
                        animatable = animatable2;
                        rememberedValue8 = new SearchBarKt$SearchBar$4$1(mutatorMutex, mutableFloatState2, animatable2, function1, coroutineScope, mutableState, mutableState2, null);
                        composer4.updateRememberedValue(rememberedValue8);
                    } else {
                        Composer composer5 = composer3;
                        animatable = animatable2;
                        composer4 = composer5;
                        int i13 = i6;
                        mutableFloatState = mutableFloatState2;
                        i7 = i13;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    BackHandler_androidKt.PredictiveBackHandler(z2, (Function2) rememberedValue8, composer4, i12, 0);
                    int i14 = i7 << 6;
                    SearchBarColors searchBarColors5 = searchBarColors4;
                    float f8 = f7;
                    composer2 = composer4;
                    Modifier modifier4 = modifier2;
                    float f9 = f6;
                    Shape shape7 = shape6;
                    m3876SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier4, function2, shape7, searchBarColors5, f9, f8, windowInsets4, function3, composer2, Animatable.$stable | 3504 | (57344 & (i7 << 3)) | ((i7 << 15) & 458752) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i7 >> 24) & 126, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    shape3 = shape7;
                    searchBarColors3 = searchBarColors5;
                    f4 = f9;
                    f5 = f8;
                    windowInsets3 = windowInsets4;
                } else {
                    z2 = z;
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    f5 = f2;
                    windowInsets3 = windowInsets2;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    searchBarColors3 = searchBarColors2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SearchBar_Y92LkZI$lambda$7;
                            SearchBar_Y92LkZI$lambda$7 = SearchBarKt.SearchBar_Y92LkZI$lambda$7(Function2.this, z2, function1, modifier3, shape3, searchBarColors3, f4, f5, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SearchBar_Y92LkZI$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            f3 = f;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3863DockedSearchBarEQC0FA8(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        Composer composer2;
        final SearchBarColors searchBarColors2;
        final Modifier modifier3;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i7;
        int i8;
        Composer composer3;
        int i9;
        SearchBarColors searchBarColors3;
        final SearchBarColors searchBarColors4;
        float f7;
        float f8;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-2008777812);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBar)N(inputField,expanded,onExpandedChange,modifier,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)1055@50490L38,1059@50685L696,1052@50396L985,1080@51419L27,1080@51387L59:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i12 = 16384;
                        i3 |= i12;
                    }
                } else {
                    shape2 = shape;
                }
                i12 = 8192;
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0 && startRestartGroup.changed(searchBarColors)) {
                    i11 = 131072;
                    i3 |= i11;
                }
                i11 = 65536;
                i3 |= i11;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1046@50148L11,1047@50209L8");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                        }
                        searchBarColors4 = searchBarColors;
                        f8 = f4;
                        f7 = f3;
                        i10 = i6;
                        composer3 = startRestartGroup;
                        i9 = 0;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                            i7 = i6 & (-57345);
                        } else {
                            shape3 = shape2;
                            i7 = i6;
                        }
                        if ((i2 & 32) != 0) {
                            i9 = 0;
                            i8 = i5;
                            searchBarColors3 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                            composer3 = startRestartGroup;
                            i7 &= -458753;
                        } else {
                            i8 = i5;
                            composer3 = startRestartGroup;
                            i9 = 0;
                            searchBarColors3 = searchBarColors;
                        }
                        int i14 = i7;
                        float m3827getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                        if (i8 != 0) {
                            f4 = SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM();
                        }
                        SearchBarColors searchBarColors5 = searchBarColors3;
                        shape2 = shape3;
                        searchBarColors4 = searchBarColors5;
                        f7 = m3827getTonalElevationD9Ej5fM;
                        f8 = f4;
                        i10 = i14;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2008777812, i10, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:1051)");
                    }
                    long containerColor = searchBarColors4.getContainerColor();
                    int i15 = i10;
                    long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors4.getContainerColor(), composer3, i9);
                    SearchBarColors searchBarColors6 = searchBarColors4;
                    int i16 = i15 >> 6;
                    Composer composer4 = composer3;
                    Shape shape4 = shape2;
                    SurfaceKt.m4112SurfaceT9BRK9s(SizeKt.m1276width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape4, containerColor, m2784contentColorForek8zF_U, f7, f8, null, ComposableLambdaKt.rememberComposableLambda(401953073, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda58
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DockedSearchBar_EQC0FA8$lambda$0;
                            DockedSearchBar_EQC0FA8$lambda$0 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$0(Function2.this, z, searchBarColors4, function3, (Composer) obj, ((Integer) obj2).intValue());
                            return DockedSearchBar_EQC0FA8$lambda$0;
                        }
                    }, composer3, 54), composer4, ((i15 >> 9) & 112) | 12582912 | (57344 & i16) | (i16 & 458752), 64);
                    shape2 = shape4;
                    composer2 = composer4;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1995114425, "CC(remember):SearchBar.kt#9igjgp");
                    boolean z2 = (i15 & 896) == 256;
                    Object rememberedValue = composer2.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda59
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit DockedSearchBar_EQC0FA8$lambda$1$0;
                                DockedSearchBar_EQC0FA8$lambda$1$0 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$1$0(Function1.this);
                                return DockedSearchBar_EQC0FA8$lambda$1$0;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    BackHandler_androidKt.BackHandler(z, (Function0) rememberedValue, composer2, (i15 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    searchBarColors2 = searchBarColors6;
                    modifier3 = modifier2;
                    f6 = f7;
                    f5 = f8;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    searchBarColors2 = searchBarColors;
                    modifier3 = modifier2;
                    f5 = f4;
                    f6 = f;
                }
                final Shape shape5 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda60
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DockedSearchBar_EQC0FA8$lambda$2;
                            DockedSearchBar_EQC0FA8$lambda$2 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$2(Function2.this, z, function1, modifier3, shape5, searchBarColors2, f6, f5, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DockedSearchBar_EQC0FA8$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            f3 = f;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
            }
            final Shape shape52 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
        }
        final Shape shape522 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBar_EQC0FA8$lambda$0(Function2 function2, boolean z, final SearchBarColors searchBarColors, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1060@50695L680:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(401953073, i, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:1060)");
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -439279917, "C1061@50716L12,1067@50904L461,1063@50742L623:SearchBar.kt#uh7d8r");
            function2.invoke(composer, 0);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, (Modifier) null, DockedEnterTransition, DockedExitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1224554113, true, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit DockedSearchBar_EQC0FA8$lambda$0$0$0;
                    DockedSearchBar_EQC0FA8$lambda$0$0$0 = SearchBarKt.DockedSearchBar_EQC0FA8$lambda$0$0$0(SearchBarColors.this, function3, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return DockedSearchBar_EQC0FA8$lambda$0$0$0;
                }
            }, composer, 54), composer, 1600518, 18);
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
    public static final Unit DockedSearchBar_EQC0FA8$lambda$0$0$0(SearchBarColors searchBarColors, Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1068@50950L26,1072@51175L176:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1224554113, i, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:1068)");
        }
        float m9732constructorimpl = Dp.m9732constructorimpl(SearchBar_androidKt.getWindowContainerHeight(composer, 0) * DockedExpandedTableMaxHeightScreenRatio);
        Modifier m1258heightInVpY3zN4 = SizeKt.m1258heightInVpY3zN4(Modifier.INSTANCE, ((Dp) RangesKt.coerceAtMost(Dp.m9730boximpl(DockedExpandedTableMinHeight), Dp.m9730boximpl(m9732constructorimpl))).m9746unboximpl(), m9732constructorimpl);
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1258heightInVpY3zN4);
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
        ComposerKt.sourceInformationMarkerStart(composer, -1564650142, "C1073@51257L46,1074@51324L9:SearchBar.kt#uh7d8r");
        DividerKt.m3057HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.getDividerColor(), composer, 0, 3);
        function3.invoke(columnScopeInstance, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit DockedSearchBar_EQC0FA8$lambda$1$0(Function1 function1) {
        function1.invoke(false);
        return Unit.INSTANCE;
    }

    public static final SearchBarState rememberSearchBarState(final SearchBarValue searchBarValue, final AnimationSpec<Float> animationSpec, final AnimationSpec<Float> animationSpec2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -546016819, "C(rememberSearchBarState)N(initialValue,animationSpecForExpand,animationSpecForCollapse)1300@60154L7,1301@60253L7,1312@60589L208,1303@60293L504:SearchBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        if ((i2 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowSpatial, composer, 6);
        }
        if ((i2 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-546016819, i, -1, "androidx.compose.material3.rememberSearchBarState (SearchBar.kt:1302)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue, animationSpec, animationSpec2};
        Saver<SearchBarState, ?> Saver = SearchBarState.INSTANCE.Saver(animationSpec, animationSpec2);
        ComposerKt.sourceInformationMarkerStart(composer, -736133251, "CC(remember):SearchBar.kt#9igjgp");
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(searchBarValue.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(animationSpec) | z | composer.changedInstance(animationSpec2);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SearchBarState rememberSearchBarState$lambda$0$0;
                    rememberSearchBarState$lambda$0$0 = SearchBarKt.rememberSearchBarState$lambda$0$0(SearchBarValue.this, animationSpec, animationSpec2);
                    return rememberSearchBarState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberSearchBarState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2);
    }

    public static final SearchBarState rememberContainedSearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2036707626, "C(rememberContainedSearchBarState)N(initialValue,animationSpecForExpand,animationSpecForCollapse,animationSpecForContentFadeIn,animationSpecForContentFadeOut)1337@61645L7,1338@61741L7,1355@62496L360,1342@61961L895:SearchBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        final SearchBarValue searchBarValue2 = searchBarValue;
        if ((i2 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec5 = animationSpec;
        if ((i2 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec6 = animationSpec2;
        if ((i2 & 8) != 0) {
            animationSpec3 = AnimationForContentFadeInSpec;
        }
        final AnimationSpec<Float> animationSpec7 = animationSpec3;
        if ((i2 & 16) != 0) {
            animationSpec4 = AnimationForContentFadeOutSpec;
        }
        final AnimationSpec<Float> animationSpec8 = animationSpec4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036707626, i, -1, "androidx.compose.material3.rememberContainedSearchBarState (SearchBar.kt:1341)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8};
        Saver<SearchBarState, ?> Saver = SearchBarState.INSTANCE.Saver(animationSpec5, animationSpec6, animationSpec7, animationSpec8);
        ComposerKt.sourceInformationMarkerStart(composer, 1229091838, "CC(remember):SearchBar.kt#9igjgp");
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(searchBarValue2.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = z | composer.changedInstance(animationSpec5) | composer.changedInstance(animationSpec6) | composer.changedInstance(animationSpec7) | composer.changedInstance(animationSpec8);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Function0 function0 = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SearchBarState rememberContainedSearchBarState$lambda$0$0;
                    rememberContainedSearchBarState$lambda$0$0 = SearchBarKt.rememberContainedSearchBarState$lambda$0$0(SearchBarValue.this, animationSpec5, animationSpec6, animationSpec7, animationSpec8);
                    return rememberContainedSearchBarState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(function0);
            rememberedValue = function0;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberContainedSearchBarState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    public static final SearchBarState rememberWithGapSearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 521793017, "C(rememberWithGapSearchBarState)N(initialValue,animationSpecForExpand,animationSpecForCollapse,animationSpecForContentFadeIn,animationSpecForContentFadeOut)1382@63699L7,1383@63795L7,1400@64550L360,1387@64015L895:SearchBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        final SearchBarValue searchBarValue2 = searchBarValue;
        if ((i2 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec5 = animationSpec;
        if ((i2 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        }
        final AnimationSpec<Float> animationSpec6 = animationSpec2;
        if ((i2 & 8) != 0) {
            animationSpec3 = AnimationForContentFadeInSpec;
        }
        final AnimationSpec<Float> animationSpec7 = animationSpec3;
        if ((i2 & 16) != 0) {
            animationSpec4 = AnimationForContentFadeOutSpec;
        }
        final AnimationSpec<Float> animationSpec8 = animationSpec4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(521793017, i, -1, "androidx.compose.material3.rememberWithGapSearchBarState (SearchBar.kt:1386)");
        }
        boolean z = true;
        Object[] objArr = {searchBarValue2, animationSpec5, animationSpec6, animationSpec7, animationSpec8};
        Saver<SearchBarState, ?> Saver = SearchBarState.INSTANCE.Saver(animationSpec5, animationSpec6, animationSpec7, animationSpec8);
        ComposerKt.sourceInformationMarkerStart(composer, -1068050815, "CC(remember):SearchBar.kt#9igjgp");
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(searchBarValue2.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = z | composer.changedInstance(animationSpec5) | composer.changedInstance(animationSpec6) | composer.changedInstance(animationSpec7) | composer.changedInstance(animationSpec8);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Function0 function0 = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SearchBarState rememberWithGapSearchBarState$lambda$0$0;
                    rememberWithGapSearchBarState$lambda$0$0 = SearchBarKt.rememberWithGapSearchBarState$lambda$0$0(SearchBarValue.this, animationSpec5, animationSpec6, animationSpec7, animationSpec8);
                    return rememberWithGapSearchBarState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(function0);
            rememberedValue = function0;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberWithGapSearchBarState$lambda$0$0(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4) {
        return new SearchBarState(searchBarValue, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    public static final float overlappedFraction(SearchBarScrollBehavior searchBarScrollBehavior) {
        if (searchBarScrollBehavior.getScrollOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (RangesKt.coerceIn(searchBarScrollBehavior.getScrollOffsetLimit() - searchBarScrollBehavior.getContentOffset(), searchBarScrollBehavior.getScrollOffsetLimit(), 0.0f) / searchBarScrollBehavior.getScrollOffsetLimit());
    }

    public static final long searchBarContainerColor(AppBarWithSearchColors appBarWithSearchColors, float f) {
        if (Color.m6787equalsimpl0(appBarWithSearchColors.getScrolledSearchBarContainerColor(), Color.INSTANCE.m6822getUnspecified0d7_KjU())) {
            return appBarWithSearchColors.getSearchBarColors().getContainerColor();
        }
        return ColorKt.m6837lerpjxsXWHM(appBarWithSearchColors.getSearchBarColors().getContainerColor(), appBarWithSearchColors.getScrolledSearchBarContainerColor(), EasingKt.getFastOutLinearInEasing().transform(f));
    }

    public static final long appBarContainerColor(AppBarWithSearchColors appBarWithSearchColors, float f) {
        if (Color.m6787equalsimpl0(appBarWithSearchColors.getScrolledAppBarContainerColor(), Color.INSTANCE.m6822getUnspecified0d7_KjU())) {
            return appBarWithSearchColors.getAppBarContainerColor();
        }
        return ColorKt.m6837lerpjxsXWHM(appBarWithSearchColors.getAppBarContainerColor(), appBarWithSearchColors.getScrolledAppBarContainerColor(), EasingKt.getFastOutLinearInEasing().transform(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0210  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            textFieldState = textFieldState,\n            searchBarState = searchBarState,\n            onSearch = onSearch,\n            modifier = modifier,\n            enabled = enabled,\n            readOnly = readOnly,\n            textStyle = textStyle,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            prefix = prefix,\n            suffix = suffix,\n            inputTransformation = inputTransformation,\n            outputTransformation = outputTransformation,\n            scrollState = scrollState,\n            shape = shape,\n            colors = colors,\n            interactionSource = interactionSource,\n            keyboardOptions = keyboardOptions,\n            lineLimits = lineLimits,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3873SearchBarWuY5d9Q(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        final float f3;
        final WindowInsets windowInsets2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Composer composer3;
        int i13;
        SearchBarColors searchBarColors3;
        float m3827getTonalElevationD9Ej5fM;
        WindowInsets windowInsets3;
        final MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final SearchBarColors searchBarColors4;
        float f5;
        WindowInsets windowInsets4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        Shape shape4;
        Modifier modifier3;
        final boolean z5;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1506988286);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)N(query,onQueryChange,onSearch,active,onActiveChange,modifier,enabled,placeholder,leadingIcon,trailingIcon,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,interactionSource,content)2895@135442L573,2894@135410L907:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i17 = 8192;
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i18 = i3 & 32;
        if (i18 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        int i19 = i3 & 64;
        if (i19 != 0) {
            i4 |= 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
            }
        }
        int i20 = i3 & 128;
        if (i20 != 0) {
            i4 |= 12582912;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
            }
        }
        int i21 = i3 & 256;
        if (i21 != 0) {
            i4 |= 100663296;
            function25 = function22;
        } else {
            function25 = function22;
            if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function25) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
        }
        int i22 = i3 & 512;
        if (i22 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i22;
            i4 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            if ((i2 & 6) != 0) {
                if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                    i16 = 4;
                    i6 = i2 | i16;
                }
                i16 = 2;
                i6 = i2 | i16;
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                    i15 = 32;
                    i6 |= i15;
                }
                i15 = 16;
                i6 |= i15;
            }
            int i23 = i6;
            i7 = i3 & 4096;
            if (i7 == 0) {
                i8 = i23 | 384;
            } else {
                int i24 = i23;
                if ((i2 & 384) == 0) {
                    i24 |= startRestartGroup.changed(f) ? 256 : 128;
                }
                i8 = i24;
            }
            i9 = i3 & 8192;
            if (i9 == 0) {
                i10 = i8 | 3072;
            } else {
                i10 = i8;
                if ((i2 & 3072) == 0) {
                    i10 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                    if ((i2 & 24576) == 0) {
                        if ((i3 & 16384) == 0 && startRestartGroup.changed(windowInsets)) {
                            i17 = 16384;
                        }
                        i10 |= i17;
                    }
                    i11 = i3 & 32768;
                    if (i11 != 0) {
                        i10 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i12 = i9;
                        i10 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                        if ((i2 & 1572864) == 0) {
                            i10 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 599187) != 599186, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "2886@135036L15,2887@135101L8,2890@135282L12");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 1024) != 0) {
                                    i10 &= -15;
                                }
                                if ((i3 & 2048) != 0) {
                                    i10 &= -113;
                                }
                                if ((i3 & 16384) != 0) {
                                    i10 &= -57345;
                                }
                                function211 = function23;
                                searchBarColors4 = searchBarColors;
                                m3827getTonalElevationD9Ej5fM = f;
                                f5 = f2;
                                windowInsets4 = windowInsets;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                modifier3 = modifier2;
                                z5 = z3;
                                function210 = function24;
                                composer3 = startRestartGroup;
                                i14 = i10;
                                shape4 = shape;
                                i13 = i4;
                            } else {
                                Modifier.Companion companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i19 != 0 ? true : z3;
                                Function2<? super Composer, ? super Integer, Unit> function212 = i20 != 0 ? null : function24;
                                if (i21 != 0) {
                                    function25 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function213 = i5 != 0 ? null : function23;
                                if ((i3 & 1024) != 0) {
                                    i10 &= -15;
                                    shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                }
                                if ((i3 & 2048) != 0) {
                                    i13 = i4;
                                    composer3 = startRestartGroup;
                                    searchBarColors3 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, composer3, 3072, 7);
                                    i10 &= -113;
                                } else {
                                    composer3 = startRestartGroup;
                                    i13 = i4;
                                    searchBarColors3 = searchBarColors;
                                }
                                m3827getTonalElevationD9Ej5fM = i7 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                                float m3826getShadowElevationD9Ej5fM = i12 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                                if ((i3 & 16384) != 0) {
                                    windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                    i10 &= -57345;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if (i11 != 0) {
                                    function29 = function25;
                                    searchBarColors4 = searchBarColors3;
                                    f5 = m3826getShadowElevationD9Ej5fM;
                                    windowInsets4 = windowInsets3;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    function29 = function25;
                                    searchBarColors4 = searchBarColors3;
                                    f5 = m3826getShadowElevationD9Ej5fM;
                                    windowInsets4 = windowInsets3;
                                }
                                function210 = function212;
                                function211 = function213;
                                shape4 = shape3;
                                modifier3 = companion;
                                z5 = z6;
                                i14 = i10;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1506988286, i13, i14, "androidx.compose.material3.SearchBar (SearchBar.kt:2894)");
                            }
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1597173218, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda38
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SearchBar_WuY5d9Q$lambda$0;
                                    SearchBar_WuY5d9Q$lambda$0 = SearchBarKt.SearchBar_WuY5d9Q$lambda$0(SearchBarColors.this, str, function1, function12, z, function13, z5, function210, function29, function211, mutableInteractionSource3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SearchBar_WuY5d9Q$lambda$0;
                                }
                            }, composer3, 54);
                            int i25 = i13 >> 6;
                            int i26 = 6 | (i25 & 112) | (i25 & 896) | (i25 & 7168);
                            int i27 = i14 << 12;
                            SearchBarColors searchBarColors5 = searchBarColors4;
                            Composer composer4 = composer3;
                            float f6 = m3827getTonalElevationD9Ej5fM;
                            m3874SearchBarY92LkZI(rememberComposableLambda, z, function13, modifier3, shape4, searchBarColors5, f6, f5, windowInsets4, function3, composer4, i26 | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (i27 & 234881024) | ((i14 << 9) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            f3 = f6;
                            windowInsets2 = windowInsets4;
                            composer2 = composer4;
                            searchBarColors2 = searchBarColors5;
                            z4 = z5;
                            function26 = function29;
                            function28 = function211;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            f4 = f5;
                            shape2 = shape4;
                            function27 = function210;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            shape2 = shape;
                            searchBarColors2 = searchBarColors;
                            f3 = f;
                            windowInsets2 = windowInsets;
                            mutableInteractionSource2 = mutableInteractionSource;
                            function26 = function25;
                            z4 = z3;
                            function27 = function24;
                            composer2 = startRestartGroup;
                            function28 = function23;
                            f4 = f2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda39
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SearchBar_WuY5d9Q$lambda$1;
                                    SearchBar_WuY5d9Q$lambda$1 = SearchBarKt.SearchBar_WuY5d9Q$lambda$1(str, function1, function12, z, function13, modifier2, z4, function27, function26, function28, shape2, searchBarColors2, f3, f4, windowInsets2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SearchBar_WuY5d9Q$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i12 = i9;
                    if ((i2 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i11 = i3 & 32768;
            if (i11 != 0) {
            }
            i12 = i9;
            if ((i2 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i22;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i232 = i6;
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        i9 = i3 & 8192;
        if (i9 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i11 = i3 & 32768;
        if (i11 != 0) {
        }
        i12 = i9;
        if ((i2 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBar_WuY5d9Q$lambda$0(SearchBarColors searchBarColors, String str, Function1 function1, Function1 function12, boolean z, Function1 function13, boolean z2, Function2 function2, Function2 function22, Function2 function23, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2896@135456L549:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597173218, i, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:2896)");
            }
            SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z2, function2, function22, function23, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            textFieldState = textFieldState,\n            searchBarState = searchBarState,\n            onSearch = onSearch,\n            modifier = modifier,\n            enabled = enabled,\n            readOnly = readOnly,\n            textStyle = textStyle,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            prefix = prefix,\n            suffix = suffix,\n            inputTransformation = inputTransformation,\n            outputTransformation = outputTransformation,\n            keyboardOptions = keyboardOptions,\n            lineLimits = lineLimits,\n            scrollState = scrollState,\n            shape = shape,\n            colors = colors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3864DockedSearchBareWTbjVg(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        final float f3;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Shape shape3;
        boolean z5;
        Composer composer3;
        int i15;
        SearchBarColors searchBarColors3;
        int i16;
        float m3827getTonalElevationD9Ej5fM;
        final MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        SearchBarColors searchBarColors4;
        float f5;
        Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final boolean z6;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1929583712);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBar)N(query,onQueryChange,onSearch,active,onActiveChange,modifier,enabled,placeholder,leadingIcon,trailingIcon,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,interactionSource,content)2984@139115L573,2983@139077L876:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i19 = i3 & 32;
        if (i19 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        int i20 = i3 & 64;
        if (i20 != 0) {
            i4 |= 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
            }
        }
        int i21 = i3 & 128;
        if (i21 != 0) {
            i4 |= 12582912;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
            }
        }
        int i22 = i3 & 256;
        if (i22 != 0) {
            i4 |= 100663296;
            function25 = function22;
        } else {
            function25 = function22;
            if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function25) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
        }
        int i23 = i3 & 512;
        if (i23 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i23;
            i4 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            if ((i2 & 6) != 0) {
                if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                    i18 = 4;
                    i6 = i2 | i18;
                }
                i18 = 2;
                i6 = i2 | i18;
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                    i17 = 32;
                    i6 |= i17;
                }
                i17 = 16;
                i6 |= i17;
            }
            int i24 = i6;
            i7 = i3 & 4096;
            if (i7 == 0) {
                i8 = i24 | 384;
            } else {
                int i25 = i24;
                if ((i2 & 384) == 0) {
                    i25 |= startRestartGroup.changed(f) ? 256 : 128;
                }
                i8 = i25;
            }
            i9 = i3 & 8192;
            if (i9 == 0) {
                i10 = i8 | 3072;
            } else {
                int i26 = i8;
                if ((i2 & 3072) == 0) {
                    i10 = i26 | (startRestartGroup.changed(f2) ? 2048 : 1024);
                } else {
                    i10 = i26;
                }
            }
            i11 = i3 & 16384;
            if (i11 == 0) {
                i12 = i10 | 24576;
            } else {
                i12 = i10;
                if ((i2 & 24576) == 0) {
                    i12 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i13 = i11;
                        i12 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    } else {
                        i13 = i11;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 74899) != 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "2976@138772L11,2977@138833L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 1024) != 0) {
                                i12 &= -15;
                            }
                            if ((i3 & 2048) != 0) {
                                i12 &= -113;
                            }
                            function210 = function23;
                            searchBarColors4 = searchBarColors;
                            f5 = f2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            function29 = function25;
                            z5 = true;
                            modifier3 = modifier2;
                            z6 = z3;
                            function211 = function24;
                            composer3 = startRestartGroup;
                            i16 = i12;
                            shape4 = shape;
                            m3827getTonalElevationD9Ej5fM = f;
                            i15 = i4;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i20 != 0 ? true : z3;
                            Function2<? super Composer, ? super Integer, Unit> function212 = i21 != 0 ? null : function24;
                            if (i22 != 0) {
                                function25 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function213 = i5 != 0 ? null : function23;
                            if ((i3 & 1024) != 0) {
                                i14 = i12 & (-15);
                                shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                            } else {
                                i14 = i12;
                                shape3 = shape;
                            }
                            if ((i3 & 2048) != 0) {
                                i15 = i4;
                                composer3 = startRestartGroup;
                                z5 = true;
                                searchBarColors3 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, composer3, 3072, 7);
                                i16 = i14 & (-113);
                            } else {
                                z5 = true;
                                composer3 = startRestartGroup;
                                i15 = i4;
                                searchBarColors3 = searchBarColors;
                                i16 = i14;
                            }
                            m3827getTonalElevationD9Ej5fM = i7 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                            float m3826getShadowElevationD9Ej5fM = i9 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                            if (i13 != 0) {
                                function29 = function25;
                                searchBarColors4 = searchBarColors3;
                                f5 = m3826getShadowElevationD9Ej5fM;
                                shape4 = shape3;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                searchBarColors4 = searchBarColors3;
                                f5 = m3826getShadowElevationD9Ej5fM;
                                shape4 = shape3;
                            }
                            function210 = function213;
                            modifier3 = companion;
                            function211 = function212;
                            z6 = z7;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1929583712, i15, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:2983)");
                        }
                        final SearchBarColors searchBarColors5 = searchBarColors4;
                        int i27 = i15 >> 6;
                        int i28 = i16 << 12;
                        Composer composer4 = composer3;
                        float f6 = m3827getTonalElevationD9Ej5fM;
                        m3863DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-1275782414, z5, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda47
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DockedSearchBar_eWTbjVg$lambda$0;
                                DockedSearchBar_eWTbjVg$lambda$0 = SearchBarKt.DockedSearchBar_eWTbjVg$lambda$0(SearchBarColors.this, str, function1, function12, z, function13, z6, function211, function29, function210, mutableInteractionSource3, (Composer) obj, ((Integer) obj2).intValue());
                                return DockedSearchBar_eWTbjVg$lambda$0;
                            }
                        }, composer3, 54), z, function13, modifier3, shape4, searchBarColors4, f6, f5, function3, composer4, (i27 & 7168) | (i27 & 112) | 6 | (i27 & 896) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i16 << 9) & 234881024), 0);
                        SearchBarColors searchBarColors6 = searchBarColors4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        f3 = f5;
                        composer2 = composer4;
                        searchBarColors2 = searchBarColors6;
                        z4 = z6;
                        function26 = function29;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape2 = shape4;
                        f4 = f6;
                        function27 = function211;
                        function28 = function210;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        shape2 = shape;
                        searchBarColors2 = searchBarColors;
                        f3 = f2;
                        mutableInteractionSource2 = mutableInteractionSource;
                        function26 = function25;
                        z4 = z3;
                        function27 = function24;
                        composer2 = startRestartGroup;
                        function28 = function23;
                        f4 = f;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda48
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DockedSearchBar_eWTbjVg$lambda$1;
                                DockedSearchBar_eWTbjVg$lambda$1 = SearchBarKt.DockedSearchBar_eWTbjVg$lambda$1(str, function1, function12, z, function13, modifier2, z4, function27, function26, function28, shape2, searchBarColors2, f4, f3, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return DockedSearchBar_eWTbjVg$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i23;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i242 = i6;
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        i9 = i3 & 8192;
        if (i9 == 0) {
        }
        i11 = i3 & 16384;
        if (i11 == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBar_eWTbjVg$lambda$0(SearchBarColors searchBarColors, String str, Function1 function1, Function1 function12, boolean z, Function1 function13, boolean z2, Function2 function2, Function2 function22, Function2 function23, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2985@139129L549:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275782414, i, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:2985)");
            }
            SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z2, function2, function22, function23, searchBarColors.getInputFieldColors(), mutableInteractionSource, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpanded(SearchBarState searchBarState) {
        return searchBarState.getCurrentValue() == SearchBarValue.Expanded;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3876SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        SearchBarColors searchBarColors2;
        int i5;
        int i6;
        int i7;
        int i8;
        WindowInsets windowInsets2;
        int i9;
        final Shape shape2;
        final float f3;
        final WindowInsets windowInsets3;
        Composer composer2;
        final Modifier modifier3;
        final float f4;
        final SearchBarColors searchBarColors3;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Modifier modifier4;
        int i10;
        SearchBarColors searchBarColors4;
        int i11;
        WindowInsets windowInsets4;
        int i12;
        final float f5;
        int i13;
        final SearchBarColors searchBarColors5;
        final float f6;
        Shape shape4;
        Modifier modifier5;
        Modifier modifier6;
        GenericShape genericShape;
        ComposableLambda composableLambda;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(501752896);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarImpl)N(animationProgress,finalBackProgress,firstBackEvent,currentBackEvent,modifier,inputField,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,content)3030@140836L7,3032@140896L15,3033@140963L15,3034@141009L101,3038@141143L667,3055@141849L333,3066@142207L99,3083@142825L362:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(mutableState2) ? 2048 : 1024;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i15 = 8388608;
                        i4 |= i15;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i15 = 4194304;
                i4 |= i15;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i6 = i5;
                i4 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i14 = 4;
                                i9 = i2 | i14;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i14 = 2;
                        i9 = i2 | i14;
                    } else {
                        windowInsets2 = windowInsets;
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "3023@140492L15,3024@140557L8,3027@140738L12");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 1024) != 0) {
                                i9 &= -15;
                            }
                            f6 = f;
                            i12 = i4;
                            searchBarColors5 = searchBarColors2;
                            windowInsets4 = windowInsets2;
                            modifier5 = modifier2;
                            i13 = i9;
                            shape4 = shape;
                            f5 = f2;
                        } else {
                            Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                            }
                            int i17 = i4;
                            if ((i3 & 128) != 0) {
                                modifier4 = companion;
                                i10 = 6;
                                searchBarColors4 = SearchBarDefaults.INSTANCE.m3821colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                                i11 = i17 & (-29360129);
                            } else {
                                modifier4 = companion;
                                i10 = 6;
                                searchBarColors4 = searchBarColors2;
                                i11 = i17;
                            }
                            float m3827getTonalElevationD9Ej5fM = i6 != 0 ? SearchBarDefaults.INSTANCE.m3827getTonalElevationD9Ej5fM() : f;
                            float m3826getShadowElevationD9Ej5fM = i8 != 0 ? SearchBarDefaults.INSTANCE.m3826getShadowElevationD9Ej5fM() : f2;
                            if ((i3 & 1024) != 0) {
                                i12 = i11;
                                windowInsets4 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, i10);
                                i13 = i9 & (-15);
                                searchBarColors5 = searchBarColors4;
                                f5 = m3826getShadowElevationD9Ej5fM;
                                shape4 = shape3;
                                f6 = m3827getTonalElevationD9Ej5fM;
                            } else {
                                windowInsets4 = windowInsets;
                                i12 = i11;
                                f5 = m3826getShadowElevationD9Ej5fM;
                                i13 = i9;
                                searchBarColors5 = searchBarColors4;
                                f6 = m3827getTonalElevationD9Ej5fM;
                                shape4 = shape3;
                            }
                            modifier5 = modifier4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            modifier6 = modifier5;
                            ComposerKt.traceEventStart(501752896, i12, i13, "androidx.compose.material3.SearchBarImpl (SearchBar.kt:3029)");
                        } else {
                            modifier6 = modifier5;
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        WindowInsets windowInsets5 = windowInsets4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume;
                        Shape inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                        int i18 = i13;
                        Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1148223429, "CC(remember):SearchBar.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda54
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean SearchBarImpl_j1jLAyQ$lambda$0$0;
                                    SearchBarImpl_j1jLAyQ$lambda$0$0 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$0$0(Animatable.this);
                                    return Boolean.valueOf(SearchBarImpl_j1jLAyQ$lambda$0$0);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        State state = (State) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean SearchBarImpl_j1jLAyQ$lambda$1 = SearchBarImpl_j1jLAyQ$lambda$1(state);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1148228283, "CC(remember):SearchBar.kt#9igjgp");
                        boolean changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$1) | ((((3670016 & i12) ^ 1572864) > 1048576 && startRestartGroup.changed(shape4)) || (i12 & 1572864) == 1048576);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            if (Intrinsics.areEqual(shape4, inputFieldShape)) {
                                genericShape = new GenericShape(new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda65
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit SearchBarImpl_j1jLAyQ$lambda$2$0;
                                        SearchBarImpl_j1jLAyQ$lambda$2$0 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$2$0(Density.this, animatable, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                                        return SearchBarImpl_j1jLAyQ$lambda$2$0;
                                    }
                                });
                            } else {
                                genericShape = SearchBarImpl_j1jLAyQ$lambda$1(state) ? fullScreenShape : shape4;
                            }
                            startRestartGroup.updateRememberedValue(genericShape);
                            rememberedValue2 = genericShape;
                        }
                        final Shape shape5 = (Shape) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1304392981, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda67
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SearchBarImpl_j1jLAyQ$lambda$3;
                                SearchBarImpl_j1jLAyQ$lambda$3 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$3(Shape.this, searchBarColors5, f6, f5, (Composer) obj, ((Integer) obj2).intValue());
                                return SearchBarImpl_j1jLAyQ$lambda$3;
                            }
                        }, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1148261763, "CC(remember):SearchBar.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda68
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean SearchBarImpl_j1jLAyQ$lambda$4$0;
                                    SearchBarImpl_j1jLAyQ$lambda$4$0 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$4$0(Animatable.this);
                                    return Boolean.valueOf(SearchBarImpl_j1jLAyQ$lambda$4$0);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (SearchBarImpl_j1jLAyQ$lambda$5((State) rememberedValue3)) {
                            startRestartGroup.startReplaceGroup(1236561977);
                            ComposerKt.sourceInformation(startRestartGroup, "3071@142398L401");
                            composableLambda = ComposableLambdaKt.rememberComposableLambda(1831594093, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda69
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SearchBarImpl_j1jLAyQ$lambda$6;
                                    SearchBarImpl_j1jLAyQ$lambda$6 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$6(Animatable.this, searchBarColors5, function3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SearchBarImpl_j1jLAyQ$lambda$6;
                                }
                            }, startRestartGroup, 54);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1236976477);
                            startRestartGroup.endReplaceGroup();
                            composableLambda = null;
                        }
                        int i19 = Animatable.$stable | 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | ((i18 << 15) & 458752) | ((i12 << 3) & 3670016);
                        Shape shape6 = shape4;
                        SearchBarColors searchBarColors6 = searchBarColors5;
                        float f7 = f5;
                        ComposableLambda composableLambda2 = composableLambda;
                        float f8 = f6;
                        Modifier modifier7 = modifier6;
                        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier7, windowInsets5, function2, rememberComposableLambda, composableLambda2, startRestartGroup, i19);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        searchBarColors3 = searchBarColors6;
                        f3 = f8;
                        f4 = f7;
                        shape2 = shape6;
                        windowInsets3 = windowInsets5;
                        modifier3 = modifier7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        shape2 = shape;
                        f3 = f;
                        windowInsets3 = windowInsets;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        f4 = f2;
                        searchBarColors3 = searchBarColors2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SearchBarImpl_j1jLAyQ$lambda$7;
                                SearchBarImpl_j1jLAyQ$lambda$7 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$7(Animatable.this, mutableFloatState, mutableState, mutableState2, modifier3, function2, shape2, searchBarColors3, f3, f4, windowInsets3, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SearchBarImpl_j1jLAyQ$lambda$7;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i5;
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i6 = i5;
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i9 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$0$0(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() == 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$2$0(Density density, Animatable animatable, Path path, Size size, LayoutDirection layoutDirection) {
        float mo528toPx0680j_4 = density.mo528toPx0680j_4(Dp.m9732constructorimpl(SearchBarCornerRadius * (1 - ((Number) animatable.getValue()).floatValue())));
        Path.CC.addRoundRect$default(path, RoundRectKt.m6574RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m6609toRectuvyYCjk(size.m6593unboximpl()), CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(mo528toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo528toPx0680j_4) & 4294967295L))), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$3(Shape shape, SearchBarColors searchBarColors, float f, float f2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3059@141989L38,3056@141863L309:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304392981, i, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:3056)");
            }
            SurfaceKt.m4112SurfaceT9BRK9s(null, shape, searchBarColors.getContainerColor(), ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors.getContainerColor(), composer, 0), f, f2, null, ComposableSingletons$SearchBarKt.INSTANCE.getLambda$1165377840$material3(), composer, 12582912, 65);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$4$0(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$6(final Animatable animatable, SearchBarColors searchBarColors, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3072@142446L35,3072@142416L369:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1831594093, i, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:3072)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -774666416, "CC(remember):SearchBar.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(animatable);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SearchBarImpl_j1jLAyQ$lambda$6$0$0;
                        SearchBarImpl_j1jLAyQ$lambda$6$0$0 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$6$0$0(Animatable.this, (GraphicsLayerScope) obj);
                        return SearchBarImpl_j1jLAyQ$lambda$6$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
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
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 355528122, "C3073@142505L46,3075@142649L38,3076@142710L57,3074@142572L195:SearchBar.kt#uh7d8r");
            DividerKt.m3057HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.getDividerColor(), composer, 0, 3);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors.getContainerColor(), composer, 0))), ComposableLambdaKt.rememberComposableLambda(1144253731, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SearchBarImpl_j1jLAyQ$lambda$6$1$0;
                    SearchBarImpl_j1jLAyQ$lambda$6$1$0 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$6$1$0(Function3.this, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                    return SearchBarImpl_j1jLAyQ$lambda$6$1$0;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
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
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$6$0$0(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarImpl_j1jLAyQ$lambda$6$1$0(Function3 function3, ColumnScope columnScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3077@142736L9:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1144253731, i, -1, "androidx.compose.material3.SearchBarImpl.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:3077)");
            }
            function3.invoke(columnScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i) {
        int i2;
        MutableState<BackEventCompat> mutableState3;
        MutableState<BackEventCompat> mutableState4;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1217602934);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarLayout)N(animationProgress,finalBackProgress,firstBackEvent,currentBackEvent,modifier,windowInsets,inputField,surface,content)3112@143884L34,3117@144046L120,3132@144682L5012,3113@143923L5771:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            mutableState3 = mutableState;
            i2 |= startRestartGroup.changed(mutableState3) ? 256 : 128;
        } else {
            mutableState3 = mutableState;
        }
        if ((i & 3072) == 0) {
            mutableState4 = mutableState2;
            i2 |= startRestartGroup.changed(mutableState4) ? 2048 : 1024;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217602934, i2, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.kt:3108)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1885335352, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MutableWindowInsets(null, 1, null == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier zIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1885340622, "CC(remember):SearchBar.kt#9igjgp");
            boolean z = (458752 & i2) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SearchBarLayout$lambda$1$0;
                        SearchBarLayout$lambda$1$0 = SearchBarKt.SearchBarLayout$lambda$1$0(MutableWindowInsets.this, windowInsets, (WindowInsets) obj);
                        return SearchBarLayout$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex, (Function1) rememberedValue2), windowInsets);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1885365866, "CC(remember):SearchBar.kt#9igjgp");
            boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(animatable))) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            SearchBarKt$SearchBarLayout$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                MutableState<BackEventCompat> mutableState5 = mutableState3;
                i3 = i2;
                rememberedValue3 = new SearchBarKt$SearchBarLayout$2$1(animatable, mutableWindowInsets, mutableState4, mutableFloatState, mutableState5);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2058590599, "C3122@144251L85,3123@144349L119:SearchBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSurface);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 329239585, "C3122@144325L9:SearchBar.kt#uh7d8r");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdInputField);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 397275701, "C3124@144442L12:SearchBar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function23 == null) {
                startRestartGroup.startReplaceGroup(2058820276);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2058820277);
                ComposerKt.sourceInformation(startRestartGroup, "*3127@144523L127");
                Modifier layoutId3 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSearchContent);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl4 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1819747385, "C3128@144623L9:SearchBar.kt#uh7d8r");
                function23.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SearchBarLayout$lambda$4;
                    SearchBarLayout$lambda$4 = SearchBarKt.SearchBarLayout$lambda$4(Animatable.this, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SearchBarLayout$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarLayout$lambda$1$0(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return Unit.INSTANCE;
    }

    /* renamed from: DockedSearchBarLayout-gLs90yA, reason: not valid java name */
    private static final void m3865DockedSearchBarLayoutgLs90yA(final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, final Shape shape, final Shape shape2, final Dp dp, final SearchBarColors searchBarColors, final float f, final float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Shape shape3;
        int i3;
        boolean z;
        int i4;
        SearchBarColors searchBarColors2;
        Composer startRestartGroup = composer.startRestartGroup(1524613774);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBarLayout)N(state,inputField,modifier,searchBarShape,dropdownShape,dropdownGapSize:c#ui.unit.Dp,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)3270@150241L388,3289@150921L1594,3267@150091L2431:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(dp) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(searchBarColors) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1524613774, i2, -1, "androidx.compose.material3.DockedSearchBarLayout (SearchBar.kt:3267)");
            }
            Shape rectangleShape = shape2 != null ? RectangleShapeKt.getRectangleShape() : shape;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1590967320, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DockedSearchBarLayout_gLs90yA$lambda$0;
                    DockedSearchBarLayout_gLs90yA$lambda$0 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$0(Shape.this, searchBarColors, shape, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return DockedSearchBarLayout_gLs90yA$lambda$0;
                }
            }, startRestartGroup, 54);
            if (shape2 != null) {
                i3 = i2;
                shape3 = rectangleShape;
                i4 = 54;
                z = true;
                searchBarColors2 = SearchBarColors.m3804copyjxsXWHM$default(searchBarColors, Color.INSTANCE.m6821getTransparent0d7_KjU(), 0L, null, 6, null);
            } else {
                shape3 = rectangleShape;
                i3 = i2;
                z = true;
                i4 = 54;
                searchBarColors2 = searchBarColors;
            }
            boolean z2 = dp != null ? z : false;
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1966576354, z, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DockedSearchBarLayout_gLs90yA$lambda$1;
                    DockedSearchBarLayout_gLs90yA$lambda$1 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1(Shape.this, searchBarState, dp, searchBarColors, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return DockedSearchBarLayout_gLs90yA$lambda$1;
                }
            }, startRestartGroup, i4);
            int i5 = i3 << 3;
            int i6 = i3 >> 6;
            composer2 = startRestartGroup;
            m3866DockedSearchBarLayoutImpl1tP8Re8(shape3, searchBarState, rememberComposableLambda, modifier, searchBarColors2, f, f2, z2, rememberComposableLambda2, composer2, (i5 & 7168) | (i5 & 112) | 100663680 | (458752 & i6) | (i6 & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DockedSearchBarLayout_gLs90yA$lambda$2;
                    DockedSearchBarLayout_gLs90yA$lambda$2 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$2(SearchBarState.this, function2, modifier, shape, shape2, dp, searchBarColors, f, f2, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DockedSearchBarLayout_gLs90yA$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayout_gLs90yA$lambda$0(Shape shape, SearchBarColors searchBarColors, Shape shape2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590967320, i, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:3271)");
            }
            if (shape != null) {
                composer.startReplaceGroup(1543368331);
                ComposerKt.sourceInformation(composer, "3272@150300L255");
                Modifier clip = ClipKt.clip(BackgroundKt.m352backgroundbw27NRU(Modifier.INSTANCE, searchBarColors.getContainerColor(), shape2), shape2);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, clip);
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
                ComposerKt.sourceInformationMarkerStart(composer, 299761246, "C3277@150525L12:SearchBar.kt#uh7d8r");
                function2.invoke(composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1543651454);
                ComposerKt.sourceInformation(composer, "3280@150593L12");
                function2.invoke(composer, 0);
                composer.endReplaceGroup();
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
    public static final Unit DockedSearchBarLayout_gLs90yA$lambda$1(Shape shape, SearchBarState searchBarState, Dp dp, SearchBarColors searchBarColors, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:SearchBar.kt#uh7d8r");
        boolean z = false;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966576354, i, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:3290)");
            }
            if (shape != null) {
                composer.startReplaceGroup(1372806238);
                ComposerKt.sourceInformation(composer, "3307@151915L56,3312@152162L56,3314@152265L65,3297@151327L1003");
                AnimationSpec<Float> animationSpecForExpand$material3 = searchBarState.getAnimationSpecForExpand$material3();
                SnapSpec snapSpec = animationSpecForExpand$material3 instanceof FiniteAnimationSpec ? (FiniteAnimationSpec) animationSpecForExpand$material3 : null;
                if (snapSpec == null) {
                    snapSpec = AnimationSpecKt.snap$default(0, 1, null);
                }
                AnimationSpec<Float> animationSpecForCollapse$material3 = searchBarState.getAnimationSpecForCollapse$material3();
                SnapSpec snapSpec2 = animationSpecForCollapse$material3 instanceof FiniteAnimationSpec ? (FiniteAnimationSpec) animationSpecForCollapse$material3 : null;
                if (snapSpec2 == null) {
                    snapSpec2 = AnimationSpecKt.snap$default(0, 1, null);
                }
                Modifier alpha = AlphaKt.alpha(ClipKt.clip(BackgroundKt.m352backgroundbw27NRU(PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, dp != null ? dp.m9746unboximpl() : Dp.m9732constructorimpl(0), 0.0f, 0.0f, 13, null), searchBarColors.getContainerColor(), shape), shape), searchBarState.getContentProgress$material3());
                if (searchBarState.getProgress() > 0.1f && searchBarState.getTargetValue() == SearchBarValue.Expanded) {
                    z = true;
                }
                ComposerKt.sourceInformationMarkerStart(composer, -94234090, "CC(remember):SearchBar.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$0$0;
                            DockedSearchBarLayout_gLs90yA$lambda$1$0$0 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$0$0((IntSize) obj);
                            return DockedSearchBarLayout_gLs90yA$lambda$1$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EnterTransition slideIn = EnterExitTransitionKt.slideIn(snapSpec, (Function1) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(composer, -94226186, "CC(remember):SearchBar.kt#9igjgp");
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$1$0;
                            DockedSearchBarLayout_gLs90yA$lambda$1$1$0 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$1$0((IntSize) obj);
                            return DockedSearchBarLayout_gLs90yA$lambda$1$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AnimatedVisibilityKt.AnimatedVisibility(z, alpha, slideIn, EnterExitTransitionKt.slideOut(snapSpec2, (Function1) rememberedValue2), (String) null, ComposableLambdaKt.rememberComposableLambda(-1402963311, true, new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit DockedSearchBarLayout_gLs90yA$lambda$1$2;
                        DockedSearchBarLayout_gLs90yA$lambda$1$2 = SearchBarKt.DockedSearchBarLayout_gLs90yA$lambda$1$2(Function3.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return DockedSearchBarLayout_gLs90yA$lambda$1$2;
                    }
                }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1374145097);
                ComposerKt.sourceInformation(composer, "3318@152368L123");
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
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -368377921, "C3319@152397L46,3320@152464L9:SearchBar.kt#uh7d8r");
                DividerKt.m3057HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.getDividerColor(), composer, 0, 3);
                function3.invoke(columnScopeInstance, composer, 6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
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
    public static final IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$0$0(IntSize intSize) {
        return IntOffset.m9855boximpl(IntOffset.m9858constructorimpl((0 << 32) | (4294967295L & MathKt.roundToInt((-((int) (intSize.m9911unboximpl() & 4294967295L))) / 2.0f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset DockedSearchBarLayout_gLs90yA$lambda$1$1$0(IntSize intSize) {
        return IntOffset.m9855boximpl(IntOffset.m9858constructorimpl((0 << 32) | (4294967295L & MathKt.roundToInt((-((int) (intSize.m9911unboximpl() & 4294967295L))) / 2.0f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayout_gLs90yA$lambda$1$2(Function3 function3, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3315@152287L25:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402963311, i, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous>.<anonymous> (SearchBar.kt:3315)");
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

    /* renamed from: DockedSearchBarLayoutImpl-1tP8Re8, reason: not valid java name */
    private static final void m3866DockedSearchBarLayoutImpl1tP8Re8(final Shape shape, final SearchBarState searchBarState, final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, SearchBarColors searchBarColors, final float f, final float f2, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        SearchBarColors searchBarColors2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2112470650);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBarLayoutImpl)N(shape,state,inputField,modifier,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,hasGap,content)3339@152880L24,3340@152949L47,3340@152909L87,3345@153096L38,3349@153268L2348,3342@153002L2614:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(shape) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(searchBarState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            searchBarColors2 = searchBarColors;
            i2 |= startRestartGroup.changed(searchBarColors2) ? 16384 : 8192;
        } else {
            searchBarColors2 = searchBarColors;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112470650, i2, -1, "androidx.compose.material3.DockedSearchBarLayoutImpl (SearchBar.kt:3338)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean isExpanded = isExpanded(searchBarState);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1435248085, "CC(remember):SearchBar.kt#9igjgp");
            int i3 = i2;
            boolean changedInstance = ((i2 & 112) == 32) | startRestartGroup.changedInstance(coroutineScope);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0;
                        DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0 = SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0(CoroutineScope.this, searchBarState);
                        return DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackHandler_androidKt.BackHandler(isExpanded, (Function0) rememberedValue2, startRestartGroup, 0, 0);
            int i4 = i3 >> 3;
            composer2 = startRestartGroup;
            SurfaceKt.m4112SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(modifier), shape, searchBarColors2.getContainerColor(), ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors2.getContainerColor(), startRestartGroup, 0), f, f2, null, ComposableLambdaKt.rememberComposableLambda(717820257, true, new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$1;
                    DockedSearchBarLayoutImpl_1tP8Re8$lambda$1 = SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$1(z, function2, function22, searchBarState, (Composer) obj, ((Integer) obj2).intValue());
                    return DockedSearchBarLayoutImpl_1tP8Re8$lambda$1;
                }
            }, startRestartGroup, 54), composer2, ((i3 << 3) & 112) | 12582912 | (57344 & i4) | (i4 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final SearchBarColors searchBarColors3 = searchBarColors2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$2;
                    DockedSearchBarLayoutImpl_1tP8Re8$lambda$2 = SearchBarKt.DockedSearchBarLayoutImpl_1tP8Re8$lambda$2(Shape.this, searchBarState, function2, modifier, searchBarColors3, f, f2, z, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DockedSearchBarLayoutImpl_1tP8Re8$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$0$0(CoroutineScope coroutineScope, SearchBarState searchBarState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchBarKt$DockedSearchBarLayoutImpl$1$1$1(searchBarState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DockedSearchBarLayoutImpl_1tP8Re8$lambda$1(boolean z, Function2 function2, Function2 function22, SearchBarState searchBarState, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C3350@153306L26,3360@153750L1860,3360@153703L1907:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(717820257, i, -1, "androidx.compose.material3.DockedSearchBarLayoutImpl.<anonymous> (SearchBar.kt:3350)");
            }
            float m9732constructorimpl = Dp.m9732constructorimpl(SearchBar_androidKt.getWindowContainerHeight(composer, 0) * (z ? 0.5f : DockedExpandedTableMaxHeightScreenRatio));
            float m9746unboximpl = ((Dp) RangesKt.coerceAtMost(Dp.m9730boximpl(DockedExpandedTableMinHeight), Dp.m9730boximpl(m9732constructorimpl))).m9746unboximpl();
            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function22});
            ComposerKt.sourceInformationMarkerStart(composer, -1664450395, "CC(remember):SearchBar.kt#9igjgp");
            boolean changed = composer.changed(searchBarState) | composer.changed(m9732constructorimpl) | composer.changed(m9746unboximpl);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (MultiContentMeasurePolicy) new SearchBarKt$DockedSearchBarLayoutImpl$2$1$1(searchBarState, m9732constructorimpl, m9746unboximpl);
                composer.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(composer, 292526026, "CC(remember):Layout.kt#9igjgp");
            boolean changed2 = composer.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composer.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: FullScreenSearchBarLayout-BXK5RNM, reason: not valid java name */
    private static final void m3872FullScreenSearchBarLayoutBXK5RNM(final SearchBarState searchBarState, final PredictiveBackState predictiveBackState, final Function2<? super Composer, ? super Integer, Unit> function2, final PaddingValues paddingValues, final Modifier modifier, final Shape shape, final SearchBarColors searchBarColors, final float f, final float f2, final WindowInsets windowInsets, final boolean z, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Shape shape2;
        Composer composer2;
        String str;
        final MutableState mutableState;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1058700950);
        ComposerKt.sourceInformation(startRestartGroup, "C(FullScreenSearchBarLayout)N(state,predictiveBackState,inputField,inputFieldPadding,modifier,collapsedShape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,windowInsets,isContained,content)3416@156123L57,3418@156220L64,3427@156632L64,3436@157019L7,3437@157071L15,3439@157119L1042,3464@158427L34,3470@158678L120,3502@159862L6555,3467@158583L7834:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(predictiveBackState) : startRestartGroup.changedInstance(predictiveBackState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(searchBarColors) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i6 = i4;
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i3 & 1)) {
            shape2 = shape;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058700950, i3, i6, "androidx.compose.material3.FullScreenSearchBarLayout (SearchBar.kt:3415)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495650435, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BackEventProgress value;
                        value = PredictiveBackState.this.getValue();
                        return value;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495653546, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackEventProgress FullScreenSearchBarLayout_BXK5RNM$lambda$1 = FullScreenSearchBarLayout_BXK5RNM$lambda$1(state);
            if (FullScreenSearchBarLayout_BXK5RNM$lambda$1 instanceof BackEventProgress.InProgress) {
                if (mutableState2.getValue() == null) {
                    mutableState2.setValue(FullScreenSearchBarLayout_BXK5RNM$lambda$1);
                }
            } else if (Intrinsics.areEqual(FullScreenSearchBarLayout_BXK5RNM$lambda$1, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState2.setValue(null);
            } else if (!Intrinsics.areEqual(FullScreenSearchBarLayout_BXK5RNM$lambda$1, BackEventProgress.Completed.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495666730, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                rememberedValue3 = mutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackEventProgress FullScreenSearchBarLayout_BXK5RNM$lambda$12 = FullScreenSearchBarLayout_BXK5RNM$lambda$1(state);
            if (FullScreenSearchBarLayout_BXK5RNM$lambda$12 instanceof BackEventProgress.InProgress) {
                mutableState3.setValue(FullScreenSearchBarLayout_BXK5RNM$lambda$12);
            } else if (Intrinsics.areEqual(FullScreenSearchBarLayout_BXK5RNM$lambda$12, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState3.setValue(null);
            } else if (!Intrinsics.areEqual(FullScreenSearchBarLayout_BXK5RNM$lambda$12, BackEventProgress.Completed.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density = (Density) consume;
            final Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495683292, "CC(remember):SearchBar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(density) | startRestartGroup.changed(fullScreenShape);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):SearchBar.kt#9igjgp";
                mutableState = mutableState3;
                i5 = i3;
                shape2 = shape;
                rememberedValue4 = new GenericShape(new Function3() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit FullScreenSearchBarLayout_BXK5RNM$lambda$6$0;
                        FullScreenSearchBarLayout_BXK5RNM$lambda$6$0 = SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$6$0(Shape.this, fullScreenShape, density, searchBarState, mutableState, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                        return FullScreenSearchBarLayout_BXK5RNM$lambda$6$0;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                shape2 = shape;
                i5 = i3;
                str = "CC(remember):SearchBar.kt#9igjgp";
                mutableState = mutableState3;
            }
            GenericShape genericShape = (GenericShape) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495724140, str);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new MutableWindowInsets(null, 1, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            WindowInsets m1300onlybOOhFvg = WindowInsetsKt.m1300onlybOOhFvg(mutableWindowInsets.getInsets(), WindowInsetsSides.m1314plusgK_yJZ4(WindowInsetsSides.INSTANCE.m1324getHorizontalJoeWqyM(), WindowInsetsSides.INSTANCE.m1322getBottomJoeWqyM()));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495732258, str);
            boolean z2 = (1879048192 & i5) == 536870912;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit FullScreenSearchBarLayout_BXK5RNM$lambda$8$0;
                        FullScreenSearchBarLayout_BXK5RNM$lambda$8$0 = SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$8$0(MutableWindowInsets.this, windowInsets, (WindowInsets) obj);
                        return FullScreenSearchBarLayout_BXK5RNM$lambda$8$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (Function1) rememberedValue6), windowInsets);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 495776581, str);
            boolean changed2 = ((i6 & 14) == 4) | startRestartGroup.changed(mutableState) | ((i5 & 14) == 4) | ((i5 & 7168) == 2048) | startRestartGroup.changed(mutableState2);
            SearchBarKt$FullScreenSearchBarLayout$2$1 rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new SearchBarKt$FullScreenSearchBarLayout$2$1(mutableState, searchBarState, z, paddingValues, mutableWindowInsets, mutableState2);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 208382447, "C3478@159054L17,3475@158883L351,3489@159437L38,3485@159248L372,3498@159776L17,3495@159634L210:SearchBar.kt#uh7d8r");
            Modifier clip = ClipKt.clip(PaddingKt.padding(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdInputField), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1300onlybOOhFvg(m1300onlybOOhFvg, WindowInsetsSides.INSTANCE.m1324getHorizontalJoeWqyM()), startRestartGroup, 0)), shape2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2129697162, "C3482@159208L12:SearchBar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i7 = i5 >> 9;
            SurfaceKt.m4112SurfaceT9BRK9s(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSurface), genericShape, searchBarColors.getContainerColor(), ColorSchemeKt.m2784contentColorForek8zF_U(searchBarColors.getContainerColor(), startRestartGroup, 0), f, f2, null, ComposableSingletons$SearchBarKt.INSTANCE.getLambda$1464724888$material3(), startRestartGroup, (57344 & i7) | 12582918 | (i7 & 458752), 64);
            composer2 = startRestartGroup;
            Modifier padding = PaddingKt.padding(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSearchContent), WindowInsetsKt.asPaddingValues(m1300onlybOOhFvg, composer2, 0));
            int i8 = (i6 << 6) & 7168;
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, padding);
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
            Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i8 >> 6) & 112) | 6));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FullScreenSearchBarLayout_BXK5RNM$lambda$11;
                    FullScreenSearchBarLayout_BXK5RNM$lambda$11 = SearchBarKt.FullScreenSearchBarLayout_BXK5RNM$lambda$11(SearchBarState.this, predictiveBackState, function2, paddingValues, modifier, shape2, searchBarColors, f, f2, windowInsets, z, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FullScreenSearchBarLayout_BXK5RNM$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenSearchBarLayout_BXK5RNM$lambda$6$0(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState, Path path, Size size, LayoutDirection layoutDirection) {
        if (shape == RoundedCornerShapeKt.getCircleShape() && shape2 == RectangleShapeKt.getRectangleShape()) {
            if (density.mo528toPx0680j_4(Dp.m9732constructorimpl(SearchBarCornerRadius * Math.max(1 - searchBarState.getProgress(), transform((BackEventProgress.InProgress) mutableState.getValue())))) < 0.001d) {
                Path.CC.addRect$default(path, androidx.compose.ui.geometry.SizeKt.m6609toRectuvyYCjk(size.m6593unboximpl()), null, 2, null);
            } else {
                Path.CC.addRoundRect$default(path, RoundRectKt.m6574RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m6609toRectuvyYCjk(size.m6593unboximpl()), CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L))), null, 2, null);
            }
        } else {
            if (searchBarState.getProgress() >= 0.5f) {
                shape = shape2;
            }
            OutlineKt.addOutline(path, shape.mo422createOutlinePq9zytI(size.m6593unboximpl(), layoutDirection, density));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenSearchBarLayout_BXK5RNM$lambda$8$0(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transform(BackEventProgress.InProgress inProgress) {
        if (inProgress == null) {
            return 0.0f;
        }
        return PredictiveBack.INSTANCE.transform$material3(inProgress.getProgress());
    }

    private static final void DisableSoftKeyboard(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(627989674);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisableSoftKeyboard)N(content)3654@166719L31,3654@166678L92:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627989674, i2, -1, "androidx.compose.material3.DisableSoftKeyboard (SearchBar.kt:3653)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2092308663, "CC(remember):SearchBar.kt#9igjgp");
            SearchBarKt$DisableSoftKeyboard$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SearchBarKt$DisableSoftKeyboard$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            PlatformTextInputModifierNodeKt.InterceptPlatformTextInput((PlatformTextInputInterceptor) rememberedValue, function2, startRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisableSoftKeyboard$lambda$1;
                    DisableSoftKeyboard$lambda$1 = SearchBarKt.DisableSoftKeyboard$lambda$1(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisableSoftKeyboard$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect getCollapsedBounds(SearchBarState searchBarState) {
        IntRect m9897IntRectVbeCjmY;
        LayoutCoordinates collapsedCoords = searchBarState.getCollapsedCoords();
        if (collapsedCoords != null) {
            if (!collapsedCoords.isAttached()) {
                collapsedCoords = null;
            }
            if (collapsedCoords != null && (m9897IntRectVbeCjmY = IntRectKt.m9897IntRectVbeCjmY(IntOffsetKt.m9881roundk4lQ0M(LayoutCoordinatesKt.positionInWindow(collapsedCoords)), collapsedCoords.mo8287getSizeYbymL2g())) != null) {
                return m9897IntRectVbeCjmY;
            }
        }
        return IntRect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DetectClickFromInteractionSource(final InteractionSource interactionSource, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-652650823);
        ComposerKt.sourceInformation(startRestartGroup, "C(DetectClickFromInteractionSource)N(interactionSource,onClick)3670@167223L148,3670@167189L182:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652650823, i2, -1, "androidx.compose.material3.DetectClickFromInteractionSource (SearchBar.kt:3669)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -132210835, "CC(remember):SearchBar.kt#9igjgp");
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            SearchBarKt$DetectClickFromInteractionSource$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SearchBarKt$DetectClickFromInteractionSource$1$1(interactionSource, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DetectClickFromInteractionSource$lambda$1;
                    DetectClickFromInteractionSource$lambda$1 = SearchBarKt.DetectClickFromInteractionSource$lambda$1(InteractionSource.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DetectClickFromInteractionSource$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f, float f2) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f2)) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m3880calculatePredictiveBackOffsetXrOvwMX4(long j, int i, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f, float f2) {
        if (backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.m9675getMaxWidthimpl(j) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * (1 - f) * f2 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m3881calculatePredictiveBackOffsetYdzo92Q0(long j, int i, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i2, int i3, float f) {
        if (backEventCompat2 == null || backEventCompat == null || f == 0.0f) {
            return 0;
        }
        int min = Math.min(Math.max(0, ((Constraints.m9674getMaxHeightimpl(j) - i2) / 2) - i), i3);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float abs = Math.abs(touchY) / Constraints.m9674getMaxHeightimpl(j);
        return MathKt.roundToInt(MathHelpersKt.lerp(0, min, abs) * f * Math.signum(touchY));
    }

    static {
        float f = 8;
        SearchBarAsTopBarPadding = Dp.m9732constructorimpl(f);
        float f2 = 4;
        AppBarWithSearchHorizontalPadding = Dp.m9732constructorimpl(f2);
        AppBarWithSearchVerticalPadding = Dp.m9732constructorimpl(f2);
        FullScreenExpandedHorizontalPadding = Dp.m9732constructorimpl(f);
        SearchBarVerticalPadding = Dp.m9732constructorimpl(f);
        SearchBarIconOffsetX = Dp.m9732constructorimpl(f2);
        SearchBarPredictiveBackMinMargin = Dp.m9732constructorimpl(f);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
        AnimationForContentFadeInSpec = AnimationSpecKt.tween(100, 50, MotionTokens.INSTANCE.getEasingStandardAccelerateCubicBezier());
        AnimationForContentFadeOutSpec = AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingStandardDecelerateCubicBezier(), 2, null);
    }

    public static final float getSearchBarAsTopBarPadding() {
        return SearchBarAsTopBarPadding;
    }

    public static final float getAppBarWithSearchVerticalPadding() {
        return AppBarWithSearchVerticalPadding;
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarMaxWidth() {
        return SearchBarMaxWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AppBarWithSearch_ii5sN6A$lambda$2(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final BackEventProgress FullScreenSearchBarLayout_BXK5RNM$lambda$1(State<? extends BackEventProgress> state) {
        return state.getValue();
    }
}
