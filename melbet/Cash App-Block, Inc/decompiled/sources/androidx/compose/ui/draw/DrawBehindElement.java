package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/DrawBackgroundModifier;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawBehindElement extends ModifierNodeElement {
    public final Function1 onDraw;

    public DrawBehindElement(Function1 function1) {
        this.onDraw = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        DrawBackgroundModifier drawBackgroundModifier = new DrawBackgroundModifier();
        drawBackgroundModifier.onDraw = this.onDraw;
        return drawBackgroundModifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.onDraw == ((DrawBehindElement) obj).onDraw;
        }
        return false;
    }

    public final int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set(this.onDraw, "onDraw");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((DrawBackgroundModifier) node).onDraw = this.onDraw;
    }
}
