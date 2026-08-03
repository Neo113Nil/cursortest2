package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
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
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a¦\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aú\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010#\u001a\u0082\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010%\u001a\u0088\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00142\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010)\u001aø\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010+\u001a\u0080\u0002\u0010*\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010,\u001a\u0086\u0002\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00142\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010-\u001at\u0010.\u001a\u00020\u00012\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0002\u00104\u001aK\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001aS\u0010B\u001a\u000206*\u0002072\u0006\u0010C\u001a\u0002062\u0006\u0010D\u001a\u0002062\u0006\u0010E\u001a\u0002062\u0006\u0010F\u001a\u0002062\u0006\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002062\u0006\u0010>\u001a\u00020?H\u0002¢\u0006\u0004\bK\u0010L\u001an\u0010M\u001a\u00020N*\u00020O2\u0006\u0010P\u001a\u0002062\u0006\u0010Q\u001a\u0002062\b\u0010R\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010U\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\u0006\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u0002062\u0006\u0010Z\u001a\u0002062\u0006\u0010[\u001a\u000206H\u0002\u001a2\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\ba\u0010b\u001a\u0014\u0010x\u001a\u00020\u0014*\u00020y2\u0006\u0010z\u001a\u000206H\u0002\u001a\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020IH\u0002¢\u0006\u0004\b{\u0010|\u001a=\u0010}\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020^2\u0006\u0010~\u001a\u00020`2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a?\u0010\u0081\u0001\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020^2\u0006\u0010~\u001a\u00020`2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001\u001a6\u0010\u0083\u0001\u001a\u00020\u00012\u0006\u0010]\u001a\u00020^2\u0006\u0010~\u001a\u00020`2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0005\b\u0084\u0001\u0010b\u001a6\u0010\u0085\u0001\u001a\u00020\u00012\u0006\u0010]\u001a\u00020^2\u0006\u0010~\u001a\u00020`2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0005\b\u0086\u0001\u0010b\u001a4\u0010\u0087\u0001\u001a\u00020\u00012\u0006\u0010]\u001a\u00020^2\u0006\u0010~\u001a\u00020`2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0005\b\u0088\u0001\u0010b\u001ad\u0010\u0089\u0001\u001a\u00020\u0001*\u00030\u008a\u00012\u0012\b\u0002\u0010\u008b\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u008c\u00012\u0012\b\u0002\u0010\u008d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u008c\u00012\u0012\b\u0002\u0010\u008e\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u008c\u00012\u0012\b\u0002\u0010\u008f\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u008c\u0001H\u0003¢\u0006\u0003\u0010\u0090\u0001\u001a\u0084\u0002\u0010\u0091\u0001\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u001a\u0010\u0092\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0093\u0001\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0003\b\u0094\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0003\u0010\u0095\u0001\u001a~\u0010\u0096\u0001\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0003\u0010\u0097\u0001\u001a\u0017\u0010\u0098\u0001\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0002\"\u001e\u0010c\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u001e\u0010i\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bj\u0010e\u001a\u0004\bk\u0010g\"\u001e\u0010l\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bm\u0010e\u001a\u0004\bn\u0010g\"\u001e\u0010o\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bp\u0010e\u001a\u0004\bq\u0010g\"\u001e\u0010r\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bs\u0010e\u001a\u0004\bt\u0010g\"\u001e\u0010u\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010h\u0012\u0004\bv\u0010e\u001a\u0004\bw\u0010g\"\u0018\u0010\u009b\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b\u009c\u0001\u0010g\"\u0018\u0010\u009d\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b\u009e\u0001\u0010g\"\u0018\u0010\u009f\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b \u0001\u0010g\"\u0018\u0010¡\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b¢\u0001\u0010g\"\u0018\u0010£\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b¤\u0001\u0010g\"\u0018\u0010¥\u0001\u001a\u00020\u000eX\u0080\u0004¢\u0006\u000b\n\u0002\u0010h\u001a\u0005\b¦\u0001\u0010g¨\u0006§\u0001²\u0006\u000b\u0010¨\u0001\u001a\u00020^X\u008a\u0084\u0002²\u0006\u000b\u0010©\u0001\u001a\u00020^X\u008a\u0084\u0002²\u0006\u000b\u0010ª\u0001\u001a\u00020^X\u008a\u0084\u0002²\u0006\u000b\u0010«\u0001\u001a\u00020^X\u008a\u0084\u0002²\u0006\u000b\u0010¬\u0001\u001a\u00020^X\u008a\u0084\u0002²\u0006\u000b\u0010\u00ad\u0001\u001a\u00020^X\u008a\u0084\u0002"}, d2 = {"ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "onLongClick", "onLongClickLabel", "", "shapes", "Landroidx/compose/material3/ListItemShapes;", "elevation", "Landroidx/compose/material3/ListItemElevation;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "SegmentedListItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculateWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "calculateHeight", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "listItemType", "Landroidx/compose/material3/ListItemType;", "verticalPadding", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "place", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "isThreeLine", "startPadding", "endPadding", "topPadding", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "()V", "getListItemVerticalPadding", "()F", "F", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "LeadingContentEndPadding", "getLeadingContentEndPadding$annotations", "getLeadingContentEndPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "isSupportingMultilineHeuristic", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "verticalPadding-yh95HIg", "(I)F", "LeadingDecorator", "textStyle", "LeadingDecorator-8s8adOk", "(FJLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TrailingDecorator", "TrailingDecorator-8s8adOk", "OverlineDecorator", "OverlineDecorator-3J-VO9M", "SupportingDecorator", "SupportingDecorator-3J-VO9M", "ContentDecorator", "ContentDecorator-3J-VO9M", "CollectInteractionsAsState", "Landroidx/compose/foundation/interaction/InteractionSource;", "pressedState", "Landroidx/compose/runtime/MutableState;", "focusedState", "hoveredState", "draggedState", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "InteractiveListItem", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/ListItemColors;Landroidx/compose/material3/ListItemShapes;Landroidx/compose/material3/ListItemElevation;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "InteractiveListItemLayout", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "zIndexLambda", "zIndex", "Landroidx/compose/material3/internal/FloatProducer;", "InteractiveListStartPadding", "getInteractiveListStartPadding", "InteractiveListEndPadding", "getInteractiveListEndPadding", "InteractiveListTopPadding", "getInteractiveListTopPadding", "InteractiveListBottomPadding", "getInteractiveListBottomPadding", "InteractiveListInternalSpacing", "getInteractiveListInternalSpacing", "InteractiveListVerticalAlignmentBreakpoint", "getInteractiveListVerticalAlignmentBreakpoint", "material3", "containerColor", "contentColor", "leadingColor", "trailingColor", "overlineColor", "supportingColor"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float InteractiveListBottomPadding;
    private static final float InteractiveListInternalSpacing;
    private static final float InteractiveListTopPadding;
    private static final float InteractiveListVerticalAlignmentBreakpoint;
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m9732constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m9732constructorimpl(12);
    private static final float InteractiveListStartPadding = ListTokens.INSTANCE.m5334getItemLeadingSpaceD9Ej5fM();
    private static final float InteractiveListEndPadding = ListTokens.INSTANCE.m5343getItemTrailingSpaceD9Ej5fM();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollectInteractionsAsState$lambda$1(InteractionSource interactionSource, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i, int i2, Composer composer, int i3) {
        CollectInteractionsAsState(interactionSource, mutableState, mutableState2, mutableState3, mutableState4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentDecorator_3J_VO9M$lambda$1(long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3464ContentDecorator3JVO9M(j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$24(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Alignment.Vertical vertical, boolean z, boolean z2, Function1 function1, Function0 function0, Function0 function02, String str, MutableInteractionSource mutableInteractionSource, ListItemColors listItemColors, ListItemShapes listItemShapes, ListItemElevation listItemElevation, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        InteractiveListItem(modifier, function2, function22, function23, function24, function25, vertical, z, z2, function1, function0, function02, str, mutableInteractionSource, listItemColors, listItemShapes, listItemElevation, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItemLayout$lambda$1(Modifier modifier, Alignment.Vertical vertical, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, int i, Composer composer, int i2) {
        InteractiveListItemLayout(modifier, vertical, function2, function22, function23, function24, function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingDecorator_8s8adOk$lambda$1(float f, long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3465LeadingDecorator8s8adOk(f, j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$1(Function0 function0, Modifier modifier, boolean z, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function02, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        ListItem(function0, modifier, z, function2, function22, function23, function24, vertical, function02, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$3(boolean z, Function0 function0, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function02, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        ListItem(z, (Function0<Unit>) function0, modifier, z2, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, vertical, (Function0<Unit>) function02, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$6(boolean z, Function1 function1, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function0, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        ListItem(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, vertical, (Function0<Unit>) function0, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItemLayout$lambda$1(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, int i, Composer composer, int i2) {
        ListItemLayout(function2, function22, function23, function24, function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$7(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, ListItemColors listItemColors, float f, float f2, int i, int i2, Composer composer, int i3) {
        m3466ListItemHXNGIdc(function2, modifier, function22, function23, function24, function25, listItemColors, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlineDecorator_3J_VO9M$lambda$1(long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3467OverlineDecorator3JVO9M(j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideTextStyleFromToken_3J_VO9M$lambda$0(long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3468ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$1(Function0 function0, ListItemShapes listItemShapes, Modifier modifier, boolean z, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function02, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedListItem(function0, listItemShapes, modifier, z, function2, function22, function23, function24, vertical, function02, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$3(boolean z, Function0 function0, ListItemShapes listItemShapes, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function02, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedListItem(z, (Function0<Unit>) function0, listItemShapes, modifier, z2, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, vertical, (Function0<Unit>) function02, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$6(boolean z, Function1 function1, ListItemShapes listItemShapes, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Alignment.Vertical vertical, Function0 function0, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function25, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedListItem(z, (Function1<? super Boolean, Unit>) function1, listItemShapes, modifier, z2, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, vertical, (Function0<Unit>) function0, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportingDecorator_3J_VO9M$lambda$1(long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3469SupportingDecorator3JVO9M(j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDecorator_8s8adOk$lambda$1(float f, long j, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i, Composer composer, int i2) {
        m3470TrailingDecorator8s8adOk(f, j, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3466ListItemHXNGIdc(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, ListItemColors listItemColors, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final float f3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final ListItemColors listItemColors2;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        ListItemColors listItemColors3;
        int i13;
        float f5;
        int i14;
        float f6;
        final ListItemColors listItemColors4;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        ComposableLambda rememberComposableLambda;
        ComposableLambda rememberComposableLambda2;
        Function2<? super Composer, ? super Integer, Unit> function215;
        ComposableLambda rememberComposableLambda3;
        final ComposableLambda composableLambda;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(487133126);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)N(headlineContent,modifier,overlineContent,supportingContent,leadingContent,trailingContent,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp)141@6821L207,206@9168L2,207@9220L5,212@9502L288,205@9096L694:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function26 = function22;
                i3 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function27 = function23;
                    i3 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function28 = function24;
                        i3 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function29 = function25;
                            i3 |= startRestartGroup.changedInstance(function29) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(listItemColors)) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                                i10 = i2 & 256;
                                if (i10 != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i3 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                    i12 = i3;
                                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "137@6641L8");
                                        ComposableLambda composableLambda2 = null;
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                listItemColors4 = listItemColors;
                                                f6 = f;
                                                f5 = f2;
                                                i14 = i12 & (-3670017);
                                            } else {
                                                listItemColors4 = listItemColors;
                                                f6 = f;
                                                f5 = f2;
                                                i14 = i12;
                                            }
                                        } else {
                                            if (i15 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                function26 = null;
                                            }
                                            if (i5 != 0) {
                                                function27 = null;
                                            }
                                            if (i6 != 0) {
                                                function28 = null;
                                            }
                                            if (i7 != 0) {
                                                function29 = null;
                                            }
                                            if ((i2 & 64) != 0) {
                                                listItemColors3 = ListItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                i13 = i12 & (-3670017);
                                            } else {
                                                listItemColors3 = listItemColors;
                                                i13 = i12;
                                            }
                                            float m3442getElevationD9Ej5fM = i9 != 0 ? ListItemDefaults.INSTANCE.m3442getElevationD9Ej5fM() : f;
                                            if (i11 == 0) {
                                                f5 = f2;
                                                i14 = i13;
                                                f6 = m3442getElevationD9Ej5fM;
                                                function213 = function29;
                                                listItemColors4 = listItemColors3;
                                                function214 = function28;
                                                startRestartGroup.endDefaults();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(487133126, i14, -1, "androidx.compose.material3.ListItem (ListItem.kt:140)");
                                                }
                                                final ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(629852750, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda15
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit ListItem_HXNGIdc$lambda$0;
                                                        ListItem_HXNGIdc$lambda$0 = ListItemKt.ListItem_HXNGIdc$lambda$0(ListItemColors.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                                                        return ListItem_HXNGIdc$lambda$0;
                                                    }
                                                }, startRestartGroup, 54);
                                                if (function27 != null) {
                                                    startRestartGroup.startReplaceGroup(-510691457);
                                                    startRestartGroup.endReplaceGroup();
                                                    rememberComposableLambda = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-510691456);
                                                    ComposerKt.sourceInformation(startRestartGroup, "*150@7138L352");
                                                    rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1291211644, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda16
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit ListItem_HXNGIdc$lambda$1$0;
                                                            ListItem_HXNGIdc$lambda$1$0 = ListItemKt.ListItem_HXNGIdc$lambda$1$0(ListItemColors.this, function27, (Composer) obj, ((Integer) obj2).intValue());
                                                            return ListItem_HXNGIdc$lambda$1$0;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (function26 != null) {
                                                    startRestartGroup.startReplaceGroup(-510230394);
                                                    startRestartGroup.endReplaceGroup();
                                                    rememberComposableLambda2 = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-510230393);
                                                    ComposerKt.sourceInformation(startRestartGroup, "*164@7606L249");
                                                    rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(372414991, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda17
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit ListItem_HXNGIdc$lambda$2$0;
                                                            ListItem_HXNGIdc$lambda$2$0 = ListItemKt.ListItem_HXNGIdc$lambda$2$0(ListItemColors.this, function26, (Composer) obj, ((Integer) obj2).intValue());
                                                            return ListItem_HXNGIdc$lambda$2$0;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (function214 != null) {
                                                    startRestartGroup.startReplaceGroup(-509862641);
                                                    startRestartGroup.endReplaceGroup();
                                                    function215 = function214;
                                                    rememberComposableLambda3 = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-509862640);
                                                    ComposerKt.sourceInformation(startRestartGroup, "*174@7969L496");
                                                    function215 = function214;
                                                    rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(449548451, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda18
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit ListItem_HXNGIdc$lambda$3$0;
                                                            ListItem_HXNGIdc$lambda$3$0 = ListItemKt.ListItem_HXNGIdc$lambda$3$0(ListItemColors.this, function214, (Composer) obj, ((Integer) obj2).intValue());
                                                            return ListItem_HXNGIdc$lambda$3$0;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (function213 != null) {
                                                    startRestartGroup.startReplaceGroup(-509255444);
                                                    startRestartGroup.endReplaceGroup();
                                                    composableLambda = rememberComposableLambda3;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-509255443);
                                                    ComposerKt.sourceInformation(startRestartGroup, "*190@8581L499");
                                                    composableLambda = rememberComposableLambda3;
                                                    composableLambda2 = ComposableLambdaKt.rememberComposableLambda(1946411067, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda19
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit ListItem_HXNGIdc$lambda$4$0;
                                                            ListItem_HXNGIdc$lambda$4$0 = ListItemKt.ListItem_HXNGIdc$lambda$4$0(ListItemColors.this, function213, (Composer) obj, ((Integer) obj2).intValue());
                                                            return ListItem_HXNGIdc$lambda$4$0;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -16408760, "CC(remember):ListItem.kt#9igjgp");
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda20
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            Unit ListItem_HXNGIdc$lambda$5$0;
                                                            ListItem_HXNGIdc$lambda$5$0 = ListItemKt.ListItem_HXNGIdc$lambda$5$0((SemanticsPropertyReceiver) obj);
                                                            return ListItem_HXNGIdc$lambda$5$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                final ComposableLambda composableLambda3 = rememberComposableLambda2;
                                                final ComposableLambda composableLambda4 = rememberComposableLambda;
                                                final ComposableLambda composableLambda5 = composableLambda2;
                                                int i16 = i14 >> 9;
                                                composer2 = startRestartGroup;
                                                SurfaceKt.m4112SurfaceT9BRK9s(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue).then(modifier2), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors4.m3397containerColorXeAY9LY(true, false, false), listItemColors4.m3398contentColorXeAY9LY(true, false, false), f6, f5, null, ComposableLambdaKt.rememberComposableLambda(1192488737, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda22
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit ListItem_HXNGIdc$lambda$6;
                                                        ListItem_HXNGIdc$lambda$6 = ListItemKt.ListItem_HXNGIdc$lambda$6(Function2.this, composableLambda5, rememberComposableLambda4, composableLambda3, composableLambda4, (Composer) obj, ((Integer) obj2).intValue());
                                                        return ListItem_HXNGIdc$lambda$6;
                                                    }
                                                }, startRestartGroup, 54), composer2, (57344 & i16) | 12582912 | (i16 & 458752), 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                modifier3 = modifier2;
                                                function210 = function26;
                                                listItemColors2 = listItemColors4;
                                                function211 = function27;
                                                f3 = f6;
                                                f4 = f5;
                                                function212 = function215;
                                            } else {
                                                f6 = m3442getElevationD9Ej5fM;
                                                f5 = ListItemDefaults.INSTANCE.m3442getElevationD9Ej5fM();
                                                listItemColors4 = listItemColors3;
                                                i14 = i13;
                                            }
                                        }
                                        function214 = function28;
                                        function213 = function29;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        final Function2 rememberComposableLambda42 = ComposableLambdaKt.rememberComposableLambda(629852750, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ListItem_HXNGIdc$lambda$0;
                                                ListItem_HXNGIdc$lambda$0 = ListItemKt.ListItem_HXNGIdc$lambda$0(ListItemColors.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                                                return ListItem_HXNGIdc$lambda$0;
                                            }
                                        }, startRestartGroup, 54);
                                        if (function27 != null) {
                                        }
                                        if (function26 != null) {
                                        }
                                        if (function214 != null) {
                                        }
                                        if (function213 != null) {
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -16408760, "CC(remember):ListItem.kt#9igjgp");
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Function2 composableLambda32 = rememberComposableLambda2;
                                        final Function2 composableLambda42 = rememberComposableLambda;
                                        final Function2 composableLambda52 = composableLambda2;
                                        int i162 = i14 >> 9;
                                        composer2 = startRestartGroup;
                                        SurfaceKt.m4112SurfaceT9BRK9s(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue).then(modifier2), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors4.m3397containerColorXeAY9LY(true, false, false), listItemColors4.m3398contentColorXeAY9LY(true, false, false), f6, f5, null, ComposableLambdaKt.rememberComposableLambda(1192488737, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda22
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ListItem_HXNGIdc$lambda$6;
                                                ListItem_HXNGIdc$lambda$6 = ListItemKt.ListItem_HXNGIdc$lambda$6(Function2.this, composableLambda52, rememberComposableLambda42, composableLambda32, composableLambda42, (Composer) obj, ((Integer) obj2).intValue());
                                                return ListItem_HXNGIdc$lambda$6;
                                            }
                                        }, startRestartGroup, 54), composer2, (57344 & i162) | 12582912 | (i162 & 458752), 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier2;
                                        function210 = function26;
                                        listItemColors2 = listItemColors4;
                                        function211 = function27;
                                        f3 = f6;
                                        f4 = f5;
                                        function212 = function215;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        f3 = f;
                                        modifier3 = modifier2;
                                        function210 = function26;
                                        function211 = function27;
                                        function212 = function28;
                                        function213 = function29;
                                        listItemColors2 = listItemColors;
                                        f4 = f2;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda23
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ListItem_HXNGIdc$lambda$7;
                                                ListItem_HXNGIdc$lambda$7 = ListItemKt.ListItem_HXNGIdc$lambda$7(Function2.this, modifier3, function210, function211, function212, function213, listItemColors2, f3, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                                return ListItem_HXNGIdc$lambda$7;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i11 = i10;
                                i12 = i3;
                                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & 256;
                            if (i10 != 0) {
                            }
                            i11 = i10;
                            i12 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        function29 = function25;
                        if ((i & 1572864) == 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        i12 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function29 = function25;
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function27 = function23;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function28 = function24;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function29 = function25;
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function26 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function27 = function23;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function28 = function24;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function29 = function25;
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function26 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function27 = function23;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function28 = function24;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function29 = function25;
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$0(ListItemColors listItemColors, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C142@6831L191:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629852750, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:142)");
            }
            m3468ProvideTextStyleFromToken3JVO9M(listItemColors.m3398contentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemLabelTextFont(), function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$1$0(ListItemColors listItemColors, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C151@7156L320:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291211644, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:151)");
            }
            m3468ProvideTextStyleFromToken3JVO9M(listItemColors.m3435supportingContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemSupportingTextFont(), function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$2$0(ListItemColors listItemColors, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C165@7624L217:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372414991, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:165)");
            }
            m3468ProvideTextStyleFromToken3JVO9M(listItemColors.m3434overlineContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemOverlineFont(), function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$3$0(ListItemColors listItemColors, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C175@7987L464:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(449548451, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:175)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, LeadingContentEndPadding, 0.0f, 11, null);
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
            ComposerKt.sourceInformationMarkerStart(composer, 788370324, "C176@8063L370:ListItem.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(listItemColors.m3433leadingContentColorXeAY9LY(true, false, false))), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
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
    public static final Unit ListItem_HXNGIdc$lambda$4$0(ListItemColors listItemColors, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C191@8599L467:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1946411067, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:191)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, TrailingContentStartPadding, 0.0f, 0.0f, 0.0f, 14, null);
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
            ComposerKt.sourceInformationMarkerStart(composer, -869004430, "C192@8680L368:ListItem.kt#uh7d8r");
            m3468ProvideTextStyleFromToken3JVO9M(listItemColors.m3436trailingContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemTrailingSupportingTextFont(), function2, composer, 48);
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
    public static final Unit ListItem_HXNGIdc$lambda$5$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem_HXNGIdc$lambda$6(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C213@9512L272:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192488737, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:213)");
            }
            ListItemLayout(function2, function22, function23, function24, function25, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(final Function0<Unit> function0, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function02, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Alignment.Vertical vertical2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final ListItemColors listItemColors2;
        final PaddingValues paddingValues2;
        final boolean z3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Alignment.Vertical vertical3;
        final Function0<Unit> function03;
        final String str2;
        final ListItemShapes listItemShapes2;
        final ListItemElevation listItemElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        ListItemShapes listItemShapes3;
        ListItemColors listItemColors3;
        ListItemColors listItemColors4;
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource3;
        ListItemElevation listItemElevation3;
        int i20;
        PaddingValues contentPadding;
        ListItemColors listItemColors5;
        MutableInteractionSource mutableInteractionSource4;
        ListItemElevation listItemElevation4;
        int i21;
        Function2<? super Composer, ? super Integer, Unit> function214;
        String str3;
        ListItemShapes listItemShapes4;
        Alignment.Vertical vertical4;
        Function0<Unit> function04;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(185717924);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)N(onClick,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,shapes,colors,elevation,contentPadding,interactionSource,content)292@13672L2,282@13296L661:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        if (i26 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function26 = function2;
                    i4 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function27 = function22;
                        i4 |= startRestartGroup.changedInstance(function27) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function28 = function23;
                        } else {
                            function28 = function23;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changedInstance(function28) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            function29 = function24;
                        } else {
                            function29 = function24;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                vertical2 = vertical;
                                if (startRestartGroup.changed(vertical2)) {
                                    i25 = 8388608;
                                    i4 |= i25;
                                }
                            } else {
                                vertical2 = vertical;
                            }
                            i25 = 4194304;
                            i4 |= i25;
                        } else {
                            vertical2 = vertical;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(function02) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changed(str) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i2 & 6) != 0) {
                                if ((i3 & 1024) == 0 && startRestartGroup.changed(listItemShapes)) {
                                    i24 = 4;
                                    i13 = i2 | i24;
                                }
                                i24 = 2;
                                i13 = i2 | i24;
                            } else {
                                i13 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                if ((i3 & 2048) == 0 && startRestartGroup.changed(listItemColors)) {
                                    i23 = 32;
                                    i13 |= i23;
                                }
                                i23 = 16;
                                i13 |= i23;
                            }
                            if ((i2 & 384) == 0) {
                                if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemElevation)) {
                                    i22 = 256;
                                    i13 |= i22;
                                }
                                i22 = 128;
                                i13 |= i22;
                            }
                            int i27 = i13;
                            i14 = i3 & 8192;
                            if (i14 == 0) {
                                i15 = i27 | 3072;
                            } else if ((i2 & 3072) == 0) {
                                i15 = i27 | (startRestartGroup.changed(paddingValues) ? 2048 : 1024);
                            } else {
                                i15 = i27;
                            }
                            i16 = i3 & 16384;
                            if (i16 == 0) {
                                i17 = i15 | 24576;
                            } else {
                                i17 = i15;
                                if ((i2 & 24576) == 0) {
                                    i17 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i17 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "272@12850L19,275@12994L8,276@13050L8");
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & 128) != 0) {
                                                i4 &= -29360129;
                                            }
                                            if ((i3 & 1024) != 0) {
                                                i17 &= -15;
                                            }
                                            if ((i3 & 2048) != 0) {
                                                i17 &= -113;
                                            }
                                            i21 = i17;
                                            if ((i3 & 4096) != 0) {
                                                i21 &= -897;
                                            }
                                            str3 = str;
                                            listItemShapes4 = listItemShapes;
                                            listItemColors5 = listItemColors;
                                            listItemElevation4 = listItemElevation;
                                            contentPadding = paddingValues;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            z4 = z2;
                                            function215 = function26;
                                            function216 = function27;
                                            function214 = function28;
                                            function217 = function29;
                                            vertical4 = vertical2;
                                            function04 = function02;
                                        } else {
                                            Modifier.Companion companion = i26 != 0 ? Modifier.INSTANCE : modifier2;
                                            z4 = i5 == 0 ? z2 : true;
                                            if (i6 != 0) {
                                                function26 = null;
                                            }
                                            if (i7 != 0) {
                                                function27 = null;
                                            }
                                            if (i8 != 0) {
                                                function28 = null;
                                            }
                                            if (i9 != 0) {
                                                function29 = null;
                                            }
                                            if ((i3 & 128) != 0) {
                                                i4 &= -29360129;
                                                vertical2 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                            }
                                            Function0<Unit> function05 = i10 != 0 ? null : function02;
                                            String str4 = i12 != 0 ? null : str;
                                            if ((i3 & 1024) != 0) {
                                                listItemShapes3 = ListItemDefaults.INSTANCE.shapes(startRestartGroup, 6);
                                                i17 &= -15;
                                            } else {
                                                listItemShapes3 = listItemShapes;
                                            }
                                            if ((i3 & 2048) != 0) {
                                                listItemColors3 = ListItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                i17 &= -113;
                                            } else {
                                                listItemColors3 = listItemColors;
                                            }
                                            int i28 = i17;
                                            Modifier modifier4 = companion;
                                            if ((i3 & 4096) != 0) {
                                                listItemColors4 = listItemColors3;
                                                i18 = i16;
                                                i19 = i4;
                                                mutableInteractionSource3 = null;
                                                listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                                i20 = i28 & (-897);
                                            } else {
                                                listItemColors4 = listItemColors3;
                                                i18 = i16;
                                                i19 = i4;
                                                mutableInteractionSource3 = null;
                                                listItemElevation3 = listItemElevation;
                                                i20 = i28;
                                            }
                                            contentPadding = i14 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                                            listItemColors5 = listItemColors4;
                                            if (i18 != 0) {
                                                listItemElevation4 = listItemElevation3;
                                                i21 = i20;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                function214 = function28;
                                                str3 = str4;
                                                listItemShapes4 = listItemShapes3;
                                                vertical4 = vertical2;
                                                i4 = i19;
                                            } else {
                                                i4 = i19;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                listItemElevation4 = listItemElevation3;
                                                i21 = i20;
                                                function214 = function28;
                                                str3 = str4;
                                                listItemShapes4 = listItemShapes3;
                                                vertical4 = vertical2;
                                            }
                                            modifier2 = modifier4;
                                            function04 = function05;
                                            function215 = function26;
                                            function216 = function27;
                                            function217 = function29;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(185717924, i4, i21, "androidx.compose.material3.ListItem (ListItem.kt:281)");
                                        }
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1913662842, "CC(remember):ListItem.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit ListItem$lambda$0$0;
                                                    ListItem$lambda$0$0 = ListItemKt.ListItem$lambda$0$0((SemanticsPropertyReceiver) obj);
                                                    return ListItem$lambda$0$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        Function1 function1 = (Function1) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int i29 = i4 >> 3;
                                        int i30 = (i29 & 3670016) | (i29 & 14) | 905969664 | ((i21 >> 12) & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | ((i4 << 15) & 29360128);
                                        int i31 = i4 >> 21;
                                        int i32 = (i4 & 14) | (i31 & 112) | (i31 & 896) | ((i21 >> 3) & 7168) | ((i21 << 9) & 57344) | ((i21 << 15) & 458752);
                                        int i33 = i21 << 12;
                                        composer2 = startRestartGroup;
                                        Modifier modifier5 = modifier2;
                                        boolean z5 = z4;
                                        PaddingValues paddingValues3 = contentPadding;
                                        InteractiveListItem(modifier5, function25, function215, function216, function214, function217, vertical4, z5, false, function1, function0, function04, str3, mutableInteractionSource4, listItemColors5, listItemShapes4, listItemElevation4, paddingValues3, composer2, i30, i32 | (3670016 & i33) | (i33 & 29360128));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier5;
                                        function210 = function215;
                                        function211 = function216;
                                        function212 = function214;
                                        function213 = function217;
                                        vertical3 = vertical4;
                                        z3 = z5;
                                        function03 = function04;
                                        str2 = str3;
                                        mutableInteractionSource2 = mutableInteractionSource4;
                                        listItemColors2 = listItemColors5;
                                        listItemShapes2 = listItemShapes4;
                                        listItemElevation2 = listItemElevation4;
                                        paddingValues2 = paddingValues3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        listItemColors2 = listItemColors;
                                        paddingValues2 = paddingValues;
                                        z3 = z2;
                                        function210 = function26;
                                        function211 = function27;
                                        function212 = function28;
                                        modifier3 = modifier2;
                                        function213 = function29;
                                        vertical3 = vertical2;
                                        function03 = function02;
                                        str2 = str;
                                        listItemShapes2 = listItemShapes;
                                        listItemElevation2 = listItemElevation;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ListItem$lambda$1;
                                                ListItem$lambda$1 = ListItemKt.ListItem$lambda$1(Function0.this, modifier3, z3, function210, function211, function212, function213, vertical3, function03, str2, listItemShapes2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return ListItem$lambda$1;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        if ((i2 & 6) != 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        int i272 = i13;
                        i14 = i3 & 8192;
                        if (i14 == 0) {
                        }
                        i16 = i3 & 16384;
                        if (i16 == 0) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function27 = function22;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i2 & 6) != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    int i2722 = i13;
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                    }
                    i16 = i3 & 16384;
                    if (i16 == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function26 = function2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function27 = function22;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                int i27222 = i13;
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                i16 = i3 & 16384;
                if (i16 == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function26 = function2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function27 = function22;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i272222 = i13;
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            i16 = i3 & 16384;
            if (i16 == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function26 = function2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function27 = function22;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i2722222 = i13;
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i16 = i3 & 16384;
        if (i16 == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i17 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function02, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function03;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i9;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer composer2;
        final Alignment.Vertical vertical2;
        final ListItemShapes listItemShapes2;
        final ListItemElevation listItemElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final String str2;
        final ListItemColors listItemColors2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Alignment.Vertical vertical3;
        ListItemShapes listItemShapes3;
        ListItemShapes listItemShapes4;
        int i18;
        ListItemColors listItemColors3;
        Alignment.Vertical vertical4;
        int i19;
        int i20;
        MutableInteractionSource mutableInteractionSource3;
        ListItemElevation listItemElevation3;
        Alignment.Vertical vertical5;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        int i21;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function0<Unit> function05;
        Modifier modifier4;
        String str3;
        ListItemColors listItemColors4;
        ListItemShapes listItemShapes5;
        MutableInteractionSource mutableInteractionSource4;
        ListItemElevation listItemElevation4;
        int i22;
        Function2<? super Composer, ? super Integer, Unit> function216;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(-927795512);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)N(selected,onClick,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,shapes,colors,elevation,contentPadding,interactionSource,content)372@17754L84,362@17375L746:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function03 = function0;
            i4 |= startRestartGroup.changedInstance(function03) ? 32 : 16;
        } else {
            function03 = function0;
        }
        int i26 = i3 & 4;
        if (i26 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            int i27 = 1024;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function26 = function2;
                    i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function28 = function23;
                    } else {
                        function28 = function23;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        function29 = function24;
                    } else {
                        function29 = function24;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(vertical)) {
                            i25 = 67108864;
                            i4 |= i25;
                        }
                        i25 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i25;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(function02) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(listItemShapes)) {
                                i24 = 32;
                                i14 |= i24;
                            }
                            i24 = 16;
                            i14 |= i24;
                        }
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemColors)) {
                                i23 = 256;
                                i14 |= i23;
                            }
                            i23 = 128;
                            i14 |= i23;
                        }
                        if ((i2 & 3072) == 0) {
                            if ((i3 & 8192) == 0 && startRestartGroup.changed(listItemElevation)) {
                                i27 = 2048;
                            }
                            i14 |= i27;
                        }
                        int i28 = i14;
                        i15 = i3 & 16384;
                        if (i15 != 0) {
                            i16 = i28 | 24576;
                        } else {
                            i16 = i28;
                            if ((i2 & 24576) == 0) {
                                i16 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                                i17 = i3 & 32768;
                                if (i17 == 0) {
                                    i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i16 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i16 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                                }
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "352@16929L19,355@17073L8,356@17129L8");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i16 &= -113;
                                        }
                                        int i29 = i16;
                                        if ((i3 & 4096) != 0) {
                                            i29 &= -897;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            i29 &= -7169;
                                        }
                                        str3 = str;
                                        listItemColors4 = listItemColors;
                                        listItemElevation4 = listItemElevation;
                                        paddingValues3 = paddingValues;
                                        function213 = function26;
                                        function214 = function27;
                                        function215 = function28;
                                        modifier4 = modifier2;
                                        function05 = function02;
                                        listItemShapes5 = listItemShapes;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        i21 = i29;
                                        i22 = i4;
                                        vertical5 = vertical;
                                    } else {
                                        if (i26 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z3 = true;
                                        }
                                        if (i6 != 0) {
                                            function26 = null;
                                        }
                                        if (i7 != 0) {
                                            function27 = null;
                                        }
                                        if (i8 != 0) {
                                            function28 = null;
                                        }
                                        if (i9 != 0) {
                                            function29 = null;
                                        }
                                        if ((i3 & 256) != 0) {
                                            vertical3 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            vertical3 = vertical;
                                        }
                                        Function0<Unit> function06 = i11 != 0 ? null : function02;
                                        String str4 = i13 != 0 ? null : str;
                                        if ((i3 & 2048) != 0) {
                                            listItemShapes3 = ListItemDefaults.INSTANCE.shapes(startRestartGroup, 6);
                                            i16 &= -113;
                                        } else {
                                            listItemShapes3 = listItemShapes;
                                        }
                                        int i30 = i16;
                                        if ((i3 & 4096) != 0) {
                                            listItemShapes4 = listItemShapes3;
                                            listItemColors3 = ListItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                            i18 = i30 & (-897);
                                        } else {
                                            listItemShapes4 = listItemShapes3;
                                            i18 = i30;
                                            listItemColors3 = listItemColors;
                                        }
                                        ListItemColors listItemColors5 = listItemColors3;
                                        if ((i3 & 8192) != 0) {
                                            vertical4 = vertical3;
                                            i19 = i15;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                            i18 &= -7169;
                                        } else {
                                            vertical4 = vertical3;
                                            i19 = i15;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = listItemElevation;
                                        }
                                        PaddingValues contentPadding = i19 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                                        if (i17 != 0) {
                                            paddingValues3 = contentPadding;
                                            function213 = function26;
                                            function214 = function27;
                                            i21 = i18;
                                            function215 = function28;
                                            function05 = function06;
                                            modifier4 = modifier2;
                                            str3 = str4;
                                            listItemColors4 = listItemColors5;
                                            listItemShapes5 = listItemShapes4;
                                            listItemElevation4 = listItemElevation3;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            vertical5 = vertical4;
                                        } else {
                                            vertical5 = vertical4;
                                            paddingValues3 = contentPadding;
                                            function213 = function26;
                                            function214 = function27;
                                            i21 = i18;
                                            function215 = function28;
                                            function05 = function06;
                                            modifier4 = modifier2;
                                            str3 = str4;
                                            listItemColors4 = listItemColors5;
                                            listItemShapes5 = listItemShapes4;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            listItemElevation4 = listItemElevation3;
                                        }
                                        i22 = i20;
                                    }
                                    startRestartGroup.endDefaults();
                                    Function2<? super Composer, ? super Integer, Unit> function217 = function213;
                                    if (ComposerKt.isTraceInProgress()) {
                                        function216 = function214;
                                        ComposerKt.traceEventStart(-927795512, i22, i21, "androidx.compose.material3.ListItem (ListItem.kt:361)");
                                    } else {
                                        function216 = function214;
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1741750076, "CC(remember):ListItem.kt#9igjgp");
                                    boolean z5 = (i22 & 14) == 4;
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda39
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit ListItem$lambda$2$0;
                                                ListItem$lambda$2$0 = ListItemKt.ListItem$lambda$2$0(z, (SemanticsPropertyReceiver) obj);
                                                return ListItem$lambda$2$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i31 = i22 >> 6;
                                    int i32 = i22;
                                    int i33 = (i31 & 14) | ((i21 >> 15) & 112) | (i31 & 896) | (i31 & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | ((i32 << 12) & 29360128) | ((i32 << 24) & 234881024);
                                    int i34 = i21 << 6;
                                    int i35 = i21 << 9;
                                    int i36 = (i34 & 57344) | (i34 & 896) | ((i32 >> 3) & 14) | ((i32 >> 24) & 112) | ((i21 >> 6) & 7168) | ((i21 << 12) & 458752) | (3670016 & i35) | (i35 & 29360128);
                                    Modifier modifier5 = modifier4;
                                    Function2<? super Composer, ? super Integer, Unit> function218 = function216;
                                    composer2 = startRestartGroup;
                                    Function2<? super Composer, ? super Integer, Unit> function219 = function29;
                                    InteractiveListItem(modifier5, function25, function217, function218, function215, function219, vertical5, z3, z, (Function1) rememberedValue, function03, function05, str3, mutableInteractionSource4, listItemColors4, listItemShapes5, listItemElevation4, paddingValues3, composer2, i33, i36);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    boolean z6 = z3;
                                    function212 = function215;
                                    z4 = z6;
                                    ListItemElevation listItemElevation5 = listItemElevation4;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    listItemColors2 = listItemColors4;
                                    listItemElevation2 = listItemElevation5;
                                    function29 = function219;
                                    vertical2 = vertical5;
                                    function04 = function05;
                                    str2 = str3;
                                    listItemShapes2 = listItemShapes5;
                                    paddingValues2 = paddingValues3;
                                    function210 = function217;
                                    function211 = function218;
                                    modifier3 = modifier5;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    vertical2 = vertical;
                                    listItemShapes2 = listItemShapes;
                                    listItemElevation2 = listItemElevation;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z4 = z3;
                                    function210 = function26;
                                    function211 = function27;
                                    function212 = function28;
                                    modifier3 = modifier2;
                                    function04 = function02;
                                    str2 = str;
                                    listItemColors2 = listItemColors;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda40
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit ListItem$lambda$3;
                                            ListItem$lambda$3 = ListItemKt.ListItem$lambda$3(z, function0, modifier3, z4, function210, function211, function212, function29, vertical2, function04, str2, listItemShapes2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return ListItem$lambda$3;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        i17 = i3 & 32768;
                        if (i17 == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    int i282 = i14;
                    i15 = i3 & 16384;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i2822 = i14;
                i15 = i3 & 16384;
                if (i15 != 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function26 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i28222 = i14;
            i15 = i3 & 16384;
            if (i15 != 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        int i272 = 1024;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function26 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i282222 = i14;
        i15 = i3 & 16384;
        if (i15 != 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$2$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8886getRadioButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function0, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
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
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Alignment.Vertical vertical2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Modifier modifier3;
        final Function0<Unit> function02;
        final String str2;
        final ListItemShapes listItemShapes2;
        final ListItemColors listItemColors2;
        final ListItemElevation listItemElevation2;
        ScopeUpdateScope endRestartGroup;
        Alignment.Vertical vertical3;
        ListItemShapes listItemShapes3;
        ListItemShapes listItemShapes4;
        int i18;
        ListItemColors listItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        int i19;
        int i20;
        MutableInteractionSource mutableInteractionSource3;
        ListItemElevation listItemElevation3;
        int i21;
        ListItemColors listItemColors4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        ListItemElevation listItemElevation4;
        PaddingValues paddingValues3;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function0<Unit> function03;
        String str3;
        ListItemShapes listItemShapes5;
        int i22;
        int i23;
        Function2<? super Composer, ? super Integer, Unit> function217;
        MutableInteractionSource mutableInteractionSource4;
        Function2<? super Composer, ? super Integer, Unit> function218;
        boolean z6;
        Object rememberedValue;
        boolean z7;
        Object rememberedValue2;
        int i24;
        int i25;
        int i26;
        Composer startRestartGroup = composer.startRestartGroup(1364860455);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)N(checked,onCheckedChange,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,shapes,colors,elevation,contentPadding,interactionSource,content)457@22049L99,461@22168L29,447@21671L782:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i27 = i3 & 4;
        if (i27 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            int i28 = 1024;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function26 = function2;
                    i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function28 = function23;
                    } else {
                        function28 = function23;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(vertical)) {
                            i26 = 67108864;
                            i4 |= i26;
                        }
                        i26 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i26;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(function0) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(listItemShapes)) {
                                i25 = 32;
                                i14 |= i25;
                            }
                            i25 = 16;
                            i14 |= i25;
                        }
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemColors)) {
                                i24 = 256;
                                i14 |= i24;
                            }
                            i24 = 128;
                            i14 |= i24;
                        }
                        if ((i2 & 3072) == 0) {
                            if ((i3 & 8192) == 0 && startRestartGroup.changed(listItemElevation)) {
                                i28 = 2048;
                            }
                            i14 |= i28;
                        }
                        int i29 = i14;
                        i15 = i3 & 16384;
                        if (i15 != 0) {
                            i16 = i29 | 24576;
                        } else {
                            i16 = i29;
                            if ((i2 & 24576) == 0) {
                                i16 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                                i17 = i3 & 32768;
                                if (i17 == 0) {
                                    i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i16 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i16 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                                }
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "437@21225L19,440@21369L8,441@21425L8");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i16 &= -113;
                                        }
                                        int i30 = i16;
                                        if ((i3 & 4096) != 0) {
                                            i30 &= -897;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            i30 &= -7169;
                                        }
                                        boolean z8 = z3;
                                        i23 = i30;
                                        i22 = i4;
                                        z5 = z8;
                                        function214 = function24;
                                        vertical3 = vertical;
                                        listItemShapes5 = listItemShapes;
                                        listItemColors4 = listItemColors;
                                        listItemElevation4 = listItemElevation;
                                        paddingValues3 = paddingValues;
                                        function215 = function28;
                                        function216 = function26;
                                        function217 = function27;
                                        function03 = function0;
                                        str3 = str;
                                    } else {
                                        if (i27 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z3 = true;
                                        }
                                        if (i6 != 0) {
                                            function26 = null;
                                        }
                                        if (i7 != 0) {
                                            function27 = null;
                                        }
                                        if (i8 != 0) {
                                            function28 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function219 = i9 != 0 ? null : function24;
                                        if ((i3 & 256) != 0) {
                                            vertical3 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            vertical3 = vertical;
                                        }
                                        Function0<Unit> function04 = i11 != 0 ? null : function0;
                                        String str4 = i13 != 0 ? null : str;
                                        if ((i3 & 2048) != 0) {
                                            listItemShapes3 = ListItemDefaults.INSTANCE.shapes(startRestartGroup, 6);
                                            i16 &= -113;
                                        } else {
                                            listItemShapes3 = listItemShapes;
                                        }
                                        int i31 = i16;
                                        if ((i3 & 4096) != 0) {
                                            listItemShapes4 = listItemShapes3;
                                            listItemColors3 = ListItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                            i18 = i31 & (-897);
                                        } else {
                                            listItemShapes4 = listItemShapes3;
                                            i18 = i31;
                                            listItemColors3 = listItemColors;
                                        }
                                        ListItemColors listItemColors5 = listItemColors3;
                                        if ((i3 & 8192) != 0) {
                                            function213 = function219;
                                            i19 = i15;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                            i21 = i18 & (-7169);
                                        } else {
                                            function213 = function219;
                                            i19 = i15;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = listItemElevation;
                                            i21 = i18;
                                        }
                                        PaddingValues contentPadding = i19 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                                        if (i17 != 0) {
                                            boolean z9 = z3;
                                            i23 = i21;
                                            function217 = function27;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            z5 = z9;
                                            listItemColors4 = listItemColors5;
                                            function214 = function213;
                                            listItemElevation4 = listItemElevation3;
                                            paddingValues3 = contentPadding;
                                            function215 = function28;
                                            function216 = function26;
                                            function03 = function04;
                                            str3 = str4;
                                            listItemShapes5 = listItemShapes4;
                                            i22 = i20;
                                            startRestartGroup.endDefaults();
                                            Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                            if (ComposerKt.isTraceInProgress()) {
                                                function218 = function215;
                                            } else {
                                                function218 = function215;
                                                ComposerKt.traceEventStart(1364860455, i22, i23, "androidx.compose.material3.ListItem (ListItem.kt:446)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1665911946, "CC(remember):ListItem.kt#9igjgp");
                                            int i32 = i22 & 14;
                                            z6 = i32 != 4;
                                            int i33 = i22;
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit ListItem$lambda$4$0;
                                                        ListItem$lambda$4$0 = ListItemKt.ListItem$lambda$4$0(z, (SemanticsPropertyReceiver) obj);
                                                        return ListItem$lambda$4$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            Function1 function12 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1665915684, "CC(remember):ListItem.kt#9igjgp");
                                            z7 = ((i33 & 112) != 32) | (i32 == 4);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!z7 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit ListItem$lambda$5$0;
                                                        ListItem$lambda$5$0 = ListItemKt.ListItem$lambda$5$0(Function1.this, z);
                                                        return ListItem$lambda$5$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            int i34 = i33 >> 6;
                                            int i35 = (i34 & 896) | (i34 & 14) | ((i23 >> 15) & 112) | (i34 & 7168) | (57344 & i34) | (458752 & i34) | (i34 & 3670016) | ((i33 << 12) & 29360128) | ((i33 << 24) & 234881024);
                                            int i36 = i23 << 6;
                                            int i37 = ((i33 >> 24) & 112) | (i36 & 896) | ((i23 >> 6) & 7168) | (i36 & 57344) | ((i23 << 12) & 458752);
                                            int i38 = i23 << 9;
                                            int i39 = i37 | (3670016 & i38) | (i38 & 29360128);
                                            Function2<? super Composer, ? super Integer, Unit> function221 = function216;
                                            Function2<? super Composer, ? super Integer, Unit> function222 = function218;
                                            composer2 = startRestartGroup;
                                            Alignment.Vertical vertical4 = vertical3;
                                            Modifier modifier4 = modifier2;
                                            ListItemColors listItemColors6 = listItemColors4;
                                            InteractiveListItem(modifier4, function25, function221, function220, function222, function214, vertical4, z5, z, function12, (Function0) rememberedValue2, function03, str3, mutableInteractionSource4, listItemColors6, listItemShapes5, listItemElevation4, paddingValues3, composer2, i35, i39);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            boolean z10 = z5;
                                            function210 = function222;
                                            z4 = z10;
                                            ListItemElevation listItemElevation5 = listItemElevation4;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            listItemColors2 = listItemColors6;
                                            listItemElevation2 = listItemElevation5;
                                            function29 = function214;
                                            vertical2 = vertical4;
                                            function02 = function03;
                                            str2 = str3;
                                            listItemShapes2 = listItemShapes5;
                                            paddingValues2 = paddingValues3;
                                            function211 = function221;
                                            function212 = function220;
                                            modifier3 = modifier4;
                                        } else {
                                            listItemColors4 = listItemColors5;
                                            function214 = function213;
                                            listItemElevation4 = listItemElevation3;
                                            paddingValues3 = contentPadding;
                                            z5 = z3;
                                            function215 = function28;
                                            function216 = function26;
                                            function03 = function04;
                                            str3 = str4;
                                            listItemShapes5 = listItemShapes4;
                                            i22 = i20;
                                            i23 = i21;
                                            function217 = function27;
                                        }
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    startRestartGroup.endDefaults();
                                    Function2<? super Composer, ? super Integer, Unit> function2202 = function217;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1665911946, "CC(remember):ListItem.kt#9igjgp");
                                    int i322 = i22 & 14;
                                    if (i322 != 4) {
                                    }
                                    int i332 = i22;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z6) {
                                    }
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit ListItem$lambda$4$0;
                                            ListItem$lambda$4$0 = ListItemKt.ListItem$lambda$4$0(z, (SemanticsPropertyReceiver) obj);
                                            return ListItem$lambda$4$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    Function1 function122 = (Function1) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1665915684, "CC(remember):ListItem.kt#9igjgp");
                                    z7 = ((i332 & 112) != 32) | (i322 == 4);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!z7) {
                                    }
                                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit ListItem$lambda$5$0;
                                            ListItem$lambda$5$0 = ListItemKt.ListItem$lambda$5$0(Function1.this, z);
                                            return ListItem$lambda$5$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i342 = i332 >> 6;
                                    int i352 = (i342 & 896) | (i342 & 14) | ((i23 >> 15) & 112) | (i342 & 7168) | (57344 & i342) | (458752 & i342) | (i342 & 3670016) | ((i332 << 12) & 29360128) | ((i332 << 24) & 234881024);
                                    int i362 = i23 << 6;
                                    int i372 = ((i332 >> 24) & 112) | (i362 & 896) | ((i23 >> 6) & 7168) | (i362 & 57344) | ((i23 << 12) & 458752);
                                    int i382 = i23 << 9;
                                    int i392 = i372 | (3670016 & i382) | (i382 & 29360128);
                                    Function2<? super Composer, ? super Integer, Unit> function2212 = function216;
                                    Function2<? super Composer, ? super Integer, Unit> function2222 = function218;
                                    composer2 = startRestartGroup;
                                    Alignment.Vertical vertical42 = vertical3;
                                    Modifier modifier42 = modifier2;
                                    ListItemColors listItemColors62 = listItemColors4;
                                    InteractiveListItem(modifier42, function25, function2212, function2202, function2222, function214, vertical42, z5, z, function122, (Function0) rememberedValue2, function03, str3, mutableInteractionSource4, listItemColors62, listItemShapes5, listItemElevation4, paddingValues3, composer2, i352, i392);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    boolean z102 = z5;
                                    function210 = function2222;
                                    z4 = z102;
                                    ListItemElevation listItemElevation52 = listItemElevation4;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    listItemColors2 = listItemColors62;
                                    listItemElevation2 = listItemElevation52;
                                    function29 = function214;
                                    vertical2 = vertical42;
                                    function02 = function03;
                                    str2 = str3;
                                    listItemShapes2 = listItemShapes5;
                                    paddingValues2 = paddingValues3;
                                    function211 = function2212;
                                    function212 = function2202;
                                    modifier3 = modifier42;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function29 = function24;
                                    vertical2 = vertical;
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z4 = z3;
                                    function210 = function28;
                                    function211 = function26;
                                    function212 = function27;
                                    modifier3 = modifier2;
                                    function02 = function0;
                                    str2 = str;
                                    listItemShapes2 = listItemShapes;
                                    listItemColors2 = listItemColors;
                                    listItemElevation2 = listItemElevation;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit ListItem$lambda$6;
                                            ListItem$lambda$6 = ListItemKt.ListItem$lambda$6(z, function1, modifier3, z4, function211, function212, function210, function29, vertical2, function02, str2, listItemShapes2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return ListItem$lambda$6;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        i17 = i3 & 32768;
                        if (i17 == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    int i292 = i14;
                    i15 = i3 & 16384;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i2922 = i14;
                i15 = i3 & 16384;
                if (i15 != 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function26 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i29222 = i14;
            i15 = i3 & 16384;
            if (i15 != 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        int i282 = 1024;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function26 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i292222 = i14;
        i15 = i3 & 16384;
        if (i15 != 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$4$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(z));
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$5$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedListItem(final Function0<Unit> function0, final ListItemShapes listItemShapes, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function02, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final String str2;
        final ListItemColors listItemColors2;
        final PaddingValues paddingValues2;
        final boolean z3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Modifier modifier3;
        final Alignment.Vertical vertical2;
        final Function0<Unit> function03;
        final ListItemElevation listItemElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Alignment.Vertical vertical3;
        ListItemColors listItemColors3;
        Alignment.Vertical vertical4;
        int i19;
        int i20;
        MutableInteractionSource mutableInteractionSource3;
        ListItemElevation listItemElevation3;
        int i21;
        ListItemElevation listItemElevation4;
        Function0<Unit> function04;
        boolean z4;
        ListItemColors listItemColors4;
        MutableInteractionSource mutableInteractionSource4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        String str3;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Alignment.Vertical vertical5;
        int i22;
        int i23;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(-1701010568);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedListItem)N(onClick,shapes,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,colors,elevation,contentPadding,interactionSource,content)540@26270L2,530@25894L661:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(listItemShapes) ? 32 : 16;
        }
        int i25 = i3 & 4;
        if (i25 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function26 = function2;
                    i4 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function28 = function23;
                    } else {
                        function28 = function23;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        function29 = function24;
                    } else {
                        function29 = function24;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(vertical)) {
                            i24 = 67108864;
                            i4 |= i24;
                        }
                        i24 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i24;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(function02) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(listItemColors)) {
                                i23 = 32;
                                i14 |= i23;
                            }
                            i23 = 16;
                            i14 |= i23;
                        }
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemElevation)) {
                                i22 = 256;
                                i14 |= i22;
                            }
                            i22 = 128;
                            i14 |= i22;
                        }
                        int i26 = i14;
                        i15 = i3 & 8192;
                        if (i15 != 0) {
                            i16 = i26 | 3072;
                        } else if ((i2 & 3072) == 0) {
                            i16 = i26 | (startRestartGroup.changed(paddingValues) ? 2048 : 1024);
                        } else {
                            i16 = i26;
                        }
                        i17 = i3 & 16384;
                        if (i17 != 0) {
                            i18 = i16 | 24576;
                        } else {
                            i18 = i16;
                            if ((i2 & 24576) == 0) {
                                i18 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i18 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                                }
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "521@25495L19,524@25639L17");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i18 &= -113;
                                        }
                                        int i27 = i18;
                                        if ((i3 & 4096) != 0) {
                                            i27 &= -897;
                                        }
                                        str3 = str;
                                        listItemColors4 = listItemColors;
                                        listItemElevation4 = listItemElevation;
                                        paddingValues3 = paddingValues;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        i21 = i27;
                                        z4 = z2;
                                        function214 = function26;
                                        function215 = function27;
                                        function216 = function28;
                                        function217 = function29;
                                        vertical5 = vertical;
                                        function04 = function02;
                                    } else {
                                        if (i25 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        boolean z5 = i5 == 0 ? z2 : true;
                                        if (i6 != 0) {
                                            function26 = null;
                                        }
                                        if (i7 != 0) {
                                            function27 = null;
                                        }
                                        if (i8 != 0) {
                                            function28 = null;
                                        }
                                        if (i9 != 0) {
                                            function29 = null;
                                        }
                                        if ((i3 & 256) != 0) {
                                            vertical3 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            vertical3 = vertical;
                                        }
                                        Function0<Unit> function05 = i11 != 0 ? null : function02;
                                        String str4 = i13 != 0 ? null : str;
                                        if ((i3 & 2048) != 0) {
                                            listItemColors3 = ListItemDefaults.INSTANCE.segmentedColors(startRestartGroup, 6);
                                            i18 &= -113;
                                        } else {
                                            listItemColors3 = listItemColors;
                                        }
                                        int i28 = i18;
                                        ListItemColors listItemColors5 = listItemColors3;
                                        if ((i3 & 4096) != 0) {
                                            vertical4 = vertical3;
                                            i19 = i17;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                            i21 = i28 & (-897);
                                        } else {
                                            vertical4 = vertical3;
                                            i19 = i17;
                                            i20 = i4;
                                            mutableInteractionSource3 = null;
                                            listItemElevation3 = listItemElevation;
                                            i21 = i28;
                                        }
                                        PaddingValues contentPadding = i15 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                                        if (i19 != 0) {
                                            boolean z6 = z5;
                                            listItemElevation4 = listItemElevation3;
                                            function04 = function05;
                                            z4 = z6;
                                            listItemColors4 = listItemColors5;
                                            paddingValues3 = contentPadding;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            function214 = function26;
                                            function215 = function27;
                                            function216 = function28;
                                            str3 = str4;
                                            function217 = function29;
                                            vertical5 = vertical4;
                                            i4 = i20;
                                        } else {
                                            boolean z7 = z5;
                                            listItemElevation4 = listItemElevation3;
                                            function04 = function05;
                                            z4 = z7;
                                            listItemColors4 = listItemColors5;
                                            i4 = i20;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            paddingValues3 = contentPadding;
                                            function214 = function26;
                                            function215 = function27;
                                            function216 = function28;
                                            str3 = str4;
                                            function217 = function29;
                                            vertical5 = vertical4;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1701010568, i4, i21, "androidx.compose.material3.SegmentedListItem (ListItem.kt:529)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1711422234, "CC(remember):ListItem.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda48
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit SegmentedListItem$lambda$0$0;
                                                SegmentedListItem$lambda$0$0 = ListItemKt.SegmentedListItem$lambda$0$0((SemanticsPropertyReceiver) obj);
                                                return SegmentedListItem$lambda$0$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    Function1 function1 = (Function1) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i29 = i4 >> 6;
                                    int i30 = i4 << 12;
                                    int i31 = (i29 & 3670016) | (i29 & 14) | 905969664 | ((i21 >> 12) & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (29360128 & i30);
                                    int i32 = (i4 & 14) | ((i4 >> 24) & 112) | ((i21 << 6) & 896) | ((i21 >> 3) & 7168) | ((i21 << 9) & 57344) | (i30 & 458752);
                                    int i33 = i21 << 12;
                                    composer2 = startRestartGroup;
                                    Modifier modifier4 = modifier2;
                                    Function0<Unit> function06 = function04;
                                    InteractiveListItem(modifier4, function25, function214, function215, function216, function217, vertical5, z4, false, function1, function0, function06, str3, mutableInteractionSource4, listItemColors4, listItemShapes, listItemElevation4, paddingValues3, composer2, i31, i32 | (3670016 & i33) | (i33 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function210 = function214;
                                    function211 = function215;
                                    function212 = function216;
                                    function213 = function217;
                                    vertical2 = vertical5;
                                    z3 = z4;
                                    function03 = function06;
                                    str2 = str3;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    listItemColors2 = listItemColors4;
                                    listItemElevation2 = listItemElevation4;
                                    paddingValues2 = paddingValues3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    str2 = str;
                                    listItemColors2 = listItemColors;
                                    paddingValues2 = paddingValues;
                                    z3 = z2;
                                    function210 = function26;
                                    function211 = function27;
                                    function212 = function28;
                                    function213 = function29;
                                    modifier3 = modifier2;
                                    vertical2 = vertical;
                                    function03 = function02;
                                    listItemElevation2 = listItemElevation;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit SegmentedListItem$lambda$1;
                                            SegmentedListItem$lambda$1 = ListItemKt.SegmentedListItem$lambda$1(Function0.this, listItemShapes, modifier3, z3, function210, function211, function212, function213, vertical2, function03, str2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return SegmentedListItem$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    int i262 = i14;
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 16384;
                    if (i17 != 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                int i2622 = i14;
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                i17 = i3 & 16384;
                if (i17 != 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function26 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i26222 = i14;
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            i17 = i3 & 16384;
            if (i17 != 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
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
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function26 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i262222 = i14;
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        i17 = i3 & 16384;
        if (i17 != 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedListItem(final boolean z, final Function0<Unit> function0, final ListItemShapes listItemShapes, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function02, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
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
        Composer composer2;
        final Alignment.Vertical vertical2;
        final ListItemColors listItemColors2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function0<Unit> function03;
        final String str2;
        final ListItemElevation listItemElevation2;
        ScopeUpdateScope endRestartGroup;
        Alignment.Vertical vertical3;
        int i20;
        ListItemColors listItemColors3;
        Modifier modifier4;
        ListItemColors listItemColors4;
        ListItemElevation listItemElevation3;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Alignment.Vertical vertical4;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function214;
        ListItemColors listItemColors5;
        int i21;
        int i22;
        ListItemElevation listItemElevation4;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(532806556);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedListItem)N(selected,onClick,shapes,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,colors,elevation,contentPadding,interactionSource,content)622@30460L84,612@30081L746:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(listItemShapes) ? 256 : 128;
        }
        int i26 = i3 & 8;
        if (i26 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function26 = function2;
                } else {
                    function26 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function27 = function22;
                } else {
                    function27 = function22;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function28 = function23;
                } else {
                    function28 = function23;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(vertical)) {
                        i25 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i25;
                    }
                    i25 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i25;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (startRestartGroup.changedInstance(function02) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= startRestartGroup.changed(str) ? 32 : 16;
                    if ((i2 & 384) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemColors)) {
                            i24 = 256;
                            i12 |= i24;
                        }
                        i24 = 128;
                        i12 |= i24;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 8192) == 0 && startRestartGroup.changed(listItemElevation)) {
                            i23 = 2048;
                            i12 |= i23;
                        }
                        i23 = 1024;
                        i12 |= i23;
                    }
                    int i27 = i12;
                    i15 = i4;
                    i16 = i3 & 16384;
                    if (i16 == 0) {
                        i17 = i27 | 24576;
                    } else if ((i2 & 24576) == 0) {
                        i17 = i27 | (startRestartGroup.changed(paddingValues) ? 16384 : 8192);
                    } else {
                        i17 = i27;
                    }
                    i18 = i3 & 32768;
                    if (i18 == 0) {
                        i17 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i17 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i17 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                    i19 = i17;
                    if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (599187 & i19) != 599186, i15 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "603@29682L19,606@29826L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i28 = (i3 & 512) != 0 ? i15 & (-1879048193) : i15;
                            if ((i3 & 4096) != 0) {
                                i19 &= -897;
                            }
                            if ((i3 & 8192) != 0) {
                                i19 &= -7169;
                            }
                            function213 = function24;
                            vertical4 = vertical;
                            listItemElevation4 = listItemElevation;
                            paddingValues3 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z5 = z3;
                            function214 = function27;
                            str2 = str;
                            listItemColors5 = listItemColors;
                            i21 = i19;
                            i22 = i28;
                            function215 = function26;
                            function03 = function02;
                        } else {
                            Modifier.Companion companion = i26 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                function26 = null;
                            }
                            if (i7 != 0) {
                                function27 = null;
                            }
                            if (i8 != 0) {
                                function28 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function217 = i9 != 0 ? null : function24;
                            if ((i3 & 512) != 0) {
                                vertical3 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                i20 = i15 & (-1879048193);
                            } else {
                                vertical3 = vertical;
                                i20 = i15;
                            }
                            Function0<Unit> function04 = i11 != 0 ? null : function02;
                            String str3 = i14 != 0 ? null : str;
                            if ((i3 & 4096) != 0) {
                                listItemColors3 = ListItemDefaults.INSTANCE.segmentedColors(startRestartGroup, 6);
                                i19 &= -897;
                            } else {
                                listItemColors3 = listItemColors;
                            }
                            if ((i3 & 8192) != 0) {
                                modifier4 = companion;
                                listItemColors4 = listItemColors3;
                                listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                i19 &= -7169;
                            } else {
                                modifier4 = companion;
                                listItemColors4 = listItemColors3;
                                listItemElevation3 = listItemElevation;
                            }
                            PaddingValues contentPadding = i16 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if (i18 != 0) {
                                paddingValues3 = contentPadding;
                                function213 = function217;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                paddingValues3 = contentPadding;
                                function213 = function217;
                            }
                            vertical4 = vertical3;
                            z5 = z3;
                            function214 = function27;
                            str2 = str3;
                            listItemColors5 = listItemColors4;
                            i21 = i19;
                            i22 = i20;
                            listItemElevation4 = listItemElevation3;
                            function215 = function26;
                            function03 = function04;
                        }
                        startRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                        if (ComposerKt.isTraceInProgress()) {
                            function216 = function214;
                            ComposerKt.traceEventStart(532806556, i22, i21, "androidx.compose.material3.SegmentedListItem (ListItem.kt:611)");
                        } else {
                            function216 = function214;
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 926031312, "CC(remember):ListItem.kt#9igjgp");
                        boolean z6 = (i22 & 14) == 4;
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit SegmentedListItem$lambda$2$0;
                                    SegmentedListItem$lambda$2$0 = ListItemKt.SegmentedListItem$lambda$2$0(z, (SemanticsPropertyReceiver) obj);
                                    return SegmentedListItem$lambda$2$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i29 = i22 >> 9;
                        int i30 = i22;
                        int i31 = (i29 & 14) | ((i21 >> 15) & 112) | (i29 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016);
                        int i32 = i30 << 9;
                        int i33 = i31 | (i32 & 29360128) | ((i30 << 24) & 234881024);
                        int i34 = i21 << 3;
                        int i35 = ((i30 >> 3) & 14) | (i34 & 112) | (i34 & 896) | ((i21 >> 6) & 7168) | ((i21 << 6) & 57344) | (i32 & 458752);
                        int i36 = i21 << 9;
                        int i37 = i35 | (3670016 & i36) | (i36 & 29360128);
                        Modifier modifier5 = modifier4;
                        Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                        composer2 = startRestartGroup;
                        Function2<? super Composer, ? super Integer, Unit> function220 = function28;
                        ListItemColors listItemColors6 = listItemColors5;
                        InteractiveListItem(modifier5, function25, function218, function219, function220, function213, vertical4, z5, z, (Function1) rememberedValue, function0, function03, str2, mutableInteractionSource3, listItemColors6, listItemShapes, listItemElevation4, paddingValues3, composer2, i33, i37);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ListItemElevation listItemElevation5 = listItemElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        listItemColors2 = listItemColors6;
                        listItemElevation2 = listItemElevation5;
                        function211 = function220;
                        function212 = function213;
                        vertical2 = vertical4;
                        z4 = z5;
                        paddingValues2 = paddingValues3;
                        modifier3 = modifier5;
                        function29 = function218;
                        function210 = function219;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        vertical2 = vertical;
                        listItemColors2 = listItemColors;
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z3;
                        function29 = function26;
                        function210 = function27;
                        function211 = function28;
                        function212 = function24;
                        function03 = function02;
                        str2 = str;
                        listItemElevation2 = listItemElevation;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SegmentedListItem$lambda$3;
                                SegmentedListItem$lambda$3 = ListItemKt.SegmentedListItem$lambda$3(z, function0, listItemShapes, modifier3, z4, function29, function210, function211, function212, vertical2, function03, str2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SegmentedListItem$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                i14 = i13;
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i272 = i12;
                i15 = i4;
                i16 = i3 & 16384;
                if (i16 == 0) {
                }
                i18 = i3 & 32768;
                if (i18 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i19 = i17;
                if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (599187 & i19) != 599186, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i2722 = i12;
            i15 = i4;
            i16 = i3 & 16384;
            if (i16 == 0) {
            }
            i18 = i3 & 32768;
            if (i18 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i19 = i17;
            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (599187 & i19) != 599186, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i27222 = i12;
        i15 = i4;
        i16 = i3 & 16384;
        if (i16 == 0) {
        }
        i18 = i3 & 32768;
        if (i18 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i19 = i17;
        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (599187 & i19) != 599186, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$2$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8886getRadioButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedListItem(final boolean z, final Function1<? super Boolean, Unit> function1, final ListItemShapes listItemShapes, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Alignment.Vertical vertical, Function0<Unit> function0, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        final Function2<? super Composer, ? super Integer, Unit> function28;
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
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function0<Unit> function02;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Alignment.Vertical vertical2;
        final String str2;
        final ListItemColors listItemColors2;
        final ListItemElevation listItemElevation2;
        ScopeUpdateScope endRestartGroup;
        Alignment.Vertical vertical3;
        ListItemColors listItemColors3;
        Modifier modifier4;
        ListItemColors listItemColors4;
        int i19;
        MutableInteractionSource mutableInteractionSource3;
        ListItemElevation listItemElevation3;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function213;
        MutableInteractionSource mutableInteractionSource4;
        int i20;
        ListItemElevation listItemElevation4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Alignment.Vertical vertical4;
        Function2<? super Composer, ? super Integer, Unit> function215;
        ListItemColors listItemColors5;
        int i21;
        Function2<? super Composer, ? super Integer, Unit> function216;
        int i22;
        int i23;
        Composer startRestartGroup = composer.startRestartGroup(-1469504773);
        ComposerKt.sourceInformation(startRestartGroup, "C(SegmentedListItem)N(checked,onCheckedChange,shapes,modifier,enabled,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,onLongClick,onLongClickLabel,colors,elevation,contentPadding,interactionSource,content)707@34774L99,711@34893L29,697@34396L782:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(listItemShapes) ? 256 : 128;
        }
        int i24 = i3 & 8;
        int i25 = 1024;
        if (i24 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function26 = function2;
                } else {
                    function26 = function2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function27 = function22;
                } else {
                    function27 = function22;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function28 = function23;
                } else {
                    function28 = function23;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(vertical)) {
                        i23 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i23;
                    }
                    i23 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i23;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= startRestartGroup.changed(str) ? 32 : 16;
                    if ((i2 & 384) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(listItemColors)) {
                            i22 = 256;
                            i12 |= i22;
                        }
                        i22 = 128;
                        i12 |= i22;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 8192) == 0 && startRestartGroup.changed(listItemElevation)) {
                            i25 = 2048;
                        }
                        i12 |= i25;
                    }
                    int i26 = i12;
                    i15 = i3 & 16384;
                    if (i15 == 0) {
                        i16 = i26 | 24576;
                    } else if ((i2 & 24576) == 0) {
                        i16 = i26 | (startRestartGroup.changed(paddingValues) ? 16384 : 8192);
                    } else {
                        i16 = i26;
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                        i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i16 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i16 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                    i18 = i16;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i18) != 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "688@33997L19,691@34141L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 4096) != 0) {
                                i18 &= -897;
                            }
                            if ((i3 & 8192) != 0) {
                                i18 &= -7169;
                            }
                            function212 = function24;
                            function02 = function0;
                            listItemElevation4 = listItemElevation;
                            paddingValues3 = paddingValues;
                            i20 = i18;
                            i21 = i4;
                            function214 = function28;
                            z5 = z3;
                            function213 = function26;
                            function215 = function27;
                            vertical4 = vertical;
                            str2 = str;
                            listItemColors5 = listItemColors;
                            mutableInteractionSource4 = mutableInteractionSource;
                        } else {
                            Modifier.Companion companion = i24 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                function26 = null;
                            }
                            if (i7 != 0) {
                                function27 = null;
                            }
                            if (i8 != 0) {
                                function28 = null;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function217 = i9 != 0 ? null : function24;
                            if ((i3 & 512) != 0) {
                                vertical3 = ListItemDefaults.INSTANCE.verticalAlignment(startRestartGroup, 6);
                                i4 &= -1879048193;
                            } else {
                                vertical3 = vertical;
                            }
                            Function0<Unit> function03 = i11 != 0 ? null : function0;
                            String str3 = i14 != 0 ? null : str;
                            if ((i3 & 4096) != 0) {
                                listItemColors3 = ListItemDefaults.INSTANCE.segmentedColors(startRestartGroup, 6);
                                i18 &= -897;
                            } else {
                                listItemColors3 = listItemColors;
                            }
                            if ((i3 & 8192) != 0) {
                                modifier4 = companion;
                                listItemColors4 = listItemColors3;
                                i19 = i4;
                                mutableInteractionSource3 = null;
                                listItemElevation3 = ListItemDefaults.m3437elevationYgX7TsA$default(ListItemDefaults.INSTANCE, 0.0f, 0.0f, 3, null);
                                i18 &= -7169;
                            } else {
                                modifier4 = companion;
                                listItemColors4 = listItemColors3;
                                i19 = i4;
                                mutableInteractionSource3 = null;
                                listItemElevation3 = listItemElevation;
                            }
                            PaddingValues contentPadding = i15 != 0 ? ListItemDefaults.INSTANCE.getContentPadding() : paddingValues;
                            function212 = function217;
                            if (i17 != 0) {
                                function213 = function26;
                                function02 = function03;
                                i20 = i18;
                                listItemElevation4 = listItemElevation3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z5 = z3;
                                function215 = function27;
                                str2 = str3;
                                listItemColors5 = listItemColors4;
                                i21 = i19;
                                paddingValues3 = contentPadding;
                                function214 = function28;
                                vertical4 = vertical3;
                            } else {
                                z5 = z3;
                                function213 = function26;
                                function02 = function03;
                                str2 = str3;
                                mutableInteractionSource4 = mutableInteractionSource;
                                i20 = i18;
                                listItemElevation4 = listItemElevation3;
                                paddingValues3 = contentPadding;
                                function214 = function28;
                                vertical4 = vertical3;
                                function215 = function27;
                                listItemColors5 = listItemColors4;
                                i21 = i19;
                            }
                            modifier2 = modifier4;
                        }
                        startRestartGroup.endDefaults();
                        Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                        if (ComposerKt.isTraceInProgress()) {
                            function216 = function214;
                            ComposerKt.traceEventStart(-1469504773, i21, i20, "androidx.compose.material3.SegmentedListItem (ListItem.kt:696)");
                        } else {
                            function216 = function214;
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 850193182, "CC(remember):ListItem.kt#9igjgp");
                        int i27 = i21 & 14;
                        boolean z6 = i27 == 4;
                        int i28 = i21;
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit SegmentedListItem$lambda$4$0;
                                    SegmentedListItem$lambda$4$0 = ListItemKt.SegmentedListItem$lambda$4$0(z, (SemanticsPropertyReceiver) obj);
                                    return SegmentedListItem$lambda$4$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Function1 function12 = (Function1) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 850196920, "CC(remember):ListItem.kt#9igjgp");
                        boolean z7 = ((i28 & 112) == 32) | (i27 == 4);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z7 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit SegmentedListItem$lambda$5$0;
                                    SegmentedListItem$lambda$5$0 = ListItemKt.SegmentedListItem$lambda$5$0(Function1.this, z);
                                    return SegmentedListItem$lambda$5$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i29 = i28 >> 9;
                        int i30 = (i29 & 896) | (i29 & 14) | ((i20 >> 15) & 112) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016);
                        int i31 = i28 << 9;
                        int i32 = i30 | (29360128 & i31) | ((i28 << 24) & 234881024);
                        int i33 = ((i20 << 3) & PointerIconCompat.TYPE_TEXT) | ((i20 >> 6) & 7168) | ((i20 << 6) & 57344) | (i31 & 458752);
                        int i34 = i20 << 9;
                        int i35 = i33 | (3670016 & i34) | (i34 & 29360128);
                        Function2<? super Composer, ? super Integer, Unit> function219 = function213;
                        Function2<? super Composer, ? super Integer, Unit> function220 = function216;
                        composer2 = startRestartGroup;
                        Alignment.Vertical vertical5 = vertical4;
                        Modifier modifier5 = modifier2;
                        InteractiveListItem(modifier5, function25, function219, function218, function220, function212, vertical5, z5, z, function12, (Function0) rememberedValue2, function02, str2, mutableInteractionSource4, listItemColors5, listItemShapes, listItemElevation4, paddingValues3, composer2, i32, i35);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ListItemElevation listItemElevation5 = listItemElevation4;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        listItemColors2 = listItemColors5;
                        listItemElevation2 = listItemElevation5;
                        function28 = function220;
                        function29 = function212;
                        vertical2 = vertical5;
                        z4 = z5;
                        paddingValues2 = paddingValues3;
                        modifier3 = modifier5;
                        function210 = function219;
                        function211 = function218;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        function29 = function24;
                        function02 = function0;
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z3;
                        function210 = function26;
                        function211 = function27;
                        vertical2 = vertical;
                        str2 = str;
                        listItemColors2 = listItemColors;
                        listItemElevation2 = listItemElevation;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SegmentedListItem$lambda$6;
                                SegmentedListItem$lambda$6 = ListItemKt.SegmentedListItem$lambda$6(z, function1, listItemShapes, modifier3, z4, function210, function211, function28, function29, vertical2, function02, str2, listItemColors2, listItemElevation2, paddingValues2, mutableInteractionSource2, function25, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SegmentedListItem$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                i14 = i13;
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i262 = i12;
                i15 = i3 & 16384;
                if (i15 == 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i18 = i16;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i18) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i2622 = i12;
            i15 = i3 & 16384;
            if (i15 == 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i18 = i16;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i18) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i26222 = i12;
        i15 = i3 & 16384;
        if (i15 == 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i18 = i16;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i18) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$4$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(z));
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedListItem$lambda$5$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    private static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-61277522);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItemLayout)N(leading,trailing,headline,overline,supporting)730@35453L36,731@35494L166:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61277522, i2, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:729)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1241851570, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ListItemMeasurePolicy();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function23;
            function2Arr[1] = function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2829getLambda$489887388$material3() : function24;
            function2Arr[2] = function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1629163587$material3() : function25;
            function2Arr[3] = function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2830getLambda$546752734$material3() : function2;
            function2Arr[4] = function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1572298241$material3() : function22;
            List listOf = CollectionsKt.listOf((Object[]) function2Arr);
            ListItemMeasurePolicy listItemMeasurePolicy2 = listItemMeasurePolicy;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 292526026, "CC(remember):Layout.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ListItemLayout$lambda$1;
                    ListItemLayout$lambda$1 = ListItemKt.ListItemLayout$lambda$1(Function2.this, function22, function23, function24, function25, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ListItemLayout$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m3475calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (Constraints.m9671getHasBoundedWidthimpl(j)) {
            return Constraints.m9675getMaxWidthimpl(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m3474calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float m5344getItemTwoLineContainerHeightD9Ej5fM;
        if (ListItemType.m3484equalsimpl0(i6, ListItemType.INSTANCE.m3489getOneLineAlXitO8())) {
            m5344getItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m5336getItemOneLineContainerHeightD9Ej5fM();
        } else {
            m5344getItemTwoLineContainerHeightD9Ej5fM = ListItemType.m3484equalsimpl0(i6, ListItemType.INSTANCE.m3491getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m5344getItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m5339getItemThreeLineContainerHeightD9Ej5fM();
        }
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m9676getMinHeightimpl(j), intrinsicMeasureScope.mo522roundToPx0680j_4(m5344getItemTwoLineContainerHeightD9Ej5fM)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), Constraints.m9674getMaxHeightimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i3, final int i4, final int i5) {
        return MeasureScope.CC.layout$default(measureScope, i, i2, null, new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit place$lambda$0;
                place$lambda$0 = ListItemKt.place$lambda$0(Placeable.this, i3, z, i5, placeable3, placeable4, placeable5, i2, placeable2, i, i4, (Placeable.PlacementScope) obj);
                return place$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit place$lambda$0(Placeable placeable, int i, boolean z, int i2, Placeable placeable2, Placeable placeable3, Placeable placeable4, int i3, Placeable placeable5, int i4, int i5, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, z ? i2 : Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i3), 0.0f, 4, null);
        }
        int widthOrZero = i + LayoutUtilKt.getWidthOrZero(placeable);
        int align = z ? i2 : Alignment.INSTANCE.getCenterVertically().align(LayoutUtilKt.getHeightOrZero(placeable2) + LayoutUtilKt.getHeightOrZero(placeable3) + LayoutUtilKt.getHeightOrZero(placeable4), i3);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, align, 0.0f, 4, null);
        }
        int heightOrZero = align + LayoutUtilKt.getHeightOrZero(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            int width = (i4 - i5) - placeable5.getWidth();
            if (!z) {
                i2 = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i3);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, width, i2, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    private static final void m3468ProvideTextStyleFromToken3JVO9M(long j, final TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer startRestartGroup = composer.startRestartGroup(-285397024);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyleFromToken)N(color:c#ui.graphics.Color,textToken,content)1081@49246L5,1079@49156L129:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            j2 = j;
            function22 = function2;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285397024, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:1079)");
            }
            j2 = j;
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, i2 & 910);
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j3 = j2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProvideTextStyleFromToken_3J_VO9M$lambda$0;
                    ProvideTextStyleFromToken_3J_VO9M$lambda$0 = ListItemKt.ProvideTextStyleFromToken_3J_VO9M$lambda$0(j3, typographyKeyTokens, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProvideTextStyleFromToken_3J_VO9M$lambda$0;
                }
            });
        }
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i) {
        return i > density.mo521roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m3476verticalPaddingyh95HIg(int i) {
        return ListItemType.m3484equalsimpl0(i, ListItemType.INSTANCE.m3490getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    /* renamed from: LeadingDecorator-8s8adOk, reason: not valid java name */
    private static final void m3465LeadingDecorator8s8adOk(final float f, final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        Composer startRestartGroup = composer.startRestartGroup(748132977);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingDecorator)N(startPadding:c#ui.unit.Dp,color:c#ui.graphics.Color,textStyle,content):ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(748132977, i2, -1, "androidx.compose.material3.LeadingDecorator (ListItem.kt:1151)");
            }
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(1044406198);
                ComposerKt.sourceInformation(startRestartGroup, "1153@51622L683");
                Modifier.Companion companion = Modifier.INSTANCE;
                float f2 = InteractiveListInternalSpacing;
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(companion, 0.0f, 0.0f, f2, 0.0f, 11, null);
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
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1515633308, "C1157@51940L7,1162@52172L5,1160@52066L229:ListItem.kt#uh7d8r");
                float m9732constructorimpl = Dp.m9732constructorimpl(f + f2);
                ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localMinimumInteractiveComponentSize);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m9746unboximpl = ((Dp) consume).m9746unboximpl();
                if (Float.isNaN(m9746unboximpl)) {
                    m9746unboximpl = Dp.m9732constructorimpl(0);
                }
                ProvideContentColorTextStyleKt.m4807ProvideContentColorTextStyleKTwxG1Y(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 6) & 14), new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m9730boximpl(((Dp) RangesKt.coerceAtLeast(Dp.m9730boximpl(Dp.m9732constructorimpl(m9746unboximpl - m9732constructorimpl)), Dp.m9730boximpl(Dp.m9732constructorimpl(0)))).m9746unboximpl()))}, function2, startRestartGroup, ((i2 >> 3) & 14) | (ProvidedValue.$stable << 6) | (i2 & 7168));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1045077937);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LeadingDecorator_8s8adOk$lambda$1;
                    LeadingDecorator_8s8adOk$lambda$1 = ListItemKt.LeadingDecorator_8s8adOk$lambda$1(f, j, typographyKeyTokens, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LeadingDecorator_8s8adOk$lambda$1;
                }
            });
        }
    }

    /* renamed from: TrailingDecorator-8s8adOk, reason: not valid java name */
    private static final void m3470TrailingDecorator8s8adOk(final float f, final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        int i3;
        float m9732constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(-2086562817);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingDecorator)N(endPadding:c#ui.unit.Dp,color:c#ui.graphics.Color,textStyle,content):ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2086562817, i2, -1, "androidx.compose.material3.TrailingDecorator (ListItem.kt:1176)");
            }
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(268980104);
                ComposerKt.sourceInformation(startRestartGroup, "1178@52511L683");
                Modifier.Companion companion = Modifier.INSTANCE;
                float f2 = InteractiveListInternalSpacing;
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(companion, f2, 0.0f, 0.0f, 0.0f, 14, null);
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
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1996765806, "C1182@52829L7,1187@53061L5,1185@52955L229:ListItem.kt#uh7d8r");
                float m9732constructorimpl2 = Dp.m9732constructorimpl(f + f2);
                ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localMinimumInteractiveComponentSize);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m9746unboximpl = ((Dp) consume).m9746unboximpl();
                if (Float.isNaN(m9746unboximpl)) {
                    i3 = 0;
                    m9732constructorimpl = Dp.m9732constructorimpl(0);
                } else {
                    m9732constructorimpl = m9746unboximpl;
                    i3 = 0;
                }
                ProvideContentColorTextStyleKt.m4807ProvideContentColorTextStyleKTwxG1Y(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 6) & 14), new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m9730boximpl(((Dp) RangesKt.coerceAtLeast(Dp.m9730boximpl(Dp.m9732constructorimpl(m9732constructorimpl - m9732constructorimpl2)), Dp.m9730boximpl(Dp.m9732constructorimpl(i3)))).m9746unboximpl()))}, function2, startRestartGroup, ((i2 >> 3) & 14) | (ProvidedValue.$stable << 6) | (i2 & 7168));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(269651843);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrailingDecorator_8s8adOk$lambda$1;
                    TrailingDecorator_8s8adOk$lambda$1 = ListItemKt.TrailingDecorator_8s8adOk$lambda$1(f, j, typographyKeyTokens, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TrailingDecorator_8s8adOk$lambda$1;
                }
            });
        }
    }

    /* renamed from: OverlineDecorator-3J-VO9M, reason: not valid java name */
    private static final void m3467OverlineDecorator3JVO9M(long j, final TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer startRestartGroup = composer.startRestartGroup(899793657);
        ComposerKt.sourceInformation(startRestartGroup, "C(OverlineDecorator)N(color:c#ui.graphics.Color,textStyle,content):ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899793657, i2, -1, "androidx.compose.material3.OverlineDecorator (ListItem.kt:1200)");
            }
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(862092540);
                ComposerKt.sourceInformation(startRestartGroup, "1202@53380L189");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1336429494, "C1205@53504L5,1203@53398L161:ListItem.kt#uh7d8r");
                j2 = j;
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, i2 & 910);
                function22 = function2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                j2 = j;
                function22 = function2;
                startRestartGroup.startReplaceGroup(862289545);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j2 = j;
            function22 = function2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j3 = j2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OverlineDecorator_3J_VO9M$lambda$1;
                    OverlineDecorator_3J_VO9M$lambda$1 = ListItemKt.OverlineDecorator_3J_VO9M$lambda$1(j3, typographyKeyTokens, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return OverlineDecorator_3J_VO9M$lambda$1;
                }
            });
        }
    }

    /* renamed from: SupportingDecorator-3J-VO9M, reason: not valid java name */
    private static final void m3469SupportingDecorator3JVO9M(long j, final TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer startRestartGroup = composer.startRestartGroup(-3493404);
        ComposerKt.sourceInformation(startRestartGroup, "C(SupportingDecorator)N(color:c#ui.graphics.Color,textStyle,content):ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3493404, i2, -1, "androidx.compose.material3.SupportingDecorator (ListItem.kt:1217)");
            }
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(-992630287);
                ComposerKt.sourceInformation(startRestartGroup, "1219@53757L189");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -521382593, "C1222@53881L5,1220@53775L161:ListItem.kt#uh7d8r");
                j2 = j;
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, i2 & 910);
                function22 = function2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                j2 = j;
                function22 = function2;
                startRestartGroup.startReplaceGroup(-992433282);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j2 = j;
            function22 = function2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j3 = j2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SupportingDecorator_3J_VO9M$lambda$1;
                    SupportingDecorator_3J_VO9M$lambda$1 = ListItemKt.SupportingDecorator_3J_VO9M$lambda$1(j3, typographyKeyTokens, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SupportingDecorator_3J_VO9M$lambda$1;
                }
            });
        }
    }

    /* renamed from: ContentDecorator-3J-VO9M, reason: not valid java name */
    private static final void m3464ContentDecorator3JVO9M(long j, final TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer startRestartGroup = composer.startRestartGroup(747020814);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContentDecorator)N(color:c#ui.graphics.Color,textStyle,content)1235@54097L165:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            j2 = j;
            function22 = function2;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(747020814, i2, -1, "androidx.compose.material3.ContentDecorator (ListItem.kt:1234)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -364351682, "C1238@54209L5,1236@54111L145:ListItem.kt#uh7d8r");
            j2 = j;
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, i2 & 910);
            function22 = function2;
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
            final long j3 = j2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ContentDecorator_3J_VO9M$lambda$1;
                    ContentDecorator_3J_VO9M$lambda$1 = ListItemKt.ContentDecorator_3J_VO9M$lambda$1(j3, typographyKeyTokens, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ContentDecorator_3J_VO9M$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CollectInteractionsAsState(InteractionSource interactionSource, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, Composer composer, final int i, final int i2) {
        int i3;
        MutableState<Boolean> mutableState5;
        int i4;
        MutableState<Boolean> mutableState6;
        int i5;
        MutableState<Boolean> mutableState7;
        int i6;
        final MutableState<Boolean> mutableState8;
        final MutableState<Boolean> mutableState9;
        final MutableState<Boolean> mutableState10;
        final MutableState<Boolean> mutableState11;
        ScopeUpdateScope endRestartGroup;
        MutableState<Boolean> mutableState12;
        MutableState<Boolean> mutableState13;
        ListItemKt$CollectInteractionsAsState$1$1 listItemKt$CollectInteractionsAsState$1$1;
        final InteractionSource interactionSource2 = interactionSource;
        Composer startRestartGroup = composer.startRestartGroup(844822063);
        ComposerKt.sourceInformation(startRestartGroup, "C(CollectInteractionsAsState)N(pressedState,focusedState,hoveredState,draggedState)1257@54827L2048,1257@54806L2069:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interactionSource2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            mutableState5 = mutableState;
            i3 |= startRestartGroup.changed(mutableState5) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                mutableState6 = mutableState2;
                i3 |= startRestartGroup.changed(mutableState6) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableState7 = mutableState3;
                    i3 |= startRestartGroup.changed(mutableState7) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(mutableState4) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            mutableState8 = mutableState4;
                            mutableState9 = mutableState5;
                            mutableState10 = mutableState6;
                            mutableState11 = mutableState7;
                        } else {
                            MutableState<Boolean> mutableState14 = i7 != 0 ? null : mutableState5;
                            if (i4 != 0) {
                                mutableState6 = null;
                            }
                            MutableState<Boolean> mutableState15 = i5 != 0 ? null : mutableState7;
                            MutableState<Boolean> mutableState16 = i6 != 0 ? null : mutableState4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(844822063, i3, -1, "androidx.compose.material3.CollectInteractionsAsState (ListItem.kt:1256)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 125194447, "CC(remember):ListItem.kt#9igjgp");
                            int i8 = i3 & 14;
                            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | (i8 == 4);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                mutableState12 = mutableState6;
                                ListItemKt$CollectInteractionsAsState$1$1 listItemKt$CollectInteractionsAsState$1$12 = new ListItemKt$CollectInteractionsAsState$1$1(mutableState14, mutableState12, mutableState15, mutableState16, interactionSource, null);
                                mutableState13 = mutableState14;
                                interactionSource2 = interactionSource;
                                listItemKt$CollectInteractionsAsState$1$1 = listItemKt$CollectInteractionsAsState$1$12;
                                startRestartGroup.updateRememberedValue(listItemKt$CollectInteractionsAsState$1$1);
                            } else {
                                mutableState13 = mutableState14;
                                listItemKt$CollectInteractionsAsState$1$1 = rememberedValue;
                                mutableState12 = mutableState6;
                                interactionSource2 = interactionSource;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.LaunchedEffect(interactionSource2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) listItemKt$CollectInteractionsAsState$1$1, startRestartGroup, i8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableState8 = mutableState16;
                            mutableState11 = mutableState15;
                            mutableState10 = mutableState12;
                            mutableState9 = mutableState13;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda38
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CollectInteractionsAsState$lambda$1;
                                    CollectInteractionsAsState$lambda$1 = ListItemKt.CollectInteractionsAsState$lambda$1(InteractionSource.this, mutableState9, mutableState10, mutableState11, mutableState8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return CollectInteractionsAsState$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableState7 = mutableState3;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            mutableState6 = mutableState2;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            mutableState7 = mutableState3;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        mutableState5 = mutableState;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        mutableState6 = mutableState2;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        mutableState7 = mutableState3;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void InteractiveListItem(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Alignment.Vertical vertical, final boolean z, final boolean z2, final Function1<? super SemanticsPropertyReceiver, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, final String str, final MutableInteractionSource mutableInteractionSource, final ListItemColors listItemColors, final ListItemShapes listItemShapes, final ListItemElevation listItemElevation, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Object currentState;
        Color color;
        Object currentState2;
        Color color2;
        Object currentState3;
        Color color3;
        State state;
        Object currentState4;
        Color color4;
        State state2;
        Object currentState5;
        Color color5;
        Object currentState6;
        Snapshot.Companion companion;
        Snapshot currentThreadSnapshot;
        Function1<Object, Unit> readObserver;
        Snapshot makeCurrentNonObservable;
        Composer startRestartGroup = composer.startRestartGroup(-1408227475);
        ComposerKt.sourceInformation(startRestartGroup, "C(InteractiveListItem)N(modifier,content,leadingContent,trailingContent,overlineContent,supportingContent,verticalAlignment,enabled,selected,applySemantics,onClick,onLongClick,onLongClickLabel,interactionSource,colors,shapes,elevation,contentPadding)1328@57956L34,1329@58009L34,1330@58062L34,1331@58115L34,1333@58173L161,1341@58475L14,1342@58553L14,1343@58635L11,1346@58679L259,1356@59042L41,1359@59130L248,1367@59422L246,1375@59712L253,1383@60010L254,1391@60309L254,1399@60610L256,1414@61303L57,1415@61392L7,1416@61447L7,1418@61526L2553,1418@61460L2619:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(vertical) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(listItemColors) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(listItemShapes) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(listItemElevation) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (4793491 & i5) == 4793490) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1408227475, i3, i5, "androidx.compose.material3.InteractiveListItem (ListItem.kt:1324)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(736607630);
                ComposerKt.sourceInformation(startRestartGroup, "1326@57897L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -391880460, "CC(remember):ListItem.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-391881111);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -391878577, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -391876881, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableInteractionSource3 = mutableInteractionSource2;
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -391875185, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState5;
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = mutableState5;
            }
            MutableState mutableState6 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -391873489, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState6;
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                mutableState2 = mutableState6;
            }
            MutableState mutableState7 = (MutableState) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState8 = mutableState;
            MutableState mutableState9 = mutableState2;
            CollectInteractionsAsState(mutableInteractionSource3, mutableState4, mutableState8, mutableState9, mutableState7, startRestartGroup, 28080, 0);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final Shape shapeForInteraction = ListItemDefaultsKt.shapeForInteraction(listItemShapes, z2, ((Boolean) mutableState4.getValue()).booleanValue(), ((Boolean) mutableState8.getValue()).booleanValue(), ((Boolean) mutableState9.getValue()).booleanValue(), ((Boolean) mutableState7.getValue()).booleanValue(), value2, startRestartGroup, ((i5 >> 15) & 14) | ((i3 >> 21) & 112));
            final Transition updateTransition = TransitionKt.updateTransition(new InteractiveListColorState(z, z2, ((Boolean) mutableState7.getValue()).booleanValue()), "ListColor", startRestartGroup, 48, 0);
            Function3 function3 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$5;
                    InteractiveListItem$lambda$5 = ListItemKt.InteractiveListItem$lambda$5(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$5;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(519559029);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                mutableState3 = mutableState7;
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            } else {
                mutableState3 = mutableState7;
            }
            long m3397containerColorXeAY9LY = listItemColors.m3397containerColorXeAY9LY(interactiveListColorState.getEnabled(), interactiveListColorState.getSelected(), interactiveListColorState.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl = Color.m6790getColorSpaceimpl(m3397containerColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m6790getColorSpaceimpl);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(updateTransition);
                currentState = startRestartGroup.rememberedValue();
                if (changed2 || currentState == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState7 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState7);
                        currentState = currentState7;
                    } finally {
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState2 = (InteractiveListColorState) currentState;
            startRestartGroup.startReplaceGroup(519559029);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            }
            long m3397containerColorXeAY9LY2 = listItemColors.m3397containerColorXeAY9LY(interactiveListColorState2.getEnabled(), interactiveListColorState2.getSelected(), interactiveListColorState2.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl = Color.m6776boximpl(m3397containerColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(updateTransition);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState3 = (InteractiveListColorState) ((State) rememberedValue7).getValue();
            startRestartGroup.startReplaceGroup(519559029);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                color = m6776boximpl;
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            } else {
                color = m6776boximpl;
            }
            long m3397containerColorXeAY9LY3 = listItemColors.m3397containerColorXeAY9LY(interactiveListColorState3.getEnabled(), interactiveListColorState3.getSelected(), interactiveListColorState3.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl2 = Color.m6776boximpl(m3397containerColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed4 = startRestartGroup.changed(updateTransition);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, color, m6776boximpl2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue8).getValue(), startRestartGroup, 0), twoWayConverter, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function32 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$8;
                    InteractiveListItem$lambda$8 = ListItemKt.InteractiveListItem$lambda$8(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$8;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState4 = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-154619267);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            }
            long m3398contentColorXeAY9LY = listItemColors.m3398contentColorXeAY9LY(interactiveListColorState4.getEnabled(), interactiveListColorState4.getSelected(), interactiveListColorState4.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl2 = Color.m6790getColorSpaceimpl(m3398contentColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed5 = startRestartGroup.changed(m6790getColorSpaceimpl2);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl2);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState2 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed6 = startRestartGroup.changed(updateTransition);
                currentState2 = startRestartGroup.rememberedValue();
                if (changed6 || currentState2 == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState8 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState8);
                        currentState2 = currentState8;
                    } finally {
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState5 = (InteractiveListColorState) currentState2;
            startRestartGroup.startReplaceGroup(-154619267);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            }
            long m3398contentColorXeAY9LY2 = listItemColors.m3398contentColorXeAY9LY(interactiveListColorState5.getEnabled(), interactiveListColorState5.getSelected(), interactiveListColorState5.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl3 = Color.m6776boximpl(m3398contentColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed7 = startRestartGroup.changed(updateTransition);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$3
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState6 = (InteractiveListColorState) ((State) rememberedValue10).getValue();
            startRestartGroup.startReplaceGroup(-154619267);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                color2 = m6776boximpl3;
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            } else {
                color2 = m6776boximpl3;
            }
            long m3398contentColorXeAY9LY3 = listItemColors.m3398contentColorXeAY9LY(interactiveListColorState6.getEnabled(), interactiveListColorState6.getSelected(), interactiveListColorState6.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl4 = Color.m6776boximpl(m3398contentColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed8 = startRestartGroup.changed(updateTransition);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changed8 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, color2, m6776boximpl4, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue11).getValue(), startRestartGroup, 0), twoWayConverter2, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function33 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$11;
                    InteractiveListItem$lambda$11 = ListItemKt.InteractiveListItem$lambda$11(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$11;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState7 = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-836285680);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            }
            long m3433leadingContentColorXeAY9LY = listItemColors.m3433leadingContentColorXeAY9LY(interactiveListColorState7.getEnabled(), interactiveListColorState7.getSelected(), interactiveListColorState7.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl3 = Color.m6790getColorSpaceimpl(m3433leadingContentColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed9 = startRestartGroup.changed(m6790getColorSpaceimpl3);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changed9 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl3);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            TwoWayConverter twoWayConverter3 = (TwoWayConverter) rememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState3 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed10 = startRestartGroup.changed(updateTransition);
                currentState3 = startRestartGroup.rememberedValue();
                if (changed10 || currentState3 == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState9 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState9);
                        currentState3 = currentState9;
                    } finally {
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState8 = (InteractiveListColorState) currentState3;
            startRestartGroup.startReplaceGroup(-836285680);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            }
            long m3433leadingContentColorXeAY9LY2 = listItemColors.m3433leadingContentColorXeAY9LY(interactiveListColorState8.getEnabled(), interactiveListColorState8.getSelected(), interactiveListColorState8.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl5 = Color.m6776boximpl(m3433leadingContentColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed11 = startRestartGroup.changed(updateTransition);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changed11 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$5
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState9 = (InteractiveListColorState) ((State) rememberedValue13).getValue();
            startRestartGroup.startReplaceGroup(-836285680);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                color3 = m6776boximpl5;
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            } else {
                color3 = m6776boximpl5;
            }
            long m3433leadingContentColorXeAY9LY3 = listItemColors.m3433leadingContentColorXeAY9LY(interactiveListColorState9.getEnabled(), interactiveListColorState9.getSelected(), interactiveListColorState9.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl6 = Color.m6776boximpl(m3433leadingContentColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed12 = startRestartGroup.changed(updateTransition);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (changed12 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, color3, m6776boximpl6, (FiniteAnimationSpec) function33.invoke(((State) rememberedValue14).getValue(), startRestartGroup, 0), twoWayConverter3, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function34 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$14;
                    InteractiveListItem$lambda$14 = ListItemKt.InteractiveListItem$lambda$14(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$14;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState10 = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1629003078);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            }
            long m3436trailingContentColorXeAY9LY = listItemColors.m3436trailingContentColorXeAY9LY(interactiveListColorState10.getEnabled(), interactiveListColorState10.getSelected(), interactiveListColorState10.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl4 = Color.m6790getColorSpaceimpl(m3436trailingContentColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed13 = startRestartGroup.changed(m6790getColorSpaceimpl4);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (changed13 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl4);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            TwoWayConverter twoWayConverter4 = (TwoWayConverter) rememberedValue15;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                state = createTransitionAnimation3;
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState4 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed14 = startRestartGroup.changed(updateTransition);
                currentState4 = startRestartGroup.rememberedValue();
                if (changed14 || currentState4 == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    state = createTransitionAnimation3;
                    try {
                        Object currentState10 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState10);
                        currentState4 = currentState10;
                    } finally {
                    }
                } else {
                    state = createTransitionAnimation3;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState11 = (InteractiveListColorState) currentState4;
            startRestartGroup.startReplaceGroup(-1629003078);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            }
            long m3436trailingContentColorXeAY9LY2 = listItemColors.m3436trailingContentColorXeAY9LY(interactiveListColorState11.getEnabled(), interactiveListColorState11.getSelected(), interactiveListColorState11.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl7 = Color.m6776boximpl(m3436trailingContentColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed15 = startRestartGroup.changed(updateTransition);
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (changed15 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$7
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue16);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState12 = (InteractiveListColorState) ((State) rememberedValue16).getValue();
            startRestartGroup.startReplaceGroup(-1629003078);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                color4 = m6776boximpl7;
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            } else {
                color4 = m6776boximpl7;
            }
            long m3436trailingContentColorXeAY9LY3 = listItemColors.m3436trailingContentColorXeAY9LY(interactiveListColorState12.getEnabled(), interactiveListColorState12.getSelected(), interactiveListColorState12.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl8 = Color.m6776boximpl(m3436trailingContentColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed16 = startRestartGroup.changed(updateTransition);
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (changed16 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue17);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, color4, m6776boximpl8, (FiniteAnimationSpec) function34.invoke(((State) rememberedValue17).getValue(), startRestartGroup, 0), twoWayConverter4, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function35 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$17;
                    InteractiveListItem$lambda$17 = ListItemKt.InteractiveListItem$lambda$17(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$17;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState13 = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(984715150);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            }
            long m3434overlineContentColorXeAY9LY = listItemColors.m3434overlineContentColorXeAY9LY(interactiveListColorState13.getEnabled(), interactiveListColorState13.getSelected(), interactiveListColorState13.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl5 = Color.m6790getColorSpaceimpl(m3434overlineContentColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed17 = startRestartGroup.changed(m6790getColorSpaceimpl5);
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (changed17 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                rememberedValue18 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl5);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            TwoWayConverter twoWayConverter5 = (TwoWayConverter) rememberedValue18;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                state2 = createTransitionAnimation4;
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState5 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed18 = startRestartGroup.changed(updateTransition);
                currentState5 = startRestartGroup.rememberedValue();
                if (changed18 || currentState5 == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    state2 = createTransitionAnimation4;
                    try {
                        Object currentState11 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState11);
                        currentState5 = currentState11;
                    } finally {
                    }
                } else {
                    state2 = createTransitionAnimation4;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState14 = (InteractiveListColorState) currentState5;
            startRestartGroup.startReplaceGroup(984715150);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            }
            long m3434overlineContentColorXeAY9LY2 = listItemColors.m3434overlineContentColorXeAY9LY(interactiveListColorState14.getEnabled(), interactiveListColorState14.getSelected(), interactiveListColorState14.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl9 = Color.m6776boximpl(m3434overlineContentColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed19 = startRestartGroup.changed(updateTransition);
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (changed19 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                rememberedValue19 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$9
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue19);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState15 = (InteractiveListColorState) ((State) rememberedValue19).getValue();
            startRestartGroup.startReplaceGroup(984715150);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                color5 = m6776boximpl9;
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            } else {
                color5 = m6776boximpl9;
            }
            long m3434overlineContentColorXeAY9LY3 = listItemColors.m3434overlineContentColorXeAY9LY(interactiveListColorState15.getEnabled(), interactiveListColorState15.getSelected(), interactiveListColorState15.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl10 = Color.m6776boximpl(m3434overlineContentColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed20 = startRestartGroup.changed(updateTransition);
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (changed20 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                rememberedValue20 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue20);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, color5, m6776boximpl10, (FiniteAnimationSpec) function35.invoke(((State) rememberedValue20).getValue(), startRestartGroup, 0), twoWayConverter5, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function36 = new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec InteractiveListItem$lambda$20;
                    InteractiveListItem$lambda$20 = ListItemKt.InteractiveListItem$lambda$20(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return InteractiveListItem$lambda$20;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
            InteractiveListColorState interactiveListColorState16 = (InteractiveListColorState) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-1535703933);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long m3435supportingContentColorXeAY9LY = listItemColors.m3435supportingContentColorXeAY9LY(interactiveListColorState16.getEnabled(), interactiveListColorState16.getSelected(), interactiveListColorState16.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6790getColorSpaceimpl6 = Color.m6790getColorSpaceimpl(m3435supportingContentColorXeAY9LY);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1791411589, "CC(remember):Transition.kt#9igjgp");
            boolean changed21 = startRestartGroup.changed(m6790getColorSpaceimpl6);
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (changed21 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                rememberedValue21 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl6);
                startRestartGroup.updateRememberedValue(rememberedValue21);
            }
            TwoWayConverter twoWayConverter6 = (TwoWayConverter) rememberedValue21;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState6 = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed22 = startRestartGroup.changed(updateTransition);
                currentState6 = startRestartGroup.rememberedValue();
                if (changed22 || currentState6 == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState12 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState12);
                        currentState6 = currentState12;
                    } finally {
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState17 = (InteractiveListColorState) currentState6;
            startRestartGroup.startReplaceGroup(-1535703933);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long m3435supportingContentColorXeAY9LY2 = listItemColors.m3435supportingContentColorXeAY9LY(interactiveListColorState17.getEnabled(), interactiveListColorState17.getSelected(), interactiveListColorState17.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl11 = Color.m6776boximpl(m3435supportingContentColorXeAY9LY2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed23 = startRestartGroup.changed(updateTransition);
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (changed23 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                rememberedValue22 = SnapshotStateKt.derivedStateOf(new Function0<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$11
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InteractiveListColorState invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue22);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            InteractiveListColorState interactiveListColorState18 = (InteractiveListColorState) ((State) rememberedValue22).getValue();
            startRestartGroup.startReplaceGroup(-1535703933);
            ComposerKt.sourceInformation(startRestartGroup, "CN(state):ListItem.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long m3435supportingContentColorXeAY9LY3 = listItemColors.m3435supportingContentColorXeAY9LY(interactiveListColorState18.getEnabled(), interactiveListColorState18.getSelected(), interactiveListColorState18.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6776boximpl12 = Color.m6776boximpl(m3435supportingContentColorXeAY9LY3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed24 = startRestartGroup.changed(updateTransition);
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (changed24 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                rememberedValue23 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue23);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, m6776boximpl11, m6776boximpl12, (FiniteAnimationSpec) function36.invoke(((State) rememberedValue23).getValue(), startRestartGroup, 0), twoWayConverter6, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TypographyKeyTokens itemLeadingAvatarLabelFont = ListTokens.INSTANCE.getItemLeadingAvatarLabelFont();
            final TypographyKeyTokens itemTrailingSupportingTextFont = ListTokens.INSTANCE.getItemTrailingSupportingTextFont();
            final TypographyKeyTokens itemOverlineFont = ListTokens.INSTANCE.getItemOverlineFont();
            final TypographyKeyTokens itemSupportingTextFont = ListTokens.INSTANCE.getItemSupportingTextFont();
            final TypographyKeyTokens itemLabelTextFont = ListTokens.INSTANCE.getItemLabelTextFont();
            final State<Dp> m227animateDpAsStateAjpBEmI = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(((Boolean) mutableState3.getValue()).booleanValue() ? listItemElevation.getDraggedElevation() : listItemElevation.getElevation(), value3, null, null, startRestartGroup, 0, 12);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(InteractiveListItem$lambda$10(createTransitionAnimation2)));
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final State state3 = state;
            final State state4 = state2;
            Function2 function26 = new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23;
                    InteractiveListItem$lambda$23 = ListItemKt.InteractiveListItem$lambda$23(Modifier.this, function1, m227animateDpAsStateAjpBEmI, density, shapeForInteraction, mutableInteractionSource4, z, str, function02, function0, paddingValues, vertical, createTransitionAnimation, layoutDirection, itemLeadingAvatarLabelFont, function22, state3, itemTrailingSupportingTextFont, function23, state4, itemOverlineFont, function24, createTransitionAnimation5, itemSupportingTextFont, function25, createTransitionAnimation6, itemLabelTextFont, function2, createTransitionAnimation2, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23;
                }
            };
            startRestartGroup = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1377981779, true, function26, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$24;
                    InteractiveListItem$lambda$24 = ListItemKt.InteractiveListItem$lambda$24(Modifier.this, function2, function22, function23, function24, function25, vertical, z, z2, function1, function0, function02, str, mutableInteractionSource, listItemColors, listItemShapes, listItemElevation, paddingValues, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$5(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1215615335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1215615335, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1359)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$8(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1119846639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1119846639, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1367)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$11(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(438180226);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(438180226, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1375)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$14(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-775265656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-775265656, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1383)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$17(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1838452572);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838452572, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1391)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec InteractiveListItem$lambda$20(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1432794927);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1432794927, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1399)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23(Modifier modifier, Function1 function1, final State state, final Density density, final Shape shape, MutableInteractionSource mutableInteractionSource, boolean z, String str, Function0 function0, Function0 function02, final PaddingValues paddingValues, Alignment.Vertical vertical, State state2, final LayoutDirection layoutDirection, final TypographyKeyTokens typographyKeyTokens, final Function2 function2, final State state3, final TypographyKeyTokens typographyKeyTokens2, final Function2 function22, final State state4, final TypographyKeyTokens typographyKeyTokens3, final Function2 function23, final State state5, final TypographyKeyTokens typographyKeyTokens4, final Function2 function24, final State state6, final TypographyKeyTokens typographyKeyTokens5, final Function2 function25, final State state7, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1425@61872L48,1426@61956L197,1443@62747L295,1451@63067L295,1459@63387L209,1466@63623L217,1473@63864L198,1419@61536L2537:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377981779, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1419)");
            }
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(SizeKt.m1256defaultMinSizeVpY3zN4$default(SemanticsModifierKt.semantics(modifier, true, function1), 0.0f, ListTokens.INSTANCE.m5336getItemOneLineContainerHeightD9Ej5fM(), 1, null));
            ComposerKt.sourceInformationMarkerStart(composer, -1390551331, "CC(remember):ListItem.kt#9igjgp");
            boolean changed = composer.changed(state);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FloatProducer() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda10
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float InteractiveListItem$lambda$23$0$0;
                        InteractiveListItem$lambda$23$0$0 = ListItemKt.InteractiveListItem$lambda$23$0$0(State.this);
                        return InteractiveListItem$lambda$23$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier zIndexLambda = zIndexLambda(minimumInteractiveComponentSize, (FloatProducer) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer, -1390548494, "CC(remember):ListItem.kt#9igjgp");
            boolean changed2 = composer.changed(density) | composer.changed(state) | composer.changed(shape);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit InteractiveListItem$lambda$23$1$0;
                        InteractiveListItem$lambda$23$1$0 = ListItemKt.InteractiveListItem$lambda$23$1$0(Density.this, shape, state, (GraphicsLayerScope) obj);
                        return InteractiveListItem$lambda$23$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            InteractiveListItemLayout(PaddingKt.padding(ClickableKt.m403combinedClickableauXiCPI$default(ClipKt.clip(BackgroundKt.m352backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(zIndexLambda, (Function1) rememberedValue2), InteractiveListItem$lambda$7(state2), shape), shape), mutableInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z, null, null, str, function0, null, false, function02, 408, null), paddingValues), vertical, ComposableLambdaKt.rememberComposableLambda(-334713283, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23$2;
                    InteractiveListItem$lambda$23$2 = ListItemKt.InteractiveListItem$lambda$23$2(PaddingValues.this, layoutDirection, typographyKeyTokens, function2, state3, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23$2;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-1109808834, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23$3;
                    InteractiveListItem$lambda$23$3 = ListItemKt.InteractiveListItem$lambda$23$3(PaddingValues.this, layoutDirection, typographyKeyTokens2, function22, state4, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23$3;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-1884904385, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23$4;
                    InteractiveListItem$lambda$23$4 = ListItemKt.InteractiveListItem$lambda$23$4(TypographyKeyTokens.this, function23, state5, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23$4;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(1634967360, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23$5;
                    InteractiveListItem$lambda$23$5 = ListItemKt.InteractiveListItem$lambda$23$5(TypographyKeyTokens.this, function24, state6, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23$5;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(859871809, true, new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItem$lambda$23$6;
                    InteractiveListItem$lambda$23$6 = ListItemKt.InteractiveListItem$lambda$23$6(TypographyKeyTokens.this, function25, state7, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItem$lambda$23$6;
                }
            }, composer, 54), composer, 1797504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float InteractiveListItem$lambda$23$0$0(State state) {
        return Dp.m9731compareTo0680j_4(((Dp) state.getValue()).m9746unboximpl(), Dp.m9732constructorimpl((float) 0)) > 0 ? 1.0f : 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$1$0(Density density, Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(density.mo528toPx0680j_4(((Dp) state.getValue()).m9746unboximpl()));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$2(PaddingValues paddingValues, LayoutDirection layoutDirection, TypographyKeyTokens typographyKeyTokens, Function2 function2, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1444@62765L263:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334713283, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1444)");
            }
            m3465LeadingDecorator8s8adOk(PaddingKt.calculateStartPadding(paddingValues, layoutDirection), InteractiveListItem$lambda$13(state), typographyKeyTokens, function2, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$3(PaddingValues paddingValues, LayoutDirection layoutDirection, TypographyKeyTokens typographyKeyTokens, Function2 function2, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1452@63085L263:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109808834, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1452)");
            }
            m3470TrailingDecorator8s8adOk(PaddingKt.calculateEndPadding(paddingValues, layoutDirection), InteractiveListItem$lambda$16(state), typographyKeyTokens, function2, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$4(TypographyKeyTokens typographyKeyTokens, Function2 function2, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1460@63405L177:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884904385, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1460)");
            }
            m3467OverlineDecorator3JVO9M(InteractiveListItem$lambda$19(state), typographyKeyTokens, function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$5(TypographyKeyTokens typographyKeyTokens, Function2 function2, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1467@63641L185:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634967360, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1467)");
            }
            m3469SupportingDecorator3JVO9M(InteractiveListItem$lambda$22(state), typographyKeyTokens, function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InteractiveListItem$lambda$23$6(TypographyKeyTokens typographyKeyTokens, Function2 function2, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1474@63882L166:ListItem.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859871809, i, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1474)");
            }
            m3464ContentDecorator3JVO9M(InteractiveListItem$lambda$10(state), typographyKeyTokens, function2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void InteractiveListItemLayout(final Modifier modifier, final Alignment.Vertical vertical, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1118275927);
        ComposerKt.sourceInformation(startRestartGroup, "C(InteractiveListItemLayout)N(modifier,verticalAlignment,leading,trailing,overline,supporting,content)1495@64427L123,1498@64555L158:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(vertical) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118275927, i2, -1, "androidx.compose.material3.InteractiveListItemLayout (ListItem.kt:1493)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -921331356, "CC(remember):ListItem.kt#9igjgp");
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new InteractiveListItemMeasurePolicy(vertical);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function22, function23, function24, function25});
            InteractiveListItemMeasurePolicy interactiveListItemMeasurePolicy = (InteractiveListItemMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 292526026, "CC(remember):Layout.kt#9igjgp");
            boolean changed = startRestartGroup.changed(interactiveListItemMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(interactiveListItemMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InteractiveListItemLayout$lambda$1;
                    InteractiveListItemLayout$lambda$1 = ListItemKt.InteractiveListItemLayout$lambda$1(Modifier.this, vertical, function2, function22, function23, function24, function25, i, (Composer) obj, ((Integer) obj2).intValue());
                    return InteractiveListItemLayout$lambda$1;
                }
            });
        }
    }

    private static final Modifier zIndexLambda(Modifier modifier, final FloatProducer floatProducer) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult zIndexLambda$lambda$0;
                zIndexLambda$lambda$0 = ListItemKt.zIndexLambda$lambda$0(FloatProducer.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return zIndexLambda$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult zIndexLambda$lambda$0(final FloatProducer floatProducer, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit zIndexLambda$lambda$0$0;
                zIndexLambda$lambda$0$0 = ListItemKt.zIndexLambda$lambda$0$0(Placeable.this, floatProducer, (Placeable.PlacementScope) obj);
                return zIndexLambda$lambda$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit zIndexLambda$lambda$0$0(Placeable placeable, FloatProducer floatProducer, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, floatProducer.invoke());
        return Unit.INSTANCE;
    }

    public static final float getInteractiveListStartPadding() {
        return InteractiveListStartPadding;
    }

    public static final float getInteractiveListEndPadding() {
        return InteractiveListEndPadding;
    }

    public static final float getInteractiveListTopPadding() {
        return InteractiveListTopPadding;
    }

    public static final float getInteractiveListBottomPadding() {
        return InteractiveListBottomPadding;
    }

    public static final float getInteractiveListInternalSpacing() {
        return InteractiveListInternalSpacing;
    }

    public static final float getInteractiveListVerticalAlignmentBreakpoint() {
        return InteractiveListVerticalAlignmentBreakpoint;
    }

    private static final long InteractiveListItem$lambda$7(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long InteractiveListItem$lambda$10(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long InteractiveListItem$lambda$13(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long InteractiveListItem$lambda$16(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long InteractiveListItem$lambda$19(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long InteractiveListItem$lambda$22(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    static {
        float f = 16;
        ListItemStartPadding = Dp.m9732constructorimpl(f);
        ListItemEndPadding = Dp.m9732constructorimpl(f);
        LeadingContentEndPadding = Dp.m9732constructorimpl(f);
        TrailingContentStartPadding = Dp.m9732constructorimpl(f);
        float m5340getItemTopSpaceD9Ej5fM = ListTokens.INSTANCE.m5340getItemTopSpaceD9Ej5fM();
        InteractiveListTopPadding = m5340getItemTopSpaceD9Ej5fM;
        float m5324getItemBottomSpaceD9Ej5fM = ListTokens.INSTANCE.m5324getItemBottomSpaceD9Ej5fM();
        InteractiveListBottomPadding = m5324getItemBottomSpaceD9Ej5fM;
        InteractiveListInternalSpacing = ListTokens.INSTANCE.m5323getItemBetweenSpaceD9Ej5fM();
        InteractiveListVerticalAlignmentBreakpoint = Dp.m9732constructorimpl(Dp.m9732constructorimpl(Dp.m9732constructorimpl(Dp.m9732constructorimpl(ListTokens.INSTANCE.m5339getItemThreeLineContainerHeightD9Ej5fM() + ListTokens.INSTANCE.m5344getItemTwoLineContainerHeightD9Ej5fM()) / 2) - m5340getItemTopSpaceD9Ej5fM) - m5324getItemBottomSpaceD9Ej5fM);
    }
}
