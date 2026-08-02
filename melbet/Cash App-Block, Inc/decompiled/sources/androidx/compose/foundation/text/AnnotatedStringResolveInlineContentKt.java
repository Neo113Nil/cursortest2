package androidx.compose.foundation.text;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.molecule.PlatformKt;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public abstract class AnnotatedStringResolveInlineContentKt {
    public static final Pair EmptyInlineContent;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptyInlineContent = new Pair(emptyList, emptyList);
    }

    public static final void InlineChildren(AnnotatedString annotatedString, List list, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1794596951);
        int i2 = (i & 6) == 0 ? (gapComposer.changed(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                Function3 function3 = (Function3) range.item;
                int i4 = range.start;
                int i5 = range.end;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                function3.invoke(annotatedString.subSequence(i4, i5).text, gapComposer, 0);
                gapComposer.end(true);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(annotatedString, list, i, 5);
        }
    }
}
