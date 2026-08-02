package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SkipToLookaheadSizeNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkipToLookaheadSizeElement extends ModifierNodeElement {
    public final Function0 isEnabled;
    public final ScaleToBoundsImpl scaleToBounds;

    public SkipToLookaheadSizeElement(ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new SkipToLookaheadSizeNode(this.scaleToBounds, this.isEnabled);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SkipToLookaheadSizeElement)) {
            return false;
        }
        SkipToLookaheadSizeElement skipToLookaheadSizeElement = (SkipToLookaheadSizeElement) obj;
        return skipToLookaheadSizeElement.isEnabled == this.isEnabled && Intrinsics.areEqual(skipToLookaheadSizeElement.scaleToBounds, this.scaleToBounds);
    }

    public final int hashCode() {
        int hashCode = this.isEnabled.hashCode() * 31;
        ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return hashCode + (scaleToBoundsImpl != null ? scaleToBoundsImpl.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "skipToLookahead";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.scaleToBounds, "scaleToBounds");
        linesSequence.set(this.isEnabled, "isEnabled");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SkipToLookaheadSizeNode skipToLookaheadSizeNode = (SkipToLookaheadSizeNode) node;
        skipToLookaheadSizeNode.scaleToBounds$delegate.setValue(this.scaleToBounds);
        skipToLookaheadSizeNode.isEnabled$delegate.setValue(this.isEnabled);
    }

    public /* synthetic */ SkipToLookaheadSizeElement(SharedTransitionScope$skipToLookaheadSize$1 sharedTransitionScope$skipToLookaheadSize$1) {
        this(null, sharedTransitionScope$skipToLookaheadSize$1);
    }
}
