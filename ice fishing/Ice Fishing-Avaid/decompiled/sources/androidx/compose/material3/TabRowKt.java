package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a}\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u009b\u0001\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009b\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001c\u001ak\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\b#\u0010$\u001a{\u0010%\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072,\u0010\t\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020'0&¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\b+\u0010!\u001a\u009d\u0001\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032,\u0010\t\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020'0&¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b-\u0010.\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b/\u00100\u001a\u0091\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b1\u00100\u001a\u008d\u0001\u00102\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072.\b\u0002\u0010\t\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020'0&¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b3\u0010\u0012\u001a\u0097\u0001\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192.\b\u0002\u0010\t\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020'0&¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"PrimaryTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "indicator", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "PrimaryScrollableTabRow", "scrollState", "Landroidx/compose/foundation/ScrollState;", "edgePadding", "Landroidx/compose/ui/unit/Dp;", "minTabWidth", "PrimaryScrollableTabRow-cx2KkNY", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-cx2KkNY", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowImpl", "ScrollableTabRowImpl-xam5sdo", "(ILandroidx/compose/ui/Modifier;JJFFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "TabRowWithSubcomposeImpl-DTcfvLk", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow-qhFBPw4", "TabRow", "TabRow-pAZo6Ak", "ScrollableTabRow", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TabRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryScrollableTabRow_cx2KkNY$lambda$1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, float f2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4176PrimaryScrollableTabRowcx2KkNY(i, modifier, scrollState, j, j2, f, function3, function2, f2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryScrollableTabRow_qhFBPw4$lambda$1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4177PrimaryScrollableTabRowqhFBPw4(i, modifier, scrollState, j, j2, f, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryTabRow_pAZo6Ak$lambda$1(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4178PrimaryTabRowpAZo6Ak(i, modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowImpl_xam5sdo$lambda$1(int i, Modifier modifier, long j, long j2, float f, float f2, ScrollState scrollState, Function3 function3, Function2 function2, Function2 function22, int i2, Composer composer, int i3) {
        m4180ScrollableTabRowImplxam5sdo(i, modifier, j, j2, f, f2, scrollState, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$1(int i, Function3 function3, Modifier modifier, long j, long j2, float f, Function2 function2, Function2 function22, ScrollState scrollState, int i2, int i3, Composer composer, int i4) {
        m4181ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function3, modifier, j, j2, f, function2, function22, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRow_sKfQg0A$lambda$1(int i, Modifier modifier, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4179ScrollableTabRowsKfQg0A(i, modifier, j, j2, f, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryScrollableTabRow_cx2KkNY$lambda$1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, float f2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4182SecondaryScrollableTabRowcx2KkNY(i, modifier, scrollState, j, j2, f, function3, function2, f2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryScrollableTabRow_qhFBPw4$lambda$1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4183SecondaryScrollableTabRowqhFBPw4(i, modifier, scrollState, j, j2, f, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryTabRow_pAZo6Ak$lambda$1(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4184SecondaryTabRowpAZo6Ak(i, modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowImpl_DTcfvLk$lambda$1(Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        m4186TabRowImplDTcfvLk(modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$1(Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        m4187TabRowWithSubcomposeImplDTcfvLk(modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRow_pAZo6Ak$lambda$1(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m4185TabRowpAZo6Ak(i, modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryTabRow_pAZo6Ak$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "C155@7704L158:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (!composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1338273762, i3, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:155)");
            }
            TabRowDefaults.INSTANCE.m4162PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007b  */
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4178PrimaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1012974221);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryTabRow)N(selectedTabIndex,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)163@7987L76:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((1572864 & i2) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "152@7536L21,153@7600L19,154@7679L189");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier3 = modifier;
                            function34 = function32;
                            function25 = function23;
                            i7 = -1012974221;
                            j8 = j3;
                            j9 = j4;
                        } else {
                            Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                i4 &= -7169;
                            } else {
                                j7 = j4;
                            }
                            ComposableLambda rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(1338273762, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit PrimaryTabRow_pAZo6Ak$lambda$0;
                                    PrimaryTabRow_pAZo6Ak$lambda$0 = TabRowKt.PrimaryTabRow_pAZo6Ak$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return PrimaryTabRow_pAZo6Ak$lambda$0;
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i6 != 0) {
                                modifier3 = companion;
                                j9 = j7;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = ComposableSingletons$TabRowKt.INSTANCE.m2843getLambda$1429684928$material3();
                                i7 = -1012974221;
                            } else {
                                modifier3 = companion;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = function23;
                                i7 = -1012974221;
                                j9 = j7;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:162)");
                        }
                        composer2 = startRestartGroup;
                        m4186TabRowImplDTcfvLk(modifier3, j8, j9, function34, function25, function22, composer2, (i4 >> 3) & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j5 = j8;
                        j6 = j9;
                        function33 = function34;
                        function24 = function25;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        j6 = j4;
                        function33 = function32;
                        function24 = function23;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PrimaryTabRow_pAZo6Ak$lambda$1;
                                PrimaryTabRow_pAZo6Ak$lambda$1 = TabRowKt.PrimaryTabRow_pAZo6Ak$lambda$1(i, modifier2, j5, j6, function33, function24, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return PrimaryTabRow_pAZo6Ak$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((1572864 & i2) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((1572864 & i2) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((1572864 & i2) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryTabRow_pAZo6Ak$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C207@10603L121:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(959948692, i2, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:207)");
            }
            TabRowDefaults.INSTANCE.m4163SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007b  */
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4184SecondaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(563434725);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecondaryTabRow)N(selectedTabIndex,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)214@10853L76:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((1572864 & i2) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "203@10407L23,204@10473L21,206@10574L160");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier3 = modifier;
                            function34 = function32;
                            function25 = function23;
                            i7 = 563434725;
                            j8 = j3;
                            j9 = j4;
                        } else {
                            Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j7 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                i4 &= -7169;
                            } else {
                                j7 = j4;
                            }
                            ComposableLambda rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(959948692, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit SecondaryTabRow_pAZo6Ak$lambda$0;
                                    SecondaryTabRow_pAZo6Ak$lambda$0 = TabRowKt.SecondaryTabRow_pAZo6Ak$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return SecondaryTabRow_pAZo6Ak$lambda$0;
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i6 != 0) {
                                modifier3 = companion;
                                j9 = j7;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = ComposableSingletons$TabRowKt.INSTANCE.m2846getLambda$463596174$material3();
                                i7 = 563434725;
                            } else {
                                modifier3 = companion;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = function23;
                                i7 = 563434725;
                                j9 = j7;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                        }
                        composer2 = startRestartGroup;
                        m4186TabRowImplDTcfvLk(modifier3, j8, j9, function34, function25, function22, composer2, (i4 >> 3) & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j5 = j8;
                        j6 = j9;
                        function33 = function34;
                        function24 = function25;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        j6 = j4;
                        function33 = function32;
                        function24 = function23;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SecondaryTabRow_pAZo6Ak$lambda$1;
                                SecondaryTabRow_pAZo6Ak$lambda$1 = TabRowKt.SecondaryTabRow_pAZo6Ak$lambda$1(i, modifier2, j5, j6, function33, function24, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return SecondaryTabRow_pAZo6Ak$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((1572864 & i2) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((1572864 & i2) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((1572864 & i2) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryScrollableTabRow_cx2KkNY$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "C261@13657L159:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (!composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835301263, i3, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:261)");
            }
            TabRowDefaults.INSTANCE.m4162PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: PrimaryScrollableTabRow-cx2KkNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4176PrimaryScrollableTabRowcx2KkNY(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, float f2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f4;
        final ComposableLambda composableLambda;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        ScrollState scrollState4;
        long j7;
        long j8;
        int i11;
        float f6;
        ScrollState scrollState5;
        long j9;
        float f7;
        long j10;
        Modifier modifier3;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(450849184);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryScrollableTabRow)N(selectedTabIndex,modifier,scrollState,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,minTabWidth:c#ui.unit.Dp,tabs)270@14011L363:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i14 = 256;
                        i4 |= i14;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i14 = 128;
                i4 |= i14;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i13 = 2048;
                        i4 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = 1024;
                i4 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i12 = 16384;
                        i4 |= i12;
                    }
                } else {
                    j4 = j2;
                }
                i12 = 8192;
                i4 |= i12;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "255@13328L21,256@13394L21,257@13458L19,260@13628L198");
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                long j11 = j4;
                                scrollState5 = scrollState2;
                                j10 = j11;
                                float f8 = f3;
                                i11 = i4;
                                j9 = j3;
                                f7 = f8;
                                companion = modifier;
                                composableLambda = function3;
                                function23 = function2;
                                f6 = f2;
                            } else {
                                companion = i15 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i4 &= -897;
                                } else {
                                    scrollState4 = scrollState2;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j3;
                                }
                                if ((i3 & 16) != 0) {
                                    j8 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -57345;
                                } else {
                                    j8 = j4;
                                }
                                float m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f3;
                                composableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(835301263, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda30
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit PrimaryScrollableTabRow_cx2KkNY$lambda$0;
                                        PrimaryScrollableTabRow_cx2KkNY$lambda$0 = TabRowKt.PrimaryScrollableTabRow_cx2KkNY$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return PrimaryScrollableTabRow_cx2KkNY$lambda$0;
                                    }
                                }, startRestartGroup, 54) : function3;
                                function23 = i8 != 0 ? ComposableSingletons$TabRowKt.INSTANCE.m2847getLambda$773954579$material3() : function2;
                                if (i10 != 0) {
                                    i11 = i4;
                                    long j12 = j8;
                                    scrollState5 = scrollState4;
                                    j9 = j7;
                                    f6 = TabRowDefaults.INSTANCE.m4165getScrollableTabRowMinTabWidthD9Ej5fM();
                                    f7 = m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    j10 = j12;
                                } else {
                                    i11 = i4;
                                    long j13 = j8;
                                    f6 = f2;
                                    scrollState5 = scrollState4;
                                    j9 = j7;
                                    f7 = m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    j10 = j13;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = companion;
                                ComposerKt.traceEventStart(450849184, i11, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:269)");
                            } else {
                                modifier3 = companion;
                            }
                            int i16 = i11 >> 3;
                            int i17 = (i11 & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016);
                            int i18 = i11 << 3;
                            int i19 = i17 | (29360128 & i18) | (i18 & 234881024) | (1879048192 & i11);
                            Modifier modifier4 = modifier3;
                            m4180ScrollableTabRowImplxam5sdo(i, modifier4, j9, j10, f7, f6, scrollState5, composableLambda, function23, function22, startRestartGroup, i19);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = f6;
                            long j14 = j9;
                            modifier2 = modifier4;
                            scrollState3 = scrollState5;
                            f4 = f7;
                            j6 = j10;
                            j5 = j14;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function23 = function2;
                            scrollState3 = scrollState2;
                            j5 = j3;
                            j6 = j4;
                            f4 = f3;
                            composableLambda = function3;
                            f5 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda31
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit PrimaryScrollableTabRow_cx2KkNY$lambda$1;
                                    PrimaryScrollableTabRow_cx2KkNY$lambda$1 = TabRowKt.PrimaryScrollableTabRow_cx2KkNY$lambda$1(i, modifier2, scrollState3, j5, j6, f4, composableLambda, function23, f5, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return PrimaryScrollableTabRow_cx2KkNY$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i2 & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryScrollableTabRow_cx2KkNY$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C332@17381L121:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610355265, i2, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:332)");
            }
            TabRowDefaults.INSTANCE.m4163SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: SecondaryScrollableTabRow-cx2KkNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4182SecondaryScrollableTabRowcx2KkNY(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, float f2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f4;
        final ComposableLambda composableLambda;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        ScrollState scrollState4;
        long j7;
        long j8;
        int i11;
        float f6;
        ScrollState scrollState5;
        long j9;
        float f7;
        long j10;
        Modifier modifier3;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(519094802);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecondaryScrollableTabRow)N(selectedTabIndex,modifier,scrollState,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,minTabWidth:c#ui.unit.Dp,tabs)340@17697L363:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i14 = 256;
                        i4 |= i14;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i14 = 128;
                i4 |= i14;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i13 = 2048;
                        i4 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = 1024;
                i4 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i12 = 16384;
                        i4 |= i12;
                    }
                } else {
                    j4 = j2;
                }
                i12 = 8192;
                i4 |= i12;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "326@17048L21,327@17114L23,328@17180L21,331@17352L160");
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                long j11 = j4;
                                scrollState5 = scrollState2;
                                j10 = j11;
                                float f8 = f3;
                                i11 = i4;
                                j9 = j3;
                                f7 = f8;
                                companion = modifier;
                                composableLambda = function3;
                                function23 = function2;
                                f6 = f2;
                            } else {
                                companion = i15 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i4 &= -897;
                                } else {
                                    scrollState4 = scrollState2;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j3;
                                }
                                if ((i3 & 16) != 0) {
                                    j8 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                    i4 &= -57345;
                                } else {
                                    j8 = j4;
                                }
                                float m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f3;
                                composableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(610355265, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit SecondaryScrollableTabRow_cx2KkNY$lambda$0;
                                        SecondaryScrollableTabRow_cx2KkNY$lambda$0 = TabRowKt.SecondaryScrollableTabRow_cx2KkNY$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return SecondaryScrollableTabRow_cx2KkNY$lambda$0;
                                    }
                                }, startRestartGroup, 54) : function3;
                                function23 = i8 != 0 ? ComposableSingletons$TabRowKt.INSTANCE.getLambda$303717663$material3() : function2;
                                if (i10 != 0) {
                                    i11 = i4;
                                    long j12 = j8;
                                    scrollState5 = scrollState4;
                                    j9 = j7;
                                    f6 = TabRowDefaults.INSTANCE.m4165getScrollableTabRowMinTabWidthD9Ej5fM();
                                    f7 = m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    j10 = j12;
                                } else {
                                    i11 = i4;
                                    long j13 = j8;
                                    f6 = f2;
                                    scrollState5 = scrollState4;
                                    j9 = j7;
                                    f7 = m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    j10 = j13;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = companion;
                                ComposerKt.traceEventStart(519094802, i11, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:339)");
                            } else {
                                modifier3 = companion;
                            }
                            int i16 = i11 >> 3;
                            int i17 = (i11 & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016);
                            int i18 = i11 << 3;
                            int i19 = i17 | (29360128 & i18) | (i18 & 234881024) | (1879048192 & i11);
                            Modifier modifier4 = modifier3;
                            m4180ScrollableTabRowImplxam5sdo(i, modifier4, j9, j10, f7, f6, scrollState5, composableLambda, function23, function22, startRestartGroup, i19);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = f6;
                            long j14 = j9;
                            modifier2 = modifier4;
                            scrollState3 = scrollState5;
                            f4 = f7;
                            j6 = j10;
                            j5 = j14;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function23 = function2;
                            scrollState3 = scrollState2;
                            j5 = j3;
                            j6 = j4;
                            f4 = f3;
                            composableLambda = function3;
                            f5 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SecondaryScrollableTabRow_cx2KkNY$lambda$1;
                                    SecondaryScrollableTabRow_cx2KkNY$lambda$1 = TabRowKt.SecondaryScrollableTabRow_cx2KkNY$lambda$1(i, modifier2, scrollState3, j5, j6, f4, composableLambda, function23, f5, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SecondaryScrollableTabRow_cx2KkNY$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i2 & 805306368) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 805306368) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 805306368) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 805306368) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    private static final void m4186TabRowImplDTcfvLk(Modifier modifier, final long j, final long j2, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1955286154);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRowImpl)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)403@19704L4058,399@19573L4189:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955286154, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:398)");
            }
            int i3 = i2 << 3;
            composer2 = startRestartGroup;
            SurfaceKt.m4112SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(830280655, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabRowImpl_DTcfvLk$lambda$0;
                    TabRowImpl_DTcfvLk$lambda$0 = TabRowKt.TabRowImpl_DTcfvLk$lambda$0(Function2.this, function2, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return TabRowImpl_DTcfvLk$lambda$0;
                }
            }, startRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabRowImpl_DTcfvLk$lambda$1;
                    TabRowImpl_DTcfvLk$lambda$1 = TabRowKt.TabRowImpl_DTcfvLk$lambda$1(Modifier.this, j, j2, function3, function2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TabRowImpl_DTcfvLk$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowImpl_DTcfvLk$lambda$0(Function2 function2, Function2 function22, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C405@19859L11,406@19891L1219,440@21221L21,441@21255L2501,438@21120L2636:TabRow.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830280655, i, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:405)");
            }
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -964200398, "CC(remember):TabRow.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1(value);
                composer.updateRememberedValue(rememberedValue);
            }
            final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function22, ComposableLambdaKt.rememberComposableLambda(-1333331860, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabRowImpl_DTcfvLk$lambda$0$1;
                    TabRowImpl_DTcfvLk$lambda$0$1 = TabRowKt.TabRowImpl_DTcfvLk$lambda$0$1(Function3.this, tabRowKt$TabRowImpl$1$scope$1$1, (Composer) obj, ((Integer) obj2).intValue());
                    return TabRowImpl_DTcfvLk$lambda$0$1;
                }
            }, composer, 54)});
            ComposerKt.sourceInformationMarkerStart(composer, -964155468, "CC(remember):TabRow.kt#9igjgp");
            TabRowKt$TabRowImpl$1$2$1 rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new TabRowKt$TabRowImpl$1$2$1(tabRowKt$TabRowImpl$1$scope$1$1);
                composer.updateRememberedValue(rememberedValue2);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(composer, 292526026, "CC(remember):Layout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composer.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowImpl_DTcfvLk$lambda$0$1(Function3 function3, TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C440@21229L11:TabRow.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1333331860, i, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:440)");
            }
            function3.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: ScrollableTabRowImpl-xam5sdo, reason: not valid java name */
    private static final void m4180ScrollableTabRowImplxam5sdo(final int i, final Modifier modifier, final long j, final long j2, final float f, final float f2, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        ScrollState scrollState2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(414860860);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRowImpl)N(selectedTabIndex,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,minTabWidth:c#ui.unit.Dp,scrollState,indicator,divider,tabs)522@24245L5677,522@24163L5759:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            scrollState2 = scrollState;
            i3 |= startRestartGroup.changed(scrollState2) ? 1048576 : 524288;
        } else {
            scrollState2 = scrollState;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            function23 = function2;
            i3 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            function23 = function2;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414860860, i3, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:521)");
            }
            final ScrollState scrollState3 = scrollState2;
            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
            composer2 = startRestartGroup;
            SurfaceKt.m4112SurfaceT9BRK9s(modifier, null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1878374785, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScrollableTabRowImpl_xam5sdo$lambda$0;
                    ScrollableTabRowImpl_xam5sdo$lambda$0 = TabRowKt.ScrollableTabRowImpl_xam5sdo$lambda$0(ScrollState.this, function24, function22, f, f2, i, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return ScrollableTabRowImpl_xam5sdo$lambda$0;
                }
            }, startRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScrollableTabRowImpl_xam5sdo$lambda$1;
                    ScrollableTabRowImpl_xam5sdo$lambda$1 = TabRowKt.ScrollableTabRowImpl_xam5sdo$lambda$1(i, modifier, j, j2, f, f2, scrollState, function3, function2, function22, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ScrollableTabRowImpl_xam5sdo$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowImpl_xam5sdo$lambda$0(ScrollState scrollState, Function2 function2, Function2 function22, float f, float f2, int i, final Function3 function3, Composer composer, int i2) {
        int i3;
        int i4;
        String str;
        ComposerKt.sourceInformation(composer, "C523@24276L24,525@24448L14,527@24577L7,529@24629L263,537@24914L1219,568@26142L3774:TabRow.kt#uh7d8r");
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1878374785, i2, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:523)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 1231916616, "CC(remember):TabRow.kt#9igjgp");
            boolean changed = composer.changed(scrollState) | composer.changed(coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new ScrollableTabData(scrollState, coroutineScope, value);
                composer.updateRememberedValue(rememberedValue2);
            }
            ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1231926692, "CC(remember):TabRow.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1(value2);
                composer.updateRememberedValue(rememberedValue3);
            }
            final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer);
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
            ComposerKt.sourceInformationMarkerStart(composer, 738154596, "C569@26202L9,571@26272L21,578@26592L3314,570@26224L3682:TabRow.kt#uh7d8r");
            function2.invoke(composer, 0);
            List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, ComposableLambdaKt.rememberComposableLambda(509386037, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScrollableTabRowImpl_xam5sdo$lambda$0$2$0;
                    ScrollableTabRowImpl_xam5sdo$lambda$0$2$0 = TabRowKt.ScrollableTabRowImpl_xam5sdo$lambda$0$2$0(Function3.this, tabRowKt$ScrollableTabRowImpl$1$scope$1$1, (Composer) obj, ((Integer) obj2).intValue());
                    return ScrollableTabRowImpl_xam5sdo$lambda$0$2$0;
                }
            }, composer, 54)});
            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
            ComposerKt.sourceInformationMarkerStart(composer, 578012857, "CC(remember):TabRow.kt#9igjgp");
            boolean changed2 = composer.changed(f) | composer.changed(f2) | composer.changed(i) | composer.changedInstance(scrollableTabData);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                i3 = -553112988;
                i4 = -1159599143;
                str = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                rememberedValue4 = (MultiContentMeasurePolicy) new TabRowKt$ScrollableTabRowImpl$1$1$2$1(f, f2, tabRowKt$ScrollableTabRowImpl$1$scope$1$1, i, scrollableTabData);
                composer.updateRememberedValue(rememberedValue4);
            } else {
                i4 = -1159599143;
                str = "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                i3 = -553112988;
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1399185516, "CC(Layout)N(contents,modifier,measurePolicy)172@7174L62,169@7060L183:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(composer, 292526026, "CC(remember):Layout.kt#9igjgp");
            boolean changed3 = composer.changed(multiContentMeasurePolicy);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composer.updateRememberedValue(rememberedValue5);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, i4, str);
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, clipToBounds);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, i3, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
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
            Updater.m5872setimpl(m5864constructorimpl2, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(composer, 0);
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowImpl_xam5sdo$lambda$0$2$0(Function3 function3, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C571@26280L11:TabRow.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(509386037, i, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:571)");
            }
            function3.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    private static final void m4187TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j, final long j2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(148841506);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRowWithSubcomposeImpl)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)768@33827L2218,764@33696L2349:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148841506, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:763)");
            }
            int i3 = i2 << 3;
            composer2 = startRestartGroup;
            SurfaceKt.m4112SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1815327065, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0;
                    TabRowWithSubcomposeImpl_DTcfvLk$lambda$0 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$0(Function2.this, function2, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return TabRowWithSubcomposeImpl_DTcfvLk$lambda$0;
                }
            }, startRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$1;
                    TabRowWithSubcomposeImpl_DTcfvLk$lambda$1 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$1(Modifier.this, j, j2, function3, function2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TabRowWithSubcomposeImpl_DTcfvLk$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0(final Function2 function2, final Function2 function22, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C769@33879L2160,769@33837L2202:TabRow.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1815327065, i, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:769)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, -772583465, "CC(remember):TabRow.kt#9igjgp");
            boolean changed = composer.changed(function2) | composer.changed(function22) | composer.changed(function3);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        MeasureResult TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0;
                        TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0(Function2.this, function22, function3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                        return TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0(Function2 function2, final Function2 function22, final Function3 function3, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        final int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(constraints.getValue());
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function2);
        int size = subcompose.size();
        final Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = m9675getMaxWidthimpl / size;
        }
        int i = 0;
        List<Measurable> list = subcompose;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            i = Integer.valueOf(Math.max(subcompose.get(i2).maxIntrinsicHeight(intRef.element), i.intValue()));
        }
        final int intValue = i.intValue();
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList.add(subcompose.get(i3).mo8285measureBRTryo0(Constraints.m9664copyZbe2FdA(constraints.getValue(), intRef.element, intRef.element, intValue, intValue)));
        }
        final ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(new TabPosition(Dp.m9732constructorimpl(subcomposeMeasureScope.mo525toDpu2uoSUM(intRef.element) * i4), subcomposeMeasureScope.mo525toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m9730boximpl(Dp.m9732constructorimpl(subcomposeMeasureScope.mo525toDpu2uoSUM(Math.min(subcompose.get(i4).maxIntrinsicWidth(intValue), intRef.element)) - Dp.m9732constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m9730boximpl(Dp.m9732constructorimpl(24)))).m9746unboximpl(), null));
        }
        final ArrayList arrayList4 = arrayList3;
        return MeasureScope.CC.layout$default(subcomposeMeasureScope, m9675getMaxWidthimpl, intValue, null, new Function1() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3;
                TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3(arrayList2, subcomposeMeasureScope, function22, intRef, constraints, intValue, function3, arrayList4, m9675getMaxWidthimpl, (Placeable.PlacementScope) obj);
                return TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3$2(Function3 function3, List list, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C815@35832L23:TabRow.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1918742627, i, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:815)");
            }
            function3.invoke(list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00af  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m4181ScrollableTabRowWithSubcomposeImplqhFBPw4(final int i, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> lambda$2075817209$material3;
        long j7;
        float f4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(901781420);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRowWithSubcomposeImpl)N(selectedTabIndex,indicator,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,divider,tabs,scrollState)837@36714L4172,837@36632L4254:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 16384;
                        i4 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i4 |= i7;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                    if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(scrollState) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "830@36329L21,831@36393L19");
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 8) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i5 != 0) {
                                f2 = TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                            }
                            if (i6 != 0) {
                                lambda$2075817209$material3 = ComposableSingletons$TabRowKt.INSTANCE.getLambda$2075817209$material3();
                                j7 = j4;
                                f4 = f2;
                                Modifier modifier4 = modifier2;
                                long j8 = j3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(901781420, i4, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:836)");
                                }
                                final float f5 = f4;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = lambda$2075817209$material3;
                                int i10 = ((i4 >> 6) & 14) | 12582912;
                                int i11 = i4 >> 3;
                                composer2 = startRestartGroup;
                                SurfaceKt.m4112SurfaceT9BRK9s(modifier4, null, j8, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2077251399, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0;
                                        ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0(ScrollState.this, f5, function22, function25, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                                        return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0;
                                    }
                                }, startRestartGroup, 54), composer2, i10 | (i11 & 896) | (i11 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f5;
                                function24 = function25;
                                modifier3 = modifier4;
                                j5 = j8;
                                j6 = j7;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        j7 = j4;
                        f4 = f2;
                        lambda$2075817209$material3 = function23;
                        Modifier modifier42 = modifier2;
                        long j82 = j3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final float f52 = f4;
                        final Function2 function252 = lambda$2075817209$material3;
                        int i102 = ((i4 >> 6) & 14) | 12582912;
                        int i112 = i4 >> 3;
                        composer2 = startRestartGroup;
                        SurfaceKt.m4112SurfaceT9BRK9s(modifier42, null, j82, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2077251399, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0;
                                ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0(ScrollState.this, f52, function22, function252, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                                return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0;
                            }
                        }, startRestartGroup, 54), composer2, i102 | (i112 & 896) | (i112 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f3 = f52;
                        function24 = function252;
                        modifier3 = modifier42;
                        j5 = j82;
                        j6 = j7;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        function24 = function23;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$1;
                                ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$1 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$1(i, function3, modifier3, j5, j6, f3, function24, function22, scrollState, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0(ScrollState scrollState, final float f, final Function2 function2, final Function2 function22, final Function3 function3, final int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C838@36745L24,840@36917L14,842@36976L263,855@37490L3390,849@37248L3632:TabRow.kt#uh7d8r");
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2077251399, i2, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:838)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -921189554, "CC(remember):TabRow.kt#9igjgp");
            boolean changed = composer.changed(scrollState) | composer.changed(coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new ScrollableTabData(scrollState, coroutineScope, value);
                composer.updateRememberedValue(rememberedValue2);
            }
            final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
            ComposerKt.sourceInformationMarkerStart(composer, -921169979, "CC(remember):TabRow.kt#9igjgp");
            boolean changed2 = composer.changed(f) | composer.changed(function2) | composer.changed(function22) | composer.changed(function3) | composer.changedInstance(scrollableTabData) | composer.changed(i);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        MeasureResult ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0;
                        ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0(f, function2, function22, scrollableTabData, i, function3, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
                        return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0;
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0(float f, Function2 function2, final Function2 function22, final ScrollableTabData scrollableTabData, final int i, final Function3 function3, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        int i2 = subcomposeMeasureScope.mo522roundToPx0680j_4(TabRowDefaults.INSTANCE.m4165getScrollableTabRowMinTabWidthD9Ej5fM());
        final int i3 = subcomposeMeasureScope.mo522roundToPx0680j_4(f);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function2);
        int i4 = 0;
        List<Measurable> list = subcompose;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            i4 = Integer.valueOf(Math.max(i4.intValue(), subcompose.get(i5).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        final int intValue = i4.intValue();
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(constraints.getValue(), i2, 0, intValue, intValue, 2, null);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Measurable measurable = subcompose.get(i6);
            Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
            float m9732constructorimpl = Dp.m9732constructorimpl(subcomposeMeasureScope.mo525toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo8285measureBRTryo0.getHeight()), mo8285measureBRTryo0.getWidth())) - Dp.m9732constructorimpl(TabKt.getHorizontalTextPadding() * 2));
            arrayList.add(mo8285measureBRTryo0);
            arrayList2.add(Dp.m9730boximpl(m9732constructorimpl));
        }
        Integer valueOf = Integer.valueOf(i3 * 2);
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i7)).getWidth());
        }
        final int intValue2 = valueOf.intValue();
        return MeasureScope.CC.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3;
                ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3(i3, arrayList, subcomposeMeasureScope, function22, scrollableTabData, i, arrayList2, constraints, intValue2, intValue, function3, (Placeable.PlacementScope) obj);
                return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3(int i, List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, ScrollableTabData scrollableTabData, int i2, List list2, Constraints constraints, int i3, int i4, final Function3 function3, Placeable.PlacementScope placementScope) {
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i5 = i;
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, 0, 0.0f, 4, null);
            arrayList.add(new TabPosition(placementScope.mo525toDpu2uoSUM(i5), placementScope.mo525toDpu2uoSUM(placeable.getWidth()), ((Dp) list2.get(i6)).m9746unboximpl(), null));
            i5 += placeable.getWidth();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, function2);
        int size2 = subcompose.size();
        int i7 = 0;
        while (i7 < size2) {
            Placeable mo8285measureBRTryo0 = subcompose.get(i7).mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(constraints.getValue(), i3, i3, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(placementScope2, mo8285measureBRTryo0, 0, i4 - mo8285measureBRTryo0.getHeight(), 0.0f, 4, null);
            i7++;
            placementScope2 = placementScope;
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(2125766411, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3$2;
                ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3$2 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3$2(Function3.this, arrayList, (Composer) obj, ((Integer) obj2).intValue());
                return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3$2;
            }
        }));
        int size3 = subcompose2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i8).mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(i3, i4)), 0, 0, 0.0f, 4, null);
        }
        scrollableTabData.onLaidOut(subcomposeMeasureScope, i, arrayList, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$0$1$0$3$2(Function3 function3, List list, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C922@40413L23:TabRow.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125766411, i, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:922)");
            }
            function3.invoke(list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryScrollableTabRow_qhFBPw4$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "C1199@51073L159:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (!composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1872002465, i3, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:1199)");
            }
            TabRowDefaults.INSTANCE.m4162PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for Binary Compatibility.")
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4177PrimaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f3;
        final Function3 function32;
        final Function2 function23;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        Function2 function24;
        int i8;
        long j7;
        float f4;
        Function3 function33;
        Modifier modifier4;
        long j8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1501129198);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryScrollableTabRow)N(selectedTabIndex,modifier,scrollState,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,tabs)1207@51361L397:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i11 = 256;
                        i4 |= i11;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i11 = 128;
                i4 |= i11;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 16384;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 8192;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1193@50744L21,1194@50810L21,1195@50874L19,1198@51044L198");
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        modifier4 = modifier2;
                        scrollState4 = scrollState2;
                        j8 = j4;
                        function24 = function2;
                        i8 = i4;
                        j7 = j3;
                        f4 = f2;
                        function33 = function3;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        }
                        if ((i3 & 8) != 0) {
                            j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                        }
                        if (i5 != 0) {
                            f2 = TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                        }
                        ComposableLambda rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(-1872002465, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit PrimaryScrollableTabRow_qhFBPw4$lambda$0;
                                PrimaryScrollableTabRow_qhFBPw4$lambda$0 = TabRowKt.PrimaryScrollableTabRow_qhFBPw4$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return PrimaryScrollableTabRow_qhFBPw4$lambda$0;
                            }
                        }, startRestartGroup, 54) : function3;
                        if (i7 != 0) {
                            long j9 = j3;
                            function33 = rememberComposableLambda;
                            modifier4 = modifier2;
                            f4 = f2;
                            long j10 = j4;
                            function24 = ComposableSingletons$TabRowKt.INSTANCE.m2844getLambda$306947391$material3();
                            i8 = i4;
                            scrollState4 = scrollState2;
                            j7 = j9;
                            j8 = j10;
                        } else {
                            scrollState4 = scrollState2;
                            long j11 = j4;
                            function24 = function2;
                            i8 = i4;
                            j7 = j3;
                            f4 = f2;
                            function33 = rememberComposableLambda;
                            modifier4 = modifier2;
                            j8 = j11;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1501129198, i8, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:1207)");
                    }
                    m4176PrimaryScrollableTabRowcx2KkNY(i, modifier4, scrollState4, j7, j8, f4, function33, function24, TabRowDefaults.INSTANCE.m4165getScrollableTabRowMinTabWidthD9Ej5fM(), function22, startRestartGroup, (i8 & 14) | 100663296 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | ((i8 << 3) & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    function32 = function33;
                    f3 = f4;
                    j6 = j8;
                    j5 = j7;
                    scrollState3 = scrollState4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    scrollState3 = scrollState2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    function32 = function3;
                    function23 = function2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PrimaryScrollableTabRow_qhFBPw4$lambda$1;
                            PrimaryScrollableTabRow_qhFBPw4$lambda$1 = TabRowKt.PrimaryScrollableTabRow_qhFBPw4$lambda$1(i, modifier3, scrollState3, j5, j6, f3, function32, function23, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return PrimaryScrollableTabRow_qhFBPw4$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryScrollableTabRow_qhFBPw4$lambda$0(int i, TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C1231@52324L121:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407893741, i2, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:1231)");
            }
            TabRowDefaults.INSTANCE.m4163SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for Binary Compatibility.")
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4183SecondaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f3;
        final Function3 function32;
        final Function2 function23;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        Function2 function24;
        int i8;
        long j7;
        float f4;
        Function3 function33;
        Modifier modifier4;
        long j8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-712886596);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecondaryScrollableTabRow)N(selectedTabIndex,modifier,scrollState,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,tabs)1238@52574L399:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i11 = 256;
                        i4 |= i11;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i11 = 128;
                i4 |= i11;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 16384;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 8192;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "1225@51991L21,1226@52057L23,1227@52123L21,1230@52295L160");
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        modifier4 = modifier2;
                        scrollState4 = scrollState2;
                        j8 = j4;
                        function24 = function2;
                        i8 = i4;
                        j7 = j3;
                        f4 = f2;
                        function33 = function3;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        }
                        if ((i3 & 8) != 0) {
                            j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                            j4 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                        }
                        if (i5 != 0) {
                            f2 = TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                        }
                        ComposableLambda rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(407893741, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit SecondaryScrollableTabRow_qhFBPw4$lambda$0;
                                SecondaryScrollableTabRow_qhFBPw4$lambda$0 = TabRowKt.SecondaryScrollableTabRow_qhFBPw4$lambda$0(i, (TabIndicatorScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return SecondaryScrollableTabRow_qhFBPw4$lambda$0;
                            }
                        }, startRestartGroup, 54) : function3;
                        if (i7 != 0) {
                            long j9 = j3;
                            function33 = rememberComposableLambda;
                            modifier4 = modifier2;
                            f4 = f2;
                            long j10 = j4;
                            function24 = ComposableSingletons$TabRowKt.INSTANCE.getLambda$1187266255$material3();
                            i8 = i4;
                            scrollState4 = scrollState2;
                            j7 = j9;
                            j8 = j10;
                        } else {
                            scrollState4 = scrollState2;
                            long j11 = j4;
                            function24 = function2;
                            i8 = i4;
                            j7 = j3;
                            f4 = f2;
                            function33 = rememberComposableLambda;
                            modifier4 = modifier2;
                            j8 = j11;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-712886596, i8, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:1238)");
                    }
                    m4182SecondaryScrollableTabRowcx2KkNY(i, modifier4, scrollState4, j7, j8, f4, function33, function24, TabRowDefaults.INSTANCE.m4165getScrollableTabRowMinTabWidthD9Ej5fM(), function22, startRestartGroup, (i8 & 14) | 100663296 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | ((i8 << 3) & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    function32 = function33;
                    f3 = f4;
                    j6 = j8;
                    j5 = j7;
                    scrollState3 = scrollState4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    scrollState3 = scrollState2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    function32 = function3;
                    function23 = function2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SecondaryScrollableTabRow_qhFBPw4$lambda$1;
                            SecondaryScrollableTabRow_qhFBPw4$lambda$1 = TabRowKt.SecondaryScrollableTabRow_qhFBPw4$lambda$1(i, modifier3, scrollState3, j5, j6, f3, function32, function23, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return SecondaryScrollableTabRow_qhFBPw4$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRow_pAZo6Ak$lambda$0(int i, List list, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "CN(tabPositions):TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(906699528, i2, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:1342)");
        }
        if (i < list.size()) {
            composer.startReplaceGroup(436390614);
            ComposerKt.sourceInformation(composer, "1343@57771L117");
            TabRowDefaults.INSTANCE.m4163SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, (TabPosition) list.get(i)), 0.0f, 0L, composer, 3072, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(436548218);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007b  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Replaced with PrimaryTabRow and SecondaryTabRow.", replaceWith = @ReplaceWith(expression = "SecondaryTabRow(selectedTabIndex, modifier, containerColor, contentColor, indicator, divider, tabs)", imports = {}))
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4185TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1445190381);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)N(selectedTabIndex,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)1351@58031L90:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((1572864 & i2) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1338@57490L21,1339@57554L19,1341@57666L246");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier3 = modifier;
                            function34 = function32;
                            function25 = function23;
                            i7 = 1445190381;
                            j8 = j3;
                            j9 = j4;
                        } else {
                            Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                i4 &= -7169;
                            } else {
                                j7 = j4;
                            }
                            ComposableLambda rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(906699528, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit TabRow_pAZo6Ak$lambda$0;
                                    TabRow_pAZo6Ak$lambda$0 = TabRowKt.TabRow_pAZo6Ak$lambda$0(i, (List) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return TabRow_pAZo6Ak$lambda$0;
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i6 != 0) {
                                modifier3 = companion;
                                j9 = j7;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = ComposableSingletons$TabRowKt.INSTANCE.m2842getLambda$1132537920$material3();
                                i7 = 1445190381;
                            } else {
                                modifier3 = companion;
                                j8 = j3;
                                function34 = rememberComposableLambda;
                                function25 = function23;
                                i7 = 1445190381;
                                j9 = j7;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                        }
                        composer2 = startRestartGroup;
                        m4187TabRowWithSubcomposeImplDTcfvLk(modifier3, j8, j9, function34, function25, function22, composer2, (i4 >> 3) & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j5 = j8;
                        j6 = j9;
                        function33 = function34;
                        function24 = function25;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        j6 = j4;
                        function33 = function32;
                        function24 = function23;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TabRow_pAZo6Ak$lambda$1;
                                TabRow_pAZo6Ak$lambda$1 = TabRowKt.TabRow_pAZo6Ak$lambda$1(i, modifier2, j5, j6, function33, function24, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TabRow_pAZo6Ak$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((1572864 & i2) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((1572864 & i2) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((1572864 & i2) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRow_sKfQg0A$lambda$0(int i, List list, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "CN(tabPositions)1409@61286L109:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-720441215, i2, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:1409)");
        }
        TabRowDefaults.INSTANCE.m4163SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, (TabPosition) list.get(i)), 0.0f, 0L, composer, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b7  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Replaced with PrimaryScrollableTabRow and SecondaryScrollableTabRow tab variants.", replaceWith = @ReplaceWith(expression = "SecondaryScrollableTabRow(selectedTabIndex, modifier, containerColor, contentColor, edgePadding, indicator, divider, tabs)", imports = {}))
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4179ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j5;
        final long j6;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope endRestartGroup;
        long j7;
        int i8;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> m2845getLambda$358046007$material3;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(847049916);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)N(selectedTabIndex,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,tabs)1425@61848L21,1416@61524L352:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 2048;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 1024;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1404@60994L21,1405@61058L19,1408@61241L164");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            i8 = i4;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            function34 = function32;
                            modifier2 = modifier;
                        } else {
                            Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                i4 &= -7169;
                            } else {
                                j7 = j4;
                            }
                            f3 = i5 != 0 ? TabRowDefaults.INSTANCE.m4164getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                            ComposableLambda rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(-720441215, true, new Function3() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit ScrollableTabRow_sKfQg0A$lambda$0;
                                    ScrollableTabRow_sKfQg0A$lambda$0 = TabRowKt.ScrollableTabRow_sKfQg0A$lambda$0(i, (List) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return ScrollableTabRow_sKfQg0A$lambda$0;
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i7 != 0) {
                                int i12 = i4;
                                modifier2 = companion;
                                function34 = rememberComposableLambda;
                                m2845getLambda$358046007$material3 = ComposableSingletons$TabRowKt.INSTANCE.m2845getLambda$358046007$material3();
                                i8 = i12;
                                long j8 = j3;
                                j6 = j7;
                                j5 = j8;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(847049916, i8, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:1415)");
                                }
                                int i13 = i8 << 3;
                                m4181ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function34, modifier2, j5, j6, f3, m2845getLambda$358046007$material3, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i8 & 14) | ((i8 >> 12) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752) | (3670016 & i8) | (i8 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function23 = m2845getLambda$358046007$material3;
                                function33 = function34;
                            } else {
                                long j9 = j3;
                                j6 = j7;
                                j5 = j9;
                                i8 = i4;
                                modifier2 = companion;
                                function34 = rememberComposableLambda;
                            }
                        }
                        m2845getLambda$358046007$material3 = function2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i8 << 3;
                        m4181ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function34, modifier2, j5, j6, f3, m2845getLambda$358046007$material3, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i8 & 14) | ((i8 >> 12) & 112) | (i132 & 896) | (i132 & 7168) | (57344 & i132) | (i132 & 458752) | (3670016 & i8) | (i8 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function23 = m2845getLambda$358046007$material3;
                        function33 = function34;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function23 = function2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        function33 = function32;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ScrollableTabRow_sKfQg0A$lambda$1;
                                ScrollableTabRow_sKfQg0A$lambda$1 = TabRowKt.ScrollableTabRow_sKfQg0A$lambda$1(i, modifier2, j5, j6, f3, function33, function23, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ScrollableTabRow_sKfQg0A$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3(List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, Ref.IntRef intRef, Constraints constraints, int i, final Function3 function3, final List list2, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i3), i3 * intRef.element, 0, 0.0f, 4, null);
        }
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, function2);
        int size2 = subcompose.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable mo8285measureBRTryo0 = subcompose.get(i4).mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 11, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, mo8285measureBRTryo0, 0, i - mo8285measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(1918742627, true, new Function2() { // from class: androidx.compose.material3.TabRowKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3$2;
                TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3$2 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3$2(Function3.this, list2, (Composer) obj, ((Integer) obj2).intValue());
                return TabRowWithSubcomposeImpl_DTcfvLk$lambda$0$0$0$3$2;
            }
        }));
        int size3 = subcompose2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i5).mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(i2, i)), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
