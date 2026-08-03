package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.AppBarTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsSpec;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u0002022\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u000207062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u000202092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002020;2\b\b\u0002\u0010<\u001a\u000207H\u0007¢\u0006\u0002\u0010=J[\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002022\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u000207062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u000202092\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002020;2\b\b\u0002\u0010<\u001a\u000207H\u0007¢\u0006\u0002\u0010>J-\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\u00172\b\b\u0002\u0010B\u001a\u00020\u00172\b\b\u0002\u0010C\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020IH\u0007¢\u0006\u0002\u0010JJK\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020@2\b\b\u0002\u0010N\u001a\u00020\u00172\b\b\u0002\u0010O\u001a\u00020\u00172\b\b\u0002\u0010P\u001a\u00020\u00172\b\b\u0002\u0010Q\u001a\u00020\u00172\b\b\u0002\u0010R\u001a\u00020\u0017H\u0007¢\u0006\u0004\bS\u0010TJõ\u0001\u0010C\u001a\u00020D2\b\b\u0002\u0010U\u001a\u00020\u00172\b\b\u0002\u0010V\u001a\u00020\u00172\b\b\u0002\u0010W\u001a\u00020\u00172\b\b\u0002\u0010X\u001a\u00020\u00172\b\b\u0002\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\u00172\b\b\u0002\u0010\\\u001a\u00020\u00172\b\b\u0002\u0010]\u001a\u00020\u00172\b\b\u0002\u0010^\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u00172\b\b\u0002\u0010`\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020\u00172\b\b\u0002\u0010b\u001a\u00020\u00172\b\b\u0002\u0010c\u001a\u00020\u00172\b\b\u0002\u0010d\u001a\u00020\u00172\b\b\u0002\u0010e\u001a\u00020\u00172\b\b\u0002\u0010f\u001a\u00020\u00172\b\b\u0002\u0010g\u001a\u00020\u00172\b\b\u0002\u0010h\u001a\u00020\u00172\b\b\u0002\u0010i\u001a\u00020\u00172\b\b\u0002\u0010j\u001a\u00020\u00172\b\b\u0002\u0010k\u001a\u00020\u00172\b\b\u0002\u0010l\u001a\u00020\u0017H\u0007¢\u0006\u0004\bm\u0010nJ\u009b\u0002\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020I2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020p0u2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010y\u001a\u0002072\b\b\u0002\u0010z\u001a\u0002072\b\b\u0002\u0010{\u001a\u00020|2\u0015\b\u0002\u0010}\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0015\b\u0002\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\f\b\u0002\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u00112\b\b\u0002\u0010?\u001a\u00020D2\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007¢\u0006\u0003\u0010\u008c\u0001J³\u0002\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020I2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020p0u2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010y\u001a\u0002072\b\b\u0002\u0010z\u001a\u0002072\b\b\u0002\u0010{\u001a\u00020|2\u0015\b\u0002\u0010}\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0015\b\u0002\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\f\b\u0002\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u00112\b\b\u0002\u0010?\u001a\u00020D2\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008e\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0007¢\u0006\u0003\u0010\u0091\u0001J±\u0002\u0010o\u001a\u00020p2\u0006\u0010H\u001a\u00020r2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020p0u2\u0007\u0010\u0092\u0001\u001a\u0002072\u0013\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020p0u2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010y\u001a\u0002072\b\b\u0002\u0010z\u001a\u0002072\b\b\u0002\u0010{\u001a\u00020|2\u0015\b\u0002\u0010}\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0015\b\u0002\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\f\b\u0002\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u00112\b\b\u0002\u0010?\u001a\u00020D2\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007¢\u0006\u0003\u0010\u0094\u0001JÐ\u0001\u0010o\u001a\u00020p2\u0007\u0010\u0095\u0001\u001a\u00020v2\u0013\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020p0u2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020p0u2\u0007\u0010\u0092\u0001\u001a\u0002072\u0013\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020p0u2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010y\u001a\u0002072\u0015\b\u0002\u0010}\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0015\b\u0002\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\u0016\b\u0002\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0018\u000106¢\u0006\u0002\b~2\b\b\u0002\u0010?\u001a\u00020D2\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0007¢\u0006\u0003\u0010\u0097\u0001J%\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\u00172\b\b\u0002\u0010B\u001a\u00020\u0017H\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u009d\u0001\u0010C\u001a\u00020D2\b\b\u0002\u0010U\u001a\u00020\u00172\b\b\u0002\u0010V\u001a\u00020\u00172\b\b\u0002\u0010W\u001a\u00020\u00172\b\b\u0002\u0010X\u001a\u00020\u00172\b\b\u0002\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\u00172\b\b\u0002\u0010\\\u001a\u00020\u00172\b\b\u0002\u0010]\u001a\u00020\u00172\b\b\u0002\u0010^\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u00172\b\b\u0002\u0010`\u001a\u00020\u00172\b\b\u0002\u0010a\u001a\u00020\u00172\b\b\u0002\u0010b\u001a\u00020\u00172\b\b\u0002\u0010c\u001a\u00020\u0017H\u0007¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008b\u0001\u0010C\u001a\u00020D2\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u00172\b\b\u0002\u0010W\u001a\u00020\u00172\b\b\u0002\u0010X\u001a\u00020\u00172\b\b\u0002\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\u00172\b\b\u0002\u0010\\\u001a\u00020\u00172\b\b\u0002\u0010]\u001a\u00020\u00172\b\b\u0002\u0010^\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u00172\b\b\u0002\u0010`\u001a\u00020\u00172\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u00172\b\b\u0002\u0010c\u001a\u00020\u0017H\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u0007R\u0013\u0010\u000e\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u0006 \u0001²\u0006\u000b\u0010¡\u0001\u001a\u000207X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "<init>", "()V", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", "F", "ShadowElevation", "getShadowElevation-D9Ej5fM", "Elevation", "getElevation-D9Ej5fM$annotations", "getElevation-D9Ej5fM", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "inputFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getInputFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "collapsedContainedSearchBarColor", "Landroidx/compose/ui/graphics/Color;", "getCollapsedContainedSearchBarColor", "(Landroidx/compose/runtime/Composer;I)J", "fullScreenContainedSearchBarColor", "getFullScreenContainedSearchBarColor", "dockedShape", "getDockedShape", "dockedDropdownShape", "getDockedDropdownShape", "()Landroidx/compose/ui/graphics/Shape;", "dockedDropdownGapSize", "getDockedDropdownGapSize-D9Ej5fM", "dockedDropdownScrimColor", "getDockedDropdownScrimColor", "AppBarContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getAppBarContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "fullScreenWindowInsets", "getFullScreenWindowInsets", "enterAlwaysSearchBarScrollBehavior", "Landroidx/compose/material3/SearchBarScrollBehavior;", "initialOffset", "", "initialOffsetLimit", "initialContentOffset", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "reverseLayout", "(FFFLkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarScrollBehavior;", "(FFLkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarScrollBehavior;", "colors", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "dividerColor", "inputFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "containedColors", "state", "Landroidx/compose/material3/SearchBarState;", "(Landroidx/compose/material3/SearchBarState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SearchBarColors;", "appBarWithSearchColors", "Landroidx/compose/material3/AppBarWithSearchColors;", "searchBarColors", "scrolledSearchBarContainerColor", "appBarContainerColor", "scrolledAppBarContainerColor", "appBarNavigationIconColor", "appBarActionIconColor", "appBarWithSearchColors-Hformbs", "(Landroidx/compose/material3/SearchBarColors;JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/AppBarWithSearchColors;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "inputFieldColors-JVEmHcM", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "InputField", "", "textFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "searchBarState", "onSearch", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "placeholder", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "prefix", "suffix", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/material3/SearchBarState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/runtime/Composer;IIII)V", "expanded", "onExpandedChange", "(Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "query", "onQueryChange", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "textColor", "placeholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3", "focused"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final PaddingValues AppBarContentPadding;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;
    private static final float dockedDropdownGapSize;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$0(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, SearchBarState searchBarState, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(textFieldState, searchBarState, function1, modifier, z, z2, textStyle, function2, function22, function23, function24, function25, inputTransformation, outputTransformation, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$14(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, SearchBarState searchBarState, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, KeyboardOptions keyboardOptions, TextFieldLineLimits textFieldLineLimits, int i, int i2, int i3, int i4, Composer composer, int i5) {
        searchBarDefaults.InputField(textFieldState, searchBarState, function1, modifier, z, z2, textStyle, function2, function22, function23, function24, function25, inputTransformation, outputTransformation, scrollState, shape, textFieldColors, mutableInteractionSource, keyboardOptions, textFieldLineLimits, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$25(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, Function1 function1, boolean z, Function1 function12, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(textFieldState, function1, z, function12, modifier, z2, z3, textStyle, function2, function22, function23, function24, function25, inputTransformation, outputTransformation, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$34(SearchBarDefaults searchBarDefaults, String str, Function1 function1, Function1 function12, boolean z, Function1 function13, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        searchBarDefaults.InputField(str, function1, function12, z, function13, modifier, z2, function2, function22, function23, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enterAlwaysSearchBarScrollBehavior$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enterAlwaysSearchBarScrollBehavior$lambda$2$0() {
        return true;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3819getElevationD9Ej5fM$annotations() {
    }

    private SearchBarDefaults() {
    }

    static {
        float m5175getLevel0D9Ej5fM = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
        TonalElevation = m5175getLevel0D9Ej5fM;
        ShadowElevation = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
        Elevation = m5175getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m5531getContainerHeightD9Ej5fM();
        dockedDropdownGapSize = Dp.m9732constructorimpl(2);
        AppBarContentPadding = PaddingKt.m1194PaddingValues0680j_4(Dp.m9732constructorimpl(0));
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m3827getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m3826getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3824getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m3825getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1770571533, "C(<get-inputFieldShape>)1670@75337L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:1670)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getFullScreenShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2009956471, "C(<get-fullScreenShape>)1674@75511L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:1674)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getCollapsedContainedSearchBarColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 157047463, "C(<get-collapsedContainedSearchBarColor>)1680@75742L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(157047463, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-collapsedContainedSearchBarColor> (SearchBar.kt:1680)");
        }
        long value = ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getFullScreenContainedSearchBarColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 152622067, "C(<get-fullScreenContainedSearchBarColor>)1687@75991L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152622067, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenContainedSearchBarColor> (SearchBar.kt:1687)");
        }
        long value = ColorSchemeKt.getValue(ColorSchemeKeyTokens.SurfaceContainerLow, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getDockedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1447354121, "C(<get-dockedShape>)1691@76170L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:1691)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getDockedDropdownGapSize-D9Ej5fM, reason: not valid java name */
    public final float m3823getDockedDropdownGapSizeD9Ej5fM() {
        return dockedDropdownGapSize;
    }

    public final long getDockedDropdownScrimColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1757750567, "C(<get-dockedDropdownScrimColor>)1703@76736L5:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757750567, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedDropdownScrimColor> (SearchBar.kt:1703)");
        }
        long m6785copywmQWz5c$default = Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m6785copywmQWz5c$default;
    }

    public final PaddingValues getAppBarContentPadding() {
        return AppBarContentPadding;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1795925906, "C(<get-windowInsets>)1712@77063L29:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:1712)");
        }
        WindowInsets m1300onlybOOhFvg = WindowInsetsKt.m1300onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.m1314plusgK_yJZ4(WindowInsetsSides.INSTANCE.m1324getHorizontalJoeWqyM(), WindowInsetsSides.INSTANCE.m1328getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m1300onlybOOhFvg;
    }

    public final WindowInsets getFullScreenWindowInsets(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1745169224, "C(<get-fullScreenWindowInsets>)1718@77354L11:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1745169224, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenWindowInsets> (SearchBar.kt:1718)");
        }
        WindowInsets safeDrawing = WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return safeDrawing;
    }

    public final SearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior(float f, float f2, float f3, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, boolean z, Composer composer, int i, int i2) {
        final Function0<Boolean> function02;
        ComposerKt.sourceInformationMarkerStart(composer, -1403632762, "C(enterAlwaysSearchBarScrollBehavior)N(initialOffset,initialOffsetLimit,initialContentOffset,canScroll,snapAnimationSpec,flingAnimationSpec,reverseLayout)1749@79130L8,1751@79303L7,1752@79368L26,1766@79878L436,1755@79477L837:SearchBar.kt#uh7d8r");
        final float f4 = (i2 & 1) != 0 ? 0.0f : f;
        final float f5 = (i2 & 2) != 0 ? -3.4028235E38f : f2;
        final float f6 = (i2 & 4) != 0 ? 0.0f : f3;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -271346738, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean enterAlwaysSearchBarScrollBehavior$lambda$0$0;
                        enterAlwaysSearchBarScrollBehavior$lambda$0$0 = SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$0$0();
                        return Boolean.valueOf(enterAlwaysSearchBarScrollBehavior$lambda$0$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            function02 = (Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        final AnimationSpec<Float> value = (i2 & 16) != 0 ? MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6) : animationSpec;
        final DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 32) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        final boolean z2 = (i2 & 64) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1403632762, i, -1, "androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior (SearchBar.kt:1755)");
        }
        boolean z3 = true;
        Object[] objArr = {value, rememberSplineBasedDecay, function02, Boolean.valueOf(z2)};
        Saver<EnterAlwaysSearchBarScrollBehavior, ?> Saver = EnterAlwaysSearchBarScrollBehavior.INSTANCE.Saver(function02, value, rememberSplineBasedDecay);
        ComposerKt.sourceInformationMarkerStart(composer, -271322374, "CC(remember):SearchBar.kt#9igjgp");
        boolean z4 = ((((i & 14) ^ 6) > 4 && composer.changed(f4)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f5)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f6)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(function02)) || (i & 3072) == 2048);
        if ((((3670016 & i) ^ 1572864) <= 1048576 || !composer.changed(z2)) && (i & 1572864) != 1048576) {
            z3 = false;
        }
        boolean changedInstance = z4 | z3 | composer.changedInstance(value) | composer.changedInstance(rememberSplineBasedDecay);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Function0 function03 = new Function0() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior$lambda$1$0;
                    enterAlwaysSearchBarScrollBehavior$lambda$1$0 = SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$1$0(f4, f5, f6, function02, z2, value, rememberSplineBasedDecay);
                    return enterAlwaysSearchBarScrollBehavior$lambda$1$0;
                }
            };
            composer.updateRememberedValue(function03);
            rememberedValue2 = function03;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = (EnterAlwaysSearchBarScrollBehavior) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterAlwaysSearchBarScrollBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior$lambda$1$0(float f, float f2, float f3, Function0 function0, boolean z, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec) {
        return new EnterAlwaysSearchBarScrollBehavior(f, f2, f3, function0, z, animationSpec, decayAnimationSpec);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ SearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior(float f, float f2, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, boolean z, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1222500790, "C(enterAlwaysSearchBarScrollBehavior)N(initialOffset,initialOffsetLimit,canScroll,snapAnimationSpec,flingAnimationSpec,reverseLayout)1784@80611L8,1786@80784L7,1787@80849L26,1790@80958L362:SearchBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        float f3 = f;
        if ((i2 & 2) != 0) {
            f2 = -3.4028235E38f;
        }
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1997774658, "CC(remember):SearchBar.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean enterAlwaysSearchBarScrollBehavior$lambda$2$0;
                        enterAlwaysSearchBarScrollBehavior$lambda$2$0 = SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$2$0();
                        return Boolean.valueOf(enterAlwaysSearchBarScrollBehavior$lambda$2$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function0 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        Function0 function02 = function0;
        if ((i2 & 8) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
        }
        AnimationSpec animationSpec2 = animationSpec;
        DecayAnimationSpec rememberSplineBasedDecay = (i2 & 16) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        boolean z2 = (i2 & 32) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1222500790, i, -1, "androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior (SearchBar.kt:1790)");
        }
        int i3 = i << 3;
        SearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = enterAlwaysSearchBarScrollBehavior(f3, f2, 0.0f, function02, animationSpec2, rememberSplineBasedDecay, z2, composer, (i & 14) | 384 | (i & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterAlwaysSearchBarScrollBehavior;
    }

    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m3821colorsKlgxPg(long j, long j2, TextFieldColors textFieldColors, Composer composer, int i, int i2) {
        int i3;
        TextFieldColors textFieldColors2;
        ComposerKt.sourceInformationMarkerStart(composer, 701925149, "C(colors)N(containerColor:c#ui.graphics.Color,dividerColor:c#ui.graphics.Color,inputFieldColors)1812@81925L5,1813@81992L5,1814@82043L18:SearchBar.kt#uh7d8r");
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if ((i2 & 4) != 0) {
            i3 = i;
            textFieldColors2 = m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, i & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
        } else {
            i3 = i;
            textFieldColors2 = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i3, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:1816)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, textFieldColors2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    public final SearchBarColors containedColors(SearchBarState searchBarState, Composer composer, int i) {
        boolean isExpanded;
        long collapsedContainedSearchBarColor;
        ComposerKt.sourceInformationMarkerStart(composer, -1238720859, "C(containedColors)N(state)1843@83105L32,1844@83185L32,1845@83264L32,1842@83043L272,1839@82943L383:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1238720859, i, -1, "androidx.compose.material3.SearchBarDefaults.containedColors (SearchBar.kt:1832)");
        }
        isExpanded = SearchBarKt.isExpanded(searchBarState);
        if (isExpanded) {
            composer.startReplaceGroup(-373977220);
            ComposerKt.sourceInformation(composer, "1835@82810L33");
            collapsedContainedSearchBarColor = getFullScreenContainedSearchBarColor(composer, (i >> 3) & 14);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-373906819);
            ComposerKt.sourceInformation(composer, "1837@82881L32");
            collapsedContainedSearchBarColor = getCollapsedContainedSearchBarColor(composer, (i >> 3) & 14);
            composer.endReplaceGroup();
        }
        long j = collapsedContainedSearchBarColor;
        int i2 = (i >> 3) & 14;
        int i3 = (i << 6) & 7168;
        SearchBarColors m3821colorsKlgxPg = m3821colorsKlgxPg(j, 0L, m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, getCollapsedContainedSearchBarColor(composer, i2), getCollapsedContainedSearchBarColor(composer, i2), getCollapsedContainedSearchBarColor(composer, i2), composer, 0, 0, i3, 1048575), composer, i3, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3821colorsKlgxPg;
    }

    /* renamed from: appBarWithSearchColors-Hformbs, reason: not valid java name */
    public final AppBarWithSearchColors m3820appBarWithSearchColorsHformbs(SearchBarColors searchBarColors, long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 362658395, "C(appBarWithSearchColors)N(searchBarColors,scrolledSearchBarContainerColor:c#ui.graphics.Color,appBarContainerColor:c#ui.graphics.Color,scrolledAppBarContainerColor:c#ui.graphics.Color,appBarNavigationIconColor:c#ui.graphics.Color,appBarActionIconColor:c#ui.graphics.Color)1864@84072L8,1866@84245L5,1867@84318L5,1868@84407L5,1869@84487L5,1870@84564L5:SearchBar.kt#uh7d8r");
        SearchBarColors m3821colorsKlgxPg = (i2 & 1) != 0 ? m3821colorsKlgxPg(0L, 0L, null, composer, (i >> 9) & 7168, 7) : searchBarColors;
        long value = (i2 & 2) != 0 ? ColorSchemeKt.getValue(ColorSchemeKeyTokens.SurfaceContainerHighest, composer, 6) : j;
        long value2 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(AppBarTokens.INSTANCE.getContainerColor(), composer, 6) : j2;
        long value3 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(AppBarTokens.INSTANCE.getOnScrollContainerColor(), composer, 6) : j3;
        long value4 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(AppBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long value5 = (i2 & 32) != 0 ? ColorSchemeKt.getValue(AppBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(362658395, i, -1, "androidx.compose.material3.SearchBarDefaults.appBarWithSearchColors (SearchBar.kt:1872)");
        }
        AppBarWithSearchColors appBarWithSearchColors = new AppBarWithSearchColors(m3821colorsKlgxPg, value, value2, value3, value4, value5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return appBarWithSearchColors;
    }

    /* renamed from: inputFieldColors-JVEmHcM, reason: not valid java name */
    public final TextFieldColors m3830inputFieldColorsJVEmHcM(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, -2000124979, "C(inputFieldColors)N(focusedTextColor:c#ui.graphics.Color,unfocusedTextColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,selectionColors,focusedLeadingIconColor:c#ui.graphics.Color,unfocusedLeadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,focusedTrailingIconColor:c#ui.graphics.Color,unfocusedTrailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,focusedPlaceholderColor:c#ui.graphics.Color,unfocusedPlaceholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color,focusedPrefixColor:c#ui.graphics.Color,unfocusedPrefixColor:c#ui.graphics.Color,disabledPrefixColor:c#ui.graphics.Color,focusedSuffixColor:c#ui.graphics.Color,unfocusedSuffixColor:c#ui.graphics.Color,disabledSuffixColor:c#ui.graphics.Color,focusedContainerColor:c#ui.graphics.Color,unfocusedContainerColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color)1916@87605L5,1917@87679L5,1919@87774L5,1922@87930L5,1923@88009L7,1924@88092L5,1925@88175L5,1927@88283L5,1930@88459L5,1931@88544L5,1933@88654L5,1936@88832L5,1937@88918L5,1939@89020L5,1942@89189L5,1943@89273L5,1945@89368L5,1948@89537L5,1949@89621L5,1951@89716L5,1958@90038L1360:SearchBar.kt#uh7d8r");
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long value2 = (i4 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long m6785copywmQWz5c$default = (i4 & 4) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long value3 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        if ((i4 & 16) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long value4 = (i4 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long value5 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long m6785copywmQWz5c$default2 = (i4 & 128) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value6 = (i4 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value7 = (i4 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long m6785copywmQWz5c$default3 = (i4 & 1024) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long value8 = (i4 & 2048) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long value9 = (i4 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long m6785copywmQWz5c$default4 = (i4 & 8192) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long value10 = (i4 & 16384) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j14;
        long value11 = (32768 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j15;
        long m6785copywmQWz5c$default5 = (65536 & i4) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value12 = (131072 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j17;
        long value13 = (262144 & i4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j18;
        long m6785copywmQWz5c$default6 = (524288 & i4) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m6821getTransparent0d7_KjU = (1048576 & i4) != 0 ? Color.INSTANCE.m6821getTransparent0d7_KjU() : j20;
        long m6821getTransparent0d7_KjU2 = (2097152 & i4) != 0 ? Color.INSTANCE.m6821getTransparent0d7_KjU() : j21;
        long m6821getTransparent0d7_KjU3 = (i4 & 4194304) != 0 ? Color.INSTANCE.m6821getTransparent0d7_KjU() : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2000124979, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1958)");
        }
        int i5 = i3 << 12;
        int i6 = i2 << 3;
        int i7 = i2 << 18;
        int i8 = i2 >> 24;
        TextFieldColors m4258colors0hiis_0 = TextFieldDefaults.INSTANCE.m4258colors0hiis_0(value, value2, m6785copywmQWz5c$default, 0L, m6821getTransparent0d7_KjU, m6821getTransparent0d7_KjU2, m6821getTransparent0d7_KjU3, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, m6785copywmQWz5c$default2, 0L, value6, value7, m6785copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value8, value9, m6785copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, value10, value11, m6785copywmQWz5c$default5, 0L, value12, value13, m6785copywmQWz5c$default6, 0L, composer, (i & 1022) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | ((i << 15) & 234881024), ((i >> 12) & 14) | (i & 458752) | (i & 3670016) | (i & 29360128) | ((i << 3) & 1879048192), ((i >> 27) & 14) | (i6 & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (33488896 & i6) | ((i2 << 6) & 1879048192), (i8 & 14) | 3072 | (i8 & 112), 1204058760, 2191);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m4258colors0hiis_0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0255  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with keyboardOptions and lineLimits params instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void InputField(final TextFieldState textFieldState, final SearchBarState searchBarState, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        TextStyle textStyle2;
        int i7;
        Function2 function26;
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
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer2;
        final Function2 function27;
        final Function2 function28;
        final InputTransformation inputTransformation2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        final TextStyle textStyle3;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final OutputTransformation outputTransformation2;
        ScopeUpdateScope endRestartGroup;
        TextStyle textStyle4;
        ScrollState scrollState3;
        Shape shape3;
        TextFieldColors textFieldColors3;
        int i22;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        TextFieldColors textFieldColors4;
        int i23;
        boolean z7;
        boolean z8;
        TextStyle textStyle5;
        int i24;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        ScrollState scrollState4;
        Shape shape4;
        Composer startRestartGroup = composer.startRestartGroup(759286022);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputField)N(textFieldState,searchBarState,onSearch,modifier,enabled,readOnly,textStyle,placeholder,leadingIcon,trailingIcon,prefix,suffix,inputTransformation,outputTransformation,scrollState,shape,colors,interactionSource)2011@92538L823:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(searchBarState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            int i26 = 8192;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    textStyle2 = textStyle;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(textStyle2)) ? 1048576 : 524288;
                } else {
                    textStyle2 = textStyle;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    function26 = function2;
                } else {
                    function26 = function2;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 = i8;
                    i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                            i16 = i15;
                        } else if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                        } else {
                            i16 = i15;
                        }
                        int i27 = i14;
                        i17 = i3 & 4096;
                        if (i17 != 0) {
                            i18 = i27 | 384;
                        } else {
                            int i28 = i27;
                            if ((i2 & 384) == 0) {
                                i28 |= startRestartGroup.changed(inputTransformation) ? 256 : 128;
                            }
                            i18 = i28;
                        }
                        i19 = i3 & 8192;
                        if (i19 != 0) {
                            i20 = i18 | 3072;
                        } else {
                            i20 = i18;
                            if ((i2 & 3072) == 0) {
                                i20 |= startRestartGroup.changed(outputTransformation) ? 2048 : 1024;
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                        i26 = 16384;
                                    }
                                    i20 |= i26;
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i20 |= ((i3 & 32768) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i20 |= ((i3 & 65536) == 0 && startRestartGroup.changed(textFieldColors)) ? 1048576 : 524288;
                                }
                                i21 = i3 & 131072;
                                if (i21 == 0) {
                                    i20 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i20 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                }
                                if ((i2 & 100663296) == 0) {
                                    i20 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                }
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "1998@91916L7,2006@92344L21,2007@92390L15,2008@92441L18");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        if ((i3 & 16384) != 0) {
                                            i20 &= -57345;
                                        }
                                        if ((32768 & i3) != 0) {
                                            i20 &= -458753;
                                        }
                                        if ((i3 & 65536) != 0) {
                                            i20 &= -3670017;
                                        }
                                        function214 = function23;
                                        inputTransformation3 = inputTransformation;
                                        outputTransformation3 = outputTransformation;
                                        shape4 = shape;
                                        textFieldColors4 = textFieldColors;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        composer2 = startRestartGroup;
                                        i24 = i4;
                                        modifier4 = modifier2;
                                        z7 = z3;
                                        z8 = z4;
                                        textStyle5 = textStyle2;
                                        function212 = function26;
                                        i23 = i20;
                                        function213 = function22;
                                        function215 = function24;
                                        function216 = function25;
                                        scrollState4 = scrollState;
                                    } else {
                                        Modifier.Companion companion = i25 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z9 = i5 != 0 ? true : z3;
                                        boolean z10 = i6 != 0 ? false : z4;
                                        if ((i3 & 64) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i4 &= -3670017;
                                            textStyle4 = (TextStyle) consume;
                                        } else {
                                            textStyle4 = textStyle2;
                                        }
                                        int i29 = i4;
                                        Function2 function217 = i7 != 0 ? null : function26;
                                        Function2 function218 = i9 != 0 ? null : function22;
                                        Function2 function219 = i11 != 0 ? null : function23;
                                        Function2 function220 = i13 != 0 ? null : function24;
                                        Function2 function221 = i16 != 0 ? null : function25;
                                        InputTransformation inputTransformation4 = i17 != 0 ? null : inputTransformation;
                                        OutputTransformation outputTransformation4 = i19 != 0 ? null : outputTransformation;
                                        if ((i3 & 16384) != 0) {
                                            i20 &= -57345;
                                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        } else {
                                            scrollState3 = scrollState;
                                        }
                                        if ((32768 & i3) != 0) {
                                            Shape inputFieldShape = getInputFieldShape(startRestartGroup, (i20 >> 24) & 14);
                                            i20 &= -458753;
                                            shape3 = inputFieldShape;
                                        } else {
                                            shape3 = shape;
                                        }
                                        int i30 = i20;
                                        if ((i3 & 65536) != 0) {
                                            composer2 = startRestartGroup;
                                            textFieldColors3 = m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, (i30 >> 15) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                            i22 = i30 & (-3670017);
                                        } else {
                                            composer2 = startRestartGroup;
                                            textFieldColors3 = textFieldColors;
                                            i22 = i30;
                                        }
                                        if (i21 != 0) {
                                            modifier4 = companion;
                                            textFieldColors4 = textFieldColors3;
                                            i23 = i22;
                                            z7 = z9;
                                            z8 = z10;
                                            textStyle5 = textStyle4;
                                            i24 = i29;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier4 = companion;
                                            textFieldColors4 = textFieldColors3;
                                            i23 = i22;
                                            z7 = z9;
                                            z8 = z10;
                                            textStyle5 = textStyle4;
                                            i24 = i29;
                                        }
                                        function212 = function217;
                                        function213 = function218;
                                        function214 = function219;
                                        function215 = function220;
                                        function216 = function221;
                                        inputTransformation3 = inputTransformation4;
                                        outputTransformation3 = outputTransformation4;
                                        scrollState4 = scrollState3;
                                        shape4 = shape3;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(759286022, i24, i23, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:2011)");
                                    }
                                    InputField(textFieldState, searchBarState, function1, modifier4, z7, z8, textStyle5, function212, function213, function214, function215, function216, inputTransformation3, outputTransformation3, scrollState4, shape4, textFieldColors4, mutableInteractionSource3, KeyboardOptions.INSTANCE.getDefault(), TextFieldLineLimits.SingleLine.INSTANCE, composer2, i24 & 2147483646, (i23 & 14) | 905969664 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (29360128 & i23), (i23 >> 24) & 14, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    textFieldColors2 = textFieldColors4;
                                    shape2 = shape4;
                                    scrollState2 = scrollState4;
                                    outputTransformation2 = outputTransformation3;
                                    inputTransformation2 = inputTransformation3;
                                    function28 = function216;
                                    function211 = function215;
                                    function210 = function214;
                                    function27 = function213;
                                    function29 = function212;
                                    textStyle3 = textStyle5;
                                    z6 = z8;
                                    z5 = z7;
                                    modifier3 = modifier4;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function27 = function22;
                                    function28 = function25;
                                    inputTransformation2 = inputTransformation;
                                    scrollState2 = scrollState;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z5 = z3;
                                    z6 = z4;
                                    textStyle3 = textStyle2;
                                    function29 = function26;
                                    function210 = function23;
                                    function211 = function24;
                                    outputTransformation2 = outputTransformation;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit InputField$lambda$0;
                                            InputField$lambda$0 = SearchBarDefaults.InputField$lambda$0(SearchBarDefaults.this, textFieldState, searchBarState, function1, modifier3, z5, z6, textStyle3, function29, function27, function210, function211, function28, inputTransformation2, outputTransformation2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return InputField$lambda$0;
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
                        if ((i2 & 1572864) == 0) {
                        }
                        i21 = i3 & 131072;
                        if (i21 == 0) {
                        }
                        if ((i2 & 100663296) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    int i272 = i14;
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                    }
                    i19 = i3 & 8192;
                    if (i19 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i21 = i3 & 131072;
                    if (i21 == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                int i2722 = i14;
                i17 = i3 & 4096;
                if (i17 != 0) {
                }
                i19 = i3 & 8192;
                if (i19 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i21 = i3 & 131072;
                if (i21 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            int i27222 = i14;
            i17 = i3 & 4096;
            if (i17 != 0) {
            }
            i19 = i3 & 8192;
            if (i19 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i21 = i3 & 131072;
            if (i21 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        int i262 = 8192;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        int i272222 = i14;
        i17 = i3 & 4096;
        if (i17 != 0) {
        }
        i19 = i3 & 8192;
        if (i19 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i21 = i3 & 131072;
        if (i21 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x065f, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
    
        if (r15.changed(r131) == false) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final TextFieldState textFieldState, SearchBarState searchBarState, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, KeyboardOptions keyboardOptions, TextFieldLineLimits textFieldLineLimits, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        TextStyle textStyle2;
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final SearchBarState searchBarState2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final InputTransformation inputTransformation2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final KeyboardOptions keyboardOptions2;
        final TextFieldLineLimits textFieldLineLimits2;
        final boolean z5;
        final boolean z6;
        final TextStyle textStyle3;
        final Modifier modifier3;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final OutputTransformation outputTransformation2;
        ScopeUpdateScope endRestartGroup;
        boolean z7;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        ScrollState scrollState3;
        Shape shape3;
        TextFieldColors textFieldColors3;
        int i26;
        Composer composer3;
        TextFieldLineLimits textFieldLineLimits3;
        MutableInteractionSource mutableInteractionSource3;
        final TextFieldColors textFieldColors4;
        KeyboardOptions keyboardOptions3;
        int i27;
        Modifier modifier4;
        boolean z8;
        TextStyle textStyle5;
        int i28;
        Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Shape shape4;
        Composer composer4;
        Function2<? super Composer, ? super Integer, Unit> function216;
        TextFieldLineLimits textFieldLineLimits4;
        MutableInteractionSource mutableInteractionSource4;
        State<Boolean> state;
        boolean z9;
        final SearchBarState searchBarState3;
        Object obj;
        boolean changed;
        FocusManager focusManager;
        boolean changed2;
        Object rememberedValue;
        boolean z10;
        Object rememberedValue2;
        final TextFieldState textFieldState2;
        String str;
        TextFieldDefaults textFieldDefaults;
        ComposableLambda rememberComposableLambda;
        ComposableLambda composableLambda;
        ComposableLambda rememberComposableLambda2;
        final State<Boolean> state2;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changed3;
        SearchBarDefaults$InputField$10$1 rememberedValue4;
        TextFieldState textFieldState3;
        boolean isExpanded;
        boolean z11;
        boolean isExpanded2;
        boolean changed4;
        SearchBarDefaults$InputField$11$1 rememberedValue5;
        Composer startRestartGroup = composer.startRestartGroup(-1767124482);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputField)N(textFieldState,searchBarState,onSearch,modifier,enabled,readOnly,textStyle,placeholder,leadingIcon,trailingIcon,prefix,suffix,inputTransformation,outputTransformation,scrollState,shape,colors,interactionSource,keyboardOptions,lineLimits)2119@98745L25,2120@98816L7,2121@98874L7,2123@98942L34,2124@99021L39,2132@99325L24,2138@99498L721,2156@100469L199,2161@100700L244,2173@101294L44,2198@102559L645,2179@101600L1623,2134@99359L3875,2217@103563L148,2217@103511L200,2224@103823L736,2224@103776L783,2242@104707L330,2242@104665L372:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(searchBarState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i29 = i4 & 8;
        if (i29 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i6 = i4 & 16;
            int i30 = 16384;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i5 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    textStyle2 = textStyle;
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(textStyle2)) ? 1048576 : 524288;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i5 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i10 = i9;
                    i5 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i31 = i15;
                        i18 = i4 & 4096;
                        if (i18 != 0) {
                            i19 = i31 | 384;
                        } else {
                            int i32 = i31;
                            if ((i2 & 384) == 0) {
                                i32 |= startRestartGroup.changed(inputTransformation) ? 256 : 128;
                            }
                            i19 = i32;
                        }
                        i20 = i4 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            i21 = i19;
                            if ((i2 & 3072) == 0) {
                                i21 |= startRestartGroup.changed(outputTransformation) ? 2048 : 1024;
                                if ((i2 & 24576) == 0) {
                                    if ((i4 & 16384) != 0) {
                                    }
                                    i30 = 8192;
                                    i21 |= i30;
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i21 |= ((i4 & 32768) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i21 |= ((i4 & 65536) == 0 && startRestartGroup.changed(textFieldColors)) ? 1048576 : 524288;
                                }
                                i22 = i4 & 131072;
                                if (i22 == 0) {
                                    i21 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i21 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                }
                                i23 = i4 & 262144;
                                if (i23 == 0) {
                                    i21 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    i21 |= startRestartGroup.changed(keyboardOptions) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i24 = i4 & 524288;
                                if (i24 == 0) {
                                    i21 |= 805306368;
                                } else if ((i2 & 805306368) == 0) {
                                    i21 |= startRestartGroup.changed(textFieldLineLimits) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                }
                                if ((i3 & 6) != 0) {
                                    i25 = i3 | (startRestartGroup.changed(this) ? 4 : 2);
                                } else {
                                    i25 = i3;
                                }
                                if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "2092@97364L7,2100@97792L21,2101@97838L15,2102@97889L18");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 64) != 0) {
                                            i5 &= -3670017;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            i21 &= -57345;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i21 &= -458753;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            i21 &= -3670017;
                                        }
                                        function212 = function22;
                                        inputTransformation3 = inputTransformation;
                                        outputTransformation3 = outputTransformation;
                                        scrollState3 = scrollState;
                                        shape4 = shape;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        keyboardOptions3 = keyboardOptions;
                                        textFieldLineLimits3 = textFieldLineLimits;
                                        z8 = z3;
                                        z7 = z4;
                                        textStyle5 = textStyle2;
                                        modifier4 = modifier2;
                                        i27 = i21;
                                        function211 = function2;
                                        function213 = function23;
                                        function214 = function24;
                                        function215 = function25;
                                        i28 = i5;
                                        textFieldColors4 = textFieldColors;
                                        composer4 = startRestartGroup;
                                    } else {
                                        Modifier modifier5 = i29 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z12 = i6 != 0 ? true : z3;
                                        z7 = i7 != 0 ? false : z4;
                                        if ((i4 & 64) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i5 &= -3670017;
                                            textStyle4 = (TextStyle) consume;
                                        } else {
                                            textStyle4 = textStyle2;
                                        }
                                        int i33 = i5;
                                        Function2<? super Composer, ? super Integer, Unit> function217 = i8 != 0 ? null : function2;
                                        Function2<? super Composer, ? super Integer, Unit> function218 = i10 != 0 ? null : function22;
                                        Function2<? super Composer, ? super Integer, Unit> function219 = i12 != 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function220 = i14 != 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function221 = i17 != 0 ? null : function25;
                                        inputTransformation3 = i18 != 0 ? null : inputTransformation;
                                        outputTransformation3 = i20 != 0 ? null : outputTransformation;
                                        if ((i4 & 16384) != 0) {
                                            i21 &= -57345;
                                            scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        } else {
                                            scrollState3 = scrollState;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i21 &= -458753;
                                            shape3 = getInputFieldShape(startRestartGroup, i25 & 14);
                                        } else {
                                            shape3 = shape;
                                        }
                                        int i34 = i21;
                                        if ((i4 & 65536) != 0) {
                                            textFieldColors3 = m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i25 << 9) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                            composer3 = startRestartGroup;
                                            i26 = i34 & (-3670017);
                                        } else {
                                            textFieldColors3 = textFieldColors;
                                            i26 = i34;
                                            composer3 = startRestartGroup;
                                        }
                                        MutableInteractionSource mutableInteractionSource5 = i22 != 0 ? null : mutableInteractionSource;
                                        KeyboardOptions keyboardOptions4 = i23 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        if (i24 != 0) {
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                            textFieldColors4 = textFieldColors3;
                                            keyboardOptions3 = keyboardOptions4;
                                            textFieldLineLimits3 = TextFieldLineLimits.SingleLine.INSTANCE;
                                        } else {
                                            textFieldLineLimits3 = textFieldLineLimits;
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                            textFieldColors4 = textFieldColors3;
                                            keyboardOptions3 = keyboardOptions4;
                                        }
                                        i27 = i26;
                                        modifier4 = modifier5;
                                        z8 = z12;
                                        textStyle5 = textStyle4;
                                        i28 = i33;
                                        function211 = function217;
                                        function212 = function218;
                                        function213 = function219;
                                        function214 = function220;
                                        function215 = function221;
                                        shape4 = shape3;
                                        composer4 = composer3;
                                    }
                                    composer4.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        function216 = function211;
                                        ComposerKt.traceEventStart(-1767124482, i28, i27, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:2106)");
                                    } else {
                                        function216 = function211;
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        composer4.startReplaceGroup(-990174019);
                                        ComposerKt.sourceInformation(composer4, "2108@98209L39");
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1694509083, "CC(remember):SearchBar.kt#9igjgp");
                                        Object rememberedValue6 = composer4.rememberedValue();
                                        textFieldLineLimits4 = textFieldLineLimits3;
                                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                                            composer4.updateRememberedValue(rememberedValue6);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue6;
                                    } else {
                                        textFieldLineLimits4 = textFieldLineLimits3;
                                        composer4.startReplaceGroup(-1694509734);
                                        composer4.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                    Function2<? super Composer, ? super Integer, Unit> function222 = function214;
                                    State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource6, composer4, 0);
                                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                    Function2<? super Composer, ? super Integer, Unit> function223 = function215;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer4.consume(localFocusManager);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    final FocusManager focusManager2 = (FocusManager) consume2;
                                    ProvidableCompositionLocal<InputModeManager> localInputModeManager = CompositionLocalsKt.getLocalInputModeManager();
                                    int i35 = i27;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer4.consume(localInputModeManager);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    final boolean m7614equalsimpl0 = InputMode.m7614equalsimpl0(((InputModeManager) consume3).mo7621getInputModeaOaMEAU(), InputMode.INSTANCE.m7619getTouchaOaMEAU());
                                    Strings.Companion companion = Strings.INSTANCE;
                                    final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_search_bar_search), composer4, 0);
                                    Strings.Companion companion2 = Strings.INSTANCE;
                                    final Shape shape5 = shape4;
                                    final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_suggestions_available), composer4, 0);
                                    long m9171getColor0d7_KjU = textStyle5.m9171getColor0d7_KjU();
                                    if (m9171getColor0d7_KjU != 16) {
                                        state = collectIsFocusedAsState;
                                    } else {
                                        state = collectIsFocusedAsState;
                                        m9171getColor0d7_KjU = textFieldColors4.m4242textColorXeAY9LY(z8, false, InputField$lambda$2(state));
                                    }
                                    TextStyle merge = textStyle5.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    ComposerKt.sourceInformationMarkerStart(composer4, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(composer4, 683736516, "CC(remember):Effects.kt#9igjgp");
                                    Object rememberedValue7 = composer4.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4);
                                        composer4.updateRememberedValue(rememberedValue7);
                                    }
                                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue7;
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1694467153, "CC(remember):SearchBar.kt#9igjgp");
                                    int i36 = i28 & 112;
                                    TextStyle textStyle6 = textStyle5;
                                    boolean changed5 = composer4.changed(m7614equalsimpl0) | (i36 == 32) | composer4.changedInstance(coroutineScope) | composer4.changedInstance(focusManager2);
                                    Object rememberedValue8 = composer4.rememberedValue();
                                    if (changed5) {
                                        z9 = z8;
                                    } else {
                                        z9 = z8;
                                        if (rememberedValue8 != Composer.INSTANCE.getEmpty()) {
                                            obj = rememberedValue8;
                                            searchBarState3 = searchBarState;
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Modifier m1275sizeInqDBjuR0$default = SizeKt.m1275sizeInqDBjuR0$default(KeyInputModifierKt.onPreviewKeyEvent(modifier4, (Function1) obj), SearchBarKt.getSearchBarMinWidth(), InputFieldHeight, SearchBarKt.getSearchBarMaxWidth(), 0.0f, 8, null);
                                            Modifier modifier6 = modifier4;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1694436603, "CC(remember):SearchBar.kt#9igjgp");
                                            changed = composer4.changed(m7614equalsimpl0) | composer4.changedInstance(coroutineScope) | (i36 != 32);
                                            Object rememberedValue9 = composer4.rememberedValue();
                                            if (changed) {
                                                focusManager = focusManager2;
                                            } else {
                                                focusManager = focusManager2;
                                            }
                                            rememberedValue9 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda26
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    Unit InputField$lambda$5$0;
                                                    InputField$lambda$5$0 = SearchBarDefaults.InputField$lambda$5$0(m7614equalsimpl0, coroutineScope, searchBarState3, (FocusState) obj2);
                                                    return InputField$lambda$5$0;
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue9);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(m1275sizeInqDBjuR0$default, (Function1) rememberedValue9);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1694429166, "CC(remember):SearchBar.kt#9igjgp");
                                            changed2 = composer4.changed(m4895getString2EP1pXo) | (i36 != 32) | composer4.changed(m4895getString2EP1pXo2);
                                            rememberedValue = composer4.rememberedValue();
                                            if (!changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        Unit InputField$lambda$6$0;
                                                        InputField$lambda$6$0 = SearchBarDefaults.InputField$lambda$6$0(m4895getString2EP1pXo, searchBarState3, m4895getString2EP1pXo2, (SemanticsPropertyReceiver) obj2);
                                                        return InputField$lambda$6$0;
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (Function1) rememberedValue, 1, null);
                                            SolidColor solidColor = new SolidColor(textFieldColors4.m4192cursorColorvNxB06k(false), null);
                                            KeyboardOptions merge2 = keyboardOptions3.merge(new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m9356getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null));
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1694410358, "CC(remember):SearchBar.kt#9igjgp");
                                            int i37 = i28 & 14;
                                            KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                            z10 = ((i28 & 896) != 256) | (i37 != 4);
                                            rememberedValue2 = composer4.rememberedValue();
                                            if (!z10 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                textFieldState2 = textFieldState;
                                                rememberedValue2 = new KeyboardActionHandler() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda1
                                                    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                                                    public final void onKeyboardAction(Function0 function0) {
                                                        SearchBarDefaults.InputField$lambda$7$0(Function1.this, textFieldState2, function0);
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue2);
                                            } else {
                                                textFieldState2 = textFieldState;
                                            }
                                            KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                            if (function212 != null) {
                                                composer4.startReplaceGroup(-986429220);
                                                composer4.endReplaceGroup();
                                                str = "CC(remember):SearchBar.kt#9igjgp";
                                                textFieldDefaults = textFieldDefaults2;
                                                rememberComposableLambda = null;
                                            } else {
                                                composer4.startReplaceGroup(-986429219);
                                                ComposerKt.sourceInformation(composer4, "*2188@102026L64");
                                                str = "CC(remember):SearchBar.kt#9igjgp";
                                                textFieldDefaults = textFieldDefaults2;
                                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1201848429, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        Unit InputField$lambda$8$0;
                                                        InputField$lambda$8$0 = SearchBarDefaults.InputField$lambda$8$0(Function2.this, (Composer) obj2, ((Integer) obj3).intValue());
                                                        return InputField$lambda$8$0;
                                                    }
                                                }, composer4, 54);
                                                composer4.endReplaceGroup();
                                            }
                                            if (function213 != null) {
                                                composer4.startReplaceGroup(-986220807);
                                                composer4.endReplaceGroup();
                                                composableLambda = rememberComposableLambda;
                                                rememberComposableLambda2 = null;
                                            } else {
                                                composer4.startReplaceGroup(-986220806);
                                                ComposerKt.sourceInformation(composer4, "*2192@102237L66");
                                                composableLambda = rememberComposableLambda;
                                                rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(2066530930, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        Unit InputField$lambda$9$0;
                                                        InputField$lambda$9$0 = SearchBarDefaults.InputField$lambda$9$0(Function2.this, (Composer) obj2, ((Integer) obj3).intValue());
                                                        return InputField$lambda$9$0;
                                                    }
                                                }, composer4, 54);
                                                composer4.endReplaceGroup();
                                            }
                                            state2 = state;
                                            final boolean z13 = z9;
                                            int i38 = ((i28 >> 9) & 112) | i37 | ((i35 >> 21) & 896) | (i35 & 7168) | (29360128 & i28);
                                            int i39 = (i35 & 14) | 14155776 | (i35 & 112) | ((i35 >> 6) & 57344);
                                            TextFieldColors textFieldColors5 = textFieldColors4;
                                            Composer composer5 = composer4;
                                            FocusManager focusManager3 = focusManager;
                                            Function2<? super Composer, ? super Integer, Unit> function224 = function212;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = function213;
                                            TextFieldState textFieldState4 = textFieldState2;
                                            int i40 = i28;
                                            OutputTransformation outputTransformation4 = outputTransformation3;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = function216;
                                            TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4;
                                            TextFieldDecorator decorator = textFieldDefaults.decorator(textFieldState4, z13, textFieldLineLimits5, outputTransformation4, mutableInteractionSource6, null, null, function226, composableLambda, rememberComposableLambda2, function222, function223, null, false, textFieldColors5, TextFieldDefaults.m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(907393001, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    Unit InputField$lambda$10;
                                                    InputField$lambda$10 = SearchBarDefaults.InputField$lambda$10(TextFieldColors.this, z13, shape5, state2, (Composer) obj2, ((Integer) obj3).intValue());
                                                    return InputField$lambda$10;
                                                }
                                            }, composer4, 54), composer5, i38, i39, 12384);
                                            int i41 = i40 >> 6;
                                            int i42 = i35 >> 3;
                                            int i43 = (i41 & 7168) | (i41 & 896) | i37 | (57344 & (i35 << 6)) | (234881024 & i42);
                                            int i44 = (i42 & 896) | (i35 & 57344);
                                            String str2 = str;
                                            InputTransformation inputTransformation4 = inputTransformation3;
                                            ScrollState scrollState4 = scrollState3;
                                            BasicTextFieldKt.BasicTextField(textFieldState, semantics$default, z13, z7, inputTransformation4, merge, merge2, keyboardActionHandler, textFieldLineLimits5, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, mutableInteractionSource4, solidColor, outputTransformation4, decorator, scrollState4, composer5, i43, i44, 512);
                                            ComposerKt.sourceInformationMarkerStart(composer5, -1694337646, str2);
                                            changedInstance = (i36 != 32) | composer5.changedInstance(coroutineScope);
                                            rememberedValue3 = composer5.rememberedValue();
                                            if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                searchBarState2 = searchBarState;
                                                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit InputField$lambda$11$0;
                                                        InputField$lambda$11$0 = SearchBarDefaults.InputField$lambda$11$0(SearchBarState.this, coroutineScope);
                                                        return InputField$lambda$11$0;
                                                    }
                                                };
                                                composer5.updateRememberedValue(rememberedValue3);
                                            } else {
                                                searchBarState2 = searchBarState;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            SearchBarKt.DetectClickFromInteractionSource(mutableInteractionSource6, (Function0) rememberedValue3, composer5, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer5, -1694328738, str2);
                                            changed3 = (i36 != 32) | (i37 != 4) | composer5.changed(state2) | composer5.changedInstance(coroutineScope);
                                            rememberedValue4 = composer5.rememberedValue();
                                            if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                textFieldState3 = textFieldState;
                                                rememberedValue4 = new SearchBarDefaults$InputField$10$1(searchBarState2, textFieldState, coroutineScope, state2, null);
                                                composer5.updateRememberedValue(rememberedValue4);
                                            } else {
                                                textFieldState3 = textFieldState;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            EffectsKt.LaunchedEffect(searchBarState2, textFieldState3, (Function2) rememberedValue4, composer5, ((i40 >> 3) & 14) | ((i40 << 3) & 112));
                                            isExpanded = SearchBarKt.isExpanded(searchBarState2);
                                            z11 = isExpanded && InputField$lambda$2(state2) && m7614equalsimpl0;
                                            isExpanded2 = SearchBarKt.isExpanded(searchBarState2);
                                            Boolean valueOf = Boolean.valueOf(isExpanded2);
                                            ComposerKt.sourceInformationMarkerStart(composer5, -1694300856, str2);
                                            changed4 = composer5.changed(z11) | composer5.changedInstance(focusManager3);
                                            rememberedValue5 = composer5.rememberedValue();
                                            if (!changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new SearchBarDefaults$InputField$11$1(z11, focusManager3, null);
                                                composer5.updateRememberedValue(rememberedValue5);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer5, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            z5 = z13;
                                            textFieldLineLimits2 = textFieldLineLimits5;
                                            scrollState2 = scrollState4;
                                            composer2 = composer5;
                                            textFieldColors2 = textFieldColors5;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            keyboardOptions2 = keyboardOptions5;
                                            modifier3 = modifier6;
                                            z6 = z7;
                                            textStyle3 = textStyle6;
                                            function27 = function226;
                                            function26 = function224;
                                            function28 = function225;
                                            function210 = function223;
                                            shape2 = shape5;
                                            inputTransformation2 = inputTransformation4;
                                            outputTransformation2 = outputTransformation4;
                                            function29 = function222;
                                        }
                                    }
                                    searchBarState3 = searchBarState;
                                    obj = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                            return m3831invokeZmokQxo(keyEvent.m7966unboximpl());
                                        }

                                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                        public final Boolean m3831invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                            boolean isExpanded3;
                                            boolean isExpanded4;
                                            if (!m7614equalsimpl0) {
                                                isExpanded4 = SearchBarKt.isExpanded(searchBarState3);
                                                if (!isExpanded4 && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7731getDirectionDownEK5gGoQ())) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(searchBarState3, null), 3, null);
                                                    return true;
                                                }
                                            }
                                            isExpanded3 = SearchBarKt.isExpanded(searchBarState3);
                                            if (isExpanded3 && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7731getDirectionDownEK5gGoQ())) {
                                                focusManager2.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6398getDowndhqQ8s());
                                                return true;
                                            }
                                            return false;
                                        }

                                        /* compiled from: SearchBar.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                        @DebugMetadata(c = "androidx.compose.material3.SearchBarDefaults$InputField$2$1$1", f = "SearchBar.kt", i = {}, l = {2142}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                        /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$2$1$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ SearchBarState $searchBarState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(SearchBarState searchBarState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$searchBarState = searchBarState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$searchBarState, continuation);
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
                                                    if (this.$searchBarState.animateToExpanded(this) == coroutine_suspended) {
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
                                    composer4.updateRememberedValue(obj);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Modifier m1275sizeInqDBjuR0$default2 = SizeKt.m1275sizeInqDBjuR0$default(KeyInputModifierKt.onPreviewKeyEvent(modifier4, (Function1) obj), SearchBarKt.getSearchBarMinWidth(), InputFieldHeight, SearchBarKt.getSearchBarMaxWidth(), 0.0f, 8, null);
                                    Modifier modifier62 = modifier4;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1694436603, "CC(remember):SearchBar.kt#9igjgp");
                                    changed = composer4.changed(m7614equalsimpl0) | composer4.changedInstance(coroutineScope) | (i36 != 32);
                                    Object rememberedValue92 = composer4.rememberedValue();
                                    if (changed) {
                                    }
                                    rememberedValue92 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda26
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit InputField$lambda$5$0;
                                            InputField$lambda$5$0 = SearchBarDefaults.InputField$lambda$5$0(m7614equalsimpl0, coroutineScope, searchBarState3, (FocusState) obj2);
                                            return InputField$lambda$5$0;
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue92);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Modifier onFocusChanged2 = FocusChangedModifierKt.onFocusChanged(m1275sizeInqDBjuR0$default2, (Function1) rememberedValue92);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1694429166, "CC(remember):SearchBar.kt#9igjgp");
                                    changed2 = composer4.changed(m4895getString2EP1pXo) | (i36 != 32) | composer4.changed(m4895getString2EP1pXo2);
                                    rememberedValue = composer4.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            Unit InputField$lambda$6$0;
                                            InputField$lambda$6$0 = SearchBarDefaults.InputField$lambda$6$0(m4895getString2EP1pXo, searchBarState3, m4895getString2EP1pXo2, (SemanticsPropertyReceiver) obj2);
                                            return InputField$lambda$6$0;
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(onFocusChanged2, false, (Function1) rememberedValue, 1, null);
                                    SolidColor solidColor2 = new SolidColor(textFieldColors4.m4192cursorColorvNxB06k(false), null);
                                    KeyboardOptions merge22 = keyboardOptions3.merge(new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m9356getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null));
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1694410358, "CC(remember):SearchBar.kt#9igjgp");
                                    int i372 = i28 & 14;
                                    KeyboardOptions keyboardOptions52 = keyboardOptions3;
                                    z10 = ((i28 & 896) != 256) | (i372 != 4);
                                    rememberedValue2 = composer4.rememberedValue();
                                    if (z10) {
                                    }
                                    textFieldState2 = textFieldState;
                                    rememberedValue2 = new KeyboardActionHandler() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda1
                                        @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                                        public final void onKeyboardAction(Function0 function0) {
                                            SearchBarDefaults.InputField$lambda$7$0(Function1.this, textFieldState2, function0);
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue2);
                                    KeyboardActionHandler keyboardActionHandler2 = (KeyboardActionHandler) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                                    if (function212 != null) {
                                    }
                                    if (function213 != null) {
                                    }
                                    state2 = state;
                                    final boolean z132 = z9;
                                    int i382 = ((i28 >> 9) & 112) | i372 | ((i35 >> 21) & 896) | (i35 & 7168) | (29360128 & i28);
                                    int i392 = (i35 & 14) | 14155776 | (i35 & 112) | ((i35 >> 6) & 57344);
                                    TextFieldColors textFieldColors52 = textFieldColors4;
                                    Composer composer52 = composer4;
                                    FocusManager focusManager32 = focusManager;
                                    Function2<? super Composer, ? super Integer, Unit> function2242 = function212;
                                    Function2<? super Composer, ? super Integer, Unit> function2252 = function213;
                                    TextFieldState textFieldState42 = textFieldState2;
                                    int i402 = i28;
                                    OutputTransformation outputTransformation42 = outputTransformation3;
                                    Function2<? super Composer, ? super Integer, Unit> function2262 = function216;
                                    TextFieldLineLimits textFieldLineLimits52 = textFieldLineLimits4;
                                    TextFieldDecorator decorator2 = textFieldDefaults.decorator(textFieldState42, z132, textFieldLineLimits52, outputTransformation42, mutableInteractionSource6, null, null, function2262, composableLambda, rememberComposableLambda2, function222, function223, null, false, textFieldColors52, TextFieldDefaults.m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(907393001, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            Unit InputField$lambda$10;
                                            InputField$lambda$10 = SearchBarDefaults.InputField$lambda$10(TextFieldColors.this, z132, shape5, state2, (Composer) obj2, ((Integer) obj3).intValue());
                                            return InputField$lambda$10;
                                        }
                                    }, composer4, 54), composer52, i382, i392, 12384);
                                    int i412 = i402 >> 6;
                                    int i422 = i35 >> 3;
                                    int i432 = (i412 & 7168) | (i412 & 896) | i372 | (57344 & (i35 << 6)) | (234881024 & i422);
                                    int i442 = (i422 & 896) | (i35 & 57344);
                                    String str22 = str;
                                    InputTransformation inputTransformation42 = inputTransformation3;
                                    ScrollState scrollState42 = scrollState3;
                                    BasicTextFieldKt.BasicTextField(textFieldState, semantics$default2, z132, z7, inputTransformation42, merge, merge22, keyboardActionHandler2, textFieldLineLimits52, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, mutableInteractionSource4, solidColor2, outputTransformation42, decorator2, scrollState42, composer52, i432, i442, 512);
                                    ComposerKt.sourceInformationMarkerStart(composer52, -1694337646, str22);
                                    changedInstance = (i36 != 32) | composer52.changedInstance(coroutineScope);
                                    rememberedValue3 = composer52.rememberedValue();
                                    if (changedInstance) {
                                    }
                                    searchBarState2 = searchBarState;
                                    rememberedValue3 = new Function0() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit InputField$lambda$11$0;
                                            InputField$lambda$11$0 = SearchBarDefaults.InputField$lambda$11$0(SearchBarState.this, coroutineScope);
                                            return InputField$lambda$11$0;
                                        }
                                    };
                                    composer52.updateRememberedValue(rememberedValue3);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    SearchBarKt.DetectClickFromInteractionSource(mutableInteractionSource6, (Function0) rememberedValue3, composer52, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer52, -1694328738, str22);
                                    changed3 = (i36 != 32) | (i372 != 4) | composer52.changed(state2) | composer52.changedInstance(coroutineScope);
                                    rememberedValue4 = composer52.rememberedValue();
                                    if (changed3) {
                                    }
                                    textFieldState3 = textFieldState;
                                    rememberedValue4 = new SearchBarDefaults$InputField$10$1(searchBarState2, textFieldState, coroutineScope, state2, null);
                                    composer52.updateRememberedValue(rememberedValue4);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    EffectsKt.LaunchedEffect(searchBarState2, textFieldState3, (Function2) rememberedValue4, composer52, ((i402 >> 3) & 14) | ((i402 << 3) & 112));
                                    isExpanded = SearchBarKt.isExpanded(searchBarState2);
                                    if (isExpanded) {
                                    }
                                    isExpanded2 = SearchBarKt.isExpanded(searchBarState2);
                                    Boolean valueOf2 = Boolean.valueOf(isExpanded2);
                                    ComposerKt.sourceInformationMarkerStart(composer52, -1694300856, str22);
                                    changed4 = composer52.changed(z11) | composer52.changedInstance(focusManager32);
                                    rememberedValue5 = composer52.rememberedValue();
                                    if (!changed4) {
                                    }
                                    rememberedValue5 = new SearchBarDefaults$InputField$11$1(z11, focusManager32, null);
                                    composer52.updateRememberedValue(rememberedValue5);
                                    ComposerKt.sourceInformationMarkerEnd(composer52);
                                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer52, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z5 = z132;
                                    textFieldLineLimits2 = textFieldLineLimits52;
                                    scrollState2 = scrollState42;
                                    composer2 = composer52;
                                    textFieldColors2 = textFieldColors52;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    keyboardOptions2 = keyboardOptions52;
                                    modifier3 = modifier62;
                                    z6 = z7;
                                    textStyle3 = textStyle6;
                                    function27 = function2262;
                                    function26 = function2242;
                                    function28 = function2252;
                                    function210 = function223;
                                    shape2 = shape5;
                                    inputTransformation2 = inputTransformation42;
                                    outputTransformation2 = outputTransformation42;
                                    function29 = function222;
                                } else {
                                    searchBarState2 = searchBarState;
                                    startRestartGroup.skipToGroupEnd();
                                    function26 = function22;
                                    inputTransformation2 = inputTransformation;
                                    scrollState2 = scrollState;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    keyboardOptions2 = keyboardOptions;
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    z5 = z3;
                                    z6 = z4;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    composer2 = startRestartGroup;
                                    function27 = function2;
                                    function28 = function23;
                                    function29 = function24;
                                    function210 = function25;
                                    outputTransformation2 = outputTransformation;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    final SearchBarState searchBarState4 = searchBarState2;
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            Unit InputField$lambda$14;
                                            InputField$lambda$14 = SearchBarDefaults.InputField$lambda$14(SearchBarDefaults.this, textFieldState, searchBarState4, function1, modifier3, z5, z6, textStyle3, function27, function26, function28, function29, function210, inputTransformation2, outputTransformation2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, keyboardOptions2, textFieldLineLimits2, i, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                            return InputField$lambda$14;
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
                        if ((i2 & 1572864) == 0) {
                        }
                        i22 = i4 & 131072;
                        if (i22 == 0) {
                        }
                        i23 = i4 & 262144;
                        if (i23 == 0) {
                        }
                        i24 = i4 & 524288;
                        if (i24 == 0) {
                        }
                        if ((i3 & 6) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i312 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i4 & 8192;
                    if (i20 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i22 = i4 & 131072;
                    if (i22 == 0) {
                    }
                    i23 = i4 & 262144;
                    if (i23 == 0) {
                    }
                    i24 = i4 & 524288;
                    if (i24 == 0) {
                    }
                    if ((i3 & 6) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i9;
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i3122 = i15;
                i18 = i4 & 4096;
                if (i18 != 0) {
                }
                i20 = i4 & 8192;
                if (i20 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i22 = i4 & 131072;
                if (i22 == 0) {
                }
                i23 = i4 & 262144;
                if (i23 == 0) {
                }
                i24 = i4 & 524288;
                if (i24 == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i31222 = i15;
            i18 = i4 & 4096;
            if (i18 != 0) {
            }
            i20 = i4 & 8192;
            if (i20 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i22 = i4 & 131072;
            if (i22 == 0) {
            }
            i23 = i4 & 262144;
            if (i23 == 0) {
            }
            i24 = i4 & 524288;
            if (i24 == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 16;
        int i302 = 16384;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        int i312222 = i15;
        i18 = i4 & 4096;
        if (i18 != 0) {
        }
        i20 = i4 & 8192;
        if (i20 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i22 = i4 & 131072;
        if (i22 == 0) {
        }
        i23 = i4 & 262144;
        if (i23 == 0) {
        }
        i24 = i4 & 524288;
        if (i24 == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute(((i5 & 306783379) != 306783378 && (i21 & 306783379) == 306783378 && (i25 & 3) == 2) ? false : true, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$5$0(boolean z, CoroutineScope coroutineScope, SearchBarState searchBarState, FocusState focusState) {
        if (focusState.isFocused() && z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchBarDefaults$InputField$3$1$1(searchBarState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$6$0(String str, SearchBarState searchBarState, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean isExpanded;
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        isExpanded = SearchBarKt.isExpanded(searchBarState);
        if (isExpanded) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputField$lambda$7$0(Function1 function1, TextFieldState textFieldState, Function0 function0) {
        function1.invoke(textFieldState.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$8$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2188@102028L60:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201848429, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:2188)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, f, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 647817505, "C2188@102077L9:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$9$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2192@102239L62:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066530930, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:2192)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, Dp.m9732constructorimpl(-f), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 2028701185, "C2192@102289L10:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$10(TextFieldColors textFieldColors, boolean z, Shape shape, State state, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2207@103056L7,2200@102634L460,2209@103119L63:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(907393001, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:2199)");
            }
            final State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(textFieldColors.m4190containerColorXeAY9LY(z, false, InputField$lambda$2(state)), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), null, null, composer, 0, 12);
            BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.INSTANCE, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m200animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$8$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            }), shape), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$11$0(SearchBarState searchBarState, CoroutineScope coroutineScope) {
        boolean isExpanded;
        isExpanded = SearchBarKt.isExpanded(searchBarState);
        if (!isExpanded) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchBarDefaults$InputField$9$1$1(searchBarState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final TextFieldState textFieldState, final Function1<? super String, Unit> function1, final boolean z, final Function1<? super Boolean, Unit> function12, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        TextStyle textStyle2;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function26;
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
        int i18;
        int i19;
        int i20;
        int i21;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final OutputTransformation outputTransformation2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z6;
        final boolean z7;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final InputTransformation inputTransformation2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        boolean z8;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        ScrollState scrollState3;
        Shape shape3;
        TextFieldColors textFieldColors3;
        int i22;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource3;
        final TextFieldColors textFieldColors4;
        int i23;
        final boolean z9;
        TextStyle textStyle5;
        Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        OutputTransformation outputTransformation3;
        final Shape shape4;
        Composer composer4;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource5;
        TextFieldDefaults textFieldDefaults;
        Function2<? super Composer, ? super Integer, Unit> function217;
        SolidColor solidColor;
        ComposableLambda rememberComposableLambda;
        ComposableLambda composableLambda;
        ComposableLambda rememberComposableLambda2;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(1994562483);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputField)N(state,onSearch,expanded,onExpandedChange,modifier,enabled,readOnly,textStyle,placeholder,leadingIcon,trailingIcon,prefix,suffix,inputTransformation,outputTransformation,scrollState,shape,colors,interactionSource)2323@109557L25,2324@109618L29,2325@109693L7,2327@109732L34,2328@109811L39,2346@110486L44,2347@110562L227,2359@111136L35,2384@112403L645,2365@111433L1634,2336@110094L2984,2401@113165L320,2401@113140L345:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i25 = i3 & 16;
        if (i25 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z5 = z3;
            } else {
                z5 = z3;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                }
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    textStyle2 = textStyle;
                    if (startRestartGroup.changed(textStyle2)) {
                        i24 = 8388608;
                        i4 |= i24;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i24 = 4194304;
                i4 |= i24;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
                function26 = function2;
            } else {
                function26 = function2;
                if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function26) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i9 = i8;
                i4 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i12 = i2 | 6;
                    i11 = i10;
                } else if ((i2 & 6) == 0) {
                    i11 = i10;
                    i12 = i2 | (startRestartGroup.changedInstance(function23) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i26 = i12;
                i15 = i3 & 4096;
                if (i15 != 0) {
                    i16 = i26 | 384;
                } else {
                    int i27 = i26;
                    if ((i2 & 384) == 0) {
                        i27 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
                    }
                    i16 = i27;
                }
                i17 = i3 & 8192;
                if (i17 != 0) {
                    i18 = i16 | 3072;
                } else {
                    int i28 = i16;
                    if ((i2 & 3072) == 0) {
                        i18 = i28 | (startRestartGroup.changed(inputTransformation) ? 2048 : 1024);
                    } else {
                        i18 = i28;
                    }
                }
                i19 = i3 & 16384;
                if (i19 != 0) {
                    i20 = i18 | 24576;
                } else {
                    i20 = i18;
                    if ((i2 & 24576) == 0) {
                        i20 |= startRestartGroup.changed(outputTransformation) ? 16384 : 8192;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i20 |= ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i20 |= ((i3 & 65536) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i20 |= ((i3 & 131072) == 0 && startRestartGroup.changed(textFieldColors)) ? 8388608 : 4194304;
                        }
                        i21 = i3 & 262144;
                        if (i21 == 0) {
                            i20 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i20 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if ((i2 & 805306368) == 0) {
                            i20 |= startRestartGroup.changed(this) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "2307@108773L7,2315@109201L21,2316@109247L15,2317@109298L18");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((32768 & i3) != 0) {
                                    i20 &= -458753;
                                }
                                if ((i3 & 65536) != 0) {
                                    i20 &= -3670017;
                                }
                                if ((i3 & 131072) != 0) {
                                    i20 &= -29360129;
                                }
                                modifier3 = modifier;
                                function213 = function22;
                                function214 = function23;
                                function216 = function25;
                                inputTransformation3 = inputTransformation;
                                scrollState3 = scrollState;
                                shape4 = shape;
                                textFieldColors4 = textFieldColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z9 = z4;
                                z8 = z5;
                                textStyle5 = textStyle2;
                                function212 = function26;
                                i23 = i20;
                                function215 = function24;
                                outputTransformation3 = outputTransformation;
                                composer4 = startRestartGroup;
                            } else {
                                modifier3 = i25 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z10 = i5 != 0 ? true : z4;
                                z8 = i6 != 0 ? false : z5;
                                if ((i3 & 128) != 0) {
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i4 &= -29360129;
                                    textStyle4 = (TextStyle) consume;
                                } else {
                                    textStyle4 = textStyle2;
                                }
                                int i29 = i4;
                                Function2<? super Composer, ? super Integer, Unit> function218 = i7 != 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i9 != 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function220 = i11 != 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function221 = i14 != 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function222 = i15 != 0 ? null : function25;
                                inputTransformation3 = i17 != 0 ? null : inputTransformation;
                                OutputTransformation outputTransformation4 = i19 != 0 ? null : outputTransformation;
                                if ((32768 & i3) != 0) {
                                    i20 &= -458753;
                                    scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                } else {
                                    scrollState3 = scrollState;
                                }
                                if ((i3 & 65536) != 0) {
                                    Shape inputFieldShape = getInputFieldShape(startRestartGroup, (i20 >> 27) & 14);
                                    i20 &= -3670017;
                                    shape3 = inputFieldShape;
                                } else {
                                    shape3 = shape;
                                }
                                int i30 = i20;
                                if ((i3 & 131072) != 0) {
                                    textFieldColors3 = m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i30 >> 18) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                                    composer3 = startRestartGroup;
                                    i22 = i30 & (-29360129);
                                } else {
                                    textFieldColors3 = textFieldColors;
                                    i22 = i30;
                                    composer3 = startRestartGroup;
                                }
                                if (i21 != 0) {
                                    textFieldColors4 = textFieldColors3;
                                    i23 = i22;
                                    z9 = z10;
                                    textStyle5 = textStyle4;
                                    i4 = i29;
                                    function212 = function218;
                                    function213 = function219;
                                    function214 = function220;
                                    function215 = function221;
                                    function216 = function222;
                                    outputTransformation3 = outputTransformation4;
                                    shape4 = shape3;
                                    mutableInteractionSource3 = null;
                                    composer4 = composer3;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    textFieldColors4 = textFieldColors3;
                                    i23 = i22;
                                    z9 = z10;
                                    textStyle5 = textStyle4;
                                    i4 = i29;
                                    function212 = function218;
                                    function213 = function219;
                                    function214 = function220;
                                    function215 = function221;
                                    function216 = function222;
                                    outputTransformation3 = outputTransformation4;
                                    shape4 = shape3;
                                    composer4 = composer3;
                                }
                            }
                            composer4.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1994562483, i4, i23, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:2319)");
                            }
                            if (mutableInteractionSource3 == null) {
                                composer4.startReplaceGroup(-860604984);
                                ComposerKt.sourceInformation(composer4, "2321@109476L39");
                                ComposerKt.sourceInformationMarkerStart(composer4, 1219164538, "CC(remember):SearchBar.kt#9igjgp");
                                Object rememberedValue = composer4.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composer4.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endReplaceGroup();
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                            } else {
                                composer4.startReplaceGroup(1219163887);
                                composer4.endReplaceGroup();
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource4;
                            final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource6, composer4, 0).getValue().booleanValue();
                            OutputTransformation outputTransformation5 = outputTransformation3;
                            ComposerKt.sourceInformationMarkerStart(composer4, 1219169072, "CC(remember):SearchBar.kt#9igjgp");
                            Object rememberedValue2 = composer4.rememberedValue();
                            Function2<? super Composer, ? super Integer, Unit> function223 = function212;
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                composer4.updateRememberedValue(rememberedValue2);
                            }
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                            int i31 = i23;
                            Function2<? super Composer, ? super Integer, Unit> function224 = function215;
                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = composer4.consume(localFocusManager);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            FocusManager focusManager = (FocusManager) consume2;
                            Strings.Companion companion = Strings.INSTANCE;
                            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_search_bar_search), composer4, 0);
                            Strings.Companion companion2 = Strings.INSTANCE;
                            final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_suggestions_available), composer4, 0);
                            long m9171getColor0d7_KjU = textStyle5.m9171getColor0d7_KjU();
                            if (m9171getColor0d7_KjU == 16) {
                                m9171getColor0d7_KjU = textFieldColors4.m4242textColorXeAY9LY(z9, false, booleanValue);
                            }
                            TextStyle merge = textStyle5.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1275sizeInqDBjuR0$default(modifier3, SearchBarKt.getSearchBarMinWidth(), InputFieldHeight, SearchBarKt.getSearchBarMaxWidth(), 0.0f, 8, null), focusRequester);
                            ComposerKt.sourceInformationMarkerStart(composer4, 1219196863, "CC(remember):SearchBar.kt#9igjgp");
                            TextStyle textStyle6 = textStyle5;
                            boolean z11 = (i4 & 7168) == 2048;
                            Object rememberedValue3 = composer4.rememberedValue();
                            if (z11 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit InputField$lambda$18$0;
                                        InputField$lambda$18$0 = SearchBarDefaults.InputField$lambda$18$0(Function1.this, (FocusState) obj);
                                        return InputField$lambda$18$0;
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (Function1) rememberedValue3);
                            ComposerKt.sourceInformationMarkerStart(composer4, 1219199478, "CC(remember):SearchBar.kt#9igjgp");
                            int i32 = i4;
                            boolean changed = ((i4 & 896) == 256) | composer4.changed(m4895getString2EP1pXo) | composer4.changed(m4895getString2EP1pXo2);
                            Object rememberedValue4 = composer4.rememberedValue();
                            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit InputField$lambda$19$0;
                                        InputField$lambda$19$0 = SearchBarDefaults.InputField$lambda$19$0(m4895getString2EP1pXo, z, m4895getString2EP1pXo2, (SemanticsPropertyReceiver) obj);
                                        return InputField$lambda$19$0;
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (Function1) rememberedValue4, 1, null);
                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                            SolidColor solidColor2 = new SolidColor(textFieldColors4.m4192cursorColorvNxB06k(false), null);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m9356getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                            ComposerKt.sourceInformationMarkerStart(composer4, 1219217654, "CC(remember):SearchBar.kt#9igjgp");
                            int i33 = i32 & 14;
                            boolean z12 = ((i32 & 112) == 32) | (i33 == 4);
                            Object rememberedValue5 = composer4.rememberedValue();
                            if (z12 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                mutableInteractionSource5 = mutableInteractionSource6;
                                rememberedValue5 = new KeyboardActionHandler() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda9
                                    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                                    public final void onKeyboardAction(Function0 function0) {
                                        SearchBarDefaults.InputField$lambda$20$0(Function1.this, textFieldState, function0);
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue5);
                            } else {
                                mutableInteractionSource5 = mutableInteractionSource6;
                            }
                            KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                            TextFieldLineLimits.SingleLine singleLine2 = TextFieldLineLimits.SingleLine.INSTANCE;
                            if (function213 == null) {
                                composer4.startReplaceGroup(-858271801);
                                composer4.endReplaceGroup();
                                textFieldDefaults = textFieldDefaults2;
                                function217 = function213;
                                solidColor = solidColor2;
                                rememberComposableLambda = null;
                            } else {
                                composer4.startReplaceGroup(-858271800);
                                ComposerKt.sourceInformation(composer4, "*2374@111870L64");
                                textFieldDefaults = textFieldDefaults2;
                                function217 = function213;
                                solidColor = solidColor2;
                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(314348414, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit InputField$lambda$21$0;
                                        InputField$lambda$21$0 = SearchBarDefaults.InputField$lambda$21$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                                        return InputField$lambda$21$0;
                                    }
                                }, composer4, 54);
                                composer4.endReplaceGroup();
                            }
                            if (function214 == null) {
                                composer4.startReplaceGroup(-858063388);
                                composer4.endReplaceGroup();
                                composableLambda = rememberComposableLambda;
                                rememberComposableLambda2 = null;
                            } else {
                                composer4.startReplaceGroup(-858063387);
                                ComposerKt.sourceInformation(composer4, "*2378@112081L66");
                                composableLambda = rememberComposableLambda;
                                rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(581893311, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit InputField$lambda$22$0;
                                        InputField$lambda$22$0 = SearchBarDefaults.InputField$lambda$22$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                                        return InputField$lambda$22$0;
                                    }
                                }, composer4, 54);
                                composer4.endReplaceGroup();
                            }
                            int i34 = i31 >> 3;
                            int i35 = (i34 & 7168) | i33 | 384 | ((i32 >> 12) & 112) | ((i32 >> 3) & 29360128);
                            int i36 = (i34 & 14) | 14155776 | (i34 & 112) | ((i31 >> 9) & 57344);
                            TextFieldColors textFieldColors5 = textFieldColors4;
                            Composer composer5 = composer4;
                            Function2<? super Composer, ? super Integer, Unit> function225 = function217;
                            Function2<? super Composer, ? super Integer, Unit> function226 = function214;
                            Shape shape5 = shape4;
                            ComposableLambda composableLambda2 = rememberComposableLambda2;
                            boolean z13 = z9;
                            Function2<? super Composer, ? super Integer, Unit> function227 = function216;
                            textFieldColors2 = textFieldColors5;
                            int i37 = i32 >> 9;
                            boolean z14 = z8;
                            InputTransformation inputTransformation4 = inputTransformation3;
                            ScrollState scrollState4 = scrollState3;
                            BasicTextFieldKt.BasicTextField(textFieldState, semantics$default, z13, z14, inputTransformation4, merge, keyboardOptions, keyboardActionHandler, singleLine, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, mutableInteractionSource7, solidColor, outputTransformation5, textFieldDefaults.decorator(textFieldState, z13, singleLine2, outputTransformation5, mutableInteractionSource5, null, null, function223, composableLambda, composableLambda2, function224, function216, null, false, textFieldColors5, TextFieldDefaults.m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(-1551441816, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit InputField$lambda$23;
                                    InputField$lambda$23 = SearchBarDefaults.InputField$lambda$23(TextFieldColors.this, z9, booleanValue, shape4, (Composer) obj, ((Integer) obj2).intValue());
                                    return InputField$lambda$23;
                                }
                            }, composer4, 54), composer5, i35, i36, 12384), scrollState4, composer5, i33 | 102236160 | (i37 & 896) | (i37 & 7168) | ((i31 << 3) & 57344), ((i31 >> 6) & 896) | (i34 & 57344), 512);
                            boolean z15 = !z && booleanValue;
                            Boolean valueOf = Boolean.valueOf(z);
                            ComposerKt.sourceInformationMarkerStart(composer5, 1219282867, "CC(remember):SearchBar.kt#9igjgp");
                            boolean changed2 = composer5.changed(z15) | composer5.changedInstance(focusManager);
                            SearchBarDefaults$InputField$19$1 rememberedValue6 = composer5.rememberedValue();
                            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new SearchBarDefaults$InputField$19$1(z15, focusManager, null);
                                composer5.updateRememberedValue(rememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer5, (i32 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z13;
                            z7 = z14;
                            outputTransformation2 = outputTransformation5;
                            scrollState2 = scrollState4;
                            composer2 = composer5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier2 = modifier3;
                            textStyle3 = textStyle6;
                            function28 = function223;
                            function29 = function225;
                            function210 = function226;
                            function27 = function224;
                            function211 = function227;
                            shape2 = shape5;
                            inputTransformation2 = inputTransformation4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function27 = function24;
                            outputTransformation2 = outputTransformation;
                            scrollState2 = scrollState;
                            shape2 = shape;
                            textFieldColors2 = textFieldColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z6 = z4;
                            z7 = z5;
                            textStyle3 = textStyle2;
                            function28 = function26;
                            composer2 = startRestartGroup;
                            function29 = function22;
                            function210 = function23;
                            function211 = function25;
                            inputTransformation2 = inputTransformation;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit InputField$lambda$25;
                                    InputField$lambda$25 = SearchBarDefaults.InputField$lambda$25(SearchBarDefaults.this, textFieldState, function1, z, function12, modifier2, z6, z7, textStyle3, function28, function29, function210, function27, function211, inputTransformation2, outputTransformation2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return InputField$lambda$25;
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i21 = i3 & 262144;
                if (i21 == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i262 = i12;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            i17 = i3 & 8192;
            if (i17 != 0) {
            }
            i19 = i3 & 16384;
            if (i19 != 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i21 = i3 & 262144;
            if (i21 == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
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
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i2622 = i12;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        i17 = i3 & 8192;
        if (i17 != 0) {
        }
        i19 = i3 & 16384;
        if (i19 != 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i21 = i3 & 262144;
        if (i21 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i20 & 306783379) != 306783378, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$18$0(Function1 function1, FocusState focusState) {
        if (focusState.isFocused()) {
            function1.invoke(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$19$0(String str, boolean z, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (z) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputField$lambda$20$0(Function1 function1, TextFieldState textFieldState, Function0 function0) {
        function1.invoke(textFieldState.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$21$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2374@111872L60:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(314348414, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:2374)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, f, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1243105442, "C2374@111921L9:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$22$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2378@112083L62:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(581893311, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:2378)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, Dp.m9732constructorimpl(-f), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 213830624, "C2378@112133L10:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$23(TextFieldColors textFieldColors, boolean z, boolean z2, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2393@112900L7,2386@112478L460,2395@112963L63:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551441816, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:2385)");
            }
            final State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(textFieldColors.m4190containerColorXeAY9LY(z, false, z2), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), null, null, composer, 0, 12);
            BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.INSTANCE, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m200animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$18$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            }), shape), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Composer composer3;
        TextFieldColors textFieldColors3;
        MutableInteractionSource mutableInteractionSource3;
        int i12;
        TextFieldColors textFieldColors4;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource4;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(748018311);
        ComposerKt.sourceInformation(startRestartGroup, "C(InputField)N(query,onQueryChange,onSearch,expanded,onExpandedChange,modifier,enabled,placeholder,leadingIcon,trailingIcon,colors,interactionSource)2458@116231L25,2459@116292L29,2460@116367L7,2462@116406L34,2463@116485L39,2466@116577L7,2481@117140L44,2482@117216L227,2490@117546L7,2493@117800L19,2496@117929L1917,2470@116705L3152,2536@119944L320,2536@119919L345:SearchBar.kt#uh7d8r");
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
        int i14 = i3 & 32;
        if (i14 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i15 = i3 & 64;
        if (i15 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        int i16 = i3 & 128;
        if (i16 != 0) {
            i4 |= 12582912;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
            }
        }
        int i17 = i3 & 256;
        if (i17 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 = i17;
            i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i4 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(textFieldColors)) {
                        i13 = 4;
                        i8 = i2 | i13;
                    }
                    i13 = 2;
                    i8 = i2 | i13;
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i8 |= 48;
                    i10 = i9;
                } else {
                    i10 = i9;
                    if ((i2 & 48) == 0) {
                        i8 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    }
                }
                if ((i2 & 384) == 0) {
                    i8 |= startRestartGroup.changed(this) ? 256 : 128;
                }
                i11 = i8;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 147) != 146, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "2452@115972L18");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        companion = modifier;
                        function28 = function22;
                        function29 = function23;
                        mutableInteractionSource3 = mutableInteractionSource;
                        i12 = i11;
                        composer3 = startRestartGroup;
                        z4 = z2;
                        textFieldColors4 = textFieldColors;
                    } else {
                        companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z5 = i15 != 0 ? true : z2;
                        if (i16 != 0) {
                            function24 = null;
                        }
                        function28 = i5 != 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i7 != 0 ? null : function23;
                        if ((i3 & 1024) != 0) {
                            textFieldColors3 = m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i11 << 3) & 7168, GroupFlagsSpec.CHILD_NODE_COUNT_MASK);
                            composer3 = startRestartGroup;
                            i11 &= -15;
                        } else {
                            composer3 = startRestartGroup;
                            textFieldColors3 = textFieldColors;
                        }
                        if (i10 != 0) {
                            i12 = i11;
                            textFieldColors4 = textFieldColors3;
                            z4 = z5;
                            function29 = function210;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            i12 = i11;
                            textFieldColors4 = textFieldColors3;
                            z4 = z5;
                            function29 = function210;
                        }
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        modifier3 = companion;
                        ComposerKt.traceEventStart(748018311, i4, i12, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.kt:2454)");
                    } else {
                        modifier3 = companion;
                    }
                    if (mutableInteractionSource3 == null) {
                        composer3.startReplaceGroup(1923805460);
                        ComposerKt.sourceInformation(composer3, "2456@116150L39");
                        ComposerKt.sourceInformationMarkerStart(composer3, 1586078894, "CC(remember):SearchBar.kt#9igjgp");
                        Object rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1586078243);
                        composer3.endReplaceGroup();
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                    final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer3, 0).getValue().booleanValue();
                    ComposerKt.sourceInformationMarkerStart(composer3, 1586083428, "CC(remember):SearchBar.kt#9igjgp");
                    Object rememberedValue2 = composer3.rememberedValue();
                    final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new FocusRequester();
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                    final Function2<? super Composer, ? super Integer, Unit> function212 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function213 = function24;
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localFocusManager);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    FocusManager focusManager = (FocusManager) consume;
                    Strings.Companion companion2 = Strings.INSTANCE;
                    final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_search_bar_search), composer3, 0);
                    Strings.Companion companion3 = Strings.INSTANCE;
                    final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_suggestions_available), composer3, 0);
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = composer3.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    long m9171getColor0d7_KjU = ((TextStyle) consume2).m9171getColor0d7_KjU();
                    if (m9171getColor0d7_KjU == 16) {
                        m9171getColor0d7_KjU = textFieldColors4.m4242textColorXeAY9LY(z4, false, booleanValue);
                    }
                    long j = m9171getColor0d7_KjU;
                    Modifier modifier4 = modifier3;
                    Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1275sizeInqDBjuR0$default(modifier3, SearchBarKt.getSearchBarMinWidth(), InputFieldHeight, SearchBarKt.getSearchBarMaxWidth(), 0.0f, 8, null), focusRequester);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1586110579, "CC(remember):SearchBar.kt#9igjgp");
                    boolean z6 = (57344 & i4) == 16384;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (z6 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit InputField$lambda$29$0;
                                InputField$lambda$29$0 = SearchBarDefaults.InputField$lambda$29$0(Function1.this, (FocusState) obj);
                                return InputField$lambda$29$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (Function1) rememberedValue3);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1586113194, "CC(remember):SearchBar.kt#9igjgp");
                    final boolean z7 = z4;
                    boolean changed = ((i4 & 7168) == 2048) | composer3.changed(m4895getString2EP1pXo) | composer3.changed(m4895getString2EP1pXo2);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit InputField$lambda$30$0;
                                InputField$lambda$30$0 = SearchBarDefaults.InputField$lambda$30$0(m4895getString2EP1pXo, z, m4895getString2EP1pXo2, (SemanticsPropertyReceiver) obj);
                                return InputField$lambda$30$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (Function1) rememberedValue4, 1, null);
                    ProvidableCompositionLocal<TextStyle> localTextStyle2 = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localTextStyle2);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    TextStyle merge = ((TextStyle) consume3).merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    SolidColor solidColor = new SolidColor(textFieldColors4.m4192cursorColorvNxB06k(false), null);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m9356getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1586131674, "CC(remember):SearchBar.kt#9igjgp");
                    int i18 = i4 & 14;
                    boolean z8 = (i18 == 4) | ((i4 & 896) == 256);
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (z8 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit InputField$lambda$31$0;
                                InputField$lambda$31$0 = SearchBarDefaults.InputField$lambda$31$0(Function1.this, str, (KeyboardActionScope) obj);
                                return InputField$lambda$31$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    int i19 = i4;
                    final TextFieldColors textFieldColors5 = textFieldColors4;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-813926844, true, new Function3() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit InputField$lambda$32;
                            InputField$lambda$32 = SearchBarDefaults.InputField$lambda$32(str, z7, mutableInteractionSource5, function213, function212, function211, textFieldColors5, booleanValue, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return InputField$lambda$32;
                        }
                    }, composer3, 54);
                    int i20 = i18 | 102236160 | (i19 & 112);
                    int i21 = i19 >> 9;
                    Composer composer4 = composer3;
                    BasicTextFieldKt.BasicTextField(str, function1, semantics$default, z7, false, merge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) rememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) rememberComposableLambda, composer4, i20 | (i21 & 7168), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
                    composer2 = composer4;
                    boolean z9 = !z && booleanValue;
                    Boolean valueOf = Boolean.valueOf(z);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1586200583, "CC(remember):SearchBar.kt#9igjgp");
                    boolean changed2 = composer2.changed(z9) | composer2.changedInstance(focusManager);
                    SearchBarDefaults$InputField$25$1 rememberedValue6 = composer2.rememberedValue();
                    if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new SearchBarDefaults$InputField$25$1(z9, focusManager, null);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer2, i21 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z7;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    textFieldColors2 = textFieldColors5;
                    modifier2 = modifier4;
                    function27 = function213;
                    function25 = function212;
                    function26 = function211;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    function25 = function22;
                    function26 = function23;
                    textFieldColors2 = textFieldColors;
                    mutableInteractionSource2 = mutableInteractionSource;
                    function27 = function24;
                    z3 = z2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit InputField$lambda$34;
                            InputField$lambda$34 = SearchBarDefaults.InputField$lambda$34(SearchBarDefaults.this, str, function1, function12, z, function13, modifier2, z3, function27, function25, function26, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return InputField$lambda$34;
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i6;
            if ((i2 & 6) == 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((i2 & 384) == 0) {
            }
            i11 = i8;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i17;
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 6) == 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i11 = i8;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$29$0(Function1 function1, FocusState focusState) {
        if (focusState.isFocused()) {
            function1.invoke(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$30$0(String str, boolean z, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        if (z) {
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$31$0(Function1 function1, String str, KeyboardActionScope keyboardActionScope) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit InputField$lambda$32(String str, final boolean z, MutableInteractionSource mutableInteractionSource, Function2 function2, final Function2 function22, final Function2 function23, final TextFieldColors textFieldColors, final boolean z2, Function2 function24, Composer composer, int i) {
        Function2 function25;
        int i2;
        ComposableLambda rememberComposableLambda;
        ComposerKt.sourceInformation(composer, "CN(innerTextField)2513@118857L15,2516@119040L765,2497@117987L1841:SearchBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            function25 = function24;
            i2 = i | (composer.changedInstance(function25) ? 4 : 2);
        } else {
            function25 = function24;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813926844, i2, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:2497)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            ComposableLambda composableLambda = null;
            if (function22 == null) {
                composer.startReplaceGroup(1691265870);
                composer.endReplaceGroup();
                rememberComposableLambda = null;
            } else {
                composer.startReplaceGroup(1691265871);
                ComposerKt.sourceInformation(composer, "*2507@118500L64");
                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1718822048, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit InputField$lambda$32$0$0;
                        InputField$lambda$32$0$0 = SearchBarDefaults.InputField$lambda$32$0$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return InputField$lambda$32$0$0;
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            }
            if (function23 == null) {
                composer.startReplaceGroup(1691490155);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1691490156);
                ComposerKt.sourceInformation(composer, "*2511@118727L66");
                composableLambda = ComposableLambdaKt.rememberComposableLambda(-305306680, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit InputField$lambda$32$1$0;
                        InputField$lambda$32$1$0 = SearchBarDefaults.InputField$lambda$32$1$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return InputField$lambda$32$1$0;
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            }
            textFieldDefaults.DecorationBox(str, function25, z, true, none, mutableInteractionSource2, false, null, function2, rememberComposableLambda, composableLambda, null, null, null, INSTANCE.getInputFieldShape(composer, 6), textFieldColors, TextFieldDefaults.m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableLambdaKt.rememberComposableLambda(-1197464330, true, new Function2() { // from class: androidx.compose.material3.SearchBarDefaults$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InputField$lambda$32$2;
                    InputField$lambda$32$2 = SearchBarDefaults.InputField$lambda$32$2(TextFieldColors.this, z, z2, (Composer) obj, ((Integer) obj2).intValue());
                    return InputField$lambda$32$2;
                }
            }, composer, 54), composer, ((i2 << 3) & 112) | 27648, 113246208, 14528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$32$0$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2507@118502L60:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718822048, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:2507)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, f, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1796932852, "C2507@118551L9:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$32$1$0(Function2 function2, Composer composer, int i) {
        float f;
        ComposerKt.sourceInformation(composer, "C2511@118729L62:SearchBar.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-305306680, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:2511)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            f = SearchBarKt.SearchBarIconOffsetX;
            Modifier m1158offsetVpY3zN4$default = OffsetKt.m1158offsetVpY3zN4$default(companion, Dp.m9732constructorimpl(-f), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1158offsetVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1336107703, "C2511@118779L10:SearchBar.kt#uh7d8r");
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputField$lambda$32$2(TextFieldColors textFieldColors, boolean z, boolean z2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2525@119573L7,2518@119123L492,2528@119733L15,2527@119644L135:SearchBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197464330, i, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:2517)");
            }
            final State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(textFieldColors.m4190containerColorXeAY9LY(z, false, z2), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), null, null, composer, 0, 12);
            BoxKt.Box(TextFieldImplKt.textFieldBackground(Modifier.INSTANCE, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m200animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.SearchBarDefaults$InputField$24$3$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            }), INSTANCE.getInputFieldShape(composer, 6)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final /* synthetic */ SearchBarColors m3822colorsdgg9oW8(long j, long j2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 891254734, "C(colors)N(containerColor:c#ui.graphics.Color,dividerColor:c#ui.graphics.Color)2549@120448L5,2550@120515L5,2556@120705L218:SearchBar.kt#uh7d8r");
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(891254734, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:2552)");
        }
        int i3 = i << 3;
        long j3 = value;
        SearchBarColors searchBarColors = new SearchBarColors(j3, value2, m3830inputFieldColorsJVEmHcM(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j3, j3, j3, composer, 0, 0, ((i << 6) & 896) | (i & 14) | (i3 & 112) | (i3 & 7168), 1048575), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m3829inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, -2048506052, "C(inputFieldColors)N(focusedTextColor:c#ui.graphics.Color,unfocusedTextColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,selectionColors,focusedLeadingIconColor:c#ui.graphics.Color,unfocusedLeadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,focusedTrailingIconColor:c#ui.graphics.Color,unfocusedTrailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,focusedPlaceholderColor:c#ui.graphics.Color,unfocusedPlaceholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color)2566@121114L5,2567@121188L5,2569@121283L5,2572@121439L5,2573@121518L7,2574@121601L5,2575@121684L5,2577@121792L5,2580@121968L5,2581@122053L5,2583@122163L5,2586@122341L5,2587@122427L5,2589@122529L5,2608@123576L5,2609@123657L5,2611@123753L5,2614@123927L5,2615@124008L5,2617@124104L5,2620@124273L5,2621@124349L5,2622@124424L5,2593@122656L1784:SearchBar.kt#uh7d8r");
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long m6785copywmQWz5c$default = (i3 & 4) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long value3 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        if ((i3 & 16) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long value5 = (i3 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long m6785copywmQWz5c$default2 = (i3 & 128) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value6 = (i3 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value7 = (i3 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long m6785copywmQWz5c$default3 = (i3 & 1024) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long value8 = (i3 & 2048) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long value9 = (i3 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long m6785copywmQWz5c$default4 = (i3 & 8192) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048506052, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:2593)");
        }
        long j14 = value3;
        long j15 = m6785copywmQWz5c$default;
        long j16 = value4;
        long j17 = value6;
        long j18 = value8;
        long j19 = m6785copywmQWz5c$default2;
        long j20 = m6785copywmQWz5c$default3;
        TextFieldColors m3830inputFieldColorsJVEmHcM = m3830inputFieldColorsJVEmHcM(value, value2, j15, j14, textSelectionColors2, j16, value5, j19, j17, value7, j20, j18, value9, m6785copywmQWz5c$default4, ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6), ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6), ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6), composer, i & 2147483646, i2 & 8190, (i2 >> 3) & 7168, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3830inputFieldColorsJVEmHcM;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m3828inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, 1842555178, "C(inputFieldColors)N(textColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,selectionColors,focusedLeadingIconColor:c#ui.graphics.Color,unfocusedLeadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,focusedTrailingIconColor:c#ui.graphics.Color,unfocusedTrailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,placeholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color)2628@124613L5,2630@124708L5,2633@124864L5,2634@124943L7,2635@125026L5,2636@125109L5,2638@125217L5,2641@125393L5,2642@125478L5,2644@125588L5,2647@125759L5,2649@125861L5,2653@125971L825:SearchBar.kt#uh7d8r");
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long m6785copywmQWz5c$default = (i3 & 2) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long value2 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j3;
        if ((i3 & 8) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long value3 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long m6785copywmQWz5c$default2 = (i3 & 64) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long value5 = (i3 & 128) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j7;
        long value6 = (i3 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long m6785copywmQWz5c$default3 = (i3 & 512) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long value7 = (i3 & 1024) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j10;
        long m6785copywmQWz5c$default4 = (i3 & 2048) != 0 ? Color.m6785copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:2653)");
        }
        int i4 = i << 3;
        int i5 = i2 << 3;
        int i6 = i2 << 6;
        long j12 = value;
        long j13 = value2;
        long j14 = value3;
        long j15 = value4;
        long j16 = m6785copywmQWz5c$default2;
        long j17 = value6;
        long j18 = value7;
        TextSelectionColors textSelectionColors3 = textSelectionColors2;
        long j19 = value5;
        long j20 = m6785copywmQWz5c$default3;
        TextFieldColors m3830inputFieldColorsJVEmHcM = m3830inputFieldColorsJVEmHcM(j12, j12, m6785copywmQWz5c$default, j13, textSelectionColors3, j14, j15, j16, j19, j17, j20, j18, j18, m6785copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), ((i >> 27) & 14) | (i5 & 112) | (i6 & 896) | (i6 & 7168), i5 & 7168, 8372224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3830inputFieldColorsJVEmHcM;
    }

    public final Shape getDockedDropdownShape() {
        return RoundedCornerShapeKt.RoundedCornerShape(CornerSizeKt.m1574CornerSize0680j_4(Dp.m9732constructorimpl(12)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputField$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
