package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.AppBarLargeFlexibleTokens;
import androidx.compose.material3.tokens.AppBarLargeTokens;
import androidx.compose.material3.tokens.AppBarMediumFlexibleTokens;
import androidx.compose.material3.tokens.AppBarMediumTokens;
import androidx.compose.material3.tokens.AppBarSmallTokens;
import androidx.compose.material3.tokens.AppBarTokens;
import androidx.compose.material3.tokens.BottomAppBarTokens;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008b\u0001\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u0015\u001a\u0095\u0001\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a²\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010!\u001a\u0095\u0001\u0010\"\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b$\u0010%\u001a¶\u0001\u0010&\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0095\u0001\u0010)\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010%\u001a¶\u0001\u0010+\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b,\u0010(\u001aà\u0001\u0010-\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062*\b\u0002\u0010\u001d\u001a$\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b2\u00103\u001a\u0080\u0001\u00104\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b:\u0010;\u001a\u008c\u0001\u00104\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b=\u0010>\u001ai\u00104\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010?\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b@\u0010A\u001au\u00104\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010<2\u001c\u0010?\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\bB\u0010C\u001a\u007f\u0010D\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010<2\u001c\u0010?\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\bG\u0010H\u001ay\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010<2\u001c\u0010?\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010M\u001a\b\u0012\u0004\u0012\u00020.0N2\u0006\u0010O\u001a\u00020PH\u0003¢\u0006\u0002\u0010Q\u001a#\u0010M\u001a\b\u0012\u0004\u0012\u00020.0N2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020.H\u0003¢\u0006\u0002\u0010U\u001a+\u0010V\u001a\u00020W2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010[\u001a\u00020YH\u0007¢\u0006\u0002\u0010\\\u001a+\u0010]\u001a\u00020^2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010[\u001a\u00020YH\u0007¢\u0006\u0002\u0010_\u001a \u0010`\u001a\u00020^2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020YH\u0007\u001a>\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020^2\u0006\u0010d\u001a\u00020Y2\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010f2\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010hH\u0082@¢\u0006\u0002\u0010i\u001a´\u0001\u0010q\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010r\u001a\u00020s2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010t\u001a\u00020s2\u0006\u0010\u001e\u001a\u00020\u001f2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0004\bu\u0010v\u001aù\u0001\u0010-\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010r\u001a\u00020s2\u0006\u0010~\u001a\u00020\r2\u0011\u0010\u007f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0007\u0010\u0080\u0001\u001a\u00020s2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010t\u001a\u00020s2\u0014\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0007\u0010\u0082\u0001\u001a\u00020s2\u0006\u0010\u001e\u001a\u00020\u001f2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0017\u0010\u0089\u0001\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002\u001aê\u0001\u0010\u008a\u0001\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u0002072\u0007\u0010\u008f\u0001\u001a\u0002072\u0007\u0010\u0090\u0001\u001a\u0002072\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010r\u001a\u00020s2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010t\u001a\u00020s2\r\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020Y0\u00032\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0007\u0010~\u001a\u00030\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020.2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0007\u0010\u0096\u0001\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a@\u0010\u0099\u0001\u001a\u00020b2\u0006\u0010c\u001a\u00020W2\u0006\u0010d\u001a\u00020Y2\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010f2\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010hH\u0082@¢\u0006\u0003\u0010\u009a\u0001\u001a\u0015\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020.0NH\u0003¢\u0006\u0003\u0010\u009c\u0001\"\u0010\u0010j\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\u0016\u0010l\u001a\u00020\rX\u0080\u0004¢\u0006\n\n\u0002\u0010k\u001a\u0004\bm\u0010n\"\u0010\u0010o\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\u0010\u0010p\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\"\u0010w\u001a\b\u0012\u0004\u0012\u00020y0x8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"&\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010x8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0001\u0010{\u001a\u0005\b\u0088\u0001\u0010}\"\u0018\u0010\u009d\u0001\u001a\u00030\u009e\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0011\u0010¡\u0001\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\u0011\u0010¢\u0001\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\u0011\u0010£\u0001\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k\"\u0011\u0010¤\u0001\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010k¨\u0006¥\u0001²\u0006\u000b\u0010¦\u0001\u001a\u00020.X\u008a\u0084\u0002"}, d2 = {"TopAppBar", "", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "navigationIcon", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "expandedHeight", "Landroidx/compose/ui/unit/Dp;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "colors", "Landroidx/compose/material3/TopAppBarColors;", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "TopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "TopAppBar-gNPyAyM", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar", "CenterAlignedTopAppBar-GHTll3U", "CenterAlignedTopAppBar-gNPyAyM", "subtitle", "titleHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "TopAppBar-121YqSk", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Alignment$Horizontal;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "MediumTopAppBar", "collapsedHeight", "MediumTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumFlexibleTopAppBar", "MediumFlexibleTopAppBar-eXZ4JBQ", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Alignment$Horizontal;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "LargeTopAppBar", "LargeTopAppBar-oKE7A98", "LargeFlexibleTopAppBar", "LargeFlexibleTopAppBar-eXZ4JBQ", "TwoRowsTopAppBar", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "expanded", "TwoRowsTopAppBar-eXZ4JBQ", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Alignment$Horizontal;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "BottomAppBar", "floatingActionButton", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlexibleBottomAppBar", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "FlexibleBottomAppBar-wBhsO_E", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Horizontal;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarLayout", "containerHeight", "BottomAppBarLayout-t5fmz9U", "(FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberIsScrollingContentAtStart", "Landroidx/compose/runtime/State;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "reverseScrolling", "(Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "rememberBottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "BottomAppBarState", "settleAppBarBottom", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BottomAppBarHorizontalPadding", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "subtitleTextStyle", "SingleRowTopAppBar-TCVpFMg", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "LocalSingleRowTopAppBarOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/SingleRowTopAppBarOverride;", "getLocalSingleRowTopAppBarOverride$annotations", "()V", "getLocalSingleRowTopAppBarOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "smallSubtitle", "smallSubtitleTextStyle", "TwoRowsTopAppBar-pJA5dT0", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "LocalTwoRowsTopAppBarOverride", "Landroidx/compose/material3/TwoRowsTopAppBarOverride;", "getLocalTwoRowsTopAppBarOverride$annotations", "getLocalTwoRowsTopAppBarOverride", "adjustHeightOffsetLimit", "TopAppBarLayout", "scrolledOffset", "Landroidx/compose/material3/internal/FloatProducer;", "navigationIconContentColor", "titleContentColor", "subtitleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "hideTitleSemantics", "height", "TopAppBarLayout-_5F1rQI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/FloatProducer;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "settleAppBar", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberTouchExplorationService", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "MediumTitleBottomPadding", "LargeTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "material3", "touchExplorationServiceEnabled"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> LocalSingleRowTopAppBarOverride;
    private static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> LocalTwoRowsTopAppBarOverride;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBarLayout_t5fmz9U$lambda$5(float f, Arrangement.Horizontal horizontal, Modifier modifier, long j, long j2, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2511BottomAppBarLayoutt5fmz9U(f, horizontal, modifier, j, j2, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_1oL4kX8$lambda$0(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2507BottomAppBar1oL4kX8(modifier, j, j2, f, paddingValues, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_Snr_uVM$lambda$0(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, int i, int i2, Composer composer, int i3) {
        m2508BottomAppBarSnr_uVM(function3, modifier, function2, j, j2, f, paddingValues, windowInsets, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_e_3WI5M$lambda$0(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2509BottomAppBare3WI5M(modifier, j, j2, f, paddingValues, windowInsets, bottomAppBarScrollBehavior, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_qhFBPw4$lambda$1(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2510BottomAppBarqhFBPw4(function3, modifier, function2, j, j2, f, paddingValues, windowInsets, bottomAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenterAlignedTopAppBar_GHTll3U$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2512CenterAlignedTopAppBarGHTll3U(function2, modifier, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenterAlignedTopAppBar_gNPyAyM$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        m2513CenterAlignedTopAppBargNPyAyM(function2, modifier, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlexibleBottomAppBar_wBhsO_E$lambda$0(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2514FlexibleBottomAppBarwBhsO_E(modifier, j, j2, paddingValues, horizontal, f, windowInsets, bottomAppBarScrollBehavior, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function3 function3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m2515LargeFlexibleTopAppBareXZ4JBQ(function2, modifier, function22, function23, function3, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeTopAppBar_oKE7A98$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2516LargeTopAppBaroKE7A98(function2, modifier, function22, function3, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function3 function3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m2517MediumFlexibleTopAppBareXZ4JBQ(function2, modifier, function22, function23, function3, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumTopAppBar_oKE7A98$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2518MediumTopAppBaroKE7A98(function2, modifier, function22, function3, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar_TCVpFMg$lambda$1(Modifier modifier, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Alignment.Horizontal horizontal, Function2 function23, Function3 function3, float f, PaddingValues paddingValues, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m2519SingleRowTopAppBarTCVpFMg(modifier, function2, textStyle, function22, textStyle2, horizontal, function23, function3, f, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarLayout__5F1rQI$lambda$2(Modifier modifier, FloatProducer floatProducer, long j, long j2, long j3, long j4, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Function0 function0, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, boolean z, Function2 function23, Function2 function24, float f, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        m2523TopAppBarLayout_5F1rQI(modifier, floatProducer, j, j2, j3, j4, function2, textStyle, function22, textStyle2, function0, vertical, horizontal, i, z, function23, function24, f, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_121YqSk$lambda$0(Function2 function2, Function2 function22, Modifier modifier, Function2 function23, Function3 function3, Alignment.Horizontal horizontal, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i, int i2, int i3, Composer composer, int i4) {
        m2520TopAppBar121YqSk(function2, function22, modifier, function23, function3, horizontal, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_GHTll3U$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2521TopAppBarGHTll3U(function2, modifier, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_gNPyAyM$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        m2522TopAppBargNPyAyM(function2, modifier, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$4(Function3 function3, Modifier modifier, Function3 function32, Function2 function2, Function3 function33, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m2524TwoRowsTopAppBareXZ4JBQ(function3, modifier, function32, function2, function33, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_pJA5dT0$lambda$1(Modifier modifier, Function2 function2, TextStyle textStyle, float f, Function2 function22, TextStyle textStyle2, Function2 function23, TextStyle textStyle3, Function2 function24, TextStyle textStyle4, Alignment.Horizontal horizontal, Function2 function25, Function3 function3, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m2525TwoRowsTopAppBarpJA5dT0(modifier, function2, textStyle, f, function22, textStyle2, function23, textStyle3, function24, textStyle4, horizontal, function25, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalSingleRowTopAppBarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalTwoRowsTopAppBarOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d6  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with contentPadding parameter")
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2521TopAppBarGHTll3U(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function24;
        final Function3 function33;
        final float f3;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Modifier modifier4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1784421840);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(title,modifier,navigationIcon,actions,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)176@8962L339:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i13 = 131072;
                                    i3 |= i13;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i13 = 65536;
                            i3 |= i13;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i12 = 1048576;
                                    i3 |= i12;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i12 = 524288;
                            i3 |= i12;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            i9 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "172@8820L12,173@8882L17");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    i11 = (i2 & 32) != 0 ? i9 & (-458753) : i9;
                                    if ((i2 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    modifier4 = modifier2;
                                } else {
                                    Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function23 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$657782987$material3();
                                    }
                                    if (i5 != 0) {
                                        function32 = ComposableSingletons$AppBarKt.INSTANCE.m2805getLambda$1270442071$material3();
                                    }
                                    if (i6 != 0) {
                                        f2 = TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) != 0) {
                                        i10 = i9 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i10 = (-3670017) & i10;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    }
                                    if (i8 != 0) {
                                        modifier4 = companion;
                                        topAppBarScrollBehavior3 = null;
                                    } else {
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        modifier4 = companion;
                                    }
                                    i11 = i10;
                                }
                                WindowInsets windowInsets4 = windowInsets2;
                                TopAppBarColors topAppBarColors4 = topAppBarColors2;
                                Function3 function34 = function32;
                                float f4 = f2;
                                Function2 function25 = function23;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1784421840, i11, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:176)");
                                }
                                composer2 = startRestartGroup;
                                m2522TopAppBargNPyAyM(function2, modifier4, function25, function34, f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, TopAppBarDefaults.INSTANCE.getContentPadding(), composer2, (i11 & 14) | 100663296 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                function24 = function25;
                                function33 = function34;
                                f3 = f4;
                                windowInsets3 = windowInsets4;
                                topAppBarColors3 = topAppBarColors4;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                function24 = function23;
                                function33 = function32;
                                f3 = f2;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit TopAppBar_GHTll3U$lambda$0;
                                        TopAppBar_GHTll3U$lambda$0 = AppBarKt.TopAppBar_GHTll3U$lambda$0(Function2.this, modifier3, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return TopAppBar_GHTll3U$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        i9 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: TopAppBar-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2522TopAppBargNPyAyM(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f3;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        PaddingValues paddingValues3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        int i13;
        float f4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(660588393);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(title,modifier,navigationIcon,actions,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior,contentPadding)240@12345L5,237@12220L708:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i15 = 131072;
                                    i3 |= i15;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i15 = 65536;
                            i3 |= i15;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i14 = 1048576;
                                    i3 |= i14;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i14 = 524288;
                            i3 |= i14;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "232@12008L12,233@12070L17");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i16 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function23 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$2094288676$material3();
                                        }
                                        if (i5 != 0) {
                                            function32 = ComposableSingletons$AppBarKt.INSTANCE.m2807getLambda$1342205566$material3();
                                        }
                                        if (i6 != 0) {
                                            f2 = TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 32) != 0) {
                                            i12 = i11 & (-458753);
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                        } else {
                                            i12 = i11;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i12 &= -3670017;
                                            topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                        }
                                        int i17 = i12;
                                        TopAppBarScrollBehavior topAppBarScrollBehavior4 = i8 != 0 ? null : topAppBarScrollBehavior;
                                        if (i10 != 0) {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                            paddingValues3 = TopAppBarDefaults.INSTANCE.getContentPadding();
                                        } else {
                                            paddingValues3 = paddingValues;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                        }
                                        function25 = function23;
                                        function34 = function32;
                                        windowInsets4 = windowInsets2;
                                        topAppBarColors4 = topAppBarColors2;
                                        i13 = i17;
                                        f4 = f2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i18 = (i2 & 32) != 0 ? i11 & (-458753) : i11;
                                        if ((i2 & 64) != 0) {
                                            i18 &= -3670017;
                                        }
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        paddingValues3 = paddingValues;
                                        i13 = i18;
                                        function25 = function23;
                                        function34 = function32;
                                        f4 = f2;
                                        windowInsets4 = windowInsets2;
                                        topAppBarColors4 = topAppBarColors2;
                                    }
                                    Modifier modifier4 = modifier2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(660588393, i13, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:237)");
                                    }
                                    int i19 = i13 << 3;
                                    int i20 = i13 << 12;
                                    composer2 = startRestartGroup;
                                    m2519SingleRowTopAppBarTCVpFMg(modifier4, function2, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), null, TextStyle.INSTANCE.getDefault(), Alignment.INSTANCE.getStart(), function25, function34, (Dp.m9737equalsimpl0(f4, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f4, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM() : f4, paddingValues3, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i13 >> 3) & 14) | 224256 | (i19 & 112) | (3670016 & i20) | (i20 & 29360128) | (i19 & 1879048192), (i13 >> 15) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f3 = f4;
                                    modifier3 = modifier4;
                                    function24 = function25;
                                    function33 = function34;
                                    paddingValues2 = paddingValues3;
                                    windowInsets3 = windowInsets4;
                                    topAppBarColors3 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    modifier3 = modifier2;
                                    function24 = function23;
                                    function33 = function32;
                                    f3 = f2;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda41
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit TopAppBar_gNPyAyM$lambda$0;
                                            TopAppBar_gNPyAyM$lambda$0 = AppBarKt.TopAppBar_gNPyAyM$lambda$0(Function2.this, modifier3, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, paddingValues2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return TopAppBar_gNPyAyM$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
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
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d6  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with contentPadding parameter")
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2512CenterAlignedTopAppBarGHTll3U(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function24;
        final Function3 function33;
        final float f3;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Modifier modifier4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-302230691);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenterAlignedTopAppBar)N(title,modifier,navigationIcon,actions,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)309@15850L352:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i13 = 131072;
                                    i3 |= i13;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i13 = 65536;
                            i3 |= i13;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i12 = 1048576;
                                    i3 |= i12;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i12 = 524288;
                            i3 |= i12;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            i9 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "305@15708L12,306@15770L17");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    i11 = (i2 & 32) != 0 ? i9 & (-458753) : i9;
                                    if ((i2 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    modifier4 = modifier2;
                                } else {
                                    Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function23 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$575301698$material3();
                                    }
                                    if (i5 != 0) {
                                        function32 = ComposableSingletons$AppBarKt.INSTANCE.m2815getLambda$643931612$material3();
                                    }
                                    if (i6 != 0) {
                                        f2 = TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) != 0) {
                                        i10 = i9 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i10 = (-3670017) & i10;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    }
                                    if (i8 != 0) {
                                        modifier4 = companion;
                                        topAppBarScrollBehavior3 = null;
                                    } else {
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        modifier4 = companion;
                                    }
                                    i11 = i10;
                                }
                                WindowInsets windowInsets4 = windowInsets2;
                                TopAppBarColors topAppBarColors4 = topAppBarColors2;
                                Function3 function34 = function32;
                                float f4 = f2;
                                Function2 function25 = function23;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-302230691, i11, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:309)");
                                }
                                composer2 = startRestartGroup;
                                m2513CenterAlignedTopAppBargNPyAyM(function2, modifier4, function25, function34, f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, TopAppBarDefaults.INSTANCE.getContentPadding(), composer2, (i11 & 14) | 100663296 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                function24 = function25;
                                function33 = function34;
                                f3 = f4;
                                windowInsets3 = windowInsets4;
                                topAppBarColors3 = topAppBarColors4;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                function24 = function23;
                                function33 = function32;
                                f3 = f2;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda30
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit CenterAlignedTopAppBar_GHTll3U$lambda$0;
                                        CenterAlignedTopAppBar_GHTll3U$lambda$0 = AppBarKt.CenterAlignedTopAppBar_GHTll3U$lambda$0(Function2.this, modifier3, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return CenterAlignedTopAppBar_GHTll3U$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        i9 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: CenterAlignedTopAppBar-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2513CenterAlignedTopAppBargNPyAyM(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f3;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        PaddingValues paddingValues3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        int i13;
        float f4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1109867978);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenterAlignedTopAppBar)N(title,modifier,navigationIcon,actions,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior,contentPadding)373@19253L5,370@19128L721:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i15 = 131072;
                                    i3 |= i15;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i15 = 65536;
                            i3 |= i15;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i14 = 1048576;
                                    i3 |= i14;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i14 = 524288;
                            i3 |= i14;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "365@18916L12,366@18978L17");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i16 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function23 = ComposableSingletons$AppBarKt.INSTANCE.m2817getLambda$684072357$material3();
                                        }
                                        if (i5 != 0) {
                                            function32 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$2136598717$material3();
                                        }
                                        if (i6 != 0) {
                                            f2 = TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 32) != 0) {
                                            i12 = i11 & (-458753);
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                        } else {
                                            i12 = i11;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i12 &= -3670017;
                                            topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                        }
                                        int i17 = i12;
                                        TopAppBarScrollBehavior topAppBarScrollBehavior4 = i8 != 0 ? null : topAppBarScrollBehavior;
                                        if (i10 != 0) {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                            paddingValues3 = TopAppBarDefaults.INSTANCE.getContentPadding();
                                        } else {
                                            paddingValues3 = paddingValues;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                        }
                                        function25 = function23;
                                        function34 = function32;
                                        windowInsets4 = windowInsets2;
                                        topAppBarColors4 = topAppBarColors2;
                                        i13 = i17;
                                        f4 = f2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i18 = (i2 & 32) != 0 ? i11 & (-458753) : i11;
                                        if ((i2 & 64) != 0) {
                                            i18 &= -3670017;
                                        }
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        paddingValues3 = paddingValues;
                                        i13 = i18;
                                        function25 = function23;
                                        function34 = function32;
                                        f4 = f2;
                                        windowInsets4 = windowInsets2;
                                        topAppBarColors4 = topAppBarColors2;
                                    }
                                    Modifier modifier4 = modifier2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1109867978, i13, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:370)");
                                    }
                                    int i19 = i13 << 3;
                                    int i20 = i13 << 12;
                                    composer2 = startRestartGroup;
                                    m2519SingleRowTopAppBarTCVpFMg(modifier4, function2, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), null, TextStyle.INSTANCE.getDefault(), Alignment.INSTANCE.getCenterHorizontally(), function25, function34, (Dp.m9737equalsimpl0(f4, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f4, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM() : f4, paddingValues3, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i13 >> 3) & 14) | 224256 | (i19 & 112) | (3670016 & i20) | (i20 & 29360128) | (i19 & 1879048192), (i13 >> 15) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f3 = f4;
                                    modifier3 = modifier4;
                                    function24 = function25;
                                    function33 = function34;
                                    paddingValues2 = paddingValues3;
                                    windowInsets3 = windowInsets4;
                                    topAppBarColors3 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    paddingValues2 = paddingValues;
                                    modifier3 = modifier2;
                                    function24 = function23;
                                    function33 = function32;
                                    f3 = f2;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit CenterAlignedTopAppBar_gNPyAyM$lambda$0;
                                            CenterAlignedTopAppBar_gNPyAyM$lambda$0 = AppBarKt.CenterAlignedTopAppBar_gNPyAyM$lambda$0(Function2.this, modifier3, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, paddingValues2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return CenterAlignedTopAppBar_gNPyAyM$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
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
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: TopAppBar-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2520TopAppBar121YqSk(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Alignment.Horizontal horizontal, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Alignment.Horizontal horizontal2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final float f2;
        final TopAppBarColors topAppBarColors2;
        final PaddingValues paddingValues2;
        final Alignment.Horizontal horizontal3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m4577getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        Alignment.Horizontal horizontal4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1223331610);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(title,subtitle,modifier,navigationIcon,actions,titleHorizontalAlignment,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior,contentPadding)446@23087L5,448@23182L5,443@22962L740:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function24 = function22;
            i4 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
        } else {
            function24 = function22;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                function25 = function23;
                i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                            i15 = 8388608;
                            i4 |= i15;
                        }
                        i15 = 4194304;
                        i4 |= i15;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(topAppBarColors)) {
                            i14 = 67108864;
                            i4 |= i14;
                        }
                        i14 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i14;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i12 = i11;
                            i13 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "438@22750L12,439@22812L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                m4577getTopAppBarExpandedHeightD9Ej5fM = f;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                paddingValues3 = paddingValues;
                                horizontal4 = horizontal2;
                                modifier4 = modifier2;
                                function27 = function25;
                                function34 = function32;
                            } else {
                                Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                Function2<? super Composer, ? super Integer, Unit> m2808getLambda$1609649717$material3 = i5 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2808getLambda$1609649717$material3() : function25;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> lambda$968008621$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.getLambda$968008621$material3() : function32;
                                if (i7 != 0) {
                                    horizontal2 = Alignment.INSTANCE.getStart();
                                }
                                m4577getTopAppBarExpandedHeightD9Ej5fM = i8 != 0 ? TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM() : f;
                                if ((i3 & 128) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if ((i3 & 256) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                TopAppBarScrollBehavior topAppBarScrollBehavior4 = i10 != 0 ? null : topAppBarScrollBehavior;
                                if (i12 != 0) {
                                    horizontal4 = horizontal2;
                                    function27 = m2808getLambda$1609649717$material3;
                                    function34 = lambda$968008621$material3;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors4 = topAppBarColors3;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                    paddingValues3 = TopAppBarDefaults.INSTANCE.getContentPadding();
                                    modifier4 = companion;
                                } else {
                                    paddingValues3 = paddingValues;
                                    modifier4 = companion;
                                    horizontal4 = horizontal2;
                                    function27 = m2808getLambda$1609649717$material3;
                                    function34 = lambda$968008621$material3;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors4 = topAppBarColors3;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1223331610, i4, i13, "androidx.compose.material3.TopAppBar (AppBar.kt:443)");
                            }
                            int i17 = i4 << 9;
                            composer2 = startRestartGroup;
                            m2519SingleRowTopAppBarTCVpFMg(modifier4, function2, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), function24, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6), horizontal4, function27, function34, (Dp.m9737equalsimpl0(m4577getTopAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(m4577getTopAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4577getTopAppBarExpandedHeightD9Ej5fM() : m4577getTopAppBarExpandedHeightD9Ej5fM, paddingValues3, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i4 >> 6) & 14) | ((i4 << 3) & 112) | ((i4 << 6) & 7168) | (458752 & i4) | (3670016 & i17) | (i17 & 29360128) | ((i13 << 27) & 1879048192), (i4 >> 21) & 1022, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f2 = m4577getTopAppBarExpandedHeightD9Ej5fM;
                            modifier3 = modifier4;
                            horizontal3 = horizontal4;
                            function26 = function27;
                            function33 = function34;
                            paddingValues2 = paddingValues3;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            f2 = f;
                            topAppBarColors2 = topAppBarColors;
                            paddingValues2 = paddingValues;
                            horizontal3 = horizontal2;
                            modifier3 = modifier2;
                            function26 = function25;
                            function33 = function32;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda40
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TopAppBar_121YqSk$lambda$0;
                                    TopAppBar_121YqSk$lambda$0 = AppBarKt.TopAppBar_121YqSk$lambda$0(Function2.this, function22, modifier3, function26, function33, horizontal3, f2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, paddingValues2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return TopAppBar_121YqSk$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function25 = function23;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function25 = function23;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2518MediumTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f5;
        final float f6;
        final TopAppBarColors topAppBarColors2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        int i11;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        float f7;
        Modifier modifier4;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1378129383);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumTopAppBar)N(title,modifier,navigationIcon,actions,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)522@27343L5,523@27408L5,519@27219L1142:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i13 = 8388608;
                                    i3 |= i13;
                                }
                                i13 = 4194304;
                                i3 |= i13;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                i10 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "515@27077L12,516@27139L17");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function23 = ComposableSingletons$AppBarKt.INSTANCE.m2813getLambda$229000834$material3();
                                        }
                                        if (i5 != 0) {
                                            function32 = ComposableSingletons$AppBarKt.INSTANCE.m2806getLambda$1276513184$material3();
                                        }
                                        if (i6 != 0) {
                                            f3 = TopAppBarDefaults.INSTANCE.m4573getMediumAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            f4 = TopAppBarDefaults.INSTANCE.m4574getMediumAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) != 0) {
                                            windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                            i11 = i10 & (-3670017);
                                        } else {
                                            windowInsets3 = windowInsets;
                                            i11 = i10;
                                        }
                                        if ((i2 & 128) != 0) {
                                            topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                            i11 &= -29360129;
                                        } else {
                                            topAppBarColors3 = topAppBarColors;
                                        }
                                        if (i9 != 0) {
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            function25 = function23;
                                            topAppBarScrollBehavior3 = null;
                                        } else {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            function25 = function23;
                                        }
                                        function34 = function32;
                                        f7 = f3;
                                        modifier4 = modifier2;
                                        i12 = i11;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i15 = (i2 & 64) != 0 ? i10 & (-3670017) : i10;
                                        if ((i2 & 128) != 0) {
                                            i15 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i12 = i15;
                                        f7 = f3;
                                        modifier4 = modifier5;
                                        windowInsets4 = windowInsets;
                                        topAppBarColors4 = topAppBarColors;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        function25 = function23;
                                        function34 = function32;
                                    }
                                    float f8 = f4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1378129383, i12, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:519)");
                                    }
                                    int i16 = i12 >> 3;
                                    composer2 = startRestartGroup;
                                    m2525TwoRowsTopAppBarpJA5dT0(modifier4, function2, TypographyKt.getValue(AppBarMediumTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), MediumTitleBottomPadding, function2, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), null, TextStyle.INSTANCE.getDefault(), null, TextStyle.INSTANCE.getDefault(), Alignment.INSTANCE.getStart(), function25, function34, (Dp.m9737equalsimpl0(f7, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f7, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4573getMediumAppBarCollapsedHeightD9Ej5fM() : f7, (Dp.m9737equalsimpl0(f8, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f8, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4574getMediumAppBarExpandedHeightD9Ej5fM() : f8, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, (i16 & 14) | 920128512 | ((i12 << 3) & 112) | ((i12 << 12) & 57344), 6 | (i16 & 112) | (i16 & 896) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f5 = f7;
                                    f6 = f8;
                                    modifier3 = modifier4;
                                    function24 = function25;
                                    function33 = function34;
                                    windowInsets2 = windowInsets4;
                                    topAppBarColors2 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    windowInsets2 = windowInsets;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function24 = function23;
                                    function33 = function32;
                                    f5 = f3;
                                    f6 = f4;
                                    topAppBarColors2 = topAppBarColors;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda17
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit MediumTopAppBar_oKE7A98$lambda$0;
                                            MediumTopAppBar_oKE7A98$lambda$0 = AppBarKt.MediumTopAppBar_oKE7A98$lambda$0(Function2.this, modifier3, function24, function33, f5, f6, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return MediumTopAppBar_oKE7A98$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 = i8;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* renamed from: MediumFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2517MediumFlexibleTopAppBareXZ4JBQ(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Alignment.Horizontal horizontal2;
        final TopAppBarColors topAppBarColors2;
        final float f4;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f5;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m4573getMediumAppBarCollapsedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Modifier modifier4;
        float m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
        float f6;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1895470263);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumFlexibleTopAppBar)N(title,modifier,subtitle,navigationIcon,actions,titleHorizontalAlignment,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)622@32715L5,623@32780L5,627@32973L5,629@33084L5,619@32583L1421:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function22;
                i4 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function23;
                    i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function32 = function3;
                        i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                f3 = f2;
                                if (startRestartGroup.changed(f3)) {
                                    i15 = 8388608;
                                    i4 |= i15;
                                }
                            } else {
                                f3 = f2;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        } else {
                            f3 = f2;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = 67108864;
                                i4 |= i14;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & 512) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i13 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i13;
                            }
                            i13 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i13;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "615@32441L12,616@32503L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                function28 = function25;
                                function34 = function32;
                                m4573getMediumAppBarCollapsedHeightD9Ej5fM = f;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    function24 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> m2810getLambda$185842620$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2810getLambda$185842620$material3() : function25;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> lambda$1113419554$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.getLambda$1113419554$material3() : function32;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.INSTANCE.getStart() : horizontal;
                                m4573getMediumAppBarCollapsedHeightD9Ej5fM = i9 != 0 ? TopAppBarDefaults.INSTANCE.m4573getMediumAppBarCollapsedHeightD9Ej5fM() : f;
                                if ((i3 & 128) != 0) {
                                    if (function24 != null) {
                                        f3 = TopAppBarDefaults.INSTANCE.m4575getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM();
                                    } else {
                                        f3 = TopAppBarDefaults.INSTANCE.m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                    }
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if ((i3 & 512) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i4 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                topAppBarScrollBehavior3 = i11 != 0 ? null : topAppBarScrollBehavior;
                                function28 = m2810getLambda$185842620$material3;
                                function34 = lambda$1113419554$material3;
                                horizontal3 = start;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                modifier4 = companion;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1895470263, i4, i12, "androidx.compose.material3.MediumFlexibleTopAppBar (AppBar.kt:619)");
                            }
                            TextStyle value = TypographyKt.getValue(AppBarMediumFlexibleTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            TextStyle value2 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            float f7 = MediumTitleBottomPadding;
                            Function2<? super Composer, ? super Integer, Unit> m2819getLambda$790317886$material3 = function24 == null ? ComposableSingletons$AppBarKt.INSTANCE.m2819getLambda$790317886$material3() : function24;
                            TextStyle value3 = TypographyKt.getValue(AppBarMediumFlexibleTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            Function2<? super Composer, ? super Integer, Unit> m2811getLambda$1926007989$material3 = function24 == null ? ComposableSingletons$AppBarKt.INSTANCE.m2811getLambda$1926007989$material3() : function24;
                            TextStyle value4 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            float m4573getMediumAppBarCollapsedHeightD9Ej5fM2 = (Dp.m9737equalsimpl0(m4573getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(m4573getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4573getMediumAppBarCollapsedHeightD9Ej5fM() : m4573getMediumAppBarCollapsedHeightD9Ej5fM;
                            if (Dp.m9737equalsimpl0(f3, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f3, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) {
                                if (function24 != null) {
                                    m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4575getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM();
                                } else {
                                    m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                }
                                f6 = m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
                            } else {
                                f6 = f3;
                            }
                            int i17 = i4 >> 6;
                            int i18 = ((i4 >> 15) & 14) | (i17 & 112) | (i17 & 896);
                            int i19 = i4 >> 9;
                            composer2 = startRestartGroup;
                            m2525TwoRowsTopAppBarpJA5dT0(modifier4, function2, value, f7, function2, value2, m2819getLambda$790317886$material3, value3, m2811getLambda$1926007989$material3, value4, horizontal3, function28, function34, m4573getMediumAppBarCollapsedHeightD9Ej5fM2, f6, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112) | ((i4 << 12) & 57344), i18 | (458752 & i19) | (i19 & 3670016) | ((i12 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = f3;
                            function26 = function24;
                            f5 = m4573getMediumAppBarCollapsedHeightD9Ej5fM;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            function27 = function28;
                            function33 = function34;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            topAppBarColors2 = topAppBarColors;
                            f4 = f3;
                            modifier3 = modifier2;
                            function26 = function24;
                            function27 = function25;
                            function33 = function32;
                            f5 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0;
                                    MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0 = AppBarKt.MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0(Function2.this, modifier3, function26, function27, function33, horizontal2, f5, f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function32 = function3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function32 = function3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function25 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function32 = function3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function24 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function25 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function32 = function3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2516LargeTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f5;
        final float f6;
        final TopAppBarColors topAppBarColors2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        int i11;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        float f7;
        Modifier modifier4;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1406602045);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeTopAppBar)N(title,modifier,navigationIcon,actions,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)711@37602L5,712@37667L5,709@37508L1138:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i13 = 8388608;
                                    i3 |= i13;
                                }
                                i13 = 4194304;
                                i3 |= i13;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                i10 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "705@37366L12,706@37428L17");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function23 = ComposableSingletons$AppBarKt.INSTANCE.m2804getLambda$1230986050$material3();
                                        }
                                        if (i5 != 0) {
                                            function32 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1921811868$material3();
                                        }
                                        if (i6 != 0) {
                                            f3 = TopAppBarDefaults.INSTANCE.m4569getLargeAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            f4 = TopAppBarDefaults.INSTANCE.m4570getLargeAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) != 0) {
                                            windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                            i11 = i10 & (-3670017);
                                        } else {
                                            windowInsets3 = windowInsets;
                                            i11 = i10;
                                        }
                                        if ((i2 & 128) != 0) {
                                            topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                            i11 &= -29360129;
                                        } else {
                                            topAppBarColors3 = topAppBarColors;
                                        }
                                        if (i9 != 0) {
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            function25 = function23;
                                            topAppBarScrollBehavior3 = null;
                                        } else {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            function25 = function23;
                                        }
                                        function34 = function32;
                                        f7 = f3;
                                        modifier4 = modifier2;
                                        i12 = i11;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i15 = (i2 & 64) != 0 ? i10 & (-3670017) : i10;
                                        if ((i2 & 128) != 0) {
                                            i15 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i12 = i15;
                                        f7 = f3;
                                        modifier4 = modifier5;
                                        windowInsets4 = windowInsets;
                                        topAppBarColors4 = topAppBarColors;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        function25 = function23;
                                        function34 = function32;
                                    }
                                    float f8 = f4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1406602045, i12, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:709)");
                                    }
                                    int i16 = i12 >> 3;
                                    composer2 = startRestartGroup;
                                    m2525TwoRowsTopAppBarpJA5dT0(modifier4, function2, TypographyKt.getValue(AppBarLargeTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), LargeTitleBottomPadding, function2, TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6), null, TextStyle.INSTANCE.getDefault(), null, TextStyle.INSTANCE.getDefault(), Alignment.INSTANCE.getStart(), function25, function34, (Dp.m9737equalsimpl0(f7, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f7, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4569getLargeAppBarCollapsedHeightD9Ej5fM() : f7, (Dp.m9737equalsimpl0(f8, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f8, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4570getLargeAppBarExpandedHeightD9Ej5fM() : f8, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, (i16 & 14) | 920128512 | ((i12 << 3) & 112) | ((i12 << 12) & 57344), 6 | (i16 & 112) | (i16 & 896) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f5 = f7;
                                    f6 = f8;
                                    modifier3 = modifier4;
                                    function24 = function25;
                                    function33 = function34;
                                    windowInsets2 = windowInsets4;
                                    topAppBarColors2 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    windowInsets2 = windowInsets;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function24 = function23;
                                    function33 = function32;
                                    f5 = f3;
                                    f6 = f4;
                                    topAppBarColors2 = topAppBarColors;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda22
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit LargeTopAppBar_oKE7A98$lambda$0;
                                            LargeTopAppBar_oKE7A98$lambda$0 = AppBarKt.LargeTopAppBar_oKE7A98$lambda$0(Function2.this, modifier3, function24, function33, f5, f6, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return LargeTopAppBar_oKE7A98$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 = i8;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* renamed from: LargeFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2515LargeFlexibleTopAppBareXZ4JBQ(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Alignment.Horizontal horizontal2;
        final TopAppBarColors topAppBarColors2;
        final float f4;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f5;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m4569getLargeAppBarCollapsedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Modifier modifier4;
        float m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
        float f6;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1104319839);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeFlexibleTopAppBar)N(title,modifier,subtitle,navigationIcon,actions,titleHorizontalAlignment,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)811@42959L5,812@43024L5,817@43244L5,819@43355L5,809@42857L1415:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function22;
                i4 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function23;
                    i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function32 = function3;
                        i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                f3 = f2;
                                if (startRestartGroup.changed(f3)) {
                                    i15 = 8388608;
                                    i4 |= i15;
                                }
                            } else {
                                f3 = f2;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        } else {
                            f3 = f2;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = 67108864;
                                i4 |= i14;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & 512) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i13 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i13;
                            }
                            i13 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i13;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "805@42715L12,806@42777L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                function28 = function25;
                                function34 = function32;
                                m4569getLargeAppBarCollapsedHeightD9Ej5fM = f;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    function24 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> m2818getLambda$780193532$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2818getLambda$780193532$material3() : function25;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> m2809getLambda$1846660506$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2809getLambda$1846660506$material3() : function32;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.INSTANCE.getStart() : horizontal;
                                m4569getLargeAppBarCollapsedHeightD9Ej5fM = i9 != 0 ? TopAppBarDefaults.INSTANCE.m4569getLargeAppBarCollapsedHeightD9Ej5fM() : f;
                                if ((i3 & 128) != 0) {
                                    if (function24 != null) {
                                        f3 = TopAppBarDefaults.INSTANCE.m4571getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM();
                                    } else {
                                        f3 = TopAppBarDefaults.INSTANCE.m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                    }
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if ((i3 & 512) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i4 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                topAppBarScrollBehavior3 = i11 != 0 ? null : topAppBarScrollBehavior;
                                function28 = m2818getLambda$780193532$material3;
                                function34 = m2809getLambda$1846660506$material3;
                                horizontal3 = start;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                modifier4 = companion;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1104319839, i4, i12, "androidx.compose.material3.LargeFlexibleTopAppBar (AppBar.kt:809)");
                            }
                            TextStyle value = TypographyKt.getValue(AppBarLargeFlexibleTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            TextStyle value2 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            float f7 = LargeTitleBottomPadding;
                            Function2<? super Composer, ? super Integer, Unit> m2816getLambda$661145402$material3 = function24 == null ? ComposableSingletons$AppBarKt.INSTANCE.m2816getLambda$661145402$material3() : function24;
                            TextStyle value3 = TypographyKt.getValue(AppBarLargeFlexibleTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            Function2<? super Composer, ? super Integer, Unit> m2803getLambda$1113422563$material3 = function24 == null ? ComposableSingletons$AppBarKt.INSTANCE.m2803getLambda$1113422563$material3() : function24;
                            TextStyle value4 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            float m4569getLargeAppBarCollapsedHeightD9Ej5fM2 = (Dp.m9737equalsimpl0(m4569getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(m4569getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4569getLargeAppBarCollapsedHeightD9Ej5fM() : m4569getLargeAppBarCollapsedHeightD9Ej5fM;
                            if (Dp.m9737equalsimpl0(f3, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(f3, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) {
                                if (function24 != null) {
                                    m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4571getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM();
                                } else {
                                    m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                }
                                f6 = m4572getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
                            } else {
                                f6 = f3;
                            }
                            int i17 = i4 >> 6;
                            int i18 = ((i4 >> 15) & 14) | (i17 & 112) | (i17 & 896);
                            int i19 = i4 >> 9;
                            composer2 = startRestartGroup;
                            m2525TwoRowsTopAppBarpJA5dT0(modifier4, function2, value, f7, function2, value2, m2816getLambda$661145402$material3, value3, m2803getLambda$1113422563$material3, value4, horizontal3, function28, function34, m4569getLargeAppBarCollapsedHeightD9Ej5fM2, f6, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112) | ((i4 << 12) & 57344), i18 | (458752 & i19) | (i19 & 3670016) | ((i12 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = f3;
                            function26 = function24;
                            f5 = m4569getLargeAppBarCollapsedHeightD9Ej5fM;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            function27 = function28;
                            function33 = function34;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            topAppBarColors2 = topAppBarColors;
                            f4 = f3;
                            modifier3 = modifier2;
                            function26 = function24;
                            function27 = function25;
                            function33 = function32;
                            f5 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0;
                                    LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0 = AppBarKt.LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0(Function2.this, modifier3, function26, function27, function33, horizontal2, f5, f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function32 = function3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function32 = function3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function25 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function32 = function3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function24 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function25 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function32 = function3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: TwoRowsTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2524TwoRowsTopAppBareXZ4JBQ(final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function34;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i7;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function35;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Alignment.Horizontal horizontal2;
        final float f3;
        final TopAppBarColors topAppBarColors2;
        final Modifier modifier3;
        final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function36;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function37;
        final float f4;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m9752getUnspecifiedD9Ej5fM;
        float m9752getUnspecifiedD9Ej5fM2;
        WindowInsets windowInsets3;
        int i15;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        TopAppBarColors topAppBarColors4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function38;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        Modifier modifier4;
        int i16;
        float m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
        float f5;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1672878784);
        ComposerKt.sourceInformation(startRestartGroup, "C(TwoRowsTopAppBar)N(title,modifier,subtitle,navigationIcon,actions,titleHorizontalAlignment,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)918@49085L5,919@49150L5,924@49375L5,926@49499L5,917@49006L15,921@49213L16,923@49279L26,925@49406L27,916@48972L1578:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function34 = function32;
                i4 |= startRestartGroup.changedInstance(function34) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function22 = function2;
                    i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function35 = function33;
                        i4 |= startRestartGroup.changedInstance(function35) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i18 = 67108864;
                                i4 |= i18;
                            }
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & 512) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i17 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i17;
                            }
                            i17 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i17;
                        }
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i12 = i11;
                            i13 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        i14 = i4;
                        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "912@48830L12,913@48892L17");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i16 = (i3 & 256) != 0 ? i14 & (-234881025) : i14;
                                if ((i3 & 512) != 0) {
                                    i16 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                m9752getUnspecifiedD9Ej5fM2 = f2;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                function24 = function22;
                                function38 = function35;
                                m9752getUnspecifiedD9Ej5fM = f;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    function34 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> lambda$1767216677$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.getLambda$1767216677$material3() : function22;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> m2814getLambda$470693625$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2814getLambda$470693625$material3() : function35;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.INSTANCE.getStart() : horizontal;
                                m9752getUnspecifiedD9Ej5fM = i9 != 0 ? Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM() : f;
                                m9752getUnspecifiedD9Ej5fM2 = i10 != 0 ? Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM() : f2;
                                if ((i3 & 256) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i15 = i14 & (-234881025);
                                } else {
                                    windowInsets3 = windowInsets;
                                    i15 = i14;
                                }
                                if ((i3 & 512) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i15 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                if (i12 != 0) {
                                    topAppBarColors4 = topAppBarColors3;
                                    function24 = lambda$1767216677$material3;
                                    function38 = m2814getLambda$470693625$material3;
                                    horizontal3 = start;
                                    windowInsets4 = windowInsets3;
                                    topAppBarScrollBehavior3 = null;
                                } else {
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    topAppBarColors4 = topAppBarColors3;
                                    function24 = lambda$1767216677$material3;
                                    function38 = m2814getLambda$470693625$material3;
                                    horizontal3 = start;
                                    windowInsets4 = windowInsets3;
                                }
                                modifier4 = companion;
                                i16 = i15;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1672878784, i16, i13, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:915)");
                            }
                            TextStyle value = TypographyKt.getValue(AppBarMediumFlexibleTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            TextStyle value2 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                            float m9732constructorimpl = Dp.m9732constructorimpl(0);
                            TextStyle value3 = TypographyKt.getValue(AppBarMediumFlexibleTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            TextStyle value4 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getSubtitleFont(), startRestartGroup, 6);
                            float m4573getMediumAppBarCollapsedHeightD9Ej5fM = (Dp.m9737equalsimpl0(m9752getUnspecifiedD9Ej5fM, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(m9752getUnspecifiedD9Ej5fM, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m4573getMediumAppBarCollapsedHeightD9Ej5fM() : m9752getUnspecifiedD9Ej5fM;
                            if (Dp.m9737equalsimpl0(m9752getUnspecifiedD9Ej5fM2, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) || Dp.m9737equalsimpl0(m9752getUnspecifiedD9Ej5fM2, Dp.INSTANCE.m9751getInfinityD9Ej5fM())) {
                                if (function34 != null) {
                                    m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4575getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM();
                                } else {
                                    m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                }
                                f5 = m4576getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM;
                            } else {
                                f5 = m9752getUnspecifiedD9Ej5fM2;
                            }
                            int i20 = ((i16 >> 3) & 14) | 102263856;
                            int i21 = i16 >> 6;
                            int i22 = ((i16 >> 15) & 14) | (i21 & 112) | (i21 & 896);
                            int i23 = i16 >> 9;
                            composer2 = startRestartGroup;
                            m2525TwoRowsTopAppBarpJA5dT0(modifier4, ComposableLambdaKt.rememberComposableLambda(-1674885936, true, new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$0;
                                    TwoRowsTopAppBar_eXZ4JBQ$lambda$0 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return TwoRowsTopAppBar_eXZ4JBQ$lambda$0;
                                }
                            }, startRestartGroup, 54), value, m9732constructorimpl, ComposableLambdaKt.rememberComposableLambda(1295408045, true, new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$1;
                                    TwoRowsTopAppBar_eXZ4JBQ$lambda$1 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$1(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return TwoRowsTopAppBar_eXZ4JBQ$lambda$1;
                                }
                            }, startRestartGroup, 54), value2, ComposableLambdaKt.rememberComposableLambda(1843948267, true, new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$2;
                                    TwoRowsTopAppBar_eXZ4JBQ$lambda$2 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$2(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return TwoRowsTopAppBar_eXZ4JBQ$lambda$2;
                                }
                            }, startRestartGroup, 54), value3, ComposableLambdaKt.rememberComposableLambda(-1902478807, true, new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$3;
                                    TwoRowsTopAppBar_eXZ4JBQ$lambda$3 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$3(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return TwoRowsTopAppBar_eXZ4JBQ$lambda$3;
                                }
                            }, startRestartGroup, 54), value4, horizontal3, function24, function38, m4573getMediumAppBarCollapsedHeightD9Ej5fM, f5, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, i20, (i23 & 3670016) | i22 | (458752 & i23) | ((i13 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function36 = function34;
                            f4 = m9752getUnspecifiedD9Ej5fM;
                            f3 = m9752getUnspecifiedD9Ej5fM2;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            function23 = function24;
                            function37 = function38;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            f3 = f2;
                            topAppBarColors2 = topAppBarColors;
                            modifier3 = modifier2;
                            function36 = function34;
                            function23 = function22;
                            function37 = function35;
                            f4 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$4;
                                    TwoRowsTopAppBar_eXZ4JBQ$lambda$4 = AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$4(Function3.this, modifier3, function36, function23, function37, horizontal2, f4, f3, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return TwoRowsTopAppBar_eXZ4JBQ$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function35 = function33;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function22 = function2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function35 = function33;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                i14 = i4;
                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function34 = function32;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function22 = function2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function35 = function33;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i14 = i4;
            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function34 = function32;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function22 = function2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function35 = function33;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i14 = i4;
        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C917@49008L11:AppBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1674885936, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:917)");
            }
            function3.invoke(true, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$1(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C921@49215L12:AppBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295408045, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:921)");
            }
            function3.invoke(false, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$2(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:AppBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1843948267, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:923)");
            }
            if (function3 == null) {
                composer.startReplaceGroup(431118634);
            } else {
                composer.startReplaceGroup(-1787208265);
                ComposerKt.sourceInformation(composer, "923@49291L12");
                function3.invoke(true, composer, 6);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TwoRowsTopAppBar_eXZ4JBQ$lambda$3(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:AppBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902478807, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:925)");
            }
            if (function3 == null) {
                composer.startReplaceGroup(-357689013);
            } else {
                composer.startReplaceGroup(1373934966);
                ComposerKt.sourceInformation(composer, "925@49418L13");
                function3.invoke(false, composer, 6);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2508BottomAppBarSnr_uVM(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues2;
        final WindowInsets windowInsets2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2144093983);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(actions,modifier,floatingActionButton,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,contentPadding,windowInsets)997@52812L356:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        j4 = j2;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                            i7 = 8388608;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "991@52522L14,992@52564L31,995@52790L12");
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
                            paddingValues3 = paddingValues;
                            windowInsets3 = windowInsets;
                        } else {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if ((i2 & 8) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m2547getContainerElevationD9Ej5fM();
                            }
                            PaddingValues contentPadding = i6 != 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                                paddingValues3 = contentPadding;
                                modifier4 = modifier2;
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                long j7 = j3;
                                long j8 = j4;
                                float f4 = f2;
                                Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2144093983, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:997)");
                                }
                                composer2 = startRestartGroup;
                                m2510BottomAppBarqhFBPw4(function3, modifier4, function24, j7, j8, f4, paddingValues3, windowInsets3, null, composer2, (i3 & 14) | 100663296 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                function23 = function24;
                                j5 = j7;
                                j6 = j8;
                                f3 = f4;
                                paddingValues2 = paddingValues3;
                                windowInsets2 = windowInsets3;
                            } else {
                                windowInsets3 = windowInsets;
                                paddingValues3 = contentPadding;
                            }
                        }
                        modifier4 = modifier2;
                        long j72 = j3;
                        long j82 = j4;
                        float f42 = f2;
                        Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        m2510BottomAppBarqhFBPw4(function3, modifier4, function242, j72, j82, f42, paddingValues3, windowInsets3, null, composer2, (i3 & 14) | 100663296 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        function23 = function242;
                        j5 = j72;
                        j6 = j82;
                        f3 = f42;
                        paddingValues2 = paddingValues3;
                        windowInsets2 = windowInsets3;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        function23 = function22;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues2 = paddingValues;
                        windowInsets2 = windowInsets;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BottomAppBar_Snr_uVM$lambda$0;
                                BottomAppBar_Snr_uVM$lambda$0 = AppBarKt.BottomAppBar_Snr_uVM$lambda$0(Function3.this, modifier3, function23, j5, j6, f3, paddingValues2, windowInsets2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BottomAppBar_Snr_uVM$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2510BottomAppBarqhFBPw4(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues2;
        final WindowInsets windowInsets2;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        float f4;
        PaddingValues paddingValues3;
        WindowInsets windowInsets4;
        int i9;
        Modifier modifier3;
        long j7;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(272234465);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(actions,modifier,floatingActionButton,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,contentPadding,windowInsets,scrollBehavior)1071@56487L540,1063@56200L827:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i13 = 2048;
                            i3 |= i13;
                        }
                    } else {
                        j3 = j;
                    }
                    i13 = 1024;
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        j4 = j2;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "1056@55854L14,1057@55896L31,1060@56122L12");
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
                                modifier3 = modifier;
                                paddingValues3 = paddingValues;
                                windowInsets4 = windowInsets;
                                bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                                f4 = f2;
                                i10 = 12582912;
                                i9 = 272234465;
                                j7 = j3;
                            } else {
                                Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    function22 = null;
                                }
                                if ((i2 & 8) != 0) {
                                    j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                    i3 &= -57345;
                                }
                                float m2547getContainerElevationD9Ej5fM = i5 != 0 ? BottomAppBarDefaults.INSTANCE.m2547getContainerElevationD9Ej5fM() : f2;
                                PaddingValues contentPadding = i6 != 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if ((i2 & 128) != 0) {
                                    windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                bottomAppBarScrollBehavior3 = i8 == 0 ? bottomAppBarScrollBehavior : null;
                                f4 = m2547getContainerElevationD9Ej5fM;
                                paddingValues3 = contentPadding;
                                windowInsets4 = windowInsets3;
                                i9 = 272234465;
                                modifier3 = companion;
                                j7 = j3;
                                i10 = 12582912;
                            }
                            long j8 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1063)");
                            }
                            int i15 = i10 | ((i3 >> 3) & 14);
                            int i16 = i3 >> 6;
                            composer2 = startRestartGroup;
                            m2509BottomAppBare3WI5M(modifier3, j7, j8, f4, paddingValues3, windowInsets4, bottomAppBarScrollBehavior3, ComposableLambdaKt.rememberComposableLambda(-1943077286, true, new Function3() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit BottomAppBar_qhFBPw4$lambda$0;
                                    BottomAppBar_qhFBPw4$lambda$0 = AppBarKt.BottomAppBar_qhFBPw4$lambda$0(Function3.this, function22, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return BottomAppBar_qhFBPw4$lambda$0;
                                }
                            }, startRestartGroup, 54), composer2, i15 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function22;
                            modifier2 = modifier3;
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            paddingValues2 = paddingValues3;
                            windowInsets2 = windowInsets4;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            function23 = function22;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            paddingValues2 = paddingValues;
                            windowInsets2 = windowInsets;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomAppBar_qhFBPw4$lambda$1;
                                    BottomAppBar_qhFBPw4$lambda$1 = AppBarKt.BottomAppBar_qhFBPw4$lambda$1(Function3.this, modifier2, function23, j5, j6, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomAppBar_qhFBPw4$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_qhFBPw4$lambda$0(Function3 function3, Function2 function2, RowScope rowScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C1072@56497L204:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(rowScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1943077286, i2, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:1072)");
            }
            Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, weight$default);
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
            if (function2 != null) {
                composer.startReplaceGroup(1354051795);
                ComposerKt.sourceInformation(composer, "1079@56758L253");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, FABVerticalPadding, FABHorizontalPadding, 0.0f, 9, null);
                Alignment topStart = Alignment.INSTANCE.getTopStart();
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1457541364, "C1084@56975L22:AppBar.kt#uh7d8r");
                function2.invoke(composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1354317992);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0087  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2507BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        float f4;
        PaddingValues paddingValues4;
        WindowInsets windowInsets4;
        Modifier modifier4;
        long j7;
        long j8;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(107726720);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,contentPadding,windowInsets,content)1126@58993L303:AppBar.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1119@58657L14,1120@58699L31,1123@58925L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        f4 = f2;
                        paddingValues4 = paddingValues2;
                        windowInsets4 = windowInsets2;
                        i5 = 107726720;
                        modifier4 = modifier2;
                        j7 = j3;
                        j8 = j4;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i10 != 0) {
                            f2 = BottomAppBarDefaults.INSTANCE.m2547getContainerElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            windowInsets4 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            j8 = j4;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            modifier4 = companion;
                            j7 = j3;
                        } else {
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            windowInsets4 = windowInsets2;
                            modifier4 = companion;
                            j7 = j3;
                            j8 = j4;
                        }
                        i5 = 107726720;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1126)");
                    }
                    composer2 = startRestartGroup;
                    m2509BottomAppBare3WI5M(modifier4, j7, j8, f4, paddingValues4, windowInsets4, null, function3, composer2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    paddingValues3 = paddingValues4;
                    windowInsets3 = windowInsets4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    paddingValues3 = paddingValues2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomAppBar_1oL4kX8$lambda$0;
                            BottomAppBar_1oL4kX8$lambda$0 = AppBarKt.BottomAppBar_1oL4kX8$lambda$0(Modifier.this, j5, j6, f3, paddingValues3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomAppBar_1oL4kX8$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c3  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2509BottomAppBare3WI5M(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        int i5;
        Composer composer2;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1562683362);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,contentPadding,windowInsets,scrollBehavior,content)1180@61799L432:AppBar.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1172@61407L14,1173@61449L31,1176@61675L12");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i10 != 0) {
                            f2 = BottomAppBarDefaults.INSTANCE.m2547getContainerElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        }
                        if (i5 != 0) {
                            bottomAppBarScrollBehavior3 = null;
                            long j7 = j3;
                            long j8 = j4;
                            float f4 = f2;
                            PaddingValues paddingValues4 = paddingValues2;
                            WindowInsets windowInsets4 = windowInsets2;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1562683362, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1179)");
                            }
                            int i11 = i3 << 6;
                            composer2 = startRestartGroup;
                            m2511BottomAppBarLayoutt5fmz9U(BottomAppBarTokens.INSTANCE.m4972getContainerHeightD9Ej5fM(), Arrangement.INSTANCE.getStart(), modifier4, j7, j8, f4, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, function3, composer2, (i11 & 896) | 54 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            paddingValues3 = paddingValues4;
                            windowInsets3 = windowInsets4;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                    long j72 = j3;
                    long j82 = j4;
                    float f42 = f2;
                    PaddingValues paddingValues42 = paddingValues2;
                    WindowInsets windowInsets42 = windowInsets2;
                    Modifier modifier42 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i3 << 6;
                    composer2 = startRestartGroup;
                    m2511BottomAppBarLayoutt5fmz9U(BottomAppBarTokens.INSTANCE.m4972getContainerHeightD9Ej5fM(), Arrangement.INSTANCE.getStart(), modifier42, j72, j82, f42, paddingValues42, windowInsets42, bottomAppBarScrollBehavior3, function3, composer2, (i112 & 896) | 54 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    j5 = j72;
                    j6 = j82;
                    f3 = f42;
                    paddingValues3 = paddingValues42;
                    windowInsets3 = windowInsets42;
                    bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    paddingValues3 = paddingValues2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomAppBar_e_3WI5M$lambda$0;
                            BottomAppBar_e_3WI5M$lambda$0 = AppBarKt.BottomAppBar_e_3WI5M$lambda$0(Modifier.this, j5, j6, f3, paddingValues3, windowInsets3, bottomAppBarScrollBehavior2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomAppBar_e_3WI5M$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: FlexibleBottomAppBar-wBhsO_E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2514FlexibleBottomAppBarwBhsO_E(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        PaddingValues paddingValues2;
        int i4;
        Arrangement.Horizontal horizontal2;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final WindowInsets windowInsets2;
        final long j5;
        final long j6;
        final PaddingValues paddingValues3;
        final Arrangement.Horizontal horizontal3;
        final float f2;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        float m2548getFlexibleBottomAppBarHeightD9Ej5fM;
        WindowInsets windowInsets3;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        long j7;
        long j8;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1717957447);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlexibleBottomAppBar)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,contentPadding,horizontalArrangement,expandedHeight:c#ui.unit.Dp,windowInsets,scrollBehavior,content)1258@66199L646:AppBar.kt#uh7d8r");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                j4 = j2;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                horizontal2 = horizontal;
                i3 |= startRestartGroup.changed(horizontal2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i7 = i6;
                    i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1248@65679L14,1249@65721L31,1254@66075L12");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            m2548getFlexibleBottomAppBarHeightD9Ej5fM = f;
                            windowInsets4 = windowInsets;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                            j7 = j3;
                            j8 = j4;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                        } else {
                            companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            PaddingValues flexibleContentPadding = i11 != 0 ? BottomAppBarDefaults.INSTANCE.getFlexibleContentPadding() : paddingValues2;
                            Arrangement.Horizontal flexibleHorizontalArrangement = i4 != 0 ? BottomAppBarDefaults.INSTANCE.getFlexibleHorizontalArrangement() : horizontal2;
                            m2548getFlexibleBottomAppBarHeightD9Ej5fM = i5 != 0 ? BottomAppBarDefaults.INSTANCE.m2548getFlexibleBottomAppBarHeightD9Ej5fM() : f;
                            if ((i2 & 64) != 0) {
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                windowInsets3 = windowInsets;
                            }
                            if (i7 != 0) {
                                windowInsets4 = windowInsets3;
                                j7 = j3;
                                j8 = j4;
                                paddingValues4 = flexibleContentPadding;
                                horizontal4 = flexibleHorizontalArrangement;
                                bottomAppBarScrollBehavior3 = null;
                            } else {
                                bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                                windowInsets4 = windowInsets3;
                                j7 = j3;
                                j8 = j4;
                                paddingValues4 = flexibleContentPadding;
                                horizontal4 = flexibleHorizontalArrangement;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1717957447, i3, -1, "androidx.compose.material3.FlexibleBottomAppBar (AppBar.kt:1257)");
                        }
                        float m2548getFlexibleBottomAppBarHeightD9Ej5fM2 = ((Float.floatToRawIntBits(m2548getFlexibleBottomAppBarHeightD9Ej5fM) & Integer.MAX_VALUE) >= 2139095040 || Float.isNaN(m2548getFlexibleBottomAppBarHeightD9Ej5fM) || Dp.m9731compareTo0680j_4(m2548getFlexibleBottomAppBarHeightD9Ej5fM, Dp.m9732constructorimpl((float) 0)) <= 0) ? BottomAppBarDefaults.INSTANCE.m2548getFlexibleBottomAppBarHeightD9Ej5fM() : m2548getFlexibleBottomAppBarHeightD9Ej5fM;
                        float m4943getContainerElevationD9Ej5fM = AppBarTokens.INSTANCE.m4943getContainerElevationD9Ej5fM();
                        int i12 = i3 << 6;
                        int i13 = ((i3 >> 9) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (3670016 & (i3 << 9));
                        int i14 = i3 << 3;
                        Modifier modifier3 = companion;
                        composer2 = startRestartGroup;
                        m2511BottomAppBarLayoutt5fmz9U(m2548getFlexibleBottomAppBarHeightD9Ej5fM2, horizontal4, modifier3, j7, j8, m4943getContainerElevationD9Ej5fM, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, function3, composer2, i13 | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = m2548getFlexibleBottomAppBarHeightD9Ej5fM;
                        horizontal3 = horizontal4;
                        modifier2 = modifier3;
                        j5 = j7;
                        j6 = j8;
                        paddingValues3 = paddingValues4;
                        windowInsets2 = windowInsets4;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        windowInsets2 = windowInsets;
                        j5 = j3;
                        j6 = j4;
                        paddingValues3 = paddingValues2;
                        horizontal3 = horizontal2;
                        f2 = f;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FlexibleBottomAppBar_wBhsO_E$lambda$0;
                                FlexibleBottomAppBar_wBhsO_E$lambda$0 = AppBarKt.FlexibleBottomAppBar_wBhsO_E$lambda$0(Modifier.this, j5, j6, paddingValues3, horizontal3, f2, windowInsets2, bottomAppBarScrollBehavior2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FlexibleBottomAppBar_wBhsO_E$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i6;
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            horizontal2 = horizontal;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i6;
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        horizontal2 = horizontal;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i6;
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* renamed from: BottomAppBarLayout-t5fmz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2511BottomAppBarLayoutt5fmz9U(final float f, final Arrangement.Horizontal horizontal, Modifier modifier, final long j, final long j2, final float f2, final PaddingValues paddingValues, final WindowInsets windowInsets, final BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-141162176);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBarLayout)N(containerHeight:c#ui.unit.Dp,horizontalArrangement,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,contentPadding,windowInsets,scrollBehavior,content)1291@67328L33,1323@68812L5,1326@68883L620,1339@69553L350,1318@68545L1358:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(horizontal) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
            } else {
                paddingValues2 = paddingValues;
            }
            if ((i & 12582912) != 0) {
                windowInsets2 = windowInsets;
                i3 |= startRestartGroup.changed(windowInsets2) ? 8388608 : 4194304;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-141162176, i3, -1, "androidx.compose.material3.BottomAppBarLayout (AppBar.kt:1290)");
                }
                final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2 = !BottomAppBarLayout_t5fmz9U$lambda$0(rememberTouchExplorationService(startRestartGroup, 0)) ? bottomAppBarScrollBehavior : null;
                if (bottomAppBarScrollBehavior2 != null && !bottomAppBarScrollBehavior2.getIsPinned()) {
                    startRestartGroup.startReplaceGroup(-588621230);
                    ComposerKt.sourceInformation(startRestartGroup, "1299@67808L105,1299@67785L128,1302@67947L308");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Orientation orientation = Orientation.Vertical;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1782131209, "CC(remember):AppBar.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                    i4 = i3;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BottomAppBarLayout_t5fmz9U$lambda$1$0;
                                BottomAppBarLayout_t5fmz9U$lambda$1$0 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$1$0(BottomAppBarScrollBehavior.this, ((Float) obj).floatValue());
                                return BottomAppBarLayout_t5fmz9U$lambda$1$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue, startRestartGroup, 0);
                    Modifier.Companion companion4 = companion3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1782135860, "CC(remember):AppBar.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                    AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = DraggableKt.draggable$default(companion4, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue2, false, 188, null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i4 = i3;
                    startRestartGroup.startReplaceGroup(-588035454);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1782166124, "CC(remember):AppBar.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function3() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            MeasureResult BottomAppBarLayout_t5fmz9U$lambda$3$0;
                            BottomAppBarLayout_t5fmz9U$lambda$3$0 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$3$0(BottomAppBarScrollBehavior.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                            return BottomAppBarLayout_t5fmz9U$lambda$3$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final WindowInsets windowInsets3 = windowInsets2;
                int i6 = i4 >> 3;
                composer2 = startRestartGroup;
                SurfaceKt.m4112SurfaceT9BRK9s(LayoutModifierKt.layout(companion2, (Function3) rememberedValue3).then(companion), value, j, j2, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1054101083, true, new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BottomAppBarLayout_t5fmz9U$lambda$4;
                        BottomAppBarLayout_t5fmz9U$lambda$4 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$4(WindowInsets.this, f, paddingValues2, horizontal, function3, (Composer) obj, ((Integer) obj2).intValue());
                        return BottomAppBarLayout_t5fmz9U$lambda$4;
                    }
                }, startRestartGroup, 54), composer2, (i6 & 896) | 12582912 | (i6 & 7168) | (i6 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BottomAppBarLayout_t5fmz9U$lambda$5;
                        BottomAppBarLayout_t5fmz9U$lambda$5 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$5(f, horizontal, modifier3, j, j2, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BottomAppBarLayout_t5fmz9U$lambda$5;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBarLayout_t5fmz9U$lambda$1$0(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, float f) {
        BottomAppBarState state = bottomAppBarScrollBehavior.getState();
        state.setHeightOffset(state.getHeightOffset() - f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BottomAppBarLayout_t5fmz9U$lambda$3$0(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        BottomAppBarState state;
        BottomAppBarState state2;
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        if (bottomAppBarScrollBehavior != null && (state2 = bottomAppBarScrollBehavior.getState()) != null) {
            state2.setHeightOffsetLimit(-mo8285measureBRTryo0.getHeight());
        }
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), MathKt.roundToInt(RangesKt.coerceAtLeast(mo8285measureBRTryo0.getHeight() + ((bottomAppBarScrollBehavior == null || (state = bottomAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()), 0.0f)), null, new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomAppBarLayout_t5fmz9U$lambda$3$0$0;
                BottomAppBarLayout_t5fmz9U$lambda$3$0$0 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$3$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return BottomAppBarLayout_t5fmz9U$lambda$3$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBarLayout_t5fmz9U$lambda$3$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBarLayout_t5fmz9U$lambda$4(WindowInsets windowInsets, float f, PaddingValues paddingValues, Arrangement.Horizontal horizontal, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1340@69563L334:AppBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1054101083, i, -1, "androidx.compose.material3.BottomAppBarLayout.<anonymous> (AppBar.kt:1340)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1257height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets), f), paddingValues);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, composer, 48);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberIsScrollingContentAtStart(final LazyListState lazyListState, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -191857171, "C(rememberIsScrollingContentAtStart)N(lazyListState)2067@104822L256:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-191857171, i, -1, "androidx.compose.material3.rememberIsScrollingContentAtStart (AppBar.kt:2067)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 308855021, "CC(remember):AppBar.kt#9igjgp");
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean rememberIsScrollingContentAtStart$lambda$0$0;
                    rememberIsScrollingContentAtStart$lambda$0$0 = AppBarKt.rememberIsScrollingContentAtStart$lambda$0$0(LazyListState.this);
                    return Boolean.valueOf(rememberIsScrollingContentAtStart$lambda$0$0);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        State<Boolean> state = (State) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIsScrollingContentAtStart$lambda$0$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getReverseLayout() ? !lazyListState.getCanScrollForward() : !lazyListState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberIsScrollingContentAtStart(final ScrollState scrollState, final boolean z, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2111817842, "C(rememberIsScrollingContentAtStart)N(scrollState,reverseScrolling)2087@105537L246:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2111817842, i, -1, "androidx.compose.material3.rememberIsScrollingContentAtStart (AppBar.kt:2087)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2062588196, "CC(remember):AppBar.kt#9igjgp");
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(scrollState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean rememberIsScrollingContentAtStart$lambda$1$0;
                    rememberIsScrollingContentAtStart$lambda$1$0 = AppBarKt.rememberIsScrollingContentAtStart$lambda$1$0(z, scrollState);
                    return Boolean.valueOf(rememberIsScrollingContentAtStart$lambda$1$0);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        State<Boolean> state = (State) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIsScrollingContentAtStart$lambda$1$0(boolean z, ScrollState scrollState) {
        return z ? !scrollState.getCanScrollForward() : !scrollState.getCanScrollBackward();
    }

    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1801969826, "C(rememberTopAppBarState)N(initialHeightOffsetLimit,initialHeightOffset,initialContentOffset)2113@106593L99,2113@106546L146:AppBar.kt#uh7d8r");
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
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:2112)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 821190181, "CC(remember):AppBar.kt#9igjgp");
        boolean z = true;
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(f3)) && (i & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    TopAppBarState rememberTopAppBarState$lambda$0$0;
                    rememberTopAppBarState$lambda$0$0 = AppBarKt.rememberTopAppBarState$lambda$0$0(f, f2, f3);
                    return rememberTopAppBarState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState rememberTopAppBarState$lambda$0$0(float f, float f2, float f3) {
        return new TopAppBarState(f, f2, f3);
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420874240, "C(rememberBottomAppBarState)N(initialHeightOffsetLimit,initialHeightOffset,initialContentOffset)2503@122672L102,2503@122622L152:AppBar.kt#uh7d8r");
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
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:2502)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -339447514, "CC(remember):AppBar.kt#9igjgp");
        boolean z = true;
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(f3)) && (i & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BottomAppBarState BottomAppBarState;
                    BottomAppBarState = AppBarKt.BottomAppBarState(f, f2, f3);
                    return BottomAppBarState;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomAppBarState;
    }

    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r23, false, r6, r7, 2, null) == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBarBottom(BottomAppBarState bottomAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$1;
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$12;
        Object coroutine_suspended;
        int i;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float boxFloat;
        Function1 function1;
        Ref.FloatRef floatRef2;
        final BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (continuation instanceof AppBarKt$settleAppBarBottom$1) {
            appBarKt$settleAppBarBottom$1 = (AppBarKt$settleAppBarBottom$1) continuation;
            if ((appBarKt$settleAppBarBottom$1.label & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBarBottom$1.label -= Integer.MIN_VALUE;
                appBarKt$settleAppBarBottom$12 = appBarKt$settleAppBarBottom$1;
                Object obj = appBarKt$settleAppBarBottom$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appBarKt$settleAppBarBottom$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (bottomAppBarState2.getCollapsedFraction() < 0.01f || bottomAppBarState2.getCollapsedFraction() == 1.0f) {
                        return Velocity.m9965boximpl(Velocity.INSTANCE.m9985getZero9UxMQ8M());
                    }
                    floatRef = new Ref.FloatRef();
                    floatRef.element = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        Function1 function12 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit unit;
                                unit = AppBarKt.settleAppBarBottom$lambda$0(Ref.FloatRef.this, bottomAppBarState2, floatRef, (AnimationScope) obj2);
                                return unit;
                            }
                        };
                        appBarKt$settleAppBarBottom$12.L$0 = bottomAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBarBottom$12.L$1 = animationSpec2;
                        appBarKt$settleAppBarBottom$12.L$2 = floatRef;
                        appBarKt$settleAppBarBottom$12.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef2 = (Ref.FloatRef) appBarKt$settleAppBarBottom$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBarBottom$12.L$2;
                    AnimationSpec<Float> animationSpec4 = (AnimationSpec) appBarKt$settleAppBarBottom$12.L$1;
                    BottomAppBarState bottomAppBarState3 = (BottomAppBarState) appBarKt$settleAppBarBottom$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef4;
                    animationSpec2 = animationSpec4;
                    bottomAppBarState2 = bottomAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && bottomAppBarState2.getHeightOffset() < 0.0f && bottomAppBarState2.getHeightOffset() > bottomAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = Boxing.boxFloat(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
                    function1 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit unit;
                            unit = AppBarKt.settleAppBarBottom$lambda$1(BottomAppBarState.this, (AnimationScope) obj2);
                            return unit;
                        }
                    };
                    appBarKt$settleAppBarBottom$12.L$0 = floatRef;
                    appBarKt$settleAppBarBottom$12.L$1 = null;
                    appBarKt$settleAppBarBottom$12.L$2 = null;
                    appBarKt$settleAppBarBottom$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBarBottom$12, 4, null) != coroutine_suspended) {
                        floatRef2 = floatRef;
                        floatRef = floatRef2;
                    }
                    return coroutine_suspended;
                }
                return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        appBarKt$settleAppBarBottom$1 = new AppBarKt$settleAppBarBottom$1(continuation);
        appBarKt$settleAppBarBottom$12 = appBarKt$settleAppBarBottom$1;
        Object obj2 = appBarKt$settleAppBarBottom$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appBarKt$settleAppBarBottom$12.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            boxFloat = Boxing.boxFloat(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
            function1 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    Unit unit;
                    unit = AppBarKt.settleAppBarBottom$lambda$1(BottomAppBarState.this, (AnimationScope) obj22);
                    return unit;
                }
            };
            appBarKt$settleAppBarBottom$12.L$0 = floatRef;
            appBarKt$settleAppBarBottom$12.L$1 = null;
            appBarKt$settleAppBarBottom$12.L$2 = null;
            appBarKt$settleAppBarBottom$12.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBarBottom$12, 4, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleAppBarBottom$lambda$0(Ref.FloatRef floatRef, BottomAppBarState bottomAppBarState, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - floatRef.element;
        float heightOffset = bottomAppBarState.getHeightOffset();
        bottomAppBarState.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
        floatRef.element = ((Number) animationScope.getValue()).floatValue();
        floatRef2.element = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleAppBarBottom$lambda$1(BottomAppBarState bottomAppBarState, AnimationScope animationScope) {
        bottomAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* renamed from: SingleRowTopAppBar-TCVpFMg, reason: not valid java name */
    private static final void m2519SingleRowTopAppBarTCVpFMg(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Alignment.Horizontal horizontal, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f, final PaddingValues paddingValues, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(703932376);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleRowTopAppBar)N(modifier,title,titleTextStyle,subtitle,subtitleTextStyle,titleHorizontalAlignment,navigationIcon,actions,expandedHeight:c#ui.unit.Dp,contentPadding,windowInsets,colors,scrollBehavior)2774@133252L7,*2774@133269L20:AppBar.kt#uh7d8r");
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            function24 = function2;
            i4 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
        } else {
            function24 = function2;
        }
        if ((i & 384) == 0) {
            textStyle3 = textStyle;
            i4 |= startRestartGroup.changed(textStyle3) ? 256 : 128;
        } else {
            textStyle3 = textStyle;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(horizontal) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(windowInsets) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(topAppBarColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
        }
        int i7 = i5;
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703932376, i4, i7, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:2757)");
            }
            SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope = new SingleRowTopAppBarOverrideScope(modifier3, function24, textStyle3, function25, textStyle2, horizontal, function23, function3, f, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior, null);
            ProvidableCompositionLocal<SingleRowTopAppBarOverride> providableCompositionLocal = LocalSingleRowTopAppBarOverride;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ((SingleRowTopAppBarOverride) consume).SingleRowTopAppBar(singleRowTopAppBarOverrideScope, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleRowTopAppBar_TCVpFMg$lambda$1;
                    SingleRowTopAppBar_TCVpFMg$lambda$1 = AppBarKt.SingleRowTopAppBar_TCVpFMg$lambda$1(Modifier.this, function2, textStyle, function22, textStyle2, horizontal, function23, function3, f, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleRowTopAppBar_TCVpFMg$lambda$1;
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> getLocalSingleRowTopAppBarOverride() {
        return LocalSingleRowTopAppBarOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleRowTopAppBarOverride LocalSingleRowTopAppBarOverride$lambda$0() {
        return DefaultSingleRowTopAppBarOverride.INSTANCE;
    }

    /* renamed from: TwoRowsTopAppBar-pJA5dT0, reason: not valid java name */
    private static final void m2525TwoRowsTopAppBarpJA5dT0(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final TextStyle textStyle3, final Function2<? super Composer, ? super Integer, Unit> function24, final TextStyle textStyle4, final Alignment.Horizontal horizontal, final Function2<? super Composer, ? super Integer, Unit> function25, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f2, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        float f4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1092180406);
        ComposerKt.sourceInformation(startRestartGroup, "C(TwoRowsTopAppBar)N(modifier,title,titleTextStyle,titleBottomPadding:c#ui.unit.Dp,smallTitle,smallTitleTextStyle,subtitle,subtitleTextStyle,smallSubtitle,smallSubtitleTextStyle,titleHorizontalAlignment,navigationIcon,actions,collapsedHeight:c#ui.unit.Dp,expandedHeight:c#ui.unit.Dp,windowInsets,colors,scrollBehavior)3004@143476L7,*3004@143493L18:AppBar.kt#uh7d8r");
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f4 = f;
            i4 |= startRestartGroup.changed(f4) ? 2048 : 1024;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            function26 = function22;
            i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function22;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(textStyle3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(textStyle4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(horizontal) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(f3) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(topAppBarColors) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
        }
        int i7 = i5;
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092180406, i4, i7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:2982)");
            }
            TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope = new TwoRowsTopAppBarOverrideScope(modifier4, function2, textStyle, f4, function26, textStyle2, function23, textStyle3, function24, textStyle4, horizontal, function25, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, null);
            ProvidableCompositionLocal<TwoRowsTopAppBarOverride> providableCompositionLocal = LocalTwoRowsTopAppBarOverride;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ((TwoRowsTopAppBarOverride) consume).TwoRowsTopAppBar(twoRowsTopAppBarOverrideScope, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TwoRowsTopAppBar_pJA5dT0$lambda$1;
                    TwoRowsTopAppBar_pJA5dT0$lambda$1 = AppBarKt.TwoRowsTopAppBar_pJA5dT0$lambda$1(Modifier.this, function2, textStyle, f, function22, textStyle2, function23, textStyle3, function24, textStyle4, horizontal, function25, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return TwoRowsTopAppBar_pJA5dT0$lambda$1;
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> getLocalTwoRowsTopAppBarOverride() {
        return LocalTwoRowsTopAppBarOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TwoRowsTopAppBarOverride LocalTwoRowsTopAppBarOverride$lambda$0() {
        return DefaultTwoRowsTopAppBarOverride.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier adjustHeightOffsetLimit(Modifier modifier, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        final TopAppBarState state;
        Modifier onSizeChanged;
        return (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null || (onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit adjustHeightOffsetLimit$lambda$0$0;
                adjustHeightOffsetLimit$lambda$0$0 = AppBarKt.adjustHeightOffsetLimit$lambda$0$0(TopAppBarState.this, (IntSize) obj);
                return adjustHeightOffsetLimit$lambda$0$0;
            }
        })) == null) ? modifier : onSizeChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adjustHeightOffsetLimit$lambda$0$0(TopAppBarState topAppBarState, IntSize intSize) {
        topAppBarState.setHeightOffsetLimit(-(((int) (intSize.m9911unboximpl() & 4294967295L)) - topAppBarState.getHeightOffset()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-_5F1rQI, reason: not valid java name */
    public static final void m2523TopAppBarLayout_5F1rQI(final Modifier modifier, final FloatProducer floatProducer, final long j, final long j2, final long j3, final long j4, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function0<Float> function0, final Arrangement.Vertical vertical, final Alignment.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final float f, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        int i6;
        String str;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Composer composer3;
        Alignment.Horizontal horizontal2;
        String str2;
        String str3;
        int i9;
        Modifier.Companion companion;
        boolean z2;
        String str4;
        String str5;
        int i10;
        String str6;
        Modifier.Companion companion2;
        Composer startRestartGroup = composer.startRestartGroup(239553141);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBarLayout)N(modifier,scrolledOffset,navigationIconContentColor:c#ui.graphics.Color,titleContentColor:c#ui.graphics.Color,subtitleContentColor:c#ui.graphics.Color,actionIconContentColor:c#ui.graphics.Color,title,titleTextStyle,subtitle,subtitleTextStyle,titleAlpha,titleVerticalArrangement,titleHorizontalAlignment,titleBottomPadding,hideTitleSemantics,navigationIcon,actions,height:c#ui.unit.Dp,contentPadding)3344@160339L505,3286@157819L3032:AppBar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(j4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(textStyle2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(vertical) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(horizontal) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i11 = i5;
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (38347923 & i11) == 38347922) ? false : true, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239553141, i4, i11, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:3285)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1717562162, "CC(remember):AppBar.kt#9igjgp");
            int i12 = i11 & 896;
            boolean z3 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changed(floatProducer))) | ((i11 & 112) == 32) | (i12 == 256) | ((i11 & 7168) == 2048) | ((29360128 & i11) == 8388608);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i6 = i11;
                str = "CC(remember):AppBar.kt#9igjgp";
                i7 = i4;
                i8 = i12;
                function25 = function23;
                composer3 = startRestartGroup;
                rememberedValue = new TopAppBarMeasurePolicy(floatProducer, vertical, horizontal, i, f, paddingValues, null);
                horizontal2 = horizontal;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                function25 = function23;
                str = "CC(remember):AppBar.kt#9igjgp";
                horizontal2 = horizontal;
                i7 = i4;
                i6 = i11;
                i8 = i12;
                composer3 = startRestartGroup;
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            TopAppBarMeasurePolicy topAppBarMeasurePolicy = (TopAppBarMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer3);
            Updater.m5872setimpl(m5864constructorimpl, topAppBarMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, 407230616, "C3288@157849L281,3335@159997L265:AppBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "navigationIcon");
            float f2 = TopAppBarHorizontalPadding;
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(layoutId, f2, 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1205paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer3);
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, 1162727495, "C3289@157952L164:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), function25, composer3, ProvidedValue.$stable | ((i6 >> 12) & 112));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (function22 != null) {
                composer3.startReplaceGroup(407501183);
                ComposerKt.sourceInformation(composer3, "3303@158594L24,3295@158183L997");
                Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "title"), f2, 0.0f, 2, null);
                if (z) {
                    composer3.startReplaceGroup(-402488651);
                    ComposerKt.sourceInformation(composer3, "3300@158472L2");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    str6 = str;
                    ComposerKt.sourceInformationMarkerStart(composer3, -402488000, str6);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TopAppBarLayout__5F1rQI$lambda$0$1$0;
                                TopAppBarLayout__5F1rQI$lambda$0$1$0 = AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$1$0((SemanticsPropertyReceiver) obj);
                                return TopAppBarLayout__5F1rQI$lambda$0$1$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    companion2 = SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) rememberedValue2);
                    composer3.endReplaceGroup();
                } else {
                    str6 = str;
                    composer3.startReplaceGroup(-402486714);
                    composer3.endReplaceGroup();
                    companion2 = Modifier.INSTANCE;
                }
                Modifier then = m1203paddingVpY3zN4$default.then(companion2);
                ComposerKt.sourceInformationMarkerStart(composer3, -402484074, str6);
                z2 = (i6 & 14) == 4;
                Object rememberedValue3 = composer3.rememberedValue();
                if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TopAppBarLayout__5F1rQI$lambda$0$2$0;
                            TopAppBarLayout__5F1rQI$lambda$0$2$0 = AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$2$0(Function0.this, (GraphicsLayerScope) obj);
                            return TopAppBarLayout__5F1rQI$lambda$0$2$0;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(then, (Function1) rememberedValue3);
                ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal2, composer3, (i8 >> 3) & 112);
                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, graphicsLayer);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer3);
                Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -1267818492, "C3306@158728L202,3311@158951L211:AppBar.kt#uh7d8r");
                int i13 = i7 >> 18;
                int i14 = i7 >> 12;
                str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                composer2 = composer3;
                i9 = 1042775818;
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composer2, ((i7 >> 9) & 14) | (i13 & 112) | (i14 & 896));
                int i15 = (i14 & 14) | ((i7 >> 24) & 112) | (i13 & 896);
                str2 = "C72@3469L9:Box.kt#2w3rfo";
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j3, textStyle2, function22, composer2, i15);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
                str5 = "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                str4 = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                i10 = -1159599143;
            } else {
                str2 = "C72@3469L9:Box.kt#2w3rfo";
                str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                composer2 = composer3;
                String str7 = str;
                i9 = 1042775818;
                composer2.startReplaceGroup(408520308);
                ComposerKt.sourceInformation(composer2, "3326@159685L24,3318@159277L693");
                Modifier m1203paddingVpY3zN4$default2 = PaddingKt.m1203paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "title"), f2, 0.0f, 2, null);
                if (z) {
                    composer2.startReplaceGroup(-402453739);
                    ComposerKt.sourceInformation(composer2, "3323@159563L2");
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -402453088, str7);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TopAppBarLayout__5F1rQI$lambda$0$4$0;
                                TopAppBarLayout__5F1rQI$lambda$0$4$0 = AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$4$0((SemanticsPropertyReceiver) obj);
                                return TopAppBarLayout__5F1rQI$lambda$0$4$0;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    companion = SemanticsModifierKt.clearAndSetSemantics(companion4, (Function1) rememberedValue4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-402451802);
                    composer2.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                Modifier then2 = m1203paddingVpY3zN4$default2.then(companion);
                ComposerKt.sourceInformationMarkerStart(composer2, -402449162, str7);
                z2 = (i6 & 14) == 4;
                Object rememberedValue5 = composer2.rememberedValue();
                if (z2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda37
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TopAppBarLayout__5F1rQI$lambda$0$5$0;
                            TopAppBarLayout__5F1rQI$lambda$0$5$0 = AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$5$0(Function0.this, (GraphicsLayerScope) obj);
                            return TopAppBarLayout__5F1rQI$lambda$0$5$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(then2, (Function1) rememberedValue5);
                ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, str3);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                str4 = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str4);
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, graphicsLayer2);
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
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, str2);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 645404165, "C3328@159750L202:AppBar.kt#uh7d8r");
                str5 = "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                i10 = -1159599143;
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composer2, ((i7 >> 9) & 14) | ((i7 >> 18) & 112) | ((i7 >> 12) & 896));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            }
            Modifier m1205paddingqDBjuR0$default2 = PaddingKt.m1205paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(composer2, i9, str3);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, i10, str4);
            int m5 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m1205paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str5);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer m5864constructorimpl5 = Updater.m5864constructorimpl(composer2);
            Updater.m5872setimpl(m5864constructorimpl5, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl5, Integer.valueOf(m5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, str2);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1075145961, "C3336@160095L153:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j4)), function24, composer2, ProvidedValue.$stable | ((i6 >> 15) & 112));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopAppBarLayout__5F1rQI$lambda$2;
                    TopAppBarLayout__5F1rQI$lambda$2 = AppBarKt.TopAppBarLayout__5F1rQI$lambda$2(Modifier.this, floatProducer, j, j2, j3, j4, function2, textStyle, function22, textStyle2, function0, vertical, horizontal, i, z, function23, function24, f, paddingValues, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return TopAppBarLayout__5F1rQI$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarLayout__5F1rQI$lambda$0$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarLayout__5F1rQI$lambda$0$2$0(Function0 function0, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) function0.invoke()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarLayout__5F1rQI$lambda$0$4$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarLayout__5F1rQI$lambda$0$5$0(Function0 function0, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) function0.invoke()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r23, false, r6, r7, 2, null) == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$1;
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$12;
        Object coroutine_suspended;
        int i;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float boxFloat;
        Function1 function1;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof AppBarKt$settleAppBar$1) {
            appBarKt$settleAppBar$1 = (AppBarKt$settleAppBar$1) continuation;
            if ((appBarKt$settleAppBar$1.label & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBar$1.label -= Integer.MIN_VALUE;
                appBarKt$settleAppBar$12 = appBarKt$settleAppBar$1;
                Object obj = appBarKt$settleAppBar$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appBarKt$settleAppBar$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (topAppBarState2.getCollapsedFraction() < 0.01f || topAppBarState2.getCollapsedFraction() == 1.0f) {
                        return Velocity.m9965boximpl(Velocity.INSTANCE.m9985getZero9UxMQ8M());
                    }
                    floatRef = new Ref.FloatRef();
                    floatRef.element = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        Function1 function12 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit unit;
                                unit = AppBarKt.settleAppBar$lambda$0(Ref.FloatRef.this, topAppBarState2, floatRef, (AnimationScope) obj2);
                                return unit;
                            }
                        };
                        appBarKt$settleAppBar$12.L$0 = topAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBar$12.L$1 = animationSpec2;
                        appBarKt$settleAppBar$12.L$2 = floatRef;
                        appBarKt$settleAppBar$12.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef2 = (Ref.FloatRef) appBarKt$settleAppBar$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBar$12.L$2;
                    AnimationSpec<Float> animationSpec4 = (AnimationSpec) appBarKt$settleAppBar$12.L$1;
                    TopAppBarState topAppBarState3 = (TopAppBarState) appBarKt$settleAppBar$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef4;
                    animationSpec2 = animationSpec4;
                    topAppBarState2 = topAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
                    function1 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit unit;
                            unit = AppBarKt.settleAppBar$lambda$1(TopAppBarState.this, (AnimationScope) obj2);
                            return unit;
                        }
                    };
                    appBarKt$settleAppBar$12.L$0 = floatRef;
                    appBarKt$settleAppBar$12.L$1 = null;
                    appBarKt$settleAppBar$12.L$2 = null;
                    appBarKt$settleAppBar$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBar$12, 4, null) != coroutine_suspended) {
                        floatRef2 = floatRef;
                        floatRef = floatRef2;
                    }
                    return coroutine_suspended;
                }
                return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        appBarKt$settleAppBar$1 = new AppBarKt$settleAppBar$1(continuation);
        appBarKt$settleAppBar$12 = appBarKt$settleAppBar$1;
        Object obj2 = appBarKt$settleAppBar$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appBarKt$settleAppBar$12.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            boxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            function1 = new Function1() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    Unit unit;
                    unit = AppBarKt.settleAppBar$lambda$1(TopAppBarState.this, (AnimationScope) obj22);
                    return unit;
                }
            };
            appBarKt$settleAppBar$12.L$0 = floatRef;
            appBarKt$settleAppBar$12.L$1 = null;
            appBarKt$settleAppBar$12.L$2 = null;
            appBarKt$settleAppBar$12.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBar$12, 4, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Velocity.m9965boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleAppBar$lambda$0(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - floatRef.element;
        float heightOffset = topAppBarState.getHeightOffset();
        topAppBarState.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
        floatRef.element = ((Number) animationScope.getValue()).floatValue();
        floatRef2.element = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit settleAppBar$lambda$1(TopAppBarState topAppBarState, AnimationScope animationScope) {
        topAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    private static final State<Boolean> rememberTouchExplorationService(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1660719518, "C(rememberTouchExplorationService)3891@184778L171:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1660719518, i, -1, "androidx.compose.material3.rememberTouchExplorationService (AppBar.kt:3891)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, false, false, composer, 438, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberAccessibilityServiceState;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final boolean BottomAppBarLayout_t5fmz9U$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f = 16;
        float f2 = 12;
        float m9732constructorimpl = Dp.m9732constructorimpl(Dp.m9732constructorimpl(f) - Dp.m9732constructorimpl(f2));
        BottomAppBarHorizontalPadding = m9732constructorimpl;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(Dp.m9732constructorimpl(f) - Dp.m9732constructorimpl(f2));
        BottomAppBarVerticalPadding = m9732constructorimpl2;
        FABHorizontalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(f) - m9732constructorimpl);
        FABVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(f2) - m9732constructorimpl2);
        LocalSingleRowTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SingleRowTopAppBarOverride LocalSingleRowTopAppBarOverride$lambda$0;
                LocalSingleRowTopAppBarOverride$lambda$0 = AppBarKt.LocalSingleRowTopAppBarOverride$lambda$0();
                return LocalSingleRowTopAppBarOverride$lambda$0;
            }
        }, 1, null);
        LocalTwoRowsTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TwoRowsTopAppBarOverride LocalTwoRowsTopAppBarOverride$lambda$0;
                LocalTwoRowsTopAppBarOverride$lambda$0 = AppBarKt.LocalTwoRowsTopAppBarOverride$lambda$0();
                return LocalTwoRowsTopAppBarOverride$lambda$0;
            }
        }, 1, null);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m9732constructorimpl(24);
        LargeTitleBottomPadding = Dp.m9732constructorimpl(28);
        float m9732constructorimpl3 = Dp.m9732constructorimpl(4);
        TopAppBarHorizontalPadding = m9732constructorimpl3;
        TopAppBarTitleInset = Dp.m9732constructorimpl(Dp.m9732constructorimpl(f) - m9732constructorimpl3);
    }
}
