package com.datadog.android;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNodeImpl;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.viewinterop.FocusTargetInteropNode;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.lifecycle.Lifecycle;
import androidx.room.util.DBUtil;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import coil3.memory.MemoryCacheService;
import com.bugsnag.android.ConfigInternal;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.LinesIterator;

/* loaded from: classes.dex */
public final class Datadog$getInstance$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $sdkInstanceName;
    public final /* synthetic */ Object $stackCapture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Datadog$getInstance$1$1(Context context, String str) {
        super(0);
        this.$r8$classId = 7;
        this.$stackCapture = context;
        this.$sdkInstanceName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.collection.MutableVector] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterable iterable;
        Rect rect;
        int i = this.$r8$classId;
        Object obj = this.$stackCapture;
        Object obj2 = this.$sdkInstanceName;
        switch (i) {
            case 0:
                Locale locale = Locale.US;
                String str = (String) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                String loggableStackTrace = MapUtilsKt.loggableStackTrace(th);
                loggableStackTrace.getClass();
                LinesIterator linesIterator = new LinesIterator(loggableStackTrace);
                if (linesIterator.hasNext()) {
                    Object next = linesIterator.next();
                    if (linesIterator.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (linesIterator.hasNext()) {
                            arrayList.add(linesIterator.next());
                        }
                        iterable = arrayList;
                    } else {
                        iterable = CollectionsKt__CollectionsJVMKt.listOf(next);
                    }
                } else {
                    iterable = EmptyList.INSTANCE;
                }
                return String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{str, CollectionsKt.joinToString$default(CollectionsKt.drop(iterable, 1), "\n", null, null, 0, null, null, 62)}, 2));
            case 1:
                ((CacheDrawModifierNodeImpl) obj2).block.invoke((CacheDrawScope) obj);
                return Unit.INSTANCE;
            case 2:
                NodeChain nodeChain = ((LayoutNode) obj2).nodes;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 8) != 0) {
                    for (Modifier.Node node = (TailModifierNode) nodeChain.tail; node != null; node = node.getParent$ui()) {
                        if ((node.getKindSet$ui() & 8) != 0) {
                            DelegatingNode delegatingNode = node;
                            ?? r5 = 0;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                                    if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                        ref$ObjectRef.element = semanticsConfiguration;
                                        semanticsConfiguration.isClearingSemantics = true;
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        ((SemanticsConfiguration) ref$ObjectRef.element).isMergingSemanticsOfDescendants = true;
                                    }
                                    semanticsModifierNode.applySemantics((SemanticsPropertyReceiver) ref$ObjectRef.element);
                                } else if ((delegatingNode.getKindSet$ui() & 8) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNode.delegate;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                    while (node2 != null) {
                                        if ((node2.getKindSet$ui() & 8) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                delegatingNode = node2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r5.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r5.add(node2);
                                            }
                                        }
                                        node2 = node2.getChild$ui();
                                        delegatingNode = delegatingNode;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DepthSortedSetKt.access$pop(r5);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
                ((Function1) obj2).invoke(reusableGraphicsLayerScope);
                NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
                boolean areEqual = Intrinsics.areEqual(nodeCoordinator.lastShape, reusableGraphicsLayerScope.shape);
                boolean z = nodeCoordinator.lastClip;
                boolean z2 = reusableGraphicsLayerScope.clip;
                boolean z3 = z != z2;
                if (!areEqual || z3) {
                    nodeCoordinator.lastShape = reusableGraphicsLayerScope.shape;
                    nodeCoordinator.lastClip = z2;
                    if (nodeCoordinator.wasLayerBlockInvoked && (z3 || (z2 && !areEqual))) {
                        nodeCoordinator.layoutNode.invalidateSemantics$ui();
                    }
                }
                nodeCoordinator.wasLayerBlockInvoked = true;
                reusableGraphicsLayerScope.outline = reusableGraphicsLayerScope.shape.mo175createOutlinePq9zytI(reusableGraphicsLayerScope.size, reusableGraphicsLayerScope.layoutDirection, reusableGraphicsLayerScope.graphicsDensity);
                return Unit.INSTANCE;
            case 4:
                ((Lifecycle) obj2).removeObserver((SavedStateRegistryImpl$$ExternalSyntheticLambda0) obj);
                return Unit.INSTANCE;
            case 5:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (rect = (Rect) function0.invoke()) != null) {
                    return rect;
                }
                NodeCoordinator nodeCoordinator2 = (NodeCoordinator) obj;
                if (!nodeCoordinator2.isAttached()) {
                    nodeCoordinator2 = null;
                }
                if (nodeCoordinator2 != null) {
                    return DBUtil.m1180Recttz77jQw(0L, Countries.m3991toSizeozmzZPI(nodeCoordinator2.measuredSize));
                }
                return null;
            case 6:
                ((Ref$ObjectRef) obj2).element = DepthSortedSetKt.currentValueOf((FocusTargetInteropNode) obj, PinnableContainerKt.LocalPinnableContainer);
                return Unit.INSTANCE;
            case 7:
                SharedPreferences sharedPreferences = ((Context) obj).getSharedPreferences((String) obj2, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 8:
                Context context = (Context) obj2;
                context.getClass();
                return DBUtil.preferencesDataStoreFile(context, ((PreferenceDataStoreSingletonDelegate) obj).name);
            default:
                ((ConfigInternal) ((MemoryCacheService) obj2).imageLoader).getClass();
                return ((Context) obj).getCacheDir();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Datadog$getInstance$1$1(int i, Object obj, Object obj2) {
        super(0);
        this.$r8$classId = i;
        this.$sdkInstanceName = obj;
        this.$stackCapture = obj2;
    }
}
