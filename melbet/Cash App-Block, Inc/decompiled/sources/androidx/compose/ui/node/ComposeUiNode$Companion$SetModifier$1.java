package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ComposeUiNode$Companion$SetModifier$1 extends Lambda implements Function2 {
    public static final ComposeUiNode$Companion$SetModifier$1 INSTANCE;
    public static final ComposeUiNode$Companion$SetModifier$1 INSTANCE$1;
    public static final ComposeUiNode$Companion$SetModifier$1 INSTANCE$2;
    public static final ComposeUiNode$Companion$SetModifier$1 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE$1 = new ComposeUiNode$Companion$SetModifier$1(i, 1);
        INSTANCE$2 = new ComposeUiNode$Companion$SetModifier$1(i, 2);
        INSTANCE = new ComposeUiNode$Companion$SetModifier$1(i, 0);
        INSTANCE$3 = new ComposeUiNode$Companion$SetModifier$1(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeUiNode$Companion$SetModifier$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.collection.MutableVector] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((LayoutNode) ((ComposeUiNode) obj)).setModifier((Modifier) obj2);
                break;
            case 1:
                ((Number) obj2).intValue();
                ((LayoutNode) ((ComposeUiNode) obj)).getClass();
                break;
            case 2:
                ((LayoutNode) ((ComposeUiNode) obj)).setMeasurePolicy((MeasurePolicy) obj2);
                break;
            default:
                CompositionLocalMap compositionLocalMap = (CompositionLocalMap) obj2;
                LayoutNode layoutNode = (LayoutNode) ((ComposeUiNode) obj);
                layoutNode.compositionLocalMap = compositionLocalMap;
                NodeChain nodeChain = layoutNode.nodes;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) compositionLocalMap;
                persistentCompositionLocalHashMap.getClass();
                layoutNode.setDensity((Density) Updater.read(persistentCompositionLocalHashMap, staticProvidableCompositionLocal));
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = (PersistentCompositionLocalHashMap) compositionLocalMap;
                LayoutDirection layoutDirection = (LayoutDirection) Updater.read(persistentCompositionLocalHashMap2, CompositionLocalsKt.LocalLayoutDirection);
                if (layoutNode.layoutDirection != layoutDirection) {
                    layoutNode.layoutDirection = layoutDirection;
                    layoutNode.invalidateMeasurements$ui();
                    LayoutNode parent$ui = layoutNode.getParent$ui();
                    if (parent$ui != null) {
                        parent$ui.invalidateLayer$ui();
                    } else {
                        Owner owner = layoutNode.owner;
                        if (owner != null) {
                            ((AndroidComposeView) owner).invalidate();
                        }
                    }
                    layoutNode.invalidateLayers$ui();
                    for (Modifier.Node node = (Modifier.Node) nodeChain.head; node != null; node = node.getChild$ui()) {
                        node.onLayoutDirectionChange();
                    }
                }
                layoutNode.setViewConfiguration((ViewConfiguration) Updater.read(persistentCompositionLocalHashMap2, CompositionLocalsKt.LocalViewConfiguration));
                if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 32768) != 0) {
                    for (Modifier.Node node2 = (Modifier.Node) nodeChain.head; node2 != null; node2 = node2.getChild$ui()) {
                        if ((node2.getKindSet$ui() & 32768) != 0) {
                            DelegatingNode delegatingNode = node2;
                            ?? r1 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                                    Modifier.Node node3 = ((Modifier.Node) ((CompositionLocalConsumerModifierNode) delegatingNode)).getNode();
                                    if (node3.isAttached()) {
                                        NodeKindKt.autoInvalidateUpdatedNode(node3);
                                    } else {
                                        node3.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                                    }
                                } else if ((delegatingNode.getKindSet$ui() & 32768) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node4 = delegatingNode.delegate;
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    r1 = r1;
                                    while (node4 != null) {
                                        if ((node4.getKindSet$ui() & 32768) != 0) {
                                            i++;
                                            r1 = r1;
                                            if (i == 1) {
                                                delegatingNode = node4;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r1.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r1.add(node4);
                                            }
                                        }
                                        node4 = node4.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r1 = r1;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r1);
                            }
                        }
                        if ((node2.getAggregateChildKindSet$ui() & 32768) != 0) {
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
