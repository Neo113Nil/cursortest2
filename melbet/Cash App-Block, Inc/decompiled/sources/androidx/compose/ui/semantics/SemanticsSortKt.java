package androidx.compose.ui.semantics;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;

/* loaded from: classes3.dex */
public abstract class SemanticsSortKt {
    public static final SemanticsSortKt$UnmergedConfigComparator$1 UnmergedConfigComparator;
    public static final Comparator[] semanticComparators;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(i == 0 ? LtrBoundsComparator.INSTANCE$1 : LtrBoundsComparator.INSTANCE), 4);
            i++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = SemanticsSortKt$UnmergedConfigComparator$1.INSTANCE;
    }

    public static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList arrayList, BoundsAnimation$animate$1 boundsAnimation$animate$1, BoundsAnimation$animate$1 boundsAnimation$animate$12, MutableIntObjectMap mutableIntObjectMap) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        Object obj = semanticsConfiguration.props.get(SemanticsProperties.IsTraversalGroup);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if ((booleanValue || ((Boolean) boundsAnimation$animate$12.invoke(semanticsNode)).booleanValue()) && ((Boolean) boundsAnimation$animate$1.invoke(semanticsNode)).booleanValue()) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            mutableIntObjectMap.set(semanticsNode.id, subtreeSortedByGeometryGrouping(semanticsNode, boundsAnimation$animate$1, boundsAnimation$animate$12, SemanticsNode.getChildren$ui$default(semanticsNode, false, 7)));
            return;
        }
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 7);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch((SemanticsNode) children$ui$default.get(i), arrayList, boundsAnimation$animate$1, boundsAnimation$animate$12, mutableIntObjectMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[LOOP:1: B:11:0x0049->B:29:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8 A[EDGE_INSN: B:30:0x00f8->B:31:0x00f8 BREAK  A[LOOP:1: B:11:0x0049->B:29:0x00f0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList subtreeSortedByGeometryGrouping(SemanticsNode semanticsNode, BoundsAnimation$animate$1 boundsAnimation$animate$1, BoundsAnimation$animate$1 boundsAnimation$animate$12, List list) {
        int i;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch((SemanticsNode) list.get(i2), arrayList, boundsAnimation$animate$1, boundsAnimation$animate$12, mutableIntObjectMap2);
        }
        int i3 = 1;
        char c = semanticsNode.layoutNode.layoutDirection == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                SemanticsNode semanticsNode2 = (SemanticsNode) arrayList.get(i4);
                if (i4 != 0) {
                    float f = semanticsNode2.getBoundsInWindow().top;
                    float f2 = semanticsNode2.getBoundsInWindow().bottom;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            Rect rect = (Rect) ((Pair) arrayList2.get(i6)).first;
                            float f3 = rect.top;
                            i = i3;
                            float f4 = rect.bottom;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new Pair(new Rect(Math.max(rect.left, RecyclerView.DECELERATION_RATE), Math.max(rect.top, f), Math.min(rect.right, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).second));
                                ((List) ((Pair) arrayList2.get(i6)).second).add(semanticsNode2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new Pair(semanticsNode2.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(semanticsNode2)));
                if (i4 != size2) {
                }
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, LtrBoundsComparator.INSTANCE$2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = semanticComparators[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            CollectionsKt__MutableCollectionsJVMKt.sortWith((List) pair.second, comparator);
            arrayList3.addAll((Collection) pair.second);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, new VideoCapture$$ExternalSyntheticLambda6(UnmergedConfigComparator, 4));
        int i9 = 0;
        while (i9 <= arrayList3.size() - 1) {
            List list2 = (List) mutableIntObjectMap2.get(((SemanticsNode) arrayList3.get(i9)).id);
            if (list2 != null) {
                if (((Boolean) boundsAnimation$animate$12.invoke(arrayList3.get(i9))).booleanValue()) {
                    i9++;
                } else {
                    arrayList3.remove(i9);
                }
                arrayList3.addAll(i9, list2);
                i9 += list2.size();
            } else {
                i9++;
            }
        }
        return arrayList3;
    }
}
