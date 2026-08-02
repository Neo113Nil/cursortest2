package androidx.compose.ui.relocation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.NodeCoordinator;
import com.datadog.android.Datadog$getInstance$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public interface BringIntoViewModifierNode extends DelegatableNode {
    Object bringIntoView(NodeCoordinator nodeCoordinator, Datadog$getInstance$1$1 datadog$getInstance$1$1, ContinuationImpl continuationImpl);
}
