package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.glance.layout.ColumnKt$Column$4;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public abstract class SharedTransitionScopeKt {
    public static final SpringSpec DefaultSpring = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, VisibilityThresholdsKt.RectVisibilityThreshold, 1);
    public static final SharedTransitionScopeKt$ParentClip$1 ParentClip = new SharedTransitionScopeKt$ParentClip$1();
    public static final MutableScatterMap cachedScaleToBoundsImplMap = new MutableScatterMap();

    public static final void SharedTransitionLayout(final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(646379026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            SharedTransitionScope(Expect_jvmKt.rememberComposableLambda(1948801580, new Function4() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i5;
                    SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj;
                    Modifier modifier2 = (Modifier) obj2;
                    Composer composer2 = (Composer) obj3;
                    int intValue = ((Number) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i5 = (((GapComposer) composer2).changed(sharedTransitionScope) ? 4 : 2) | intValue;
                    } else {
                        i5 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i5 |= ((GapComposer) composer2).changed(modifier2) ? 32 : 16;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                        Modifier then = Modifier.this.then(modifier2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        composableLambdaImpl.invoke(sharedTransitionScope, gapComposer2, Integer.valueOf(i5 & 14));
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ColumnKt$Column$4(modifier2, composableLambdaImpl, i, i2, 1);
        }
    }

    public static final void SharedTransitionScope(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1908320054);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ValueInsets.LookaheadScope(Expect_jvmKt.rememberComposableLambda(2062852661, new AnimatedContentKt$AnimatedContent$6$1$1$1(composableLambdaImpl, i2), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LookaheadScopeKt$LookaheadScope$4(i, i2, composableLambdaImpl);
        }
    }
}
