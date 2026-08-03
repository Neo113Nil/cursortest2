package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¼\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a¨\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a¦\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001d\u001a¼\u0001\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a¨\u0001\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a¦\u0001\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001d\u001aÄ\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010#\u001a°\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010$\u001aÄ\u0001\u0010%\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010#\u001a°\u0001\u0010%\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010$\u001aÛ\u0001\u0010&\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010(\u001aÇ\u0001\u0010&\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020!2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010)\u001a¥\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010,\u001a\u0091\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010-\u001a\u008f\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010.\u001a¥\u0001\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010,\u001a\u0091\u0001\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010-\u001a\u008f\u0001\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010.\u001aÂ\u0001\u00100\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u00105\u001a\u0002062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b8\u00109\u001a×\u0001\u0010:\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u00101\u001a\u0002022\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u00105\u001a\u0002062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b;\u0010<\u001a\u0099\u0001\u0010=\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010>\u001a\u0002042\u0006\u0010?\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0017H\u0003¢\u0006\u0004\b@\u0010A\u001a\u0099\u0001\u0010B\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010>\u001a\u0002042\u0006\u0010?\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0017H\u0003¢\u0006\u0004\bC\u0010A\u001aN\u0010D\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010>\u001a\u000204H\u0003¢\u0006\u0004\bE\u0010F\u001a9\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010?\u001a\u000204H\u0003¢\u0006\u0004\bH\u0010I\u001a%\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HL0K\"\u0004\b\u0000\u0010L2\b\u0010M\u001a\u0004\u0018\u0001HLH\u0003¢\u0006\u0002\u0010N\u001a&\u0010S\u001a\u00020\u00172\b\b\u0002\u0010T\u001a\u00020\t2\b\b\u0002\u0010U\u001a\u00020\t2\b\b\u0002\u0010V\u001a\u00020\tH\u0002\"\u0018\u0010O\u001a\u00020\u000f*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0010\u0010W\u001a\u000206X\u0082\u0004¢\u0006\u0004\n\u0002\u0010X\"\u000e\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010[\u001a\u000206X\u0082\u0004¢\u0006\u0004\n\u0002\u0010X¨\u0006\\"}, d2 = {"AssistChip", "", "onClick", "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ChipColors;", "elevation", "Landroidx/compose/material3/ChipElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedAssistChip", "FilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedFilterChip", "InputChip", "avatar", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ElevatedSuggestionChip", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "minHeight", "Landroidx/compose/ui/unit/Dp;", "paddingValues", "Chip-EosBjUw", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-9rhh4-4", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ChipContent", "leadingIconColor", "trailingIconColor", "ChipContent-CmOm80E", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "AnimatingChipContent", "AnimatingChipContent-CmOm80E", "leadingContent", "leadingContent-XO-JAsU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "trailingContent", "trailingContent-RPmYEkk", "(Lkotlin/jvm/functions/Function2;JLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRetainedState", "Landroidx/compose/runtime/State;", "T", "targetValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "defaultSuggestionChipColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "HorizontalElementsPadding", "F", "DefaultHorizontalArrangement", "Landroidx/compose/material3/ChipArrangement;", "maxChipWidth", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float HorizontalElementsPadding = Dp.m9732constructorimpl(8);
    private static final ChipArrangement DefaultHorizontalArrangement = new ChipArrangement(SuggestionChipDefaults.INSTANCE.m4098getHorizontalSpacingD9Ej5fM(), null);
    private static final float maxChipWidth = Dp.m9732constructorimpl(1000);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatingChipContent_CmOm80E$lambda$1(Function2 function2, TextStyle textStyle, long j, Function2 function22, Function2 function23, Function2 function24, long j2, long j3, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        m2707AnimatingChipContentCmOm80E(function2, textStyle, j, function22, function23, function24, j2, j3, f, horizontal, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssistChip$lambda$0(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        AssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssistChip$lambda$1(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        AssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssistChip$lambda$3(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        AssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipContent_CmOm80E$lambda$1(Function2 function2, TextStyle textStyle, long j, Function2 function22, Function2 function23, Function2 function24, long j2, long j3, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        m2709ChipContentCmOm80E(function2, textStyle, j, function22, function23, function24, j2, j3, f, horizontal, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip_EosBjUw$lambda$3(Modifier modifier, Function0 function0, boolean z, Function2 function2, TextStyle textStyle, long j, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        m2708ChipEosBjUw(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedAssistChip$lambda$0(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedAssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedAssistChip$lambda$1(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedAssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedAssistChip$lambda$3(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedAssistChip(function0, function2, modifier, z, function22, function23, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedFilterChip$lambda$0(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedFilterChip(z, function0, function2, modifier, z2, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedFilterChip$lambda$1(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedFilterChip(z, function0, function2, modifier, z2, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedSuggestionChip$lambda$0(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedSuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedSuggestionChip$lambda$1(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        ElevatedSuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedSuggestionChip$lambda$3(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        ElevatedSuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterChip$lambda$0(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        FilterChip(z, function0, function2, modifier, z2, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterChip$lambda$1(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        FilterChip(z, function0, function2, modifier, z2, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputChip$lambda$1(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        InputChip(z, function0, function2, modifier, z2, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputChip$lambda$3(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        InputChip(z, function0, function2, modifier, z2, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectableChip_9rhh4_4$lambda$3(boolean z, Modifier modifier, Function0 function0, boolean z2, Function2 function2, TextStyle textStyle, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        m2710SelectableChip9rhh44(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuggestionChip$lambda$0(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        SuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuggestionChip$lambda$1(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        SuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuggestionChip$lambda$3(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        SuggestionChip(function0, function2, modifier, z, function22, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Shape shape2;
        final ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Composer composer2;
        final ChipElevation chipElevation3;
        final Modifier modifier3;
        final boolean z2;
        final BorderStroke borderStroke2;
        final Arrangement.Horizontal horizontal2;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Shape shape3;
        ChipColors chipColors3;
        Modifier modifier4;
        int i17;
        int i18;
        ChipElevation chipElevation4;
        boolean z3;
        BorderStroke borderStroke3;
        int i19;
        Arrangement.Horizontal horizontal3;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape4;
        int i20;
        ChipElevation chipElevation5;
        int i21;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(-696418916);
        ComposerKt.sourceInformation(startRestartGroup, "C(AssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)147@7553L5,142@7385L594:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i26 = i3 & 4;
        if (i26 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i25 = 8388608;
                                i4 |= i25;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i25 = 4194304;
                        i4 |= i25;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) != 0) {
                        if ((i3 & 256) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i24 = 67108864;
                                i4 |= i24;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i24 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i24;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(borderStroke)) {
                            i23 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i23;
                        }
                        i23 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i23;
                    }
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0 && startRestartGroup.changed(horizontal)) {
                            i22 = 4;
                            i8 = i2 | i22;
                        }
                        i22 = 2;
                        i8 = i2 | i22;
                    } else {
                        i8 = i2;
                    }
                    i9 = i3 & 2048;
                    if (i9 == 0) {
                        i10 = i9;
                        i11 = i8 | 48;
                    } else {
                        if ((i2 & 48) == 0) {
                            i10 = i9;
                            i8 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                        } else {
                            i10 = i9;
                        }
                        i11 = i8;
                    }
                    i12 = i3 & 4096;
                    if (i12 == 0) {
                        i13 = i12;
                        i14 = i11 | 384;
                    } else {
                        int i27 = i11;
                        if ((i2 & 384) == 0) {
                            i27 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        }
                        i13 = i12;
                        i14 = i27;
                    }
                    i15 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 147) != 146, i15 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "134@6934L5,135@6985L18,136@7056L21,137@7126L25");
                        int i28 = i14;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i29 = (i3 & 64) != 0 ? i15 & (-3670017) : i15;
                            if ((i3 & 128) != 0) {
                                i29 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i29 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i29 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i20 = i28 & (-15);
                                borderStroke4 = borderStroke;
                                horizontal4 = horizontal;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function28 = function24;
                                function27 = function25;
                                shape4 = shape2;
                                chipElevation5 = chipElevation2;
                                modifier5 = modifier2;
                            } else {
                                borderStroke4 = borderStroke;
                                horizontal4 = horizontal;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function28 = function24;
                                function27 = function25;
                                shape4 = shape2;
                                chipElevation5 = chipElevation2;
                                modifier5 = modifier2;
                                i20 = i28;
                            }
                            i21 = -696418916;
                            i19 = i29;
                            i17 = 6;
                            z3 = z;
                        } else {
                            Modifier.Companion companion = i26 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? z : true;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i6 != 0 ? null : function24;
                            Function2<? super Composer, ? super Integer, Unit> function210 = i7 != 0 ? null : function25;
                            if ((i3 & 64) != 0) {
                                i16 = i15 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                i16 = i15;
                                shape3 = shape2;
                            }
                            if ((i3 & 128) != 0) {
                                i16 &= -29360129;
                                chipColors3 = AssistChipDefaults.INSTANCE.assistChipColors(startRestartGroup, 6);
                            } else {
                                chipColors3 = chipColors2;
                            }
                            int i30 = i16;
                            if ((i3 & 256) != 0) {
                                modifier4 = companion;
                                i17 = 6;
                                i18 = i30 & (-234881025);
                                chipElevation4 = AssistChipDefaults.INSTANCE.m2536assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                modifier4 = companion;
                                i17 = 6;
                                i18 = i30;
                                chipElevation4 = chipElevation2;
                            }
                            if ((i3 & 512) != 0) {
                                z3 = z4;
                                borderStroke3 = AssistChipDefaults.INSTANCE.m2534assistChipBorderh1eTWw(z3, 0L, 0L, 0.0f, startRestartGroup, ((i18 >> 9) & 14) | 24576, 14);
                                i19 = i18 & (-1879048193);
                            } else {
                                z3 = z4;
                                borderStroke3 = borderStroke;
                                i19 = i18;
                            }
                            if ((i3 & 1024) != 0) {
                                horizontal3 = AssistChipDefaults.INSTANCE.horizontalArrangement();
                                i28 &= -15;
                            } else {
                                horizontal3 = horizontal;
                            }
                            PaddingValues contentPadding = i10 != 0 ? AssistChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if (i13 != 0) {
                                borderStroke4 = borderStroke3;
                                horizontal4 = horizontal3;
                                paddingValues3 = contentPadding;
                                mutableInteractionSource3 = null;
                                function27 = function210;
                                shape4 = shape3;
                                i20 = i28;
                                chipColors2 = chipColors3;
                                chipElevation5 = chipElevation4;
                                i21 = -696418916;
                                modifier5 = modifier4;
                            } else {
                                modifier5 = modifier4;
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke4 = borderStroke3;
                                horizontal4 = horizontal3;
                                paddingValues3 = contentPadding;
                                function27 = function210;
                                shape4 = shape3;
                                i20 = i28;
                                chipColors2 = chipColors3;
                                chipElevation5 = chipElevation4;
                                i21 = -696418916;
                            }
                            function28 = function29;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i21, i19, i20, "androidx.compose.material3.AssistChip (Chip.kt:142)");
                        }
                        int i31 = i19 << 6;
                        int i32 = i19 >> 24;
                        int i33 = i20 << 9;
                        boolean z5 = z3;
                        ChipColors chipColors4 = chipColors2;
                        m2708ChipEosBjUw(modifier5, function0, z5, function2, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i17), chipColors2.m2688labelColorvNxB06k$material3(z3), function28, function27, shape4, chipColors4, chipElevation5, borderStroke4, AssistChipDefaults.INSTANCE.m2539getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, ((i19 >> 6) & 14) | ((i19 << 3) & 112) | ((i19 >> 3) & 896) | (i31 & 7168) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), (i32 & 112) | (i32 & 14) | 384 | (i33 & 7168) | (57344 & i33) | (i33 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z2 = z5;
                        function26 = function28;
                        function25 = function27;
                        shape2 = shape4;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation5;
                        borderStroke2 = borderStroke4;
                        horizontal2 = horizontal4;
                        paddingValues2 = paddingValues3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        function26 = function24;
                        composer2 = startRestartGroup;
                        chipElevation3 = chipElevation2;
                        modifier3 = modifier2;
                        z2 = z;
                        borderStroke2 = borderStroke;
                        horizontal2 = horizontal;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AssistChip$lambda$0;
                                AssistChip$lambda$0 = ChipKt.AssistChip$lambda$0(Function0.this, function2, modifier3, z2, function26, function25, shape2, chipColors2, chipElevation3, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return AssistChip$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i9 = i3 & 2048;
                if (i9 == 0) {
                }
                i12 = i3 & 4096;
                if (i12 == 0) {
                }
                i15 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 147) != 146, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
            }
            i12 = i3 & 4096;
            if (i12 == 0) {
            }
            i15 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 147) != 146, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        i12 = i3 & 4096;
        if (i12 == 0) {
        }
        i15 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 147) != 146, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d9  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function24;
        int i7;
        Function2 function25;
        int i8;
        int i9;
        int i10;
        int i11;
        final ChipElevation chipElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final Modifier modifier3;
        final boolean z3;
        Composer composer2;
        final Function2 function27;
        final Shape shape2;
        final ChipColors chipColors2;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i12;
        ChipColors chipColors3;
        Modifier modifier4;
        int i13;
        int i14;
        ChipElevation chipElevation3;
        boolean z4;
        BorderStroke borderStroke3;
        int i15;
        Modifier modifier5;
        boolean z5;
        ChipElevation chipElevation4;
        Function2 function28;
        ChipColors chipColors4;
        int i16;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        Function2 function29;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(1192083339);
        ComposerKt.sourceInformation(startRestartGroup, "C(AssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)220@11250L482:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
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
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(chipColors)) {
                            i19 = 8388608;
                            i4 |= i19;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = 67108864;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(borderStroke)) {
                            i17 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i17;
                        }
                        i17 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i17;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "214@10966L5,215@11017L18,216@11088L21,217@11158L25");
                        int i21 = i10;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i22 = (i3 & 64) != 0 ? i11 & (-3670017) : i11;
                            if ((i3 & 128) != 0) {
                                i22 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i22 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i22 &= -1879048193;
                            }
                            shape3 = shape;
                            chipElevation4 = chipElevation;
                            borderStroke4 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i16 = 6;
                            function29 = function25;
                            modifier5 = modifier2;
                            z5 = z2;
                            function28 = function24;
                            i15 = i22;
                            i14 = i21;
                            chipColors4 = chipColors;
                        } else {
                            Modifier.Companion companion = i20 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z2 : true;
                            Function2 function210 = i6 != 0 ? null : function24;
                            Function2 function211 = i7 != 0 ? null : function25;
                            if ((i3 & 64) != 0) {
                                i12 = i11 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                                i12 = i11;
                            }
                            if ((i3 & 128) != 0) {
                                i12 &= -29360129;
                                chipColors3 = AssistChipDefaults.INSTANCE.assistChipColors(startRestartGroup, 6);
                            } else {
                                chipColors3 = chipColors;
                            }
                            int i23 = i12;
                            if ((i3 & 256) != 0) {
                                i13 = 6;
                                modifier4 = companion;
                                i14 = i21;
                                i23 &= -234881025;
                                chipElevation3 = AssistChipDefaults.INSTANCE.m2536assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                modifier4 = companion;
                                i13 = 6;
                                i14 = i21;
                                chipElevation3 = chipElevation;
                            }
                            if ((i3 & 512) != 0) {
                                z4 = z6;
                                borderStroke3 = AssistChipDefaults.INSTANCE.m2534assistChipBorderh1eTWw(z4, 0L, 0L, 0.0f, startRestartGroup, ((i23 >> 9) & 14) | 24576, 14);
                                i15 = i23 & (-1879048193);
                            } else {
                                z4 = z6;
                                borderStroke3 = borderStroke;
                                i15 = i23;
                            }
                            modifier5 = modifier4;
                            if (i9 != 0) {
                                z5 = z4;
                                function28 = function210;
                                chipColors4 = chipColors3;
                                i16 = i13;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource3 = null;
                                chipElevation4 = chipElevation3;
                            } else {
                                z5 = z4;
                                chipElevation4 = chipElevation3;
                                function28 = function210;
                                chipColors4 = chipColors3;
                                i16 = i13;
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke4 = borderStroke3;
                            }
                            function29 = function211;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1192083339, i15, i14, "androidx.compose.material3.AssistChip (Chip.kt:220)");
                        }
                        AssistChip(function0, function2, modifier5, z5, function28, function29, shape3, chipColors4, chipElevation4, borderStroke4, AssistChipDefaults.INSTANCE.horizontalArrangement(), AssistChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, i15 & 2147483646, ((i14 << i16) & 896) | 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z3 = z5;
                        function27 = function28;
                        function26 = function29;
                        shape2 = shape3;
                        chipColors2 = chipColors4;
                        chipElevation2 = chipElevation4;
                        borderStroke2 = borderStroke4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        chipElevation2 = chipElevation;
                        mutableInteractionSource2 = mutableInteractionSource;
                        function26 = function25;
                        modifier3 = modifier2;
                        z3 = z2;
                        composer2 = startRestartGroup;
                        function27 = function24;
                        shape2 = shape;
                        chipColors2 = chipColors;
                        borderStroke2 = borderStroke;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AssistChip$lambda$1;
                                AssistChip$lambda$1 = ChipKt.AssistChip$lambda$1(Function0.this, function2, modifier3, z3, function27, function26, shape2, chipColors2, chipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return AssistChip$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
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
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function24;
        int i7;
        Function2 function25;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Shape shape2;
        final ChipElevation chipElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final Modifier modifier3;
        final boolean z3;
        final Function2 function27;
        final ChipColors chipColors2;
        final ChipBorder chipBorder2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i12;
        ChipColors chipColors3;
        Modifier modifier4;
        int i13;
        Composer composer3;
        int i14;
        ChipElevation chipElevation3;
        ChipBorder chipBorder3;
        int i15;
        MutableInteractionSource mutableInteractionSource3;
        int i16;
        ChipElevation chipElevation4;
        Function2 function28;
        ChipBorder chipBorder4;
        Function2 function29;
        ChipColors chipColors4;
        Modifier modifier5;
        Shape shape4;
        State<BorderStroke> borderStroke$material3;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(1930061919);
        ComposerKt.sourceInformation(startRestartGroup, "C(AssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)308@15452L5,303@15284L588:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
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
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(chipColors)) {
                            i19 = 8388608;
                            i4 |= i19;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = 67108864;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(chipBorder)) {
                            i17 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i17;
                        }
                        i17 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i17;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "297@14975L5,298@15026L18,299@15097L21,300@15165L18,301@15235L39");
                        int i21 = i10;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i22 = (i3 & 64) != 0 ? i11 & (-3670017) : i11;
                            if ((i3 & 128) != 0) {
                                i22 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i22 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i22 &= -1879048193;
                            }
                            shape4 = shape;
                            chipColors4 = chipColors;
                            chipElevation4 = chipElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i13 = 6;
                            function29 = function25;
                            modifier5 = modifier2;
                            chipBorder4 = chipBorder;
                            i16 = i22;
                            i14 = i21;
                            function28 = function24;
                        } else {
                            Modifier.Companion companion = i20 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? z2 : true;
                            Function2 function210 = i6 != 0 ? null : function24;
                            Function2 function211 = i7 != 0 ? null : function25;
                            if ((i3 & 64) != 0) {
                                i12 = i11 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                                i12 = i11;
                            }
                            if ((i3 & 128) != 0) {
                                i12 &= -29360129;
                                chipColors3 = AssistChipDefaults.INSTANCE.assistChipColors(startRestartGroup, 6);
                            } else {
                                chipColors3 = chipColors;
                            }
                            int i23 = i12;
                            if ((i3 & 256) != 0) {
                                composer3 = startRestartGroup;
                                modifier4 = companion;
                                i13 = 6;
                                i14 = i21;
                                i23 &= -234881025;
                                chipElevation3 = AssistChipDefaults.INSTANCE.m2536assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                            } else {
                                modifier4 = companion;
                                i13 = 6;
                                composer3 = startRestartGroup;
                                i14 = i21;
                                chipElevation3 = chipElevation;
                            }
                            if ((i3 & 512) != 0) {
                                startRestartGroup = composer3;
                                chipBorder3 = AssistChipDefaults.INSTANCE.m2533assistChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, 3072, 7);
                                i15 = i23 & (-1879048193);
                            } else {
                                startRestartGroup = composer3;
                                chipBorder3 = chipBorder;
                                i15 = i23;
                            }
                            if (i9 != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -636350362, "CC(remember):Chip.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                chipElevation4 = chipElevation3;
                                z2 = z4;
                                function28 = function210;
                                i16 = i15;
                                function29 = function211;
                                modifier5 = modifier4;
                                chipBorder4 = chipBorder3;
                                chipColors4 = chipColors3;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i16 = i15;
                                chipElevation4 = chipElevation3;
                                z2 = z4;
                                function28 = function210;
                                chipBorder4 = chipBorder3;
                                function29 = function211;
                                chipColors4 = chipColors3;
                                modifier5 = modifier4;
                            }
                            shape4 = shape3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1930061919, i16, i14, "androidx.compose.material3.AssistChip (Chip.kt:303)");
                        }
                        TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13);
                        BorderStroke borderStroke = null;
                        long m2688labelColorvNxB06k$material3 = chipColors4.m2688labelColorvNxB06k$material3(z2);
                        if (chipBorder4 == null) {
                            startRestartGroup.startReplaceGroup(1748420109);
                            startRestartGroup.endReplaceGroup();
                            borderStroke$material3 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(-636336012);
                            ComposerKt.sourceInformation(startRestartGroup, "315@15684L21");
                            borderStroke$material3 = chipBorder4.borderStroke$material3(z2, startRestartGroup, ((i16 >> 9) & 14) | ((i16 >> 24) & 112));
                            startRestartGroup.endReplaceGroup();
                        }
                        if (borderStroke$material3 != null) {
                            borderStroke = borderStroke$material3.getValue();
                        }
                        int i24 = i16 << 6;
                        ChipColors chipColors5 = chipColors4;
                        composer2 = startRestartGroup;
                        boolean z5 = z2;
                        m2708ChipEosBjUw(modifier5, function0, z5, function2, value, m2688labelColorvNxB06k$material3, function28, function29, shape4, chipColors5, chipElevation4, borderStroke, AssistChipDefaults.INSTANCE.m2539getHeightD9Ej5fM(), null, AssistChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, composer2, ((i16 >> 6) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i16 >> 24) & 14) | 24960 | ((i14 << 15) & 458752), 8192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipBorder2 = chipBorder4;
                        modifier3 = modifier5;
                        z3 = z5;
                        function27 = function28;
                        function26 = function29;
                        shape2 = shape4;
                        chipColors2 = chipColors5;
                        chipElevation2 = chipElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        shape2 = shape;
                        chipElevation2 = chipElevation;
                        mutableInteractionSource2 = mutableInteractionSource;
                        function26 = function25;
                        modifier3 = modifier2;
                        z3 = z2;
                        function27 = function24;
                        chipColors2 = chipColors;
                        chipBorder2 = chipBorder;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AssistChip$lambda$3;
                                AssistChip$lambda$3 = ChipKt.AssistChip$lambda$3(Function0.this, function2, modifier3, z3, function27, function26, shape2, chipColors2, chipElevation2, chipBorder2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return AssistChip$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
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
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Shape shape2;
        final ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        Composer composer2;
        final ChipElevation chipElevation3;
        final Modifier modifier3;
        final boolean z2;
        final BorderStroke borderStroke2;
        final Arrangement.Horizontal horizontal2;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Shape shape3;
        ChipColors chipColors3;
        Modifier modifier4;
        int i19;
        ChipElevation chipElevation4;
        int i20;
        Arrangement.Horizontal horizontal3;
        int i21;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape4;
        int i22;
        ChipElevation chipElevation5;
        boolean z3;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(-376119450);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedAssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)389@19767L5,384@19599L594:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i26 = i3 & 4;
        if (i26 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i25 = 8388608;
                                i4 |= i25;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i25 = 4194304;
                        i4 |= i25;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) != 0) {
                        if ((i3 & 256) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i24 = 67108864;
                                i4 |= i24;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i24 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i24;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i8;
                        if ((i3 & 1024) == 0 && startRestartGroup.changed(horizontal)) {
                            i23 = 4;
                            i10 = i2 | i23;
                        }
                        i23 = 2;
                        i10 = i2 | i23;
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i12 = i11;
                        i13 = i10 | 48;
                    } else {
                        if ((i2 & 48) == 0) {
                            i12 = i11;
                            i10 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                        } else {
                            i12 = i11;
                        }
                        i13 = i10;
                    }
                    i14 = i3 & 4096;
                    if (i14 == 0) {
                        i15 = i14;
                        i16 = i13 | 384;
                    } else {
                        int i27 = i13;
                        if ((i2 & 384) == 0) {
                            i27 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        }
                        i15 = i14;
                        i16 = i27;
                    }
                    i17 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i17 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "376@19172L5,377@19223L26,378@19302L29");
                        int i28 = i16;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i29 = (i3 & 64) != 0 ? i17 & (-3670017) : i17;
                            if ((i3 & 128) != 0) {
                                i29 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i29 &= -234881025;
                            }
                            if ((i3 & 1024) != 0) {
                                int i30 = i28 & (-15);
                                i20 = i29;
                                i19 = 6;
                                borderStroke3 = borderStroke;
                                horizontal4 = horizontal;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function27 = function24;
                                function28 = function25;
                                shape4 = shape2;
                                chipElevation5 = chipElevation2;
                                modifier5 = modifier2;
                                i22 = -376119450;
                                i21 = i30;
                                z3 = z;
                            } else {
                                i20 = i29;
                                i19 = 6;
                                z3 = z;
                                borderStroke3 = borderStroke;
                                horizontal4 = horizontal;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function28 = function25;
                                shape4 = shape2;
                                chipElevation5 = chipElevation2;
                                modifier5 = modifier2;
                                i21 = i28;
                                function27 = function24;
                                i22 = -376119450;
                            }
                        } else {
                            Modifier.Companion companion = i26 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? z : true;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i6 != 0 ? null : function24;
                            Function2<? super Composer, ? super Integer, Unit> function210 = i7 != 0 ? null : function25;
                            if ((i3 & 64) != 0) {
                                i18 = i17 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                i18 = i17;
                                shape3 = shape2;
                            }
                            if ((i3 & 128) != 0) {
                                i18 &= -29360129;
                                chipColors3 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(startRestartGroup, 6);
                            } else {
                                chipColors3 = chipColors2;
                            }
                            int i31 = i18;
                            if ((i3 & 256) != 0) {
                                modifier4 = companion;
                                i19 = 6;
                                chipElevation4 = AssistChipDefaults.INSTANCE.m2538elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i20 = i31 & (-234881025);
                            } else {
                                modifier4 = companion;
                                i19 = 6;
                                chipElevation4 = chipElevation2;
                                i20 = i31;
                            }
                            BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                            if ((i3 & 1024) != 0) {
                                horizontal3 = AssistChipDefaults.INSTANCE.horizontalArrangement();
                                i21 = i28 & (-15);
                            } else {
                                horizontal3 = horizontal;
                                i21 = i28;
                            }
                            PaddingValues contentPadding = i12 != 0 ? AssistChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if (i15 != 0) {
                                borderStroke3 = borderStroke4;
                                horizontal4 = horizontal3;
                                paddingValues3 = contentPadding;
                                mutableInteractionSource3 = null;
                                function27 = function29;
                                function28 = function210;
                                shape4 = shape3;
                                chipColors2 = chipColors3;
                                i22 = -376119450;
                                modifier5 = modifier4;
                            } else {
                                modifier5 = modifier4;
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke3 = borderStroke4;
                                horizontal4 = horizontal3;
                                paddingValues3 = contentPadding;
                                function27 = function29;
                                function28 = function210;
                                shape4 = shape3;
                                chipColors2 = chipColors3;
                                i22 = -376119450;
                            }
                            chipElevation5 = chipElevation4;
                            z3 = z4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i22, i20, i21, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:384)");
                        }
                        int i32 = i20 << 6;
                        int i33 = i20 >> 24;
                        int i34 = i21 << 9;
                        boolean z5 = z3;
                        ChipColors chipColors4 = chipColors2;
                        m2708ChipEosBjUw(modifier5, function0, z5, function2, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i19), chipColors2.m2688labelColorvNxB06k$material3(z3), function27, function28, shape4, chipColors4, chipElevation5, borderStroke3, AssistChipDefaults.INSTANCE.m2539getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, ((i20 >> 6) & 14) | ((i20 << 3) & 112) | ((i20 >> 3) & 896) | (i32 & 7168) | (3670016 & i32) | (29360128 & i32) | (234881024 & i32) | (i32 & 1879048192), (i33 & 112) | (i33 & 14) | 384 | (i34 & 7168) | (57344 & i34) | (i34 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z2 = z5;
                        function26 = function27;
                        function25 = function28;
                        shape2 = shape4;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation5;
                        borderStroke2 = borderStroke3;
                        horizontal2 = horizontal4;
                        paddingValues2 = paddingValues3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        function26 = function24;
                        composer2 = startRestartGroup;
                        chipElevation3 = chipElevation2;
                        modifier3 = modifier2;
                        z2 = z;
                        borderStroke2 = borderStroke;
                        horizontal2 = horizontal;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ElevatedAssistChip$lambda$0;
                                ElevatedAssistChip$lambda$0 = ChipKt.ElevatedAssistChip$lambda$0(Function0.this, function2, modifier3, z2, function26, function25, shape2, chipColors2, chipElevation3, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ElevatedAssistChip$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) != 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i11 = i3 & 2048;
                if (i11 == 0) {
                }
                i14 = i3 & 4096;
                if (i14 == 0) {
                }
                i17 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i17 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) != 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i11 = i3 & 2048;
            if (i11 == 0) {
            }
            i14 = i3 & 4096;
            if (i14 == 0) {
            }
            i17 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i17 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        i17 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 147) != 146, i17 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedAssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function24;
        int i7;
        Function2 function25;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final ChipElevation chipElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final Modifier modifier3;
        final boolean z3;
        Composer composer2;
        final Function2 function27;
        final Shape shape2;
        final ChipColors chipColors2;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i14;
        ChipColors chipColors3;
        Modifier modifier4;
        int i15;
        int i16;
        ChipElevation chipElevation3;
        int i17;
        Modifier modifier5;
        ChipElevation chipElevation4;
        boolean z4;
        Function2 function28;
        ChipColors chipColors4;
        BorderStroke borderStroke3;
        Function2 function29;
        int i18;
        MutableInteractionSource mutableInteractionSource3;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(2028863105);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedAssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)461@23432L490:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i21 = i3 & 4;
        if (i21 != 0) {
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
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(chipColors)) {
                            i20 = 8388608;
                            i4 |= i20;
                        }
                        i20 = 4194304;
                        i4 |= i20;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i19 = 67108864;
                            i4 |= i19;
                        }
                        i19 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i19;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        i13 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "455@23172L5,456@23223L26,457@23302L29");
                            int i22 = i12;
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                int i23 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                                if ((i3 & 128) != 0) {
                                    i23 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i23 &= -234881025;
                                }
                                shape3 = shape;
                                chipElevation4 = chipElevation;
                                borderStroke3 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                modifier5 = modifier2;
                                z4 = z2;
                                function28 = function24;
                                i18 = 6;
                                i17 = i23;
                                i16 = i22;
                                chipColors4 = chipColors;
                            } else {
                                Modifier.Companion companion = i21 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i5 == 0 ? z2 : true;
                                Function2 function210 = i6 != 0 ? null : function24;
                                Function2 function211 = i7 != 0 ? null : function25;
                                if ((i3 & 64) != 0) {
                                    i14 = i13 & (-3670017);
                                    shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                    i14 = i13;
                                }
                                if ((i3 & 128) != 0) {
                                    i14 &= -29360129;
                                    chipColors3 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors3 = chipColors;
                                }
                                int i24 = i14;
                                if ((i3 & 256) != 0) {
                                    i15 = 6;
                                    modifier4 = companion;
                                    i16 = i22;
                                    chipElevation3 = AssistChipDefaults.INSTANCE.m2538elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    i17 = i24 & (-234881025);
                                } else {
                                    modifier4 = companion;
                                    i15 = 6;
                                    i16 = i22;
                                    chipElevation3 = chipElevation;
                                    i17 = i24;
                                }
                                BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                                modifier5 = modifier4;
                                if (i11 != 0) {
                                    z4 = z5;
                                    function28 = function210;
                                    chipColors4 = chipColors3;
                                    borderStroke3 = borderStroke4;
                                    function29 = function211;
                                    i18 = i15;
                                    mutableInteractionSource3 = null;
                                    chipElevation4 = chipElevation3;
                                } else {
                                    chipElevation4 = chipElevation3;
                                    z4 = z5;
                                    function28 = function210;
                                    chipColors4 = chipColors3;
                                    borderStroke3 = borderStroke4;
                                    function29 = function211;
                                    i18 = i15;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2028863105, i17, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:461)");
                            }
                            ElevatedAssistChip(function0, function2, modifier5, z4, function28, function29, shape3, chipColors4, chipElevation4, borderStroke3, AssistChipDefaults.INSTANCE.horizontalArrangement(), AssistChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, i17 & 2147483646, ((i16 << i18) & 896) | 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier5;
                            z3 = z4;
                            function27 = function28;
                            function26 = function29;
                            shape2 = shape3;
                            chipColors2 = chipColors4;
                            chipElevation2 = chipElevation4;
                            borderStroke2 = borderStroke3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            chipElevation2 = chipElevation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            function26 = function25;
                            modifier3 = modifier2;
                            z3 = z2;
                            composer2 = startRestartGroup;
                            function27 = function24;
                            shape2 = shape;
                            chipColors2 = chipColors;
                            borderStroke2 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda22
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ElevatedAssistChip$lambda$1;
                                    ElevatedAssistChip$lambda$1 = ChipKt.ElevatedAssistChip$lambda$1(Function0.this, function2, modifier3, z3, function27, function26, shape2, chipColors2, chipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ElevatedAssistChip$lambda$1;
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
                    i13 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                i13 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
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
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v30, types: [androidx.compose.foundation.BorderStroke] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedAssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function24;
        int i7;
        Function2 function25;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final ChipElevation chipElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final Modifier modifier3;
        final boolean z3;
        Composer composer2;
        final Function2 function27;
        final Shape shape2;
        final ChipColors chipColors2;
        final ChipBorder chipBorder2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i14;
        ChipColors chipColors3;
        Modifier modifier4;
        int i15;
        int i16;
        ChipElevation chipElevation3;
        int i17;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation4;
        Function2 function28;
        BorderStroke borderStroke;
        Function2 function29;
        ChipColors chipColors4;
        Modifier modifier5;
        Shape shape4;
        State<BorderStroke> borderStroke$material3;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-759567147);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedAssistChip)N(onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)548@27633L5,543@27465L588:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
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
                    function24 = function22;
                    i4 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(chipColors)) {
                            i19 = 8388608;
                            i4 |= i19;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = 67108864;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(chipBorder) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        i13 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "537@27173L5,538@27224L26,539@27303L29,541@27416L39");
                            int i21 = i12;
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                int i22 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                                if ((i3 & 128) != 0) {
                                    i22 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i22 &= -234881025;
                                }
                                shape4 = shape;
                                chipColors4 = chipColors;
                                chipElevation4 = chipElevation;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i15 = 6;
                                modifier5 = modifier2;
                                borderStroke = 0;
                                i17 = i22;
                                function29 = function24;
                                i16 = i21;
                                function28 = function25;
                                chipBorder3 = chipBorder;
                            } else {
                                Modifier.Companion companion = i20 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? z2 : true;
                                Function2 function210 = i6 != 0 ? null : function24;
                                Function2 function211 = i7 != 0 ? null : function25;
                                if ((i3 & 64) != 0) {
                                    i14 = i13 & (-3670017);
                                    shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                    i14 = i13;
                                }
                                if ((i3 & 128) != 0) {
                                    i14 &= -29360129;
                                    chipColors3 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors3 = chipColors;
                                }
                                int i23 = i14;
                                if ((i3 & 256) != 0) {
                                    modifier4 = companion;
                                    i16 = i21;
                                    i15 = 6;
                                    chipElevation3 = AssistChipDefaults.INSTANCE.m2538elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    i17 = i23 & (-234881025);
                                } else {
                                    modifier4 = companion;
                                    i15 = 6;
                                    i16 = i21;
                                    chipElevation3 = chipElevation;
                                    i17 = i23;
                                }
                                chipBorder3 = i9 != 0 ? null : chipBorder;
                                if (i11 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 200429116, "CC(remember):Chip.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    chipElevation4 = chipElevation3;
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipElevation4 = chipElevation3;
                                }
                                function28 = function211;
                                z2 = z4;
                                borderStroke = 0;
                                function29 = function210;
                                chipColors4 = chipColors3;
                                modifier5 = modifier4;
                                shape4 = shape3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-759567147, i17, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:543)");
                            }
                            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i15);
                            long m2688labelColorvNxB06k$material3 = chipColors4.m2688labelColorvNxB06k$material3(z2);
                            float m2539getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m2539getHeightD9Ej5fM();
                            PaddingValues contentPadding = AssistChipDefaults.INSTANCE.getContentPadding();
                            if (chipBorder3 == null) {
                                startRestartGroup.startReplaceGroup(1918885303);
                                startRestartGroup.endReplaceGroup();
                                borderStroke$material3 = borderStroke;
                            } else {
                                startRestartGroup.startReplaceGroup(200446858);
                                ComposerKt.sourceInformation(startRestartGroup, "557@27971L21");
                                borderStroke$material3 = chipBorder3.borderStroke$material3(z2, startRestartGroup, ((i17 >> 9) & 14) | ((i17 >> 24) & 112));
                                startRestartGroup.endReplaceGroup();
                            }
                            if (borderStroke$material3 != null) {
                                borderStroke = borderStroke$material3.getValue();
                            }
                            int i24 = i17 << 6;
                            ChipColors chipColors5 = chipColors4;
                            boolean z5 = z2;
                            m2708ChipEosBjUw(modifier5, function0, z5, function2, value, m2688labelColorvNxB06k$material3, function29, function28, shape4, chipColors5, chipElevation4, borderStroke, m2539getHeightD9Ej5fM, null, contentPadding, mutableInteractionSource3, startRestartGroup, ((i17 >> 6) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i17 >> 24) & 14) | 24960 | ((i16 << 15) & 458752), 8192);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder2 = chipBorder3;
                            composer2 = startRestartGroup;
                            modifier3 = modifier5;
                            z3 = z5;
                            function27 = function29;
                            function26 = function28;
                            shape2 = shape4;
                            chipColors2 = chipColors5;
                            chipElevation2 = chipElevation4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            chipElevation2 = chipElevation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            function26 = function25;
                            modifier3 = modifier2;
                            z3 = z2;
                            composer2 = startRestartGroup;
                            function27 = function24;
                            shape2 = shape;
                            chipColors2 = chipColors;
                            chipBorder2 = chipBorder;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda35
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ElevatedAssistChip$lambda$3;
                                    ElevatedAssistChip$lambda$3 = ChipKt.ElevatedAssistChip$lambda$3(Function0.this, function2, modifier3, z3, function27, function26, shape2, chipColors2, chipElevation2, chipBorder2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ElevatedAssistChip$lambda$3;
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
                    i13 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                i13 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function24 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
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
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function24 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Modifier modifier2;
        final Arrangement.Horizontal horizontal2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        Composer composer2;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation2;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        int i14;
        int i15;
        int i16;
        SelectableChipElevation selectableChipElevation3;
        int i17;
        BorderStroke borderStroke3;
        Arrangement.Horizontal horizontal3;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        BorderStroke borderStroke4;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        Modifier modifier3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(1511159815);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)N(selected,onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)649@32753L5,643@32546L607:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i23 = i3 & 8;
        if (i23 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function24 = function22;
                } else {
                    function24 = function22;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i22 = 8388608;
                            i4 |= i22;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i22 = 4194304;
                    i4 |= i22;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i21 = 67108864;
                            i4 |= i21;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i21 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i21;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i20 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i20;
                    }
                    i20 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i20;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(borderStroke)) {
                        i19 = 4;
                        i8 = i2 | i19;
                    }
                    i19 = 2;
                    i8 = i2 | i19;
                } else {
                    i8 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(horizontal)) {
                        i18 = 32;
                        i8 |= i18;
                    }
                    i18 = 16;
                    i8 |= i18;
                }
                int i24 = i8;
                i9 = i3 & 4096;
                if (i9 != 0) {
                    i10 = i24 | 384;
                } else {
                    int i25 = i24;
                    if ((i2 & 384) == 0) {
                        i25 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                    }
                    i10 = i25;
                }
                i11 = i3 & 8192;
                if (i11 != 0) {
                    i12 = i11;
                    i13 = i10 | 3072;
                } else {
                    int i26 = i10;
                    if ((i2 & 3072) == 0) {
                        i12 = i11;
                        i13 = i26 | (startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                    } else {
                        i12 = i11;
                        i13 = i26;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "635@32065L5,636@32126L18,637@32207L21,638@32277L35");
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
                        if ((i3 & 1024) != 0) {
                            i13 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i13 &= -113;
                        }
                        modifier3 = modifier;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke4 = borderStroke;
                        horizontal4 = horizontal;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z4 = z3;
                        function28 = function24;
                        function29 = function25;
                        shape5 = shape2;
                        selectableChipColors5 = selectableChipColors2;
                    } else {
                        Modifier.Companion companion = i23 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z5 = i5 == 0 ? z3 : true;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i6 != 0 ? null : function24;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i7 != 0 ? null : function25;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.filterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i27 = i4;
                        if ((i3 & 512) != 0) {
                            i15 = i12;
                            i16 = i9;
                            i14 = i13;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m3140filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i17 = i27 & (-1879048193);
                        } else {
                            i14 = i13;
                            i15 = i12;
                            i16 = i9;
                            selectableChipElevation3 = selectableChipElevation;
                            i17 = i27;
                        }
                        if ((i3 & 1024) != 0) {
                            borderStroke3 = FilterChipDefaults.INSTANCE.m3138filterChipBorder_7El2pE(z5, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i17 >> 12) & 14) | 100663296 | ((i17 << 3) & 112), 252);
                            i14 &= -15;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if ((i3 & 2048) != 0) {
                            horizontal3 = FilterChipDefaults.INSTANCE.horizontalArrangement();
                            i14 &= -113;
                        } else {
                            horizontal3 = horizontal;
                        }
                        PaddingValues contentPadding = i16 != 0 ? FilterChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                        if (i15 != 0) {
                            selectableChipElevation4 = selectableChipElevation3;
                            i4 = i17;
                            borderStroke4 = borderStroke3;
                            horizontal4 = horizontal3;
                            paddingValues3 = contentPadding;
                            z4 = z5;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation4 = selectableChipElevation3;
                            i4 = i17;
                            borderStroke4 = borderStroke3;
                            horizontal4 = horizontal3;
                            paddingValues3 = contentPadding;
                            z4 = z5;
                        }
                        function28 = function210;
                        function29 = function211;
                        shape5 = shape4;
                        selectableChipColors5 = selectableChipColors4;
                        i13 = i14;
                        modifier3 = companion;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1511159815, i4, i13, "androidx.compose.material3.FilterChip (Chip.kt:643)");
                    }
                    int i28 = i4 << 3;
                    int i29 = i4 << 6;
                    int i30 = i4 >> 24;
                    int i31 = i13 << 9;
                    m2710SelectableChip9rhh44(z, modifier3, function0, z4, function2, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6), function28, null, function29, shape5, selectableChipColors5, selectableChipElevation4, borderStroke4, FilterChipDefaults.INSTANCE.m3141getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, (i4 & 14) | 12582912 | ((i4 >> 6) & 112) | (i28 & 896) | ((i4 >> 3) & 7168) | (57344 & i29) | (i28 & 3670016) | (234881024 & i29) | (1879048192 & i29), (i30 & 112) | (i30 & 14) | 3072 | ((i13 << 6) & 896) | (57344 & i31) | (458752 & i31) | (i31 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier3;
                    z3 = z4;
                    function26 = function28;
                    function27 = function29;
                    shape3 = shape5;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke4;
                    horizontal2 = horizontal4;
                    paddingValues2 = paddingValues3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    horizontal2 = horizontal;
                    paddingValues2 = paddingValues;
                    mutableInteractionSource2 = mutableInteractionSource;
                    function26 = function24;
                    function27 = function25;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    selectableChipColors3 = selectableChipColors2;
                    selectableChipElevation2 = selectableChipElevation;
                    borderStroke2 = borderStroke;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FilterChip$lambda$0;
                            FilterChip$lambda$0 = ChipKt.FilterChip$lambda$0(z, function0, function2, modifier2, z3, function26, function27, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return FilterChip$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i242 = i8;
            i9 = i3 & 4096;
            if (i9 != 0) {
            }
            i11 = i3 & 8192;
            if (i11 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
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
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2422 = i8;
        i9 = i3 & 4096;
        if (i9 != 0) {
        }
        i11 = i3 & 8192;
        if (i11 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void FilterChip(final boolean z, final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2 function24;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        final SelectableChipColors selectableChipColors3;
        final Modifier modifier3;
        Composer composer2;
        final Function2 function25;
        final Function2 function26;
        final Shape shape3;
        final boolean z4;
        final SelectableChipElevation selectableChipElevation2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        int i14;
        SelectableChipElevation selectableChipElevation3;
        int i15;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        SelectableChipElevation selectableChipElevation4;
        int i16;
        BorderStroke borderStroke4;
        boolean z5;
        int i17;
        Function2 function27;
        Function2 function28;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-1385473344);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)N(selected,onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)736@37054L435:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
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
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i21 = 8388608;
                            i4 |= i21;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i21 = 4194304;
                    i4 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i20 = 67108864;
                            i4 |= i20;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i20 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i20;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i19 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i19;
                    }
                    i19 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i19;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(borderStroke)) {
                        i18 = 4;
                        i8 = i2 | i18;
                    }
                    i18 = 2;
                    i8 = i2 | i18;
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                } else {
                    if ((i2 & 48) == 0) {
                        i10 = i9;
                        i8 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    } else {
                        i10 = i9;
                    }
                    i11 = i8;
                }
                i12 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "730@36740L5,731@36801L18,732@36882L21,733@36952L35");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        i16 = (i3 & 128) != 0 ? i12 & (-29360129) : i12;
                        if ((i3 & 256) != 0) {
                            i16 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i16 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        function27 = function22;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke4 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function28 = function24;
                        shape5 = shape2;
                        selectableChipColors5 = selectableChipColors2;
                        modifier4 = modifier2;
                        z5 = z3;
                        i17 = i11;
                    } else {
                        Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 != 0 ? true : z3;
                        Function2 function29 = i6 != 0 ? null : function22;
                        Function2 function210 = i7 != 0 ? null : function24;
                        if ((i3 & 128) != 0) {
                            i13 = i12 & (-29360129);
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            i13 = i12;
                            shape4 = shape2;
                        }
                        if ((i3 & 256) != 0) {
                            i13 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.filterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i23 = i13;
                        if ((i3 & 512) != 0) {
                            i14 = i10;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m3140filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i15 = i23 & (-1879048193);
                        } else {
                            i14 = i10;
                            selectableChipElevation3 = selectableChipElevation;
                            i15 = i23;
                        }
                        if ((i3 & 1024) != 0) {
                            borderStroke3 = FilterChipDefaults.INSTANCE.m3138filterChipBorder_7El2pE(z6, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i15 >> 12) & 14) | 100663296 | ((i15 << 3) & 112), 252);
                            i11 &= -15;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i14 != 0) {
                            modifier4 = companion;
                            selectableChipElevation4 = selectableChipElevation3;
                            i16 = i15;
                            borderStroke4 = borderStroke3;
                            z5 = z6;
                            i17 = i11;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = companion;
                            selectableChipElevation4 = selectableChipElevation3;
                            i16 = i15;
                            borderStroke4 = borderStroke3;
                            z5 = z6;
                            i17 = i11;
                        }
                        function27 = function29;
                        function28 = function210;
                        shape5 = shape4;
                        selectableChipColors5 = selectableChipColors4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1385473344, i16, i17, "androidx.compose.material3.FilterChip (Chip.kt:736)");
                    }
                    FilterChip(z, function0, function2, modifier4, z5, function27, function28, shape5, selectableChipColors5, selectableChipElevation4, borderStroke4, null, FilterChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, i16 & 2147483646, (i17 & 14) | 384 | ((i17 << 6) & 7168), 2048);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function25 = function27;
                    function26 = function28;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    borderStroke2 = borderStroke;
                    mutableInteractionSource2 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    function25 = function22;
                    function26 = function24;
                    shape3 = shape2;
                    z4 = z3;
                    selectableChipElevation2 = selectableChipElevation;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FilterChip$lambda$1;
                            FilterChip$lambda$1 = ChipKt.FilterChip$lambda$1(z, function0, function2, modifier3, z4, function25, function26, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return FilterChip$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            i12 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        i12 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final Modifier modifier2;
        final Arrangement.Horizontal horizontal2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        Composer composer2;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation2;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        int i16;
        SelectableChipElevation selectableChipElevation3;
        int i17;
        Arrangement.Horizontal horizontal3;
        int i18;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        BorderStroke borderStroke3;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues3;
        boolean z4;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        int i19;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(1397270225);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedFilterChip)N(selected,onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)828@41735L5,822@41528L607:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function24 = function22;
                } else {
                    function24 = function22;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i24 = 8388608;
                            i4 |= i24;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i24 = 4194304;
                    i4 |= i24;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i23 = 67108864;
                            i4 |= i23;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i23 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i23;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i22 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i22;
                    }
                    i22 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i22;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(horizontal)) {
                        i21 = 32;
                        i10 |= i21;
                    }
                    i21 = 16;
                    i10 |= i21;
                }
                int i26 = i10;
                i11 = i3 & 4096;
                if (i11 != 0) {
                    i12 = i26 | 384;
                } else {
                    int i27 = i26;
                    if ((i2 & 384) == 0) {
                        i27 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                    }
                    i12 = i27;
                }
                i13 = i3 & 8192;
                if (i13 != 0) {
                    i14 = i13;
                    i15 = i12 | 3072;
                } else {
                    int i28 = i12;
                    if ((i2 & 3072) == 0) {
                        i14 = i13;
                        i15 = i28 | (startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                    } else {
                        i14 = i13;
                        i15 = i28;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "814@41081L5,815@41142L26,816@41231L29");
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
                        if ((i3 & 2048) != 0) {
                            i15 &= -113;
                        }
                        modifier3 = modifier;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke3 = borderStroke;
                        horizontal4 = horizontal;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z4 = z3;
                        function28 = function24;
                        shape5 = shape2;
                        selectableChipColors5 = selectableChipColors2;
                        i20 = 12582912;
                        i19 = 1397270225;
                        function29 = function25;
                    } else {
                        Modifier.Companion companion = i25 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z5 = i5 == 0 ? z3 : true;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i6 != 0 ? null : function24;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i7 != 0 ? null : function25;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i29 = i4;
                        if ((i3 & 512) != 0) {
                            i16 = i15;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m3137elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i17 = i29 & (-1879048193);
                        } else {
                            i16 = i15;
                            selectableChipElevation3 = selectableChipElevation;
                            i17 = i29;
                        }
                        BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                        if ((i3 & 2048) != 0) {
                            horizontal3 = FilterChipDefaults.INSTANCE.horizontalArrangement();
                            i18 = i16 & (-113);
                        } else {
                            horizontal3 = horizontal;
                            i18 = i16;
                        }
                        PaddingValues contentPadding = i11 != 0 ? FilterChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                        if (i14 != 0) {
                            selectableChipElevation4 = selectableChipElevation3;
                            i4 = i17;
                            borderStroke3 = borderStroke4;
                            horizontal4 = horizontal3;
                            i15 = i18;
                            paddingValues3 = contentPadding;
                            z4 = z5;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation4 = selectableChipElevation3;
                            i4 = i17;
                            borderStroke3 = borderStroke4;
                            horizontal4 = horizontal3;
                            i15 = i18;
                            paddingValues3 = contentPadding;
                            z4 = z5;
                        }
                        shape5 = shape4;
                        selectableChipColors5 = selectableChipColors4;
                        i19 = 1397270225;
                        modifier3 = companion;
                        function28 = function210;
                        i20 = 12582912;
                        function29 = function211;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i19, i4, i15, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:822)");
                    }
                    int i30 = i4 << 3;
                    int i31 = i4 << 6;
                    int i32 = i20 | (i4 & 14) | ((i4 >> 6) & 112) | (i30 & 896) | ((i4 >> 3) & 7168) | (57344 & i31) | (i30 & 3670016) | (234881024 & i31) | (1879048192 & i31);
                    int i33 = i4 >> 24;
                    int i34 = i15 << 9;
                    m2710SelectableChip9rhh44(z, modifier3, function0, z4, function2, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6), function28, null, function29, shape5, selectableChipColors5, selectableChipElevation4, borderStroke3, FilterChipDefaults.INSTANCE.m3141getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, i32, (i33 & 112) | (i33 & 14) | 3072 | ((i15 << 6) & 896) | (57344 & i34) | (458752 & i34) | (i34 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier3;
                    z3 = z4;
                    function26 = function28;
                    function27 = function29;
                    shape3 = shape5;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke3;
                    horizontal2 = horizontal4;
                    paddingValues2 = paddingValues3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    horizontal2 = horizontal;
                    paddingValues2 = paddingValues;
                    mutableInteractionSource2 = mutableInteractionSource;
                    function26 = function24;
                    function27 = function25;
                    shape3 = shape2;
                    composer2 = startRestartGroup;
                    selectableChipColors3 = selectableChipColors2;
                    selectableChipElevation2 = selectableChipElevation;
                    borderStroke2 = borderStroke;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ElevatedFilterChip$lambda$0;
                            ElevatedFilterChip$lambda$0 = ChipKt.ElevatedFilterChip$lambda$0(z, function0, function2, modifier2, z3, function26, function27, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ElevatedFilterChip$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i262 = i10;
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i13 = i3 & 8192;
            if (i13 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
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
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2622 = i10;
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i13 = i3 & 8192;
        if (i13 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedFilterChip(final boolean z, final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2 function24;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        final SelectableChipColors selectableChipColors3;
        final Modifier modifier3;
        Composer composer2;
        final Function2 function25;
        final Function2 function26;
        final Shape shape3;
        final boolean z4;
        final SelectableChipElevation selectableChipElevation2;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        Modifier modifier4;
        int i16;
        SelectableChipElevation selectableChipElevation3;
        int i17;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        Function2 function27;
        Function2 function28;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        int i18;
        BorderStroke borderStroke3;
        boolean z5;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(1533553846);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedFilterChip)N(selected,onClick,label,modifier,enabled,leadingIcon,trailingIcon,shape,colors,elevation,border,interactionSource)907@45727L443:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
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
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i21 = 8388608;
                            i4 |= i21;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i21 = 4194304;
                    i4 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i20 = 67108864;
                            i4 |= i20;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i20 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i20;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i19 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i19;
                    }
                    i19 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i19;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                i13 = i10;
                i14 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "901@45447L5,902@45508L26,903@45597L29");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        int i23 = (i3 & 128) != 0 ? i14 & (-29360129) : i14;
                        if ((i3 & 256) != 0) {
                            i23 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i23 &= -1879048193;
                        }
                        function27 = function22;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function28 = function24;
                        shape5 = shape2;
                        modifier5 = modifier2;
                        z5 = z3;
                        i18 = 1533553846;
                        i17 = i23;
                        i16 = i13;
                        selectableChipColors5 = selectableChipColors2;
                    } else {
                        Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 == 0 ? z3 : true;
                        Function2 function29 = i6 != 0 ? null : function22;
                        Function2 function210 = i7 != 0 ? null : function24;
                        if ((i3 & 128) != 0) {
                            i15 = i14 & (-29360129);
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            i15 = i14;
                            shape4 = shape2;
                        }
                        if ((i3 & 256) != 0) {
                            i15 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i24 = i15;
                        if ((i3 & 512) != 0) {
                            modifier4 = companion;
                            i16 = i13;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m3137elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i17 = i24 & (-1879048193);
                        } else {
                            modifier4 = companion;
                            i16 = i13;
                            selectableChipElevation3 = selectableChipElevation;
                            i17 = i24;
                        }
                        BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                        modifier5 = modifier4;
                        if (i12 != 0) {
                            function27 = function29;
                            function28 = function210;
                            shape5 = shape4;
                            mutableInteractionSource3 = null;
                            selectableChipColors5 = selectableChipColors4;
                            selectableChipElevation4 = selectableChipElevation3;
                            borderStroke3 = borderStroke4;
                            z5 = z6;
                            i18 = 1533553846;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation4 = selectableChipElevation3;
                            function27 = function29;
                            function28 = function210;
                            shape5 = shape4;
                            selectableChipColors5 = selectableChipColors4;
                            i18 = 1533553846;
                            borderStroke3 = borderStroke4;
                            z5 = z6;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i18, i17, i16, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:907)");
                    }
                    ElevatedFilterChip(z, function0, function2, modifier5, z5, function27, function28, shape5, selectableChipColors5, selectableChipElevation4, borderStroke3, null, FilterChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, i17 & 2147483646, (i16 & 14) | 384 | ((i16 << 6) & 7168), 2048);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    z4 = z5;
                    function25 = function27;
                    function26 = function28;
                    shape3 = shape5;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    borderStroke2 = borderStroke;
                    mutableInteractionSource2 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    function25 = function22;
                    function26 = function24;
                    shape3 = shape2;
                    z4 = z3;
                    selectableChipElevation2 = selectableChipElevation;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ElevatedFilterChip$lambda$1;
                            ElevatedFilterChip$lambda$1 = ChipKt.ElevatedFilterChip$lambda$1(z, function0, function2, modifier3, z4, function25, function26, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ElevatedFilterChip$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            i13 = i10;
            i14 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        i13 = i10;
        i14 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape2;
        int i9;
        int i10;
        int i11;
        final SelectableChipColors selectableChipColors2;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final SelectableChipElevation selectableChipElevation2;
        final Arrangement.Horizontal horizontal2;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        SelectableChipColors selectableChipColors3;
        SelectableChipElevation selectableChipElevation3;
        int i12;
        boolean z5;
        int i13;
        BorderStroke borderStroke3;
        int i14;
        Arrangement.Horizontal horizontal3;
        PaddingValues paddingValues3;
        Shape shape4;
        BorderStroke borderStroke4;
        Arrangement.Horizontal horizontal4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        SelectableChipColors selectableChipColors4;
        SelectableChipElevation selectableChipElevation4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        ComposableLambda composableLambda;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(-1079660194);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputChip)N(selected,onClick,label,modifier,enabled,leadingIcon,avatar,trailingIcon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)1029@51530L5,1023@51324L613:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
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
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function26 = function23;
                } else {
                    function26 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function27 = function24;
                } else {
                    function27 = function24;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i20 = 67108864;
                            i4 |= i20;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i20 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i20;
                } else {
                    shape2 = shape;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipColors)) {
                        i19 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i19;
                    }
                    i19 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i19;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i18 = 4;
                        i9 = i2 | i18;
                    }
                    i18 = 2;
                    i9 = i2 | i18;
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(borderStroke)) {
                        i17 = 32;
                        i9 |= i17;
                    }
                    i17 = 16;
                    i9 |= i17;
                }
                if ((i2 & 384) == 0) {
                    if ((i3 & 4096) == 0 && startRestartGroup.changed(horizontal)) {
                        i16 = 256;
                        i9 |= i16;
                    }
                    i16 = 128;
                    i9 |= i16;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8192) == 0 && startRestartGroup.changed(paddingValues)) {
                        i15 = 2048;
                        i9 |= i15;
                    }
                    i15 = 1024;
                    i9 |= i15;
                }
                int i22 = i9;
                i10 = i3 & 16384;
                if (i10 != 0) {
                    i11 = i22 | 24576;
                } else if ((i2 & 24576) == 0) {
                    i11 = i22 | (startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192);
                } else {
                    i11 = i22;
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "993@49959L5,994@50019L17,995@50098L20,996@50166L34");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i11 &= -113;
                        }
                        if ((i3 & 4096) != 0) {
                            i11 &= -897;
                        }
                        if ((i3 & 8192) != 0) {
                            i11 &= -7169;
                        }
                        Modifier modifier5 = modifier2;
                        i14 = i11;
                        modifier4 = modifier5;
                        selectableChipColors4 = selectableChipColors;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke4 = borderStroke;
                        horizontal4 = horizontal;
                        paddingValues4 = paddingValues;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function211 = function25;
                        function213 = function26;
                        function212 = function27;
                        shape4 = shape2;
                    } else {
                        Modifier.Companion companion = i21 != 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 != 0 ? true : z3;
                        Function2<? super Composer, ? super Integer, Unit> function214 = i6 != 0 ? null : function25;
                        Function2<? super Composer, ? super Integer, Unit> function215 = i7 != 0 ? null : function26;
                        Function2<? super Composer, ? super Integer, Unit> function216 = i8 != 0 ? null : function27;
                        if ((i3 & 256) != 0) {
                            shape2 = InputChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                            selectableChipColors3 = InputChipDefaults.INSTANCE.inputChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors3 = selectableChipColors;
                        }
                        int i23 = i4;
                        if ((i3 & 1024) != 0) {
                            selectableChipElevation3 = InputChipDefaults.INSTANCE.m3372inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i12 = i11 & (-15);
                        } else {
                            selectableChipElevation3 = selectableChipElevation;
                            i12 = i11;
                        }
                        if ((i3 & 2048) != 0) {
                            i13 = i10;
                            z5 = z6;
                            borderStroke3 = InputChipDefaults.INSTANCE.m3370inputChipBorder_7El2pE(z5, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i23 >> 12) & 14) | 100663296 | ((i23 << 3) & 112), 252);
                            startRestartGroup = startRestartGroup;
                            i12 &= -113;
                        } else {
                            z5 = z6;
                            i13 = i10;
                            borderStroke3 = borderStroke;
                        }
                        i14 = i12;
                        if ((i3 & 4096) != 0) {
                            horizontal3 = InputChipDefaults.INSTANCE.horizontalArrangement();
                            i14 &= -897;
                        } else {
                            horizontal3 = horizontal;
                        }
                        if ((i3 & 8192) != 0) {
                            paddingValues3 = InputChipDefaults.INSTANCE.contentPadding(function215 != null, function214 != null, function216 != null);
                            i14 &= -7169;
                        } else {
                            paddingValues3 = paddingValues;
                        }
                        shape4 = shape2;
                        borderStroke4 = borderStroke3;
                        horizontal4 = horizontal3;
                        paddingValues4 = paddingValues3;
                        function211 = function214;
                        function212 = function216;
                        selectableChipColors4 = selectableChipColors3;
                        i4 = i23;
                        selectableChipElevation4 = selectableChipElevation3;
                        mutableInteractionSource3 = i13 != 0 ? null : mutableInteractionSource;
                        z3 = z5;
                        modifier4 = companion;
                        function213 = function215;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1079660194, i4, i14, "androidx.compose.material3.InputChip (Chip.kt:1001)");
                    }
                    if (function213 != null) {
                        startRestartGroup.startReplaceGroup(854336886);
                        ComposerKt.sourceInformation(startRestartGroup, "1007@50840L5,1009@50893L420");
                        final float disabledAvatarOpacity = z3 ? 1.0f : InputChipTokens.INSTANCE.getDisabledAvatarOpacity();
                        final Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), startRestartGroup, 6);
                        composableLambda = ComposableLambdaKt.rememberComposableLambda(445150766, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit InputChip$lambda$0;
                                InputChip$lambda$0 = ChipKt.InputChip$lambda$0(disabledAvatarOpacity, value, function213, (Composer) obj, ((Integer) obj2).intValue());
                                return InputChip$lambda$0;
                            }
                        }, startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(854934628);
                        startRestartGroup.endReplaceGroup();
                        composableLambda = null;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function217 = function213;
                    int i24 = i4 << 3;
                    ComposableLambda composableLambda2 = composableLambda;
                    int i25 = (i24 & 896) | (i4 & 14) | ((i4 >> 6) & 112) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344) | (3670016 & i24) | (234881024 & i24) | (i24 & 1879048192);
                    int i26 = i14 << 3;
                    int i27 = ((i4 >> 27) & 14) | 3072 | (i26 & 112) | (i26 & 896);
                    int i28 = i14 << 6;
                    Composer composer3 = startRestartGroup;
                    m2710SelectableChip9rhh44(z, modifier4, function0, z3, function2, TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, 6), function211, composableLambda2, function212, shape4, selectableChipColors4, selectableChipElevation4, borderStroke4, InputChipDefaults.INSTANCE.m3366getHeightD9Ej5fM(), horizontal4, paddingValues4, mutableInteractionSource3, composer3, i25, i27 | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z3;
                    function28 = function211;
                    composer2 = composer3;
                    function210 = function212;
                    shape3 = shape4;
                    selectableChipColors2 = selectableChipColors4;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke4;
                    horizontal2 = horizontal4;
                    paddingValues2 = paddingValues4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    function29 = function217;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    selectableChipColors2 = selectableChipColors;
                    borderStroke2 = borderStroke;
                    paddingValues2 = paddingValues;
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    z4 = z3;
                    function28 = function25;
                    function29 = function26;
                    composer2 = startRestartGroup;
                    function210 = function27;
                    selectableChipElevation2 = selectableChipElevation;
                    horizontal2 = horizontal;
                    shape3 = shape2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit InputChip$lambda$1;
                            InputChip$lambda$1 = ChipKt.InputChip$lambda$1(z, function0, function2, modifier3, z4, function28, function29, function210, shape3, selectableChipColors2, selectableChipElevation2, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return InputChip$lambda$1;
                        }
                    });
                    return;
                }
                return;
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
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i222 = i9;
            i10 = i3 & 16384;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i2222 = i9;
        i10 = i3 & 16384;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputChip$lambda$0(final float f, final Shape shape, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1012@50994L180,1010@50911L388:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(445150766, i, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:1010)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1706840062, "CC(remember):Chip.kt#9igjgp");
            boolean changed = composer.changed(f) | composer.changed(shape);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit InputChip$lambda$0$0$0;
                        InputChip$lambda$0$0$0 = ChipKt.InputChip$lambda$0$0$0(f, shape, (GraphicsLayerScope) obj);
                        return InputChip$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1058688979, "C1019@51273L8:Chip.kt#uh7d8r");
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
    public static final Unit InputChip$lambda$0$0$0(float f, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void InputChip(final boolean z, final Function0 function0, final Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        final Function2 function25;
        int i7;
        final Function2 function26;
        int i8;
        Function2 function27;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Modifier modifier2;
        final boolean z3;
        final SelectableChipElevation selectableChipElevation2;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Function2 function28;
        final Shape shape2;
        final SelectableChipColors selectableChipColors2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i14;
        SelectableChipColors selectableChipColors3;
        Modifier modifier3;
        int i15;
        Composer composer3;
        int i16;
        SelectableChipElevation selectableChipElevation3;
        BorderStroke borderStroke3;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        BorderStroke borderStroke4;
        boolean z4;
        Function2 function29;
        Function2 function210;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-1975409271);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputChip)N(selected,onClick,label,modifier,enabled,leadingIcon,avatar,trailingIcon,shape,colors,elevation,border,interactionSource)1137@56542L592:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function26 = function23;
                } else {
                    function26 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function27 = function24;
                } else {
                    function27 = function24;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(shape)) {
                        i21 = 67108864;
                        i4 |= i21;
                    }
                    i21 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i21;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0 && startRestartGroup.changed(selectableChipColors)) {
                        i20 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i20;
                    }
                    i20 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i20;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i19 = 4;
                        i9 = i2 | i19;
                    }
                    i19 = 2;
                    i9 = i2 | i19;
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(borderStroke)) {
                        i18 = 32;
                        i9 |= i18;
                    }
                    i18 = 16;
                    i9 |= i18;
                }
                int i23 = i9;
                i10 = i3 & 4096;
                if (i10 != 0) {
                    i11 = i10;
                    i12 = i23 | 384;
                } else {
                    int i24 = i23;
                    if ((i2 & 384) == 0) {
                        i24 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    }
                    i11 = i10;
                    i12 = i24;
                }
                i13 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i13 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1110@55409L5,1111@55469L17,1112@55548L20,1113@55616L34");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        int i25 = (i3 & 256) != 0 ? i13 & (-234881025) : i13;
                        if ((i3 & 512) != 0) {
                            i25 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i12 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i12 &= -113;
                        }
                        i17 = i25;
                        i15 = 6;
                        modifier4 = modifier;
                        z4 = z2;
                        shape4 = shape;
                        selectableChipColors4 = selectableChipColors;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke4 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function29 = function25;
                        function210 = function27;
                    } else {
                        Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z6 = i5 != 0 ? true : z2;
                        Function2 function211 = i6 != 0 ? null : function25;
                        Function2 function212 = i7 != 0 ? null : function26;
                        Function2 function213 = i8 != 0 ? null : function27;
                        if ((i3 & 256) != 0) {
                            i14 = i13 & (-234881025);
                            shape3 = InputChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape3 = shape;
                            i14 = i13;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            selectableChipColors3 = InputChipDefaults.INSTANCE.inputChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors3 = selectableChipColors;
                        }
                        int i26 = i14;
                        if ((i3 & 1024) != 0) {
                            modifier3 = companion;
                            i15 = 6;
                            i16 = i11;
                            selectableChipElevation3 = InputChipDefaults.INSTANCE.m3372inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            composer3 = startRestartGroup;
                            i12 &= -15;
                        } else {
                            modifier3 = companion;
                            i15 = 6;
                            composer3 = startRestartGroup;
                            i16 = i11;
                            selectableChipElevation3 = selectableChipElevation;
                        }
                        if ((i3 & 2048) != 0) {
                            startRestartGroup = composer3;
                            borderStroke3 = InputChipDefaults.INSTANCE.m3370inputChipBorder_7El2pE(z6, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i26 >> 12) & 14) | 100663296 | ((i26 << 3) & 112), 252);
                            i12 &= -113;
                        } else {
                            startRestartGroup = composer3;
                            borderStroke3 = borderStroke;
                        }
                        modifier4 = modifier3;
                        if (i16 != 0) {
                            selectableChipElevation4 = selectableChipElevation3;
                            borderStroke4 = borderStroke3;
                            z4 = z6;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation4 = selectableChipElevation3;
                            borderStroke4 = borderStroke3;
                            z4 = z6;
                        }
                        function29 = function211;
                        function26 = function212;
                        function210 = function213;
                        shape4 = shape3;
                        selectableChipColors4 = selectableChipColors3;
                        i17 = i26;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1975409271, i17, i12, "androidx.compose.material3.InputChip (Chip.kt:1115)");
                    }
                    if (function26 != null) {
                        startRestartGroup.startReplaceGroup(225163883);
                        ComposerKt.sourceInformation(startRestartGroup, "1121@56058L5,1123@56111L420");
                        final float disabledAvatarOpacity = z4 ? 1.0f : InputChipTokens.INSTANCE.getDisabledAvatarOpacity();
                        final Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), startRestartGroup, i15);
                        z5 = true;
                        ComposableLambdaKt.rememberComposableLambda(-570452295, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit InputChip$lambda$2;
                                InputChip$lambda$2 = ChipKt.InputChip$lambda$2(disabledAvatarOpacity, value, function26, (Composer) obj, ((Integer) obj2).intValue());
                                return InputChip$lambda$2;
                            }
                        }, startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        z5 = true;
                        startRestartGroup.startReplaceGroup(225761625);
                        startRestartGroup.endReplaceGroup();
                    }
                    InputChipDefaults inputChipDefaults = InputChipDefaults.INSTANCE;
                    boolean z7 = function26 != null ? z5 : false;
                    boolean z8 = function29 != null ? z5 : false;
                    if (function210 == null) {
                        z5 = false;
                    }
                    Function2 function214 = function26;
                    InputChip(z, function0, function2, modifier4, z4, function29, function214, function210, shape4, selectableChipColors4, selectableChipElevation4, borderStroke4, null, inputChipDefaults.contentPadding(z7, z8, z5), mutableInteractionSource3, startRestartGroup, i17 & 2147483646, (i12 & 126) | ((i12 << 6) & 57344), 4096);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    z3 = z4;
                    function25 = function29;
                    function26 = function214;
                    function28 = function210;
                    shape2 = shape4;
                    selectableChipColors2 = selectableChipColors4;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z2;
                    selectableChipElevation2 = selectableChipElevation;
                    borderStroke2 = borderStroke;
                    mutableInteractionSource2 = mutableInteractionSource;
                    composer2 = startRestartGroup;
                    function28 = function27;
                    shape2 = shape;
                    selectableChipColors2 = selectableChipColors;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit InputChip$lambda$3;
                            InputChip$lambda$3 = ChipKt.InputChip$lambda$3(z, function0, function2, modifier2, z3, function25, function26, function28, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return InputChip$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i232 = i9;
            i10 = i3 & 4096;
            if (i10 != 0) {
            }
            i13 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i13 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2322 = i9;
        i10 = i3 & 4096;
        if (i10 != 0) {
        }
        i13 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputChip$lambda$2(final float f, final Shape shape, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1126@56212L180,1124@56129L388:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570452295, i, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:1124)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1551161805, "CC(remember):Chip.kt#9igjgp");
            boolean changed = composer.changed(f) | composer.changed(shape);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit InputChip$lambda$2$0$0;
                        InputChip$lambda$2$0$0 = ChipKt.InputChip$lambda$2$0$0(f, shape, (GraphicsLayerScope) obj);
                        return InputChip$lambda$2$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1351092324, "C1133@56491L8:Chip.kt#uh7d8r");
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
    public static final Unit InputChip$lambda$2$0$0(float f, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z3;
        final Arrangement.Horizontal horizontal2;
        final ChipElevation chipElevation3;
        final Shape shape3;
        final Modifier modifier3;
        final ChipColors chipColors3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i14;
        ChipColors chipColors4;
        Modifier modifier4;
        int i15;
        int i16;
        ChipElevation chipElevation4;
        boolean z4;
        BorderStroke borderStroke3;
        Arrangement.Horizontal horizontal3;
        int i17;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        Arrangement.Horizontal horizontal4;
        int i18;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        ChipElevation chipElevation5;
        Modifier modifier5;
        Shape shape4;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(1651051734);
        ComposerKt.sourceInformation(startRestartGroup, "C(SuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)1228@61095L5,1223@60923L587:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
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
                    i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        chipColors2 = chipColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(chipColors2)) ? 1048576 : 524288;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i21 = 8388608;
                                i4 |= i21;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i21 = 4194304;
                        i4 |= i21;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(borderStroke)) {
                            i20 = 67108864;
                            i4 |= i20;
                        }
                        i20 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i20;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(horizontal)) {
                            i19 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i19;
                        }
                        i19 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i19;
                    }
                    i7 = i3 & 1024;
                    if (i7 == 0) {
                        i9 = i2 | 6;
                        i8 = i7;
                    } else if ((i2 & 6) == 0) {
                        i8 = i7;
                        i9 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                    } else {
                        i8 = i7;
                        i9 = i2;
                    }
                    i10 = i3 & 2048;
                    if (i10 == 0) {
                        i9 |= 48;
                        i11 = i10;
                    } else if ((i2 & 48) == 0) {
                        i11 = i10;
                        i9 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    } else {
                        i11 = i10;
                    }
                    i12 = i9;
                    i13 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i13 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1215@60440L5,1216@60495L22,1217@60574L25,1218@60652L29");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            i18 = (i3 & 32) != 0 ? i13 & (-458753) : i13;
                            if ((i3 & 64) != 0) {
                                i18 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i18 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i18 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i18 &= -1879048193;
                            }
                            function24 = function22;
                            borderStroke4 = borderStroke;
                            horizontal4 = horizontal;
                            paddingValues3 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i15 = 6;
                            shape4 = shape2;
                            chipElevation5 = chipElevation2;
                            z4 = z2;
                            i16 = i12;
                            modifier5 = modifier2;
                        } else {
                            Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i5 == 0 ? z2 : true;
                            Function2<? super Composer, ? super Integer, Unit> function25 = i6 != 0 ? null : function22;
                            if ((i3 & 32) != 0) {
                                shape2 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i14 = i13 & (-458753);
                            } else {
                                i14 = i13;
                            }
                            Shape shape5 = shape2;
                            if ((i3 & 64) != 0) {
                                i14 &= -3670017;
                                chipColors4 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(startRestartGroup, 6);
                            } else {
                                chipColors4 = chipColors2;
                            }
                            int i23 = i14;
                            if ((i3 & 128) != 0) {
                                modifier4 = companion;
                                i16 = i12;
                                i15 = 6;
                                i23 &= -29360129;
                                chipElevation4 = SuggestionChipDefaults.INSTANCE.m4104suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                modifier4 = companion;
                                i15 = 6;
                                i16 = i12;
                                chipElevation4 = chipElevation2;
                            }
                            if ((i3 & 256) != 0) {
                                z4 = z5;
                                borderStroke3 = SuggestionChipDefaults.INSTANCE.m4102suggestionChipBorderh1eTWw(z4, 0L, 0L, 0.0f, startRestartGroup, ((i23 >> 9) & 14) | 24576, 14);
                                i23 &= -234881025;
                            } else {
                                z4 = z5;
                                borderStroke3 = borderStroke;
                            }
                            if ((i3 & 512) != 0) {
                                horizontal3 = SuggestionChipDefaults.INSTANCE.horizontalArrangement();
                                i17 = i23 & (-1879048193);
                            } else {
                                horizontal3 = horizontal;
                                i17 = i23;
                            }
                            PaddingValues contentPadding = i8 != 0 ? SuggestionChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if (i11 != 0) {
                                borderStroke4 = borderStroke3;
                                horizontal4 = horizontal3;
                                i18 = i17;
                                paddingValues3 = contentPadding;
                                chipElevation5 = chipElevation4;
                                mutableInteractionSource3 = null;
                                chipColors2 = chipColors4;
                                modifier5 = modifier4;
                                function24 = function25;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke4 = borderStroke3;
                                horizontal4 = horizontal3;
                                i18 = i17;
                                paddingValues3 = contentPadding;
                                function24 = function25;
                                chipElevation5 = chipElevation4;
                                chipColors2 = chipColors4;
                                modifier5 = modifier4;
                            }
                            shape4 = shape5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1651051734, i18, i16, "androidx.compose.material3.SuggestionChip (Chip.kt:1223)");
                        }
                        int i24 = i18 << 6;
                        int i25 = ((i18 >> 6) & 14) | 12582912 | ((i18 << 3) & 112) | ((i18 >> 3) & 896) | (i24 & 7168) | (i24 & 3670016);
                        int i26 = i18 << 9;
                        int i27 = i25 | (234881024 & i26) | (i26 & 1879048192);
                        int i28 = i18 >> 21;
                        int i29 = i16 << 12;
                        boolean z6 = z4;
                        ChipColors chipColors5 = chipColors2;
                        m2708ChipEosBjUw(modifier5, function0, z6, function2, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i15), chipColors2.m2688labelColorvNxB06k$material3(z4), function24, null, shape4, chipColors5, chipElevation5, borderStroke4, SuggestionChipDefaults.INSTANCE.m4097getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, i27, ((i18 >> 18) & 7168) | (i28 & 112) | (i28 & 14) | 384 | (57344 & i29) | (i29 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z3 = z6;
                        function23 = function24;
                        shape3 = shape4;
                        chipColors3 = chipColors5;
                        chipElevation3 = chipElevation5;
                        borderStroke2 = borderStroke4;
                        horizontal2 = horizontal4;
                        paddingValues2 = paddingValues3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        horizontal2 = horizontal;
                        chipElevation3 = chipElevation2;
                        shape3 = shape2;
                        modifier3 = modifier2;
                        chipColors3 = chipColors2;
                        function23 = function22;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SuggestionChip$lambda$0;
                                SuggestionChip$lambda$0 = ChipKt.SuggestionChip$lambda$0(Function0.this, function2, modifier3, z3, function23, shape3, chipColors3, chipElevation3, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SuggestionChip$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i7 = i3 & 1024;
                if (i7 == 0) {
                }
                i10 = i3 & 2048;
                if (i10 == 0) {
                }
                i12 = i9;
                i13 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i13 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
            }
            i10 = i3 & 2048;
            if (i10 == 0) {
            }
            i12 = i9;
            i13 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i13 & 1)) {
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
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i10 = i3 & 2048;
        if (i10 == 0) {
        }
        i12 = i9;
        i13 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i6;
        int i7;
        int i8;
        final boolean z3;
        final Function2 function24;
        Composer composer2;
        final Shape shape3;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Shape shape4;
        ChipColors chipColors4;
        boolean z4;
        BorderStroke borderStroke3;
        int i10;
        BorderStroke borderStroke4;
        boolean z5;
        ChipElevation chipElevation4;
        ChipColors chipColors5;
        Function2 function25;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-252243183);
        ComposerKt.sourceInformation(startRestartGroup, "C(SuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,interactionSource)1297@64597L443:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i16 = 131072;
                                i3 |= i16;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i16 = 65536;
                        i3 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i15 = 1048576;
                                i3 |= i15;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i15 = 524288;
                        i3 |= i15;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i14 = 8388608;
                                i3 |= i14;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i14 = 4194304;
                        i3 |= i14;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(borderStroke)) {
                            i13 = 67108864;
                            i3 |= i13;
                        }
                        i13 = GroupFlagsKt.HasAuxSlotFlag;
                        i3 |= i13;
                    }
                    i6 = i2 & 512;
                    if (i6 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i8 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "1291@64289L5,1292@64344L22,1293@64423L25,1294@64501L29");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i12 = (i2 & 32) != 0 ? i8 & (-458753) : i8;
                                if ((i2 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                borderStroke4 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z5 = z2;
                                function25 = function23;
                                shape4 = shape2;
                                chipColors5 = chipColors2;
                                chipElevation4 = chipElevation2;
                                i11 = -252243183;
                                modifier3 = modifier2;
                            } else {
                                Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i4 == 0 ? z2 : true;
                                Function2 function26 = i5 != 0 ? null : function23;
                                if ((i2 & 32) != 0) {
                                    i9 = i8 & (-458753);
                                    shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i9 = i8;
                                    shape4 = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                    chipColors4 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors4 = chipColors2;
                                }
                                int i18 = i9;
                                if ((i2 & 128) != 0) {
                                    i18 &= -29360129;
                                    chipElevation2 = SuggestionChipDefaults.INSTANCE.m4104suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                }
                                if ((i2 & 256) != 0) {
                                    z4 = z6;
                                    borderStroke3 = SuggestionChipDefaults.INSTANCE.m4102suggestionChipBorderh1eTWw(z4, 0L, 0L, 0.0f, startRestartGroup, ((i18 >> 9) & 14) | 24576, 14);
                                    i10 = i18 & (-234881025);
                                } else {
                                    z4 = z6;
                                    borderStroke3 = borderStroke;
                                    i10 = i18;
                                }
                                borderStroke4 = borderStroke3;
                                z5 = z4;
                                chipElevation4 = chipElevation2;
                                chipColors5 = chipColors4;
                                if (i7 != 0) {
                                    function25 = function26;
                                    i11 = -252243183;
                                    modifier3 = companion;
                                    i12 = i10;
                                    mutableInteractionSource3 = null;
                                } else {
                                    function25 = function26;
                                    i11 = -252243183;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = companion;
                                    i12 = i10;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i11, i12, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:1297)");
                            }
                            SuggestionChip(function0, function2, modifier3, z5, function25, shape4, chipColors5, chipElevation4, borderStroke4, SuggestionChipDefaults.INSTANCE.horizontalArrangement(), SuggestionChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, 268435454 & i12, ((i12 >> 24) & 112) | 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            z3 = z5;
                            function24 = function25;
                            shape3 = shape4;
                            chipColors3 = chipColors5;
                            chipElevation3 = chipElevation4;
                            borderStroke2 = borderStroke4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z2;
                            function24 = function23;
                            composer2 = startRestartGroup;
                            shape3 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda32
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SuggestionChip$lambda$1;
                                    SuggestionChip$lambda$1 = ChipKt.SuggestionChip$lambda$1(Function0.this, function2, modifier2, z3, function24, shape3, chipColors3, chipElevation3, borderStroke2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return SuggestionChip$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    i8 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i6 = i2 & 512;
                if (i6 == 0) {
                }
                i7 = i6;
                i8 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & 512;
            if (i6 == 0) {
            }
            i7 = i6;
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0310  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v33, types: [androidx.compose.foundation.BorderStroke] */
    /* JADX WARN: Type inference failed for: r4v34 */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final boolean z3;
        final Function2 function24;
        final Shape shape3;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final ChipBorder chipBorder2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Shape shape4;
        ChipColors chipColors4;
        int i11;
        Composer composer3;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape5;
        ChipColors chipColors5;
        BorderStroke borderStroke;
        int i12;
        ChipElevation chipElevation4;
        boolean z4;
        Function2 function25;
        State<BorderStroke> borderStroke$material3;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(270460261);
        ComposerKt.sourceInformation(startRestartGroup, "C(SuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,interactionSource)1381@68593L5,1376@68421L585:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i16 = 131072;
                                i3 |= i16;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i16 = 65536;
                        i3 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i15 = 1048576;
                                i3 |= i15;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i15 = 524288;
                        i3 |= i15;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i14 = 8388608;
                                i3 |= i14;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i14 = 4194304;
                        i3 |= i14;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(chipBorder)) {
                            i13 = 67108864;
                            i3 |= i13;
                        }
                        i13 = GroupFlagsKt.HasAuxSlotFlag;
                        i3 |= i13;
                    }
                    i7 = i2 & 512;
                    if (i7 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "1370@68088L5,1371@68143L22,1372@68222L25,1373@68298L22,1374@68372L39");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i9 &= -234881025;
                                }
                                chipBorder3 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function25 = function23;
                                shape5 = shape2;
                                chipColors5 = chipColors2;
                                borderStroke = 0;
                                i11 = 6;
                                chipElevation4 = chipElevation2;
                                i12 = i9;
                                z4 = z2;
                            } else {
                                Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? z2 : true;
                                Function2 function26 = i5 != 0 ? null : function23;
                                if ((i2 & 32) != 0) {
                                    i10 = i9 & (-458753);
                                    shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i10 = i9;
                                    shape4 = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                    chipColors4 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors4 = chipColors2;
                                }
                                int i18 = i10;
                                if ((i2 & 128) != 0) {
                                    composer3 = startRestartGroup;
                                    i18 &= -29360129;
                                    i11 = 6;
                                    chipElevation2 = SuggestionChipDefaults.INSTANCE.m4104suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                                } else {
                                    i11 = 6;
                                    composer3 = startRestartGroup;
                                }
                                if ((i2 & 256) != 0) {
                                    startRestartGroup = composer3;
                                    chipBorder3 = SuggestionChipDefaults.INSTANCE.m4101suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, 3072, 7);
                                    i18 &= -234881025;
                                } else {
                                    startRestartGroup = composer3;
                                    chipBorder3 = chipBorder;
                                }
                                if (i8 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2080677748, "CC(remember):Chip.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    modifier2 = companion;
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier2 = companion;
                                }
                                shape5 = shape4;
                                chipColors5 = chipColors4;
                                borderStroke = 0;
                                i12 = i18;
                                chipElevation4 = chipElevation2;
                                z4 = z5;
                                function25 = function26;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(270460261, i12, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:1376)");
                            }
                            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i11);
                            long m2688labelColorvNxB06k$material3 = chipColors5.m2688labelColorvNxB06k$material3(z4);
                            if (chipBorder3 == null) {
                                startRestartGroup.startReplaceGroup(-76066809);
                                startRestartGroup.endReplaceGroup();
                                borderStroke$material3 = borderStroke;
                            } else {
                                startRestartGroup.startReplaceGroup(-2080663750);
                                ComposerKt.sourceInformation(startRestartGroup, "1388@68810L21");
                                borderStroke$material3 = chipBorder3.borderStroke$material3(z4, startRestartGroup, ((i12 >> 9) & 14) | ((i12 >> 21) & 112));
                                startRestartGroup.endReplaceGroup();
                            }
                            if (borderStroke$material3 != null) {
                                borderStroke = borderStroke$material3.getValue();
                            }
                            int i19 = i12 << 6;
                            int i20 = ((i12 >> 6) & 14) | i6 | ((i12 << 3) & 112) | ((i12 >> 3) & 896) | (i19 & 7168) | (i19 & 3670016);
                            int i21 = i12 << 9;
                            ChipColors chipColors6 = chipColors5;
                            composer2 = startRestartGroup;
                            Modifier modifier3 = modifier2;
                            m2708ChipEosBjUw(modifier3, function0, z4, function2, value, m2688labelColorvNxB06k$material3, function25, null, shape5, chipColors6, chipElevation4, borderStroke, SuggestionChipDefaults.INSTANCE.m4097getHeightD9Ej5fM(), null, SuggestionChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, composer2, i20 | (234881024 & i21) | (i21 & 1879048192), ((i12 >> 21) & 14) | 24960 | ((i12 >> 12) & 458752), 8192);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder2 = chipBorder3;
                            modifier2 = modifier3;
                            z3 = z4;
                            function24 = function25;
                            shape3 = shape5;
                            chipColors3 = chipColors6;
                            chipElevation3 = chipElevation4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z3 = z2;
                            function24 = function23;
                            shape3 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            chipBorder2 = chipBorder;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SuggestionChip$lambda$3;
                                    SuggestionChip$lambda$3 = ChipKt.SuggestionChip$lambda$3(Function0.this, function2, modifier2, z3, function24, shape3, chipColors3, chipElevation3, chipBorder2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return SuggestionChip$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & 512;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z3;
        final Arrangement.Horizontal horizontal2;
        final ChipElevation chipElevation3;
        final Shape shape3;
        final Modifier modifier3;
        final ChipColors chipColors3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Shape shape4;
        ChipColors chipColors4;
        Modifier modifier4;
        int i17;
        int i18;
        ChipElevation chipElevation4;
        Arrangement.Horizontal horizontal3;
        int i19;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation5;
        BorderStroke borderStroke3;
        Arrangement.Horizontal horizontal4;
        int i20;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(-729726304);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedSuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,horizontalArrangement,contentPadding,interactionSource)1461@72910L5,1456@72738L587:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i23 = i3 & 4;
        if (i23 != 0) {
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
                    i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        chipColors2 = chipColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(chipColors2)) ? 1048576 : 524288;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i22 = 8388608;
                                i4 |= i22;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i22 = 4194304;
                        i4 |= i22;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i & 805306368) != 0) {
                        i8 = i7;
                        if ((i3 & 512) == 0 && startRestartGroup.changed(horizontal)) {
                            i21 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i21;
                        }
                        i21 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i21;
                    } else {
                        i8 = i7;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i11 = i2 | 6;
                        i10 = i9;
                    } else if ((i2 & 6) == 0) {
                        i10 = i9;
                        i11 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                    } else {
                        i10 = i9;
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                        i13 = i12;
                    } else if ((i2 & 48) == 0) {
                        i13 = i12;
                        i11 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    } else {
                        i13 = i12;
                    }
                    i14 = i11;
                    i15 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i15 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1448@72287L5,1449@72342L30,1450@72429L33");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            i20 = (i3 & 32) != 0 ? i15 & (-458753) : i15;
                            if ((i3 & 64) != 0) {
                                i20 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i20 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i20 &= -1879048193;
                            }
                            function24 = function22;
                            borderStroke3 = borderStroke;
                            horizontal4 = horizontal;
                            paddingValues3 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i17 = 6;
                            shape4 = shape2;
                            chipElevation5 = chipElevation2;
                            i18 = i14;
                            modifier5 = modifier2;
                        } else {
                            Modifier.Companion companion = i23 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? z2 : true;
                            Function2<? super Composer, ? super Integer, Unit> function25 = i6 != 0 ? null : function22;
                            if ((i3 & 32) != 0) {
                                shape2 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i16 = i15 & (-458753);
                            } else {
                                i16 = i15;
                            }
                            shape4 = shape2;
                            if ((i3 & 64) != 0) {
                                i16 &= -3670017;
                                chipColors4 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(startRestartGroup, 6);
                            } else {
                                chipColors4 = chipColors2;
                            }
                            int i24 = i16;
                            if ((i3 & 128) != 0) {
                                modifier4 = companion;
                                i18 = i14;
                                i17 = 6;
                                chipElevation4 = SuggestionChipDefaults.INSTANCE.m4096elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i24 &= -29360129;
                            } else {
                                modifier4 = companion;
                                i17 = 6;
                                i18 = i14;
                                chipElevation4 = chipElevation2;
                            }
                            BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke;
                            if ((i3 & 512) != 0) {
                                horizontal3 = SuggestionChipDefaults.INSTANCE.horizontalArrangement();
                                i19 = i24 & (-1879048193);
                            } else {
                                horizontal3 = horizontal;
                                i19 = i24;
                            }
                            PaddingValues contentPadding = i10 != 0 ? SuggestionChipDefaults.INSTANCE.getContentPadding() : paddingValues;
                            modifier5 = modifier4;
                            if (i13 != 0) {
                                chipElevation5 = chipElevation4;
                                borderStroke3 = borderStroke4;
                                horizontal4 = horizontal3;
                                i20 = i19;
                                paddingValues3 = contentPadding;
                                function24 = function25;
                                z2 = z4;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                chipElevation5 = chipElevation4;
                                borderStroke3 = borderStroke4;
                                horizontal4 = horizontal3;
                                i20 = i19;
                                paddingValues3 = contentPadding;
                                function24 = function25;
                                z2 = z4;
                            }
                            chipColors2 = chipColors4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-729726304, i20, i18, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:1456)");
                        }
                        int i25 = i20 << 6;
                        int i26 = ((i20 >> 6) & 14) | 12582912 | ((i20 << 3) & 112) | ((i20 >> 3) & 896) | (i25 & 7168) | (i25 & 3670016);
                        int i27 = i20 << 9;
                        int i28 = i26 | (234881024 & i27) | (i27 & 1879048192);
                        int i29 = i20 >> 21;
                        int i30 = i18 << 12;
                        ChipColors chipColors5 = chipColors2;
                        boolean z5 = z2;
                        m2708ChipEosBjUw(modifier5, function0, z5, function2, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i17), chipColors2.m2688labelColorvNxB06k$material3(z2), function24, null, shape4, chipColors5, chipElevation5, borderStroke3, SuggestionChipDefaults.INSTANCE.m4097getHeightD9Ej5fM(), horizontal4, paddingValues3, mutableInteractionSource3, startRestartGroup, i28, ((i20 >> 18) & 7168) | (i29 & 112) | (i29 & 14) | 384 | (57344 & i30) | (i30 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z3 = z5;
                        function23 = function24;
                        shape3 = shape4;
                        chipColors3 = chipColors5;
                        chipElevation3 = chipElevation5;
                        borderStroke2 = borderStroke3;
                        horizontal2 = horizontal4;
                        paddingValues2 = paddingValues3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        paddingValues2 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        horizontal2 = horizontal;
                        chipElevation3 = chipElevation2;
                        shape3 = shape2;
                        modifier3 = modifier2;
                        chipColors3 = chipColors2;
                        function23 = function22;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ElevatedSuggestionChip$lambda$0;
                                ElevatedSuggestionChip$lambda$0 = ChipKt.ElevatedSuggestionChip$lambda$0(Function0.this, function2, modifier3, z3, function23, shape3, chipColors3, chipElevation3, borderStroke2, horizontal2, paddingValues2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ElevatedSuggestionChip$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                if ((i & 805306368) != 0) {
                }
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                i14 = i11;
                i15 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            if ((i & 805306368) != 0) {
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            i14 = i11;
            i15 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i15 & 1)) {
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
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i14 = i11;
        i15 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final boolean z3;
        final Function2 function24;
        Composer composer2;
        final Shape shape3;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Shape shape4;
        ChipColors chipColors4;
        BorderStroke borderStroke3;
        boolean z4;
        ChipColors chipColors5;
        Function2 function25;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation4;
        Modifier modifier3;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-894435833);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedSuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,interactionSource)1529@76357L451:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i16 = 131072;
                                i3 |= i16;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i16 = 65536;
                        i3 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i15 = 1048576;
                                i3 |= i15;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i15 = 524288;
                        i3 |= i15;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i14 = 8388608;
                                i3 |= i14;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i14 = 4194304;
                        i3 |= i14;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                        i7 = i17;
                    } else {
                        i7 = i17;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(borderStroke) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i8 = i2 & 512;
                    if (i8 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "1523@76081L5,1524@76136L30,1525@76223L33");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i13 = (i2 & 32) != 0 ? i10 & (-458753) : i10;
                                if ((i2 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i13 &= -29360129;
                                }
                                borderStroke3 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z4 = z2;
                                function25 = function23;
                                shape4 = shape2;
                                chipColors5 = chipColors2;
                                chipElevation4 = chipElevation2;
                                i12 = -894435833;
                                modifier3 = modifier2;
                            } else {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? z2 : true;
                                Function2 function26 = i5 != 0 ? null : function23;
                                if ((i2 & 32) != 0) {
                                    i11 = i10 & (-458753);
                                    shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i11 = i10;
                                    shape4 = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    i11 &= -3670017;
                                    chipColors4 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors4 = chipColors2;
                                }
                                int i18 = i11;
                                if ((i2 & 128) != 0) {
                                    chipElevation2 = SuggestionChipDefaults.INSTANCE.m4096elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    i18 &= -29360129;
                                }
                                borderStroke3 = i6 != 0 ? null : borderStroke;
                                z4 = z5;
                                chipColors5 = chipColors4;
                                if (i9 != 0) {
                                    function25 = function26;
                                    i12 = -894435833;
                                    chipElevation4 = chipElevation2;
                                    mutableInteractionSource3 = null;
                                } else {
                                    function25 = function26;
                                    i12 = -894435833;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipElevation4 = chipElevation2;
                                }
                                modifier3 = companion;
                                i13 = i18;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i13, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:1529)");
                            }
                            ElevatedSuggestionChip(function0, function2, modifier3, z4, function25, shape4, chipColors5, chipElevation4, borderStroke3, SuggestionChipDefaults.INSTANCE.horizontalArrangement(), SuggestionChipDefaults.INSTANCE.getContentPadding(), mutableInteractionSource3, startRestartGroup, 268435454 & i13, ((i13 >> 24) & 112) | 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            z3 = z4;
                            function24 = function25;
                            shape3 = shape4;
                            chipColors3 = chipColors5;
                            chipElevation3 = chipElevation4;
                            borderStroke2 = borderStroke3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z2;
                            function24 = function23;
                            composer2 = startRestartGroup;
                            shape3 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ElevatedSuggestionChip$lambda$1;
                                    ElevatedSuggestionChip$lambda$1 = ChipKt.ElevatedSuggestionChip$lambda$1(Function0.this, function2, modifier2, z3, function24, shape3, chipColors3, chipElevation3, borderStroke2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ElevatedSuggestionChip$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i10 & 1)) {
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final boolean z3;
        final Function2 function24;
        Composer composer2;
        final Shape shape3;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final ChipBorder chipBorder2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i12;
        Shape shape4;
        ChipColors chipColors4;
        int i13;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource3;
        Function2 function25;
        Shape shape5;
        State<BorderStroke> state;
        int i14;
        ChipElevation chipElevation4;
        boolean z4;
        State<BorderStroke> borderStroke$material3;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(1306662363);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedSuggestionChip)N(onClick,label,modifier,enabled,icon,shape,colors,elevation,border,interactionSource)1612@80329L5,1607@80157L585:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i18 = i2 & 4;
        if (i18 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i17 = 131072;
                                i3 |= i17;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i17 = 65536;
                        i3 |= i17;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i16 = 1048576;
                                i3 |= i16;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i16 = 524288;
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i15 = 8388608;
                                i3 |= i15;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i15 = 4194304;
                        i3 |= i15;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i18;
                        i3 |= startRestartGroup.changed(chipBorder) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i9 = i2 & 512;
                        if (i9 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i11 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "1601@79849L5,1602@79904L30,1603@79991L33,1605@80108L39");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i11 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i11 &= -29360129;
                                    }
                                    chipBorder3 = chipBorder;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    companion = modifier2;
                                    function25 = function23;
                                    shape5 = shape2;
                                    state = null;
                                    i13 = 6;
                                    chipElevation4 = chipElevation2;
                                    i14 = i11;
                                    z4 = z2;
                                } else {
                                    companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    Function2 function26 = i5 != 0 ? null : function23;
                                    if ((i2 & 32) != 0) {
                                        i12 = i11 & (-458753);
                                        shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i12 = i11;
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i12 &= -3670017;
                                        chipColors4 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(startRestartGroup, 6);
                                    } else {
                                        chipColors4 = chipColors2;
                                    }
                                    int i19 = i12;
                                    if ((i2 & 128) != 0) {
                                        i19 &= -29360129;
                                        i13 = 6;
                                        chipElevation2 = SuggestionChipDefaults.INSTANCE.m4096elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    } else {
                                        i13 = 6;
                                    }
                                    chipBorder3 = i7 != 0 ? null : chipBorder;
                                    if (i10 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1572096354, "CC(remember):Chip.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    function25 = function26;
                                    shape5 = shape4;
                                    chipColors2 = chipColors4;
                                    state = null;
                                    i14 = i19;
                                    chipElevation4 = chipElevation2;
                                    z4 = z5;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1306662363, i14, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:1607)");
                                }
                                TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13);
                                long m2688labelColorvNxB06k$material3 = chipColors2.m2688labelColorvNxB06k$material3(z4);
                                float m4097getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m4097getHeightD9Ej5fM();
                                PaddingValues contentPadding = SuggestionChipDefaults.INSTANCE.getContentPadding();
                                if (chipBorder3 == null) {
                                    startRestartGroup.startReplaceGroup(1490893745);
                                    startRestartGroup.endReplaceGroup();
                                    borderStroke$material3 = state;
                                } else {
                                    startRestartGroup.startReplaceGroup(1572114000);
                                    ComposerKt.sourceInformation(startRestartGroup, "1621@80660L21");
                                    borderStroke$material3 = chipBorder3.borderStroke$material3(z4, startRestartGroup, ((i14 >> 9) & 14) | ((i14 >> 21) & 112));
                                    startRestartGroup.endReplaceGroup();
                                }
                                BorderStroke value2 = borderStroke$material3 != null ? borderStroke$material3.getValue() : state;
                                int i20 = i14 << 6;
                                int i21 = ((i14 >> 6) & 14) | i6 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016);
                                int i22 = i14 << 9;
                                ChipColors chipColors5 = chipColors2;
                                Modifier modifier3 = companion;
                                m2708ChipEosBjUw(modifier3, function0, z4, function2, value, m2688labelColorvNxB06k$material3, function25, null, shape5, chipColors5, chipElevation4, value2, m4097getHeightD9Ej5fM, null, contentPadding, mutableInteractionSource3, startRestartGroup, i21 | (234881024 & i22) | (i22 & 1879048192), ((i14 >> 21) & 14) | 24960 | ((i14 >> 12) & 458752), 8192);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                chipBorder2 = chipBorder3;
                                composer2 = startRestartGroup;
                                modifier2 = modifier3;
                                z3 = z4;
                                function24 = function25;
                                shape3 = shape5;
                                chipColors3 = chipColors5;
                                chipElevation3 = chipElevation4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                function24 = function23;
                                composer2 = startRestartGroup;
                                shape3 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevation2;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ElevatedSuggestionChip$lambda$3;
                                        ElevatedSuggestionChip$lambda$3 = ChipKt.ElevatedSuggestionChip$lambda$3(Function0.this, function2, modifier2, z3, function24, shape3, chipColors3, chipElevation3, chipBorder2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return ElevatedSuggestionChip$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i18;
                    i9 = i2 & 512;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function23 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i18;
                i9 = i2 & 512;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i18;
            i9 = i2 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
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
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i18;
        i9 = i2 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* renamed from: Chip-EosBjUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2708ChipEosBjUw(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, Arrangement.Horizontal horizontal, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        Arrangement.Horizontal horizontal2;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource2;
        State<Dp> shadowElevation$material3;
        Composer startRestartGroup = composer.startRestartGroup(1954811544);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)N(modifier,onClick,enabled,label,labelTextStyle,labelColor:c#ui.graphics.Color,leadingIcon,trailingIcon,shape,colors,elevation,border,minHeight:c#ui.unit.Dp,horizontalArrangement,paddingValues,interactionSource)2717@134611L22,2724@134908L537,2715@134537L908:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function24 = function2;
            i4 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(chipColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(chipElevation) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        int i8 = i5;
        int i9 = i3 & 8192;
        if (i9 != 0) {
            i6 = i8 | 3072;
        } else {
            i6 = i8;
            if ((i2 & 3072) == 0) {
                i6 |= startRestartGroup.changed(horizontal) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                }
                i7 = i6;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (74899 & i7) != 74898, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    horizontal2 = horizontal;
                } else {
                    final Arrangement.Horizontal m869spacedByD5KLDUw = i9 != 0 ? Arrangement.INSTANCE.m869spacedByD5KLDUw(HorizontalElementsPadding, Alignment.INSTANCE.getCenterHorizontally()) : horizontal;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1954811544, i4, i7, "androidx.compose.material3.Chip (Chip.kt:2712)");
                    }
                    if (mutableInteractionSource == null) {
                        startRestartGroup.startReplaceGroup(329822563);
                        ComposerKt.sourceInformation(startRestartGroup, "2714@134493L39");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1673207423, "CC(remember):Chip.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                    } else {
                        startRestartGroup.startReplaceGroup(1673206772);
                        startRestartGroup.endReplaceGroup();
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1673211182, "CC(remember):Chip.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Chip_EosBjUw$lambda$1$0;
                                Chip_EosBjUw$lambda$1$0 = ChipKt.Chip_EosBjUw$lambda$1$0((SemanticsPropertyReceiver) obj);
                                return Chip_EosBjUw$lambda$1$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i10 = i4;
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue2, 1, null);
                    long m2678containerColorvNxB06k$material3 = chipColors.m2678containerColorvNxB06k$material3(z);
                    if (chipElevation == null) {
                        startRestartGroup.startReplaceGroup(330097470);
                        startRestartGroup.endReplaceGroup();
                        shadowElevation$material3 = null;
                    } else {
                        startRestartGroup.startReplaceGroup(1673216291);
                        ComposerKt.sourceInformation(startRestartGroup, "2721@134770L43");
                        shadowElevation$material3 = chipElevation.shadowElevation$material3(z, mutableInteractionSource2, startRestartGroup, ((i10 >> 6) & 14) | ((i7 << 6) & 896));
                        startRestartGroup.endReplaceGroup();
                    }
                    composer2 = startRestartGroup;
                    final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
                    horizontal2 = m869spacedByD5KLDUw;
                    SurfaceKt.m4115Surfaceo_FOJdg(function0, semantics$default, z, shape, m2678containerColorvNxB06k$material3, 0L, 0.0f, shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1333593699, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Chip_EosBjUw$lambda$2;
                            Chip_EosBjUw$lambda$2 = ChipKt.Chip_EosBjUw$lambda$2(Function2.this, textStyle, j, function22, function23, chipColors, z, f, m869spacedByD5KLDUw, paddingValues, (Composer) obj, ((Integer) obj2).intValue());
                            return Chip_EosBjUw$lambda$2;
                        }
                    }, composer2, 54), composer2, ((i10 >> 15) & 7168) | ((i10 >> 3) & 14) | (i10 & 896) | ((i7 << 21) & 234881024), 6, 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    final Arrangement.Horizontal horizontal3 = horizontal2;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Chip_EosBjUw$lambda$3;
                            Chip_EosBjUw$lambda$3 = ChipKt.Chip_EosBjUw$lambda$3(Modifier.this, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, horizontal3, paddingValues, mutableInteractionSource, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return Chip_EosBjUw$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i7 = i6;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (74899 & i7) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip_EosBjUw$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip_EosBjUw$lambda$2(Function2 function2, TextStyle textStyle, long j, Function2 function22, Function2 function23, ChipColors chipColors, boolean z, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2725@134918L521:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1333593699, i, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:2725)");
            }
            m2709ChipContentCmOm80E(function2, textStyle, j, function22, null, function23, chipColors.m2689leadingIconContentColorvNxB06k$material3(z), chipColors.m2690trailingIconContentColorvNxB06k$material3(z), f, horizontal, paddingValues, composer, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e4  */
    /* renamed from: SelectableChip-9rhh4-4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2710SelectableChip9rhh44(final boolean z, final Modifier modifier, final Function0<Unit> function0, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, Arrangement.Horizontal horizontal, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        final Arrangement.Horizontal horizontal2;
        ChipArrangement chipArrangement;
        Arrangement.Horizontal horizontal3;
        MutableInteractionSource mutableInteractionSource2;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(400616238);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectableChip)N(selected,modifier,onClick,enabled,label,labelTextStyle,leadingIcon,avatar,trailingIcon,shape,colors,elevation,border,minHeight:c#ui.unit.Dp,horizontalArrangement,paddingValues,interactionSource)2766@136328L24,2773@136637L729,2763@136225L1141:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i6 = 8192;
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(shape) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(selectableChipColors) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16384) == 0 && startRestartGroup.changed(horizontal)) {
                i6 = 16384;
            }
            i5 |= i6;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 599187) == 599186) ? false : true, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 16384) != 0) {
                    i5 &= -57345;
                }
            } else if ((i3 & 16384) != 0) {
                chipArrangement = new ChipArrangement(HorizontalElementsPadding, null);
                i5 &= -57345;
                int i7 = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    horizontal3 = chipArrangement;
                } else {
                    horizontal3 = chipArrangement;
                    ComposerKt.traceEventStart(400616238, i4, i7, "androidx.compose.material3.SelectableChip (Chip.kt:2760)");
                }
                if (mutableInteractionSource != null) {
                    startRestartGroup.startReplaceGroup(-955061811);
                    ComposerKt.sourceInformation(startRestartGroup, "2762@136181L39");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1554829099, "CC(remember):Chip.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                } else {
                    startRestartGroup.startReplaceGroup(-1554829750);
                    startRestartGroup.endReplaceGroup();
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1554824410, "CC(remember):Chip.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SelectableChip_9rhh4_4$lambda$1$0;
                            SelectableChip_9rhh4_4$lambda$1$0 = ChipKt.SelectableChip_9rhh4_4$lambda$1$0((SemanticsPropertyReceiver) obj);
                            return SelectableChip_9rhh4_4$lambda$1$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i8 = i4;
                State<Dp> state = null;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null);
                long m3921containerColorWaAFU9c$material3 = selectableChipColors.m3921containerColorWaAFU9c$material3(z2, z);
                if (selectableChipElevation != null) {
                    startRestartGroup.startReplaceGroup(-954746232);
                } else {
                    startRestartGroup.startReplaceGroup(-1554818919);
                    ComposerKt.sourceInformation(startRestartGroup, "2770@136499L43");
                    state = selectableChipElevation.shadowElevation$material3(z2, mutableInteractionSource2, startRestartGroup, ((i8 >> 9) & 14) | ((i7 << 3) & 896));
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                final Arrangement.Horizontal horizontal4 = horizontal3;
                SurfaceKt.m4113Surfaced85dljk(z, function0, semantics$default, z2, shape, m3921containerColorWaAFU9c$material3, 0L, 0.0f, state == null ? state.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1320468520, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SelectableChip_9rhh4_4$lambda$2;
                        SelectableChip_9rhh4_4$lambda$2 = ChipKt.SelectableChip_9rhh4_4$lambda$2(SelectableChipColors.this, z2, z, function2, textStyle, function22, function23, function24, f, horizontal4, paddingValues, (Composer) obj, ((Integer) obj2).intValue());
                        return SelectableChip_9rhh4_4$lambda$2;
                    }
                }, composer2, 54), composer2, (i8 & 14) | ((i8 >> 3) & 112) | (i8 & 7168) | ((i8 >> 15) & 57344) | ((i7 << 21) & 1879048192), 48, 192);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal4;
            }
            chipArrangement = horizontal;
            int i72 = i5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (mutableInteractionSource != null) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1554824410, "CC(remember):Chip.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i82 = i4;
            State<Dp> state2 = null;
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null);
            long m3921containerColorWaAFU9c$material32 = selectableChipColors.m3921containerColorWaAFU9c$material3(z2, z);
            if (selectableChipElevation != null) {
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            final Arrangement.Horizontal horizontal42 = horizontal3;
            SurfaceKt.m4113Surfaced85dljk(z, function0, semantics$default2, z2, shape, m3921containerColorWaAFU9c$material32, 0L, 0.0f, state2 == null ? state2.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1320468520, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectableChip_9rhh4_4$lambda$2;
                    SelectableChip_9rhh4_4$lambda$2 = ChipKt.SelectableChip_9rhh4_4$lambda$2(SelectableChipColors.this, z2, z, function2, textStyle, function22, function23, function24, f, horizontal42, paddingValues, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectableChip_9rhh4_4$lambda$2;
                }
            }, composer2, 54), composer2, (i82 & 14) | ((i82 >> 3) & 112) | (i82 & 7168) | ((i82 >> 15) & 57344) | ((i72 << 21) & 1879048192), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontal2 = horizontal42;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            horizontal2 = horizontal;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectableChip_9rhh4_4$lambda$3;
                    SelectableChip_9rhh4_4$lambda$3 = ChipKt.SelectableChip_9rhh4_4$lambda$3(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, horizontal2, paddingValues, mutableInteractionSource, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectableChip_9rhh4_4$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectableChip_9rhh4_4$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectableChip_9rhh4_4$lambda$2(SelectableChipColors selectableChipColors, boolean z, boolean z2, Function2 function2, TextStyle textStyle, Function2 function22, Function2 function23, Function2 function24, float f, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2776@136782L578:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1320468520, i, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2776)");
            }
            m2707AnimatingChipContentCmOm80E(function2, textStyle, selectableChipColors.m3923labelColorWaAFU9c$material3(z, z2), function22, function23, function24, selectableChipColors.m3924leadingIconContentColorWaAFU9c$material3(z, z2), selectableChipColors.m3925trailingIconContentColorWaAFU9c$material3(z, z2), f, horizontal, paddingValues, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: ChipContent-CmOm80E, reason: not valid java name */
    private static final void m2709ChipContentCmOm80E(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j2, final long j3, final float f, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        long j5;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(897958272);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChipContent)N(label,labelTextStyle,labelColor:c#ui.graphics.Color,leadingIcon,avatar,trailingIcon,leadingIconColor:c#ui.graphics.Color,trailingIconColor:c#ui.graphics.Color,minHeight:c#ui.unit.Dp,horizontalArrangement,paddingValues)2815@138144L1793,2812@138017L1920:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j4 = j;
            i3 |= startRestartGroup.changed(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            function26 = function23;
            i3 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i) == 0) {
            function27 = function24;
            i3 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((1572864 & i) == 0) {
            j5 = j2;
            i3 |= startRestartGroup.changed(j5) ? 1048576 : 524288;
        } else {
            j5 = j2;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(horizontal) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897958272, i3, i4, "androidx.compose.material3.ChipContent (Chip.kt:2811)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final long j6 = j5;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(100316352, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChipContent_CmOm80E$lambda$0;
                    ChipContent_CmOm80E$lambda$0 = ChipKt.ChipContent_CmOm80E$lambda$0(f, paddingValues, horizontal, function29, function28, function210, j6, function2, j3, (Composer) obj, ((Integer) obj2).intValue());
                    return ChipContent_CmOm80E$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j7 = j4;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChipContent_CmOm80E$lambda$1;
                    ChipContent_CmOm80E$lambda$1 = ChipKt.ChipContent_CmOm80E$lambda$1(Function2.this, textStyle, j7, function22, function23, function24, j2, j3, f, horizontal, paddingValues, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ChipContent_CmOm80E$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipContent_CmOm80E$lambda$0(float f, PaddingValues paddingValues, Arrangement.Horizontal horizontal, Function2 function2, Function2 function22, Function2 function23, long j, Function2 function24, long j2, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        ComposerKt.sourceInformation(composer, "C2816@138154L1777:Chip.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(100316352, i, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2816)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1256defaultMinSizeVpY3zN4$default(IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max), 0.0f, f, 1, null), paddingValues);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1939916356, "C2838@139102L248:Chip.kt#uh7d8r");
            if (function2 == null && function22 == null) {
                composer.startReplaceGroup(1940381975);
                ComposerKt.sourceInformation(composer, "2836@139028L39");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(0)), composer, 6);
                composer.endReplaceGroup();
                str = "C101@5233L9:Row.kt#2w3rfo";
                str2 = "C72@3469L9:Box.kt#2w3rfo";
                str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
            } else {
                composer.startReplaceGroup(1939929592);
                ComposerKt.sourceInformation(composer, "2825@138560L422");
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1511373941, "C2829@138743L53:Chip.kt#uh7d8r");
                str = "C101@5233L9:Row.kt#2w3rfo";
                str2 = "C72@3469L9:Box.kt#2w3rfo";
                str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                Function2<Composer, Integer, Unit> m2711leadingContentXOJAsU = m2711leadingContentXOJAsU(function2, function22, j, composer, 0);
                if (m2711leadingContentXOJAsU != null) {
                    composer.startReplaceGroup(1511530583);
                    ComposerKt.sourceInformation(composer, "2831@138887L16");
                    m2711leadingContentXOJAsU.invoke(composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1511607463);
                    composer.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, centerVertically2, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
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
            Updater.m5872setimpl(m5864constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, str);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -272428636, "C2842@139322L7:Chip.kt#uh7d8r");
            function24.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function23 != null) {
                composer.startReplaceGroup(1940776698);
                ComposerKt.sourceInformation(composer, "2845@139415L388");
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, str3);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion2);
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
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, str2);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1684613618, "C2848@139567L48:Chip.kt#uh7d8r");
                Function2<Composer, Integer, Unit> m2712trailingContentRPmYEkk = m2712trailingContentRPmYEkk(function23, j2, composer, 0);
                if (m2712trailingContentRPmYEkk != null) {
                    composer.startReplaceGroup(-1684490611);
                    ComposerKt.sourceInformation(composer, "2850@139707L17");
                    m2712trailingContentRPmYEkk.invoke(composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1684412770);
                    composer.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1941196407);
                ComposerKt.sourceInformation(composer, "2855@139849L39");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(0)), composer, 6);
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

    /* renamed from: AnimatingChipContent-CmOm80E, reason: not valid java name */
    private static final void m2707AnimatingChipContentCmOm80E(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j2, final long j3, final float f, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        long j5;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1205090718);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatingChipContent)N(label,labelTextStyle,labelColor:c#ui.graphics.Color,leadingIcon,avatar,trailingIcon,leadingIconColor:c#ui.graphics.Color,trailingIconColor:c#ui.graphics.Color,minHeight:c#ui.unit.Dp,horizontalArrangement,paddingValues)2883@140638L3527,2880@140511L3654:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j4 = j;
            i3 |= startRestartGroup.changed(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            function26 = function23;
            i3 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i) == 0) {
            function27 = function24;
            i3 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((1572864 & i) == 0) {
            j5 = j2;
            i3 |= startRestartGroup.changed(j5) ? 1048576 : 524288;
        } else {
            j5 = j2;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(horizontal) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1205090718, i3, i4, "androidx.compose.material3.AnimatingChipContent (Chip.kt:2879)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final long j6 = j5;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(-218858718, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnimatingChipContent_CmOm80E$lambda$0;
                    AnimatingChipContent_CmOm80E$lambda$0 = ChipKt.AnimatingChipContent_CmOm80E$lambda$0(f, paddingValues, horizontal, function29, function28, j6, function2, function210, j3, (Composer) obj, ((Integer) obj2).intValue());
                    return AnimatingChipContent_CmOm80E$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j7 = j4;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnimatingChipContent_CmOm80E$lambda$1;
                    AnimatingChipContent_CmOm80E$lambda$1 = ChipKt.AnimatingChipContent_CmOm80E$lambda$1(Function2.this, textStyle, j7, function22, function23, function24, j2, j3, f, horizontal, paddingValues, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AnimatingChipContent_CmOm80E$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatingChipContent_CmOm80E$lambda$0(float f, PaddingValues paddingValues, Arrangement.Horizontal horizontal, final Function2 function2, final Function2 function22, final long j, Function2 function23, final Function2 function24, final long j2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2884@140699L14,2885@140774L14,2886@140848L16,2887@140927L16,2889@140953L3206:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-218858718, i, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous> (Chip.kt:2884)");
            }
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
            FiniteAnimationSpec value4 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            Modifier padding = PaddingKt.padding(SizeKt.m1256defaultMinSizeVpY3zN4$default(SizeKt.m1278widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, maxChipWidth, 1, null), 0.0f, f, 1, null), paddingValues);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -668900088, "C2897@141297L1290,2924@142605L262,2931@142885L1249:Chip.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, 472906009, "C2910@141991L427,2898@141332L1086:Chip.kt#uh7d8r");
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, (function2 == null && function22 == null) ? false : true, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(value3, Alignment.INSTANCE.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(value, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(value4, Alignment.INSTANCE.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-2026128796, true, new Function3() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AnimatingChipContent_CmOm80E$lambda$0$0$0$0;
                    AnimatingChipContent_CmOm80E$lambda$0$0$0$0 = ChipKt.AnimatingChipContent_CmOm80E$lambda$0$0$0$0(Function2.this, function22, j, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AnimatingChipContent_CmOm80E$lambda$0$0$0$0;
                }
            }, composer, 54), composer, 1572870, 18);
            if (function2 == null && function22 == null) {
                composer.startReplaceGroup(474019807);
                ComposerKt.sourceInformation(composer, "2920@142508L39");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(0)), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(474103414);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, centerVertically2, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight);
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
            Updater.m5872setimpl(m5864constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1637231986, "C2928@142839L7:Chip.kt#uh7d8r");
            function23.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion2);
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
            Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1403326069, "C2944@143558L424,2932@142920L1062:Chip.kt#uh7d8r");
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, function24 != null, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(value3, Alignment.INSTANCE.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(value, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(value4, Alignment.INSTANCE.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1461553051, true, new Function3() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit AnimatingChipContent_CmOm80E$lambda$0$0$2$0;
                    AnimatingChipContent_CmOm80E$lambda$0$0$2$0 = ChipKt.AnimatingChipContent_CmOm80E$lambda$0$0$2$0(Function2.this, j2, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return AnimatingChipContent_CmOm80E$lambda$0$0$2$0;
                }
            }, composer, 54), composer, 1572870, 18);
            if (function24 == null) {
                composer.startReplaceGroup(-1402251672);
                ComposerKt.sourceInformation(composer, "2954@144055L39");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(0)), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1402168065);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit AnimatingChipContent_CmOm80E$lambda$0$0$0$0(Function2 function2, Function2 function22, long j, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2913@142148L53,2912@142079L152,2915@142256L140:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026128796, i, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Chip.kt:2911)");
        }
        State rememberRetainedState = rememberRetainedState(m2711leadingContentXOJAsU(function2, function22, j, composer, 0), composer, 0);
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
        ComposerKt.sourceInformationMarkerStart(composer, -1708356274, "C:Chip.kt#uh7d8r");
        Function2 function23 = (Function2) rememberRetainedState.getValue();
        if (function23 == null) {
            composer.startReplaceGroup(-1708322641);
        } else {
            composer.startReplaceGroup(-55107182);
            ComposerKt.sourceInformation(composer, "2916@142362L8");
            function23.invoke(composer, 0);
        }
        composer.endReplaceGroup();
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
    public static final Unit AnimatingChipContent_CmOm80E$lambda$0$0$2$0(Function2 function2, long j, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2947@143716L48,2946@143647L147,2949@143819L141:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1461553051, i, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Chip.kt:2945)");
        }
        State rememberRetainedState = rememberRetainedState(m2712trailingContentRPmYEkk(function2, j, composer, 0), composer, 0);
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
        ComposerKt.sourceInformationMarkerStart(composer, -1624155562, "C:Chip.kt#uh7d8r");
        Function2 function22 = (Function2) rememberRetainedState.getValue();
        if (function22 == null) {
            composer.startReplaceGroup(-1624120968);
        } else {
            composer.startReplaceGroup(-52390999);
            ComposerKt.sourceInformation(composer, "2950@143926L8");
            function22.invoke(composer, 0);
        }
        composer.endReplaceGroup();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: leadingContent-XO-JAsU, reason: not valid java name */
    private static final Function2<Composer, Integer, Unit> m2711leadingContentXOJAsU(Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final long j, Composer composer, int i) {
        Function2 function23;
        ComposerKt.sourceInformationMarkerStart(composer, 1330309098, "C(leadingContent)N(avatar,leadingIcon,leadingIconColor:c#ui.graphics.Color):Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330309098, i, -1, "androidx.compose.material3.leadingContent (Chip.kt:2972)");
        }
        if (function2 != null) {
            composer.startReplaceGroup(-1473204624);
            composer.endReplaceGroup();
            function23 = function2;
        } else if (function22 != null) {
            composer.startReplaceGroup(1575370973);
            ComposerKt.sourceInformation(composer, "2975@144622L183");
            Function2 rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-237350650, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit leadingContent_XO_JAsU$lambda$0;
                    leadingContent_XO_JAsU$lambda$0 = ChipKt.leadingContent_XO_JAsU$lambda$0(j, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return leadingContent_XO_JAsU$lambda$0;
                }
            }, composer, 54);
            composer.endReplaceGroup();
            function23 = rememberComposableLambda;
        } else {
            composer.startReplaceGroup(1575598419);
            composer.endReplaceGroup();
            function23 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit leadingContent_XO_JAsU$lambda$0(long j, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2976@144640L151:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237350650, i, -1, "androidx.compose.material3.leadingContent.<anonymous> (Chip.kt:2976)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: trailingContent-RPmYEkk, reason: not valid java name */
    private static final Function2<Composer, Integer, Unit> m2712trailingContentRPmYEkk(final Function2<? super Composer, ? super Integer, Unit> function2, final long j, Composer composer, int i) {
        ComposableLambda composableLambda;
        ComposerKt.sourceInformationMarkerStart(composer, -165980551, "C(trailingContent)N(trailingIcon,trailingIconColor:c#ui.graphics.Color):Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-165980551, i, -1, "androidx.compose.material3.trailingContent (Chip.kt:2991)");
        }
        if (function2 != null) {
            composer.startReplaceGroup(-1219075416);
            ComposerKt.sourceInformation(composer, "2992@145142L165");
            composableLambda = ComposableLambdaKt.rememberComposableLambda(-566924201, true, new Function2() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit trailingContent_RPmYEkk$lambda$0;
                    trailingContent_RPmYEkk$lambda$0 = ChipKt.trailingContent_RPmYEkk$lambda$0(j, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return trailingContent_RPmYEkk$lambda$0;
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1218883371);
            composer.endReplaceGroup();
            composableLambda = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return composableLambda;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trailingContent_RPmYEkk$lambda$0(long j, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2993@145156L141:Chip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566924201, i, -1, "androidx.compose.material3.trailingContent.<anonymous> (Chip.kt:2993)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final <T> State<T> rememberRetainedState(T t, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -618198444, "C(rememberRetainedState)N(targetValue)3009@145662L40:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618198444, i, -1, "androidx.compose.material3.rememberRetainedState (Chip.kt:3008)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1383215108, "CC(remember):Chip.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (t != null) {
            mutableState.setValue(t);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableState;
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached = colorScheme.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        ChipColors chipColors = new ChipColors(Color.INSTANCE.m6821getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.INSTANCE.m6822getUnspecified0d7_KjU(), Color.INSTANCE.m6821getTransparent0d7_KjU(), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), SuggestionChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m6822getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3(chipColors);
        return chipColors;
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl((z || !z2) ? 4 : 8), 0.0f, Dp.m9732constructorimpl(z3 ? 8 : 4), 0.0f, 10, null);
    }
}
