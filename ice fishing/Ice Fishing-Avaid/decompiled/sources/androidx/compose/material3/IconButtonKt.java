package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001ab\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0011\u001a`\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0014\u001aX\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u0016\u001af\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001c\u001ap\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001d\u001an\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001ap\u0010 \u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u001d\u001ab\u0010!\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\"\u001a`\u0010!\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0014\u001ap\u0010#\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010$\u001an\u0010#\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001ab\u0010%\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\"\u001a`\u0010%\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0014\u001ap\u0010&\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010$\u001an\u0010&\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001an\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010*\u001al\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010+\u001a|\u0010,\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010-\u001az\u0010,\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u001b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010.\u001ab\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u00100\u001ab\u0010/\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u00101\u001ap\u00102\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u00103\u001ap\u00102\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u00104\u001a\u001d\u00105\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u00106\u001a%\u00105\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u00107\u001a+\u0010<\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0003¢\u0006\u0002\u0010A\u001a3\u0010<\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0003¢\u0006\u0002\u0010B\"\u0018\u00108\u001a\u00020\u0007*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0018\u0010:\u001a\u00020\u0007*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u00109\"\u0018\u00108\u001a\u00020\u0007*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010;\"\u0018\u0010:\u001a\u00020\u0007*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006C²\u0006\n\u0010=\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"IconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "shapes", "Landroidx/compose/material3/IconButtonShapes;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/IconButtonShapes;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconButtonImpl", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "IconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/IconToggleButtonShapes;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/IconToggleButtonShapes;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButtonImpl", "FilledIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "OutlinedIconButton", "border", "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/IconButtonShapes;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/IconToggleButtonShapes;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SurfaceIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonShapes;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SurfaceIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonShapes;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "shapeForInteraction", "(Landroidx/compose/material3/IconButtonShapes;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "(ZLandroidx/compose/material3/IconToggleButtonShapes;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "isCornerBasedShape", "(Landroidx/compose/material3/IconButtonShapes;)Z", "isStatic", "(Landroidx/compose/material3/IconToggleButtonShapes;)Z", "shapeByInteraction", "pressed", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "(Landroidx/compose/material3/IconButtonShapes;ZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/material3/IconToggleButtonShapes;ZZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconButton((Function0<Unit>) function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconButton$lambda$1(Function0 function0, IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconButton((Function0<Unit>) function0, iconButtonShapes, modifier, z, iconButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$1(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$3(boolean z, Function1 function1, IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, iconToggleButtonShapes, modifier, z2, iconToggleButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconButton((Function0<Unit>) function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconButton$lambda$1(Function0 function0, IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconButton((Function0<Unit>) function0, iconButtonShapes, modifier, z, iconButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$1(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$3(boolean z, Function1 function1, IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, iconToggleButtonShapes, modifier, z2, iconToggleButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButton$lambda$0(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButton$lambda$1(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconButton((Function0<Unit>) function0, modifier, z, iconButtonColors, mutableInteractionSource, shape, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButton$lambda$3(Function0 function0, IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconButton((Function0<Unit>) function0, iconButtonShapes, modifier, z, iconButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonImpl$lambda$2(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        IconButtonImpl(modifier, function0, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButton$lambda$0(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButton$lambda$1(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButton$lambda$3(boolean z, Function1 function1, IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, (Function1<? super Boolean, Unit>) function1, iconToggleButtonShapes, modifier, z2, iconToggleButtonColors, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButtonImpl$lambda$2(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButtonImpl(z, function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconButton$lambda$0(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconButton((Function0<Unit>) function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconButton$lambda$1(Function0 function0, IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconButton((Function0<Unit>) function0, iconButtonShapes, modifier, z, iconButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$1(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$3(boolean z, Function1 function1, IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, iconToggleButtonShapes, modifier, z2, iconToggleButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$2(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconButton((Function0<Unit>) function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$4(Function0 function0, Modifier modifier, boolean z, IconButtonShapes iconButtonShapes, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconButton((Function0<Unit>) function0, modifier, z, iconButtonShapes, iconButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$2(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$4(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonShapes iconToggleButtonShapes, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, iconToggleButtonShapes, iconToggleButtonColors, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0045  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with `shape`", replaceWith = @ReplaceWith(expression = "IconButton(onClick, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconButton(final Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        IconButtonColors iconButtonColors5;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2096213317);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)N(onClick,modifier,enabled,colors,interactionSource,content)106@4693L13,100@4559L171:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 2048;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "96@4437L18");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier4 = modifier2;
                            iconButtonColors5 = iconButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z4 = z2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 8) != 0) {
                                iconButtonColors4 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                iconButtonColors4 = iconButtonColors2;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                modifier4 = companion;
                                iconButtonColors5 = iconButtonColors4;
                            } else {
                                modifier4 = companion;
                                iconButtonColors5 = iconButtonColors4;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            z4 = z5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2096213317, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:99)");
                        }
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        IconButton((Function0<Unit>) function0, modifier4, z4, iconButtonColors5, mutableInteractionSource5, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), (Function2<? super Composer, ? super Integer, Unit>) function2, startRestartGroup, (65534 & i3) | ((i3 << 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors5;
                        mutableInteractionSource3 = mutableInteractionSource5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconButton$lambda$0;
                                IconButton$lambda$0 = IconButtonKt.IconButton$lambda$0(Function0.this, modifier3, z3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
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
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
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
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(final Function0<Unit> function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1413012038);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)N(onClick,modifier,enabled,colors,interactionSource,shape,content)164@7265L226:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i6 = 131072;
                                i3 |= i6;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i6 = 65536;
                        i3 |= i6;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "159@7090L18,161@7205L13");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                modifier4 = companion;
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                            } else {
                                modifier4 = companion;
                            }
                        }
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        boolean z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                        }
                        int i9 = i3 << 3;
                        composer2 = startRestartGroup;
                        IconButtonImpl(modifier4, function0, z4, shape2, iconButtonColors4, mutableInteractionSource4, function2, composer2, ((i3 >> 3) & 14) | (i9 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i9) | (i9 & 458752) | (i3 & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    final Shape shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconButton$lambda$1;
                                IconButton$lambda$1 = IconButtonKt.IconButton$lambda$1(Function0.this, modifier3, z3, iconButtonColors3, mutableInteractionSource3, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                final Shape shape32 = shape2;
                endRestartGroup = composer2.endRestartGroup();
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
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            final Shape shape322 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
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
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        final Shape shape3222 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(final Function0<Unit> function0, final IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        IconButtonColors iconButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-83878734);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)N(onClick,shapes,modifier,enabled,colors,interactionSource,content)222@9978L46,218@9874L256:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(iconButtonShapes) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "212@9631L18");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            z4 = z2;
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = modifier2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                            } else {
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-83878734, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:215)");
                        }
                        if (mutableInteractionSource4 == null) {
                            startRestartGroup.startReplaceGroup(839983817);
                            ComposerKt.sourceInformation(startRestartGroup, "217@9830L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 996927577, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup.startReplaceGroup(996926926);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource5 = mutableInteractionSource4;
                        }
                        int i8 = i3 >> 3;
                        composer2 = startRestartGroup;
                        IconButtonImpl(modifier4, function0, z4, shapeForInteraction(iconButtonShapes, mutableInteractionSource5, startRestartGroup, i8 & 14), iconButtonColors4, mutableInteractionSource5, function2, composer2, (i8 & 896) | ((i3 >> 6) & 14) | ((i3 << 3) & 112) | (57344 & i3) | (i3 & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconButton$lambda$3;
                                IconButton$lambda$3 = IconButtonKt.IconButton$lambda$3(Function0.this, iconButtonShapes, modifier3, z3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconButton$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
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
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void IconButtonImpl(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Shape shape, final IconButtonColors iconButtonColors, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1134296466);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButtonImpl)N(modifier,onClick,enabled,shape,colors,interactionSource,content)241@10509L779:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134296466, i2, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:238)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(976976045);
                ComposerKt.sourceInformation(startRestartGroup, "240@10465L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 862799349, "CC(remember):IconButton.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(862798698);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            int i3 = i2;
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m395clickableO2vRcR0$default(BackgroundKt.m352backgroundbw27NRU(ClipKt.clip(SizeKt.m1272size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), IconButtonDefaults.m3298smallContainerSizeNwlBFI$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape), iconButtonColors.m3287containerColorvNxB06k$material3(z), shape), mutableInteractionSource2, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z, null, Role.m8874boximpl(Role.INSTANCE.m8881getButtono7Vup1c()), function0, 8, null), null, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, childSemantics$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -414233073, "C259@11198L84:IconButton.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(iconButtonColors.m3288contentColorvNxB06k$material3(z))), function2, startRestartGroup, ProvidedValue.$stable | ((i3 >> 15) & 112));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IconButtonImpl$lambda$2;
                    IconButtonImpl$lambda$2 = IconButtonKt.IconButtonImpl$lambda$2(Modifier.this, function0, z, shape, iconButtonColors, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return IconButtonImpl$lambda$2;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0057  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with `shape`", replaceWith = @ReplaceWith(expression = "IconToggleButton(checked, onCheckedChange, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconToggleButton(final boolean z, final Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1307193856);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,content)318@13895L13,311@13730L202:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "307@13602L24");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                modifier4 = companion;
                                mutableInteractionSource4 = null;
                                z5 = z3;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1307193856, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:310)");
                                }
                                composer2 = startRestartGroup;
                                IconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier4, z5, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), (Function2<? super Composer, ? super Integer, Unit>) function2, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z4 = z5;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        IconToggleButton(z, (Function1<? super Boolean, Unit>) function1, modifier4, z5, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), (Function2<? super Composer, ? super Integer, Unit>) function2, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconToggleButton$lambda$0;
                                IconToggleButton$lambda$0 = IconButtonKt.IconToggleButton$lambda$0(z, function1, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconToggleButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        IconToggleButtonColors iconToggleButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        Modifier modifier4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1031402037);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,shape,content)365@16244L275:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        shape2 = shape;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "360@16063L24,362@16184L13");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape4 = shape2;
                            i6 = -1031402037;
                            modifier4 = modifier2;
                            z5 = z3;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                shape4 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                                z5 = z3;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier4 = companion;
                            } else {
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                                modifier4 = companion;
                                z5 = z3;
                            }
                            i6 = -1031402037;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:365)");
                        }
                        composer2 = startRestartGroup;
                        IconToggleButtonImpl(z, function1, modifier4, z5, iconToggleButtonColors4, mutableInteractionSource4, shape4, function2, composer2, i3 & 33554430, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        shape3 = shape4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape3 = shape2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconToggleButton$lambda$1;
                                IconToggleButton$lambda$1 = IconButtonKt.IconToggleButton$lambda$1(z, function1, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource3, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconToggleButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1238810601);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)N(checked,onCheckedChange,shapes,modifier,enabled,colors,interactionSource,content)425@19180L55,420@19016L325:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(iconToggleButtonShapes) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) != 0) {
                        function22 = function2;
                        i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    } else {
                        function22 = function2;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "414@18760L31");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonVibrantColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        int i8 = i3;
                        Modifier modifier4 = modifier2;
                        boolean z5 = z3;
                        IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1238810601, i8, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:417)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(-1246910542);
                            ComposerKt.sourceInformation(startRestartGroup, "419@18972L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 791061072, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(791060421);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        int i9 = i8 >> 3;
                        IconToggleButtonImpl(z, function1, modifier4, z5, iconToggleButtonColors4, mutableInteractionSource3, shapeForInteraction(z, iconToggleButtonShapes, mutableInteractionSource3, startRestartGroup, (i8 & 14) | (i9 & 112)), function22, startRestartGroup, (i9 & 57344) | (i8 & 126) | (i9 & 896) | (i9 & 7168) | (i8 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                    }
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconToggleButton$lambda$3;
                                IconToggleButton$lambda$3 = IconButtonKt.IconToggleButton$lambda$3(z, function1, iconToggleButtonShapes, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource4, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconToggleButton$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IconToggleButtonImpl(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1724745099);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButtonImpl)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,shape,content)451@20113L32,445@19882L814:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        shape2 = shape;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "438@19573L31,440@19701L13");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            boolean z5 = z3;
                            modifier4 = modifier2;
                            z4 = z5;
                            i6 = i3;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonVibrantColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i6 = i3 & (-3670017);
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                            } else {
                                i6 = i3;
                            }
                            z4 = z3;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1724745099, i6, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:442)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(1187952688);
                            ComposerKt.sourceInformation(startRestartGroup, "444@19838L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -377320942, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup.startReplaceGroup(-377321593);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        int i10 = ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 896);
                        Modifier m1549toggleableO2vRcR0 = ToggleableKt.m1549toggleableO2vRcR0(BackgroundKt.m353backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1272size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier4), IconButtonDefaults.m3298smallContainerSizeNwlBFI$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape2), iconToggleButtonColors2.containerColor$material3(z4, z, startRestartGroup, i10).getValue().m6796unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z4, Role.m8874boximpl(Role.INSTANCE.m8883getCheckboxo7Vup1c()), function1);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1549toggleableO2vRcR0);
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
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 190782627, "C462@20561L30,463@20606L84:IconButton.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(iconToggleButtonColors2.contentColor$material3(z4, z, startRestartGroup, i10).getValue().m6796unboximpl())), function2, startRestartGroup, ProvidedValue.$stable | ((i6 >> 18) & 112));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                    }
                    final IconToggleButtonColors iconToggleButtonColors3 = iconToggleButtonColors2;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final Shape shape3 = shape2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconToggleButtonImpl$lambda$2;
                                IconToggleButtonImpl$lambda$2 = IconButtonKt.IconToggleButtonImpl$lambda$2(z, function1, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource4, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconToggleButtonImpl$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                final IconToggleButtonColors iconToggleButtonColors32 = iconToggleButtonColors2;
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                final Shape shape32 = shape2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            final IconToggleButtonColors iconToggleButtonColors322 = iconToggleButtonColors2;
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            final Shape shape322 = shape2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        final IconToggleButtonColors iconToggleButtonColors3222 = iconToggleButtonColors2;
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        final Shape shape3222 = shape2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(947208840);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconButton)N(onClick,modifier,enabled,shape,colors,interactionSource,content)507@22845L252:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "502@22654L11,503@22717L24");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            z4 = z2;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                shape4 = shape2;
                            } else {
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:507)");
                        }
                        int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i10 = i3 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, shape4, iconButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        iconButtonColors3 = iconButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledIconButton$lambda$0;
                                FilledIconButton$lambda$0 = IconButtonKt.FilledIconButton$lambda$0(Function0.this, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledIconButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(final Function0<Unit> function0, final IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1970685840);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconButton)N(onClick,shapes,modifier,enabled,colors,interactionSource,content)559@25345L254:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(iconButtonShapes) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "555@25217L24");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                modifier4 = companion;
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                IconButtonColors iconButtonColors4 = iconButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1970685840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:559)");
                                }
                                int i8 = i3 >> 3;
                                int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i8 & 112) | (i8 & 896) | ((i3 << 6) & 7168) | (57344 & i3);
                                int i10 = i3 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                iconButtonColors3 = iconButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        z4 = z2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        IconButtonColors iconButtonColors42 = iconButtonColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        int i92 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i82 & 112) | (i82 & 896) | ((i3 << 6) & 7168) | (57344 & i3);
                        int i102 = i3 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors42, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i92 | (3670016 & i102) | (i102 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors42;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledIconButton$lambda$1;
                                FilledIconButton$lambda$1 = IconButtonKt.FilledIconButton$lambda$1(Function0.this, iconButtonShapes, modifier3, z3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledIconButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
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
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i7;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Object rememberedValue;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-713829427);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,interactionSource,content)615@28049L24,612@27916L336:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "607@27713L11,608@27782L30");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i11 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 32) != 0) {
                                i11 &= -458753;
                            }
                            i7 = i11;
                            companion = modifier2;
                        } else {
                            companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i6 & (-57345);
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if ((i2 & 32) != 0) {
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(startRestartGroup, 6);
                                i7 &= -458753;
                            }
                            if (i5 != 0) {
                                shape4 = shape2;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-713829427, i7, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:612)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1204704933, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FilledIconToggleButton$lambda$0$0;
                                            FilledIconToggleButton$lambda$0$0 = IconButtonKt.FilledIconToggleButton$lambda$0$0((SemanticsPropertyReceiver) obj);
                                            return FilledIconToggleButton$lambda$0$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i12 = i7 << 3;
                                composer2 = startRestartGroup;
                                boolean z5 = z3;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, shape4, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i12) | (i12 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                z4 = z5;
                                shape3 = shape4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        }
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape4 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1204704933, "CC(remember):IconButton.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i122 = i7 << 3;
                        composer2 = startRestartGroup;
                        boolean z52 = z3;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z52, shape4, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i122) | (i122 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        z4 = z52;
                        shape3 = shape4;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledIconToggleButton$lambda$1;
                                FilledIconToggleButton$lambda$1 = IconButtonKt.FilledIconToggleButton$lambda$1(z, function1, modifier3, z4, shape3, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledIconToggleButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors4;
        int i7;
        MutableInteractionSource mutableInteractionSource4;
        Object rememberedValue;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1351677401);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconToggleButton)N(checked,onCheckedChange,shapes,modifier,enabled,colors,interactionSource,content)671@30814L24,668@30681L338:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(iconToggleButtonShapes) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "664@30547L30");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i7 = i6 & (-458753);
                                companion = modifier2;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                z5 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1881842529, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i10 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                                int i11 = i7 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i10 | (29360128 & i11) | (i11 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = companion;
                                z4 = z5;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                companion = modifier2;
                            }
                        } else {
                            companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 32) != 0) {
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(startRestartGroup, 6);
                                i6 &= -458753;
                            }
                            if (i5 != 0) {
                                z5 = z3;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                i7 = i6;
                                mutableInteractionSource4 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1351677401, i7, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:668)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1881842529, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda33
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FilledIconToggleButton$lambda$2$0;
                                            FilledIconToggleButton$lambda$2$0 = IconButtonKt.FilledIconToggleButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                            return FilledIconToggleButton$lambda$2$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i102 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                                int i112 = i7 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i102 | (29360128 & i112) | (i112 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                z4 = z5;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        }
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        i7 = i6;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1881842529, "CC(remember):IconButton.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i1022 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                        int i1122 = i7 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i1022 | (29360128 & i1122) | (i1122 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        z4 = z5;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledIconToggleButton$lambda$3;
                                FilledIconToggleButton$lambda$3 = IconButtonKt.FilledIconToggleButton$lambda$3(z, function1, iconToggleButtonShapes, modifier2, z4, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledIconToggleButton$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-399178234);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconButton)N(onClick,modifier,enabled,shape,colors,interactionSource,content)725@33508L252:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "720@33312L11,721@33375L29");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            z4 = z2;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                shape4 = shape2;
                            } else {
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            iconButtonColors4 = iconButtonColors2;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-399178234, i3, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:725)");
                        }
                        int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                        int i10 = i3 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, shape4, iconButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        iconButtonColors3 = iconButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledTonalIconButton$lambda$0;
                                FilledTonalIconButton$lambda$0 = IconButtonKt.FilledTonalIconButton$lambda$0(Function0.this, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledTonalIconButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(final Function0<Unit> function0, final IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-137266638);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconButton)N(onClick,shapes,modifier,enabled,colors,interactionSource,content)782@36350L254:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(iconButtonShapes) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "778@36217L29");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                modifier4 = companion;
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                IconButtonColors iconButtonColors4 = iconButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-137266638, i3, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:782)");
                                }
                                int i8 = i3 >> 3;
                                int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i8 & 112) | (i8 & 896) | ((i3 << 6) & 7168) | (57344 & i3);
                                int i10 = i3 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                iconButtonColors3 = iconButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        z4 = z2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        IconButtonColors iconButtonColors42 = iconButtonColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        int i92 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i82 & 112) | (i82 & 896) | ((i3 << 6) & 7168) | (57344 & i3);
                        int i102 = i3 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors42, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i92 | (3670016 & i102) | (i102 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors42;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledTonalIconButton$lambda$1;
                                FilledTonalIconButton$lambda$1 = IconButtonKt.FilledTonalIconButton$lambda$1(Function0.this, iconButtonShapes, modifier3, z3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledTonalIconButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
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
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i7;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Object rememberedValue;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-436409269);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,interactionSource,content)844@39425L24,841@39292L336:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "836@39084L11,837@39153L35");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i11 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 32) != 0) {
                                i11 &= -458753;
                            }
                            i7 = i11;
                            companion = modifier2;
                        } else {
                            companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i6 & (-57345);
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if ((i2 & 32) != 0) {
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(startRestartGroup, 6);
                                i7 &= -458753;
                            }
                            if (i5 != 0) {
                                shape4 = shape2;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-436409269, i7, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:841)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1517504739, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FilledTonalIconToggleButton$lambda$0$0;
                                            FilledTonalIconToggleButton$lambda$0$0 = IconButtonKt.FilledTonalIconToggleButton$lambda$0$0((SemanticsPropertyReceiver) obj);
                                            return FilledTonalIconToggleButton$lambda$0$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i12 = i7 << 3;
                                composer2 = startRestartGroup;
                                boolean z5 = z3;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, shape4, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i12) | (i12 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                z4 = z5;
                                shape3 = shape4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        }
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape4 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1517504739, "CC(remember):IconButton.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i122 = i7 << 3;
                        composer2 = startRestartGroup;
                        boolean z52 = z3;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z52, shape4, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i122) | (i122 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        z4 = z52;
                        shape3 = shape4;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledTonalIconToggleButton$lambda$1;
                                FilledTonalIconToggleButton$lambda$1 = IconButtonKt.FilledTonalIconToggleButton$lambda$1(z, function1, modifier3, z4, shape3, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledTonalIconToggleButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors4;
        int i7;
        MutableInteractionSource mutableInteractionSource4;
        Object rememberedValue;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(252067177);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconToggleButton)N(checked,onCheckedChange,shapes,modifier,enabled,colors,interactionSource,content)905@42573L24,902@42440L338:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(iconToggleButtonShapes) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "898@42301L35");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i7 = i6 & (-458753);
                                companion = modifier2;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                z5 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1718405281, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i10 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                                int i11 = i7 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i10 | (29360128 & i11) | (i11 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = companion;
                                z4 = z5;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                companion = modifier2;
                            }
                        } else {
                            companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 32) != 0) {
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(startRestartGroup, 6);
                                i6 &= -458753;
                            }
                            if (i5 != 0) {
                                z5 = z3;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                i7 = i6;
                                mutableInteractionSource4 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(252067177, i7, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:902)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1718405281, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda24
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FilledTonalIconToggleButton$lambda$2$0;
                                            FilledTonalIconToggleButton$lambda$2$0 = IconButtonKt.FilledTonalIconToggleButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                            return FilledTonalIconToggleButton$lambda$2$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i102 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                                int i112 = i7 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i102 | (29360128 & i112) | (i112 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                z4 = z5;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        }
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        i7 = i6;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        z5 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1718405281, "CC(remember):IconButton.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i1022 = (i7 & 14) | 1572864 | (i7 & 112) | ((i7 >> 3) & 7168) | ((i7 << 6) & 57344) | (458752 & i7);
                        int i1122 = i7 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes, iconToggleButtonColors4, (BorderStroke) null, mutableInteractionSource4, function2, composer2, i1022 | (29360128 & i1122) | (i1122 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        z4 = z5;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda25
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FilledTonalIconToggleButton$lambda$3;
                                FilledTonalIconToggleButton$lambda$3 = IconButtonKt.FilledTonalIconToggleButton$lambda$3(z, function1, iconToggleButtonShapes, modifier2, z4, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FilledTonalIconToggleButton$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        IconButtonColors iconButtonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        Shape shape4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1481353380);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconButton)N(onClick,modifier,enabled,shape,colors,border,interactionSource,content)969@45732L254:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "963@45455L13,964@45520L26,965@45595L33");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z4 = z2;
                            iconButtonColors4 = iconButtonColors2;
                            borderStroke4 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i6 = -1481353380;
                            modifier4 = modifier2;
                            shape4 = shape2;
                        } else {
                            Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(startRestartGroup, 6);
                            }
                            if ((i2 & 32) != 0) {
                                BorderStroke outlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48);
                                i3 &= -458753;
                                borderStroke2 = outlinedIconButtonBorder;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                shape4 = shape2;
                                iconButtonColors4 = iconButtonColors2;
                                borderStroke4 = borderStroke2;
                                modifier4 = companion;
                            } else {
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                                borderStroke4 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier4 = companion;
                                shape4 = shape2;
                            }
                            i6 = -1481353380;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:969)");
                        }
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, shape4, iconButtonColors4, borderStroke4, mutableInteractionSource4, function2, composer2, i3 & 33554430);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        shape3 = shape4;
                        iconButtonColors3 = iconButtonColors4;
                        borderStroke3 = borderStroke4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        iconButtonColors3 = iconButtonColors2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedIconButton$lambda$0;
                                OutlinedIconButton$lambda$0 = IconButtonKt.OutlinedIconButton$lambda$0(Function0.this, modifier3, z3, shape3, iconButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedIconButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(final Function0<Unit> function0, final IconButtonShapes iconButtonShapes, Modifier modifier, boolean z, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        IconButtonColors iconButtonColors4;
        BorderStroke borderStroke4;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(173214068);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconButton)N(onClick,shapes,modifier,enabled,colors,border,interactionSource,content)1033@48936L256:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(iconButtonShapes) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1028@48724L26,1029@48799L33");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(startRestartGroup, 6);
                            }
                            if ((i2 & 32) != 0) {
                                BorderStroke outlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 9) & 14) | 48);
                                i3 &= -458753;
                                borderStroke2 = outlinedIconButtonBorder;
                            }
                            if (i5 != 0) {
                                modifier4 = companion;
                                mutableInteractionSource4 = null;
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                                borderStroke4 = borderStroke2;
                                i6 = 173214068;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:1033)");
                                }
                                int i10 = i3 >> 3;
                                composer2 = startRestartGroup;
                                SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors4, borderStroke4, mutableInteractionSource4, function2, composer2, (i3 & 14) | (i10 & 112) | (i10 & 896) | ((i3 << 6) & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                iconButtonColors3 = iconButtonColors4;
                                borderStroke3 = borderStroke4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        iconButtonColors4 = iconButtonColors2;
                        borderStroke4 = borderStroke2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i6 = 173214068;
                        z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i3 >> 3;
                        composer2 = startRestartGroup;
                        SurfaceIconButton(function0, modifier4, z4, iconButtonShapes, iconButtonColors4, borderStroke4, mutableInteractionSource4, function2, composer2, (i3 & 14) | (i102 & 112) | (i102 & 896) | ((i3 << 6) & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors4;
                        borderStroke3 = borderStroke4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedIconButton$lambda$1;
                                OutlinedIconButton$lambda$1 = IconButtonKt.OutlinedIconButton$lambda$1(Function0.this, iconButtonShapes, modifier3, z3, iconButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedIconButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
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
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1703707081);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,border,interactionSource,content)1094@52068L24,1091@51935L338:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1085@51631L13,1086@51702L32,1087@51783L48");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i6 & (-57345);
                                shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if ((i2 & 32) != 0) {
                                i7 &= -458753;
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors(startRestartGroup, 6);
                            }
                            if ((i2 & 64) != 0) {
                                borderStroke2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, startRestartGroup, ((i7 >> 9) & 14) | 384 | ((i7 << 3) & 112));
                                i8 = i7 & (-3670017);
                            } else {
                                i8 = i7;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i8 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                        }
                        Shape shape4 = shape2;
                        BorderStroke borderStroke4 = borderStroke2;
                        Modifier modifier4 = modifier2;
                        IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1703707081, i8, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:1091)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -879944849, "CC(remember):IconButton.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit OutlinedIconToggleButton$lambda$0$0;
                                    OutlinedIconToggleButton$lambda$0$0 = IconButtonKt.OutlinedIconToggleButton$lambda$0$0((SemanticsPropertyReceiver) obj);
                                    return OutlinedIconToggleButton$lambda$0$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean z5 = z3;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null), z5, shape4, iconToggleButtonColors4, borderStroke4, mutableInteractionSource4, function2, startRestartGroup, i8 & 268434558);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        borderStroke3 = borderStroke4;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        shape3 = shape4;
                        z4 = z5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedIconToggleButton$lambda$1;
                                OutlinedIconToggleButton$lambda$1 = IconButtonKt.OutlinedIconToggleButton$lambda$1(z, function1, modifier3, z4, shape3, iconToggleButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedIconToggleButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 100663296) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final IconToggleButtonShapes iconToggleButtonShapes, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        IconToggleButtonShapes iconToggleButtonShapes2;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        final Modifier modifier3;
        final boolean z4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Modifier modifier4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        IconToggleButtonColors iconToggleButtonColors4;
        Object rememberedValue;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1417419037);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconToggleButton)N(checked,onCheckedChange,shapes,modifier,enabled,colors,border,interactionSource,content)1152@55105L24,1149@54972L340:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iconToggleButtonShapes2 = iconToggleButtonShapes;
            i3 |= startRestartGroup.changed(iconToggleButtonShapes2) ? 256 : 128;
        } else {
            iconToggleButtonShapes2 = iconToggleButtonShapes;
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
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1143@54717L39,1145@54813L55");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 32) != 0) {
                                i7 = i6 & (-458753);
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonVibrantColors(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if ((i2 & 64) != 0) {
                                BorderStroke outlinedIconToggleButtonVibrantBorder = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonVibrantBorder(z3, z, startRestartGroup, ((i7 >> 12) & 14) | 384 | ((i7 << 3) & 112));
                                i7 &= -3670017;
                                borderStroke2 = outlinedIconToggleButtonVibrantBorder;
                            }
                            i8 = i7;
                            if (i5 != 0) {
                                BorderStroke borderStroke5 = borderStroke2;
                                modifier4 = modifier2;
                                borderStroke4 = borderStroke5;
                                mutableInteractionSource4 = null;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1417419037, i8, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:1149)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 635082101, "CC(remember):IconButton.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit OutlinedIconToggleButton$lambda$2$0;
                                            OutlinedIconToggleButton$lambda$2$0 = IconButtonKt.OutlinedIconToggleButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                            return OutlinedIconToggleButton$lambda$2$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z5 = z3;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null), z5, iconToggleButtonShapes2, iconToggleButtonColors4, borderStroke4, mutableInteractionSource4, function2, startRestartGroup, (i8 & 126) | ((i8 >> 3) & 7168) | ((i8 << 6) & 57344) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (i8 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                modifier3 = modifier4;
                                borderStroke3 = borderStroke4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                z4 = z5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i8 = (i2 & 32) != 0 ? i6 & (-458753) : i6;
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                        }
                        BorderStroke borderStroke6 = borderStroke2;
                        modifier4 = modifier2;
                        borderStroke4 = borderStroke6;
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 635082101, "CC(remember):IconButton.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean z52 = z3;
                        SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null), z52, iconToggleButtonShapes2, iconToggleButtonColors4, borderStroke4, mutableInteractionSource4, function2, startRestartGroup, (i8 & 126) | ((i8 >> 3) & 7168) | ((i8 << 6) & 57344) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (i8 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        modifier3 = modifier4;
                        borderStroke3 = borderStroke4;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        z4 = z52;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedIconToggleButton$lambda$3;
                                OutlinedIconToggleButton$lambda$3 = IconButtonKt.OutlinedIconToggleButton$lambda$3(z, function1, iconToggleButtonShapes, modifier3, z4, iconToggleButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedIconToggleButton$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 100663296) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    private static final void SurfaceIconButton(final Function0<Unit> function0, final Modifier modifier, final boolean z, final Shape shape, final IconButtonColors iconButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-171935091);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconButton)N(onClick,modifier,enabled,shape,colors,border,interactionSource,content)1174@55672L22,1181@55925L192,1172@55598L519:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-171935091, i2, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:1172)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020854365, "CC(remember):IconButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SurfaceIconButton$lambda$0$0;
                        SurfaceIconButton$lambda$0$0 = IconButtonKt.SurfaceIconButton$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return SurfaceIconButton$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 << 9;
            composer2 = startRestartGroup;
            SurfaceKt.m4115Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null), z, shape, iconButtonColors.m3287containerColorvNxB06k$material3(z), iconButtonColors.m3288contentColorvNxB06k$material3(z), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(669231714, true, new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconButton$lambda$1;
                    SurfaceIconButton$lambda$1 = IconButtonKt.SurfaceIconButton$lambda$1(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconButton$lambda$1;
                }
            }, startRestartGroup, 54), composer2, (i2 & 8078) | (234881024 & i3) | (i3 & 1879048192), 6, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconButton$lambda$2;
                    SurfaceIconButton$lambda$2 = IconButtonKt.SurfaceIconButton$lambda$2(Function0.this, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconButton$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$1(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1182@55935L176:IconButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(669231714, i, -1, "androidx.compose.material3.SurfaceIconButton.<anonymous> (IconButton.kt:1182)");
            }
            Modifier m1272size6HolHcs = SizeKt.m1272size6HolHcs(Modifier.INSTANCE, IconButtonDefaults.m3298smallContainerSizeNwlBFI$default(IconButtonDefaults.INSTANCE, 0, 1, null));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1272size6HolHcs);
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
            ComposerKt.sourceInformationMarkerStart(composer, 495427006, "C1186@56092L9:IconButton.kt#uh7d8r");
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

    private static final void SurfaceIconButton(final Function0<Unit> function0, final Modifier modifier, final boolean z, final IconButtonShapes iconButtonShapes, final IconButtonColors iconButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1422942537);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconButton)N(onClick,modifier,enabled,shapes,colors,border,interactionSource,content)1209@56656L46,1205@56538L295:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(iconButtonShapes) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422942537, i2, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:1200)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(446444132);
                ComposerKt.sourceInformation(startRestartGroup, "1203@56493L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1648166562, "CC(remember):IconButton.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1648167213);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composer2 = startRestartGroup;
            SurfaceIconButton(function0, modifier, z, shapeForInteraction(iconButtonShapes, mutableInteractionSource2, startRestartGroup, (i2 >> 9) & 14), iconButtonColors, borderStroke, mutableInteractionSource2, function2, composer2, i2 & 29877246);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconButton$lambda$4;
                    SurfaceIconButton$lambda$4 = IconButtonKt.SurfaceIconButton$lambda$4(Function0.this, modifier, z, iconButtonShapes, iconButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconButton$lambda$4;
                }
            });
        }
    }

    private static final void SurfaceIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final Modifier modifier, final boolean z2, final Shape shape, final IconToggleButtonColors iconToggleButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Function1<? super Boolean, Unit> function12;
        Composer startRestartGroup = composer.startRestartGroup(-1118363928);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,border,interactionSource,content)1232@57287L24,1235@57386L32,1236@57456L30,1239@57572L192,1229@57170L594:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(iconToggleButtonColors) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118363928, i2, -1, "androidx.compose.material3.SurfaceIconToggleButton (IconButton.kt:1228)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1005897024, "CC(remember):IconButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SurfaceIconToggleButton$lambda$0$0;
                        SurfaceIconToggleButton$lambda$0$0 = IconButtonKt.SurfaceIconToggleButton$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return SurfaceIconToggleButton$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 >> 9;
            int i4 = (i3 & 896) | (i3 & 14) | ((i2 << 3) & 112);
            SurfaceKt.m4114Surfaced85dljk(z, function12, SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null), z2, shape, iconToggleButtonColors.containerColor$material3(z2, z, startRestartGroup, i4).getValue().m6796unboximpl(), iconToggleButtonColors.contentColor$material3(z2, z, startRestartGroup, i4).getValue().m6796unboximpl(), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(1492028158, true, new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconToggleButton$lambda$1;
                    SurfaceIconToggleButton$lambda$1 = IconButtonKt.SurfaceIconToggleButton$lambda$1(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconToggleButton$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, (64638 & i2) | (1879048192 & (i2 << 9)), ((i2 >> 21) & 14) | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconToggleButton$lambda$2;
                    SurfaceIconToggleButton$lambda$2 = IconButtonKt.SurfaceIconToggleButton$lambda$2(z, function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconToggleButton$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$1(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1240@57582L176:IconButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1492028158, i, -1, "androidx.compose.material3.SurfaceIconToggleButton.<anonymous> (IconButton.kt:1240)");
            }
            Modifier m1272size6HolHcs = SizeKt.m1272size6HolHcs(Modifier.INSTANCE, IconButtonDefaults.m3298smallContainerSizeNwlBFI$default(IconButtonDefaults.INSTANCE, 0, 1, null));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1272size6HolHcs);
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
            ComposerKt.sourceInformationMarkerStart(composer, -555521886, "C1244@57739L9:IconButton.kt#uh7d8r");
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

    private static final void SurfaceIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final Modifier modifier, final boolean z2, final IconToggleButtonShapes iconToggleButtonShapes, final IconToggleButtonColors iconToggleButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Function1<? super Boolean, Unit> function12;
        Modifier modifier2;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-907201848);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,border,interactionSource,content)1270@58409L55,1265@58242L353:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & 384) == 0) {
            modifier2 = modifier;
            i2 |= startRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconToggleButtonShapes) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            iconToggleButtonColors2 = iconToggleButtonColors;
            i2 |= startRestartGroup.changed(iconToggleButtonColors2) ? 131072 : 65536;
        } else {
            iconToggleButtonColors2 = iconToggleButtonColors;
        }
        if ((1572864 & i) == 0) {
            borderStroke2 = borderStroke;
            i2 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function22 = function2;
            i2 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            function22 = function2;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-907201848, i2, -1, "androidx.compose.material3.SurfaceIconToggleButton (IconButton.kt:1260)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(1779346899);
                ComposerKt.sourceInformation(startRestartGroup, "1263@58197L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 57398287, "CC(remember):IconButton.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(57397636);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            Shape shapeForInteraction = shapeForInteraction(z, iconToggleButtonShapes, mutableInteractionSource2, startRestartGroup, (i2 & 14) | ((i2 >> 9) & 112));
            int i3 = i2 & 239017982;
            SurfaceIconToggleButton(z, function12, modifier2, z3, shapeForInteraction, iconToggleButtonColors2, borderStroke2, mutableInteractionSource2, function22, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconToggleButton$lambda$4;
                    SurfaceIconToggleButton$lambda$4 = IconButtonKt.SurfaceIconToggleButton$lambda$4(z, function1, modifier, z2, iconToggleButtonShapes, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconToggleButton$lambda$4;
                }
            });
        }
    }

    private static final Shape shapeForInteraction(IconButtonShapes iconButtonShapes, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        composer.startReplaceGroup(-514014991);
        ComposerKt.sourceInformation(composer, "C(shapeForInteraction)N(shapes,interactionSource)1561@69526L14,1562@69578L25,1564@69616L57:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-514014991, i, -1, "androidx.compose.material3.shapeForInteraction (IconButton.kt:1554)");
        }
        if (isStatic(iconButtonShapes)) {
            Shape shape = iconButtonShapes.getShape();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return shape;
        }
        Shape shapeByInteraction = shapeByInteraction(iconButtonShapes, shapeForInteraction$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composer, (i >> 3) & 14)), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shapeByInteraction;
    }

    private static final Shape shapeForInteraction(boolean z, IconToggleButtonShapes iconToggleButtonShapes, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        composer.startReplaceGroup(1830759449);
        ComposerKt.sourceInformation(composer, "C(shapeForInteraction)N(checked,shapes,interactionSource)1579@70153L14,1580@70205L25,1582@70243L66:IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1830759449, i, -1, "androidx.compose.material3.shapeForInteraction (IconButton.kt:1572)");
        }
        if (isStatic(iconToggleButtonShapes)) {
            Shape shape = iconToggleButtonShapes.getShape();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return shape;
        }
        Shape shapeByInteraction = shapeByInteraction(iconToggleButtonShapes, shapeForInteraction$lambda$1(PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composer, (i >> 6) & 14)), z, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), composer, ((i >> 3) & 14) | ((i << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shapeByInteraction;
    }

    public static final boolean isCornerBasedShape(IconButtonShapes iconButtonShapes) {
        return (iconButtonShapes.getShape() instanceof CornerBasedShape) && (iconButtonShapes.getPressedShape() instanceof CornerBasedShape);
    }

    public static final boolean isStatic(IconButtonShapes iconButtonShapes) {
        return iconButtonShapes.getShape() == iconButtonShapes.getPressedShape();
    }

    public static final boolean isCornerBasedShape(IconToggleButtonShapes iconToggleButtonShapes) {
        return (iconToggleButtonShapes.getShape() instanceof CornerBasedShape) && (iconToggleButtonShapes.getPressedShape() instanceof CornerBasedShape) && (iconToggleButtonShapes.getCheckedShape() instanceof CornerBasedShape);
    }

    public static final boolean isStatic(IconToggleButtonShapes iconToggleButtonShapes) {
        return iconToggleButtonShapes.getShape() == iconToggleButtonShapes.getPressedShape() && iconToggleButtonShapes.getShape() == iconToggleButtonShapes.getCheckedShape();
    }

    private static final Shape shapeByInteraction(IconButtonShapes iconButtonShapes, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(-508408412);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,pressed,animationSpec):IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-508408412, i, -1, "androidx.compose.material3.shapeByInteraction (IconButton.kt:1605)");
        }
        if (z) {
            shape = iconButtonShapes.getPressedShape();
        } else {
            shape = iconButtonShapes.getShape();
        }
        if (isCornerBasedShape(iconButtonShapes)) {
            composer.startReplaceGroup(-1940046184);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(1045797043, iconButtonShapes);
            ComposerKt.sourceInformation(composer, "1612@71173L63");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            Shape rememberAnimatedShape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i >> 3) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape;
        }
        composer.startReplaceGroup(-1939948162);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final Shape shapeByInteraction(IconToggleButtonShapes iconToggleButtonShapes, boolean z, boolean z2, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(379519412);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,pressed,checked,animationSpec):IconButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(379519412, i, -1, "androidx.compose.material3.shapeByInteraction (IconButton.kt:1623)");
        }
        if (z) {
            shape = iconToggleButtonShapes.getPressedShape();
        } else if (z2) {
            shape = iconToggleButtonShapes.getCheckedShape();
        } else {
            shape = iconToggleButtonShapes.getShape();
        }
        if (isCornerBasedShape(iconToggleButtonShapes)) {
            composer.startReplaceGroup(1909239112);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(-354053117, iconToggleButtonShapes);
            ComposerKt.sourceInformation(composer, "1632@71675L63");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            Shape rememberAnimatedShape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape;
        }
        composer.startReplaceGroup(1909337134);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final boolean shapeForInteraction$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean shapeForInteraction$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
