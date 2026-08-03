package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabMediumTokens;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabLargeTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FabSmallTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
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
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001an\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001an\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0012\u001an\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0012\u001an\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u0012\u001ay\u0010 \u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\u0010¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b$\u0010%\u001ay\u0010&\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\u0010¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b'\u0010%\u001ay\u0010(\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\u0010¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b)\u0010%\u001ay\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b\u0010¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b+\u0010%\u001a\u008b\u0001\u0010 \u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b0\u00101\u001a\u008b\u0001\u0010&\u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b2\u00101\u001a\u008b\u0001\u0010(\u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b3\u00101\u001a\u008b\u0001\u0010*\u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b4\u00101\u001a»\u0001\u0010*\u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b8\u00109\u001aJ\u0010:\u001a\u00020\u0005*\u00020\u00052\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?2\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010A2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010AH\u0007\u001a\r\u0010[\u001a\u00020\\H\u0003¢\u0006\u0002\u0010]\u001a\r\u0010^\u001a\u00020_H\u0003¢\u0006\u0002\u0010`\"\u0010\u0010C\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010E\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010F\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010G\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010H\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010K\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010L\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010M\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010N\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010O\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u000e\u0010P\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Q\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010R\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010S\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010T\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010U\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u000e\u0010V\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010W\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010X\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010Y\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D\"\u0010\u0010Z\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010D¨\u0006a"}, d2 = {"FloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "FloatingActionButton-lF-WlFE", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/TextStyle;FFLandroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "SmallFloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "MediumFloatingActionButton", "MediumFloatingActionButton-X-z6DiA", "LargeFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "SmallExtendedFloatingActionButton", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "SmallExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MediumExtendedFloatingActionButton", "MediumExtendedFloatingActionButton-X-z6DiA", "LargeExtendedFloatingActionButton", "LargeExtendedFloatingActionButton-X-z6DiA", "ExtendedFloatingActionButton", "ExtendedFloatingActionButton-X-z6DiA", "text", "icon", "expanded", "", "SmallExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "MediumExtendedFloatingActionButton-ElI5-7k", "LargeExtendedFloatingActionButton-ElI5-7k", "ExtendedFloatingActionButton-ElI5-7k", "startPadding", "endPadding", "iconPadding", "ExtendedFloatingActionButton-qtIzBjc", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/TextStyle;FFFFFLandroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "animateFloatingActionButton", "visible", "alignment", "Landroidx/compose/ui/Alignment;", "targetScale", "", "scaleAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "alphaAnimationSpec", "SmallExtendedFabMinimumWidth", "F", "SmallExtendedFabMinimumHeight", "SmallExtendedFabPaddingStart", "SmallExtendedFabPaddingEnd", "SmallExtendedFabIconPadding", "SmallExtendedFabTextStyle", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MediumExtendedFabMinimumWidth", "MediumExtendedFabMinimumHeight", "MediumExtendedFabPaddingStart", "MediumExtendedFabPaddingEnd", "MediumExtendedFabIconPadding", "MediumExtendedFabTextStyle", "LargeExtendedFabMinimumWidth", "LargeExtendedFabMinimumHeight", "LargeExtendedFabPaddingStart", "LargeExtendedFabPaddingEnd", "LargeExtendedFabIconPadding", "LargeExtendedFabTextStyle", "ExtendedFabStartIconPadding", "ExtendedFabEndIconPadding", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "extendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "extendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float ExtendedFabEndIconPadding;
    private static final float ExtendedFabStartIconPadding;
    private static final float LargeExtendedFabIconPadding;
    private static final float MediumExtendedFabIconPadding;
    private static final float SmallExtendedFabMinimumWidth = ExtendedFabSmallTokens.INSTANCE.m5201getContainerHeightD9Ej5fM();
    private static final float SmallExtendedFabMinimumHeight = ExtendedFabSmallTokens.INSTANCE.m5201getContainerHeightD9Ej5fM();
    private static final float SmallExtendedFabPaddingStart = ExtendedFabSmallTokens.INSTANCE.m5204getLeadingSpaceD9Ej5fM();
    private static final float SmallExtendedFabPaddingEnd = ExtendedFabSmallTokens.INSTANCE.m5205getTrailingSpaceD9Ej5fM();
    private static final float SmallExtendedFabIconPadding = ExtendedFabSmallTokens.INSTANCE.m5202getIconLabelSpaceD9Ej5fM();
    private static final TypographyKeyTokens SmallExtendedFabTextStyle = TypographyKeyTokens.TitleMedium;
    private static final float MediumExtendedFabMinimumWidth = ExtendedFabMediumTokens.INSTANCE.m5186getContainerHeightD9Ej5fM();
    private static final float MediumExtendedFabMinimumHeight = ExtendedFabMediumTokens.INSTANCE.m5186getContainerHeightD9Ej5fM();
    private static final float MediumExtendedFabPaddingStart = ExtendedFabMediumTokens.INSTANCE.m5189getLeadingSpaceD9Ej5fM();
    private static final float MediumExtendedFabPaddingEnd = ExtendedFabMediumTokens.INSTANCE.m5190getTrailingSpaceD9Ej5fM();
    private static final TypographyKeyTokens MediumExtendedFabTextStyle = TypographyKeyTokens.TitleLarge;
    private static final float LargeExtendedFabMinimumWidth = ExtendedFabLargeTokens.INSTANCE.m5181getContainerHeightD9Ej5fM();
    private static final float LargeExtendedFabMinimumHeight = ExtendedFabLargeTokens.INSTANCE.m5181getContainerHeightD9Ej5fM();
    private static final float LargeExtendedFabPaddingStart = ExtendedFabLargeTokens.INSTANCE.m5184getLeadingSpaceD9Ej5fM();
    private static final float LargeExtendedFabPaddingEnd = ExtendedFabLargeTokens.INSTANCE.m5185getTrailingSpaceD9Ej5fM();
    private static final TypographyKeyTokens LargeExtendedFabTextStyle = TypographyKeyTokens.HeadlineSmall;
    private static final float ExtendedFabTextPadding = Dp.m9732constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m9732constructorimpl(80);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_ElI5_7k$lambda$1(Function2 function2, Function2 function22, Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m3165ExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3166ExtendedFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_qtIzBjc$lambda$1(Function2 function2, Function2 function22, Function0 function0, TextStyle textStyle, float f, float f2, float f3, float f4, float f5, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        m3167ExtendedFloatingActionButtonqtIzBjc(function2, function22, function0, textStyle, f, f2, f3, f4, f5, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_X_z6DiA$lambda$0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        m3168FloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_lF_WlFE$lambda$3(Function0 function0, TextStyle textStyle, float f, float f2, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m3169FloatingActionButtonlFWlFE(function0, textStyle, f, f2, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2 function2, Function2 function22, Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m3170LargeExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3171LargeExtendedFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeFloatingActionButton_X_z6DiA$lambda$0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        m3172LargeFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2 function2, Function2 function22, Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m3173MediumExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3174MediumExtendedFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumFloatingActionButton_X_z6DiA$lambda$0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        m3175MediumFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2 function2, Function2 function22, Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m3176SmallExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3177SmallExtendedFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallFloatingActionButton_X_z6DiA$lambda$0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        m3178SmallFloatingActionButtonXz6DiA(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3168FloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final Shape shape3;
        Composer composer2;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j7;
        Modifier modifier4;
        int i5;
        long j8;
        Modifier modifier5;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j9;
        int i6;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(748201188);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)143@7084L5,141@6998L325:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    function22 = function2;
                    i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                } else {
                    function22 = function2;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "134@6668L5,135@6732L14,136@6774L31,137@6883L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        i5 = 6;
                        modifier5 = modifier2;
                        shape5 = shape2;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j10 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = 748201188;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j7, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                            j4 = m2784contentColorForek8zF_U;
                        }
                        int i10 = i3;
                        if ((i2 & 32) != 0) {
                            j8 = j7;
                            modifier4 = companion;
                            i5 = 6;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            modifier4 = companion;
                            i5 = 6;
                            j8 = j7;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier5 = modifier4;
                            mutableInteractionSource4 = null;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        } else {
                            modifier5 = modifier4;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        shape5 = shape4;
                        j9 = j8;
                        i6 = 748201188;
                        j10 = j4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:141)");
                    }
                    int i11 = i3 << 9;
                    m3169FloatingActionButtonlFWlFE(function0, TypographyKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i5), FabBaselineTokens.INSTANCE.m5207getContainerWidthD9Ej5fM(), FabBaselineTokens.INSTANCE.m5206getContainerHeightD9Ej5fM(), modifier5, shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, function22, startRestartGroup, (i3 & 14) | 3456 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), (i3 >> 21) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    shape3 = shape5;
                    j5 = j9;
                    j6 = j10;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FloatingActionButton_X_z6DiA$lambda$0;
                            FloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.FloatingActionButton_X_z6DiA$lambda$0(Function0.this, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FloatingActionButton_X_z6DiA$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* renamed from: FloatingActionButton-lF-WlFE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m3169FloatingActionButtonlFWlFE(final Function0<Unit> function0, final TextStyle textStyle, final float f, final float f2, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape3;
        final long j4;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j6;
        Modifier modifier4;
        boolean z;
        boolean z2;
        MutableInteractionSource mutableInteractionSource3;
        long j7;
        int i10;
        boolean z3;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j8;
        long j9;
        ?? r11;
        MutableInteractionSource mutableInteractionSource5;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(121669932);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)N(onClick,textStyle,minWidth:c#ui.unit.Dp,minHeight:c#ui.unit.Dp,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)173@8067L22,178@8272L54,180@8387L330,171@7993L724:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        int i13 = i3 & 16;
        if (i13 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i3 & 32) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i12 = 131072;
                        i4 |= i12;
                    }
                } else {
                    shape2 = shape;
                }
                i12 = 65536;
                i4 |= i12;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) != 0) {
                i5 = i4 | (((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288);
            } else {
                i5 = i4;
            }
            if ((i & 12582912) != 0) {
                j3 = j2;
                i5 |= ((i3 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
            } else {
                j3 = j2;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                    i11 = 67108864;
                    i5 |= i11;
                }
                i11 = GroupFlagsKt.HasAuxSlotFlag;
                i5 |= i11;
            }
            i6 = i3 & 512;
            if (i6 == 0) {
                i5 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                if ((i2 & 6) == 0) {
                    i8 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i8;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "162@7542L5,163@7606L14,164@7648L31,165@7757L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        j8 = j;
                        z = false;
                        z2 = 6;
                        mutableInteractionSource3 = null;
                        j9 = j3;
                        i10 = i9;
                        r11 = 1;
                        floatingActionButtonElevation3 = floatingActionButtonElevation;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape5 = shape2;
                    } else {
                        Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i5 &= -3670017;
                        } else {
                            j6 = j;
                        }
                        if ((i3 & 128) != 0) {
                            j3 = ColorSchemeKt.m2784contentColorForek8zF_U(j6, startRestartGroup, (i5 >> 18) & 14);
                            i5 &= -29360129;
                        }
                        int i14 = i5;
                        if ((i3 & 256) != 0) {
                            z2 = 6;
                            j7 = j6;
                            modifier4 = companion;
                            i10 = i9;
                            z = false;
                            mutableInteractionSource3 = null;
                            z3 = true;
                            floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i5 = i14 & (-234881025);
                        } else {
                            modifier4 = companion;
                            z = false;
                            z2 = 6;
                            mutableInteractionSource3 = null;
                            j7 = j6;
                            i10 = i9;
                            z3 = true;
                            floatingActionButtonElevation3 = floatingActionButtonElevation;
                            i5 = i14;
                        }
                        modifier2 = modifier4;
                        mutableInteractionSource4 = i7 != 0 ? mutableInteractionSource3 : mutableInteractionSource;
                        shape5 = shape4;
                        j8 = j7;
                        j9 = j3;
                        r11 = z3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(121669932, i5, i10, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:168)");
                    }
                    if (mutableInteractionSource4 == null) {
                        startRestartGroup.startReplaceGroup(-282853233);
                        ComposerKt.sourceInformation(startRestartGroup, "170@7949L39");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 960707027, "CC(remember):FloatingActionButton.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                    } else {
                        startRestartGroup.startReplaceGroup(960706376);
                        startRestartGroup.endReplaceGroup();
                        mutableInteractionSource5 = mutableInteractionSource4;
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 960710786, "CC(remember):FloatingActionButton.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FloatingActionButton_lF_WlFE$lambda$1$0;
                                FloatingActionButton_lF_WlFE$lambda$1$0 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$1$0((SemanticsPropertyReceiver) obj);
                                return FloatingActionButton_lF_WlFE$lambda$1$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final long j10 = j9;
                    int i15 = i5 >> 6;
                    SurfaceKt.m4115Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier2, z, (Function1) rememberedValue2, r11, mutableInteractionSource3), false, shape5, j8, j9, floatingActionButtonElevation3.getDefaultElevation(), floatingActionButtonElevation3.shadowElevation$material3(mutableInteractionSource5, startRestartGroup, (i5 >> 21) & 112).getValue().m9746unboximpl(), null, mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(-1779603465, r11, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FloatingActionButton_lF_WlFE$lambda$2;
                            FloatingActionButton_lF_WlFE$lambda$2 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$2(j10, textStyle, f, f2, function2, (Composer) obj, ((Integer) obj2).intValue());
                            return FloatingActionButton_lF_WlFE$lambda$2;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & 14) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 6, 260);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                    j5 = j8;
                    j4 = j9;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape2;
                    j4 = j3;
                    j5 = j;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FloatingActionButton_lF_WlFE$lambda$3;
                            FloatingActionButton_lF_WlFE$lambda$3 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$3(Function0.this, textStyle, f, f2, modifier3, shape3, j5, j4, floatingActionButtonElevation2, mutableInteractionSource2, function2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return FloatingActionButton_lF_WlFE$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i6;
            if ((i2 & 6) == 0) {
            }
            i9 = i8;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 6) == 0) {
        }
        i9 = i8;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_lF_WlFE$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_lF_WlFE$lambda$2(long j, TextStyle textStyle, final float f, final float f2, final Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C181@8478L233,181@8397L314:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779603465, i, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:181)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, textStyle, ComposableLambdaKt.rememberComposableLambda(-1767363041, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FloatingActionButton_lF_WlFE$lambda$2$0;
                    FloatingActionButton_lF_WlFE$lambda$2$0 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$2$0(f, f2, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return FloatingActionButton_lF_WlFE$lambda$2$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_lF_WlFE$lambda$2$0(float f, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C182@8492L209:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1767363041, i, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:182)");
            }
            Modifier m1255defaultMinSizeVpY3zN4 = SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, f, f2);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1255defaultMinSizeVpY3zN4);
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
            ComposerKt.sourceInformationMarkerStart(composer, -339027051, "C186@8678L9:FloatingActionButton.kt#uh7d8r");
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

    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3178SmallFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Shape shape3;
        Composer composer2;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        int i5;
        long j7;
        long j8;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        long j9;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(26608441);
        ComposerKt.sourceInformation(startRestartGroup, "C(SmallFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)235@11077L441:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "228@10742L10,229@10811L14,230@10853L31,231@10962L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j10 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = 26608441;
                        shape5 = shape2;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getSmallShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            i5 = i3 & (-7169);
                            j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        } else {
                            i5 = i3;
                            j7 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j7, startRestartGroup, (i5 >> 9) & 14);
                            i5 &= -57345;
                            j4 = m2784contentColorForek8zF_U;
                        }
                        int i10 = i5;
                        if ((i2 & 32) != 0) {
                            j8 = j7;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            j8 = j7;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            shape5 = shape4;
                            j9 = j8;
                            i6 = 26608441;
                            mutableInteractionSource4 = null;
                        } else {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j8;
                            i6 = 26608441;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape5 = shape4;
                        }
                        j10 = j4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:234)");
                    }
                    m3168FloatingActionButtonXz6DiA(function0, SizeKt.m1275sizeInqDBjuR0$default(modifier2, FabSmallTokens.INSTANCE.m5236getContainerWidthD9Ej5fM(), FabSmallTokens.INSTANCE.m5235getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, function2, startRestartGroup, i3 & 33554318, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                    j5 = j9;
                    j6 = j10;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SmallFloatingActionButton_X_z6DiA$lambda$0;
                            SmallFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.SmallFloatingActionButton_X_z6DiA$lambda$0(Function0.this, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SmallFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: MediumFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3175MediumFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Shape shape3;
        Composer composer2;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        int i5;
        long j7;
        long j8;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        long j9;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1276794641);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)292@13801L443:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "285@13465L11,286@13535L14,287@13577L31,288@13686L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j10 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = -1276794641;
                        shape5 = shape2;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getMediumShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            i5 = i3 & (-7169);
                            j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        } else {
                            i5 = i3;
                            j7 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j7, startRestartGroup, (i5 >> 9) & 14);
                            i5 &= -57345;
                            j4 = m2784contentColorForek8zF_U;
                        }
                        int i10 = i5;
                        if ((i2 & 32) != 0) {
                            j8 = j7;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            j8 = j7;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            shape5 = shape4;
                            j9 = j8;
                            i6 = -1276794641;
                            mutableInteractionSource4 = null;
                        } else {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j8;
                            i6 = -1276794641;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape5 = shape4;
                        }
                        j10 = j4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.MediumFloatingActionButton (FloatingActionButton.kt:291)");
                    }
                    m3168FloatingActionButtonXz6DiA(function0, SizeKt.m1275sizeInqDBjuR0$default(modifier2, FabMediumTokens.INSTANCE.m5213getContainerWidthD9Ej5fM(), FabMediumTokens.INSTANCE.m5212getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, function2, startRestartGroup, i3 & 33554318, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                    j5 = j9;
                    j6 = j10;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MediumFloatingActionButton_X_z6DiA$lambda$0;
                            MediumFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.MediumFloatingActionButton_X_z6DiA$lambda$0(Function0.this, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return MediumFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3172LargeFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Shape shape3;
        Composer composer2;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        int i5;
        long j7;
        long j8;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        long j9;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1274576261);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)351@16604L441:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((12582912 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "344@16269L10,345@16338L14,346@16380L31,347@16489L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j10 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = 1274576261;
                        shape5 = shape2;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getLargeShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            i5 = i3 & (-7169);
                            j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        } else {
                            i5 = i3;
                            j7 = j3;
                        }
                        if ((i2 & 16) != 0) {
                            long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j7, startRestartGroup, (i5 >> 9) & 14);
                            i5 &= -57345;
                            j4 = m2784contentColorForek8zF_U;
                        }
                        int i10 = i5;
                        if ((i2 & 32) != 0) {
                            j8 = j7;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            j8 = j7;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            shape5 = shape4;
                            j9 = j8;
                            i6 = 1274576261;
                            mutableInteractionSource4 = null;
                        } else {
                            modifier2 = companion;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j8;
                            i6 = 1274576261;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape5 = shape4;
                        }
                        j10 = j4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:350)");
                    }
                    m3168FloatingActionButtonXz6DiA(function0, SizeKt.m1275sizeInqDBjuR0$default(modifier2, FabLargeTokens.INSTANCE.m5210getContainerWidthD9Ej5fM(), FabLargeTokens.INSTANCE.m5209getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, function2, startRestartGroup, i3 & 33554318, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                    j5 = j9;
                    j6 = j10;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LargeFloatingActionButton_X_z6DiA$lambda$0;
                            LargeFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.LargeFloatingActionButton_X_z6DiA$lambda$0(Function0.this, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return LargeFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: SmallExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3177SmallExtendedFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final Shape shape3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i5;
        long j7;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        boolean z;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(560925343);
        ComposerKt.sourceInformation(startRestartGroup, "C(SmallExtendedFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)410@19438L5,419@19759L365,408@19343L781:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "401@18988L21,402@19068L14,403@19110L31,404@19219L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier4 = modifier;
                        i5 = 6;
                        z = true;
                        shape4 = shape2;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j8 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = 560925343;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getSmallExtendedFabShape(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        Shape shape5 = shape2;
                        if ((i2 & 8) != 0) {
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        int i10 = i3;
                        if ((i2 & 32) != 0) {
                            j7 = j3;
                            modifier3 = companion;
                            i5 = 6;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            modifier3 = companion;
                            i5 = 6;
                            j7 = j3;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            i6 = 560925343;
                            mutableInteractionSource4 = null;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            z = true;
                        } else {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            z = true;
                            i6 = 560925343;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.SmallExtendedFloatingActionButton (FloatingActionButton.kt:407)");
                    }
                    int i11 = (i3 & 14) | 3456;
                    int i12 = i3 << 9;
                    m3169FloatingActionButtonlFWlFE(function0, TypographyKt.getValue(SmallExtendedFabTextStyle, startRestartGroup, i5), SmallExtendedFabMinimumWidth, SmallExtendedFabMinimumHeight, modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(1545824013, z, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SmallExtendedFloatingActionButton_X_z6DiA$lambda$0;
                            SmallExtendedFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.SmallExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                            return SmallExtendedFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j8;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SmallExtendedFloatingActionButton_X_z6DiA$lambda$1;
                            SmallExtendedFloatingActionButton_X_z6DiA$lambda$1 = FloatingActionButtonKt.SmallExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0.this, modifier2, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SmallExtendedFloatingActionButton_X_z6DiA$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmallExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C420@19769L349:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545824013, i, -1, "androidx.compose.material3.SmallExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:420)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, SmallExtendedFabPaddingStart, 0.0f, SmallExtendedFabPaddingEnd, 0.0f, 10, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: MediumExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3174MediumExtendedFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final Shape shape3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i5;
        long j7;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        boolean z;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1729062315);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumExtendedFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)476@22523L5,485@22846L367,474@22427L786:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "467@22071L22,468@22152L14,469@22194L31,470@22303L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier4 = modifier;
                        i5 = 6;
                        z = true;
                        shape4 = shape2;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j8 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = -1729062315;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getMediumExtendedFabShape(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        Shape shape5 = shape2;
                        if ((i2 & 8) != 0) {
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        int i10 = i3;
                        if ((i2 & 32) != 0) {
                            j7 = j3;
                            modifier3 = companion;
                            i5 = 6;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            modifier3 = companion;
                            i5 = 6;
                            j7 = j3;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            i6 = -1729062315;
                            mutableInteractionSource4 = null;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            z = true;
                        } else {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            z = true;
                            i6 = -1729062315;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.MediumExtendedFloatingActionButton (FloatingActionButton.kt:473)");
                    }
                    int i11 = (i3 & 14) | 3456;
                    int i12 = i3 << 9;
                    m3169FloatingActionButtonlFWlFE(function0, TypographyKt.getValue(MediumExtendedFabTextStyle, startRestartGroup, i5), MediumExtendedFabMinimumWidth, MediumExtendedFabMinimumHeight, modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1261974617, z, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MediumExtendedFloatingActionButton_X_z6DiA$lambda$0;
                            MediumExtendedFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.MediumExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                            return MediumExtendedFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j8;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MediumExtendedFloatingActionButton_X_z6DiA$lambda$1;
                            MediumExtendedFloatingActionButton_X_z6DiA$lambda$1 = FloatingActionButtonKt.MediumExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0.this, modifier2, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return MediumExtendedFloatingActionButton_X_z6DiA$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediumExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C486@22856L351:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261974617, i, -1, "androidx.compose.material3.MediumExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:486)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, MediumExtendedFabPaddingStart, 0.0f, MediumExtendedFabPaddingEnd, 0.0f, 10, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3171LargeExtendedFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final Shape shape3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i5;
        long j7;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        boolean z;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1962379029);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeExtendedFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)542@25606L5,551@25927L365,540@25511L781:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "533@25156L21,534@25236L14,535@25278L31,536@25387L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier4 = modifier;
                        i5 = 6;
                        z = true;
                        shape4 = shape2;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j3;
                        j8 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = -1962379029;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getLargeExtendedFabShape(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        Shape shape5 = shape2;
                        if ((i2 & 8) != 0) {
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        int i10 = i3;
                        if ((i2 & 32) != 0) {
                            j7 = j3;
                            modifier3 = companion;
                            i5 = 6;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i10 & (-458753);
                        } else {
                            modifier3 = companion;
                            i5 = 6;
                            j7 = j3;
                            i3 = i10;
                        }
                        if (i4 != 0) {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            i6 = -1962379029;
                            mutableInteractionSource4 = null;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            z = true;
                        } else {
                            modifier4 = modifier3;
                            j8 = j4;
                            shape4 = shape5;
                            j9 = j7;
                            z = true;
                            i6 = -1962379029;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.LargeExtendedFloatingActionButton (FloatingActionButton.kt:539)");
                    }
                    int i11 = (i3 & 14) | 3456;
                    int i12 = i3 << 9;
                    m3169FloatingActionButtonlFWlFE(function0, TypographyKt.getValue(LargeExtendedFabTextStyle, startRestartGroup, i5), LargeExtendedFabMinimumWidth, LargeExtendedFabMinimumHeight, modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-977480359, z, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LargeExtendedFloatingActionButton_X_z6DiA$lambda$0;
                            LargeExtendedFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.LargeExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                            return LargeExtendedFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j8;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LargeExtendedFloatingActionButton_X_z6DiA$lambda$1;
                            LargeExtendedFloatingActionButton_X_z6DiA$lambda$1 = FloatingActionButtonKt.LargeExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0.this, modifier2, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return LargeExtendedFloatingActionButton_X_z6DiA$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C552@25937L349:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-977480359, i, -1, "androidx.compose.material3.LargeExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:552)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, LargeExtendedFabPaddingStart, 0.0f, LargeExtendedFabPaddingEnd, 0.0f, 10, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3166ExtendedFloatingActionButtonXz6DiA(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final Shape shape3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long j7;
        boolean z;
        long j8;
        MutableInteractionSource mutableInteractionSource4;
        int i5;
        Shape shape4;
        long j9;
        int i6;
        Modifier modifier4;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1039585610);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource,content)615@28891L335,607@28628L598:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "600@28278L16,601@28353L14,602@28395L31,603@28504L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        z = true;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j8 = j4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i5 = 12582912;
                        i6 = 1039585610;
                        modifier4 = modifier;
                        shape4 = shape2;
                        j9 = j3;
                    } else {
                        Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        Shape shape5 = shape2;
                        if ((i2 & 8) != 0) {
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        int i10 = i3;
                        long j10 = j3;
                        if ((i2 & 16) != 0) {
                            long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j10, startRestartGroup, (i10 >> 9) & 14);
                            i10 &= -57345;
                            j4 = m2784contentColorForek8zF_U;
                        }
                        int i11 = i10;
                        if ((i2 & 32) != 0) {
                            j7 = j10;
                            modifier3 = companion;
                            z = true;
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i11 & (-458753);
                        } else {
                            modifier3 = companion;
                            j7 = j10;
                            z = true;
                            i3 = i11;
                        }
                        if (i4 != 0) {
                            mutableInteractionSource4 = null;
                            j8 = j4;
                        } else {
                            j8 = j4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        i5 = 12582912;
                        shape4 = shape5;
                        j9 = j7;
                        i6 = 1039585610;
                        modifier4 = modifier3;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:606)");
                    }
                    m3168FloatingActionButtonXz6DiA(function0, modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1233936436, z, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExtendedFloatingActionButton_X_z6DiA$lambda$0;
                            ExtendedFloatingActionButton_X_z6DiA$lambda$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3.this, (Composer) obj, ((Integer) obj2).intValue());
                            return ExtendedFloatingActionButton_X_z6DiA$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | i5 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j8;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    j5 = j3;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ExtendedFloatingActionButton_X_z6DiA$lambda$1;
                            ExtendedFloatingActionButton_X_z6DiA$lambda$1 = FloatingActionButtonKt.ExtendedFloatingActionButton_X_z6DiA$lambda$1(Function0.this, modifier2, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ExtendedFloatingActionButton_X_z6DiA$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_X_z6DiA$lambda$0(Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C616@28901L319:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1233936436, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:616)");
            }
            Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(SizeKt.m1275sizeInqDBjuR0$default(Modifier.INSTANCE, ExtendedFabMinimumWidth, 0.0f, 0.0f, 0.0f, 14, null), ExtendedFabTextPadding, 0.0f, 2, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1203paddingVpY3zN4$default);
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

    /* JADX WARN: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: SmallExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3176SmallExtendedFloatingActionButtonElI57k(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j3;
        int i5;
        int i6;
        int i7;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final long j5;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        boolean z4;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1146347203);
        ComposerKt.sourceInformation(startRestartGroup, "C(SmallExtendedFloatingActionButton)N(text,icon,onClick,modifier,expanded,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource)680@32178L5,676@32033L647:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((12582912 & i) == 0) {
                    i5 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                } else {
                    i5 = i3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                        i8 = 67108864;
                        i5 |= i8;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i8;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i7 = i6;
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "670@31724L21,671@31804L14,672@31846L31,673@31955L11");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                                shape2 = FloatingActionButtonDefaults.INSTANCE.getSmallExtendedFabShape(startRestartGroup, 6);
                            }
                            if ((i2 & 64) != 0) {
                                j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                j6 = j3;
                            }
                            if ((i2 & 128) != 0) {
                                j7 = ColorSchemeKt.m2784contentColorForek8zF_U(j6, startRestartGroup, (i5 >> 18) & 14);
                                i5 &= -29360129;
                            } else {
                                j7 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i5 &= -234881025;
                            } else {
                                floatingActionButtonElevation3 = floatingActionButtonElevation;
                            }
                            if (i7 != 0) {
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                            }
                            modifier4 = modifier2;
                            j8 = j6;
                            shape4 = shape2;
                            j9 = j7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            j9 = j2;
                            floatingActionButtonElevation4 = floatingActionButtonElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape4 = shape2;
                            j8 = j3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1146347203, i5, -1, "androidx.compose.material3.SmallExtendedFloatingActionButton (FloatingActionButton.kt:676)");
                        }
                        m3167ExtendedFloatingActionButtonqtIzBjc(function2, function22, function02, TypographyKt.getValue(SmallExtendedFabTextStyle, startRestartGroup, 6), SmallExtendedFabMinimumWidth, SmallExtendedFabMinimumHeight, SmallExtendedFabPaddingStart, SmallExtendedFabPaddingEnd, SmallExtendedFabIconPadding, modifier4, z4, shape4, j8, j9, floatingActionButtonElevation4, mutableInteractionSource3, startRestartGroup, (i5 & 14) | 115040256 | (i5 & 112) | (i5 & 896) | (1879048192 & (i5 << 18)), (i5 >> 12) & 524286, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        j4 = j8;
                        j5 = j9;
                        floatingActionButtonElevation2 = floatingActionButtonElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        j4 = j3;
                        j5 = j2;
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SmallExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                SmallExtendedFloatingActionButton_ElI5_7k$lambda$0 = FloatingActionButtonKt.SmallExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2.this, function22, function0, modifier3, z3, shape3, j4, j5, floatingActionButtonElevation2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return SmallExtendedFloatingActionButton_ElI5_7k$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i6;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: MediumExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3173MediumExtendedFloatingActionButtonElI57k(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j3;
        int i5;
        int i6;
        int i7;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final long j5;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        boolean z4;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-685923341);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumExtendedFloatingActionButton)N(text,icon,onClick,modifier,expanded,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource)748@35637L5,744@35491L653:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((12582912 & i) == 0) {
                    i5 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                } else {
                    i5 = i3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                        i8 = 67108864;
                        i5 |= i8;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i8;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i7 = i6;
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "738@35181L22,739@35262L14,740@35304L31,741@35413L11");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                                shape2 = FloatingActionButtonDefaults.INSTANCE.getMediumExtendedFabShape(startRestartGroup, 6);
                            }
                            if ((i2 & 64) != 0) {
                                j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                j6 = j3;
                            }
                            if ((i2 & 128) != 0) {
                                j7 = ColorSchemeKt.m2784contentColorForek8zF_U(j6, startRestartGroup, (i5 >> 18) & 14);
                                i5 &= -29360129;
                            } else {
                                j7 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i5 &= -234881025;
                            } else {
                                floatingActionButtonElevation3 = floatingActionButtonElevation;
                            }
                            if (i7 != 0) {
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                            }
                            modifier4 = modifier2;
                            j8 = j6;
                            shape4 = shape2;
                            j9 = j7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            j9 = j2;
                            floatingActionButtonElevation4 = floatingActionButtonElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape4 = shape2;
                            j8 = j3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-685923341, i5, -1, "androidx.compose.material3.MediumExtendedFloatingActionButton (FloatingActionButton.kt:744)");
                        }
                        m3167ExtendedFloatingActionButtonqtIzBjc(function2, function22, function02, TypographyKt.getValue(MediumExtendedFabTextStyle, startRestartGroup, 6), MediumExtendedFabMinimumWidth, MediumExtendedFabMinimumHeight, MediumExtendedFabPaddingStart, MediumExtendedFabPaddingEnd, MediumExtendedFabIconPadding, modifier4, z4, shape4, j8, j9, floatingActionButtonElevation4, mutableInteractionSource3, startRestartGroup, (i5 & 14) | 115040256 | (i5 & 112) | (i5 & 896) | (1879048192 & (i5 << 18)), (i5 >> 12) & 524286, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        j4 = j8;
                        j5 = j9;
                        floatingActionButtonElevation2 = floatingActionButtonElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        j4 = j3;
                        j5 = j2;
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit MediumExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                MediumExtendedFloatingActionButton_ElI5_7k$lambda$0 = FloatingActionButtonKt.MediumExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2.this, function22, function0, modifier3, z3, shape3, j4, j5, floatingActionButtonElevation2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return MediumExtendedFloatingActionButton_ElI5_7k$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i6;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3170LargeExtendedFloatingActionButtonElI57k(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j3;
        int i5;
        int i6;
        int i7;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final long j5;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        boolean z4;
        Modifier modifier4;
        long j8;
        Shape shape4;
        long j9;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-844339831);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeExtendedFloatingActionButton)N(text,icon,onClick,modifier,expanded,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource)816@39094L5,812@38949L647:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((12582912 & i) == 0) {
                    i5 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                } else {
                    i5 = i3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                        i8 = 67108864;
                        i5 |= i8;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i8;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i7 = i6;
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "806@38640L21,807@38720L14,808@38762L31,809@38871L11");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                                shape2 = FloatingActionButtonDefaults.INSTANCE.getLargeExtendedFabShape(startRestartGroup, 6);
                            }
                            if ((i2 & 64) != 0) {
                                j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                j6 = j3;
                            }
                            if ((i2 & 128) != 0) {
                                j7 = ColorSchemeKt.m2784contentColorForek8zF_U(j6, startRestartGroup, (i5 >> 18) & 14);
                                i5 &= -29360129;
                            } else {
                                j7 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i5 &= -234881025;
                            } else {
                                floatingActionButtonElevation3 = floatingActionButtonElevation;
                            }
                            if (i7 != 0) {
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                z4 = z5;
                            }
                            modifier4 = modifier2;
                            j8 = j6;
                            shape4 = shape2;
                            j9 = j7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            j9 = j2;
                            floatingActionButtonElevation4 = floatingActionButtonElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape4 = shape2;
                            j8 = j3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-844339831, i5, -1, "androidx.compose.material3.LargeExtendedFloatingActionButton (FloatingActionButton.kt:812)");
                        }
                        m3167ExtendedFloatingActionButtonqtIzBjc(function2, function22, function02, TypographyKt.getValue(LargeExtendedFabTextStyle, startRestartGroup, 6), LargeExtendedFabMinimumWidth, LargeExtendedFabMinimumHeight, LargeExtendedFabPaddingStart, LargeExtendedFabPaddingEnd, LargeExtendedFabIconPadding, modifier4, z4, shape4, j8, j9, floatingActionButtonElevation4, mutableInteractionSource3, startRestartGroup, (i5 & 14) | 115040256 | (i5 & 112) | (i5 & 896) | (1879048192 & (i5 << 18)), (i5 >> 12) & 524286, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        j4 = j8;
                        j5 = j9;
                        floatingActionButtonElevation2 = floatingActionButtonElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        j4 = j3;
                        j5 = j2;
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit LargeExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                LargeExtendedFloatingActionButton_ElI5_7k$lambda$0 = FloatingActionButtonKt.LargeExtendedFloatingActionButton_ElI5_7k$lambda$0(Function2.this, function22, function0, modifier3, z3, shape3, j4, j5, floatingActionButtonElevation2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return LargeExtendedFloatingActionButton_ElI5_7k$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i6;
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257  */
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3165ExtendedFloatingActionButtonElI57k(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        Shape shape2;
        long j3;
        int i5;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i6;
        int i7;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1161000600);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)N(text,icon,onClick,modifier,expanded,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource)890@42719L1159,882@42456L1422:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((i & 12582912) == 0) {
                    i5 = 12582912;
                    i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                } else {
                    i5 = 12582912;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i3 |= i8;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    i3 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "876@42152L16,877@42227L14,878@42269L31,879@42378L11");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 32) != 0) {
                                shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                                i7 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i7 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                j6 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 18) & 14);
                                i7 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i7 &= -234881025;
                            }
                            if (i6 != 0) {
                                mutableInteractionSource3 = null;
                                long j7 = j3;
                                FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation2;
                                int i12 = i7;
                                Shape shape4 = shape2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1161000600, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:881)");
                                }
                                int i13 = i12 >> 6;
                                int i14 = i12 >> 9;
                                Modifier modifier4 = modifier2;
                                m3168FloatingActionButtonXz6DiA(function0, modifier4, shape4, j7, j6, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(632971498, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda28
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                        ExtendedFloatingActionButton_ElI5_7k$lambda$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$0(z2, function22, function2, (Composer) obj, ((Integer) obj2).intValue());
                                        return ExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i13 & 112) | (i13 & 14) | i5 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z2;
                                modifier3 = modifier4;
                                shape3 = shape4;
                                j4 = j7;
                                j5 = j6;
                                floatingActionButtonElevation3 = floatingActionButtonElevation4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i7 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i7 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i7 &= -234881025;
                            }
                            j6 = j2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        long j72 = j3;
                        FloatingActionButtonElevation floatingActionButtonElevation42 = floatingActionButtonElevation2;
                        int i122 = i7;
                        Shape shape42 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i122 >> 6;
                        int i142 = i122 >> 9;
                        Modifier modifier42 = modifier2;
                        m3168FloatingActionButtonXz6DiA(function0, modifier42, shape42, j72, j6, floatingActionButtonElevation42, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(632971498, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0;
                                ExtendedFloatingActionButton_ElI5_7k$lambda$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$0(z2, function22, function2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExtendedFloatingActionButton_ElI5_7k$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i132 & 112) | (i132 & 14) | i5 | (i142 & 896) | (i142 & 7168) | (57344 & i142) | (458752 & i142) | (i142 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z2;
                        modifier3 = modifier42;
                        shape3 = shape42;
                        j4 = j72;
                        j5 = j6;
                        floatingActionButtonElevation3 = floatingActionButtonElevation42;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        j4 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j5 = j2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExtendedFloatingActionButton_ElI5_7k$lambda$1;
                                ExtendedFloatingActionButton_ElI5_7k$lambda$1 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$1(Function2.this, function22, function0, modifier3, z3, shape3, j4, j5, floatingActionButtonElevation3, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExtendedFloatingActionButton_ElI5_7k$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0(boolean z, Function2 function2, final Function2 function22, Composer composer, int i) {
        float m9732constructorimpl;
        float m9732constructorimpl2;
        float m5207getContainerWidthD9Ej5fM;
        ComposerKt.sourceInformation(composer, "C894@42881L991:FloatingActionButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(632971498, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:891)");
            }
            if (z) {
                m9732constructorimpl = ExtendedFabStartIconPadding;
            } else {
                m9732constructorimpl = Dp.m9732constructorimpl(0);
            }
            float f = m9732constructorimpl;
            if (z) {
                m9732constructorimpl2 = ExtendedFabTextPadding;
            } else {
                m9732constructorimpl2 = Dp.m9732constructorimpl(0);
            }
            float f2 = m9732constructorimpl2;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (z) {
                m5207getContainerWidthD9Ej5fM = ExtendedFabMinimumWidth;
            } else {
                m5207getContainerWidthD9Ej5fM = FabBaselineTokens.INSTANCE.m5207getContainerWidthD9Ej5fM();
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.m1275sizeInqDBjuR0$default(companion, m5207getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), f, 0.0f, f2, 0.0f, 10, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical start = z ? arrangement.getStart() : arrangement.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 48);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -145916491, "C908@43478L6,911@43577L28,912@43630L30,913@43676L186,909@43497L365:FloatingActionButton.kt#uh7d8r");
            function2.invoke(composer, 0);
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z, (Modifier) null, extendedFabExpandAnimation(composer, 0), extendedFabCollapseAnimation(composer, 0), (String) null, ComposableLambdaKt.rememberComposableLambda(-660008666, true, new Function3() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0;
                    ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0(Function2.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0;
                }
            }, composer, 54), composer, 1572870, 18);
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
    public static final Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0(Function2 function2, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C914@43728L2,914@43694L154:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-660008666, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:914)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 1386833448, "CC(remember):FloatingActionButton.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0$0$0;
                    ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0$0$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0$0$0((SemanticsPropertyReceiver) obj);
                    return ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, clearAndSetSemantics);
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
        ComposerKt.sourceInformationMarkerStart(composer, -1331490131, "C915@43754L49,916@43824L6:FloatingActionButton.kt#uh7d8r");
        SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, ExtendedFabEndIconPadding), composer, 6);
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_ElI5_7k$lambda$0$0$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x017e, code lost:
    
        if (r4.changed(r51) != false) goto L130;
     */
    /* renamed from: ExtendedFloatingActionButton-qtIzBjc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m3167ExtendedFloatingActionButtonqtIzBjc(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function0<Unit> function0, final TextStyle textStyle, final float f, final float f2, final float f3, final float f4, final float f5, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        Composer composer2;
        final Modifier modifier2;
        final boolean z2;
        final Shape shape2;
        final long j4;
        final long j5;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        Modifier modifier3;
        int i7;
        boolean z3;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        long j8;
        Shape shape4;
        long j9;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(193103278);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)N(text,icon,onClick,textStyle,minWidth:c#ui.unit.Dp,minHeight:c#ui.unit.Dp,startPadding:c#ui.unit.Dp,endPadding:c#ui.unit.Dp,iconPadding:c#ui.unit.Dp,modifier,expanded,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,interactionSource)953@44937L1923,942@44572L2288:FloatingActionButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i10 = 1024;
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(f5) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i12 = i3 & 512;
        if (i12 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i13 = i3 & 1024;
        if (i13 != 0) {
            i6 = i2 | 6;
            i5 = i13;
        } else if ((i2 & 6) == 0) {
            i5 = i13;
            i6 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i5 = i13;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2048) == 0 && startRestartGroup.changed(shape)) {
                i9 = 32;
                i6 |= i9;
            }
            i9 = 16;
            i6 |= i9;
        }
        if ((i2 & 384) == 0) {
            i6 |= ((i3 & 4096) == 0 && startRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            j3 = j2;
            if ((i3 & 8192) == 0 && startRestartGroup.changed(j3)) {
                i10 = 2048;
            }
            i6 |= i10;
        } else {
            j3 = j2;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16384) != 0) {
            }
            i11 = 8192;
            i6 |= i11;
        }
        int i14 = i3 & 32768;
        if (i14 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true, i4 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "936@44268L16,937@44343L14,938@44385L31,939@44494L11");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 2048) != 0) {
                    i6 &= -113;
                }
                i8 = i6;
                if ((i3 & 4096) != 0) {
                    i8 &= -897;
                }
                if ((i3 & 8192) != 0) {
                    i8 &= -7169;
                }
                if ((i3 & 16384) != 0) {
                    i8 &= -57345;
                }
                modifier3 = modifier;
                z3 = z;
                shape4 = shape;
                j9 = j;
                floatingActionButtonElevation4 = floatingActionButtonElevation;
                mutableInteractionSource3 = mutableInteractionSource;
                composer2 = startRestartGroup;
                j8 = j3;
            } else {
                Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier;
                boolean z4 = i5 != 0 ? true : z;
                if ((i3 & 2048) != 0) {
                    shape3 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                    i6 &= -113;
                } else {
                    shape3 = shape;
                }
                int i15 = i6;
                if ((i3 & 4096) != 0) {
                    modifier3 = companion;
                    i7 = i15 & (-897);
                    z3 = z4;
                    j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                } else {
                    modifier3 = companion;
                    i7 = i15;
                    z3 = z4;
                    j6 = j;
                }
                if ((i3 & 8192) != 0) {
                    j7 = ColorSchemeKt.m2784contentColorForek8zF_U(j6, startRestartGroup, (i7 >> 6) & 14);
                    i7 &= -7169;
                } else {
                    j7 = j2;
                }
                long j10 = j6;
                if ((i3 & 16384) != 0) {
                    floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                    composer2 = startRestartGroup;
                    i7 &= -57345;
                } else {
                    composer2 = startRestartGroup;
                    floatingActionButtonElevation3 = floatingActionButtonElevation;
                }
                mutableInteractionSource3 = i14 != 0 ? null : mutableInteractionSource;
                j8 = j7;
                shape4 = shape3;
                j9 = j10;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                i8 = i7;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(193103278, i4, i8, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:941)");
            }
            final boolean z5 = z3;
            int i16 = i4 >> 6;
            int i17 = (i16 & 112) | (i16 & 14) | 3456 | ((i4 >> 15) & 57344);
            int i18 = i8 << 12;
            Modifier modifier4 = modifier3;
            m3169FloatingActionButtonlFWlFE(function0, textStyle, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-827388388, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0;
                    ExtendedFloatingActionButton_qtIzBjc$lambda$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0(z5, f, f2, f3, f4, function22, f5, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return ExtendedFloatingActionButton_qtIzBjc$lambda$0;
                }
            }, composer2, 54), composer2, i17 | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            floatingActionButtonElevation2 = floatingActionButtonElevation4;
            mutableInteractionSource2 = mutableInteractionSource3;
            j5 = j8;
            shape2 = shape4;
            j4 = j9;
            z2 = z5;
            modifier2 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
            shape2 = shape;
            j4 = j;
            j5 = j2;
            floatingActionButtonElevation2 = floatingActionButtonElevation;
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExtendedFloatingActionButton_qtIzBjc$lambda$1;
                    ExtendedFloatingActionButton_qtIzBjc$lambda$1 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$1(Function2.this, function22, function0, textStyle, f, f2, f3, f4, f5, modifier2, z2, shape2, j4, j5, floatingActionButtonElevation2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return ExtendedFloatingActionButton_qtIzBjc$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec ExtendedFloatingActionButton_qtIzBjc$lambda$0$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1114419602);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1114419602, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:959)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec ExtendedFloatingActionButton_qtIzBjc$lambda$0$2(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-781713402);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-781713402, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:961)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0(float f, State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int lerp = MathHelpersKt.lerp(measureScope.mo522roundToPx0680j_4(f), measurable.maxIntrinsicWidth(Constraints.m9674getMaxHeightimpl(constraints.getValue())), ((Number) state.getValue()).floatValue());
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, lerp, mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0$0;
                ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$0$0(Transition transition) {
        return ((Number) transition.getCurrentState()).floatValue() == 0.0f && !transition.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$2$0(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Modifier animateFloatingActionButton$default(Modifier modifier, boolean z, Alignment alignment, float f, AnimationSpec animationSpec, AnimationSpec animationSpec2, int i, Object obj) {
        if ((i & 4) != 0) {
            f = FloatingActionButtonDefaults.INSTANCE.getShowHideTargetScale$material3();
        }
        return animateFloatingActionButton(modifier, z, alignment, f, (i & 8) != 0 ? null : animationSpec, (i & 16) != 0 ? null : animationSpec2);
    }

    public static final Modifier animateFloatingActionButton(Modifier modifier, boolean z, Alignment alignment, float f, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        return modifier.then(new FabVisibleModifier(z, alignment, f, animationSpec, animationSpec2));
    }

    static {
        float f = 12;
        MediumExtendedFabIconPadding = Dp.m9732constructorimpl(f);
        float f2 = 16;
        LargeExtendedFabIconPadding = Dp.m9732constructorimpl(f2);
        ExtendedFabStartIconPadding = Dp.m9732constructorimpl(f2);
        ExtendedFabEndIconPadding = Dp.m9732constructorimpl(f);
    }

    private static final ExitTransition extendedFabCollapseAnimation(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -56172201, "C(extendedFabCollapseAnimation)1467@66037L7,1470@66146L7:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-56172201, i, -1, "androidx.compose.material3.extendedFabCollapseAnimation (FloatingActionButton.kt:1465)");
        }
        ExitTransition plus = EnterExitTransitionKt.fadeOut$default(MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), Alignment.INSTANCE.getStart(), false, null, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return plus;
    }

    private static final EnterTransition extendedFabExpandAnimation(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -719787506, "C(extendedFabExpandAnimation)1478@66415L7,1481@66521L7:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-719787506, i, -1, "androidx.compose.material3.extendedFabExpandAnimation (FloatingActionButton.kt:1476)");
        }
        EnterTransition plus = EnterExitTransitionKt.fadeIn$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), Alignment.INSTANCE.getStart(), false, null, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0(boolean z, final float f, float f2, float f3, float f4, Function2 function2, float f5, Function2 function22, Composer composer, int i) {
        Object currentState;
        Float f6;
        float f7;
        Object currentState2;
        ComposerKt.sourceInformation(composer, "C954@44970L68,956@45181L14,957@45265L14,959@45345L59,961@45470L62,964@45601L435,962@45541L1313:FloatingActionButton.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827388388, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:954)");
            }
            final Transition updateTransition = TransitionKt.updateTransition(Float.valueOf(z ? 1.0f : 0.0f), "expanded state", composer, 48, 0);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
            Function3 function3 = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec ExtendedFloatingActionButton_qtIzBjc$lambda$0$0;
                    ExtendedFloatingActionButton_qtIzBjc$lambda$0$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ExtendedFloatingActionButton_qtIzBjc$lambda$0$0;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composer, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                composer.startReplaceGroup(1666827533);
                composer.endReplaceGroup();
                currentState = updateTransition.getCurrentState();
            } else {
                composer.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(composer, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed = composer.changed(updateTransition);
                currentState = composer.rememberedValue();
                if (changed || currentState == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        composer.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            float floatValue = ((Number) currentState).floatValue();
            composer.startReplaceGroup(-157343033);
            ComposerKt.sourceInformation(composer, "CN(it):FloatingActionButton.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:959)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Float valueOf = Float.valueOf(floatValue);
            ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed2 = composer.changed(updateTransition);
            Object rememberedValue = composer.rememberedValue();
            if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton_qtIzBjc$lambda$0$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            float floatValue2 = ((Number) ((State) rememberedValue).getValue()).floatValue();
            composer.startReplaceGroup(-157343033);
            ComposerKt.sourceInformation(composer, "CN(it):FloatingActionButton.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                f6 = valueOf;
                f7 = floatValue2;
                ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:959)");
            } else {
                f6 = valueOf;
                f7 = floatValue2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Float valueOf2 = Float.valueOf(f7);
            ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = composer.changed(updateTransition);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton_qtIzBjc$lambda$0$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Float> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, f6, valueOf2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "FloatAnimation", composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Function3 function32 = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec ExtendedFloatingActionButton_qtIzBjc$lambda$0$2;
                    ExtendedFloatingActionButton_qtIzBjc$lambda$0$2 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$2(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return ExtendedFloatingActionButton_qtIzBjc$lambda$0$2;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composer, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                composer.startReplaceGroup(1666827533);
                composer.endReplaceGroup();
                currentState2 = updateTransition.getCurrentState();
            } else {
                composer.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(composer, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed4 = composer.changed(updateTransition);
                currentState2 = composer.rememberedValue();
                if (changed4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.INSTANCE;
                    Snapshot currentThreadSnapshot2 = companion2.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable2 = companion2.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = updateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        composer.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion2.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            float floatValue3 = ((Number) currentState2).floatValue();
            composer.startReplaceGroup(175363167);
            ComposerKt.sourceInformation(composer, "CN(it):FloatingActionButton.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:961)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Float valueOf3 = Float.valueOf(floatValue3);
            ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed5 = composer.changed(updateTransition);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton_qtIzBjc$lambda$0$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            float floatValue4 = ((Number) ((State) rememberedValue3).getValue()).floatValue();
            composer.startReplaceGroup(175363167);
            ComposerKt.sourceInformation(composer, "CN(it):FloatingActionButton.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:961)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Float valueOf4 = Float.valueOf(floatValue4);
            ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed6 = composer.changed(updateTransition);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton_qtIzBjc$lambda$0$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Float> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                composer.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue4).getValue(), composer, 0), vectorConverter2, "FloatAnimation", composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -551269425, "CC(remember):FloatingActionButton.kt#9igjgp");
            boolean changed7 = composer.changed(f) | composer.changed(createTransitionAnimation);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0;
                        ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0(f, createTransitionAnimation, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                        return ExtendedFloatingActionButton_qtIzBjc$lambda$0$4$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.m1275sizeInqDBjuR0$default(LayoutModifierKt.layout(companion3, (Function3) rememberedValue5), f, f2, 0.0f, 0.0f, 12, null), f3, 0.0f, f4, 0.0f, 10, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 65394718, "C975@46263L6,977@46319L196:FloatingActionButton.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -2076099068, "CC(remember):FloatingActionButton.kt#9igjgp");
            boolean changed8 = composer.changed(updateTransition);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed8 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$0$0;
                        ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$0$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$0$0(Transition.this);
                        return Boolean.valueOf(ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$0$0);
                    }
                });
                composer.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (((Boolean) ((State) rememberedValue6).getValue()).booleanValue()) {
                composer.startReplaceGroup(65953058);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(65675329);
                ComposerKt.sourceInformation(composer, "984@46628L2,985@46670L39,983@46573L257");
                Modifier.Companion companion4 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -2076089374, "CC(remember):FloatingActionButton.kt#9igjgp");
                Object rememberedValue7 = composer.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$1$0;
                            ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$1$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$1$0((SemanticsPropertyReceiver) obj);
                            return ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion4, (Function1) rememberedValue7);
                ComposerKt.sourceInformationMarkerStart(composer, -2076087993, "CC(remember):FloatingActionButton.kt#9igjgp");
                boolean changed9 = composer.changed(createTransitionAnimation2);
                Object rememberedValue8 = composer.rememberedValue();
                if (changed9 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$2$0;
                            ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$2$0 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$2$0(State.this, (GraphicsLayerScope) obj);
                            return ExtendedFloatingActionButton_qtIzBjc$lambda$0$5$2$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(clearAndSetSemantics, (Function1) rememberedValue8);
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
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
                Updater.m5872setimpl(m5864constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -545340570, "C987@46750L35,988@46806L6:FloatingActionButton.kt#uh7d8r");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, f5), composer, 0);
                function22.invoke(composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
