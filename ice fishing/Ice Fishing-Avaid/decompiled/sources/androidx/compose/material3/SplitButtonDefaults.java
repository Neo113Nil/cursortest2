package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SplitButtonLargeTokens;
import androidx.compose.material3.tokens.SplitButtonMediumTokens;
import androidx.compose.material3.tokens.SplitButtonSmallTokens;
import androidx.compose.material3.tokens.SplitButtonXLargeTokens;
import androidx.compose.material3.tokens.SplitButtonXSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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

/* compiled from: SplitButton.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010j\u001a\u00020k2\b\b\u0002\u0010l\u001a\u00020\u000eH\u0002J\u0012\u0010n\u001a\u00020o2\b\b\u0002\u0010l\u001a\u00020\u000eH\u0007J\u001c\u0010p\u001a\u00020o2\b\b\u0002\u0010l\u001a\u00020\u000e2\b\b\u0002\u0010q\u001a\u00020\u000eH\u0002J\u0012\u0010r\u001a\u00020k2\b\b\u0002\u0010s\u001a\u00020\u000eH\u0002J\u0012\u0010t\u001a\u00020o2\b\b\u0002\u0010s\u001a\u00020\u000eH\u0007J\u001c\u0010u\u001a\u00020o2\b\b\u0002\u0010s\u001a\u00020\u000e2\b\b\u0002\u0010v\u001a\u00020\u000eH\u0002J\u0017\u0010w\u001a\u00020o2\u0006\u0010x\u001a\u00020\u0005H\u0007¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020o2\u0006\u0010x\u001a\u00020\u0005H\u0007¢\u0006\u0004\b|\u0010zJ\u0015\u0010}\u001a\u00020)2\u0006\u0010x\u001a\u00020\u0005¢\u0006\u0004\b~\u0010\u007fJ\u0017\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010x\u001a\u00020\u0005¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ\u0018\u0010\u0082\u0001\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0018\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005¢\u0006\u0006\b\u0086\u0001\u0010\u0084\u0001J©\u0001\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010\u009e\u0001J©\u0001\u0010\u009f\u0001\u001a\u00030\u0088\u00012\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010\u009e\u0001Jº\u0001\u0010\u009f\u0001\u001a\u00030\u0088\u00012\b\u0010 \u0001\u001a\u00030\u008e\u00012\u0016\u0010¡\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010¢\u0001J©\u0001\u0010£\u0001\u001a\u00030\u0088\u00012\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010\u009e\u0001Jº\u0001\u0010¤\u0001\u001a\u00030\u0088\u00012\b\u0010 \u0001\u001a\u00030\u008e\u00012\u0016\u0010¡\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010¢\u0001J©\u0001\u0010¥\u0001\u001a\u00030\u0088\u00012\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010\u009e\u0001Jº\u0001\u0010¦\u0001\u001a\u00030\u0088\u00012\b\u0010 \u0001\u001a\u00030\u008e\u00012\u0016\u0010¡\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010¢\u0001J©\u0001\u0010§\u0001\u001a\u00030\u0088\u00012\u000f\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u008a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010\u009e\u0001Jº\u0001\u0010¨\u0001\u001a\u00030\u0088\u00012\b\u0010 \u0001\u001a\u00030\u008e\u00012\u0016\u0010¡\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u00012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020o2\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020)2\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00012\"\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u0088\u00010\u009a\u0001¢\u0006\u0003\b\u009c\u0001¢\u0006\u0003\b\u009d\u0001H\u0007¢\u0006\u0003\u0010¢\u0001R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0011\u0010\"\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R\u0011\u0010$\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u0011\u0010&\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0011R\u001c\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0003\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0003\u001a\u0004\b/\u0010,R\u001c\u00100\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010,R\u001c\u00103\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0003\u001a\u0004\b5\u0010,R\u001c\u00106\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0003\u001a\u0004\b8\u0010,R\u001c\u00109\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u0003\u001a\u0004\b;\u0010,R\u001c\u0010<\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\u0003\u001a\u0004\b>\u0010,R\u001c\u0010?\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\u0003\u001a\u0004\bA\u0010,R\u001c\u0010B\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u0010,R\u001c\u0010E\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010\u0003\u001a\u0004\bG\u0010,R\u001c\u0010H\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010\u0003\u001a\u0004\bJ\u0010,R\u0013\u0010K\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bL\u0010\u0007R\u0013\u0010M\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bN\u0010\u0007R\u0013\u0010O\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bP\u0010\u0007R\u0013\u0010Q\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bR\u0010\u0007R\u0013\u0010S\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bT\u0010\u0007R\u001c\u0010U\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010\u0003\u001a\u0004\bW\u0010,R\u0010\u0010X\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0013\u0010Y\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bZ\u0010\u0007R\u001e\u0010[\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\\\u0010\u0003\u001a\u0004\b]\u0010\u0007R\u001e\u0010^\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b_\u0010\u0003\u001a\u0004\b`\u0010\u0007R\u001e\u0010a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\bb\u0010\u0003\u001a\u0004\bc\u0010\u0007R\u001e\u0010d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\be\u0010\u0003\u001a\u0004\bf\u0010\u0007R\u0010\u0010g\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010h\u001a\u00020iX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020kX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006©\u0001²\u0006\f\u0010ª\u0001\u001a\u00030\u008e\u0001X\u008a\u0084\u0002²\u0006\f\u0010ª\u0001\u001a\u00030\u008e\u0001X\u008a\u0084\u0002²\u0006\f\u0010ª\u0001\u001a\u00030\u008e\u0001X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/SplitButtonDefaults;", "", "<init>", "()V", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "TrailingIconSize", "getTrailingIconSize-D9Ej5fM", "Spacing", "getSpacing-D9Ej5fM", "InnerCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "getInnerCornerSize$annotations", "getInnerCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "ExtraSmallInnerCornerSize", "getExtraSmallInnerCornerSize", "SmallInnerCornerSize", "getSmallInnerCornerSize", "MediumInnerCornerSize", "getMediumInnerCornerSize", "LargeInnerCornerSize", "getLargeInnerCornerSize", "ExtraLargeInnerCornerSize", "getExtraLargeInnerCornerSize", "ExtraSmallInnerCornerSizePressed", "getExtraSmallInnerCornerSizePressed", "SmallInnerCornerSizePressed", "getSmallInnerCornerSizePressed", "MediumInnerCornerSizePressed", "getMediumInnerCornerSizePressed", "LargeInnerCornerSizePressed", "getLargeInnerCornerSizePressed", "ExtraLargeInnerCornerSizePressed", "getExtraLargeInnerCornerSizePressed", "OuterCornerSize", "getOuterCornerSize", "LeadingButtonContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getLeadingButtonContentPadding$annotations", "getLeadingButtonContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ExtraSmallLeadingButtonContentPadding", "getExtraSmallLeadingButtonContentPadding$annotations", "getExtraSmallLeadingButtonContentPadding", "SmallLeadingButtonContentPadding", "getSmallLeadingButtonContentPadding$annotations", "getSmallLeadingButtonContentPadding", "MediumLeadingButtonContentPadding", "getMediumLeadingButtonContentPadding$annotations", "getMediumLeadingButtonContentPadding", "LargeLeadingButtonContentPadding", "getLargeLeadingButtonContentPadding$annotations", "getLargeLeadingButtonContentPadding", "ExtraLargeLeadingButtonContentPadding", "getExtraLargeLeadingButtonContentPadding$annotations", "getExtraLargeLeadingButtonContentPadding", "ExtraSmallTrailingButtonContentPadding", "getExtraSmallTrailingButtonContentPadding$annotations", "getExtraSmallTrailingButtonContentPadding", "SmallTrailingButtonContentPadding", "getSmallTrailingButtonContentPadding$annotations", "getSmallTrailingButtonContentPadding", "MediumTrailingButtonContentPadding", "getMediumTrailingButtonContentPadding$annotations", "getMediumTrailingButtonContentPadding", "LargeTrailingButtonContentPadding", "getLargeTrailingButtonContentPadding$annotations", "getLargeTrailingButtonContentPadding", "ExtraLargeTrailingButtonContentPadding", "getExtraLargeTrailingButtonContentPadding$annotations", "getExtraLargeTrailingButtonContentPadding", "ExtraSmallTrailingButtonIconSize", "getExtraSmallTrailingButtonIconSize-D9Ej5fM", "SmallTrailingButtonIconSize", "getSmallTrailingButtonIconSize-D9Ej5fM", "MediumTrailingButtonIconSize", "getMediumTrailingButtonIconSize-D9Ej5fM", "LargeTrailingButtonIconSize", "getLargeTrailingButtonIconSize-D9Ej5fM", "ExtraLargeTrailingButtonIconSize", "getExtraLargeTrailingButtonIconSize-D9Ej5fM", "TrailingButtonContentPadding", "getTrailingButtonContentPadding$annotations", "getTrailingButtonContentPadding", "LeadingButtonMinWidth", "SmallContainerHeight", "getSmallContainerHeight-D9Ej5fM", "ExtraSmallContainerHeight", "getExtraSmallContainerHeight-D9Ej5fM$annotations", "getExtraSmallContainerHeight-D9Ej5fM", "MediumContainerHeight", "getMediumContainerHeight-D9Ej5fM$annotations", "getMediumContainerHeight-D9Ej5fM", "LargeContainerHeight", "getLargeContainerHeight-D9Ej5fM$annotations", "getLargeContainerHeight-D9Ej5fM", "ExtraLargeContainerHeight", "getExtraLargeContainerHeight-D9Ej5fM$annotations", "getExtraLargeContainerHeight-D9Ej5fM", "TrailingButtonMinWidth", "TrailingButtonStateLayerAlpha", "", "leadingButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "endCornerSize", "TrailingCheckedShape", "leadingButtonShapes", "Landroidx/compose/material3/SplitButtonShapes;", "leadingButtonShapesInternal", "endCornerSizePressed", "trailingButtonShape", "startCornerSize", "trailingButtonShapes", "trailingButtonShapesInternal", "startCornerSizePressed", "leadingButtonShapesFor", "buttonHeight", "leadingButtonShapesFor-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SplitButtonShapes;", "trailingButtonShapesFor", "trailingButtonShapesFor-8Feqmps", "leadingButtonContentPaddingFor", "leadingButtonContentPaddingFor-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "trailingButtonContentPaddingFor", "trailingButtonContentPaddingFor-0680j_4", "leadingButtonIconSizeFor", "leadingButtonIconSizeFor-5rwHm24", "(F)F", "trailingButtonIconSizeFor", "trailingButtonIconSizeFor-5rwHm24", "LeadingButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shapes", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SplitButtonShapes;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TrailingButton", "checked", "onCheckedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SplitButtonShapes;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TonalLeadingButton", "TonalTrailingButton", "OutlinedLeadingButton", "OutlinedTrailingButton", "ElevatedLeadingButton", "ElevatedTrailingButton", "material3", "pressed"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SplitButtonDefaults {
    public static final int $stable = 0;
    private static final float ExtraLargeContainerHeight;
    private static final float ExtraSmallContainerHeight;
    private static final float LargeContainerHeight;
    private static final float LeadingButtonMinWidth;
    private static final float MediumContainerHeight;
    private static final float SmallContainerHeight;
    private static final float TrailingButtonMinWidth;
    private static final float TrailingButtonStateLayerAlpha = 0.1f;
    private static final RoundedCornerShape TrailingCheckedShape;
    public static final SplitButtonDefaults INSTANCE = new SplitButtonDefaults();
    private static final float LeadingIconSize = ButtonSmallTokens.INSTANCE.m4989getIconSizeD9Ej5fM();
    private static final float TrailingIconSize = SplitButtonSmallTokens.INSTANCE.m5617getTrailingIconSizeD9Ej5fM();
    private static final float Spacing = SplitButtonSmallTokens.INSTANCE.m5611getBetweenSpaceD9Ej5fM();
    private static final CornerSize InnerCornerSize = SplitButtonSmallTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize ExtraSmallInnerCornerSize = SplitButtonXSmallTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize SmallInnerCornerSize = SplitButtonSmallTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize MediumInnerCornerSize = SplitButtonMediumTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize LargeInnerCornerSize = SplitButtonLargeTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize ExtraLargeInnerCornerSize = SplitButtonXLargeTokens.INSTANCE.getInnerCornerCornerSize();
    private static final CornerSize ExtraSmallInnerCornerSizePressed = SplitButtonXSmallTokens.INSTANCE.getInnerPressedCornerCornerSize();
    private static final CornerSize SmallInnerCornerSizePressed = SplitButtonSmallTokens.INSTANCE.getInnerPressedCornerCornerSize();
    private static final CornerSize MediumInnerCornerSizePressed = SplitButtonMediumTokens.INSTANCE.getInnerPressedCornerCornerSize();
    private static final CornerSize LargeInnerCornerSizePressed = SplitButtonLargeTokens.INSTANCE.getInnerPressedCornerCornerSize();
    private static final CornerSize ExtraLargeInnerCornerSizePressed = SplitButtonXLargeTokens.INSTANCE.getInnerPressedCornerCornerSize();
    private static final CornerSize OuterCornerSize = ShapeDefaults.INSTANCE.getCornerFull$material3();
    private static final PaddingValues LeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonSmallTokens.INSTANCE.m5613getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonSmallTokens.INSTANCE.m5614getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues ExtraSmallLeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonXSmallTokens.INSTANCE.m5627getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonXSmallTokens.INSTANCE.m5628getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues SmallLeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonSmallTokens.INSTANCE.m5613getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonSmallTokens.INSTANCE.m5614getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues MediumLeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonMediumTokens.INSTANCE.m5606getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonMediumTokens.INSTANCE.m5607getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues LargeLeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonLargeTokens.INSTANCE.m5599getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonLargeTokens.INSTANCE.m5600getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues ExtraLargeLeadingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonXLargeTokens.INSTANCE.m5620getLeadingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonXLargeTokens.INSTANCE.m5621getLeadingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues ExtraSmallTrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonXSmallTokens.INSTANCE.m5629getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonXSmallTokens.INSTANCE.m5630getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues SmallTrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonSmallTokens.INSTANCE.m5615getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonSmallTokens.INSTANCE.m5616getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues MediumTrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonMediumTokens.INSTANCE.m5608getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonMediumTokens.INSTANCE.m5609getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues LargeTrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonLargeTokens.INSTANCE.m5601getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonLargeTokens.INSTANCE.m5602getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final PaddingValues ExtraLargeTrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonXLargeTokens.INSTANCE.m5622getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonXLargeTokens.INSTANCE.m5623getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);
    private static final float ExtraSmallTrailingButtonIconSize = SplitButtonXSmallTokens.INSTANCE.m5631getTrailingIconSizeD9Ej5fM();
    private static final float SmallTrailingButtonIconSize = SplitButtonSmallTokens.INSTANCE.m5617getTrailingIconSizeD9Ej5fM();
    private static final float MediumTrailingButtonIconSize = SplitButtonMediumTokens.INSTANCE.m5610getTrailingIconSizeD9Ej5fM();
    private static final float LargeTrailingButtonIconSize = SplitButtonLargeTokens.INSTANCE.m5603getTrailingIconSizeD9Ej5fM();
    private static final float ExtraLargeTrailingButtonIconSize = SplitButtonXLargeTokens.INSTANCE.m5624getTrailingIconSizeD9Ej5fM();
    private static final PaddingValues TrailingButtonContentPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(SplitButtonSmallTokens.INSTANCE.m5615getTrailingButtonLeadingSpaceD9Ej5fM(), 0.0f, SplitButtonSmallTokens.INSTANCE.m5616getTrailingButtonTrailingSpaceD9Ej5fM(), 0.0f, 10, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedLeadingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, Function0 function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.ElevatedLeadingButton(function0, modifier, z, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedTrailingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, boolean z, Function1 function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.ElevatedTrailingButton(z, function1, modifier, z2, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingButton$lambda$4(SplitButtonDefaults splitButtonDefaults, Function0 function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.LeadingButton(function0, modifier, z, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedLeadingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, Function0 function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.OutlinedLeadingButton(function0, modifier, z, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTrailingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, boolean z, Function1 function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.OutlinedTrailingButton(z, function1, modifier, z2, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TonalLeadingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, Function0 function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.TonalLeadingButton(function0, modifier, z, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TonalTrailingButton$lambda$0(SplitButtonDefaults splitButtonDefaults, boolean z, Function1 function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.TonalTrailingButton(z, function1, modifier, z2, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$10(SplitButtonDefaults splitButtonDefaults, boolean z, Function1 function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.TrailingButton(z, function1, modifier, z2, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$4(SplitButtonDefaults splitButtonDefaults, Function0 function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        splitButtonDefaults.TrailingButton(function0, modifier, z, splitButtonShapes, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* renamed from: getExtraLargeContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4067getExtraLargeContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraLargeLeadingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getExtraLargeTrailingButtonContentPadding$annotations() {
    }

    /* renamed from: getExtraSmallContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4068getExtraSmallContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getExtraSmallLeadingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getExtraSmallTrailingButtonContentPadding$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use `SmallInnerCornerSize` instead", replaceWith = @ReplaceWith(expression = "SmallInnerCornerSize", imports = {}))
    public static /* synthetic */ void getInnerCornerSize$annotations() {
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4069getLargeContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getLargeLeadingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getLargeTrailingButtonContentPadding$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use `leadingButtonContentPaddingFor(buttonHeight)` instead", replaceWith = @ReplaceWith(expression = "leadingButtonContentPaddingFor(buttonHeight)", imports = {}))
    public static /* synthetic */ void getLeadingButtonContentPadding$annotations() {
    }

    /* renamed from: getMediumContainerHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4070getMediumContainerHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getMediumLeadingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getMediumTrailingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getSmallLeadingButtonContentPadding$annotations() {
    }

    public static /* synthetic */ void getSmallTrailingButtonContentPadding$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use `SmallTrailingButtonContentPadding` instead", replaceWith = @ReplaceWith(expression = "SmallTrailingButtonContentPadding", imports = {}))
    public static /* synthetic */ void getTrailingButtonContentPadding$annotations() {
    }

    private SplitButtonDefaults() {
    }

    static {
        float m9732constructorimpl = Dp.m9732constructorimpl(48);
        LeadingButtonMinWidth = m9732constructorimpl;
        SmallContainerHeight = SplitButtonSmallTokens.INSTANCE.m5612getContainerHeightD9Ej5fM();
        ExtraSmallContainerHeight = SplitButtonXSmallTokens.INSTANCE.m5626getContainerHeightD9Ej5fM();
        MediumContainerHeight = SplitButtonMediumTokens.INSTANCE.m5605getContainerHeightD9Ej5fM();
        LargeContainerHeight = SplitButtonLargeTokens.INSTANCE.m5598getContainerHeightD9Ej5fM();
        ExtraLargeContainerHeight = SplitButtonXLargeTokens.INSTANCE.m5619getContainerHeightD9Ej5fM();
        TrailingButtonMinWidth = m9732constructorimpl;
        TrailingCheckedShape = RoundedCornerShapeKt.getCircleShape();
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4077getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4083getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4082getSpacingD9Ej5fM() {
        return Spacing;
    }

    public final /* synthetic */ CornerSize getInnerCornerSize() {
        return InnerCornerSize;
    }

    public final CornerSize getExtraSmallInnerCornerSize() {
        return ExtraSmallInnerCornerSize;
    }

    public final CornerSize getSmallInnerCornerSize() {
        return SmallInnerCornerSize;
    }

    public final CornerSize getMediumInnerCornerSize() {
        return MediumInnerCornerSize;
    }

    public final CornerSize getLargeInnerCornerSize() {
        return LargeInnerCornerSize;
    }

    public final CornerSize getExtraLargeInnerCornerSize() {
        return ExtraLargeInnerCornerSize;
    }

    public final CornerSize getExtraSmallInnerCornerSizePressed() {
        return ExtraSmallInnerCornerSizePressed;
    }

    public final CornerSize getSmallInnerCornerSizePressed() {
        return SmallInnerCornerSizePressed;
    }

    public final CornerSize getMediumInnerCornerSizePressed() {
        return MediumInnerCornerSizePressed;
    }

    public final CornerSize getLargeInnerCornerSizePressed() {
        return LargeInnerCornerSizePressed;
    }

    public final CornerSize getExtraLargeInnerCornerSizePressed() {
        return ExtraLargeInnerCornerSizePressed;
    }

    public final CornerSize getOuterCornerSize() {
        return OuterCornerSize;
    }

    public final /* synthetic */ PaddingValues getLeadingButtonContentPadding() {
        return LeadingButtonContentPadding;
    }

    public final PaddingValues getExtraSmallLeadingButtonContentPadding() {
        return ExtraSmallLeadingButtonContentPadding;
    }

    public final PaddingValues getSmallLeadingButtonContentPadding() {
        return SmallLeadingButtonContentPadding;
    }

    public final PaddingValues getMediumLeadingButtonContentPadding() {
        return MediumLeadingButtonContentPadding;
    }

    public final PaddingValues getLargeLeadingButtonContentPadding() {
        return LargeLeadingButtonContentPadding;
    }

    public final PaddingValues getExtraLargeLeadingButtonContentPadding() {
        return ExtraLargeLeadingButtonContentPadding;
    }

    public final PaddingValues getExtraSmallTrailingButtonContentPadding() {
        return ExtraSmallTrailingButtonContentPadding;
    }

    public final PaddingValues getSmallTrailingButtonContentPadding() {
        return SmallTrailingButtonContentPadding;
    }

    public final PaddingValues getMediumTrailingButtonContentPadding() {
        return MediumTrailingButtonContentPadding;
    }

    public final PaddingValues getLargeTrailingButtonContentPadding() {
        return LargeTrailingButtonContentPadding;
    }

    public final PaddingValues getExtraLargeTrailingButtonContentPadding() {
        return ExtraLargeTrailingButtonContentPadding;
    }

    /* renamed from: getExtraSmallTrailingButtonIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4074getExtraSmallTrailingButtonIconSizeD9Ej5fM() {
        return ExtraSmallTrailingButtonIconSize;
    }

    /* renamed from: getSmallTrailingButtonIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4081getSmallTrailingButtonIconSizeD9Ej5fM() {
        return SmallTrailingButtonIconSize;
    }

    /* renamed from: getMediumTrailingButtonIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4079getMediumTrailingButtonIconSizeD9Ej5fM() {
        return MediumTrailingButtonIconSize;
    }

    /* renamed from: getLargeTrailingButtonIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4076getLargeTrailingButtonIconSizeD9Ej5fM() {
        return LargeTrailingButtonIconSize;
    }

    /* renamed from: getExtraLargeTrailingButtonIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4072getExtraLargeTrailingButtonIconSizeD9Ej5fM() {
        return ExtraLargeTrailingButtonIconSize;
    }

    public final /* synthetic */ PaddingValues getTrailingButtonContentPadding() {
        return TrailingButtonContentPadding;
    }

    /* renamed from: getSmallContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4080getSmallContainerHeightD9Ej5fM() {
        return SmallContainerHeight;
    }

    /* renamed from: getExtraSmallContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4073getExtraSmallContainerHeightD9Ej5fM() {
        return ExtraSmallContainerHeight;
    }

    /* renamed from: getMediumContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4078getMediumContainerHeightD9Ej5fM() {
        return MediumContainerHeight;
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4075getLargeContainerHeightD9Ej5fM() {
        return LargeContainerHeight;
    }

    /* renamed from: getExtraLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4071getExtraLargeContainerHeightD9Ej5fM() {
        return ExtraLargeContainerHeight;
    }

    static /* synthetic */ RoundedCornerShape leadingButtonShape$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        return splitButtonDefaults.leadingButtonShape(cornerSize);
    }

    private final RoundedCornerShape leadingButtonShape(CornerSize endCornerSize) {
        CornerSize cornerSize = OuterCornerSize;
        return new RoundedCornerShape(cornerSize, endCornerSize, endCornerSize, cornerSize);
    }

    public static /* synthetic */ SplitButtonShapes leadingButtonShapes$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        return splitButtonDefaults.leadingButtonShapes(cornerSize);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function will be private in the future", replaceWith = @ReplaceWith(expression = "leadingButtonShapesFor(buttonHeight)", imports = {}))
    public final /* synthetic */ SplitButtonShapes leadingButtonShapes(CornerSize endCornerSize) {
        RoundedCornerShape leadingButtonShape = leadingButtonShape(endCornerSize);
        CornerSize cornerSize = OuterCornerSize;
        CornerSize cornerSize2 = SmallInnerCornerSizePressed;
        return new SplitButtonShapes(leadingButtonShape, new RoundedCornerShape(cornerSize, cornerSize2, cornerSize2, cornerSize), null);
    }

    static /* synthetic */ SplitButtonShapes leadingButtonShapesInternal$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, CornerSize cornerSize2, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        if ((i & 2) != 0) {
            cornerSize2 = SmallInnerCornerSizePressed;
        }
        return splitButtonDefaults.leadingButtonShapesInternal(cornerSize, cornerSize2);
    }

    private final SplitButtonShapes leadingButtonShapesInternal(CornerSize endCornerSize, CornerSize endCornerSizePressed) {
        return new SplitButtonShapes(leadingButtonShape(endCornerSize), leadingButtonShape(endCornerSizePressed), null);
    }

    static /* synthetic */ RoundedCornerShape trailingButtonShape$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        return splitButtonDefaults.trailingButtonShape(cornerSize);
    }

    private final RoundedCornerShape trailingButtonShape(CornerSize startCornerSize) {
        CornerSize cornerSize = OuterCornerSize;
        return new RoundedCornerShape(startCornerSize, cornerSize, cornerSize, startCornerSize);
    }

    public static /* synthetic */ SplitButtonShapes trailingButtonShapes$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        return splitButtonDefaults.trailingButtonShapes(cornerSize);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function will be private in the future", replaceWith = @ReplaceWith(expression = "trailingButtonShapesFor(buttonHeight)", imports = {}))
    public final /* synthetic */ SplitButtonShapes trailingButtonShapes(CornerSize startCornerSize) {
        RoundedCornerShape trailingButtonShape = trailingButtonShape(startCornerSize);
        CornerSize cornerSize = SmallInnerCornerSizePressed;
        CornerSize cornerSize2 = OuterCornerSize;
        return new SplitButtonShapes(trailingButtonShape, new RoundedCornerShape(cornerSize, cornerSize2, cornerSize2, cornerSize), TrailingCheckedShape);
    }

    static /* synthetic */ SplitButtonShapes trailingButtonShapesInternal$default(SplitButtonDefaults splitButtonDefaults, CornerSize cornerSize, CornerSize cornerSize2, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerSize = SmallInnerCornerSize;
        }
        if ((i & 2) != 0) {
            cornerSize2 = SmallInnerCornerSizePressed;
        }
        return splitButtonDefaults.trailingButtonShapesInternal(cornerSize, cornerSize2);
    }

    private final SplitButtonShapes trailingButtonShapesInternal(CornerSize startCornerSize, CornerSize startCornerSizePressed) {
        return new SplitButtonShapes(trailingButtonShape(startCornerSize), trailingButtonShape(startCornerSizePressed), TrailingCheckedShape);
    }

    /* renamed from: leadingButtonShapesFor-8Feqmps, reason: not valid java name */
    public final SplitButtonShapes m4086leadingButtonShapesFor8Feqmps(float f, Composer composer, int i) {
        SplitButtonShapes leadingButtonShapesInternal;
        ComposerKt.sourceInformationMarkerStart(composer, -1837759118, "C(leadingButtonShapesFor)N(buttonHeight:c#ui.unit.Dp):SplitButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1837759118, i, -1, "androidx.compose.material3.SplitButtonDefaults.leadingButtonShapesFor (SplitButton.kt:498)");
        }
        float m2600getExtraSmallContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2600getExtraSmallContainerHeightD9Ej5fM();
        float m2611getMinHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM();
        float m2608getMediumContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2608getMediumContainerHeightD9Ej5fM();
        float m2605getLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2605getLargeContainerHeightD9Ej5fM();
        float m2597getExtraLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2597getExtraLargeContainerHeightD9Ej5fM();
        float f2 = 2;
        if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2600getExtraSmallContainerHeightD9Ej5fM + m2611getMinHeightD9Ej5fM) / f2)) <= 0) {
            leadingButtonShapesInternal = leadingButtonShapesInternal(ExtraSmallInnerCornerSize, ExtraSmallInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2611getMinHeightD9Ej5fM + m2608getMediumContainerHeightD9Ej5fM) / f2)) <= 0) {
            leadingButtonShapesInternal = leadingButtonShapesInternal(SmallInnerCornerSize, SmallInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2608getMediumContainerHeightD9Ej5fM + m2605getLargeContainerHeightD9Ej5fM) / f2)) <= 0) {
            leadingButtonShapesInternal = leadingButtonShapesInternal(MediumInnerCornerSize, MediumInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2605getLargeContainerHeightD9Ej5fM + m2597getExtraLargeContainerHeightD9Ej5fM) / f2)) <= 0) {
            leadingButtonShapesInternal = leadingButtonShapesInternal(LargeInnerCornerSize, LargeInnerCornerSizePressed);
        } else {
            leadingButtonShapesInternal = leadingButtonShapesInternal(ExtraLargeInnerCornerSize, ExtraLargeInnerCornerSizePressed);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return leadingButtonShapesInternal;
    }

    /* renamed from: trailingButtonShapesFor-8Feqmps, reason: not valid java name */
    public final SplitButtonShapes m4089trailingButtonShapesFor8Feqmps(float f, Composer composer, int i) {
        SplitButtonShapes trailingButtonShapesInternal;
        ComposerKt.sourceInformationMarkerStart(composer, 844928960, "C(trailingButtonShapesFor)N(buttonHeight:c#ui.unit.Dp):SplitButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(844928960, i, -1, "androidx.compose.material3.SplitButtonDefaults.trailingButtonShapesFor (SplitButton.kt:540)");
        }
        float m2600getExtraSmallContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2600getExtraSmallContainerHeightD9Ej5fM();
        float m2611getMinHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM();
        float m2608getMediumContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2608getMediumContainerHeightD9Ej5fM();
        float m2605getLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2605getLargeContainerHeightD9Ej5fM();
        float m2597getExtraLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m2597getExtraLargeContainerHeightD9Ej5fM();
        float f2 = 2;
        if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2600getExtraSmallContainerHeightD9Ej5fM + m2611getMinHeightD9Ej5fM) / f2)) <= 0) {
            trailingButtonShapesInternal = trailingButtonShapesInternal(ExtraSmallInnerCornerSize, ExtraSmallInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2611getMinHeightD9Ej5fM + m2608getMediumContainerHeightD9Ej5fM) / f2)) <= 0) {
            trailingButtonShapesInternal = trailingButtonShapesInternal(SmallInnerCornerSize, SmallInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2608getMediumContainerHeightD9Ej5fM + m2605getLargeContainerHeightD9Ej5fM) / f2)) <= 0) {
            trailingButtonShapesInternal = trailingButtonShapesInternal(MediumInnerCornerSize, MediumInnerCornerSizePressed);
        } else if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(Dp.m9732constructorimpl(m2605getLargeContainerHeightD9Ej5fM + m2597getExtraLargeContainerHeightD9Ej5fM) / f2)) <= 0) {
            trailingButtonShapesInternal = trailingButtonShapesInternal(LargeInnerCornerSize, LargeInnerCornerSizePressed);
        } else {
            trailingButtonShapesInternal = trailingButtonShapesInternal(ExtraLargeInnerCornerSize, ExtraLargeInnerCornerSizePressed);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return trailingButtonShapesInternal;
    }

    /* renamed from: leadingButtonContentPaddingFor-0680j_4, reason: not valid java name */
    public final PaddingValues m4084leadingButtonContentPaddingFor0680j_4(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, SmallContainerHeight) < 0 ? ExtraSmallLeadingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? SmallLeadingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? MediumLeadingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? LargeLeadingButtonContentPadding : ExtraLargeLeadingButtonContentPadding;
    }

    /* renamed from: trailingButtonContentPaddingFor-0680j_4, reason: not valid java name */
    public final PaddingValues m4087trailingButtonContentPaddingFor0680j_4(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, SmallContainerHeight) < 0 ? ExtraSmallTrailingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, MediumContainerHeight) < 0 ? SmallTrailingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, LargeContainerHeight) < 0 ? MediumTrailingButtonContentPadding : Dp.m9731compareTo0680j_4(buttonHeight, ExtraLargeContainerHeight) < 0 ? LargeTrailingButtonContentPadding : ExtraLargeTrailingButtonContentPadding;
    }

    /* renamed from: leadingButtonIconSizeFor-5rwHm24, reason: not valid java name */
    public final float m4085leadingButtonIconSizeFor5rwHm24(float buttonHeight) {
        return ButtonDefaults.INSTANCE.m2614iconSizeFor5rwHm24(buttonHeight);
    }

    /* renamed from: trailingButtonIconSizeFor-5rwHm24, reason: not valid java name */
    public final float m4088trailingButtonIconSizeFor5rwHm24(float buttonHeight) {
        return Dp.m9731compareTo0680j_4(buttonHeight, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM()) < 0 ? ExtraSmallTrailingButtonIconSize : Dp.m9731compareTo0680j_4(buttonHeight, ButtonDefaults.INSTANCE.m2608getMediumContainerHeightD9Ej5fM()) < 0 ? SmallTrailingButtonIconSize : Dp.m9731compareTo0680j_4(buttonHeight, ButtonDefaults.INSTANCE.m2605getLargeContainerHeightD9Ej5fM()) < 0 ? MediumTrailingButtonIconSize : Dp.m9731compareTo0680j_4(buttonHeight, ButtonDefaults.INSTANCE.m2597getExtraLargeContainerHeightD9Ej5fM()) < 0 ? LargeTrailingButtonIconSize : ExtraLargeTrailingButtonIconSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void LeadingButton(final Function0<Unit> function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SplitButtonShapes splitButtonShapes2;
        ButtonColors buttonColors2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final ButtonElevation buttonElevation2;
        Composer composer2;
        final boolean z3;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        SplitButtonShapes splitButtonShapes3;
        Modifier modifier3;
        int i11;
        ButtonElevation buttonElevation3;
        BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeByInteraction;
        State<Dp> shadowElevation$material3;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1842194067);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingButton)N(onClick,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)688@31319L14,689@31375L25,695@31608L22,697@31683L74,703@32027L648,693@31526L1149:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
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
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        splitButtonShapes2 = splitButtonShapes;
                        if (startRestartGroup.changed(splitButtonShapes2)) {
                            i16 = 2048;
                            i4 |= i16;
                        }
                    } else {
                        splitButtonShapes2 = splitButtonShapes;
                    }
                    i16 = 1024;
                    i4 |= i16;
                } else {
                    splitButtonShapes2 = splitButtonShapes;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i15 = 16384;
                            i4 |= i15;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i15 = 8192;
                    i4 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(buttonElevation)) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                        i14 = 8388608;
                        i4 |= i14;
                    }
                    i14 = 4194304;
                    i4 |= i14;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changed(this) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "676@30610L44,677@30702L14,678@30771L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            paddingValues3 = paddingValues;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i11 = i10;
                            i13 = i4;
                            splitButtonShapes3 = splitButtonShapes2;
                            buttonElevation3 = buttonElevation;
                            borderStroke3 = borderStroke;
                        } else {
                            Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 != 0 ? true : z2;
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                                splitButtonShapes3 = m4086leadingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, (i10 << 3) & 112);
                            } else {
                                splitButtonShapes3 = splitButtonShapes2;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                            }
                            int i18 = i4;
                            if ((i3 & 32) != 0) {
                                modifier3 = companion;
                                i11 = i10;
                                buttonElevation3 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i18 &= -458753;
                            } else {
                                modifier3 = companion;
                                i11 = i10;
                                buttonElevation3 = buttonElevation;
                            }
                            borderStroke3 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 128) != 0) {
                                paddingValues3 = m4084leadingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i12 = i18 & (-29360129);
                            } else {
                                paddingValues3 = paddingValues;
                                i12 = i18;
                            }
                            modifier2 = modifier3;
                            i13 = i12;
                            z2 = z4;
                            mutableInteractionSource2 = i8 != 0 ? null : mutableInteractionSource;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1842194067, i13, i11, "androidx.compose.material3.SplitButtonDefaults.LeadingButton (SplitButton.kt:683)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(-287986488);
                            ComposerKt.sourceInformation(startRestartGroup, "685@31130L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 821994106, "CC(remember):SplitButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup.startReplaceGroup(821993455);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource4, startRestartGroup, 0);
                        final long m2569contentColorvNxB06k$material3 = buttonColors2.m2569contentColorvNxB06k$material3(z2);
                        long m2568containerColorvNxB06k$material3 = buttonColors2.m2568containerColorvNxB06k$material3(z2);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 822009385, "CC(remember):SplitButton.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit LeadingButton$lambda$2$0;
                                    LeadingButton$lambda$2$0 = SplitButtonDefaults.LeadingButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                    return LeadingButton$lambda$2$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        BorderStroke borderStroke4 = borderStroke3;
                        mutableInteractionSource = mutableInteractionSource2;
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue2, 1, null);
                        int i19 = i13 >> 9;
                        SplitButtonShapes splitButtonShapes4 = splitButtonShapes3;
                        shapeByInteraction = SplitButtonKt.shapeByInteraction(splitButtonShapes4, LeadingButton$lambda$1(collectIsPressedAsState), false, value, startRestartGroup, (i19 & 14) | 384);
                        splitButtonShapes2 = splitButtonShapes4;
                        if (buttonElevation3 == null) {
                            startRestartGroup.startReplaceGroup(-287245341);
                            startRestartGroup.endReplaceGroup();
                            shadowElevation$material3 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(822018014);
                            ComposerKt.sourceInformation(startRestartGroup, "700@31877L43");
                            shadowElevation$material3 = buttonElevation3.shadowElevation$material3(z2, mutableInteractionSource4, startRestartGroup, (i19 & 896) | ((i13 >> 6) & 14));
                            startRestartGroup.endReplaceGroup();
                        }
                        boolean z5 = z2;
                        SurfaceKt.m4115Surfaceo_FOJdg(function0, semantics$default, z5, shapeByInteraction, m2568containerColorvNxB06k$material3, m2569contentColorvNxB06k$material3, 0.0f, shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-1929660706, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit LeadingButton$lambda$3;
                                LeadingButton$lambda$3 = SplitButtonDefaults.LeadingButton$lambda$3(m2569contentColorvNxB06k$material3, paddingValues3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return LeadingButton$lambda$3;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i13 & 910) | (234881024 & (i13 << 6)), 6, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        buttonElevation2 = buttonElevation3;
                        paddingValues2 = paddingValues3;
                        composer2 = startRestartGroup;
                        z3 = z5;
                        borderStroke2 = borderStroke4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        buttonElevation2 = buttonElevation;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        borderStroke2 = borderStroke;
                        paddingValues2 = paddingValues;
                    }
                    final Modifier modifier4 = modifier2;
                    final SplitButtonShapes splitButtonShapes5 = splitButtonShapes2;
                    final ButtonColors buttonColors3 = buttonColors2;
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit LeadingButton$lambda$4;
                                LeadingButton$lambda$4 = SplitButtonDefaults.LeadingButton$lambda$4(SplitButtonDefaults.this, function0, modifier4, z3, splitButtonShapes5, buttonColors3, buttonElevation2, borderStroke2, paddingValues2, mutableInteractionSource5, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return LeadingButton$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                final Modifier modifier42 = modifier2;
                final SplitButtonShapes splitButtonShapes52 = splitButtonShapes2;
                final ButtonColors buttonColors32 = buttonColors2;
                final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            final Modifier modifier422 = modifier2;
            final SplitButtonShapes splitButtonShapes522 = splitButtonShapes2;
            final ButtonColors buttonColors322 = buttonColors2;
            final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        final Modifier modifier4222 = modifier2;
        final SplitButtonShapes splitButtonShapes5222 = splitButtonShapes2;
        final ButtonColors buttonColors3222 = buttonColors2;
        final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingButton$lambda$3(long j, final PaddingValues paddingValues, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C706@32158L10,707@32195L470,704@32041L624:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1929660706, i, -1, "androidx.compose.material3.SplitButtonDefaults.LeadingButton.<anonymous> (SplitButton.kt:704)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(-772984570, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LeadingButton$lambda$3$0;
                    LeadingButton$lambda$3$0 = SplitButtonDefaults.LeadingButton$lambda$3$0(PaddingValues.this, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return LeadingButton$lambda$3$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingButton$lambda$3$0(PaddingValues paddingValues, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C708@32213L438:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-772984570, i, -1, "androidx.compose.material3.SplitButtonDefaults.LeadingButton.<anonymous>.<anonymous> (SplitButton.kt:708)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, LeadingButtonMinWidth, SmallContainerHeight), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r42v0, types: [androidx.compose.foundation.interaction.MutableInteractionSource, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TrailingButton(final Function0<Unit> function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SplitButtonShapes splitButtonShapes2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final ButtonElevation buttonElevation3;
        Composer composer2;
        final boolean z3;
        final SplitButtonShapes splitButtonShapes3;
        final BorderStroke borderStroke2;
        final PaddingValues paddingValues2;
        final ?? r10;
        ScopeUpdateScope endRestartGroup;
        SplitButtonShapes splitButtonShapes4;
        int i11;
        BorderStroke borderStroke3;
        ButtonElevation buttonElevation4;
        int i12;
        BorderStroke borderStroke4;
        PaddingValues paddingValues3;
        ButtonElevation buttonElevation5;
        BorderStroke borderStroke5;
        PaddingValues paddingValues4;
        int i13;
        InteractionSource interactionSource;
        final Shape shapeByInteraction;
        State<Dp> shadowElevation$material3;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(252202053);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingButton)N(onClick,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)770@35547L14,771@35603L25,772@35680L7,773@35708L64,779@35980L22,787@36330L2046,777@35898L2478:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
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
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        splitButtonShapes2 = splitButtonShapes;
                        if (startRestartGroup.changed(splitButtonShapes2)) {
                            i17 = 2048;
                            i4 |= i17;
                        }
                    } else {
                        splitButtonShapes2 = splitButtonShapes;
                    }
                    i17 = 1024;
                    i4 |= i17;
                } else {
                    splitButtonShapes2 = splitButtonShapes;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i16 = 16384;
                            i4 |= i16;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i16 = 8192;
                    i4 |= i16;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i15 = 131072;
                            i4 |= i15;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i15 = 65536;
                    i4 |= i15;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                        i14 = 8388608;
                        i4 |= i14;
                    }
                    i14 = 4194304;
                    i4 |= i14;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed((Object) mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changed(this) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "758@34836L45,759@34929L14,760@34998L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            borderStroke4 = borderStroke;
                            borderStroke5 = mutableInteractionSource;
                            splitButtonShapes4 = splitButtonShapes2;
                            buttonElevation5 = buttonElevation2;
                            paddingValues4 = paddingValues;
                            i11 = 6;
                            i13 = i4;
                            i12 = i10;
                        } else {
                            Modifier.Companion companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 != 0 ? true : z2;
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                                splitButtonShapes4 = m4089trailingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, (i10 << 3) & 112);
                            } else {
                                splitButtonShapes4 = splitButtonShapes2;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                buttonColors2 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                            }
                            int i19 = i4;
                            if ((i3 & 32) != 0) {
                                i11 = 6;
                                i19 &= -458753;
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                borderStroke3 = null;
                            } else {
                                i11 = 6;
                                borderStroke3 = null;
                                buttonElevation4 = buttonElevation;
                            }
                            i12 = i10;
                            borderStroke4 = i6 != 0 ? borderStroke3 : borderStroke;
                            if ((i3 & 128) != 0) {
                                paddingValues3 = m4087trailingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i19 &= -29360129;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            if (i8 != 0) {
                                ButtonElevation buttonElevation6 = buttonElevation4;
                                modifier2 = companion;
                                buttonElevation5 = buttonElevation6;
                                borderStroke5 = borderStroke3;
                            } else {
                                ButtonElevation buttonElevation7 = buttonElevation4;
                                modifier2 = companion;
                                buttonElevation5 = buttonElevation7;
                                borderStroke5 = mutableInteractionSource;
                            }
                            paddingValues4 = paddingValues3;
                            z2 = z4;
                            i13 = i19;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(252202053, i13, i12, "androidx.compose.material3.SplitButtonDefaults.TrailingButton (SplitButton.kt:765)");
                        }
                        if (borderStroke5 == null) {
                            startRestartGroup.startReplaceGroup(1454234998);
                            ComposerKt.sourceInformation(startRestartGroup, "767@35358L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1848026124, "CC(remember):SplitButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            interactionSource = (MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup.startReplaceGroup(1848025473);
                            startRestartGroup.endReplaceGroup();
                            interactionSource = borderStroke5;
                        }
                        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, i11);
                        InteractionSource interactionSource2 = interactionSource;
                        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource2, startRestartGroup, 0);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LayoutDirection layoutDirection = (LayoutDirection) consume;
                        int i20 = i13 >> 9;
                        SplitButtonShapes splitButtonShapes5 = splitButtonShapes4;
                        shapeByInteraction = SplitButtonKt.shapeByInteraction(splitButtonShapes5, TrailingButton$lambda$1(collectIsPressedAsState), false, value, startRestartGroup, (i20 & 14) | 384);
                        final long m2569contentColorvNxB06k$material3 = buttonColors2.m2569contentColorvNxB06k$material3(z2);
                        long m2568containerColorvNxB06k$material3 = buttonColors2.m2568containerColorvNxB06k$material3(z2);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1848046011, "CC(remember):SplitButton.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TrailingButton$lambda$2$0;
                                    TrailingButton$lambda$2$0 = SplitButtonDefaults.TrailingButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                    return TrailingButton$lambda$2$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        BorderStroke borderStroke6 = borderStroke4;
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue2, 1, null);
                        if (buttonElevation5 == null) {
                            startRestartGroup.startReplaceGroup(1455050545);
                            startRestartGroup.endReplaceGroup();
                            shadowElevation$material3 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(1848052432);
                            ComposerKt.sourceInformation(startRestartGroup, "784@36180L43");
                            shadowElevation$material3 = buttonElevation5.shadowElevation$material3(z2, interactionSource2, startRestartGroup, ((i13 >> 6) & 14) | (i20 & 896));
                            startRestartGroup.endReplaceGroup();
                        }
                        final PaddingValues paddingValues5 = paddingValues4;
                        boolean z5 = z2;
                        SurfaceKt.m4115Surfaceo_FOJdg(function0, semantics$default, z5, shapeByInteraction, m2568containerColorvNxB06k$material3, m2569contentColorvNxB06k$material3, 0.0f, shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke6, interactionSource, ComposableLambdaKt.rememberComposableLambda(-711178918, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TrailingButton$lambda$3;
                                TrailingButton$lambda$3 = SplitButtonDefaults.TrailingButton$lambda$3(m2569contentColorvNxB06k$material3, shapeByInteraction, paddingValues5, layoutDirection, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return TrailingButton$lambda$3;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i13 & 910) | ((i13 << 6) & 234881024), 6, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        splitButtonShapes3 = splitButtonShapes5;
                        buttonElevation3 = buttonElevation5;
                        paddingValues2 = paddingValues5;
                        composer2 = startRestartGroup;
                        z3 = z5;
                        borderStroke2 = borderStroke6;
                        r10 = borderStroke5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        buttonElevation3 = buttonElevation;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        splitButtonShapes3 = splitButtonShapes2;
                        borderStroke2 = borderStroke;
                        paddingValues2 = paddingValues;
                        r10 = mutableInteractionSource;
                    }
                    final Modifier modifier3 = modifier2;
                    final ButtonColors buttonColors3 = buttonColors2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TrailingButton$lambda$4;
                                TrailingButton$lambda$4 = SplitButtonDefaults.TrailingButton$lambda$4(SplitButtonDefaults.this, function0, modifier3, z3, splitButtonShapes3, buttonColors3, buttonElevation3, borderStroke2, paddingValues2, r10, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TrailingButton$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                final Modifier modifier32 = modifier2;
                final ButtonColors buttonColors32 = buttonColors2;
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
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            final Modifier modifier322 = modifier2;
            final ButtonColors buttonColors322 = buttonColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        final Modifier modifier3222 = modifier2;
        final ButtonColors buttonColors3222 = buttonColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$3(long j, final Shape shape, final PaddingValues paddingValues, final LayoutDirection layoutDirection, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C790@36461L10,791@36498L1868,788@36344L2022:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-711178918, i, -1, "androidx.compose.material3.SplitButtonDefaults.TrailingButton.<anonymous> (SplitButton.kt:788)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(786042930, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrailingButton$lambda$3$0;
                    TrailingButton$lambda$3$0 = SplitButtonDefaults.TrailingButton$lambda$3$0(Shape.this, paddingValues, layoutDirection, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return TrailingButton$lambda$3$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$3$0(Shape shape, PaddingValues paddingValues, LayoutDirection layoutDirection, Function3 function3, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C792@36516L1836:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(786042930, i, -1, "androidx.compose.material3.SplitButtonDefaults.TrailingButton.<anonymous>.<anonymous> (SplitButton.kt:792)");
            }
            Modifier m1255defaultMinSizeVpY3zN4 = SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, TrailingButtonMinWidth, SmallContainerHeight);
            if (shape instanceof ShapeWithHorizontalCenterOptically) {
                companion = HorizontalCenterOpticallyKt.m3278horizontalCenterOptically4j6BHR0(Modifier.INSTANCE, (ShapeWithHorizontalCenterOptically) shape, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), PaddingKt.calculateEndPadding(paddingValues, layoutDirection));
            } else if (shape instanceof CornerBasedShape) {
                companion = HorizontalCenterOpticallyKt.m3277horizontalCenterOptically4j6BHR0(Modifier.INSTANCE, (CornerBasedShape) shape, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), PaddingKt.calculateEndPadding(paddingValues, layoutDirection));
            } else {
                companion = Modifier.INSTANCE;
            }
            Modifier padding = PaddingKt.padding(m1255defaultMinSizeVpY3zN4.then(companion), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Removed duplicated region for block: B:129:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TrailingButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        Composer composer2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final boolean z4;
        final SplitButtonShapes splitButtonShapes2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        SplitButtonShapes splitButtonShapes3;
        int i12;
        ButtonColors buttonColors4;
        Modifier modifier4;
        int i13;
        int i14;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues3;
        int i15;
        BorderStroke borderStroke3;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shapeByInteraction;
        Shape shape;
        LayoutDirection layoutDirection;
        State<Dp> shadowElevation$material3;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1676067170);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)884@41634L14,885@41690L25,886@41767L7,887@41810L7,888@41838L66,897@42202L417,907@42651L22,915@43001L2046,892@42030L3017:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(splitButtonShapes)) {
                        i18 = 16384;
                        i4 |= i18;
                    }
                    i18 = 8192;
                    i4 |= i18;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    buttonColors2 = buttonColors;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(buttonColors2)) ? 131072 : 65536;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((i & 1572864) == 0) {
                    buttonElevation2 = buttonElevation;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(buttonElevation2)) ? 1048576 : 524288;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i17 = 67108864;
                        i4 |= i17;
                    }
                    i17 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i17;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    i10 = i9;
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i11 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "872@40923L45,873@41016L14,874@41085L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i20 = (i3 & 16) != 0 ? i11 & (-57345) : i11;
                            if ((i3 & 32) != 0) {
                                i20 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i20 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i20 &= -234881025;
                            }
                            splitButtonShapes3 = splitButtonShapes;
                            borderStroke3 = borderStroke;
                            paddingValues3 = paddingValues;
                            buttonElevation4 = buttonElevation2;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i16 = i20;
                            i13 = i10;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i5 != 0 ? true : z3;
                            if ((i3 & 16) != 0) {
                                i12 = i11 & (-57345);
                                splitButtonShapes3 = m4089trailingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, i10 & 112);
                            } else {
                                splitButtonShapes3 = splitButtonShapes;
                                i12 = i11;
                            }
                            if ((i3 & 32) != 0) {
                                i12 &= -458753;
                                buttonColors4 = ButtonDefaults.INSTANCE.buttonColors(startRestartGroup, 6);
                            } else {
                                buttonColors4 = buttonColors2;
                            }
                            int i21 = i12;
                            if ((i3 & 64) != 0) {
                                modifier4 = companion;
                                i13 = i10;
                                i14 = i6;
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i21 &= -3670017;
                            } else {
                                modifier4 = companion;
                                i13 = i10;
                                i14 = i6;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i14 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues3 = m4087trailingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i15 = i21 & (-234881025);
                            } else {
                                paddingValues3 = paddingValues;
                                i15 = i21;
                            }
                            modifier2 = modifier4;
                            borderStroke3 = borderStroke4;
                            i16 = i15;
                            z3 = z5;
                            buttonColors2 = buttonColors4;
                            mutableInteractionSource2 = i8 != 0 ? null : mutableInteractionSource;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1676067170, i16, i13, "androidx.compose.material3.SplitButtonDefaults.TrailingButton (SplitButton.kt:879)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(-1572006375);
                            ComposerKt.sourceInformation(startRestartGroup, "881@41445L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 87837449, "CC(remember):SplitButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(87836798);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource4, startRestartGroup, 0);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        mutableInteractionSource = mutableInteractionSource2;
                        final PaddingValues paddingValues4 = paddingValues3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LayoutDirection layoutDirection2 = (LayoutDirection) consume;
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume2;
                        int i22 = i16 >> 12;
                        int i23 = i16 << 6;
                        SplitButtonShapes splitButtonShapes4 = splitButtonShapes3;
                        shapeByInteraction = SplitButtonKt.shapeByInteraction(splitButtonShapes4, TrailingButton$lambda$6(collectIsPressedAsState), z, value, startRestartGroup, (i22 & 14) | (i23 & 896));
                        final long m2569contentColorvNxB06k$material3 = buttonColors2.m2569contentColorvNxB06k$material3(z3);
                        long m2568containerColorvNxB06k$material3 = buttonColors2.m2568containerColorvNxB06k$material3(z3);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 87862051, "CC(remember):SplitButton.kt#9igjgp");
                        ButtonColors buttonColors5 = buttonColors2;
                        boolean changed = ((i16 & 14) == 4) | startRestartGroup.changed(shapeByInteraction) | startRestartGroup.changed(layoutDirection2.ordinal()) | startRestartGroup.changed(density) | startRestartGroup.changed(m2569contentColorvNxB06k$material3);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TrailingButton$lambda$7$0;
                                    TrailingButton$lambda$7$0 = SplitButtonDefaults.TrailingButton$lambda$7$0(z, shapeByInteraction, layoutDirection2, density, m2569contentColorvNxB06k$material3, (ContentDrawScope) obj);
                                    return TrailingButton$lambda$7$0;
                                }
                            };
                            shape = shapeByInteraction;
                            layoutDirection = layoutDirection2;
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            layoutDirection = layoutDirection2;
                            shape = shapeByInteraction;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier drawWithContent = DrawModifierKt.drawWithContent(modifier2, (Function1) rememberedValue2);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 87876024, "CC(remember):SplitButton.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TrailingButton$lambda$8$0;
                                    TrailingButton$lambda$8$0 = SplitButtonDefaults.TrailingButton$lambda$8$0((SemanticsPropertyReceiver) obj);
                                    return TrailingButton$lambda$8$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LayoutDirection layoutDirection3 = layoutDirection;
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(drawWithContent, false, (Function1) rememberedValue3, 1, null);
                        if (buttonElevation4 == null) {
                            startRestartGroup.startReplaceGroup(-1570611500);
                            startRestartGroup.endReplaceGroup();
                            shadowElevation$material3 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(87882445);
                            ComposerKt.sourceInformation(startRestartGroup, "912@42851L43");
                            shadowElevation$material3 = buttonElevation4.shadowElevation$material3(z3, mutableInteractionSource4, startRestartGroup, ((i16 >> 9) & 14) | (i22 & 896));
                            startRestartGroup.endReplaceGroup();
                        }
                        final Shape shape2 = shape;
                        boolean z6 = z3;
                        SurfaceKt.m4114Surfaced85dljk(z, function1, semantics$default, z6, shape, m2568containerColorvNxB06k$material3, m2569contentColorvNxB06k$material3, 0.0f, shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0), borderStroke3, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(1245690872, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TrailingButton$lambda$9;
                                TrailingButton$lambda$9 = SplitButtonDefaults.TrailingButton$lambda$9(m2569contentColorvNxB06k$material3, shape2, paddingValues4, layoutDirection3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return TrailingButton$lambda$9;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i16 & 7294) | (i23 & 1879048192), 48, 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues4;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        z4 = z6;
                        borderStroke2 = borderStroke3;
                        splitButtonShapes2 = splitButtonShapes4;
                        buttonColors3 = buttonColors5;
                        buttonElevation3 = buttonElevation4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        buttonColors3 = buttonColors2;
                        buttonElevation3 = buttonElevation2;
                        z4 = z3;
                        splitButtonShapes2 = splitButtonShapes;
                        paddingValues2 = paddingValues;
                    }
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TrailingButton$lambda$10;
                                TrailingButton$lambda$10 = SplitButtonDefaults.TrailingButton$lambda$10(SplitButtonDefaults.this, z, function1, modifier3, z4, splitButtonShapes2, buttonColors3, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource5, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TrailingButton$lambda$10;
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
                i10 = i9;
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i11 & 1)) {
                }
                final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i10 = i9;
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i11 & 1)) {
            }
            final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i11 & 1)) {
        }
        final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$7$0(boolean z, Shape shape, LayoutDirection layoutDirection, Density density, long j, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (z) {
            OutlineKt.m7070drawOutlinewDX37Ww$default(contentDrawScope, shape.mo422createOutlinePq9zytI(contentDrawScope.mo7294getSizeNHjbRc(), layoutDirection, density), j, 0.1f, null, null, 0, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$8$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$9(long j, final Shape shape, final PaddingValues paddingValues, final LayoutDirection layoutDirection, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C918@43132L10,919@43169L1868,916@43015L2022:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1245690872, i, -1, "androidx.compose.material3.SplitButtonDefaults.TrailingButton.<anonymous> (SplitButton.kt:916)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(802238160, true, new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrailingButton$lambda$9$0;
                    TrailingButton$lambda$9$0 = SplitButtonDefaults.TrailingButton$lambda$9$0(Shape.this, paddingValues, layoutDirection, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return TrailingButton$lambda$9$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingButton$lambda$9$0(Shape shape, PaddingValues paddingValues, LayoutDirection layoutDirection, Function3 function3, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C920@43187L1836:SplitButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802238160, i, -1, "androidx.compose.material3.SplitButtonDefaults.TrailingButton.<anonymous>.<anonymous> (SplitButton.kt:920)");
            }
            Modifier m1255defaultMinSizeVpY3zN4 = SizeKt.m1255defaultMinSizeVpY3zN4(Modifier.INSTANCE, TrailingButtonMinWidth, SmallContainerHeight);
            if (shape instanceof ShapeWithHorizontalCenterOptically) {
                companion = HorizontalCenterOpticallyKt.m3278horizontalCenterOptically4j6BHR0(Modifier.INSTANCE, (ShapeWithHorizontalCenterOptically) shape, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), PaddingKt.calculateEndPadding(paddingValues, layoutDirection));
            } else if (shape instanceof CornerBasedShape) {
                companion = HorizontalCenterOpticallyKt.m3277horizontalCenterOptically4j6BHR0(Modifier.INSTANCE, (CornerBasedShape) shape, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), PaddingKt.calculateEndPadding(paddingValues, layoutDirection));
            } else {
                companion = Modifier.INSTANCE;
            }
            Modifier padding = PaddingKt.padding(m1255defaultMinSizeVpY3zN4.then(companion), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TonalLeadingButton(final Function0<Unit> function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SplitButtonShapes splitButtonShapes2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final SplitButtonShapes splitButtonShapes3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes4;
        int i10;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues3;
        PaddingValues paddingValues4;
        Composer composer3;
        SplitButtonShapes splitButtonShapes5;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        ButtonElevation buttonElevation5;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-917261679);
        ComposerKt.sourceInformation(startRestartGroup, "C(TonalLeadingButton)N(onClick,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1002@47665L368:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        splitButtonShapes2 = splitButtonShapes;
                        if (startRestartGroup.changed(splitButtonShapes2)) {
                            i15 = 2048;
                            i4 |= i15;
                        }
                    } else {
                        splitButtonShapes2 = splitButtonShapes;
                    }
                    i15 = 1024;
                    i4 |= i15;
                } else {
                    splitButtonShapes2 = splitButtonShapes;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i13 = 131072;
                            i4 |= i13;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i13 = 65536;
                    i4 |= i13;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                        i12 = 8388608;
                        i4 |= i12;
                    }
                    i12 = 4194304;
                    i4 |= i12;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changed(this) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "994@47204L44,995@47296L25,996@47376L28");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            boolean z5 = z2;
                            i11 = i4;
                            z4 = z5;
                            paddingValues4 = paddingValues;
                            i10 = i9;
                            companion = modifier2;
                            splitButtonShapes5 = splitButtonShapes2;
                            buttonElevation5 = buttonElevation2;
                            borderStroke3 = borderStroke;
                            composer3 = startRestartGroup;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z2 : true;
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                                splitButtonShapes4 = m4086leadingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, (i9 << 3) & 112);
                            } else {
                                splitButtonShapes4 = splitButtonShapes2;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                buttonColors2 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                            }
                            int i17 = i4;
                            if ((i3 & 32) != 0) {
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2596filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i17 &= -458753;
                                i10 = i9;
                            } else {
                                i10 = i9;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 128) != 0) {
                                paddingValues3 = m4084leadingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i17 &= -29360129;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            paddingValues4 = paddingValues3;
                            composer3 = startRestartGroup;
                            if (i8 != 0) {
                                i11 = i17;
                                mutableInteractionSource3 = null;
                                borderStroke3 = borderStroke4;
                                splitButtonShapes5 = splitButtonShapes4;
                            } else {
                                splitButtonShapes5 = splitButtonShapes4;
                                i11 = i17;
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke3 = borderStroke4;
                            }
                            buttonElevation5 = buttonElevation4;
                            z4 = z6;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-917261679, i11, i10, "androidx.compose.material3.SplitButtonDefaults.TonalLeadingButton (SplitButton.kt:1001)");
                        }
                        ButtonColors buttonColors4 = buttonColors2;
                        LeadingButton(function0, companion, z4, splitButtonShapes5, buttonColors4, buttonElevation5, borderStroke3, paddingValues4, mutableInteractionSource3, function3, composer3, 2147483646 & i11, i10 & 14, 0);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        Composer composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        paddingValues2 = paddingValues4;
                        borderStroke2 = borderStroke3;
                        buttonElevation3 = buttonElevation5;
                        buttonColors3 = buttonColors4;
                        splitButtonShapes3 = splitButtonShapes5;
                        z3 = z4;
                        modifier3 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        modifier3 = modifier2;
                        z3 = z2;
                        splitButtonShapes3 = splitButtonShapes2;
                        buttonColors3 = buttonColors2;
                        buttonElevation3 = buttonElevation2;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TonalLeadingButton$lambda$0;
                                TonalLeadingButton$lambda$0 = SplitButtonDefaults.TonalLeadingButton$lambda$0(SplitButtonDefaults.this, function0, modifier3, z3, splitButtonShapes3, buttonColors3, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TonalLeadingButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
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
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TonalTrailingButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ButtonColors buttonColors2;
        final ButtonElevation buttonElevation2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        int i10;
        final BorderStroke borderStroke2;
        final ButtonColors buttonColors3;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final SplitButtonShapes splitButtonShapes2;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes3;
        int i11;
        int i12;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues4;
        BorderStroke borderStroke3;
        Composer composer3;
        SplitButtonShapes splitButtonShapes4;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        ButtonElevation buttonElevation4;
        boolean z5;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(668685092);
        ComposerKt.sourceInformation(startRestartGroup, "C(TonalTrailingButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1065@51065L416:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(splitButtonShapes)) {
                        i15 = 16384;
                        i4 |= i15;
                    }
                    i15 = 8192;
                    i4 |= i15;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    buttonColors2 = buttonColors;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(buttonColors2)) ? 131072 : 65536;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((i & 1572864) == 0) {
                    buttonElevation2 = buttonElevation;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(buttonElevation2)) ? 1048576 : 524288;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        paddingValues2 = paddingValues;
                        if (startRestartGroup.changed(paddingValues2)) {
                            i14 = 67108864;
                            i4 |= i14;
                        }
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i14;
                } else {
                    paddingValues2 = paddingValues;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1057@50602L45,1058@50695L25,1059@50775L28");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            i12 = i10;
                            buttonElevation4 = buttonElevation2;
                            composer3 = startRestartGroup;
                            companion = modifier2;
                            splitButtonShapes4 = splitButtonShapes;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i13 = i4;
                            z5 = z3;
                        } else {
                            companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z3 : true;
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                splitButtonShapes3 = m4089trailingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, i10 & 112);
                            } else {
                                splitButtonShapes3 = splitButtonShapes;
                            }
                            if ((i3 & 32) != 0) {
                                buttonColors2 = ButtonDefaults.INSTANCE.filledTonalButtonColors(startRestartGroup, 6);
                                i4 &= -458753;
                            }
                            int i17 = i4;
                            ButtonColors buttonColors4 = buttonColors2;
                            if ((i3 & 64) != 0) {
                                i11 = -234881025;
                                i12 = i10;
                                buttonElevation3 = ButtonDefaults.INSTANCE.m2596filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i17 &= -3670017;
                            } else {
                                i11 = -234881025;
                                i12 = i10;
                                buttonElevation3 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues4 = m4087trailingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i17 &= i11;
                            } else {
                                paddingValues4 = paddingValues;
                            }
                            borderStroke3 = borderStroke4;
                            paddingValues2 = paddingValues4;
                            composer3 = startRestartGroup;
                            if (i8 != 0) {
                                buttonColors2 = buttonColors4;
                                i13 = i17;
                                buttonElevation4 = buttonElevation3;
                                mutableInteractionSource3 = null;
                                splitButtonShapes4 = splitButtonShapes3;
                            } else {
                                splitButtonShapes4 = splitButtonShapes3;
                                buttonColors2 = buttonColors4;
                                i13 = i17;
                                mutableInteractionSource3 = mutableInteractionSource;
                                buttonElevation4 = buttonElevation3;
                            }
                            z5 = z6;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(668685092, i13, i12, "androidx.compose.material3.SplitButtonDefaults.TonalTrailingButton (SplitButton.kt:1064)");
                        }
                        int i18 = i12 & 126;
                        Modifier modifier4 = companion;
                        TrailingButton(z, function1, modifier4, z5, splitButtonShapes4, buttonColors2, buttonElevation4, borderStroke3, paddingValues2, mutableInteractionSource3, function3, composer3, 2147483646 & i13, i18, 0);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        Composer composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        paddingValues3 = paddingValues2;
                        borderStroke2 = borderStroke3;
                        buttonElevation2 = buttonElevation4;
                        buttonColors3 = buttonColors2;
                        splitButtonShapes2 = splitButtonShapes4;
                        z4 = z5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        buttonColors3 = buttonColors2;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        z4 = z3;
                        splitButtonShapes2 = splitButtonShapes;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TonalTrailingButton$lambda$0;
                                TonalTrailingButton$lambda$0 = SplitButtonDefaults.TonalTrailingButton$lambda$0(SplitButtonDefaults.this, z, function1, modifier3, z4, splitButtonShapes2, buttonColors3, buttonElevation2, borderStroke2, paddingValues3, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TonalTrailingButton$lambda$0;
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
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedLeadingButton(final Function0<Unit> function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SplitButtonShapes splitButtonShapes2;
        ButtonColors buttonColors2;
        int i6;
        int i7;
        int i8;
        int i9;
        final ButtonElevation buttonElevation2;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final boolean z3;
        final SplitButtonShapes splitButtonShapes3;
        final ButtonColors buttonColors3;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes4;
        ButtonColors buttonColors4;
        BorderStroke borderStroke3;
        PaddingValues paddingValues3;
        int i10;
        ButtonElevation buttonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        SplitButtonShapes splitButtonShapes5;
        BorderStroke borderStroke4;
        ButtonColors buttonColors5;
        PaddingValues paddingValues4;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(313588817);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedLeadingButton)N(onClick,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1123@54106L368:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
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
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        splitButtonShapes2 = splitButtonShapes;
                        if (startRestartGroup.changed(splitButtonShapes2)) {
                            i13 = 2048;
                            i4 |= i13;
                        }
                    } else {
                        splitButtonShapes2 = splitButtonShapes;
                    }
                    i13 = 1024;
                    i4 |= i13;
                } else {
                    splitButtonShapes2 = splitButtonShapes;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i12 = 16384;
                            i4 |= i12;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i12 = 8192;
                    i4 |= i12;
                } else {
                    buttonColors2 = buttonColors;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(buttonElevation) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(borderStroke)) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                        i11 = 8388608;
                        i4 |= i11;
                    }
                    i11 = 4194304;
                    i4 |= i11;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changed(this) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1115@53647L44,1116@53739L22,1118@53854L29");
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
                            borderStroke4 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            companion = modifier2;
                            splitButtonShapes5 = splitButtonShapes2;
                            buttonColors5 = buttonColors2;
                            paddingValues4 = paddingValues;
                            i10 = i4;
                            buttonElevation3 = buttonElevation;
                        } else {
                            companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 8) != 0) {
                                splitButtonShapes4 = m4086leadingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, (i9 << 3) & 112);
                                i4 &= -7169;
                            } else {
                                splitButtonShapes4 = splitButtonShapes2;
                            }
                            if ((i3 & 16) != 0) {
                                buttonColors4 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                i4 &= -57345;
                            } else {
                                buttonColors4 = buttonColors2;
                            }
                            ButtonElevation buttonElevation4 = i6 != 0 ? null : buttonElevation;
                            if ((i3 & 64) != 0) {
                                borderStroke3 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, startRestartGroup, ((i4 >> 6) & 14) | 48, 0);
                                i4 &= -3670017;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i3 & 128) != 0) {
                                paddingValues3 = m4084leadingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i4 = (-29360129) & i4;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            ButtonElevation buttonElevation5 = buttonElevation4;
                            i10 = i4;
                            buttonElevation3 = buttonElevation5;
                            mutableInteractionSource3 = i8 == 0 ? mutableInteractionSource : null;
                            splitButtonShapes5 = splitButtonShapes4;
                            borderStroke4 = borderStroke3;
                            buttonColors5 = buttonColors4;
                            paddingValues4 = paddingValues3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(313588817, i10, i9, "androidx.compose.material3.SplitButtonDefaults.OutlinedLeadingButton (SplitButton.kt:1122)");
                        }
                        int i15 = i9 & 14;
                        Modifier modifier4 = companion;
                        boolean z4 = z2;
                        LeadingButton(function0, modifier4, z4, splitButtonShapes5, buttonColors5, buttonElevation3, borderStroke4, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, i10 & 2147483646, i15, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        paddingValues2 = paddingValues4;
                        borderStroke2 = borderStroke4;
                        buttonElevation2 = buttonElevation3;
                        buttonColors3 = buttonColors5;
                        splitButtonShapes3 = splitButtonShapes5;
                        z3 = z4;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        buttonElevation2 = buttonElevation;
                        paddingValues2 = paddingValues;
                        modifier3 = modifier2;
                        z3 = z2;
                        splitButtonShapes3 = splitButtonShapes2;
                        buttonColors3 = buttonColors2;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedLeadingButton$lambda$0;
                                OutlinedLeadingButton$lambda$0 = SplitButtonDefaults.OutlinedLeadingButton$lambda$0(SplitButtonDefaults.this, function0, modifier3, z3, splitButtonShapes3, buttonColors3, buttonElevation2, borderStroke2, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedLeadingButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTrailingButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ButtonColors buttonColors2;
        int i6;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        final MutableInteractionSource mutableInteractionSource2;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final boolean z4;
        final SplitButtonShapes splitButtonShapes2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes3;
        BorderStroke borderStroke4;
        PaddingValues paddingValues3;
        BorderStroke borderStroke5;
        SplitButtonShapes splitButtonShapes4;
        boolean z5;
        int i11;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues4;
        MutableInteractionSource mutableInteractionSource3;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1064632676);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTrailingButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1186@57507L416:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(splitButtonShapes)) {
                        i14 = 16384;
                        i4 |= i14;
                    }
                    i14 = 8192;
                    i4 |= i14;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    buttonColors2 = buttonColors;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(buttonColors2)) ? 131072 : 65536;
                } else {
                    buttonColors2 = buttonColors;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    buttonElevation2 = buttonElevation;
                } else {
                    buttonElevation2 = buttonElevation;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(buttonElevation2) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i13 = 8388608;
                            i4 |= i13;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i13 = 4194304;
                    i4 |= i13;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i12 = 67108864;
                        i4 |= i12;
                    }
                    i12 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i12;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1178@57046L45,1179@57139L22,1181@57254L29");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            splitButtonShapes4 = splitButtonShapes;
                            i11 = i4;
                            buttonElevation4 = buttonElevation2;
                            borderStroke5 = borderStroke2;
                            companion = modifier2;
                            z5 = z3;
                            paddingValues4 = paddingValues;
                        } else {
                            companion = i15 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 16) != 0) {
                                splitButtonShapes3 = m4089trailingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, i10 & 112);
                                i4 &= -57345;
                            } else {
                                splitButtonShapes3 = splitButtonShapes;
                            }
                            if ((i3 & 32) != 0) {
                                buttonColors2 = ButtonDefaults.INSTANCE.outlinedButtonColors(startRestartGroup, 6);
                                i4 &= -458753;
                            }
                            if (i6 != 0) {
                                buttonElevation2 = null;
                            }
                            if ((i3 & 128) != 0) {
                                borderStroke4 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z3, startRestartGroup, ((i4 >> 9) & 14) | 48, 0);
                                i4 &= -29360129;
                            } else {
                                borderStroke4 = borderStroke2;
                            }
                            if ((i3 & 256) != 0) {
                                paddingValues3 = m4087trailingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i4 = (-234881025) & i4;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            borderStroke5 = borderStroke4;
                            splitButtonShapes4 = splitButtonShapes3;
                            z5 = z3;
                            i11 = i4;
                            buttonElevation4 = buttonElevation2;
                            paddingValues4 = paddingValues3;
                            if (i8 != 0) {
                                mutableInteractionSource3 = null;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1064632676, i11, i10, "androidx.compose.material3.SplitButtonDefaults.OutlinedTrailingButton (SplitButton.kt:1185)");
                                }
                                TrailingButton(z, function1, companion, z5, splitButtonShapes4, buttonColors2, buttonElevation4, borderStroke5, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, 2147483646 & i11, i10 & 126, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource2 = mutableInteractionSource3;
                                paddingValues2 = paddingValues4;
                                borderStroke3 = borderStroke5;
                                buttonElevation3 = buttonElevation4;
                                buttonColors3 = buttonColors2;
                                splitButtonShapes2 = splitButtonShapes4;
                                z4 = z5;
                                modifier3 = companion;
                            }
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TrailingButton(z, function1, companion, z5, splitButtonShapes4, buttonColors2, buttonElevation4, borderStroke5, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, 2147483646 & i11, i10 & 126, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        paddingValues2 = paddingValues4;
                        borderStroke3 = borderStroke5;
                        buttonElevation3 = buttonElevation4;
                        buttonColors3 = buttonColors2;
                        splitButtonShapes2 = splitButtonShapes4;
                        z4 = z5;
                        modifier3 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        buttonColors3 = buttonColors2;
                        buttonElevation3 = buttonElevation2;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                        z4 = z3;
                        splitButtonShapes2 = splitButtonShapes;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedTrailingButton$lambda$0;
                                OutlinedTrailingButton$lambda$0 = SplitButtonDefaults.OutlinedTrailingButton$lambda$0(SplitButtonDefaults.this, z, function1, modifier3, z4, splitButtonShapes2, buttonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedTrailingButton$lambda$0;
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
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ElevatedLeadingButton(final Function0<Unit> function0, Modifier modifier, boolean z, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        SplitButtonShapes splitButtonShapes2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final SplitButtonShapes splitButtonShapes3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation3;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes4;
        int i10;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues3;
        PaddingValues paddingValues4;
        Composer composer3;
        SplitButtonShapes splitButtonShapes5;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        ButtonElevation buttonElevation5;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1113424375);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedLeadingButton)N(onClick,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1244@60544L368:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        splitButtonShapes2 = splitButtonShapes;
                        if (startRestartGroup.changed(splitButtonShapes2)) {
                            i15 = 2048;
                            i4 |= i15;
                        }
                    } else {
                        splitButtonShapes2 = splitButtonShapes;
                    }
                    i15 = 1024;
                    i4 |= i15;
                } else {
                    splitButtonShapes2 = splitButtonShapes;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        if (startRestartGroup.changed(buttonColors2)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i13 = 131072;
                            i4 |= i13;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i13 = 65536;
                    i4 |= i13;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(paddingValues)) {
                        i12 = 8388608;
                        i4 |= i12;
                    }
                    i12 = 4194304;
                    i4 |= i12;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changed(this) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1236@60089L44,1237@60181L22,1238@60258L25");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            boolean z5 = z2;
                            i11 = i4;
                            z4 = z5;
                            paddingValues4 = paddingValues;
                            i10 = i9;
                            companion = modifier2;
                            splitButtonShapes5 = splitButtonShapes2;
                            buttonElevation5 = buttonElevation2;
                            borderStroke3 = borderStroke;
                            composer3 = startRestartGroup;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z2 : true;
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                                splitButtonShapes4 = m4086leadingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, (i9 << 3) & 112);
                            } else {
                                splitButtonShapes4 = splitButtonShapes2;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                buttonColors2 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                            }
                            int i17 = i4;
                            if ((i3 & 32) != 0) {
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2594elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i17 &= -458753;
                                i10 = i9;
                            } else {
                                i10 = i9;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 128) != 0) {
                                paddingValues3 = m4084leadingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i17 &= -29360129;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            paddingValues4 = paddingValues3;
                            composer3 = startRestartGroup;
                            if (i8 != 0) {
                                i11 = i17;
                                mutableInteractionSource3 = null;
                                borderStroke3 = borderStroke4;
                                splitButtonShapes5 = splitButtonShapes4;
                            } else {
                                splitButtonShapes5 = splitButtonShapes4;
                                i11 = i17;
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke3 = borderStroke4;
                            }
                            buttonElevation5 = buttonElevation4;
                            z4 = z6;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1113424375, i11, i10, "androidx.compose.material3.SplitButtonDefaults.ElevatedLeadingButton (SplitButton.kt:1243)");
                        }
                        ButtonColors buttonColors4 = buttonColors2;
                        LeadingButton(function0, companion, z4, splitButtonShapes5, buttonColors4, buttonElevation5, borderStroke3, paddingValues4, mutableInteractionSource3, function3, composer3, 2147483646 & i11, i10 & 14, 0);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        Composer composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        paddingValues2 = paddingValues4;
                        borderStroke2 = borderStroke3;
                        buttonElevation3 = buttonElevation5;
                        buttonColors3 = buttonColors4;
                        splitButtonShapes3 = splitButtonShapes5;
                        z3 = z4;
                        modifier3 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        modifier3 = modifier2;
                        z3 = z2;
                        splitButtonShapes3 = splitButtonShapes2;
                        buttonColors3 = buttonColors2;
                        buttonElevation3 = buttonElevation2;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ElevatedLeadingButton$lambda$0;
                                ElevatedLeadingButton$lambda$0 = SplitButtonDefaults.ElevatedLeadingButton$lambda$0(SplitButtonDefaults.this, function0, modifier3, z3, splitButtonShapes3, buttonColors3, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ElevatedLeadingButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
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
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ElevatedTrailingButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, SplitButtonShapes splitButtonShapes, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ButtonColors buttonColors2;
        final ButtonElevation buttonElevation2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        int i10;
        final BorderStroke borderStroke2;
        final ButtonColors buttonColors3;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final SplitButtonShapes splitButtonShapes2;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        SplitButtonShapes splitButtonShapes3;
        int i11;
        int i12;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues4;
        BorderStroke borderStroke3;
        Composer composer3;
        SplitButtonShapes splitButtonShapes4;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        ButtonElevation buttonElevation4;
        boolean z5;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-361894228);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedTrailingButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)1307@63941L416:SplitButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(splitButtonShapes)) {
                        i15 = 16384;
                        i4 |= i15;
                    }
                    i15 = 8192;
                    i4 |= i15;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    buttonColors2 = buttonColors;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(buttonColors2)) ? 131072 : 65536;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((i & 1572864) == 0) {
                    buttonElevation2 = buttonElevation;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(buttonElevation2)) ? 1048576 : 524288;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        paddingValues2 = paddingValues;
                        if (startRestartGroup.changed(paddingValues2)) {
                            i14 = 67108864;
                            i4 |= i14;
                        }
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i14;
                } else {
                    paddingValues2 = paddingValues;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changed(this) ? 32 : 16;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1299@63484L45,1300@63577L22,1301@63654L25");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            i12 = i10;
                            buttonElevation4 = buttonElevation2;
                            composer3 = startRestartGroup;
                            companion = modifier2;
                            splitButtonShapes4 = splitButtonShapes;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i13 = i4;
                            z5 = z3;
                        } else {
                            companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z3 : true;
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                splitButtonShapes3 = m4089trailingButtonShapesFor8Feqmps(SmallContainerHeight, startRestartGroup, i10 & 112);
                            } else {
                                splitButtonShapes3 = splitButtonShapes;
                            }
                            if ((i3 & 32) != 0) {
                                buttonColors2 = ButtonDefaults.INSTANCE.elevatedButtonColors(startRestartGroup, 6);
                                i4 &= -458753;
                            }
                            int i17 = i4;
                            ButtonColors buttonColors4 = buttonColors2;
                            if ((i3 & 64) != 0) {
                                i11 = -234881025;
                                i12 = i10;
                                buttonElevation3 = ButtonDefaults.INSTANCE.m2594elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i17 &= -3670017;
                            } else {
                                i11 = -234881025;
                                i12 = i10;
                                buttonElevation3 = buttonElevation2;
                            }
                            BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues4 = m4087trailingButtonContentPaddingFor0680j_4(SmallContainerHeight);
                                i17 &= i11;
                            } else {
                                paddingValues4 = paddingValues;
                            }
                            borderStroke3 = borderStroke4;
                            paddingValues2 = paddingValues4;
                            composer3 = startRestartGroup;
                            if (i8 != 0) {
                                buttonColors2 = buttonColors4;
                                i13 = i17;
                                buttonElevation4 = buttonElevation3;
                                mutableInteractionSource3 = null;
                                splitButtonShapes4 = splitButtonShapes3;
                            } else {
                                splitButtonShapes4 = splitButtonShapes3;
                                buttonColors2 = buttonColors4;
                                i13 = i17;
                                mutableInteractionSource3 = mutableInteractionSource;
                                buttonElevation4 = buttonElevation3;
                            }
                            z5 = z6;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-361894228, i13, i12, "androidx.compose.material3.SplitButtonDefaults.ElevatedTrailingButton (SplitButton.kt:1306)");
                        }
                        int i18 = i12 & 126;
                        Modifier modifier4 = companion;
                        TrailingButton(z, function1, modifier4, z5, splitButtonShapes4, buttonColors2, buttonElevation4, borderStroke3, paddingValues2, mutableInteractionSource3, function3, composer3, 2147483646 & i13, i18, 0);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        Composer composer4 = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        composer2 = composer4;
                        paddingValues3 = paddingValues2;
                        borderStroke2 = borderStroke3;
                        buttonElevation2 = buttonElevation4;
                        buttonColors3 = buttonColors2;
                        splitButtonShapes2 = splitButtonShapes4;
                        z4 = z5;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        borderStroke2 = borderStroke;
                        buttonColors3 = buttonColors2;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        z4 = z3;
                        splitButtonShapes2 = splitButtonShapes;
                        paddingValues3 = paddingValues;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SplitButtonDefaults$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ElevatedTrailingButton$lambda$0;
                                ElevatedTrailingButton$lambda$0 = SplitButtonDefaults.ElevatedTrailingButton$lambda$0(SplitButtonDefaults.this, z, function1, modifier3, z4, splitButtonShapes2, buttonColors3, buttonElevation2, borderStroke2, paddingValues3, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ElevatedTrailingButton$lambda$0;
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
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean LeadingButton$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TrailingButton$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TrailingButton$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
