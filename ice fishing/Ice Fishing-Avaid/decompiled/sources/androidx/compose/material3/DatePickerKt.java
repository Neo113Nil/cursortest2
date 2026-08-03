package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aE\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aO\u0010\u001f\u001a\u00020\u00032\n\u0010 \u001a\u00060!j\u0002`\"2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$\u001a\u0081\u0001\u0010%\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001a2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0001012\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b2\u00103\u001a£\u0001\u00104\u001a\u00020\u00012\b\u00105\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u001a2#\u00107\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0001012!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0001012\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b?\u0010@\u001a\u008d\u0001\u0010A\u001a\u00020\u00012\b\u00105\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u00020\u00152!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0001012!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0001012\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010B\u001aW\u0010C\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\bH\u0010I\u001a£\u0001\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020L2\b\u00105\u001a\u0004\u0018\u00010\u00152!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0001012!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0001012\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010N\u001a\u00020OH\u0003¢\u0006\u0002\u0010P\u001aI\u0010Q\u001a\u00020\u00012\u0006\u0010K\u001a\u00020L2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u0001012\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u0018H\u0080@¢\u0006\u0002\u0010R\u001a\u001d\u0010S\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\u0010T\u001a¢\u0001\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020W2!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0001012\u0006\u0010X\u001a\u00020\u00152\b\u0010Y\u001a\u0004\u0018\u00010\u00152\b\u0010Z\u001a\u0004\u0018\u00010\u00152\b\u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\n\u0010 \u001a\u00060!j\u0002`\"2\u0006\u0010K\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010O2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010]\u001a\u0010\u0010^\u001a\u00020_2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\u001aL\u0010`\u001a\u00020\u0005*\u00020\u00052\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020L2\u0006\u0010d\u001a\u00020e2\b\u0010N\u001a\u0004\u0018\u00010O2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002\u001a7\u0010f\u001a\u00020\u00012\u0006\u0010V\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020L2\u0006\u0010N\u001a\u00020O2\u0006\u0010g\u001a\u00020h2\u0006\u0010d\u001a\u00020eH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0018\u0010k\u001a\u00020_2\u0006\u0010V\u001a\u00020W2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0018\u0010l\u001a\u00020_2\u0006\u0010V\u001a\u00020W2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a7\u0010m\u001a\u0004\u0018\u00010n2\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010t\u001ac\u0010u\u001a\u00020\u00012\u0006\u0010v\u001a\u00020n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u000f2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010y\u001a\u00020\u000f2\u0006\u0010z\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020n2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010~\u001a\u008a\u0001\u0010\u007f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00152#\u0010\u0080\u0001\u001a\u001e\u0012\u0014\u0012\u00120_¢\u0006\r\b8\u0012\t\b9\u0012\u0005\b\b(\u0081\u0001\u0012\u0004\u0012\u00020\u0001012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0007\u0010\u0082\u0001\u001a\u00020\u00112\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0003\u0010\u0085\u0001\u001aV\u0010\u0086\u0001\u001a\u00020\u00012\u0006\u0010v\u001a\u00020n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010z\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020n2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0003\u0010\u0088\u0001\u001a\u0091\u0001\u0010\u0089\u0001\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020n2\u0007\u0010\u008e\u0001\u001a\u00020\u00052\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\r\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0007\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0003\u0010\u0094\u0001\u001aC\u0010\u0095\u0001\u001a\u00020\u00012\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0003\u0010\u0097\u0001\u001aD\u0010\u0098\u0001\u001a\u00020\u00012\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010z\u001a\u00020\u000fH\u0003¢\u0006\u0003\u0010\u009c\u0001\u001a\u001f\u0010\u009d\u0001\u001a\u00020\u000f*\u00030\u009e\u00012\u0006\u0010a\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u001f\u0010¡\u0001\u001a\u00020\u000f*\u00030\u009e\u00012\u0006\u0010a\u001a\u00020\u000fH\u0002¢\u0006\u0006\b¢\u0001\u0010 \u0001\"\u001a\u0010£\u0001\u001a\u00020*X\u0080\u0004¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u001a\u0010§\u0001\u001a\u00020*X\u0080\u0004¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\b¨\u0001\u0010¥\u0001\"\u001a\u0010©\u0001\u001a\u00020*X\u0080\u0004¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0018\u0010«\u0001\u001a\u00030¬\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0010\u0010¯\u0001\u001a\u00030¬\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010°\u0001\u001a\u00030¬\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010±\u0001\u001a\u00020*X\u0082\u0004¢\u0006\u0005\n\u0003\u0010¦\u0001\"\u000f\u0010²\u0001\u001a\u00020_X\u0082T¢\u0006\u0002\n\u0000\"\u000f\u0010³\u0001\u001a\u00020_X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010´\u0001\u001a\u00020\u000f*\u00030\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u001c\u0010·\u0001\u001a\u00020\u000f*\u00030\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¶\u0001\"\u001c\u0010¹\u0001\u001a\u00020\u000f*\u00030\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¶\u0001\"\u001c\u0010»\u0001\u001a\u00020\u000f*\u00030\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010¶\u0001¨\u0006½\u0001²\u0006\u000b\u0010\u008c\u0001\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"DatePicker", "", "state", "Landroidx/compose/material3/DatePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "colors", "Landroidx/compose/material3/DatePickerColors;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "rememberDatePickerState", "initialSelectedDateMillis", "", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "rememberDatePickerState-EU0dCGE", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "DatePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "DatePickerState-sHin3Bw", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;", "DateEntryContainer", "modeToggleButton", "headlineTextStyle", "Landroidx/compose/ui/text/TextStyle;", "headerMinHeight", "Landroidx/compose/ui/unit/Dp;", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "displayMode", "onDisplayModeChange", "Lkotlin/Function1;", "DisplayModeToggleButton-iUJLfQg", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "selectedDateMillis", "displayedMonthMillis", "onDateSelectionChange", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "onDisplayedMonthChange", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "SwitchableDateEntryContent-KaiTk9E", "(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "DatePickerContent", "(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "titleContentColor", "Landroidx/compose/ui/graphics/Color;", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "HorizontalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onReturnFocus", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/Composer;II)V", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Month", "month", "Landroidx/compose/material3/internal/CalendarMonth;", "todayMillis", "startDateMillis", "endDateMillis", "rangeSelectionInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "(Landroidx/compose/material3/internal/CalendarMonth;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Ljava/util/Locale;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "numberOfMonthsInRange", "", "dayOnKeyEvent", "isRtl", "isFirstDay", "isLastDay", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "goToMonth", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "goToMonth-BhxgA10", "(ILandroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/focus/FocusManager;ILkotlinx/coroutines/CoroutineScope;)V", "getFirstEnabledDay", "getLastEnabledDay", "dayContentDescription", "", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Day", "text", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "YearPicker", "onYearSelected", "year", "currentYearFocusRequester", "onYearShiftTabPressed", "onYearTabPressed", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Year", "currentYear", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "MonthsNavigation", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "nextButtonModifier", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "onYearPickerButtonTabPressed", "yearSelectionButtonFocusRequester", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "YearPickerMenuButton", "expanded", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconButtonWithTooltip", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "contentDescription", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "isDirectionBackwards", "Landroidx/compose/ui/input/key/KeyEvent;", "isDirectionBackwards-YhN2O0w", "(Landroid/view/KeyEvent;Z)Z", "isDirectionForward", "isDirectionForward-YhN2O0w", "RecommendedSizeForAccessibility", "getRecommendedSizeForAccessibility", "()F", "F", "MonthYearHeight", "getMonthYearHeight", "DatePickerHorizontalPadding", "getDatePickerHorizontalPadding", "DatePickerModeTogglePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "MaxCalendarRows", "YearsInRow", "isShiftTab", "isShiftTab-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isTab", "isTab-ZmokQxo", "isDirectionLeft", "isDirectionLeft-ZmokQxo", "isDirectionRight", "isDirectionRight-ZmokQxo", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = Dp.m9732constructorimpl(48);
    private static final float MonthYearHeight = Dp.m9732constructorimpl(56);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateEntryContainer_au3_HiA$lambda$2(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, DatePickerColors datePickerColors, TextStyle textStyle, float f, Function2 function24, int i, Composer composer, int i2) {
        m2911DateEntryContainerau3_HiA(modifier, function2, function22, function23, datePickerColors, textStyle, f, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$7(DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2 function2, Function2 function22, boolean z, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        DatePicker(datePickerState, modifier, datePickerFormatter, datePickerColors, function2, function22, z, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$6(Long l, long j, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        DatePickerContent(l, j, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerHeader_pc5RIQQ$lambda$1(Modifier modifier, Function2 function2, long j, long j2, float f, Function2 function22, int i, Composer composer, int i2) {
        m2912DatePickerHeaderpc5RIQQ(modifier, function2, j, j2, f, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Day$lambda$2(String str, Modifier modifier, boolean z, Function0 function0, boolean z2, boolean z3, boolean z4, boolean z5, String str2, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        Day(str, modifier, z, function0, z2, z3, z4, z5, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayModeToggleButton_iUJLfQg$lambda$1(Modifier modifier, int i, Function1 function1, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        m2915DisplayModeToggleButtoniUJLfQg(modifier, i, function1, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float HorizontalMonthsList$lambda$1$0$0$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float HorizontalMonthsList$lambda$1$0$0$1() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMonthsList$lambda$3(LazyListState lazyListState, Long l, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Function0 function0, FocusManager focusManager, int i, int i2, Composer composer, int i3) {
        HorizontalMonthsList(lazyListState, l, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, function0, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonWithTooltip$lambda$2(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        IconButtonWithTooltip(function0, imageVector, str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Month$lambda$2(CalendarMonth calendarMonth, Function1 function1, long j, Long l, Long l2, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, LazyListState lazyListState, FocusManager focusManager, Function0 function0, int i, int i2, Composer composer, int i3) {
        Month(calendarMonth, function1, j, l, l2, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, lazyListState, focusManager, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonthsNavigation$lambda$1(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Modifier modifier2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, FocusRequester focusRequester, DatePickerColors datePickerColors, int i, int i2, Composer composer, int i3) {
        MonthsNavigation(modifier, z, z2, z3, str, modifier2, function0, function02, function03, function04, focusRequester, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4(FiniteAnimationSpec finiteAnimationSpec, IntSize intSize, IntSize intSize2) {
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_KaiTk9E$lambda$4(Long l, long j, int i, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        m2916SwitchableDateEntryContentKaiTk9E(l, j, i, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeekDays$lambda$1(DatePickerColors datePickerColors, CalendarModel calendarModel, int i, Composer composer, int i2) {
        WeekDays(datePickerColors, calendarModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Year$lambda$3(String str, Modifier modifier, boolean z, boolean z2, Function0 function0, boolean z3, String str2, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        Year(str, modifier, z, z2, function0, z3, str2, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPicker$lambda$2(Modifier modifier, long j, Function1 function1, SelectableDates selectableDates, CalendarModel calendarModel, IntRange intRange, DatePickerColors datePickerColors, FocusRequester focusRequester, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        YearPicker(modifier, j, function1, selectableDates, calendarModel, intRange, datePickerColors, focusRequester, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPickerMenuButton$lambda$1(Function0 function0, boolean z, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        YearPickerMenuButton(function0, z, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$1(DatePickerState datePickerState, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C188@9018L189:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1655706771, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:188)");
            }
            DatePickerDefaults.INSTANCE.m2885DatePickerTitleFNtVw6o(datePickerState.mo2936getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DatePickerTitlePadding), datePickerColors.getTitleContentColor(), composer, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$2(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C195@9286L300:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439279037, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:195)");
            }
            DatePickerDefaults.INSTANCE.m2884DatePickerHeadlineISIPfiY(datePickerState.getSelectedDateMillis(), datePickerState.mo2936getDisplayModejFl4v0(), datePickerFormatter, PaddingKt.padding(Modifier.INSTANCE, DatePickerHeadlinePadding), datePickerColors.getHeadlineContentColor(), composer, 199680, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DatePicker(final DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, FocusRequester focusRequester, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DatePickerColors datePickerColors2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        boolean z2;
        int i7;
        Composer composer2;
        final DatePickerFormatter datePickerFormatter2;
        final FocusRequester focusRequester2;
        final Modifier modifier3;
        final DatePickerColors datePickerColors3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        final DatePickerFormatter datePickerFormatter3;
        final DatePickerColors datePickerColors4;
        int i8;
        boolean z4;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z5;
        final DatePickerColors datePickerColors5;
        Modifier modifier4;
        int i10;
        FocusRequester focusRequester3;
        CalendarModel createCalendarModel;
        final DatePickerFormatter datePickerFormatter4;
        ComposableLambda composableLambda;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1105472031);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePicker)N(state,modifier,dateFormatter,colors,title,headline,showModeToggle,focusRequester)207@9735L207,231@10616L5,234@10725L701,214@9947L1479:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(datePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                }
                i12 = 128;
                i3 |= i12;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (startRestartGroup.changed(datePickerColors2)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                datePickerColors2 = datePickerColors;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "185@8841L47,186@8940L8,187@8989L224,194@9257L335,204@9668L29");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 4) != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1501703566, "CC(remember):DatePicker.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    datePickerFormatter3 = (DatePickerFormatter) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i3 &= -897;
                                } else {
                                    datePickerFormatter3 = datePickerFormatter;
                                }
                                if ((i2 & 8) != 0) {
                                    datePickerColors4 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    datePickerColors4 = datePickerColors2;
                                }
                                if (i4 != 0) {
                                    i8 = i3;
                                    z4 = true;
                                    function23 = ComposableLambdaKt.rememberComposableLambda(1655706771, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DatePicker$lambda$1;
                                            DatePicker$lambda$1 = DatePickerKt.DatePicker$lambda$1(DatePickerState.this, datePickerColors4, (Composer) obj, ((Integer) obj2).intValue());
                                            return DatePicker$lambda$1;
                                        }
                                    }, startRestartGroup, 54);
                                    i9 = 54;
                                } else {
                                    i8 = i3;
                                    z4 = true;
                                    i9 = 54;
                                }
                                if (i5 != 0) {
                                    function24 = ComposableLambdaKt.rememberComposableLambda(1439279037, z4, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DatePicker$lambda$2;
                                            DatePicker$lambda$2 = DatePickerKt.DatePicker$lambda$2(DatePickerState.this, datePickerFormatter3, datePickerColors4, (Composer) obj, ((Integer) obj2).intValue());
                                            return DatePicker$lambda$2;
                                        }
                                    }, startRestartGroup, i9);
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1501730012, "CC(remember):DatePicker.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    DatePickerColors datePickerColors6 = datePickerColors4;
                                    focusRequester3 = (FocusRequester) rememberedValue2;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors6;
                                    function26 = function23;
                                    modifier4 = modifier2;
                                    i10 = i8;
                                } else {
                                    function26 = function23;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors4;
                                    modifier4 = modifier2;
                                    i10 = i8;
                                    focusRequester3 = focusRequester;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                datePickerFormatter3 = datePickerFormatter;
                                focusRequester3 = focusRequester;
                                function26 = function23;
                                modifier4 = modifier2;
                                i10 = i3;
                                z5 = z2;
                                datePickerColors5 = datePickerColors2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1105472031, i10, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:205)");
                            }
                            Locale locale = datePickerState.getLocale();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1501732334, "CC(remember):DatePicker.kt#9igjgp");
                            boolean changed = startRestartGroup.changed(locale);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (datePickerState instanceof BaseDatePickerStateImpl) {
                                    createCalendarModel = ((BaseDatePickerStateImpl) datePickerState).getCalendarModel();
                                } else {
                                    createCalendarModel = CalendarModel_androidKt.createCalendarModel(datePickerState.getLocale());
                                }
                                rememberedValue3 = createCalendarModel;
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final CalendarModel calendarModel = (CalendarModel) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-690563017);
                                ComposerKt.sourceInformation(startRestartGroup, "220@10125L364");
                                datePickerFormatter4 = datePickerFormatter3;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(-1483431603, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda32
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DatePicker$lambda$5;
                                        DatePicker$lambda$5 = DatePickerKt.DatePicker$lambda$5(DatePickerState.this, datePickerColors5, (Composer) obj, ((Integer) obj2).intValue());
                                        return DatePicker$lambda$5;
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                datePickerFormatter4 = datePickerFormatter3;
                                startRestartGroup.startReplaceGroup(-690175393);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = null;
                            }
                            final FocusRequester focusRequester4 = focusRequester3;
                            final DatePickerColors datePickerColors7 = datePickerColors5;
                            DatePickerFormatter datePickerFormatter5 = datePickerFormatter4;
                            int i14 = i10 >> 9;
                            composer2 = startRestartGroup;
                            m2911DateEntryContainerau3_HiA(modifier4, function26, function24, composableLambda, datePickerColors5, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderHeadlineFont(), startRestartGroup, 6), DatePickerModalTokens.INSTANCE.m5136getHeaderContainerHeightD9Ej5fM(), ComposableLambdaKt.rememberComposableLambda(-1346903698, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda43
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DatePicker$lambda$6;
                                    DatePicker$lambda$6 = DatePickerKt.DatePicker$lambda$6(DatePickerState.this, calendarModel, datePickerFormatter4, datePickerColors7, focusRequester4, (Composer) obj, ((Integer) obj2).intValue());
                                    return DatePicker$lambda$6;
                                }
                            }, startRestartGroup, 54), composer2, ((i10 >> 3) & 14) | 14155776 | (i14 & 112) | (i14 & 896) | (57344 & (i10 << 3)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            datePickerFormatter2 = datePickerFormatter5;
                            focusRequester2 = focusRequester4;
                            z3 = z5;
                            modifier3 = modifier4;
                            function25 = function26;
                            datePickerColors3 = datePickerColors5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            datePickerFormatter2 = datePickerFormatter;
                            focusRequester2 = focusRequester;
                            modifier3 = modifier2;
                            datePickerColors3 = datePickerColors2;
                            function25 = function23;
                            z3 = z2;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda54
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DatePicker$lambda$7;
                                    DatePicker$lambda$7 = DatePickerKt.DatePicker$lambda$7(DatePickerState.this, modifier3, datePickerFormatter2, datePickerColors3, function25, function27, z3, focusRequester2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DatePicker$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    final Function2 function272 = function24;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                final Function2 function2722 = function24;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            final Function2 function27222 = function24;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        final Function2 function272222 = function24;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$5(final DatePickerState datePickerState, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C224@10357L50,221@10147L324:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483431603, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:221)");
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerModeTogglePadding);
            int mo2936getDisplayModejFl4v0 = datePickerState.mo2936getDisplayModejFl4v0();
            ComposerKt.sourceInformationMarkerStart(composer, 351379263, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = composer.changed(datePickerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DatePicker$lambda$5$0$0;
                        DatePicker$lambda$5$0$0 = DatePickerKt.DatePicker$lambda$5$0$0(DatePickerState.this, (DisplayMode) obj);
                        return DatePicker$lambda$5$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m2915DisplayModeToggleButtoniUJLfQg(padding, mo2936getDisplayModejFl4v0, (Function1) rememberedValue, datePickerColors, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$5$0$0(DatePickerState datePickerState, DisplayMode displayMode) {
        datePickerState.mo2937setDisplayModevCnGnXg(displayMode.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$6(final DatePickerState datePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C239@10966L59,240@11064L91,235@10735L685:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1346903698, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:235)");
            }
            Long selectedDateMillis = datePickerState.getSelectedDateMillis();
            long displayedMonthMillis = datePickerState.getDisplayedMonthMillis();
            int mo2936getDisplayModejFl4v0 = datePickerState.mo2936getDisplayModejFl4v0();
            ComposerKt.sourceInformationMarkerStart(composer, -1589289911, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = composer.changed(datePickerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DatePicker$lambda$6$0$0;
                        DatePicker$lambda$6$0$0 = DatePickerKt.DatePicker$lambda$6$0$0(DatePickerState.this, (Long) obj);
                        return DatePicker$lambda$6$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1589286743, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed2 = composer.changed(datePickerState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DatePicker$lambda$6$1$0;
                        DatePicker$lambda$6$1$0 = DatePickerKt.DatePicker$lambda$6$1$0(DatePickerState.this, ((Long) obj).longValue());
                        return DatePicker$lambda$6$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m2916SwitchableDateEntryContentKaiTk9E(selectedDateMillis, displayedMonthMillis, mo2936getDisplayModejFl4v0, function1, (Function1) rememberedValue2, calendarModel, datePickerState.getYearRange(), datePickerFormatter, datePickerState.getSelectableDates(), datePickerColors, focusRequester, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$6$0$0(DatePickerState datePickerState, Long l) {
        datePickerState.setSelectedDateMillis(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$6$1$0(DatePickerState datePickerState, long j) {
        datePickerState.setDisplayedMonthMillis(j);
        return Unit.INSTANCE;
    }

    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m2929rememberDatePickerStateEU0dCGE(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 2065763010, "C(rememberDatePickerState)N(initialSelectedDateMillis,initialDisplayedMonthMillis,yearRange,initialDisplayMode:c#material3.DisplayMode,selectableDates)389@16675L15,390@16779L384,390@16702L461:DatePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            l = null;
        }
        final Long l3 = l;
        final Long l4 = (i3 & 2) != 0 ? l3 : l2;
        final IntRange yearRange = (i3 & 4) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int m3050getPickerjFl4v0 = (i3 & 8) != 0 ? DisplayMode.INSTANCE.m3050getPickerjFl4v0() : i;
        final SelectableDates allDates = (i3 & 16) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:388)");
        }
        final Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.INSTANCE.Saver(allDates, defaultLocale);
        ComposerKt.sourceInformationMarkerStart(composer, 923378690, "CC(remember):DatePicker.kt#9igjgp");
        boolean z = true;
        boolean changedInstance = ((((i2 & 14) ^ 6) > 4 && composer.changed(l3)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(l4)) || (i2 & 48) == 32) | composer.changedInstance(yearRange) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(m3050getPickerjFl4v0)) || (i2 & 3072) == 2048);
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(allDates)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean changed = changedInstance | z | composer.changed(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DatePickerStateImpl rememberDatePickerState_EU0dCGE$lambda$0$0;
                    rememberDatePickerState_EU0dCGE$lambda$0$0 = DatePickerKt.rememberDatePickerState_EU0dCGE$lambda$0$0(l3, l4, yearRange, m3050getPickerjFl4v0, allDates, defaultLocale);
                    return rememberDatePickerState_EU0dCGE$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        datePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return datePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DatePickerStateImpl rememberDatePickerState_EU0dCGE$lambda$0$0(Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, Locale locale) {
        return new DatePickerStateImpl(l, l2, intRange, i, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m2914DatePickerStatesHin3Bw$default(Locale locale, Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = l;
        }
        if ((i2 & 8) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 16) != 0) {
            i = DisplayMode.INSTANCE.m3050getPickerjFl4v0();
        }
        if ((i2 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        SelectableDates selectableDates2 = selectableDates;
        IntRange intRange2 = intRange;
        return m2913DatePickerStatesHin3Bw(locale, l, l2, intRange2, i, selectableDates2);
    }

    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m2913DatePickerStatesHin3Bw(Locale locale, Long l, Long l2, IntRange intRange, int i, SelectableDates selectableDates) {
        return new DatePickerStateImpl(l, l2, intRange, i, selectableDates, locale, null);
    }

    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m2911DateEntryContainerau3_HiA(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        DatePickerColors datePickerColors2;
        TextStyle textStyle2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1539132883);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateEntryContainer)N(modifier,title,headline,modeToggleButton,colors,headlineTextStyle,headerMinHeight:c#ui.unit.Dp,content)1374@64221L236,1370@64073L1910:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function25 = function2;
            i2 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i & 384) == 0) {
            function26 = function22;
            i2 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        } else {
            function26 = function22;
        }
        if ((i & 3072) == 0) {
            function27 = function23;
            i2 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
        } else {
            function27 = function23;
        }
        if ((i & 24576) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? 16384 : 8192;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((196608 & i) == 0) {
            textStyle2 = textStyle;
            i2 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539132883, i2, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1369)");
            }
            int i3 = i2;
            Modifier m1275sizeInqDBjuR0$default = SizeKt.m1275sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m5130getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1637965631, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DateEntryContainer_au3_HiA$lambda$0$0;
                        DateEntryContainer_au3_HiA$lambda$0$0 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return DateEntryContainer_au3_HiA$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(m1275sizeInqDBjuR0$default, false, (Function1) rememberedValue, 1, null), datePickerColors2.getContainerColor(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m353backgroundbw27NRU$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1831145178, "C1388@64776L1183,1382@64525L1434,1414@65968L9:DatePicker.kt#uh7d8r");
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final TextStyle textStyle3 = textStyle2;
            m2912DatePickerHeaderpc5RIQQ(Modifier.INSTANCE, function2, datePickerColors2.getTitleContentColor(), datePickerColors2.getHeadlineContentColor(), f, ComposableLambdaKt.rememberComposableLambda(-1658370654, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DateEntryContainer_au3_HiA$lambda$1$0;
                    DateEntryContainer_au3_HiA$lambda$1$0 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$1$0(Function2.this, function210, function28, datePickerColors3, textStyle3, (Composer) obj, ((Integer) obj2).intValue());
                    return DateEntryContainer_au3_HiA$lambda$1$0;
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            composer2 = startRestartGroup;
            function24.invoke(composer2, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DateEntryContainer_au3_HiA$lambda$2;
                    DateEntryContainer_au3_HiA$lambda$2 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$2(Modifier.this, function2, function22, function23, datePickerColors, textStyle, f, function24, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DateEntryContainer_au3_HiA$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateEntryContainer_au3_HiA$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateEntryContainer_au3_HiA$lambda$1$0(final Function2 function2, Function2 function22, Function2 function23, DatePickerColors datePickerColors, TextStyle textStyle, Composer composer, int i) {
        Arrangement.HorizontalOrVertical end;
        ComposerKt.sourceInformation(composer, "C1389@64790L1159:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658370654, i, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1389)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -251319653, "C1396@65151L521:DatePicker.kt#uh7d8r");
            if (function2 != null && function22 != null) {
                end = Arrangement.INSTANCE.getSpaceBetween();
            } else if (function2 != null) {
                end = Arrangement.INSTANCE.getStart();
            } else {
                end = Arrangement.INSTANCE.getEnd();
            }
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
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
            Updater.m5872setimpl(m5864constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -516047984, "C:DatePicker.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(-516028300);
                ComposerKt.sourceInformation(composer, "1402@65479L106,1402@65435L150");
                TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.rememberComposableLambda(-738208900, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DateEntryContainer_au3_HiA$lambda$1$0$0$0$0;
                        DateEntryContainer_au3_HiA$lambda$1$0$0$0$0 = DatePickerKt.DateEntryContainer_au3_HiA$lambda$1$0$0$0$0(RowScope.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                        return DateEntryContainer_au3_HiA$lambda$1$0$0$0$0;
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-515838022);
                composer.endReplaceGroup();
            }
            if (function22 == null) {
                composer.startReplaceGroup(-515799087);
            } else {
                composer.startReplaceGroup(260455984);
                ComposerKt.sourceInformation(composer, "1406@65646L8");
                function22.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function23 != null || function2 != null || function22 != null) {
                composer.startReplaceGroup(-250360576);
                ComposerKt.sourceInformation(composer, "1410@65871L46");
                DividerKt.m3057HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors.getDividerColor(), composer, 0, 3);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-250277930);
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
    public static final Unit DateEntryContainer_au3_HiA$lambda$1$0$0$0$0(RowScope rowScope, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1403@65509L50:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-738208900, i, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1403)");
            }
            Modifier weight$default = RowScope.CC.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1330662525, "C1403@65547L10:DatePicker.kt#uh7d8r");
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

    /* renamed from: DisplayModeToggleButton-iUJLfQg, reason: not valid java name */
    public static final void m2915DisplayModeToggleButtoniUJLfQg(final Modifier modifier, final int i, final Function1<? super DisplayMode, Unit> function1, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1461252485);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplayModeToggleButton)N(modifier,displayMode:c#material3.DisplayMode,onDisplayModeChange,colors)1425@66258L658,1425@66177L739:DatePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461252485, i3, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1424)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(datePickerColors.getHeadlineContentColor())), ComposableLambdaKt.rememberComposableLambda(-1734512197, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisplayModeToggleButton_iUJLfQg$lambda$0;
                    DisplayModeToggleButton_iUJLfQg$lambda$0 = DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0(i, function1, modifier, (Composer) obj, ((Integer) obj2).intValue());
                    return DisplayModeToggleButton_iUJLfQg$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisplayModeToggleButton_iUJLfQg$lambda$1;
                    DisplayModeToggleButton_iUJLfQg$lambda$1 = DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$1(Modifier.this, i, function1, datePickerColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DisplayModeToggleButton_iUJLfQg$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayModeToggleButton_iUJLfQg$lambda$0(int i, final Function1 function1, Modifier modifier, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734512197, i2, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1426)");
            }
            if (DisplayMode.m3045equalsimpl0(i, DisplayMode.INSTANCE.m3050getPickerjFl4v0())) {
                composer.startReplaceGroup(-101251783);
                ComposerKt.sourceInformation(composer, "1431@66530L46,1428@66370L42,1427@66321L270");
                ImageVector edit$material3 = Icons.Filled.INSTANCE.getEdit$material3();
                Strings.Companion companion = Strings.INSTANCE;
                String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_input_mode), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -418906843, "CC(remember):DatePicker.kt#9igjgp");
                boolean changed = composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DisplayModeToggleButton_iUJLfQg$lambda$0$0$0;
                            DisplayModeToggleButton_iUJLfQg$lambda$0$0$0 = DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0$0$0(Function1.this);
                            return DisplayModeToggleButton_iUJLfQg$lambda$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonWithTooltip((Function0) rememberedValue, edit$material3, m4895getString2EP1pXo, modifier, false, composer, 0, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-100953904);
                ComposerKt.sourceInformation(composer, "1438@66836L49,1435@66670L43,1434@66621L279");
                ImageVector dateRange$material3 = Icons.Filled.INSTANCE.getDateRange$material3();
                Strings.Companion companion2 = Strings.INSTANCE;
                String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_calendar_mode), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -418897242, "CC(remember):DatePicker.kt#9igjgp");
                boolean changed2 = composer.changed(function1);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DisplayModeToggleButton_iUJLfQg$lambda$0$1$0;
                            DisplayModeToggleButton_iUJLfQg$lambda$0$1$0 = DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$0$1$0(Function1.this);
                            return DisplayModeToggleButton_iUJLfQg$lambda$0$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonWithTooltip((Function0) rememberedValue2, dateRange$material3, m4895getString2EP1pXo2, modifier, false, composer, 0, 16);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayModeToggleButton_iUJLfQg$lambda$0$0$0(Function1 function1) {
        function1.invoke(DisplayMode.m3042boximpl(DisplayMode.INSTANCE.m3049getInputjFl4v0()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayModeToggleButton_iUJLfQg$lambda$0$1$0(Function1 function1) {
        function1.invoke(DisplayMode.m3042boximpl(DisplayMode.INSTANCE.m3050getPickerjFl4v0()));
        return Unit.INSTANCE;
    }

    /* renamed from: SwitchableDateEntryContent-KaiTk9E, reason: not valid java name */
    private static final void m2916SwitchableDateEntryContentKaiTk9E(final Long l, final long j, final int i, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2, final int i3) {
        int i4;
        IntRange intRange2;
        SelectableDates selectableDates2;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2053685029);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)N(selectedDateMillis,displayedMonthMillis,displayMode:c#material3.DisplayMode,onDateSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors,focusRequester)1464@67704L7,1467@67914L7,1469@68026L7,1471@68147L7,1473@68265L7,1477@68379L216,1483@68622L1708,1515@70388L1136,1474@68277L3247:DatePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            intRange2 = intRange;
            i4 |= startRestartGroup.changedInstance(intRange2) ? 1048576 : 524288;
        } else {
            intRange2 = intRange;
        }
        if ((12582912 & i2) == 0) {
            i4 |= (16777216 & i2) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            selectableDates2 = selectableDates;
            i4 |= startRestartGroup.changed(selectableDates2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(focusRequester) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053685029, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1461)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final int i6 = -((Density) consume).mo522roundToPx0680j_4(Dp.m9732constructorimpl(48));
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            int i7 = i4;
            final FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            final FiniteAnimationSpec value4 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            DisplayMode m3042boximpl = DisplayMode.m3042boximpl(i);
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093685331, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SwitchableDateEntryContent_KaiTk9E$lambda$1$0;
                        SwitchableDateEntryContent_KaiTk9E$lambda$1$0 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$1$0((SemanticsPropertyReceiver) obj);
                        return SwitchableDateEntryContent_KaiTk9E$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093694599, "CC(remember):DatePicker.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value) | startRestartGroup.changedInstance(value2) | startRestartGroup.changed(i6) | startRestartGroup.changedInstance(value4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ContentTransform SwitchableDateEntryContent_KaiTk9E$lambda$2$0;
                        SwitchableDateEntryContent_KaiTk9E$lambda$2$0 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0(FiniteAnimationSpec.this, value, value2, i6, value4, (AnimatedContentTransitionScope) obj);
                        return SwitchableDateEntryContent_KaiTk9E$lambda$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final IntRange intRange3 = intRange2;
            final SelectableDates selectableDates3 = selectableDates2;
            composer2 = startRestartGroup;
            AnimatedContentKt.AnimatedContent(m3042boximpl, semantics$default, (Function1) rememberedValue2, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(1838500091, true, new Function4() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Unit SwitchableDateEntryContent_KaiTk9E$lambda$3;
                    SwitchableDateEntryContent_KaiTk9E$lambda$3 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$3(l, j, function1, function12, calendarModel, intRange3, datePickerFormatter, selectableDates3, datePickerColors, focusRequester, (AnimatedContentScope) obj, (DisplayMode) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return SwitchableDateEntryContent_KaiTk9E$lambda$3;
                }
            }, startRestartGroup, 54), composer2, ((i7 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SwitchableDateEntryContent_KaiTk9E$lambda$4;
                    SwitchableDateEntryContent_KaiTk9E$lambda$4 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$4(l, j, i, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return SwitchableDateEntryContent_KaiTk9E$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_KaiTk9E$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform SwitchableDateEntryContent_KaiTk9E$lambda$2$0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, final int i, final FiniteAnimationSpec finiteAnimationSpec4, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ContentTransform contentTransform;
        if (DisplayMode.m3045equalsimpl0(((DisplayMode) animatedContentTransitionScope.getTargetState()).getValue(), DisplayMode.INSTANCE.m3049getInputjFl4v0())) {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0;
                    SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0(((Integer) obj).intValue());
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$2$0$0);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1;
                    SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1(i, ((Integer) obj).intValue());
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$2$0$1);
                }
            })));
        } else {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2;
                    SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2(i, ((Integer) obj).intValue());
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$2$0$2);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3;
                    SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3(((Integer) obj).intValue());
                    return Integer.valueOf(SwitchableDateEntryContent_KaiTk9E$lambda$2$0$3);
                }
            }).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec3, 0.0f, 2, null)));
        }
        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FiniteAnimationSpec SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4;
                SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4(FiniteAnimationSpec.this, (IntSize) obj, (IntSize) obj2);
                return SwitchableDateEntryContent_KaiTk9E$lambda$2$0$4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_KaiTk9E$lambda$3(Long l, long j, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, AnimatedContentScope animatedContentScope, DisplayMode displayMode, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(mode:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838500091, i, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1516)");
        }
        int value = displayMode.getValue();
        if (DisplayMode.m3045equalsimpl0(value, DisplayMode.INSTANCE.m3050getPickerjFl4v0())) {
            composer.startReplaceGroup(1567031954);
            ComposerKt.sourceInformation(composer, "1518@70470L535");
            DatePickerContent(l, j, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
            composer.endReplaceGroup();
        } else if (DisplayMode.m3045equalsimpl0(value, DisplayMode.INSTANCE.m3049getInputjFl4v0())) {
            composer.startReplaceGroup(1567050592);
            ComposerKt.sourceInformation(composer, "1530@71055L453");
            DateInputKt.DateInputContent(l, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1334373351);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    private static final void DatePickerContent(final Long l, final long j, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-434467002);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerContent)N(selectedDateMillis,displayedMonthMillis,onDateSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors)1558@72089L64,1561@72243L466,1561@72216L493,1573@72736L24,1574@72807L25,1574@72790L42,1575@72874L7,1581@73045L40,1582@73090L8737:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i2, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1555)");
            }
            final CalendarMonth month = calendarModel.getMonth(j);
            int coerceAtLeast = RangesKt.coerceAtLeast(month.indexIn(intRange), 0);
            final LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(coerceAtLeast, 0, startRestartGroup, 0, 2);
            Integer valueOf = Integer.valueOf(coerceAtLeast);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -910938504, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(rememberLazyListState) | startRestartGroup.changed(coerceAtLeast);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new DatePickerKt$DatePickerContent$1$1(rememberLazyListState, coerceAtLeast, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Object[] objArr = new Object[0];
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -910920897, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState DatePickerContent$lambda$1$0;
                        DatePickerContent$lambda$1$0 = DatePickerKt.DatePickerContent$lambda$1$0();
                        return DatePickerContent$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue3, startRestartGroup, 48);
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -910913266, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = FocusRequester.INSTANCE.createRefs();
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            FocusRequester.Companion.FocusRequesterFactory focusRequesterFactory = (FocusRequester.Companion.FocusRequesterFactory) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusRequester component1 = focusRequesterFactory.component1();
            final FocusRequester component2 = focusRequesterFactory.component2();
            final FocusRequester component3 = focusRequesterFactory.component3();
            final FocusRequester component4 = focusRequesterFactory.component4();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = i2;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -520181143, "C1594@73709L511,1606@74254L520,1618@74816L42,1619@74903L448,1583@73107L2367,1632@75484L6337:DatePicker.kt#uh7d8r");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = DatePickerHorizontalPadding;
            Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(companion2, f, 0.0f, 2, null);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean DatePickerContent$lambda$2 = DatePickerContent$lambda$2(mutableState);
            String formatMonthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j), calendarModel.getLocale());
            if (formatMonthYear == null) {
                formatMonthYear = "-";
            }
            Modifier focusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, component1);
            String str = formatMonthYear;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1125147633, "CC(remember):DatePicker.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DatePickerContent$lambda$5$0$0;
                        DatePickerContent$lambda$5$0$0 = DatePickerKt.DatePickerContent$lambda$5$0$0(CoroutineScope.this, rememberLazyListState);
                        return DatePickerContent$lambda$5$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Function0 function0 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1125130184, "CC(remember):DatePicker.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DatePickerContent$lambda$5$1$0;
                        DatePickerContent$lambda$5$1$0 = DatePickerKt.DatePickerContent$lambda$5$1$0(CoroutineScope.this, rememberLazyListState);
                        return DatePickerContent$lambda$5$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            Function0 function02 = (Function0) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1125112678, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DatePickerContent$lambda$5$2$0;
                        DatePickerContent$lambda$5$2$0 = DatePickerKt.DatePickerContent$lambda$5$2$0(MutableState.this);
                        return DatePickerContent$lambda$5$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            Function0 function03 = (Function0) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1125109488, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(component3) | startRestartGroup.changedInstance(focusManager);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda69
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DatePickerContent$lambda$5$3$0;
                        DatePickerContent$lambda$5$3$0 = DatePickerKt.DatePickerContent$lambda$5$3$0(FocusRequester.this, focusManager);
                        return DatePickerContent$lambda$5$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MonthsNavigation(m1203paddingVpY3zN4$default, canScrollForward, canScrollBackward, DatePickerContent$lambda$2, str, focusRequester, function0, function02, function03, (Function0) rememberedValue8, component2, datePickerColors, startRestartGroup, 6, (i3 >> 21) & 112);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1335167820, "C1633@75502L814,1651@76516L7,1653@76641L7,1655@76776L7,1665@77326L4485,1656@76823L4988:DatePicker.kt#uh7d8r");
            Modifier m1203paddingVpY3zN4$default2 = PaddingKt.m1203paddingVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1203paddingVpY3zN4$default2);
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
            Updater.m5872setimpl(m5864constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1070158191, "C1634@75598L31,1645@76191L43,1635@75646L656:DatePicker.kt#uh7d8r");
            WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 173086879, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed4 = startRestartGroup.changed(component1);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DatePickerContent$lambda$5$4$0$0$0;
                        DatePickerContent$lambda$5$4$0$0$0 = DatePickerKt.DatePickerContent$lambda$5$4$0$0$0(FocusRequester.this);
                        return DatePickerContent$lambda$5$4$0$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            HorizontalMonthsList(rememberLazyListState, l, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, (Function0) rememberedValue9, focusManager, startRestartGroup, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (i3 & 234881024), 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$2(mutableState), ClipKt.clipToBounds(Modifier.INSTANCE), EnterExitTransitionKt.expandVertically$default(value3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn(value, 0.6f)), EnterExitTransitionKt.shrinkVertically$default(value3, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new Function3() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit DatePickerContent$lambda$5$4$1;
                    DatePickerContent$lambda$5$4$1 = DatePickerKt.DatePickerContent$lambda$5$4$1(j, mutableState, coroutineScope, rememberLazyListState, intRange, month, selectableDates, calendarModel, datePickerColors, component3, component2, component4, focusManager, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return DatePickerContent$lambda$5$4$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 196656, 16);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePickerContent$lambda$6;
                    DatePickerContent$lambda$6 = DatePickerKt.DatePickerContent$lambda$6(l, j, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePickerContent$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DatePickerContent$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean DatePickerContent$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DatePickerContent$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$0$0(CoroutineScope coroutineScope, LazyListState lazyListState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DatePickerKt$DatePickerContent$3$1$1$1(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$1$0(CoroutineScope coroutineScope, LazyListState lazyListState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DatePickerKt$DatePickerContent$3$2$1$1(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$2$0(MutableState mutableState) {
        DatePickerContent$lambda$3(mutableState, !DatePickerContent$lambda$2(mutableState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$3$0(FocusRequester focusRequester, FocusManager focusManager) {
        if (!FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null)) {
            focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6398getDowndhqQ8s());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$4$0$0$0(FocusRequester focusRequester) {
        FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$4$1(long j, final MutableState mutableState, final CoroutineScope coroutineScope, final LazyListState lazyListState, final IntRange intRange, final CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors, FocusRequester focusRequester, final FocusRequester focusRequester2, final FocusRequester focusRequester3, final FocusManager focusManager, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1670@77650L48,1671@77752L30,1671@77715L4082:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193716082, i, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1670)");
        }
        Strings.Companion companion = Strings.INSTANCE;
        final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_year_picker_pane_title), composer, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 404900432, "CC(remember):DatePicker.kt#9igjgp");
        boolean changed = composer.changed(m4895getString2EP1pXo);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit DatePickerContent$lambda$5$4$1$0$0;
                    DatePickerContent$lambda$5$4$1$0$0 = DatePickerKt.DatePickerContent$lambda$5$4$1$0$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                    return DatePickerContent$lambda$5$4$1$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        ComposerKt.sourceInformationMarkerStart(composer, 872727202, "C1683@78526L767,1700@79624L205,1704@79874L255,1672@77806L2346,1718@80781L928,1714@80555L1224:DatePicker.kt#uh7d8r");
        Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(SizeKt.m1260requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(Dp.m9732constructorimpl(RecommendedSizeForAccessibility * 7) - DividerDefaults.INSTANCE.m3051getThicknessD9Ej5fM())), DatePickerHorizontalPadding, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, -1357300997, "CC(remember):DatePicker.kt#9igjgp");
        boolean changed2 = composer.changed(mutableState) | composer.changedInstance(coroutineScope) | composer.changed(lazyListState) | composer.changedInstance(intRange) | composer.changed(calendarMonth);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit DatePickerContent$lambda$5$4$1$1$0$0;
                    DatePickerContent$lambda$5$4$1$1$0$0 = DatePickerKt.DatePickerContent$lambda$5$4$1$1$0$0(CoroutineScope.this, mutableState, lazyListState, intRange, calendarMonth, ((Integer) obj2).intValue());
                    return DatePickerContent$lambda$5$4$1$1$0$0;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        Function1 function1 = (Function1) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1357266423, "CC(remember):DatePicker.kt#9igjgp");
        boolean changed3 = composer.changed(focusRequester2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DatePickerContent$lambda$5$4$1$1$1$0;
                    DatePickerContent$lambda$5$4$1$1$1$0 = DatePickerKt.DatePickerContent$lambda$5$4$1$1$1$0(FocusRequester.this);
                    return DatePickerContent$lambda$5$4$1$1$1$0;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function0 = (Function0) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1357258373, "CC(remember):DatePicker.kt#9igjgp");
        boolean changed4 = composer.changed(focusRequester3) | composer.changedInstance(focusManager);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DatePickerContent$lambda$5$4$1$1$2$0;
                    DatePickerContent$lambda$5$4$1$1$2$0 = DatePickerKt.DatePickerContent$lambda$5$4$1$1$2$0(FocusRequester.this, focusManager);
                    return DatePickerContent$lambda$5$4$1$1$2$0;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        YearPicker(m1203paddingVpY3zN4$default, j, function1, selectableDates, calendarModel, intRange, datePickerColors, focusRequester, function0, (Function0) rememberedValue4, composer, 6);
        long dividerColor = datePickerColors.getDividerColor();
        Modifier focusRequester4 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester3);
        ComposerKt.sourceInformationMarkerStart(composer, -1357228676, "CC(remember):DatePicker.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(focusManager);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$3$5$2$2$4$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m2930invokeZmokQxo(keyEvent.m7966unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2930invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7736getDirectionUpEK5gGoQ()) || (KeyEvent_androidKt.m7983isShiftPressedZmokQxo(keyEvent) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7905getTabEK5gGoQ()))) {
                        FocusManager.this.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6403getPreviousdhqQ8s());
                        return true;
                    }
                    if (Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7731getDirectionDownEK5gGoQ()) || Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7905getTabEK5gGoQ())) {
                        FocusManager.this.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6402getNextdhqQ8s());
                        return true;
                    }
                    return false;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DividerKt.m3057HorizontalDivider9IZ8Weo(FocusModifierKt.focusTarget(KeyInputModifierKt.onKeyEvent(focusRequester4, (Function1) rememberedValue5)), 0.0f, dividerColor, composer, 0, 2);
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
    public static final Unit DatePickerContent$lambda$5$4$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$4$1$1$0$0(CoroutineScope coroutineScope, MutableState mutableState, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth, int i) {
        DatePickerContent$lambda$3(mutableState, !DatePickerContent$lambda$2(mutableState));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DatePickerKt$DatePickerContent$3$5$2$2$1$1$1(lazyListState, i, intRange, calendarMonth, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$4$1$1$1$0(FocusRequester focusRequester) {
        FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerContent$lambda$5$4$1$1$2$0(FocusRequester focusRequester, FocusManager focusManager) {
        FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6402getNextdhqQ8s());
        return Unit.INSTANCE;
    }

    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m2912DatePickerHeaderpc5RIQQ(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final long j, final long j2, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(2020490761);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerHeader)N(modifier,title,titleContentColor:c#ui.graphics.Color,headlineContentColor:c#ui.graphics.Color,minHeight:c#ui.unit.Dp,content)1757@82287L540:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020490761, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1749)");
            }
            if (function2 != null) {
                companion = SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null);
            } else {
                companion = Modifier.INSTANCE;
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(companion);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = i2;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 396879060, "C1767@82729L92:DatePicker.kt#uh7d8r");
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(396894187);
                ComposerKt.sourceInformation(startRestartGroup, "1762@82517L5,1763@82621L89,1763@82535L175");
                ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1344395458, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DatePickerHeader_pc5RIQQ$lambda$0$0;
                        DatePickerHeader_pc5RIQQ$lambda$0$0 = DatePickerKt.DatePickerHeader_pc5RIQQ$lambda$0$0(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return DatePickerHeader_pc5RIQQ$lambda$0$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 384);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(397163267);
                startRestartGroup.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j2)), function22, startRestartGroup, ProvidedValue.$stable | ((i3 >> 12) & 112));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePickerHeader_pc5RIQQ$lambda$1;
                    DatePickerHeader_pc5RIQQ$lambda$1 = DatePickerKt.DatePickerHeader_pc5RIQQ$lambda$1(Modifier.this, function2, j, j2, f, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePickerHeader_pc5RIQQ$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerHeader_pc5RIQQ$lambda$0$0(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1764@82639L57:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1344395458, i, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1764)");
            }
            Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
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
            ComposerKt.sourceInformationMarkerStart(composer, 562743380, "C1764@82687L7:DatePicker.kt#uh7d8r");
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

    private static final void HorizontalMonthsList(final LazyListState lazyListState, final Long l, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final Function0<Unit> function0, final FocusManager focusManager, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Long, Unit> function13;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        int i4;
        final LazyListState lazyListState2;
        DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1;
        Composer startRestartGroup = composer.startRestartGroup(-1038629066);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMonthsList)N(lazyListState,selectedDateMillis,onDateSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors,onReturnFocus,focusManager)1788@83411L159,1794@83632L5,1794@83639L1585,1794@83575L1649,1829@85260L229,1829@85230L259:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
        } else {
            function13 = function1;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= (2097152 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            selectableDates2 = selectableDates;
            i3 |= startRestartGroup.changed(selectableDates2) ? 8388608 : 4194304;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= startRestartGroup.changed(datePickerColors2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(focusManager) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            lazyListState2 = lazyListState;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038629066, i3, i4, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1785)");
            }
            final CalendarDate today = calendarModel.getToday();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1690103403, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(intRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final DatePickerColors datePickerColors3 = datePickerColors2;
            int i5 = i3;
            final Function1<? super Long, Unit> function14 = function13;
            final SelectableDates selectableDates3 = selectableDates2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(-1911156825, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalMonthsList$lambda$1;
                    HorizontalMonthsList$lambda$1 = DatePickerKt.HorizontalMonthsList$lambda$1(LazyListState.this, intRange, calendarModel, calendarMonth, function14, today, l, datePickerFormatter, selectableDates3, datePickerColors3, focusManager, function0, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalMonthsList$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1690044165, "CC(remember):DatePicker.kt#9igjgp");
            int i6 = i5 & 14;
            boolean changedInstance = (i6 == 4) | ((i5 & 7168) == 2048) | startRestartGroup.changedInstance(calendarModel) | startRestartGroup.changedInstance(intRange);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, function12, calendarModel, intRange, null);
                startRestartGroup.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = rememberedValue2;
                lazyListState2 = lazyListState;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(lazyListState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) datePickerKt$HorizontalMonthsList$2$1, startRestartGroup, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalMonthsList$lambda$3;
                    HorizontalMonthsList$lambda$3 = DatePickerKt.HorizontalMonthsList$lambda$3(LazyListState.this, l, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, function0, focusManager, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalMonthsList$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMonthsList$lambda$1(final LazyListState lazyListState, final IntRange intRange, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final Function1 function1, final CalendarDate calendarDate, final Long l, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusManager focusManager, final Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1800@83958L118,1804@84160L40,1805@84212L1006,1795@83649L1569:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911156825, i, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1795)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1624304189, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalMonthsList$lambda$1$0$0;
                        HorizontalMonthsList$lambda$1$0$0 = DatePickerKt.HorizontalMonthsList$lambda$1$0$0((SemanticsPropertyReceiver) obj);
                        return HorizontalMonthsList$lambda$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
            FlingBehavior rememberSnapFlingBehavior$material3 = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3(lazyListState, null, composer, 384, 2);
            ComposerKt.sourceInformationMarkerStart(composer, 1624313205, "CC(remember):DatePicker.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(intRange) | composer.changedInstance(calendarModel) | composer.changed(calendarMonth) | composer.changed(function1) | composer.changed(calendarDate) | composer.changed(l) | composer.changedInstance(datePickerFormatter) | composer.changed(selectableDates) | composer.changed(datePickerColors) | composer.changed(lazyListState) | composer.changedInstance(focusManager) | composer.changed(function0);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function12 = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalMonthsList$lambda$1$1$0;
                        HorizontalMonthsList$lambda$1$1$0 = DatePickerKt.HorizontalMonthsList$lambda$1$1$0(IntRange.this, calendarModel, calendarMonth, function1, calendarDate, l, datePickerFormatter, selectableDates, datePickerColors, lazyListState, focusManager, function0, (LazyListScope) obj);
                        return HorizontalMonthsList$lambda$1$1$0;
                    }
                };
                composer.updateRememberedValue(function12);
                rememberedValue2 = function12;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3, false, null, (Function1) rememberedValue2, composer, 0, 444);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMonthsList$lambda$1$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float HorizontalMonthsList$lambda$1$0$0$0;
                HorizontalMonthsList$lambda$1$0$0$0 = DatePickerKt.HorizontalMonthsList$lambda$1$0$0$0();
                return Float.valueOf(HorizontalMonthsList$lambda$1$0$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float HorizontalMonthsList$lambda$1$0$0$1;
                HorizontalMonthsList$lambda$1$0$0$1 = DatePickerKt.HorizontalMonthsList$lambda$1$0$0$1();
                return Float.valueOf(HorizontalMonthsList$lambda$1$0$0$1);
            }
        }, false, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMonthsList$lambda$1$1$0(IntRange intRange, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final Function1 function1, final CalendarDate calendarDate, final Long l, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final LazyListState lazyListState, final FocusManager focusManager, final Function0 function0, LazyListScope lazyListScope) {
        LazyListScope.CC.items$default(lazyListScope, numberOfMonthsInRange(intRange), null, null, ComposableLambdaKt.composableLambdaInstance(-600599685, true, new Function4() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit HorizontalMonthsList$lambda$1$1$0$0;
                HorizontalMonthsList$lambda$1$1$0$0 = DatePickerKt.HorizontalMonthsList$lambda$1$1$0$0(CalendarModel.this, calendarMonth, function1, calendarDate, l, datePickerFormatter, selectableDates, datePickerColors, lazyListState, focusManager, function0, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                return HorizontalMonthsList$lambda$1$1$0$0;
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalMonthsList$lambda$1$1$0$0(CalendarModel calendarModel, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyListState lazyListState, FocusManager focusManager, Function0 function0, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "CN(it)1808@84379L815:DatePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600599685, i3, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1807)");
            }
            CalendarMonth plusMonths = calendarModel.plusMonths(calendarMonth, i);
            Modifier fillParentMaxWidth$default = LazyItemScope.CC.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillParentMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 708728373, "C1809@84447L729:DatePicker.kt#uh7d8r");
            Month(plusMonths, function1, calendarDate.getUtcTimeMillis(), l, null, null, datePickerFormatter, selectableDates, datePickerColors, calendarModel.getLocale(), lazyListState, focusManager, function0, composer, 221184, 0);
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

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, Continuation<? super Unit> continuation) {
        Object collect = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int firstVisibleItemIndex;
                firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex();
                return Integer.valueOf(firstVisibleItemIndex);
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(int i, Continuation<? super Unit> continuation2) {
                int firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex() / 12;
                function1.invoke(Boxing.boxLong(calendarModel.getMonth(intRange.getFirst() + firstVisibleItemIndex, (LazyListState.this.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static final void WeekDays(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        ComposerKt.sourceInformation(startRestartGroup, "C(WeekDays)N(colors,calendarModel)1870@86713L5,1872@86724L1567:DatePicker.kt#uh7d8r");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(datePickerColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 32 : 16;
        }
        ?? r8 = 0;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i2, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1859)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i3 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(weekdayNames.get(i4));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            TextStyle value = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), startRestartGroup, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
            String str = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            String str2 = "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 761451639, "C:DatePicker.kt#uh7d8r");
            startRestartGroup.startReplaceGroup(24563235);
            ComposerKt.sourceInformation(startRestartGroup, "*1881@87091L33,1891@87792L7,1892@87875L7,1879@87009L1266");
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                final Pair pair = (Pair) arrayList2.get(i6);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1806140369, "CC(remember):DatePicker.kt#9igjgp");
                boolean changed = startRestartGroup.changed(pair);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit WeekDays$lambda$0$0$0$0;
                            WeekDays$lambda$0$0$0$0 = DatePickerKt.WeekDays$lambda$0$0$0$0(Pair.this, (SemanticsPropertyReceiver) obj);
                            return WeekDays$lambda$0$0$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier m1275sizeInqDBjuR0$default = SizeKt.m1275sizeInqDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), DatePickerModalTokens.INSTANCE.m5132getDateContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m5131getDateContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null);
                ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localMinimumInteractiveComponentSize);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m9746unboximpl = ((Dp) consume).m9746unboximpl();
                ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localMinimumInteractiveComponentSize2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier m1273sizeVpY3zN4 = SizeKt.m1273sizeVpY3zN4(m1275sizeInqDBjuR0$default, m9746unboximpl, ((Dp) consume2).m9746unboximpl());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, r8);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, str);
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r8));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1273sizeVpY3zN4);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, str2);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1708069020, "C1896@87996L265:DatePicker.kt#uh7d8r");
                Composer composer3 = startRestartGroup;
                TextKt.m4292TextNvy7gAk((String) pair.getSecond(), SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), datePickerColors.getWeekdayContentColor(), null, 0L, null, null, null, 0L, null, TextAlign.m9593boximpl(TextAlign.INSTANCE.m9600getCentere0LSkKk()), 0L, 0, false, 0, 0, null, value, composer3, 48, 0, 130040);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                i6++;
                startRestartGroup = composer3;
                str = str;
                r8 = 0;
                size2 = size2;
                str2 = str2;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WeekDays$lambda$1;
                    WeekDays$lambda$1 = DatePickerKt.WeekDays$lambda$1(DatePickerColors.this, calendarModel, i, (Composer) obj, ((Integer) obj2).intValue());
                    return WeekDays$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeekDays$lambda$0$0$0$0(Pair pair, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) pair.getFirst());
        return Unit.INSTANCE;
    }

    public static final void Month(final CalendarMonth calendarMonth, final Function1<? super Long, Unit> function1, final long j, final Long l, final Long l2, final SelectedRangeInfo selectedRangeInfo, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final Locale locale, final LazyListState lazyListState, final FocusManager focusManager, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        int i5;
        Modifier.Companion companion;
        int i6;
        String str;
        Composer composer3;
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        boolean z;
        String str3;
        Modifier modifier;
        boolean z2;
        boolean z3;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        SelectableDates selectableDates2 = selectableDates;
        Locale locale2 = locale;
        Composer startRestartGroup = composer.startRestartGroup(1724672983);
        ComposerKt.sourceInformation(startRestartGroup, "C(Month)N(month,onDateSelectionChange,todayMillis,startDateMillis,endDateMillis,rangeSelectionInfo,dateFormatter,selectableDates,colors,locale,lazyListState,focusManager,onReturnFocus)1934@89183L24,1935@89245L7,1940@89449L6075:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(calendarMonth) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(l2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(selectedRangeInfo) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= (i & 2097152) == 0 ? startRestartGroup.changed(datePickerFormatter2) : startRestartGroup.changedInstance(datePickerFormatter2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(selectableDates2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(datePickerColors) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(locale2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i11 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(lazyListState) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(focusManager) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i12 = i4;
        if (!startRestartGroup.shouldExecute(((i11 & 306783379) == 306783378 && (i12 & 147) == 146) ? false : true, i11 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1724672983, i11, i12, "androidx.compose.material3.Month (DatePicker.kt:1924)");
            }
            if (selectedRangeInfo != null) {
                startRestartGroup.startReplaceGroup(-960393781);
                ComposerKt.sourceInformation(startRestartGroup, "1927@88966L143");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                i5 = 458752;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -446621242, "CC(remember):DatePicker.kt#9igjgp");
                boolean z4 = ((i11 & 458752) == 131072) | ((234881024 & i11) == 67108864);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda37
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Month$lambda$0$0;
                            Month$lambda$0$0 = DatePickerKt.Month$lambda$0$0(SelectedRangeInfo.this, datePickerColors, (ContentDrawScope) obj);
                            return Month$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = DrawModifierKt.drawWithContent(companion2, (Function1) rememberedValue);
                startRestartGroup.endReplaceGroup();
            } else {
                i5 = 458752;
                startRestartGroup.startReplaceGroup(-960202325);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            int i13 = i11;
            String str4 = "CC(<get-current>):CompositionLocal.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z5 = consume == LayoutDirection.Rtl;
            int firstEnabledDay = getFirstEnabledDay(calendarMonth, selectableDates2);
            int lastEnabledDay = getLastEnabledDay(calendarMonth, selectableDates2);
            boolean z6 = z5;
            Modifier then = SizeKt.m1260requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(RecommendedSizeForAccessibility * 6)).then(companion);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            String str5 = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -27338663, "C:DatePicker.kt#uh7d8r");
            startRestartGroup.startReplaceGroup(-1663449878);
            ComposerKt.sourceInformation(startRestartGroup, "*1947@89742L5766");
            int i14 = 0;
            int i15 = 6;
            int i16 = 0;
            while (i16 < i15) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                int i17 = i14;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly2, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, str5);
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i18 = i16;
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
                Updater.m5872setimpl(m5864constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 490098410, "C:DatePicker.kt#uh7d8r");
                startRestartGroup.startReplaceGroup(-1092569031);
                ComposerKt.sourceInformation(startRestartGroup, "");
                i14 = i17;
                int i19 = 0;
                while (i19 < 7) {
                    if (i14 < calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() || i14 >= calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) {
                        i6 = i19;
                        str = str5;
                        composer3 = startRestartGroup;
                        i7 = i13;
                        i8 = firstEnabledDay;
                        i9 = lastEnabledDay;
                        composer3.startReplaceGroup(490256726);
                        ComposerKt.sourceInformation(composer3, "1970@91081L7,1971@91176L7,1963@90631L617");
                        Modifier m1275sizeInqDBjuR0$default = SizeKt.m1275sizeInqDBjuR0$default(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m5132getDateContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m5131getDateContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null);
                        ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                        str2 = str4;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str2);
                        Object consume2 = composer3.consume(localMinimumInteractiveComponentSize);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        float m9746unboximpl = ((Dp) consume2).m9746unboximpl();
                        ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, str2);
                        Object consume3 = composer3.consume(localMinimumInteractiveComponentSize2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        SpacerKt.Spacer(SizeKt.m1273sizeVpY3zN4(m1275sizeInqDBjuR0$default, m9746unboximpl, ((Dp) consume3).m9746unboximpl()), composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(491361535);
                        ComposerKt.sourceInformation(startRestartGroup, "1995@92522L366,2009@93248L457,2029@94540L39,2016@93730L1692");
                        int daysFromStartOfWeekToFirstOfMonth = i14 - calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                        int i20 = i19;
                        final long startUtcTimeMillis = calendarMonth.getStartUtcTimeMillis() + (daysFromStartOfWeekToFirstOfMonth * CalendarModelKt.MillisecondsIn24Hours);
                        boolean z7 = startUtcTimeMillis == j;
                        boolean z8 = l != null && startUtcTimeMillis == l.longValue();
                        boolean z9 = l2 != null && startUtcTimeMillis == l2.longValue();
                        if (selectedRangeInfo != null) {
                            startRestartGroup.startReplaceGroup(491792745);
                            ComposerKt.sourceInformation(startRestartGroup, "1983@91858L435");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1092513394, "CC(remember):DatePicker.kt#9igjgp");
                            i10 = daysFromStartOfWeekToFirstOfMonth;
                            boolean changed = ((i13 & i5) == 131072) | startRestartGroup.changed(startUtcTimeMillis);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (startUtcTimeMillis >= (l != null ? l.longValue() : Long.MAX_VALUE)) {
                                    if (startUtcTimeMillis <= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
                                        z3 = true;
                                        i6 = i20;
                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                }
                                z3 = false;
                                i6 = i20;
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                i6 = i20;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            boolean booleanValue = ((Boolean) ((MutableState) rememberedValue3).getValue()).booleanValue();
                            startRestartGroup.endReplaceGroup();
                            z = booleanValue;
                        } else {
                            i10 = daysFromStartOfWeekToFirstOfMonth;
                            i6 = i20;
                            startRestartGroup.startReplaceGroup(492321698);
                            startRestartGroup.endReplaceGroup();
                            z = false;
                        }
                        boolean z10 = z;
                        boolean z11 = z7;
                        String dayContentDescription = dayContentDescription(selectedRangeInfo != null, z11, z8, z9, z10, startRestartGroup, 0);
                        boolean z12 = z9;
                        boolean z13 = z8;
                        String formatDate = datePickerFormatter2.formatDate(Long.valueOf(startUtcTimeMillis), locale2, true);
                        if (formatDate == null) {
                            formatDate = "";
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1092468892, "CC(remember):DatePicker.kt#9igjgp");
                        boolean changed2 = startRestartGroup.changed(startUtcTimeMillis) | ((i13 & 29360128) == 8388608);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = Boolean.valueOf(selectableDates2.isSelectableYear(calendarMonth.getYear()) && selectableDates2.isSelectableDate(startUtcTimeMillis));
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        boolean booleanValue2 = ((Boolean) rememberedValue4).booleanValue();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i21 = i10 + 1;
                        str = str5;
                        String str6 = str4;
                        i7 = i13;
                        i8 = firstEnabledDay;
                        i9 = lastEnabledDay;
                        composer3 = startRestartGroup;
                        String localString$default = CalendarLocale_jvmAndAndroidKt.toLocalString$default(i21, 0, 0, false, locale2, 7, null);
                        boolean z14 = z6;
                        Modifier dayOnKeyEvent = dayOnKeyEvent(Modifier.INSTANCE, z14, i14 == i8, i14 == i9, lazyListState, coroutineScope, focusManager, function0);
                        z6 = z14;
                        if (z13 || z12) {
                            str3 = localString$default;
                            modifier = dayOnKeyEvent;
                            z2 = true;
                        } else {
                            str3 = localString$default;
                            modifier = dayOnKeyEvent;
                            z2 = false;
                        }
                        ComposerKt.sourceInformationMarkerStart(composer3, -1092427966, "CC(remember):DatePicker.kt#9igjgp");
                        boolean changed3 = ((i7 & 112) == 32) | composer3.changed(startUtcTimeMillis);
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda38
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit Month$lambda$1$0$2$0;
                                    Month$lambda$1$0$2$0 = DatePickerKt.Month$lambda$1$0$2$0(Function1.this, startUtcTimeMillis);
                                    return Month$lambda$1$0$2$0;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        Function0 function02 = (Function0) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (dayContentDescription != null) {
                            formatDate = dayContentDescription + ", " + formatDate;
                        }
                        Day(str3, modifier, z2, function02, z13, booleanValue2, z11, z10, formatDate, datePickerColors, composer3, (i7 << 3) & 1879048192);
                        composer3.endReplaceGroup();
                        str2 = str6;
                    }
                    i14++;
                    i19 = i6 + 1;
                    locale2 = locale;
                    str4 = str2;
                    firstEnabledDay = i8;
                    startRestartGroup = composer3;
                    lastEnabledDay = i9;
                    i13 = i7;
                    str5 = str;
                    datePickerFormatter2 = datePickerFormatter;
                    selectableDates2 = selectableDates;
                }
                Composer composer4 = startRestartGroup;
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                i16 = i18 + 1;
                locale2 = locale;
                i15 = 6;
                datePickerFormatter2 = datePickerFormatter;
                selectableDates2 = selectableDates;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Month$lambda$2;
                    Month$lambda$2 = DatePickerKt.Month$lambda$2(CalendarMonth.this, function1, j, l, l2, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, locale, lazyListState, focusManager, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Month$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Month$lambda$0$0(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors, ContentDrawScope contentDrawScope) {
        DateRangePickerKt.m3002drawRangeBackgroundmxwnekA(contentDrawScope, selectedRangeInfo, datePickerColors.getDayInSelectionRangeContainerColor());
        contentDrawScope.drawContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Month$lambda$1$0$2$0(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    public static final int numberOfMonthsInRange(IntRange intRange) {
        return ((intRange.getLast() - intRange.getFirst()) + 1) * 12;
    }

    private static final Modifier dayOnKeyEvent(Modifier modifier, final boolean z, boolean z2, boolean z3, final LazyListState lazyListState, final CoroutineScope coroutineScope, final FocusManager focusManager, final Function0<Unit> function0) {
        if (focusManager == null) {
            return modifier;
        }
        if (z2) {
            return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$dayOnKeyEvent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m2933invokeZmokQxo(keyEvent.m7966unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2933invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    boolean m2927isShiftTabZmokQxo;
                    boolean m2923isDirectionBackwardsYhN2O0w;
                    boolean m2924isDirectionForwardYhN2O0w;
                    m2927isShiftTabZmokQxo = DatePickerKt.m2927isShiftTabZmokQxo(keyEvent);
                    if (m2927isShiftTabZmokQxo) {
                        function0.invoke();
                        return true;
                    }
                    if (!lazyListState.isScrollInProgress()) {
                        m2923isDirectionBackwardsYhN2O0w = DatePickerKt.m2923isDirectionBackwardsYhN2O0w(keyEvent, z);
                        if (m2923isDirectionBackwardsYhN2O0w) {
                            DatePickerKt.m2922goToMonthBhxgA10(-1, lazyListState, focusManager, FocusDirection.INSTANCE.m6403getPreviousdhqQ8s(), coroutineScope);
                            return true;
                        }
                        m2924isDirectionForwardYhN2O0w = DatePickerKt.m2924isDirectionForwardYhN2O0w(keyEvent, z);
                        if (m2924isDirectionForwardYhN2O0w) {
                            focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6402getNextdhqQ8s());
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
            });
        }
        if (z3) {
            return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$dayOnKeyEvent$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m2934invokeZmokQxo(keyEvent.m7966unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2934invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    boolean m2928isTabZmokQxo;
                    boolean m2924isDirectionForwardYhN2O0w;
                    boolean m2923isDirectionBackwardsYhN2O0w;
                    m2928isTabZmokQxo = DatePickerKt.m2928isTabZmokQxo(keyEvent);
                    if (m2928isTabZmokQxo) {
                        if (FocusManager.this.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6398getDowndhqQ8s())) {
                            FocusManager.this.mo6408moveFocus3ESFkO8(z ? FocusDirection.INSTANCE.m6401getLeftdhqQ8s() : FocusDirection.INSTANCE.m6404getRightdhqQ8s());
                        } else if (!lazyListState.isScrollInProgress()) {
                            DatePickerKt.m2922goToMonthBhxgA10(1, lazyListState, FocusManager.this, FocusDirection.INSTANCE.m6402getNextdhqQ8s(), coroutineScope);
                        }
                        return true;
                    }
                    if (!lazyListState.isScrollInProgress()) {
                        m2924isDirectionForwardYhN2O0w = DatePickerKt.m2924isDirectionForwardYhN2O0w(keyEvent, z);
                        if (m2924isDirectionForwardYhN2O0w) {
                            DatePickerKt.m2922goToMonthBhxgA10(1, lazyListState, FocusManager.this, FocusDirection.INSTANCE.m6402getNextdhqQ8s(), coroutineScope);
                            return true;
                        }
                        m2923isDirectionBackwardsYhN2O0w = DatePickerKt.m2923isDirectionBackwardsYhN2O0w(keyEvent, z);
                        if (m2923isDirectionBackwardsYhN2O0w) {
                            FocusManager.this.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6403getPreviousdhqQ8s());
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
            });
        }
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$dayOnKeyEvent$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m2935invokeZmokQxo(keyEvent.m7966unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m2935invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean m2924isDirectionForwardYhN2O0w;
                boolean m2923isDirectionBackwardsYhN2O0w;
                m2924isDirectionForwardYhN2O0w = DatePickerKt.m2924isDirectionForwardYhN2O0w(keyEvent, z);
                if (!m2924isDirectionForwardYhN2O0w) {
                    m2923isDirectionBackwardsYhN2O0w = DatePickerKt.m2923isDirectionBackwardsYhN2O0w(keyEvent, z);
                    if (m2923isDirectionBackwardsYhN2O0w) {
                        focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6403getPreviousdhqQ8s());
                        return true;
                    }
                    return false;
                }
                focusManager.mo6408moveFocus3ESFkO8(FocusDirection.INSTANCE.m6402getNextdhqQ8s());
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: goToMonth-BhxgA10, reason: not valid java name */
    public static final void m2922goToMonthBhxgA10(int i, LazyListState lazyListState, FocusManager focusManager, int i2, CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DatePickerKt$goToMonth$1(lazyListState, i, focusManager, i2, null), 3, null);
    }

    private static final int getFirstEnabledDay(CalendarMonth calendarMonth, SelectableDates selectableDates) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
        if (selectableDates.isSelectableYear(calendarMonth.getYear())) {
            int i = 0;
            while (!selectableDates.isSelectableDate(calendarMonth.getStartUtcTimeMillis() + (i * CalendarModelKt.MillisecondsIn24Hours)) && daysFromStartOfWeekToFirstOfMonth <= daysFromStartOfWeekToFirstOfMonth2) {
                i++;
                daysFromStartOfWeekToFirstOfMonth++;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth;
    }

    private static final int getLastEnabledDay(CalendarMonth calendarMonth, SelectableDates selectableDates) {
        int daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
        int daysFromStartOfWeekToFirstOfMonth2 = (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
        if (selectableDates.isSelectableYear(calendarMonth.getYear())) {
            int i = 0;
            while (!selectableDates.isSelectableDate(calendarMonth.getEndUtcTimeMillis() - (i * CalendarModelKt.MillisecondsIn24Hours)) && daysFromStartOfWeekToFirstOfMonth2 >= daysFromStartOfWeekToFirstOfMonth) {
                i++;
                daysFromStartOfWeekToFirstOfMonth2--;
            }
        }
        return daysFromStartOfWeekToFirstOfMonth2;
    }

    private static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 502032503, "C(dayContentDescription)N(rangeSelectionEnabled,isToday,isStartDate,isEndDate,isInRange):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:2194)");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            composer.startReplaceGroup(974430743);
            ComposerKt.sourceInformation(composer, "");
            if (z3) {
                composer.startReplaceGroup(1416908759);
                ComposerKt.sourceInformation(composer, "2199@101227L56");
                Strings.Companion companion = Strings.INSTANCE;
                sb.append(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z4) {
                composer.startReplaceGroup(1416912757);
                ComposerKt.sourceInformation(composer, "2201@101352L54");
                Strings.Companion companion2 = Strings.INSTANCE;
                sb.append(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceGroup();
            } else if (z5) {
                composer.startReplaceGroup(1416916692);
                ComposerKt.sourceInformation(composer, "2203@101475L53");
                Strings.Companion companion3 = Strings.INSTANCE;
                sb.append(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(974813035);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(974818987);
            composer.endReplaceGroup();
        }
        if (z2) {
            composer.startReplaceGroup(974842237);
            ComposerKt.sourceInformation(composer, "2208@101676L54");
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.INSTANCE;
            sb.append(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_today_description), composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(975009451);
            composer.endReplaceGroup();
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sb2;
    }

    private static final void Day(final String str, final Modifier modifier, final boolean z, final Function0<Unit> function0, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        DatePickerColors datePickerColors2;
        Composer startRestartGroup = composer.startRestartGroup(-945355136);
        ComposerKt.sourceInformation(startRestartGroup, "C(Day)N(text,modifier,selected,onClick,animateChecked,enabled,today,inRange,description,colors)2234@102511L124,2239@102721L5,2242@102780L83,2253@103177L867,2226@102101L1943:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z6 = z2;
            i2 |= startRestartGroup.changed(z6) ? 16384 : 8192;
        } else {
            z6 = z2;
        }
        if ((196608 & i) == 0) {
            z7 = z3;
            i2 |= startRestartGroup.changed(z7) ? 131072 : 65536;
        } else {
            z7 = z3;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z8 = z5;
            i2 |= startRestartGroup.changed(z8) ? 8388608 : 4194304;
        } else {
            z8 = z5;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if (!startRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-945355136, i2, -1, "androidx.compose.material3.Day (DatePicker.kt:2225)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2046802460, "CC(remember):DatePicker.kt#9igjgp");
            boolean z9 = (234881024 & i2) == 67108864;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Day$lambda$0$0;
                        Day$lambda$0$0 = DatePickerKt.Day$lambda$0$0(str2, (SemanticsPropertyReceiver) obj);
                        return Day$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getDateContainerShape(), startRestartGroup, 6);
            int i3 = i2 >> 6;
            long m6796unboximpl = datePickerColors2.dayContainerColor$material3(z, z7, z6, startRestartGroup, (i3 & 14) | ((i2 >> 12) & 112) | (i3 & 896) | ((i2 >> 18) & 7168)).getValue().m6796unboximpl();
            final boolean z10 = z8;
            SurfaceKt.m4113Surfaced85dljk(z, function0, semantics, z3, value, m6796unboximpl, 0L, 0.0f, 0.0f, (!z4 || z) ? null : BorderStrokeKt.m388BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m5135getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor()), (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(1126347158, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Day$lambda$1;
                    Day$lambda$1 = DatePickerKt.Day$lambda$1(str, datePickerColors, z4, z, z10, z3, (Composer) obj, ((Integer) obj2).intValue());
                    return Day$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, i3 & 7294, 48, 1472);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Day$lambda$2;
                    Day$lambda$2 = DatePickerKt.Day$lambda$2(str, modifier, z, function0, z2, z3, z4, z5, str2, datePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Day$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Day$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, null));
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Day$lambda$1(String str, DatePickerColors datePickerColors, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2254@103187L851:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1126347158, i, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2254)");
            }
            Modifier m1265requiredSizeVpY3zN4 = SizeKt.m1265requiredSizeVpY3zN4(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m5132getDateContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m5131getDateContainerHeightD9Ej5fM());
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1265requiredSizeVpY3zN4);
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
            ComposerKt.sourceInformationMarkerStart(composer, 781235302, "C2265@103626L2,2268@103706L230,2262@103471L557:DatePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1775909774, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Day$lambda$1$0$0$0;
                        Day$lambda$1$0$0$0 = DatePickerKt.Day$lambda$1$0$0$0((SemanticsPropertyReceiver) obj);
                        return Day$lambda$1$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m4292TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), datePickerColors.dayContentColor$material3(z, z2, z3, z4, composer, 0).getValue().m6796unboximpl(), null, 0L, null, null, null, 0L, null, TextAlign.m9593boximpl(TextAlign.INSTANCE.m9600getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 261112);
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
    public static final Unit Day$lambda$1$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    private static final void YearPicker(final Modifier modifier, final long j, final Function1<? super Integer, Unit> function1, final SelectableDates selectableDates, final CalendarModel calendarModel, final IntRange intRange, final DatePickerColors datePickerColors, final FocusRequester focusRequester, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final long j2;
        Function1<? super Integer, Unit> function12;
        CalendarModel calendarModel2;
        IntRange intRange2;
        DatePickerColors datePickerColors2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Composer startRestartGroup = composer.startRestartGroup(-724154510);
        ComposerKt.sourceInformation(startRestartGroup, "C(YearPicker)N(modifier,displayedMonthMillis,onYearSelected,selectableDates,calendarModel,yearRange,colors,currentYearFocusRequester,onYearShiftTabPressed,onYearTabPressed)2294@104510L5,2294@104517L2926,2294@104436L3007,2355@107561L44,2355@107519L86:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
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
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            calendarModel2 = calendarModel;
            i2 |= startRestartGroup.changedInstance(calendarModel2) ? 16384 : 8192;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((196608 & i) == 0) {
            intRange2 = intRange;
            i2 |= startRestartGroup.changedInstance(intRange2) ? 131072 : 65536;
        } else {
            intRange2 = intRange;
        }
        if ((1572864 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= startRestartGroup.changed(datePickerColors2) ? 1048576 : 524288;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function03 = function0;
            i2 |= startRestartGroup.changedInstance(function03) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            function03 = function0;
        }
        if ((805306368 & i) == 0) {
            function04 = function02;
            i2 |= startRestartGroup.changedInstance(function04) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        } else {
            function04 = function02;
        }
        if (!startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-724154510, i2, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2293)");
            }
            final Function0<Unit> function05 = function03;
            final Function1<? super Integer, Unit> function13 = function12;
            final IntRange intRange3 = intRange2;
            int i3 = i2;
            final CalendarModel calendarModel3 = calendarModel2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final Function0<Unit> function06 = function04;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1910384865, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit YearPicker$lambda$0;
                    YearPicker$lambda$0 = DatePickerKt.YearPicker$lambda$0(CalendarModel.this, j2, intRange3, modifier, datePickerColors3, function05, function06, focusRequester, function13, selectableDates, (Composer) obj, ((Integer) obj2).intValue());
                    return YearPicker$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -127670338, "CC(remember):DatePicker.kt#9igjgp");
            boolean z = (29360128 & i3) == 8388608;
            DatePickerKt$YearPicker$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new DatePickerKt$YearPicker$2$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(focusRequester, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i3 >> 21) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit YearPicker$lambda$2;
                    YearPicker$lambda$2 = DatePickerKt.YearPicker$lambda$2(Modifier.this, j, function1, selectableDates, calendarModel, intRange, datePickerColors, focusRequester, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return YearPicker$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPicker$lambda$0(final CalendarModel calendarModel, long j, final IntRange intRange, Modifier modifier, final DatePickerColors datePickerColors, final Function0 function0, final Function0 function02, final FocusRequester focusRequester, final Function1 function1, final SelectableDates selectableDates, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2298@104712L281,2311@105441L1996,2303@105002L2435:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910384865, i, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2295)");
            }
            final int year = calendarModel.getMonth(calendarModel.getToday()).getYear();
            final int year2 = calendarModel.getMonth(j).getYear();
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - intRange.getFirst()) - 3), 0, composer, 0, 2);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(modifier, datePickerColors.getContainerColor(), null, 2, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            GridCells.Fixed fixed2 = fixed;
            Arrangement.HorizontalOrVertical m868spacedBy0680j_4 = Arrangement.INSTANCE.m868spacedBy0680j_4(YearsVerticalPadding);
            Arrangement.HorizontalOrVertical horizontalOrVertical = spaceEvenly;
            ComposerKt.sourceInformationMarkerStart(composer, 1928851437, "CC(remember):DatePicker.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(intRange) | composer.changedInstance(calendarModel) | composer.changed(function0) | composer.changed(function02) | composer.changed(year2) | composer.changed(focusRequester) | composer.changed(year) | composer.changed(function1) | composer.changed(selectableDates) | composer.changed(datePickerColors);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit YearPicker$lambda$0$0$0;
                        YearPicker$lambda$0$0$0 = DatePickerKt.YearPicker$lambda$0$0$0(IntRange.this, calendarModel, function0, function02, year2, focusRequester, year, function1, selectableDates, datePickerColors, (LazyGridScope) obj);
                        return YearPicker$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyGridDslKt.LazyVerticalGrid(fixed2, m353backgroundbw27NRU$default, rememberLazyGridState, null, false, m868spacedBy0680j_4, horizontalOrVertical, null, false, null, (Function1) rememberedValue, composer, 1769472, 0, 920);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPicker$lambda$0$0$0(final IntRange intRange, final CalendarModel calendarModel, final Function0 function0, final Function0 function02, final int i, final FocusRequester focusRequester, final int i2, final Function1 function1, final SelectableDates selectableDates, final DatePickerColors datePickerColors, LazyGridScope lazyGridScope) {
        LazyGridScope.CC.items$default(lazyGridScope, CollectionsKt.count(intRange), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1895584772, true, new Function4() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit YearPicker$lambda$0$0$0$0;
                YearPicker$lambda$0$0$0$0 = DatePickerKt.YearPicker$lambda$0$0$0$0(IntRange.this, calendarModel, function0, function02, i, focusRequester, i2, function1, selectableDates, datePickerColors, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                return YearPicker$lambda$0$0$0$0;
            }
        }), 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPicker$lambda$0$0$0$0(IntRange intRange, CalendarModel calendarModel, final Function0 function0, final Function0 function02, int i, FocusRequester focusRequester, int i2, final Function1 function1, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyGridItemScope lazyGridItemScope, int i3, Composer composer, int i4) {
        int i5;
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "CN(it)2322@106028L471,2342@106997L32,2346@107233L54,2315@105648L1765:DatePicker.kt#uh7d8r");
        if ((i4 & 48) == 0) {
            i5 = i4 | (composer.changed(i3) ? 32 : 16);
        } else {
            i5 = i4;
        }
        if (!composer.shouldExecute((i5 & 145) != 144, i5 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895584772, i5, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2313)");
            }
            final int first = i3 + intRange.getFirst();
            String localString$default = CalendarLocale_jvmAndAndroidKt.toLocalString$default(first, 0, 0, false, calendarModel.getLocale(), 7, null);
            Modifier m1265requiredSizeVpY3zN4 = SizeKt.m1265requiredSizeVpY3zN4(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m5142getSelectionYearContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m5141getSelectionYearContainerHeightD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(composer, -590814381, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = composer.changed(function0) | composer.changed(function02);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m2932invokeZmokQxo(keyEvent.m7966unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m2932invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        boolean m2927isShiftTabZmokQxo;
                        boolean m2928isTabZmokQxo;
                        m2927isShiftTabZmokQxo = DatePickerKt.m2927isShiftTabZmokQxo(keyEvent);
                        if (!m2927isShiftTabZmokQxo) {
                            m2928isTabZmokQxo = DatePickerKt.m2928isTabZmokQxo(keyEvent);
                            if (m2928isTabZmokQxo) {
                                function02.invoke();
                                return true;
                            }
                            return false;
                        }
                        function0.invoke();
                        return true;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(m1265requiredSizeVpY3zN4, (Function1) rememberedValue);
            if (first == i) {
                companion = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            } else {
                companion = Modifier.INSTANCE;
            }
            Modifier then = onKeyEvent.then(companion);
            boolean z = first == i;
            boolean z2 = first == i2;
            ComposerKt.sourceInformationMarkerStart(composer, -590783812, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed2 = composer.changed(function1) | composer.changed(first);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit YearPicker$lambda$0$0$0$0$1$0;
                        YearPicker$lambda$0$0$0$0$1$0 = DatePickerKt.YearPicker$lambda$0$0$0$0$1$0(Function1.this, first);
                        return YearPicker$lambda$0$0$0$0$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean isSelectableYear = selectableDates.isSelectableYear(first);
            Strings.Companion companion2 = Strings.INSTANCE;
            String format = String.format(Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_navigate_to_year_description), composer, 0), Arrays.copyOf(new Object[]{localString$default}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            Year(localString$default, then, z, z2, (Function0) rememberedValue2, isSelectableYear, format, datePickerColors, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPicker$lambda$0$0$0$0$1$0(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    private static final void Year(final String str, final Modifier modifier, final boolean z, final boolean z2, final Function0<Unit> function0, final boolean z3, final String str2, final DatePickerColors datePickerColors, Composer composer, final int i) {
        String str3;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1153850597);
        ComposerKt.sourceInformation(startRestartGroup, "C(Year)N(text,modifier,selected,currentYear,onClick,enabled,description,colors)2375@107986L394,2393@108755L112,2398@108963L5,2399@108993L58,2401@109090L638,2386@108385L1343:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (startRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153850597, i2, -1, "androidx.compose.material3.Year (DatePicker.kt:2373)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -748853531, "CC(remember):DatePicker.kt#9igjgp");
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (!z2 || z) ? null : BorderStrokeKt.m388BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m5135getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BorderStroke borderStroke = (BorderStroke) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -748829205, "CC(remember):DatePicker.kt#9igjgp");
            boolean z5 = (3670016 & i2) == 1048576;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Year$lambda$1$0;
                        Year$lambda$1$0 = DatePickerKt.Year$lambda$1$0(str2, (SemanticsPropertyReceiver) obj);
                        return Year$lambda$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 >> 6;
            int i4 = i3 & 14;
            final String str4 = str3;
            composer2 = startRestartGroup;
            SurfaceKt.m4113Surfaced85dljk(z, function0, SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2), z3, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6), datePickerColors.yearContainerColor$material3(z, z3, startRestartGroup, i4 | ((i2 >> 12) & 112) | ((i2 >> 15) & 896)).getValue().m6796unboximpl(), 0L, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-564400443, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Year$lambda$2;
                    Year$lambda$2 = DatePickerKt.Year$lambda$2(str4, datePickerColors, z2, z, z3, (Composer) obj, ((Integer) obj2).intValue());
                    return Year$lambda$2;
                }
            }, startRestartGroup, 54), composer2, i4 | ((i2 >> 9) & 112) | (i3 & 7168), 48, 1472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Year$lambda$3;
                    Year$lambda$3 = DatePickerKt.Year$lambda$3(str, modifier, z, z2, function0, z3, str2, datePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Year$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Year$lambda$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str, null, 2, null));
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8881getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Year$lambda$2(String str, DatePickerColors datePickerColors, boolean z, boolean z2, boolean z3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2402@109100L622:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564400443, i, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2402)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1181166895, "C2406@109346L2,2409@109426L194,2403@109191L521:DatePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1901556051, "CC(remember):DatePicker.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Year$lambda$2$0$0$0;
                        Year$lambda$2$0$0$0 = DatePickerKt.Year$lambda$2$0$0$0((SemanticsPropertyReceiver) obj);
                        return Year$lambda$2$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m4292TextNvy7gAk(str, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), datePickerColors.yearContentColor$material3(z, z2, z3, composer, 0).getValue().m6796unboximpl(), null, 0L, null, null, null, 0L, null, TextAlign.m9593boximpl(TextAlign.INSTANCE.m9600getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 261112);
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
    public static final Unit Year$lambda$2$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    private static final void MonthsNavigation(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final Modifier modifier2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final FocusRequester focusRequester, final DatePickerColors datePickerColors, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Arrangement.HorizontalOrVertical spaceBetween;
        Composer startRestartGroup = composer.startRestartGroup(942117263);
        ComposerKt.sourceInformation(startRestartGroup, "C(MonthsNavigation)N(modifier,nextAvailable,previousAvailable,yearPickerVisible,yearPickerText,nextButtonModifier,onNextClicked,onPreviousClicked,onYearPickerButtonClicked,onYearPickerButtonTabPressed,yearSelectionButtonFocusRequester,colors)2440@110330L2432:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(focusRequester) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(datePickerColors) ? 32 : 16;
        }
        int i5 = i4;
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(942117263, i3, i5, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2439)");
            }
            Modifier m1260requiredHeight3ABfNKs = SizeKt.m1260requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            if (z3) {
                spaceBetween = Arrangement.INSTANCE.getStart();
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1260requiredHeight3ABfNKs);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242857958, "C2455@110932L226,2462@111170L567,2451@110710L1027:DatePicker.kt#uh7d8r");
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1345386413, "CC(remember):DatePicker.kt#9igjgp");
            boolean z4 = ((i3 & 7168) == 2048) | ((1879048192 & i3) == 536870912);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m2931invokeZmokQxo(keyEvent.m7966unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m2931invokeZmokQxo(android.view.KeyEvent keyEvent) {
                        boolean m2928isTabZmokQxo;
                        if (z3) {
                            m2928isTabZmokQxo = DatePickerKt.m2928isTabZmokQxo(keyEvent);
                            if (m2928isTabZmokQxo) {
                                function04.invoke();
                                return true;
                            }
                        }
                        return false;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            YearPickerMenuButton(function03, z3, KeyInputModifierKt.onKeyEvent(focusRequester2, (Function1) rememberedValue), ComposableLambdaKt.rememberComposableLambda(921071711, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MonthsNavigation$lambda$0$1;
                    MonthsNavigation$lambda$0$1 = DatePickerKt.MonthsNavigation$lambda$0$1(str, datePickerColors, (Composer) obj, ((Integer) obj2).intValue());
                    return MonthsNavigation$lambda$0$1;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 24) & 14) | 3072 | ((i3 >> 6) & 112), 0);
            if (!z3) {
                startRestartGroup.startReplaceGroup(-1241751848);
                ComposerKt.sourceInformation(startRestartGroup, "2478@111958L788,2478@111875L871");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(datePickerColors.getNavigationContentColor())), ComposableLambdaKt.rememberComposableLambda(591596400, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MonthsNavigation$lambda$0$2;
                        MonthsNavigation$lambda$0$2 = DatePickerKt.MonthsNavigation$lambda$0$2(Function0.this, z2, function0, modifier2, z, (Composer) obj, ((Integer) obj2).intValue());
                        return MonthsNavigation$lambda$0$2;
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1240891753);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MonthsNavigation$lambda$1;
                    MonthsNavigation$lambda$1 = DatePickerKt.MonthsNavigation$lambda$1(Modifier.this, z, z2, z3, str, modifier2, function0, function02, function03, function04, focusRequester, datePickerColors, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MonthsNavigation$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonthsNavigation$lambda$0$1(final String str, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2466@111295L362,2463@111184L543:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(921071711, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2463)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 386655657, "CC(remember):DatePicker.kt#9igjgp");
            boolean changed = composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MonthsNavigation$lambda$0$1$0$0;
                        MonthsNavigation$lambda$0$1$0$0 = DatePickerKt.MonthsNavigation$lambda$0$1$0$0(str, (SemanticsPropertyReceiver) obj);
                        return MonthsNavigation$lambda$0$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m4292TextNvy7gAk(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), datePickerColors.getNavigationContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonthsNavigation$lambda$0$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8899setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m8873getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MonthsNavigation$lambda$0$2(Function0 function0, boolean z, Function0 function02, Modifier modifier, boolean z2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2479@111976L756:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591596400, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2479)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1800355217, "C2484@112252L50,2480@112002L323,2492@112645L46,2487@112347L367:DatePicker.kt#uh7d8r");
            ImageVector keyboardArrowLeft$material3 = Icons.AutoMirrored.Filled.INSTANCE.getKeyboardArrowLeft$material3();
            Strings.Companion companion2 = Strings.INSTANCE;
            IconButtonWithTooltip(function0, keyboardArrowLeft$material3, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_previous_month), composer, 0), null, z, composer, 0, 8);
            ImageVector keyboardArrowRight$material3 = Icons.AutoMirrored.Filled.INSTANCE.getKeyboardArrowRight$material3();
            Strings.Companion companion3 = Strings.INSTANCE;
            IconButtonWithTooltip(function02, keyboardArrowRight$material3, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_next_month), composer, 0), modifier, z2, composer, 0, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void YearPickerMenuButton(final Function0<Unit> function0, final boolean z, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-709923073);
        ComposerKt.sourceInformation(startRestartGroup, "C(YearPickerMenuButton)N(onClick,expanded,modifier,content)2512@113183L7,2512@113133L58,2515@113248L454,2508@113004L698:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-709923073, i3, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2507)");
                }
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContentColor);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                modifier2 = modifier3;
                ButtonKt.TextButton(function02, modifier2, false, (Shape) circleShape, buttonDefaults.m2618textButtonColorsro_MJ88(0L, ((Color) consume).m6796unboximpl(), 0L, 0L, startRestartGroup, 24576, 13), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1899489890, true, new Function3() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit YearPickerMenuButton$lambda$0;
                        YearPickerMenuButton$lambda$0 = DatePickerKt.YearPickerMenuButton$lambda$0(Function2.this, z, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return YearPickerMenuButton$lambda$0;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier4 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit YearPickerMenuButton$lambda$1;
                        YearPickerMenuButton$lambda$1 = DatePickerKt.YearPickerMenuButton$lambda$1(Function0.this, z, modifier4, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return YearPickerMenuButton$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        final Modifier modifier42 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YearPickerMenuButton$lambda$0(Function2 function2, boolean z, RowScope rowScope, Composer composer, int i) {
        String m4895getString2EP1pXo;
        ComposerKt.sourceInformation(composer, "C2516@113258L9,2517@113276L49,2518@113334L362:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1899489890, i, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2516)");
            }
            function2.invoke(composer, 0);
            SpacerKt.Spacer(SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2604getIconSpacingD9Ej5fM()), composer, 6);
            ImageVector arrowDropDown$material3 = Icons.Filled.INSTANCE.getArrowDropDown$material3();
            if (z) {
                composer.startReplaceGroup(1509384391);
                ComposerKt.sourceInformation(composer, "2522@113465L49");
                Strings.Companion companion = Strings.INSTANCE;
                m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_day_selection), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1509478662);
                ComposerKt.sourceInformation(composer, "2524@113560L50");
                Strings.Companion companion2 = Strings.INSTANCE;
                m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_picker_switch_to_year_selection), composer, 0);
                composer.endReplaceGroup();
            }
            IconKt.m3345Iconww6aTOc(arrowDropDown$material3, m4895getString2EP1pXo, RotateKt.rotate(Modifier.INSTANCE, z ? 180.0f : 0.0f), 0L, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IconButtonWithTooltip(final Function0<Unit> function0, final ImageVector imageVector, final String str, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        final Function0<Unit> function02;
        int i3;
        final ImageVector imageVector2;
        Modifier modifier2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-368059805);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButtonWithTooltip)N(onClick,icon,contentDescription,modifier,enabled)2542@114012L60,2543@114092L45,2544@114155L22,2545@114185L175,2540@113945L415:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            imageVector2 = imageVector;
            i3 |= startRestartGroup.changed(imageVector2) ? 32 : 16;
        } else {
            imageVector2 = imageVector;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
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
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 != 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368059805, i3, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2539)");
                    }
                    final Modifier modifier4 = companion;
                    final boolean z5 = z4;
                    TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), ComposableLambdaKt.rememberComposableLambda(-456272562, true, new Function3() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda75
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit IconButtonWithTooltip$lambda$0;
                            IconButtonWithTooltip$lambda$0 = DatePickerKt.IconButtonWithTooltip$lambda$0(str, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return IconButtonWithTooltip$lambda$0;
                        }
                    }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1124908186, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda76
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit IconButtonWithTooltip$lambda$1;
                            IconButtonWithTooltip$lambda$1 = DatePickerKt.IconButtonWithTooltip$lambda$1(Function0.this, modifier4, z5, imageVector2, str, (Composer) obj, ((Integer) obj2).intValue());
                            return IconButtonWithTooltip$lambda$1;
                        }
                    }, startRestartGroup, 54), startRestartGroup, 100663344, 248);
                    startRestartGroup = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z3 = z5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit IconButtonWithTooltip$lambda$2;
                            IconButtonWithTooltip$lambda$2 = DatePickerKt.IconButtonWithTooltip$lambda$2(Function0.this, imageVector, str, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return IconButtonWithTooltip$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonWithTooltip$lambda$0(final String str, TooltipScope tooltipScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C2543@114107L28,2543@114094L41:DatePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-456272562, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2543)");
            }
            TooltipKt.m4544PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1905952188, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IconButtonWithTooltip$lambda$0$0;
                    IconButtonWithTooltip$lambda$0$0 = DatePickerKt.IconButtonWithTooltip$lambda$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    return IconButtonWithTooltip$lambda$0$0;
                }
            }, composer, 54), composer, (i2 & 14) | 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonWithTooltip$lambda$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2543@114109L24:DatePicker.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1905952188, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2543)");
            }
            TextKt.m4292TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonWithTooltip$lambda$1(Function0 function0, Modifier modifier, boolean z, final ImageVector imageVector, final String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2546@114265L89,2546@114195L159:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124908186, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2546)");
            }
            IconButtonKt.IconButton((Function0<Unit>) function0, modifier, z, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableLambdaKt.rememberComposableLambda(-1301085432, true, new Function2() { // from class: androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IconButtonWithTooltip$lambda$1$0;
                    IconButtonWithTooltip$lambda$1$0 = DatePickerKt.IconButtonWithTooltip$lambda$1$0(ImageVector.this, str, (Composer) obj, ((Integer) obj2).intValue());
                    return IconButtonWithTooltip$lambda$1$0;
                }
            }, composer, 54), composer, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonWithTooltip$lambda$1$0(ImageVector imageVector, String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C2547@114279L65:DatePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1301085432, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2547)");
            }
            IconKt.m3345Iconww6aTOc(imageVector, str, (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDirectionBackwards-YhN2O0w, reason: not valid java name */
    public static final boolean m2923isDirectionBackwardsYhN2O0w(android.view.KeyEvent keyEvent, boolean z) {
        return z ? m2926isDirectionRightZmokQxo(keyEvent) : m2925isDirectionLeftZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDirectionForward-YhN2O0w, reason: not valid java name */
    public static final boolean m2924isDirectionForwardYhN2O0w(android.view.KeyEvent keyEvent, boolean z) {
        return z ? m2925isDirectionLeftZmokQxo(keyEvent) : m2926isDirectionRightZmokQxo(keyEvent);
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isShiftTab-ZmokQxo, reason: not valid java name */
    public static final boolean m2927isShiftTabZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEvent_androidKt.m7983isShiftPressedZmokQxo(keyEvent) && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7905getTabEK5gGoQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isTab-ZmokQxo, reason: not valid java name */
    public static final boolean m2928isTabZmokQxo(android.view.KeyEvent keyEvent) {
        return !KeyEvent_androidKt.m7983isShiftPressedZmokQxo(keyEvent) && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7905getTabEK5gGoQ());
    }

    /* renamed from: isDirectionLeft-ZmokQxo, reason: not valid java name */
    private static final boolean m2925isDirectionLeftZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7734getDirectionLeftEK5gGoQ());
    }

    /* renamed from: isDirectionRight-ZmokQxo, reason: not valid java name */
    private static final boolean m2926isDirectionRightZmokQxo(android.view.KeyEvent keyEvent) {
        return KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7735getDirectionRightEK5gGoQ());
    }

    static {
        float f = 12;
        DatePickerHorizontalPadding = Dp.m9732constructorimpl(f);
        DatePickerModeTogglePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m9732constructorimpl(f), Dp.m9732constructorimpl(f), 3, null);
        float f2 = 24;
        float f3 = 16;
        DatePickerTitlePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl(f2), Dp.m9732constructorimpl(f3), Dp.m9732constructorimpl(f), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl(f2), 0.0f, Dp.m9732constructorimpl(f), Dp.m9732constructorimpl(f), 2, null);
        YearsVerticalPadding = Dp.m9732constructorimpl(f3);
    }
}
