package androidx.compose.foundation.gestures;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/Draggable2DNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Draggable2DElement extends ModifierNodeElement {
    public static final BorderKt$$ExternalSyntheticLambda1 CanDrag = new BorderKt$$ExternalSyntheticLambda1(23);
    public final Recorder.AnonymousClass3 state;

    public Draggable2DElement(Recorder.AnonymousClass3 anonymousClass3) {
        this.state = anonymousClass3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = Draggable2DKt.NoOpOnDragStart;
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda12 = Draggable2DKt.NoOpOnDragStop;
        Draggable2DNode draggable2DNode = new Draggable2DNode(CanDrag, true, null, null);
        draggable2DNode.state = this.state;
        draggable2DNode.onDragStarted = borderKt$$ExternalSyntheticLambda1;
        draggable2DNode.onDragStopped = borderKt$$ExternalSyntheticLambda12;
        return draggable2DNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Draggable2DElement.class == obj.getClass() && this.state == ((Draggable2DElement) obj).state;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((Draggable2DKt.NoOpOnDragStop.hashCode() + ((Draggable2DKt.NoOpOnDragStart.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.state.hashCode() * 31, 961, true), 31, false)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "draggable2D";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(Boolean.TRUE, "enabled");
        linesSequence.set(null, "interactionSource");
        Boolean bool = Boolean.FALSE;
        linesSequence.set(bool, "startDragImmediately");
        linesSequence.set(Draggable2DKt.NoOpOnDragStart, "onDragStarted");
        linesSequence.set(Draggable2DKt.NoOpOnDragStop, "onDragStopped");
        linesSequence.set(bool, "reverseDirection");
        linesSequence.set(this.state, "state");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z;
        Draggable2DNode draggable2DNode = (Draggable2DNode) node;
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda1 = Draggable2DKt.NoOpOnDragStart;
        BorderKt$$ExternalSyntheticLambda1 borderKt$$ExternalSyntheticLambda12 = Draggable2DKt.NoOpOnDragStop;
        Recorder.AnonymousClass3 anonymousClass3 = draggable2DNode.state;
        Recorder.AnonymousClass3 anonymousClass32 = this.state;
        if (Intrinsics.areEqual(anonymousClass3, anonymousClass32)) {
            z = false;
        } else {
            draggable2DNode.state = anonymousClass32;
            z = true;
        }
        boolean z2 = z;
        draggable2DNode.onDragStarted = borderKt$$ExternalSyntheticLambda1;
        draggable2DNode.onDragStopped = borderKt$$ExternalSyntheticLambda12;
        draggable2DNode.update(CanDrag, true, null, null, z2);
    }
}
