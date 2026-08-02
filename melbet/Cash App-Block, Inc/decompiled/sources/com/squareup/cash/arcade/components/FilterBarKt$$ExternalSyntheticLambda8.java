package com.squareup.cash.arcade.components;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class FilterBarKt$$ExternalSyntheticLambda8 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ FilterBarKt$$ExternalSyntheticLambda8(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                obj2.getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, Modifier.Companion.$$INSTANCE);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
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
                Updater.m576setimpl(composer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke(RowScopeInstance.INSTANCE, obj2, composer, Integer.valueOf((intValue & 112) | 6));
                gapComposer2.end(true);
                return Unit.INSTANCE;
            default:
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                ((Integer) obj2).getClass();
                Composer composer2 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(lazyGridItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 131) != 130)) {
                    composableLambdaImpl.invoke(lazyGridItemScopeImpl, gapComposer3, Integer.valueOf(intValue2 & 14));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
