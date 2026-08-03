package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SegmentedMenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0098\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010$\u001a¯\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010&\u001a½\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010'\u001a\u00020!2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00122\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010+\u001aÔ\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010'\u001a\u00020!2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00122\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010,\u001a·\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010-\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010.\u001aÎ\u0001\u0010\u0018\u001a\u00020\u00012\u0006\u0010-\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u00100\u001a\u0083\u0001\u00101\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u00102\u001a\b\u0012\u0004\u0012\u00020!032\f\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u0002082\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0004\b9\u0010:\u001a¼\u0001\u0010;\u001a\u00020\u00012\u0006\u0010-\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0013\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0013\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0002\u0010<\u001a\u0082\u0001\u0010;\u001a\u00020\u00012\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0013\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0002\u0010G\u001a\u001d\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0002\u0010L\u001a;\u0010M\u001a\u00020\u00012\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0002\u0010N\u001a+\u0010O\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020)2\u0006\u0010-\u001a\u00020!2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QH\u0003¢\u0006\u0002\u0010S\u001a3\u0010O\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010T\u001a\u00020!2\u0006\u0010U\u001a\u00020!2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QH\u0003¢\u0006\u0002\u0010V\u001a+\u0010W\u001a\u00020\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0003¢\u0006\u0002\u0010Y\"\u001e\u0010=\u001a\u00020!*\u00020)8@X\u0080\u0004¢\u0006\f\u0012\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u001e\u0010=\u001a\u00020!*\u00020\u00038@X\u0080\u0004¢\u0006\f\u0012\u0004\b>\u0010B\u001a\u0004\b@\u0010C\"\u001e\u0010D\u001a\u00020!*\u00020)8@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u001e\u0010D\u001a\u00020!*\u00020\u00038@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010B\u001a\u0004\bF\u0010C\"\u0016\u0010Z\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\\"\u0016\u0010^\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\b_\u0010\\\"\u0010\u0010`\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010]\"\u0016\u0010a\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bb\u0010\\\"\u0016\u0010c\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bd\u0010\\\"\u000e\u0010e\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010g\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010]\"\u0016\u0010h\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bi\u0010\\\"\u0016\u0010j\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bk\u0010\\\"\u0016\u0010l\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bm\u0010\\\"\u0016\u0010n\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010]\u001a\u0004\bo\u0010\\\"\u000e\u0010p\u001a\u00020qX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010r\u001a\u00020qX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010s\u001a\u00020qX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010t\u001a\u00020qX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010u\u001a\u00020RX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010v\u001a\u00020RX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010w\u001a\u00020RX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010x\u001a\u00020RX\u0080T¢\u0006\u0002\n\u0000¨\u0006y²\u0006\n\u0010U\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010z\u001a\u00020RX\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020RX\u008a\u0084\u0002²\u0006\n\u0010|\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"DropdownMenuGroup", "", "shapes", "Landroidx/compose/material3/MenuGroupShapes;", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenuGroup-BfByrIA", "(Landroidx/compose/material3/MenuGroupShapes;Landroidx/compose/ui/Modifier;JFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "Lkotlin/Function0;", MenuKt.TextLayoutId, "shape", "Landroidx/compose/ui/graphics/Shape;", MenuKt.LeadingIconLayoutId, MenuKt.TrailingIconLayoutId, "enabled", "", "colors", "Landroidx/compose/material3/MenuItemColors;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "supportingText", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Landroidx/compose/material3/MenuItemShapes;", "checkedLeadingIcon", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/MenuItemShapes;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/MenuItemShapes;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/MenuItemShapes;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "selectedLeadingIcon", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/MenuItemShapes;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "DropdownMenuContent", "expandedState", "Landroidx/compose/animation/core/MutableTransitionState;", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "DropdownMenuContent-Qj0Zi0g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DropdownMenuItemContent", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/material3/MenuItemShapes;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "hasRoundedCornerShapes", "getHasRoundedCornerShapes$annotations", "(Landroidx/compose/material3/MenuItemShapes;)V", "getHasRoundedCornerShapes", "(Landroidx/compose/material3/MenuItemShapes;)Z", "(Landroidx/compose/material3/MenuGroupShapes;)V", "(Landroidx/compose/material3/MenuGroupShapes;)Z", "hasCornerBasedShapes", "getHasCornerBasedShapes$annotations", "getHasCornerBasedShapes", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "calculateTransformOrigin", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "LabelWithSupportingText", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "shapeByInteraction", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "(Landroidx/compose/material3/MenuItemShapes;ZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "hasBeenHovered", "hovered", "(Landroidx/compose/material3/MenuGroupShapes;ZZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "WrappedLeadingIcon", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "F", "MenuHorizontalMargin", "getMenuHorizontalMargin", "MenuListItemContainerHeight", "DropdownMenuItemHorizontalPadding", "getDropdownMenuItemHorizontalPadding", "DropdownMenuGroupVerticalPadding", "getDropdownMenuGroupVerticalPadding", "DropdownMenuSelectableItemPadding", "DropdownMenuSelectableItemWithSupportTexPadding", "DropdownMenuIconTextPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "getDropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "getDropdownMenuItemDefaultMaxWidth", "DropdownMenuGroupDefaultMinHeight", "getDropdownMenuGroupDefaultMinHeight", "LeadingIconLayoutId", "", "TextLayoutId", "TrailingIconLayoutId", "GhostLeadingIconLayoutId", "ExpandedScaleTarget", "ClosedScaleTarget", "ExpandedAlphaTarget", "ClosedAlphaTarget", "material3", "scale", "alpha", "animatedContainerColor"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    private static final float DropdownMenuGroupDefaultMinHeight;
    private static final float DropdownMenuGroupVerticalPadding;
    private static final float DropdownMenuIconTextPadding;
    private static final float DropdownMenuItemDefaultMaxWidth;
    private static final float DropdownMenuItemDefaultMinWidth;
    private static final float DropdownMenuItemHorizontalPadding;
    private static final PaddingValues DropdownMenuSelectableItemPadding;
    private static final PaddingValues DropdownMenuSelectableItemWithSupportTexPadding;
    private static final float DropdownMenuVerticalPadding;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    private static final String GhostLeadingIconLayoutId = "ghostLeadingIcon";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final float MenuHorizontalMargin;
    private static final float MenuListItemContainerHeight;
    private static final float MenuVerticalMargin;
    private static final String TextLayoutId = "text";
    private static final String TrailingIconLayoutId = "trailingIcon";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuContent_Qj0Zi0g$lambda$8(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, int i, Composer composer, int i2) {
        m3569DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j, f, f2, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuGroup_BfByrIA$lambda$6(MenuGroupShapes menuGroupShapes, Modifier modifier, long j, float f, float f2, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3570DropdownMenuGroupBfByrIA(menuGroupShapes, modifier, j, f, f2, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$0(Function0 function0, Function2 function2, Shape shape, Modifier modifier, Function2 function22, Function2 function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        DropdownMenuItem(function0, function2, shape, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$2(Function0 function0, Function2 function2, Shape shape, Modifier modifier, Function2 function22, Function2 function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function24, int i, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItem(function0, function2, shape, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$3(boolean z, Function1 function1, Function2 function2, MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItem(z, function1, function2, menuItemShapes, modifier, function22, function23, function24, z2, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$6(boolean z, Function1 function1, Function2 function2, MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItem(z, (Function1<? super Boolean, Unit>) function1, (Function2<? super Composer, ? super Integer, Unit>) function2, menuItemShapes, modifier, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z2, menuItemColors, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$7(boolean z, Function0 function0, Function2 function2, MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItem(z, function0, function2, menuItemShapes, modifier, function22, function23, function24, z2, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$9(boolean z, Function0 function0, Function2 function2, MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItem(z, (Function0<Unit>) function0, (Function2<? super Composer, ? super Integer, Unit>) function2, menuItemShapes, modifier, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z2, menuItemColors, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$3(boolean z, Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, MenuItemColors menuItemColors, MenuItemShapes menuItemShapes, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        DropdownMenuItemContent(z, function0, function2, modifier, function22, function23, function24, function25, z2, menuItemColors, menuItemShapes, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$5(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, Composer composer, int i2) {
        DropdownMenuItemContent(function2, function0, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LabelWithSupportingText$lambda$1(Function2 function2, Modifier modifier, Function2 function22, int i, Composer composer, int i2) {
        LabelWithSupportingText(function2, modifier, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrappedLeadingIcon$lambda$0(Function3 function3, int i, Composer composer, int i2) {
        WrappedLeadingIcon(function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHasCornerBasedShapes$annotations(MenuGroupShapes menuGroupShapes) {
    }

    public static /* synthetic */ void getHasCornerBasedShapes$annotations(MenuItemShapes menuItemShapes) {
    }

    public static /* synthetic */ void getHasRoundedCornerShapes$annotations(MenuGroupShapes menuGroupShapes) {
    }

    public static /* synthetic */ void getHasRoundedCornerShapes$annotations(MenuItemShapes menuItemShapes) {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* renamed from: DropdownMenuGroup-BfByrIA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3570DropdownMenuGroupBfByrIA(final MenuGroupShapes menuGroupShapes, Modifier modifier, long j, float f, float f2, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        long j2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final long j3;
        final float f5;
        final float f6;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        BorderStroke borderStroke3;
        final PaddingValues dropdownMenuGroupContentPadding;
        float f7;
        long j4;
        int i10;
        int i11;
        float f8;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        State<Boolean> collectIsHoveredAsState;
        Object rememberedValue;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1580422941);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuGroup)N(shapes,modifier,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,contentPadding,interactionSource,content)246@12212L25,247@12264L34,252@12409L14,253@12445L62,262@12775L86,255@12513L348:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(menuGroupShapes) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    j2 = j;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    f4 = f2;
                    i3 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "236@11689L27");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                borderStroke3 = borderStroke;
                                dropdownMenuGroupContentPadding = paddingValues;
                            } else {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 4) != 0) {
                                    j2 = MenuDefaults.INSTANCE.getGroupStandardContainerColor(startRestartGroup, 6);
                                    i3 &= -897;
                                }
                                if (i4 != 0) {
                                    f3 = MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM();
                                }
                                if (i5 != 0) {
                                    f4 = MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM();
                                }
                                borderStroke3 = i6 != 0 ? null : borderStroke;
                                dropdownMenuGroupContentPadding = i7 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuGroupContentPadding() : paddingValues;
                                if (i9 != 0) {
                                    f7 = f4;
                                    j4 = j2;
                                    i10 = 12582912;
                                    i11 = i3;
                                    f8 = f3;
                                    mutableInteractionSource3 = null;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1580422941, i11, -1, "androidx.compose.material3.DropdownMenuGroup (Menu.kt:243)");
                                    }
                                    if (mutableInteractionSource3 != null) {
                                        startRestartGroup.startReplaceGroup(948907198);
                                        ComposerKt.sourceInformation(startRestartGroup, "245@12135L39");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1631958076, "CC(remember):Menu.kt#9igjgp");
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1631958727);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    int i14 = i10;
                                    collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource4, startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1631953953, "CC(remember):Menu.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    MutableState mutableState = (MutableState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (DropdownMenuGroup_BfByrIA$lambda$1(collectIsHoveredAsState)) {
                                        DropdownMenuGroup_BfByrIA$lambda$4(mutableState, true);
                                    }
                                    int i15 = i11 << 3;
                                    BorderStroke borderStroke4 = borderStroke3;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m4112SurfaceT9BRK9s(HoverableKt.hoverable$default(Modifier.INSTANCE, mutableInteractionSource4, false, 2, null), shapeByInteraction(menuGroupShapes, DropdownMenuGroup_BfByrIA$lambda$3(mutableState), DropdownMenuGroup_BfByrIA$lambda$1(collectIsHoveredAsState), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), startRestartGroup, i11 & 14), j4, 0L, f8, f7, borderStroke4, ComposableLambdaKt.rememberComposableLambda(-295285640, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DropdownMenuGroup_BfByrIA$lambda$5;
                                            DropdownMenuGroup_BfByrIA$lambda$5 = MenuKt.DropdownMenuGroup_BfByrIA$lambda$5(Modifier.this, dropdownMenuGroupContentPadding, function3, (Composer) obj, ((Integer) obj2).intValue());
                                            return DropdownMenuGroup_BfByrIA$lambda$5;
                                        }
                                    }, startRestartGroup, 54), composer2, (i11 & 896) | i14 | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    paddingValues2 = dropdownMenuGroupContentPadding;
                                    modifier3 = modifier2;
                                    j3 = j4;
                                    f5 = f8;
                                    f6 = f7;
                                    borderStroke2 = borderStroke4;
                                }
                            }
                            f7 = f4;
                            j4 = j2;
                            i10 = 12582912;
                            i11 = i3;
                            f8 = f3;
                            mutableInteractionSource3 = mutableInteractionSource;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (mutableInteractionSource3 != null) {
                            }
                            int i142 = i10;
                            collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource4, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1631953953, "CC(remember):Menu.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState2 = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (DropdownMenuGroup_BfByrIA$lambda$1(collectIsHoveredAsState)) {
                            }
                            int i152 = i11 << 3;
                            BorderStroke borderStroke42 = borderStroke3;
                            composer2 = startRestartGroup;
                            SurfaceKt.m4112SurfaceT9BRK9s(HoverableKt.hoverable$default(Modifier.INSTANCE, mutableInteractionSource4, false, 2, null), shapeByInteraction(menuGroupShapes, DropdownMenuGroup_BfByrIA$lambda$3(mutableState2), DropdownMenuGroup_BfByrIA$lambda$1(collectIsHoveredAsState), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), startRestartGroup, i11 & 14), j4, 0L, f8, f7, borderStroke42, ComposableLambdaKt.rememberComposableLambda(-295285640, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenuGroup_BfByrIA$lambda$5;
                                    DropdownMenuGroup_BfByrIA$lambda$5 = MenuKt.DropdownMenuGroup_BfByrIA$lambda$5(Modifier.this, dropdownMenuGroupContentPadding, function3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenuGroup_BfByrIA$lambda$5;
                                }
                            }, startRestartGroup, 54), composer2, (i11 & 896) | i142 | (57344 & i152) | (458752 & i152) | (i152 & 3670016), 8);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                            paddingValues2 = dropdownMenuGroupContentPadding;
                            modifier3 = modifier2;
                            j3 = j4;
                            f5 = f8;
                            f6 = f7;
                            borderStroke2 = borderStroke42;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            j3 = j2;
                            f5 = f3;
                            f6 = f4;
                            borderStroke2 = borderStroke;
                            paddingValues2 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenuGroup_BfByrIA$lambda$6;
                                    DropdownMenuGroup_BfByrIA$lambda$6 = MenuKt.DropdownMenuGroup_BfByrIA$lambda$6(MenuGroupShapes.this, modifier3, j3, f5, f6, borderStroke2, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenuGroup_BfByrIA$lambda$6;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f4 = f2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            f4 = f2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        f4 = f2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean DropdownMenuGroup_BfByrIA$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DropdownMenuGroup_BfByrIA$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuGroup_BfByrIA$lambda$5(Modifier modifier, PaddingValues paddingValues, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C263@12785L70:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-295285640, i, -1, "androidx.compose.material3.DropdownMenuGroup.<anonymous> (Menu.kt:263)");
            }
            Modifier padding = PaddingKt.padding(modifier, paddingValues);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01eb  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void DropdownMenuItem(final Function0 function0, final Function2 function2, final Shape shape, Modifier modifier, Function2 function22, Function2 function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        Modifier modifier2;
        int i4;
        Function2 function24;
        int i5;
        Function2 function25;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final MenuItemColors menuItemColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Function2 function26;
        final Function2 function27;
        final boolean z3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        MenuItemColors menuItemColors3;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        MenuItemColors menuItemColors4;
        PaddingValues paddingValues3;
        Function2 function28;
        Function2 function29;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(70219170);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(onClick,text,shape,modifier,leadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource)350@17129L366:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 256 : 128;
        } else {
            shape2 = shape;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function25 = function23;
                    i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(menuItemColors)) {
                                i13 = 8388608;
                                i3 |= i13;
                            }
                            i13 = 4194304;
                            i3 |= i13;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            i9 = i2 & 512;
                            if (i9 == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "346@16969L12");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 128) != 0) {
                                            i12 = i11 & (-29360129);
                                            menuItemColors4 = menuItemColors;
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        } else {
                                            menuItemColors4 = menuItemColors;
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            i12 = i11;
                                        }
                                        function28 = function24;
                                        function29 = function25;
                                        z4 = z2;
                                    } else {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function24 = null;
                                        }
                                        if (i5 != 0) {
                                            function25 = null;
                                        }
                                        z4 = i6 == 0 ? z2 : true;
                                        if ((i2 & 128) != 0) {
                                            menuItemColors3 = MenuDefaults.INSTANCE.itemColors(startRestartGroup, 6);
                                            i12 = i11 & (-29360129);
                                        } else {
                                            menuItemColors3 = menuItemColors;
                                            i12 = i11;
                                        }
                                        PaddingValues dropdownMenuItemContentPadding = i8 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                                        mutableInteractionSource3 = i10 != 0 ? null : mutableInteractionSource;
                                        menuItemColors4 = menuItemColors3;
                                        paddingValues3 = dropdownMenuItemContentPadding;
                                        function28 = function24;
                                        function29 = function25;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(70219170, i12, -1, "androidx.compose.material3.DropdownMenuItem (Menu.kt:350)");
                                    }
                                    composer2 = startRestartGroup;
                                    Modifier modifier4 = modifier2;
                                    DropdownMenuItem(function0, function2, shape2, modifier4, function28, function29, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, null, composer2, i12 & 2147483646, 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function26 = function28;
                                    function27 = function29;
                                    z3 = z4;
                                    menuItemColors2 = menuItemColors4;
                                    paddingValues2 = paddingValues3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    menuItemColors2 = menuItemColors;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    function26 = function24;
                                    function27 = function25;
                                    z3 = z2;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DropdownMenuItem$lambda$0;
                                            DropdownMenuItem$lambda$0 = MenuKt.DropdownMenuItem$lambda$0(Function0.this, function2, shape, modifier3, function26, function27, z3, menuItemColors2, paddingValues2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return DropdownMenuItem$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 512;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 512;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function23;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function22;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function25 = function23;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function25 = function23;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Shape shape, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final boolean z2;
        final MenuItemColors menuItemColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        MenuItemColors menuItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function211;
        boolean z3;
        MenuItemColors menuItemColors4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function212;
        MutableInteractionSource mutableInteractionSource3;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(753770883);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(onClick,text,shape,modifier,leadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource,supportingText)410@19847L22,417@20102L25,406@19710L512:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function25 = function2;
            i4 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i & 384) == 0) {
            shape2 = shape;
            i4 |= startRestartGroup.changed(shape2) ? 256 : 128;
        } else {
            shape2 = shape;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                function26 = function22;
                i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function27 = function23;
                    i4 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(menuItemColors)) {
                            i14 = 8388608;
                            i4 |= i14;
                        }
                        i14 = 4194304;
                        i4 |= i14;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i12 = i11;
                            i13 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "401@19486L12");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                z3 = z;
                                menuItemColors4 = menuItemColors;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function211 = function24;
                                companion = modifier2;
                                function212 = function26;
                            } else {
                                companion = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    function26 = null;
                                }
                                if (i6 != 0) {
                                    function27 = null;
                                }
                                boolean z4 = i7 != 0 ? true : z;
                                if ((i3 & 128) != 0) {
                                    menuItemColors3 = MenuDefaults.INSTANCE.itemColors(startRestartGroup, 6);
                                    i4 &= -29360129;
                                } else {
                                    menuItemColors3 = menuItemColors;
                                }
                                PaddingValues dropdownMenuSelectableItemContentPadding = i8 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuSelectableItemContentPadding() : paddingValues;
                                MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource;
                                function211 = i12 != 0 ? null : function24;
                                z3 = z4;
                                menuItemColors4 = menuItemColors3;
                                paddingValues3 = dropdownMenuSelectableItemContentPadding;
                                function212 = function26;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function213 = function27;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(753770883, i4, i13, "androidx.compose.material3.DropdownMenuItem (Menu.kt:405)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1475633031, "CC(remember):Menu.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda24
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit DropdownMenuItem$lambda$1$0;
                                        DropdownMenuItem$lambda$1$0 = MenuKt.DropdownMenuItem$lambda$1$0((SemanticsPropertyReceiver) obj);
                                        return DropdownMenuItem$lambda$1$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
                            MenuItemShapes itemShapes = MenuDefaults.INSTANCE.itemShapes(shape2, null, startRestartGroup, ((i4 >> 6) & 14) | 384, 2);
                            composer2 = startRestartGroup;
                            int i16 = i4 << 3;
                            int i17 = ((i13 << 12) & 57344) | (i16 & 112) | 1572870 | (i16 & 896) | (i16 & 458752);
                            int i18 = i4 << 6;
                            DropdownMenuItemContent(false, function0, function25, semantics$default, function211, function212, null, function213, z3, menuItemColors4, itemShapes, paddingValues3, mutableInteractionSource3, composer2, i17 | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), (i4 >> 21) & PointerIconCompat.TYPE_TEXT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            function210 = function211;
                            function28 = function212;
                            function29 = function213;
                            z2 = z3;
                            menuItemColors2 = menuItemColors4;
                            paddingValues2 = paddingValues3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z2 = z;
                            menuItemColors2 = menuItemColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            function28 = function26;
                            function29 = function27;
                            paddingValues2 = paddingValues;
                            function210 = function24;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenuItem$lambda$2;
                                    DropdownMenuItem$lambda$2 = MenuKt.DropdownMenuItem$lambda$2(Function0.this, function2, shape, modifier3, function28, function29, z2, menuItemColors2, paddingValues2, mutableInteractionSource2, function210, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenuItem$lambda$2;
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
                function27 = function23;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
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
            function26 = function22;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
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
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void DropdownMenuItem(final boolean z, final Function1 function1, final Function2 function2, final MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1 function12;
        Function2 function25;
        MenuItemShapes menuItemShapes2;
        Modifier modifier2;
        int i5;
        int i6;
        Function2 function26;
        int i7;
        final Function2 function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final Function2 function28;
        final boolean z3;
        final MenuItemColors menuItemColors2;
        final PaddingValues paddingValues2;
        final Function2 function29;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        MenuItemColors menuItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        MenuItemColors menuItemColors4;
        Modifier modifier4;
        PaddingValues paddingValues3;
        Function2 function210;
        boolean z4;
        Function2 function211;
        Function2 function212;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1967931105);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(checked,onCheckedChange,text,shapes,modifier,leadingIcon,checkedLeadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource)475@23070L460:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & 384) == 0) {
            function25 = function2;
            i4 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
        } else {
            function25 = function2;
        }
        if ((i & 3072) == 0) {
            menuItemShapes2 = menuItemShapes;
            i4 |= startRestartGroup.changed(menuItemShapes2) ? 2048 : 1024;
        } else {
            menuItemShapes2 = menuItemShapes;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function26 = function23;
            } else {
                function26 = function23;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function27 = function24;
            } else {
                function27 = function24;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i9 = i8;
                i4 |= startRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(menuItemColors)) {
                        i16 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i16;
                    }
                    i16 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i16;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else {
                    i11 = i10;
                    if ((i2 & 6) == 0) {
                        i12 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                    } else {
                        i12 = i2;
                    }
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else {
                    i14 = i13;
                    if ((i2 & 48) == 0) {
                        i12 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    }
                }
                i15 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "471@22890L22");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        function212 = function22;
                        z4 = z2;
                        menuItemColors4 = menuItemColors;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        function210 = function26;
                        function211 = function27;
                        modifier4 = modifier2;
                    } else {
                        Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                        Function2 function213 = i5 != 0 ? null : function22;
                        if (i6 != 0) {
                            function26 = null;
                        }
                        if (i7 != 0) {
                            function27 = null;
                        }
                        boolean z5 = i9 != 0 ? true : z2;
                        if ((i3 & 512) != 0) {
                            composer2 = startRestartGroup;
                            menuItemColors3 = MenuDefaults.INSTANCE.m3528selectableItemColorsHlaysQ4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 48, 2047);
                            i4 &= -1879048193;
                        } else {
                            composer2 = startRestartGroup;
                            menuItemColors3 = menuItemColors;
                        }
                        PaddingValues dropdownMenuSelectableItemContentPadding = i11 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuSelectableItemContentPadding() : paddingValues;
                        if (i14 != 0) {
                            menuItemColors4 = menuItemColors3;
                            modifier4 = companion;
                            paddingValues3 = dropdownMenuSelectableItemContentPadding;
                            function210 = function26;
                            z4 = z5;
                            function211 = function27;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            menuItemColors4 = menuItemColors3;
                            modifier4 = companion;
                            paddingValues3 = dropdownMenuSelectableItemContentPadding;
                            function210 = function26;
                            z4 = z5;
                            function211 = function27;
                        }
                        function212 = function213;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1967931105, i4, i15, "androidx.compose.material3.DropdownMenuItem (Menu.kt:475)");
                    }
                    DropdownMenuItem(z, (Function1<? super Boolean, Unit>) function12, (Function2<? super Composer, ? super Integer, Unit>) function25, menuItemShapes2, modifier4, (Function2<? super Composer, ? super Integer, Unit>) function212, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function211, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) null, composer2, i4 & 2147483646, (i15 & 14) | 384 | (i15 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function28 = function212;
                    function29 = function210;
                    function27 = function211;
                    z3 = z4;
                    menuItemColors2 = menuItemColors4;
                    paddingValues2 = paddingValues3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function28 = function22;
                    z3 = z2;
                    menuItemColors2 = menuItemColors;
                    paddingValues2 = paddingValues;
                    function29 = function26;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DropdownMenuItem$lambda$3;
                            DropdownMenuItem$lambda$3 = MenuKt.DropdownMenuItem$lambda$3(z, function1, function2, menuItemShapes, modifier3, function28, function29, function27, z3, menuItemColors2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return DropdownMenuItem$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i15 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i15 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final boolean z, final Function1<? super Boolean, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function2, final MenuItemShapes menuItemShapes, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Modifier modifier2;
        final MenuItemColors menuItemColors2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        MenuItemColors menuItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        MenuItemColors menuItemColors4;
        int i23;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(712004930);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(checked,onCheckedChange,text,shapes,modifier,leadingIcon,checkedLeadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource,supportingText)548@26574L24,547@26505L29,544@26413L520:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(menuItemShapes) ? 2048 : 1024;
        }
        int i25 = i3 & 16;
        if (i25 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function26 = function23;
            } else {
                function26 = function23;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function27 = function24;
            } else {
                function27 = function24;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(menuItemColors)) {
                    i24 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i24;
                }
                i24 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i24;
            }
            i9 = i4;
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i13 = i12;
                i14 = i11 | 48;
            } else {
                if ((i2 & 48) == 0) {
                    i13 = i12;
                    i11 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i13 = i12;
                }
                i14 = i11;
            }
            i15 = i3 & 4096;
            if (i15 == 0) {
                i16 = i15;
                i17 = i14 | 384;
            } else {
                int i26 = i14;
                if ((i2 & 384) == 0) {
                    i26 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
                }
                i16 = i15;
                i17 = i26;
            }
            if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378 || (i17 & 147) != 146, i9 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "539@26179L22");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 512) != 0) {
                        i9 &= -1879048193;
                    }
                    function212 = function22;
                    menuItemColors4 = menuItemColors;
                    paddingValues2 = paddingValues;
                    i19 = i17;
                    i20 = 1;
                    function214 = function26;
                    function215 = function27;
                    i23 = i9;
                    mutableInteractionSource2 = mutableInteractionSource;
                    function213 = function25;
                } else {
                    Modifier.Companion companion = i25 != 0 ? Modifier.INSTANCE : modifier;
                    function212 = i5 != 0 ? null : function22;
                    Function2<? super Composer, ? super Integer, Unit> function216 = i6 != 0 ? null : function26;
                    Function2<? super Composer, ? super Integer, Unit> function217 = i7 != 0 ? null : function27;
                    if (i8 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 512) != 0) {
                        i18 = i10;
                        i22 = i13;
                        i21 = i16;
                        modifier = companion;
                        i19 = i17;
                        i20 = 1;
                        menuItemColors3 = MenuDefaults.INSTANCE.m3528selectableItemColorsHlaysQ4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 48, 2047);
                        startRestartGroup = startRestartGroup;
                        i9 &= -1879048193;
                    } else {
                        modifier = companion;
                        i18 = i10;
                        i19 = i17;
                        i20 = 1;
                        i21 = i16;
                        i22 = i13;
                        menuItemColors3 = menuItemColors;
                    }
                    PaddingValues dropdownMenuSelectableItemContentPadding = i18 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuSelectableItemContentPadding() : paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = i22 != 0 ? null : mutableInteractionSource;
                    if (i21 != 0) {
                        menuItemColors4 = menuItemColors3;
                        paddingValues2 = dropdownMenuSelectableItemContentPadding;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i23 = i9;
                        function214 = function216;
                        function215 = function217;
                        function213 = null;
                    } else {
                        function213 = function25;
                        menuItemColors4 = menuItemColors3;
                        paddingValues2 = dropdownMenuSelectableItemContentPadding;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i23 = i9;
                        function214 = function216;
                        function215 = function217;
                    }
                }
                boolean z5 = z3;
                Modifier modifier3 = modifier;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712004930, i23, i19, "androidx.compose.material3.DropdownMenuItem (Menu.kt:543)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1336963546, "CC(remember):Menu.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DropdownMenuItem$lambda$4$0;
                            DropdownMenuItem$lambda$4$0 = MenuKt.DropdownMenuItem$lambda$4$0((SemanticsPropertyReceiver) obj);
                            return DropdownMenuItem$lambda$4$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i27 = i19;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) rememberedValue, i20, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1336961343, "CC(remember):Menu.kt#9igjgp");
                boolean z6 = ((i23 & 112) == 32) | ((i23 & 14) == 4);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DropdownMenuItem$lambda$5$0;
                            DropdownMenuItem$lambda$5$0 = MenuKt.DropdownMenuItem$lambda$5$0(Function1.this, z);
                            return DropdownMenuItem$lambda$5$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i28 = i27 << 3;
                Function2<? super Composer, ? super Integer, Unit> function218 = function213;
                Function2<? super Composer, ? super Integer, Unit> function219 = function212;
                DropdownMenuItemContent(z, (Function0) rememberedValue2, function2, semantics$default, function218, function219, function214, function215, z5, menuItemColors4, menuItemShapes, paddingValues2, mutableInteractionSource2, startRestartGroup, (i23 & 910) | ((i27 << 6) & 57344) | (458752 & i23) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (1879048192 & i23), (i28 & 896) | ((i23 >> 9) & 14) | (i28 & 112));
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function29 = function218;
                menuItemColors2 = menuItemColors4;
                z4 = z5;
                function211 = function215;
                function210 = function214;
                function28 = function219;
                modifier2 = modifier3;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function28 = function22;
                paddingValues2 = paddingValues;
                function29 = function25;
                z4 = z3;
                function210 = function26;
                function211 = function27;
                modifier2 = modifier;
                menuItemColors2 = menuItemColors;
                mutableInteractionSource2 = mutableInteractionSource;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItem$lambda$6;
                        DropdownMenuItem$lambda$6 = MenuKt.DropdownMenuItem$lambda$6(z, function1, function2, menuItemShapes, modifier2, function28, function210, function211, z4, menuItemColors2, paddingValues2, mutableInteractionSource2, function29, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItem$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i9 = i4;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i15 = i3 & 4096;
        if (i15 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378 || (i17 & 147) != 146, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$5$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$4$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void DropdownMenuItem(final boolean z, final Function0 function0, final Function2 function2, final MenuItemShapes menuItemShapes, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0 function02;
        Function2 function25;
        MenuItemShapes menuItemShapes2;
        Modifier modifier2;
        int i5;
        int i6;
        Function2 function26;
        int i7;
        final Function2 function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final Function2 function28;
        final boolean z3;
        final MenuItemColors menuItemColors2;
        final PaddingValues paddingValues2;
        final Function2 function29;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        MenuItemColors menuItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        MenuItemColors menuItemColors4;
        Modifier modifier4;
        PaddingValues paddingValues3;
        Function2 function210;
        boolean z4;
        Function2 function211;
        Function2 function212;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-151119870);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(selected,onClick,text,shapes,modifier,leadingIcon,checkedLeadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource)613@29737L447:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            function25 = function2;
            i4 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
        } else {
            function25 = function2;
        }
        if ((i & 3072) == 0) {
            menuItemShapes2 = menuItemShapes;
            i4 |= startRestartGroup.changed(menuItemShapes2) ? 2048 : 1024;
        } else {
            menuItemShapes2 = menuItemShapes;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function26 = function23;
            } else {
                function26 = function23;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function27 = function24;
            } else {
                function27 = function24;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i9 = i8;
                i4 |= startRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(menuItemColors)) {
                        i16 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i16;
                    }
                    i16 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i16;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else {
                    i11 = i10;
                    if ((i2 & 6) == 0) {
                        i12 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                    } else {
                        i12 = i2;
                    }
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else {
                    i14 = i13;
                    if ((i2 & 48) == 0) {
                        i12 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    }
                }
                i15 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "609@29557L22");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        function212 = function22;
                        z4 = z2;
                        menuItemColors4 = menuItemColors;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        function210 = function26;
                        function211 = function27;
                        modifier4 = modifier2;
                    } else {
                        Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                        Function2 function213 = i5 != 0 ? null : function22;
                        if (i6 != 0) {
                            function26 = null;
                        }
                        if (i7 != 0) {
                            function27 = null;
                        }
                        boolean z5 = i9 != 0 ? true : z2;
                        if ((i3 & 512) != 0) {
                            composer2 = startRestartGroup;
                            menuItemColors3 = MenuDefaults.INSTANCE.m3528selectableItemColorsHlaysQ4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 48, 2047);
                            i4 &= -1879048193;
                        } else {
                            composer2 = startRestartGroup;
                            menuItemColors3 = menuItemColors;
                        }
                        PaddingValues dropdownMenuSelectableItemContentPadding = i11 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuSelectableItemContentPadding() : paddingValues;
                        if (i14 != 0) {
                            menuItemColors4 = menuItemColors3;
                            modifier4 = companion;
                            paddingValues3 = dropdownMenuSelectableItemContentPadding;
                            function210 = function26;
                            z4 = z5;
                            function211 = function27;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            menuItemColors4 = menuItemColors3;
                            modifier4 = companion;
                            paddingValues3 = dropdownMenuSelectableItemContentPadding;
                            function210 = function26;
                            z4 = z5;
                            function211 = function27;
                        }
                        function212 = function213;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-151119870, i4, i15, "androidx.compose.material3.DropdownMenuItem (Menu.kt:613)");
                    }
                    DropdownMenuItem(z, (Function0<Unit>) function02, (Function2<? super Composer, ? super Integer, Unit>) function25, menuItemShapes2, modifier4, (Function2<? super Composer, ? super Integer, Unit>) function212, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function211, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) null, composer2, i4 & 2147483646, (i15 & 14) | 384 | (i15 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function28 = function212;
                    function29 = function210;
                    function27 = function211;
                    z3 = z4;
                    menuItemColors2 = menuItemColors4;
                    paddingValues2 = paddingValues3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function28 = function22;
                    z3 = z2;
                    menuItemColors2 = menuItemColors;
                    paddingValues2 = paddingValues;
                    function29 = function26;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DropdownMenuItem$lambda$7;
                            DropdownMenuItem$lambda$7 = MenuKt.DropdownMenuItem$lambda$7(z, function0, function2, menuItemShapes, modifier3, function28, function29, function27, z3, menuItemColors2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return DropdownMenuItem$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            i9 = i8;
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i15 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i15 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final MenuItemShapes menuItemShapes, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MenuItemShapes menuItemShapes2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z3;
        final MenuItemColors menuItemColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Composer composer3;
        MenuItemColors menuItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        MenuItemColors menuItemColors4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function215;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function216;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(829641699);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(selected,onClick,text,shapes,modifier,leadingIcon,selectedLeadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource,supportingText)686@33166L27,682@33026L503:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            function26 = function2;
            i4 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        } else {
            function26 = function2;
        }
        if ((i & 3072) == 0) {
            menuItemShapes2 = menuItemShapes;
            i4 |= startRestartGroup.changed(menuItemShapes2) ? 2048 : 1024;
        } else {
            menuItemShapes2 = menuItemShapes;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                function27 = function23;
            } else {
                function27 = function23;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function28 = function24;
            } else {
                function28 = function24;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(menuItemColors)) {
                    i16 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i16;
                }
                i16 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i16;
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
                i11 = i2 | 6;
                i10 = i9;
            } else {
                i10 = i9;
                if ((i2 & 6) == 0) {
                    i11 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                } else {
                    i11 = i2;
                }
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
                i13 = i12;
            } else {
                i13 = i12;
                if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                }
            }
            int i18 = i11;
            i14 = i3 & 4096;
            if (i14 == 0) {
                i15 = i18 | 384;
            } else {
                int i19 = i18;
                if ((i2 & 384) == 0) {
                    i19 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
                }
                i15 = i19;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 147) != 146, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "677@32792L22");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    companion = modifier;
                    function216 = function22;
                    z4 = z2;
                    menuItemColors4 = menuItemColors;
                    paddingValues3 = paddingValues;
                    mutableInteractionSource3 = mutableInteractionSource;
                    function213 = function25;
                    composer3 = startRestartGroup;
                    function214 = function27;
                    function215 = function28;
                } else {
                    companion = i17 != 0 ? Modifier.INSTANCE : modifier;
                    Function2<? super Composer, ? super Integer, Unit> function217 = i5 != 0 ? null : function22;
                    if (i6 != 0) {
                        function27 = null;
                    }
                    if (i7 != 0) {
                        function28 = null;
                    }
                    boolean z5 = i8 != 0 ? true : z2;
                    if ((i3 & 512) != 0) {
                        menuItemColors3 = MenuDefaults.INSTANCE.m3528selectableItemColorsHlaysQ4(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 48, 2047);
                        composer3 = startRestartGroup;
                        i4 &= -1879048193;
                    } else {
                        composer3 = startRestartGroup;
                        menuItemColors3 = menuItemColors;
                    }
                    PaddingValues dropdownMenuSelectableItemContentPadding = i10 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuSelectableItemContentPadding() : paddingValues;
                    MutableInteractionSource mutableInteractionSource4 = i13 != 0 ? null : mutableInteractionSource;
                    if (i14 != 0) {
                        menuItemColors4 = menuItemColors3;
                        function213 = null;
                    } else {
                        function213 = function25;
                        menuItemColors4 = menuItemColors3;
                    }
                    function214 = function27;
                    z4 = z5;
                    function215 = function28;
                    paddingValues3 = dropdownMenuSelectableItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource4;
                    function216 = function217;
                }
                composer3.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(829641699, i4, i15, "androidx.compose.material3.DropdownMenuItem (Menu.kt:681)");
                }
                ComposerKt.sourceInformationMarkerStart(composer3, -1578219522, "CC(remember):Menu.kt#9igjgp");
                Object rememberedValue = composer3.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DropdownMenuItem$lambda$8$0;
                            DropdownMenuItem$lambda$8$0 = MenuKt.DropdownMenuItem$lambda$8$0((SemanticsPropertyReceiver) obj);
                            return DropdownMenuItem$lambda$8$0;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                int i20 = (i4 & 1022) | (57344 & (i15 << 6)) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (1879048192 & i4);
                int i21 = i15 << 3;
                Composer composer4 = composer3;
                DropdownMenuItemContent(z, function02, function26, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), function213, function216, function214, function215, z4, menuItemColors4, menuItemShapes2, paddingValues3, mutableInteractionSource3, composer4, i20, ((i4 >> 9) & 14) | (i21 & 112) | (i21 & 896));
                composer2 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                function210 = function213;
                function29 = function216;
                function211 = function214;
                function212 = function215;
                z3 = z4;
                menuItemColors2 = menuItemColors4;
                paddingValues2 = paddingValues3;
                mutableInteractionSource2 = mutableInteractionSource3;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
                function29 = function22;
                z3 = z2;
                menuItemColors2 = menuItemColors;
                mutableInteractionSource2 = mutableInteractionSource;
                function210 = function25;
                function211 = function27;
                function212 = function28;
                paddingValues2 = paddingValues;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItem$lambda$9;
                        DropdownMenuItem$lambda$9 = MenuKt.DropdownMenuItem$lambda$9(z, function0, function2, menuItemShapes, modifier2, function29, function211, function212, z3, menuItemColors2, paddingValues2, mutableInteractionSource2, function210, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItem$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i182 = i11;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$8$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8886getRadioButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m3569DropdownMenuContentQj0Zi0g(Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, ScrollState scrollState, final Shape shape, final long j, final float f, final float f2, final BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final ScrollState scrollState2;
        Composer composer2;
        final Modifier modifier2;
        Object currentState;
        boolean z;
        boolean z2;
        String str;
        Object currentState2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(848986741);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuContent)N(modifier,expandedState,transformOriginState,scrollState,shape,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,content)1052@48379L47,1054@48562L14,1055@48640L14,1057@48691L146,1062@48875L146,1066@49066L7,1069@49141L587,1086@49900L277,1067@49078L1099:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(scrollState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(848986741, i2, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:1050)");
            }
            final Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | ((i2 >> 3) & 14), 0);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            Function3 function32 = new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$0;
                    DropdownMenuContent_Qj0Zi0g$lambda$0 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return DropdownMenuContent_Qj0Zi0g$lambda$0;
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
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            boolean booleanValue = ((Boolean) currentState).booleanValue();
            startRestartGroup.startReplaceGroup(143964305);
            ComposerKt.sourceInformation(startRestartGroup, "CN(expanded):Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                z = booleanValue;
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1058)");
            } else {
                z = booleanValue;
            }
            float f3 = z ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf = Float.valueOf(f3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(updateTransition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean booleanValue2 = ((Boolean) ((State) rememberedValue).getValue()).booleanValue();
            startRestartGroup.startReplaceGroup(143964305);
            ComposerKt.sourceInformation(startRestartGroup, "CN(expanded):Menu.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                z2 = booleanValue2;
                str = "CN(expanded):Menu.kt#uh7d8r";
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1058)");
            } else {
                z2 = booleanValue2;
                str = "CN(expanded):Menu.kt#uh7d8r";
            }
            float f4 = z2 ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2 = Float.valueOf(f4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(updateTransition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Boolean> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str2 = str;
            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function33 = new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$3;
                    DropdownMenuContent_Qj0Zi0g$lambda$3 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$3(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return DropdownMenuContent_Qj0Zi0g$lambda$3;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState2 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed4 = startRestartGroup.changed(updateTransition);
                currentState2 = startRestartGroup.rememberedValue();
                if (changed4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot2 = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable2 = companion2.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = updateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        startRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion2.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            boolean booleanValue3 = ((Boolean) currentState2).booleanValue();
            startRestartGroup.startReplaceGroup(892761509);
            ComposerKt.sourceInformation(startRestartGroup, str2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1063)");
            }
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf3 = Float.valueOf(f5);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed5 = startRestartGroup.changed(updateTransition);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean booleanValue4 = ((Boolean) ((State) rememberedValue3).getValue()).booleanValue();
            startRestartGroup.startReplaceGroup(892761509);
            ComposerKt.sourceInformation(startRestartGroup, str2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1063)");
            }
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf4 = Float.valueOf(f6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed6 = startRestartGroup.changed(updateTransition);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Boolean> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) function33.invoke(((State) rememberedValue4).getValue(), startRestartGroup, 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final boolean booleanValue5 = ((Boolean) consume).booleanValue();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -167489024, "CC(remember):Menu.kt#9igjgp");
            boolean changed7 = startRestartGroup.changed(booleanValue5) | startRestartGroup.changed(createTransitionAnimation) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(mutableTransitionState))) | startRestartGroup.changed(createTransitionAnimation2) | ((i2 & 896) == 256);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i3 = i2;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DropdownMenuContent_Qj0Zi0g$lambda$6$0;
                        DropdownMenuContent_Qj0Zi0g$lambda$6$0 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$6$0(booleanValue5, mutableTransitionState, mutableState, createTransitionAnimation, createTransitionAnimation2, (GraphicsLayerScope) obj);
                        return DropdownMenuContent_Qj0Zi0g$lambda$6$0;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue5 = function1;
            } else {
                i3 = i2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier2 = modifier;
            scrollState2 = scrollState;
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            SurfaceKt.m4112SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) rememberedValue5), shape, j, 0L, f, f2, borderStroke, ComposableLambdaKt.rememberComposableLambda(-1463404422, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuContent_Qj0Zi0g$lambda$7;
                    DropdownMenuContent_Qj0Zi0g$lambda$7 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$7(Modifier.this, scrollState2, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuContent_Qj0Zi0g$lambda$7;
                }
            }, startRestartGroup, 54), startRestartGroup, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            scrollState2 = scrollState;
            composer2 = startRestartGroup;
            modifier2 = modifier;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuContent_Qj0Zi0g$lambda$8;
                    DropdownMenuContent_Qj0Zi0g$lambda$8 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$8(Modifier.this, mutableTransitionState, mutableState, scrollState2, shape, j, f, f2, borderStroke, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuContent_Qj0Zi0g$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-745957716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-745957716, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1057)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$3(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(2839488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2839488, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1062)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuContent_Qj0Zi0g$lambda$6$0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float f;
        float f2 = 0.8f;
        float f3 = 1.0f;
        if (!z) {
            f = DropdownMenuContent_Qj0Zi0g$lambda$2(state);
        } else {
            f = ((Boolean) mutableTransitionState.getTargetState()).booleanValue() ? 1.0f : 0.8f;
        }
        graphicsLayerScope.setScaleX(f);
        if (!z) {
            f2 = DropdownMenuContent_Qj0Zi0g$lambda$2(state);
        } else if (((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f2 = 1.0f;
        }
        graphicsLayerScope.setScaleY(f2);
        if (!z) {
            f3 = DropdownMenuContent_Qj0Zi0g$lambda$5(state2);
        } else if (!((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f3 = 0.0f;
        }
        graphicsLayerScope.setAlpha(f3);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuContent_Qj0Zi0g$lambda$7(Modifier modifier, ScrollState scrollState, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1087@49910L261:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1463404422, i, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1087)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m1203paddingVpY3zN4$default(modifier, 0.0f, DropdownMenuVerticalPadding, 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
        }
        return Unit.INSTANCE;
    }

    public static final void DropdownMenuItemContent(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final boolean z2, final MenuItemColors menuItemColors, final MenuItemShapes menuItemShapes, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Composer startRestartGroup = composer.startRestartGroup(931419046);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)N(selected,onClick,text,modifier,supportingText,leadingIcon,selectedLeadingIcon,trailingIcon,enabled,colors,shapes,contentPadding,interactionSource)1119@51000L16,1120@51078L14,1121@51147L14,1122@51225L14,1126@51370L85,1127@51476L47,1149@52213L5815,1132@51653L6375:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function26 = function2;
            i3 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        } else {
            function26 = function2;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changed(menuItemColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(menuItemShapes) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i4 & 147) == 146) ? false : true, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(931419046, i5, i4, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:1114)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(-1878332427);
                ComposerKt.sourceInformation(startRestartGroup, "1116@50823L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1740523949, "CC(remember):Menu.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            } else {
                startRestartGroup.startReplaceGroup(1740523298);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(menuItemColors.m3542containerColorWaAFU9c$material3(z2, z), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            Shape shapeByInteraction = shapeByInteraction(menuItemShapes, z, value3, startRestartGroup, (i4 & 14) | ((i5 << 3) & 112));
            final boolean z3 = (function23 == null && function24 == null) ? false : true;
            boolean z4 = function25 != null;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            if (function22 != null) {
                paddingValues2 = DropdownMenuSelectableItemWithSupportTexPadding;
            } else {
                paddingValues2 = DropdownMenuSelectableItemPadding;
            }
            composer2 = startRestartGroup;
            final boolean z5 = z4;
            SurfaceKt.m4113Surfaced85dljk(z, function0, PaddingKt.padding(fillMaxWidth$default, paddingValues2), z2, shapeByInteraction, DropdownMenuItemContent$lambda$1(m200animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(532192956, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$2;
                    DropdownMenuItemContent$lambda$2 = MenuKt.DropdownMenuItemContent$lambda$2(PaddingValues.this, function23, function24, function25, z3, menuItemColors, z2, z, z5, value, value2, function22, function26, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$2;
                }
            }, composer2, 54), composer2, (i5 & 126) | ((i5 >> 15) & 7168), 48, 960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$3;
                    DropdownMenuItemContent$lambda$3 = MenuKt.DropdownMenuItemContent$lambda$3(z, function0, function2, modifier, function22, function23, function24, function25, z2, menuItemColors, menuItemShapes, paddingValues, mutableInteractionSource, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2(final PaddingValues paddingValues, final Function2 function2, final Function2 function22, final Function2 function23, final boolean z, final MenuItemColors menuItemColors, final boolean z2, final boolean z3, final boolean z4, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, final Function2 function24, final Function2 function25, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1151@52289L10,1151@52312L5710,1151@52258L5764:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(532192956, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous> (Menu.kt:1151)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1001050475, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$2$0;
                    DropdownMenuItemContent$lambda$2$0 = MenuKt.DropdownMenuItemContent$lambda$2$0(PaddingValues.this, function2, function22, function23, z, menuItemColors, z2, z3, z4, finiteAnimationSpec, finiteAnimationSpec2, function24, function25, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$2$0;
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0(PaddingValues paddingValues, Function2 function2, Function2 function22, final Function2 function23, boolean z, MenuItemColors menuItemColors, boolean z2, final boolean z3, final boolean z4, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, final Function2 function24, final Function2 function25, Composer composer, int i) {
        final Function2 function26;
        final Function2 function27;
        ComposerKt.sourceInformation(composer, "C1152@52326L5686:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001050475, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:1152)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1275sizeInqDBjuR0$default(Modifier.INSTANCE, DropdownMenuItemDefaultMinWidth, SegmentedMenuTokens.INSTANCE.m5555getItemD9Ej5fM(), DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            DropdownMenuItemMeasurePolicy dropdownMenuItemMeasurePolicy = new DropdownMenuItemMeasurePolicy((function2 == null && function22 == null) ? false : true, function23 != null);
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
            Updater.m5872setimpl(m5864constructorimpl, dropdownMenuItemMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1630792820, "C1204@55353L1086,1202@55218L1221:Menu.kt#uh7d8r");
            if (z) {
                composer.startReplaceGroup(1630732834);
                ComposerKt.sourceInformation(composer, "1164@52928L2246,1162@52778L2396");
                function26 = function2;
                function27 = function22;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(menuItemColors.m3557leadingIconColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(1729823385, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItemContent$lambda$2$0$0$0;
                        DropdownMenuItemContent$lambda$2$0$0$0 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0(Function2.this, function26, z3, finiteAnimationSpec, finiteAnimationSpec2, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItemContent$lambda$2$0$0$0;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                function26 = function2;
                function27 = function22;
                composer.startReplaceGroup(1633081518);
                composer.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(menuItemColors.m3558textColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(-237456556, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$2$0$0$1;
                    DropdownMenuItemContent$lambda$2$0$0$1 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$1(z4, function24, function25, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$2$0$0$1;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (z4) {
                composer.startReplaceGroup(1634378713);
                ComposerKt.sourceInformation(composer, "1232@56659L494,1230@56508L645");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(menuItemColors.m3559trailingIconColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(-1717686974, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItemContent$lambda$2$0$0$2;
                        DropdownMenuItemContent$lambda$2$0$0$2 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$2(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItemContent$lambda$2$0$0$2;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1635044686);
                composer.endReplaceGroup();
            }
            if (z) {
                composer.startReplaceGroup(1635169213);
                ComposerKt.sourceInformation(composer, "1247@57312L417");
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, GhostLeadingIconLayoutId);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, layoutId);
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
                ComposerKt.sourceInformationMarkerStart(composer, 2036017915, "C1248@57421L282,1248@57402L301:Menu.kt#uh7d8r");
                WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(15262301, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit DropdownMenuItemContent$lambda$2$0$0$3$0;
                        DropdownMenuItemContent$lambda$2$0$0$3$0 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$3$0(Function2.this, function27, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return DropdownMenuItemContent$lambda$2$0$0$3$0;
                    }
                }, composer, 54), composer, 6);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1635616078);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0(final Function2 function2, final Function2 function22, boolean z, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1165@52958L2190:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1729823385, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1165)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, LeadingIconLayoutId);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1776548131, "C:Menu.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(-1776520232);
                ComposerKt.sourceInformation(composer, "");
                if (function22 == null) {
                    composer.startReplaceGroup(-1776468989);
                    ComposerKt.sourceInformation(composer, "1187@54525L132,1171@53317L1340");
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(finiteAnimationSpec, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(finiteAnimationSpec, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-371859771, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit DropdownMenuItemContent$lambda$2$0$0$0$0$0;
                            DropdownMenuItemContent$lambda$2$0$0$0$0$0 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$0(Function2.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return DropdownMenuItemContent$lambda$2$0$0$0$0$0;
                        }
                    }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    composer.endReplaceGroup();
                } else if (z) {
                    composer.startReplaceGroup(-1775080685);
                    ComposerKt.sourceInformation(composer, "1191@54776L25,1191@54757L44");
                    WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-858426922, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit DropdownMenuItemContent$lambda$2$0$0$0$0$1;
                            DropdownMenuItemContent$lambda$2$0$0$0$0$1 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$1(Function2.this, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return DropdownMenuItemContent$lambda$2$0$0$0$0$1;
                        }
                    }, composer, 54), composer, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1774951973);
                    ComposerKt.sourceInformation(composer, "1193@54906L17,1193@54887L36");
                    WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-1181060170, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit DropdownMenuItemContent$lambda$2$0$0$0$0$2;
                            DropdownMenuItemContent$lambda$2$0$0$0$0$2 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$2(Function2.this, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return DropdownMenuItemContent$lambda$2$0$0$0$0$2;
                        }
                    }, composer, 54), composer, 6);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1774797190);
                ComposerKt.sourceInformation(composer, "1196@55058L26,1196@55039L45");
                WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-358394575, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit DropdownMenuItemContent$lambda$2$0$0$0$0$3;
                        DropdownMenuItemContent$lambda$2$0$0$0$0$3 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$3(Function2.this, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return DropdownMenuItemContent$lambda$2$0$0$0$0$3;
                    }
                }, composer, 54), composer, 6);
                composer.endReplaceGroup();
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0$0$0(final Function2 function2, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1188@54590L25,1188@54571L44:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-371859771, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1188)");
        }
        WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-337993913, true, new Function3() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit DropdownMenuItemContent$lambda$2$0$0$0$0$0$0;
                DropdownMenuItemContent$lambda$2$0$0$0$0$0$0 = MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$0$0(Function2.this, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return DropdownMenuItemContent$lambda$2$0$0$0$0$0$0;
            }
        }, composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0$0$0$0(Function2 function2, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1188@54592L21:Menu.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337993913, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1188)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0$0$1(Function2 function2, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1191@54778L21:Menu.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-858426922, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1191)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0$0$2(Function2 function2, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1193@54908L13:Menu.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1181060170, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1193)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$0$0$3(Function2 function2, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1196@55074L8:Menu.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358394575, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1196)");
            }
            Intrinsics.checkNotNull(function2);
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$1(boolean z, Function2 function2, Function2 function22, Composer composer, int i) {
        float m9732constructorimpl;
        ComposerKt.sourceInformation(composer, "C1205@55379L1038:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237456556, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1205)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextLayoutId);
            if (z) {
                m9732constructorimpl = DropdownMenuIconTextPadding;
            } else {
                m9732constructorimpl = Dp.m9732constructorimpl(0);
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(layoutId, 0.0f, 0.0f, m9732constructorimpl, 0.0f, 11, null);
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 705208618, "C:Menu.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(705233169);
                ComposerKt.sourceInformation(composer, "1218@56026L259");
                LabelWithSupportingText(function2, LayoutIdKt.layoutId(Modifier.INSTANCE, TextLayoutId), function22, composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(705551694);
                ComposerKt.sourceInformation(composer, "1224@56355L6");
                function22.invoke(composer, 0);
                composer.endReplaceGroup();
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$2(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1233@56689L438:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717686974, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1233)");
            }
            Modifier m1256defaultMinSizeVpY3zN4$default = SizeKt.m1256defaultMinSizeVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TrailingIconLayoutId), SegmentedMenuTokens.INSTANCE.m5561getItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1256defaultMinSizeVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -411091719, "C1240@57083L14:Menu.kt#uh7d8r");
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
    public static final Unit DropdownMenuItemContent$lambda$2$0$0$3$0(Function2 function2, Function2 function22, BoxScope boxScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:Menu.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(15262301, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1249)");
            }
            if (function2 != null) {
                composer.startReplaceGroup(-587263120);
                ComposerKt.sourceInformation(composer, "1250@57518L13");
                function2.invoke(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-587172321);
                ComposerKt.sourceInformation(composer, "1252@57631L8");
                Intrinsics.checkNotNull(function22);
                function22.invoke(composer, 0);
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

    public static final boolean getHasRoundedCornerShapes(MenuItemShapes menuItemShapes) {
        return (menuItemShapes.getShape() instanceof RoundedCornerShape) && (menuItemShapes.getSelectedShape() instanceof RoundedCornerShape);
    }

    public static final boolean getHasRoundedCornerShapes(MenuGroupShapes menuGroupShapes) {
        return (menuGroupShapes.getShape() instanceof RoundedCornerShape) && (menuGroupShapes.getInactiveShape() instanceof RoundedCornerShape);
    }

    public static final boolean getHasCornerBasedShapes(MenuItemShapes menuItemShapes) {
        return (menuItemShapes.getShape() instanceof CornerBasedShape) && (menuItemShapes.getSelectedShape() instanceof CornerBasedShape);
    }

    public static final boolean getHasCornerBasedShapes(MenuGroupShapes menuGroupShapes) {
        return (menuGroupShapes.getShape() instanceof CornerBasedShape) && (menuGroupShapes.getInactiveShape() instanceof CornerBasedShape);
    }

    public static final void DropdownMenuItemContent(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i) {
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i2;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MenuItemColors menuItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1325192924);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)N(text,onClick,modifier,leadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource)1296@59147L2491:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            function24 = function2;
            i2 = (startRestartGroup.changedInstance(function24) ? 4 : 2) | i;
        } else {
            function24 = function2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i2 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            function26 = function23;
            i2 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            menuItemColors2 = menuItemColors;
            i2 |= startRestartGroup.changed(menuItemColors2) ? 1048576 : 524288;
        } else {
            menuItemColors2 = menuItemColors;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i2 |= startRestartGroup.changed(mutableInteractionSource2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325192924, i2, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:1295)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1275sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m395clickableO2vRcR0$default(modifier, mutableInteractionSource2, RippleKt.m3792rippleH2RKhps$default(true, 0.0f, 0L, 6, null), z, null, null, function02, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuListItemContainerHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 35357248, "C1316@60004L10,1316@60027L1605,1316@59973L1659:Menu.kt#uh7d8r");
            final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
            final MenuItemColors menuItemColors3 = menuItemColors2;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function25;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(865999929, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$4$0;
                    DropdownMenuItemContent$lambda$4$0 = MenuKt.DropdownMenuItemContent$lambda$4$0(Function2.this, menuItemColors3, z, function28, rowScopeInstance, function27, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$4$0;
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$5;
                    DropdownMenuItemContent$lambda$5 = MenuKt.DropdownMenuItemContent$lambda$5(Function2.this, function0, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$4$0(final Function2 function2, MenuItemColors menuItemColors, boolean z, final Function2 function22, final RowScope rowScope, final Function2 function23, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1326@60487L764,1326@60408L843:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(865999929, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:1317)");
            }
            if (function2 != null) {
                composer.startReplaceGroup(-864613344);
                ComposerKt.sourceInformation(composer, "1320@60208L173,1318@60084L297");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(MenuItemColors.m3539leadingIconColorWaAFU9c$material3$default(menuItemColors, z, false, 2, null))), ComposableLambdaKt.rememberComposableLambda(1241781204, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItemContent$lambda$4$0$0;
                        DropdownMenuItemContent$lambda$4$0$0 = MenuKt.DropdownMenuItemContent$lambda$4$0$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItemContent$lambda$4$0$0;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-864297175);
                composer.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(MenuItemColors.m3540textColorWaAFU9c$material3$default(menuItemColors, z, false, 2, null))), ComposableLambdaKt.rememberComposableLambda(-893579015, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenuItemContent$lambda$4$0$1;
                    DropdownMenuItemContent$lambda$4$0$1 = MenuKt.DropdownMenuItemContent$lambda$4$0$1(RowScope.this, function2, function22, function23, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenuItemContent$lambda$4$0$1;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (function22 != null) {
                composer.startReplaceGroup(-863399043);
                ComposerKt.sourceInformation(composer, "1350@61433L175,1348@61308L300");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(MenuItemColors.m3541trailingIconColorWaAFU9c$material3$default(menuItemColors, z, false, 2, null))), ComposableLambdaKt.rememberComposableLambda(-782441013, true, new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuItemContent$lambda$4$0$2;
                        DropdownMenuItemContent$lambda$4$0$2 = MenuKt.DropdownMenuItemContent$lambda$4$0$2(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuItemContent$lambda$4$0$2;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-863079991);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$4$0$0(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1321@60230L133:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241781204, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1321)");
            }
            Modifier m1256defaultMinSizeVpY3zN4$default = SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, ListTokens.INSTANCE.m5331getItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1256defaultMinSizeVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1523115460, "C1322@60328L13:Menu.kt#uh7d8r");
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
    public static final Unit DropdownMenuItemContent$lambda$4$0$1(RowScope rowScope, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i) {
        float m9732constructorimpl;
        float m9732constructorimpl2;
        ComposerKt.sourceInformation(composer, "C1327@60505L732:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893579015, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1327)");
            }
            Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            if (function2 != null) {
                m9732constructorimpl = DropdownMenuItemHorizontalPadding;
            } else {
                m9732constructorimpl = Dp.m9732constructorimpl(0);
            }
            float f = m9732constructorimpl;
            if (function22 != null) {
                m9732constructorimpl2 = DropdownMenuItemHorizontalPadding;
            } else {
                m9732constructorimpl2 = Dp.m9732constructorimpl(0);
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(weight$default, f, 0.0f, m9732constructorimpl2, 0.0f, 10, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -192291042, "C1344@61213L6:Menu.kt#uh7d8r");
            function23.invoke(composer, 0);
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
    public static final Unit DropdownMenuItemContent$lambda$4$0$2(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1351@61455L135:Menu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782441013, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1351)");
            }
            Modifier m1256defaultMinSizeVpY3zN4$default = SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, ListTokens.INSTANCE.m5342getItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1256defaultMinSizeVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -845165948, "C1352@61554L14:Menu.kt#uh7d8r");
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect intRect, IntRect intRect2) {
        float max;
        float f = 1.0f;
        if (intRect2.getLeft() < intRect.getRight()) {
            if (intRect2.getRight() <= intRect.getLeft()) {
                max = 1.0f;
            } else if (intRect2.getWidth() != 0) {
                max = (((Math.max(intRect.getLeft(), intRect2.getLeft()) + Math.min(intRect.getRight(), intRect2.getRight())) / 2) - intRect2.getLeft()) / intRect2.getWidth();
            }
            if (intRect2.getTop() < intRect.getBottom()) {
                if (intRect2.getBottom() > intRect.getTop()) {
                    if (intRect2.getHeight() != 0) {
                        f = (((Math.max(intRect.getTop(), intRect2.getTop()) + Math.min(intRect.getBottom(), intRect2.getBottom())) / 2) - intRect2.getTop()) / intRect2.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(max, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(max, f);
        }
        max = 0.0f;
        if (intRect2.getTop() < intRect.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(max, f);
    }

    private static final void LabelWithSupportingText(final Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(888023637);
        ComposerKt.sourceInformation(startRestartGroup, "C(LabelWithSupportingText)N(supportingText,modifier,content)1402@63237L204:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888023637, i2, -1, "androidx.compose.material3.LabelWithSupportingText (Menu.kt:1400)");
            }
            int i3 = i2 >> 3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1246244488, "C1403@63306L10,1403@63275L72,1404@63387L10,1404@63356L79:Menu.kt#uh7d8r");
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getLabelLarge(), function22, startRestartGroup, i3 & 112);
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getBodyMedium(), function2, startRestartGroup, (i2 << 3) & 112);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LabelWithSupportingText$lambda$1;
                    LabelWithSupportingText$lambda$1 = MenuKt.LabelWithSupportingText$lambda$1(Function2.this, modifier, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LabelWithSupportingText$lambda$1;
                }
            });
        }
    }

    private static final Shape shapeByInteraction(MenuItemShapes menuItemShapes, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(1804150103);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,selected,animationSpec):Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1804150103, i, -1, "androidx.compose.material3.shapeByInteraction (Menu.kt:1414)");
        }
        if (z) {
            shape = menuItemShapes.getSelectedShape();
        } else {
            shape = menuItemShapes.getShape();
        }
        if (getHasRoundedCornerShapes(menuItemShapes)) {
            composer.startReplaceGroup(215284099);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(-1378528456, composer.joinKey(menuItemShapes.getShape(), menuItemShapes.getSelectedShape()));
            ComposerKt.sourceInformation(composer, "1424@63882L65");
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
        if (getHasCornerBasedShapes(menuItemShapes)) {
            composer.startReplaceGroup(215469541);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(-1378522474, composer.joinKey(menuItemShapes.getShape(), menuItemShapes.getSelectedShape()));
            ComposerKt.sourceInformation(composer, "1428@64069L63");
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
        composer.startReplaceGroup(215598315);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final Shape shapeByInteraction(MenuGroupShapes menuGroupShapes, boolean z, boolean z2, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(1230868161);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,hasBeenHovered,hovered,animationSpec):Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1230868161, i, -1, "androidx.compose.material3.shapeByInteraction (Menu.kt:1441)");
        }
        if (z && !z2) {
            shape = menuGroupShapes.getInactiveShape();
        } else {
            shape = menuGroupShapes.getShape();
        }
        if (getHasRoundedCornerShapes(menuGroupShapes)) {
            composer.startReplaceGroup(-1637034503);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(1748307970, composer.joinKey(menuGroupShapes.getShape(), menuGroupShapes.getInactiveShape()));
            ComposerKt.sourceInformation(composer, "1451@64648L65");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            Shape rememberAnimatedShape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape;
        }
        if (getHasCornerBasedShapes(menuGroupShapes)) {
            composer.startReplaceGroup(-1636849061);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(1748313952, composer.joinKey(menuGroupShapes.getShape(), menuGroupShapes.getInactiveShape()));
            ComposerKt.sourceInformation(composer, "1455@64835L63");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            Shape rememberAnimatedShape2 = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape2;
        }
        composer.startReplaceGroup(-1636720287);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final void WrappedLeadingIcon(final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1482876964);
        ComposerKt.sourceInformation(startRestartGroup, "C(WrappedLeadingIcon)N(content)1463@65021L205:Menu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482876964, i2, -1, "androidx.compose.material3.WrappedLeadingIcon (Menu.kt:1462)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, SegmentedMenuTokens.INSTANCE.m5558getItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, DropdownMenuIconTextPadding, 0.0f, 11, null);
            int i3 = ((i2 << 9) & 7168) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default);
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
            function3.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | 6));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WrappedLeadingIcon$lambda$0;
                    WrappedLeadingIcon$lambda$0 = MenuKt.WrappedLeadingIcon$lambda$0(Function3.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return WrappedLeadingIcon$lambda$0;
                }
            });
        }
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getMenuHorizontalMargin() {
        return MenuHorizontalMargin;
    }

    public static final float getDropdownMenuItemHorizontalPadding() {
        return DropdownMenuItemHorizontalPadding;
    }

    public static final float getDropdownMenuGroupVerticalPadding() {
        return DropdownMenuGroupVerticalPadding;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getDropdownMenuItemDefaultMinWidth() {
        return DropdownMenuItemDefaultMinWidth;
    }

    public static final float getDropdownMenuItemDefaultMaxWidth() {
        return DropdownMenuItemDefaultMaxWidth;
    }

    public static final float getDropdownMenuGroupDefaultMinHeight() {
        return DropdownMenuGroupDefaultMinHeight;
    }

    private static final boolean DropdownMenuGroup_BfByrIA$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long DropdownMenuItemContent$lambda$1(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    static {
        float f = 48;
        MenuVerticalMargin = Dp.m9732constructorimpl(f);
        float f2 = 8;
        MenuHorizontalMargin = Dp.m9732constructorimpl(f2);
        MenuListItemContainerHeight = Dp.m9732constructorimpl(f);
        float f3 = 12;
        DropdownMenuItemHorizontalPadding = Dp.m9732constructorimpl(f3);
        float f4 = 2;
        DropdownMenuGroupVerticalPadding = Dp.m9732constructorimpl(f4);
        float f5 = 4;
        DropdownMenuSelectableItemPadding = PaddingKt.m1196PaddingValuesYgX7TsA$default(Dp.m9732constructorimpl(f5), 0.0f, 2, null);
        DropdownMenuSelectableItemWithSupportTexPadding = PaddingKt.m1195PaddingValuesYgX7TsA(Dp.m9732constructorimpl(f5), Dp.m9732constructorimpl(f4));
        DropdownMenuIconTextPadding = PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? Dp.m9732constructorimpl(f3) : Dp.m9732constructorimpl(f2);
        DropdownMenuVerticalPadding = Dp.m9732constructorimpl(f2);
        DropdownMenuItemDefaultMinWidth = Dp.m9732constructorimpl(112);
        DropdownMenuItemDefaultMaxWidth = Dp.m9732constructorimpl(280);
        DropdownMenuGroupDefaultMinHeight = Dp.m9732constructorimpl(32);
    }
}
