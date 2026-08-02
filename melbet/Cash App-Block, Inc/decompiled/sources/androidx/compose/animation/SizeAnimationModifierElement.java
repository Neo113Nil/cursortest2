package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SizeAnimationModifierElement extends ModifierNodeElement {
    public final FiniteAnimationSpec animationSpec;

    public SizeAnimationModifierElement(FiniteAnimationSpec finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new SizeAnimationModifierNode(this.animationSpec);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SizeAnimationModifierElement) || !Intrinsics.areEqual(((SizeAnimationModifierElement) obj).animationSpec, this.animationSpec)) {
            return false;
        }
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        return biasAlignment.equals(biasAlignment);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.animationSpec.hashCode() * 31)) * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "animateContentSize";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.animationSpec, "animationSpec");
        linesSequence.set(Alignment.Companion.TopStart, "alignment");
        linesSequence.set(null, "finishedListener");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((SizeAnimationModifierNode) node).animationSpec = this.animationSpec;
    }
}
