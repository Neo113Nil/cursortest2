package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, TextContextMenuDataProvider {
    public Function1 computeContentBounds;
    public Function1 onHide;
    public Function1 onShow;
    public ToolbarRequesterImpl requester;
    public StandaloneCoroutine textToolbarJob;
    public final DerivedSnapshotState derivedData$delegate = Updater.derivedStateOf(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 8));
    public Rect previousContentBounds = Rect.Zero;

    public TextContextMenuToolbarHandlerNode(ToolbarRequesterImpl toolbarRequesterImpl, Function1 function1, Function1 function12, Function1 function13) {
        this.requester = toolbarRequesterImpl;
        this.onShow = function1;
        this.onHide = function12;
        this.computeContentBounds = function13;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public final Rect contentBounds(LayoutCoordinates layoutCoordinates) {
        Rect rect;
        if (isAttached() && (rect = (Rect) this.computeContentBounds.invoke(layoutCoordinates)) != null) {
            this.previousContentBounds = rect;
            return rect;
        }
        return this.previousContentBounds;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public final TextContextMenuData data() {
        return (TextContextMenuData) this.derivedData$delegate.getValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        ToolbarRequesterImpl toolbarRequesterImpl = this.requester;
        toolbarRequesterImpl.toolbarHandlerState = ToolbarHandlerState.Attached;
        toolbarRequesterImpl.toolbarHandlerNode = this;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        ToolbarRequesterImpl toolbarRequesterImpl = this.requester;
        toolbarRequesterImpl.toolbarHandlerState = ToolbarHandlerState.Detached;
        toolbarRequesterImpl.toolbarHandlerNode = null;
        super.onDetach();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    /* renamed from: position-tuRUvjQ */
    public final long mo375positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
        return contentBounds(layoutCoordinates).m636getTopLeftF1C5BW0();
    }
}
