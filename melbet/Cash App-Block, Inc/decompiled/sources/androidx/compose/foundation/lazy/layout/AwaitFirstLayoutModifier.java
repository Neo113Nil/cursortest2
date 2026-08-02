package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import com.plaid.internal.EnumC0170g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "Node", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AwaitFirstLayoutModifier extends ModifierNodeElement {
    public Node attachedNode;
    public CompletableDeferredImpl lock;

    public final class Node extends Modifier.Node {
        public ThrottledCallbacks.Entry handle;

        public Node() {
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            AwaitFirstLayoutModifier awaitFirstLayoutModifier = AwaitFirstLayoutModifier.this;
            awaitFirstLayoutModifier.attachedNode = this;
            if (awaitFirstLayoutModifier.lock != null) {
                this.handle = RulerKt.registerOnLayoutRectChanged(this, new ClickableKt$$ExternalSyntheticLambda0(24, this, awaitFirstLayoutModifier));
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onDetach() {
            AwaitFirstLayoutModifier awaitFirstLayoutModifier = AwaitFirstLayoutModifier.this;
            if (awaitFirstLayoutModifier.attachedNode == this) {
                awaitFirstLayoutModifier.attachedNode = null;
            }
            ThrottledCallbacks.Entry entry = this.handle;
            if (entry != null) {
                entry.unregister();
            }
            this.handle = null;
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new Node();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "AwaitFirstLayoutModifier";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }

    public final Object waitForFirstLayout(ContinuationImpl continuationImpl) {
        CompletableDeferredImpl completableDeferredImpl = this.lock;
        if (completableDeferredImpl == null) {
            completableDeferredImpl = new CompletableDeferredImpl();
            this.lock = completableDeferredImpl;
            Node node = this.attachedNode;
            if (node != null && node.isAttached()) {
                node.handle = RulerKt.registerOnLayoutRectChanged(node, new ClickableKt$$ExternalSyntheticLambda0(24, node, AwaitFirstLayoutModifier.this));
            }
        }
        Object awaitInternal = completableDeferredImpl.awaitInternal(continuationImpl);
        return awaitInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitInternal : Unit.INSTANCE;
    }
}
