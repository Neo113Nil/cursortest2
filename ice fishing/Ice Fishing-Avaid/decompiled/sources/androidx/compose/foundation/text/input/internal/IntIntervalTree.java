package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntList;
import androidx.collection.MutableLongList;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntIntervalTree.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\b\u0001\u0018\u0000 }*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001}B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010'\u001a\u00020\n*\u00020\n¢\u0006\u0004\b(\u0010\fJ\u0011\u0010)\u001a\u00020\n*\u00020\n¢\u0006\u0004\b*\u0010\fJ!\u0010+\u001a\u00020,*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J3\u0010/\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u00101Jc\u0010G\u001a\u00020H2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072K\u0010I\u001aG\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020H0JJS\u0010M\u001a\u00020H2K\u0010I\u001aG\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020H0JJ\u0006\u0010N\u001a\u00020HJ\b\u0010O\u001a\u00020HH\u0002J/\u0010P\u001a\u00020H2\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020H0QH\u0082\bJ/\u0010R\u001a\u00020H2\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020H0QH\u0082\bJ-\u0010S\u001a\u00020H2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070QH\u0086\bJ#\u0010U\u001a\u00020,2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010VJ#\u0010W\u001a\u00020,2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010VJ'\u0010X\u001a\u00020\n2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020\n2\b\b\u0002\u0010]\u001a\u00020,H\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020H2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010a\u001a\u00020\nH\u0002¢\u0006\u0004\bb\u0010\u000eJ\u001f\u0010c\u001a\u00020H2\u0006\u0010d\u001a\u00020\n2\u0006\u0010]\u001a\u00020,H\u0002¢\u0006\u0004\be\u0010_J\b\u0010f\u001a\u00020HH\u0002J\u001f\u0010g\u001a\u00020H2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010h\u001a\u00020\nH\u0002¢\u0006\u0004\bi\u0010\u000eJ\u0017\u0010j\u001a\u00020H2\u0006\u0010\\\u001a\u00020\nH\u0002¢\u0006\u0004\bk\u0010=J\u0017\u0010l\u001a\u00020H2\u0006\u0010d\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010=J\u0017\u0010n\u001a\u00020H2\u0006\u0010d\u001a\u00020\nH\u0002¢\u0006\u0004\bo\u0010=J\u0017\u0010p\u001a\u00020H2\u0006\u0010d\u001a\u00020\nH\u0002¢\u0006\u0004\bq\u0010=J\u0013\u0010r\u001a\u00020,2\b\u0010s\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010t\u001a\u00020\u0007H\u0016J\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0006\u0010v\u001a\u00020,J\u001d\u0010w\u001a\u00020H*\u00060Bj\u0002`C2\u0006\u0010d\u001a\u00020\n¢\u0006\u0004\bx\u0010yJ\u0015\u0010z\u001a\u00020\n*\u00060Bj\u0002`C¢\u0006\u0004\b{\u0010|R0\u0010\t\u001a\u00060\u0007j\u0002`\b*\u00020\n2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u0006\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\u0006\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR(\u0010\u0015\u001a\u00020\n*\u00020\n2\u0006\u0010\u0006\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR(\u0010\u0018\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR(\u0010\u001b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR(\u0010\u001e\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR(\u0010!\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u0004\u0018\u00018\u0000*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u000003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b;\u00108\"\u0004\b<\u0010=R\u0013\u0010?\u001a\u00020\n¢\u0006\n\n\u0002\u0010>\u001a\u0004\b@\u00108R\u0016\u0010A\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010D\u001a\u00060Bj\u0002`C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006~"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IntIntervalTree;", "T", "", "source", "<init>", "(Landroidx/compose/foundation/text/input/internal/IntIntervalTree;)V", "value", "", "Landroidx/compose/foundation/text/input/internal/TreeColor;", "color", "Landroidx/compose/foundation/text/input/internal/Node;", "getColor-330cO7A", "(I)I", "setColor-9hnwElY", "(II)V", "parent", "getParent-bLpG9ms", "setParent-cfX_BQo", "left", "getLeft-bLpG9ms", "setLeft-cfX_BQo", "right", "getRight-bLpG9ms", "setRight-cfX_BQo", "start", "getStart-330cO7A", "setStart-9hnwElY", "end", "getEnd-330cO7A", "setEnd-9hnwElY", "min", "getMin-330cO7A", "setMin-9hnwElY", "max", "getMax-330cO7A", "setMax-9hnwElY", "item", "getItem-330cO7A", "(I)Ljava/lang/Object;", "lowestNode", "lowestNode-bLpG9ms", "next", "next-bLpG9ms", "overlaps", "", "overlaps-XzpGiIY", "(III)Z", "Node", "Node-l-p996k", "(IILjava/lang/Object;I)I", "items", "", "nodeInfo", "Landroidx/collection/MutableLongList;", "totalNodeCount", "getTotalNodeCount", "()I", "deletedNodeCount", "root", "getRoot-27flxzM", "setRoot-330cO7A", "(I)V", "I", "terminator", "getTerminator-27flxzM", "_tempArray", "Landroidx/collection/MutableIntList;", "Landroidx/compose/foundation/text/input/internal/NodeList;", "tempArray", "getTempArray", "()Landroidx/collection/MutableIntList;", "forEachIntervalInRange", "", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forAllIntervals", "clear", "cleanDeletedNodes", "forEachNodeInRange", "Lkotlin/Function1;", "forEachNodeMinMaxInRange", "mapIntervals", "mapper", "addInterval", "(Ljava/lang/Object;II)Z", "removeInterval", "findNode", "findNode-cKdZwxc", "(Ljava/lang/Object;II)I", "removeNode", "target", "cleanUp", "removeNode-9hnwElY", "(IZ)V", "transplant", "replacement", "transplant-cfX_BQo", "deleteNode", "node", "deleteNode-9hnwElY", "cleanDeletedNodesIfNeeded", "rebalanceAfterDeletion", "targetParent", "rebalanceAfterDeletion-cfX_BQo", "rebalanceAfterInsertion", "rebalanceAfterInsertion-330cO7A", "rotateLeft", "rotateLeft-330cO7A", "rotateRight", "rotateRight-330cO7A", "updateNodeMinMax", "updateNodeMinMax-330cO7A", "equals", "other", "hashCode", "copy", "isEmpty", "add", "add-ZlWbn38", "(Landroidx/collection/MutableIntList;I)V", "pop", "pop-2SV_EgM", "(Landroidx/collection/MutableIntList;)I", "Companion", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class IntIntervalTree<T> {
    private static final int COLOR_PARENT = 0;
    private static final int LEFT_RIGHT = 1;
    private static final int MIN_MAX = 3;
    private static final int NODE_CLEANUP_SIZE_THRESHOLD = 64;
    private static final int START_END = 2;
    private static final int STRIDE = 4;
    private MutableIntList _tempArray;
    private int deletedNodeCount;
    private final List<T> items;
    private final MutableLongList nodeInfo;
    private int root;
    private final int terminator;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public IntIntervalTree() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public IntIntervalTree(IntIntervalTree<T> intIntervalTree) {
        if (intIntervalTree != null) {
            this.items = CollectionsKt.toMutableList((Collection) intIntervalTree.items);
            MutableLongList mutableLongList = new MutableLongList(intIntervalTree.nodeInfo._size);
            mutableLongList.addAll(mutableLongList._size, intIntervalTree.nodeInfo);
            this.nodeInfo = mutableLongList;
            this.terminator = intIntervalTree.terminator;
            this.root = intIntervalTree.root;
            this.deletedNodeCount = intIntervalTree.deletedNodeCount;
            return;
        }
        this.items = new ArrayList();
        this.nodeInfo = new MutableLongList(0, 1, null);
        int m2057Nodelp996k = m2057Nodelp996k(Integer.MAX_VALUE, Integer.MIN_VALUE, null, 1);
        this.terminator = m2057Nodelp996k;
        this.root = m2057Nodelp996k;
        this.deletedNodeCount = 0;
    }

    public /* synthetic */ IntIntervalTree(IntIntervalTree intIntervalTree, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : intIntervalTree);
    }

    /* renamed from: getColor-330cO7A, reason: not valid java name */
    public final int m2072getColor330cO7A(int i) {
        return (int) (this.nodeInfo.get(i) >> 32);
    }

    /* renamed from: setColor-9hnwElY, reason: not valid java name */
    public final void m2086setColor9hnwElY(int i, int i2) {
        this.nodeInfo.set(i, (((int) (r0.get(i) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    /* renamed from: getParent-bLpG9ms, reason: not valid java name */
    public final int m2077getParentbLpG9ms(int i) {
        return Node.m2099constructorimpl((int) (this.nodeInfo.get(i) & 4294967295L));
    }

    /* renamed from: setParent-cfX_BQo, reason: not valid java name */
    public final void m2091setParentcfX_BQo(int i, int i2) {
        this.nodeInfo.set(i, (((int) (r0.get(i) >> 32)) << 32) | (i2 & 4294967295L));
    }

    /* renamed from: getLeft-bLpG9ms, reason: not valid java name */
    public final int m2074getLeftbLpG9ms(int i) {
        return Node.m2099constructorimpl((int) (this.nodeInfo.get(i + 1) >> 32));
    }

    /* renamed from: setLeft-cfX_BQo, reason: not valid java name */
    public final void m2088setLeftcfX_BQo(int i, int i2) {
        this.nodeInfo.set(i + 1, (((int) (r0.get(r8) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    /* renamed from: getRight-bLpG9ms, reason: not valid java name */
    public final int m2078getRightbLpG9ms(int i) {
        return Node.m2099constructorimpl((int) (this.nodeInfo.get(i + 1) & 4294967295L));
    }

    /* renamed from: setRight-cfX_BQo, reason: not valid java name */
    public final void m2092setRightcfX_BQo(int i, int i2) {
        this.nodeInfo.set(i + 1, (((int) (r0.get(r8) >> 32)) << 32) | (i2 & 4294967295L));
    }

    /* renamed from: getStart-330cO7A, reason: not valid java name */
    public final int m2080getStart330cO7A(int i) {
        return (int) (this.nodeInfo.get(i + 2) >> 32);
    }

    /* renamed from: setStart-9hnwElY, reason: not valid java name */
    public final void m2094setStart9hnwElY(int i, int i2) {
        this.nodeInfo.set(i + 2, (((int) (r0.get(r8) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    /* renamed from: getEnd-330cO7A, reason: not valid java name */
    public final int m2073getEnd330cO7A(int i) {
        return (int) (this.nodeInfo.get(i + 2) & 4294967295L);
    }

    /* renamed from: setEnd-9hnwElY, reason: not valid java name */
    public final void m2087setEnd9hnwElY(int i, int i2) {
        this.nodeInfo.set(i + 2, (((int) (r0.get(r8) >> 32)) << 32) | (i2 & 4294967295L));
    }

    /* renamed from: getMin-330cO7A, reason: not valid java name */
    public final int m2076getMin330cO7A(int i) {
        return (int) (this.nodeInfo.get(i + 3) >> 32);
    }

    /* renamed from: setMin-9hnwElY, reason: not valid java name */
    public final void m2090setMin9hnwElY(int i, int i2) {
        this.nodeInfo.set(i + 3, (((int) (r0.get(r8) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    /* renamed from: getMax-330cO7A, reason: not valid java name */
    public final int m2075getMax330cO7A(int i) {
        return (int) (this.nodeInfo.get(i + 3) & 4294967295L);
    }

    /* renamed from: setMax-9hnwElY, reason: not valid java name */
    public final void m2089setMax9hnwElY(int i, int i2) {
        this.nodeInfo.set(i + 3, (((int) (r0.get(r8) >> 32)) << 32) | (i2 & 4294967295L));
    }

    /* renamed from: getItem-330cO7A, reason: not valid java name */
    private final T m2062getItem330cO7A(int i) {
        return this.items.get(i / 4);
    }

    /* renamed from: lowestNode-bLpG9ms, reason: not valid java name */
    public final int m2082lowestNodebLpG9ms(int i) {
        while (!Node.m2101equalsimpl0(m2074getLeftbLpG9ms(i), this.terminator)) {
            i = m2074getLeftbLpG9ms(i);
        }
        return i;
    }

    /* renamed from: next-bLpG9ms, reason: not valid java name */
    public final int m2083nextbLpG9ms(int i) {
        if (!Node.m2101equalsimpl0(m2078getRightbLpG9ms(i), this.terminator)) {
            return m2082lowestNodebLpG9ms(m2078getRightbLpG9ms(i));
        }
        int m2077getParentbLpG9ms = m2077getParentbLpG9ms(i);
        while (true) {
            int i2 = m2077getParentbLpG9ms;
            int i3 = i;
            i = i2;
            if (Node.m2101equalsimpl0(i, this.terminator) || !Node.m2101equalsimpl0(i3, m2078getRightbLpG9ms(i))) {
                break;
            }
            m2077getParentbLpG9ms = m2077getParentbLpG9ms(i);
        }
        return i;
    }

    /* renamed from: overlaps-XzpGiIY, reason: not valid java name */
    public final boolean m2084overlapsXzpGiIY(int i, int i2, int i3) {
        return IntIntervalTreeKt.intersect(i2, i3, m2080getStart330cO7A(i), m2073getEnd330cO7A(i));
    }

    /* renamed from: Node-l-p996k$default, reason: not valid java name */
    static /* synthetic */ int m2058Nodelp996k$default(IntIntervalTree intIntervalTree, int i, int i2, Object obj, int i3, int i4, Object obj2) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return intIntervalTree.m2057Nodelp996k(i, i2, obj, i3);
    }

    /* renamed from: Node-l-p996k, reason: not valid java name */
    private final int m2057Nodelp996k(int start, int end, T item, int color) {
        int i = this.nodeInfo._size;
        this.nodeInfo.add((color << 32) | (0 & 4294967295L));
        this.nodeInfo.add(0L);
        long j = (end & 4294967295L) | (start << 32);
        this.nodeInfo.add(j);
        this.nodeInfo.add(j);
        this.items.add(item);
        return Node.m2099constructorimpl(i);
    }

    private final int getTotalNodeCount() {
        return this.nodeInfo._size / 4;
    }

    /* renamed from: getRoot-27flxzM, reason: not valid java name and from getter */
    public final int getRoot() {
        return this.root;
    }

    /* renamed from: setRoot-330cO7A, reason: not valid java name */
    public final void m2093setRoot330cO7A(int i) {
        this.root = i;
    }

    /* renamed from: getTerminator-27flxzM, reason: not valid java name and from getter */
    public final int getTerminator() {
        return this.terminator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableIntList getTempArray() {
        MutableIntList mutableIntList = this._tempArray;
        if (mutableIntList != null) {
            return mutableIntList;
        }
        MutableIntList mutableIntList2 = new MutableIntList(0, 1, null);
        this._tempArray = mutableIntList2;
        return mutableIntList2;
    }

    public final void forEachIntervalInRange(int start, int end, Function3<? super T, ? super Integer, ? super Integer, Unit> block) {
        MutableIntList tempArray = getTempArray();
        if (!Node.m2101equalsimpl0(getRoot(), getTerminator()) && m2075getMax330cO7A(getRoot()) >= start && m2076getMin330cO7A(getRoot()) <= end) {
            int root = getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            if (m2084overlapsXzpGiIY(m2099constructorimpl, start, end)) {
                                tempArray.add(m2099constructorimpl);
                            }
                            if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2078getRightbLpG9ms(root)) < start || m2076getMin330cO7A(m2078getRightbLpG9ms(root)) > end) {
                                c = 2;
                            } else {
                                root = m2078getRightbLpG9ms(root);
                            }
                        } else if (c == 2) {
                            if (!Node.m2101equalsimpl0(m2077getParentbLpG9ms(root), getTerminator())) {
                                c = Node.m2101equalsimpl0(root, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                            }
                            root = m2077getParentbLpG9ms(root);
                        }
                    } else if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2074getLeftbLpG9ms(root)) < start) {
                        c = 1;
                    } else {
                        root = m2074getLeftbLpG9ms(root);
                    }
                }
                break loop0;
            }
        }
        tempArray.sort();
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i = mutableIntList._size;
        for (int i2 = 0; i2 < i; i2++) {
            int m2099constructorimpl2 = Node.m2099constructorimpl(iArr[i2]);
            T m2062getItem330cO7A = m2062getItem330cO7A(m2099constructorimpl2);
            if (m2062getItem330cO7A != null) {
                block.invoke(m2062getItem330cO7A, Integer.valueOf(m2080getStart330cO7A(m2099constructorimpl2)), Integer.valueOf(m2073getEnd330cO7A(m2099constructorimpl2)));
            }
        }
        tempArray.clear();
    }

    public final void forAllIntervals(Function3<? super T, ? super Integer, ? super Integer, Unit> block) {
        if (Node.m2101equalsimpl0(this.root, this.terminator)) {
            return;
        }
        for (int i = 4; i < this.nodeInfo._size; i += 4) {
            int m2099constructorimpl = Node.m2099constructorimpl(i);
            if (m2072getColor330cO7A(m2099constructorimpl) != 2) {
                int m2080getStart330cO7A = m2080getStart330cO7A(m2099constructorimpl);
                int m2073getEnd330cO7A = m2073getEnd330cO7A(m2099constructorimpl);
                T m2062getItem330cO7A = m2062getItem330cO7A(m2099constructorimpl);
                if (m2062getItem330cO7A != null) {
                    block.invoke(m2062getItem330cO7A, Integer.valueOf(m2080getStart330cO7A), Integer.valueOf(m2073getEnd330cO7A));
                }
            }
        }
    }

    public final void clear() {
        this.root = this.terminator;
        MutableLongList mutableLongList = this.nodeInfo;
        mutableLongList.removeRange(4, mutableLongList._size);
        List<T> list = this.items;
        list.subList(1, list.size()).clear();
        this.deletedNodeCount = 0;
    }

    private final void cleanDeletedNodes() {
        int i;
        if (this.deletedNodeCount == 0) {
            return;
        }
        MutableIntList tempArray = getTempArray();
        tempArray.ensureCapacity(getTotalNodeCount());
        int totalNodeCount = getTotalNodeCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 4;
            if (i2 >= totalNodeCount) {
                break;
            }
            if (((int) (this.nodeInfo.get(i2 * 4) >> 32)) == 2) {
                i3++;
            }
            tempArray.add((i2 - i3) * 4);
            i2++;
        }
        this.root = Node.m2099constructorimpl(cleanDeletedNodes$map(tempArray, this.root));
        int i4 = 4;
        while (i < this.nodeInfo._size) {
            if (((int) (this.nodeInfo.get(i) >> 32)) == 2) {
                i += 4;
            } else {
                if (i4 != i) {
                    long j = this.nodeInfo.get(i);
                    this.nodeInfo.set(i4, (((int) (j >> 32)) << 32) | (cleanDeletedNodes$map(tempArray, (int) (j & 4294967295L)) & 4294967295L));
                    this.nodeInfo.set(i4 + 1, (cleanDeletedNodes$map(tempArray, (int) (r9 & 4294967295L)) & 4294967295L) | (cleanDeletedNodes$map(tempArray, (int) (this.nodeInfo.get(i + 1) >> 32)) << 32));
                    MutableLongList mutableLongList = this.nodeInfo;
                    mutableLongList.set(i4 + 2, mutableLongList.get(i + 2));
                    MutableLongList mutableLongList2 = this.nodeInfo;
                    mutableLongList2.set(i4 + 3, mutableLongList2.get(i + 3));
                    List<T> list = this.items;
                    list.set(i4 / 4, list.get(i / 4));
                } else {
                    long j2 = this.nodeInfo.get(i);
                    this.nodeInfo.set(i4, (((int) (j2 >> 32)) << 32) | (cleanDeletedNodes$map(tempArray, (int) (j2 & 4294967295L)) & 4294967295L));
                    long j3 = this.nodeInfo.get(i + 1);
                    this.nodeInfo.set(i4 + 1, (cleanDeletedNodes$map(tempArray, (int) (j3 >> 32)) << 32) | (cleanDeletedNodes$map(tempArray, (int) (j3 & 4294967295L)) & 4294967295L));
                }
                i += 4;
                i4 += 4;
            }
        }
        MutableLongList mutableLongList3 = this.nodeInfo;
        mutableLongList3.removeRange(i4, mutableLongList3._size);
        List<T> list2 = this.items;
        list2.subList(list2.size() - this.deletedNodeCount, this.items.size()).clear();
        this.deletedNodeCount = 0;
        tempArray.clear();
    }

    private static final int cleanDeletedNodes$map(MutableIntList mutableIntList, int i) {
        return mutableIntList.get(i / 4);
    }

    private final void forEachNodeMinMaxInRange(int start, int end, Function1<? super Integer, Unit> block) {
        if (Node.m2101equalsimpl0(getRoot(), getTerminator()) || m2075getMax330cO7A(getRoot()) < start || m2076getMin330cO7A(getRoot()) > end) {
            return;
        }
        int root = getRoot();
        while (true) {
            char c = 0;
            while (!Node.m2101equalsimpl0(root, getTerminator())) {
                if (c != 0) {
                    if (c == 1) {
                        block.invoke(Integer.valueOf(root));
                        if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2078getRightbLpG9ms(root)) < start || m2076getMin330cO7A(m2078getRightbLpG9ms(root)) > end) {
                            c = 2;
                        } else {
                            root = m2078getRightbLpG9ms(root);
                        }
                    } else if (c == 2) {
                        if (!Node.m2101equalsimpl0(m2077getParentbLpG9ms(root), getTerminator())) {
                            c = Node.m2101equalsimpl0(root, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                        }
                        root = m2077getParentbLpG9ms(root);
                    }
                } else if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2074getLeftbLpG9ms(root)) < start) {
                    c = 1;
                } else {
                    root = m2074getLeftbLpG9ms(root);
                }
            }
            return;
        }
    }

    static /* synthetic */ void forEachNodeMinMaxInRange$default(IntIntervalTree intIntervalTree, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        if (Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) < i || intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) > i2) {
            return;
        }
        int root = intIntervalTree.getRoot();
        while (true) {
            char c = 0;
            while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                if (c != 0) {
                    if (c == 1) {
                        function1.invoke(Integer.valueOf(root));
                        if (Node.m2101equalsimpl0(intIntervalTree.m2078getRightbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) < i || intIntervalTree.m2076getMin330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) > i2) {
                            c = 2;
                        } else {
                            root = intIntervalTree.m2078getRightbLpG9ms(root);
                        }
                    } else if (c == 2) {
                        if (!Node.m2101equalsimpl0(intIntervalTree.m2077getParentbLpG9ms(root), intIntervalTree.getTerminator())) {
                            c = Node.m2101equalsimpl0(root, intIntervalTree.m2074getLeftbLpG9ms(intIntervalTree.m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                        }
                        root = intIntervalTree.m2077getParentbLpG9ms(root);
                    }
                } else if (Node.m2101equalsimpl0(intIntervalTree.m2074getLeftbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2074getLeftbLpG9ms(root)) < i) {
                    c = 1;
                } else {
                    root = intIntervalTree.m2074getLeftbLpG9ms(root);
                }
            }
            return;
        }
    }

    public final void mapIntervals(int start, int end, Function1<? super Integer, Integer> mapper) {
        MutableIntList tempArray = getTempArray();
        if (!Node.m2101equalsimpl0(getRoot(), getTerminator()) && m2075getMax330cO7A(getRoot()) >= start && m2076getMin330cO7A(getRoot()) <= end) {
            int root = getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            m2094setStart9hnwElY(m2099constructorimpl, mapper.invoke(Integer.valueOf(m2080getStart330cO7A(m2099constructorimpl))).intValue());
                            m2087setEnd9hnwElY(m2099constructorimpl, mapper.invoke(Integer.valueOf(m2073getEnd330cO7A(m2099constructorimpl))).intValue());
                            m2090setMin9hnwElY(m2099constructorimpl, mapper.invoke(Integer.valueOf(m2076getMin330cO7A(m2099constructorimpl))).intValue());
                            m2089setMax9hnwElY(m2099constructorimpl, mapper.invoke(Integer.valueOf(m2075getMax330cO7A(m2099constructorimpl))).intValue());
                            if (m2073getEnd330cO7A(m2099constructorimpl) <= m2080getStart330cO7A(m2099constructorimpl)) {
                                m2071addZlWbn38(tempArray, m2099constructorimpl);
                            }
                            if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2078getRightbLpG9ms(root)) < start || m2076getMin330cO7A(m2078getRightbLpG9ms(root)) > end) {
                                c = 2;
                            } else {
                                root = m2078getRightbLpG9ms(root);
                            }
                        } else if (c == 2) {
                            if (!Node.m2101equalsimpl0(m2077getParentbLpG9ms(root), getTerminator())) {
                                c = Node.m2101equalsimpl0(root, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                            }
                            root = m2077getParentbLpG9ms(root);
                        }
                    } else if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2074getLeftbLpG9ms(root)) < start) {
                        c = 1;
                    } else {
                        root = m2074getLeftbLpG9ms(root);
                    }
                }
                break loop0;
            }
        }
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i = mutableIntList._size;
        for (int i2 = 0; i2 < i; i2++) {
            m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i2]), false);
        }
        tempArray.clear();
        cleanDeletedNodesIfNeeded();
    }

    public final boolean addInterval(T item, int start, int end) {
        int m2078getRightbLpG9ms;
        if (start >= end || !Node.m2101equalsimpl0(m2061findNodecKdZwxc(item, start, end), this.terminator)) {
            return false;
        }
        int m2057Nodelp996k = m2057Nodelp996k(start, end, item, 0);
        int i = this.root;
        int i2 = this.terminator;
        while (!Node.m2101equalsimpl0(i, this.terminator)) {
            if (m2080getStart330cO7A(m2057Nodelp996k) <= m2080getStart330cO7A(i)) {
                m2078getRightbLpG9ms = m2074getLeftbLpG9ms(i);
            } else {
                m2078getRightbLpG9ms = m2078getRightbLpG9ms(i);
            }
            int i3 = m2078getRightbLpG9ms;
            i2 = i;
            i = i3;
        }
        m2091setParentcfX_BQo(m2057Nodelp996k, i2);
        if (Node.m2101equalsimpl0(i2, this.terminator)) {
            this.root = m2057Nodelp996k;
        } else if (m2080getStart330cO7A(m2057Nodelp996k) <= m2080getStart330cO7A(i2)) {
            m2088setLeftcfX_BQo(i2, m2057Nodelp996k);
        } else {
            m2092setRightcfX_BQo(i2, m2057Nodelp996k);
        }
        m2070updateNodeMinMax330cO7A(i2);
        m2064rebalanceAfterInsertion330cO7A(m2057Nodelp996k);
        return true;
    }

    public final boolean removeInterval(T item, int start, int end) {
        if (start >= end) {
            return false;
        }
        int m2061findNodecKdZwxc = m2061findNodecKdZwxc(item, start, end);
        if (Node.m2101equalsimpl0(m2061findNodecKdZwxc, this.terminator)) {
            return false;
        }
        m2066removeNode9hnwElY$default(this, m2061findNodecKdZwxc, false, 2, null);
        return true;
    }

    /* renamed from: findNode-cKdZwxc, reason: not valid java name */
    private final int m2061findNodecKdZwxc(T item, int start, int end) {
        if (Node.m2101equalsimpl0(this.root, this.terminator) || m2075getMax330cO7A(this.root) < end || m2076getMin330cO7A(this.root) > start) {
            return this.terminator;
        }
        MutableIntList tempArray = getTempArray();
        m2071addZlWbn38(tempArray, this.root);
        while (tempArray._size != 0) {
            int m2085pop2SV_EgM = m2085pop2SV_EgM(tempArray);
            if (m2080getStart330cO7A(m2085pop2SV_EgM) == start && m2073getEnd330cO7A(m2085pop2SV_EgM) == end && Intrinsics.areEqual(m2062getItem330cO7A(m2085pop2SV_EgM), item)) {
                tempArray.clear();
                return m2085pop2SV_EgM;
            }
            if (m2080getStart330cO7A(m2085pop2SV_EgM) >= start) {
                int m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(m2085pop2SV_EgM);
                if (!Node.m2101equalsimpl0(m2074getLeftbLpG9ms, this.terminator) && m2075getMax330cO7A(m2074getLeftbLpG9ms) >= end) {
                    m2071addZlWbn38(tempArray, m2074getLeftbLpG9ms);
                }
            }
            if (m2080getStart330cO7A(m2085pop2SV_EgM) <= start) {
                int m2078getRightbLpG9ms = m2078getRightbLpG9ms(m2085pop2SV_EgM);
                if (!Node.m2101equalsimpl0(m2078getRightbLpG9ms, this.terminator) && m2076getMin330cO7A(m2078getRightbLpG9ms) <= start && m2075getMax330cO7A(m2078getRightbLpG9ms) >= end) {
                    m2071addZlWbn38(tempArray, m2078getRightbLpG9ms);
                }
            }
        }
        return this.terminator;
    }

    /* renamed from: removeNode-9hnwElY$default, reason: not valid java name */
    static /* synthetic */ void m2066removeNode9hnwElY$default(IntIntervalTree intIntervalTree, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        intIntervalTree.m2065removeNode9hnwElY(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeNode-9hnwElY, reason: not valid java name */
    public final void m2065removeNode9hnwElY(int target, boolean cleanUp) {
        int m2077getParentbLpG9ms;
        int i;
        int i2;
        int m2072getColor330cO7A = m2072getColor330cO7A(target);
        if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(target), this.terminator)) {
            i = m2078getRightbLpG9ms(target);
            i2 = m2077getParentbLpG9ms(target);
            m2069transplantcfX_BQo(target, m2078getRightbLpG9ms(target));
        } else if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(target), this.terminator)) {
            i = m2074getLeftbLpG9ms(target);
            i2 = m2077getParentbLpG9ms(target);
            m2069transplantcfX_BQo(target, m2074getLeftbLpG9ms(target));
        } else {
            int m2082lowestNodebLpG9ms = m2082lowestNodebLpG9ms(m2078getRightbLpG9ms(target));
            int m2072getColor330cO7A2 = m2072getColor330cO7A(m2082lowestNodebLpG9ms);
            int m2078getRightbLpG9ms = m2078getRightbLpG9ms(m2082lowestNodebLpG9ms);
            if (Node.m2101equalsimpl0(m2077getParentbLpG9ms(m2082lowestNodebLpG9ms), target)) {
                m2077getParentbLpG9ms = m2082lowestNodebLpG9ms;
            } else {
                m2077getParentbLpG9ms = m2077getParentbLpG9ms(m2082lowestNodebLpG9ms);
                m2069transplantcfX_BQo(m2082lowestNodebLpG9ms, m2078getRightbLpG9ms(m2082lowestNodebLpG9ms));
                m2092setRightcfX_BQo(m2082lowestNodebLpG9ms, m2078getRightbLpG9ms(target));
                m2091setParentcfX_BQo(m2078getRightbLpG9ms(m2082lowestNodebLpG9ms), m2082lowestNodebLpG9ms);
            }
            m2069transplantcfX_BQo(target, m2082lowestNodebLpG9ms);
            m2088setLeftcfX_BQo(m2082lowestNodebLpG9ms, m2074getLeftbLpG9ms(target));
            m2091setParentcfX_BQo(m2074getLeftbLpG9ms(m2082lowestNodebLpG9ms), m2082lowestNodebLpG9ms);
            m2086setColor9hnwElY(m2082lowestNodebLpG9ms, m2072getColor330cO7A(target));
            m2090setMin9hnwElY(m2082lowestNodebLpG9ms, m2076getMin330cO7A(target));
            m2089setMax9hnwElY(m2082lowestNodebLpG9ms, m2075getMax330cO7A(target));
            m2072getColor330cO7A = m2072getColor330cO7A2;
            i = m2078getRightbLpG9ms;
            i2 = m2077getParentbLpG9ms;
        }
        m2070updateNodeMinMax330cO7A(i2);
        if (m2072getColor330cO7A == 1) {
            m2063rebalanceAfterDeletioncfX_BQo(i, i2);
        }
        m2060deleteNode9hnwElY(target, cleanUp);
    }

    /* renamed from: transplant-cfX_BQo, reason: not valid java name */
    private final void m2069transplantcfX_BQo(int target, int replacement) {
        if (Node.m2101equalsimpl0(target, replacement)) {
            return;
        }
        if (Node.m2101equalsimpl0(m2077getParentbLpG9ms(target), this.terminator)) {
            this.root = replacement;
        } else if (Node.m2101equalsimpl0(target, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(target)))) {
            m2088setLeftcfX_BQo(m2077getParentbLpG9ms(target), replacement);
        } else {
            m2092setRightcfX_BQo(m2077getParentbLpG9ms(target), replacement);
        }
        if (Node.m2101equalsimpl0(replacement, this.terminator)) {
            return;
        }
        m2091setParentcfX_BQo(replacement, m2077getParentbLpG9ms(target));
    }

    /* renamed from: deleteNode-9hnwElY, reason: not valid java name */
    private final void m2060deleteNode9hnwElY(int node, boolean cleanUp) {
        m2086setColor9hnwElY(node, 2);
        this.deletedNodeCount++;
        if (cleanUp) {
            cleanDeletedNodesIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanDeletedNodesIfNeeded() {
        if (getTotalNodeCount() <= 64 || this.deletedNodeCount < getTotalNodeCount() / 2) {
            return;
        }
        cleanDeletedNodes();
    }

    /* renamed from: rebalanceAfterDeletion-cfX_BQo, reason: not valid java name */
    private final void m2063rebalanceAfterDeletioncfX_BQo(int target, int targetParent) {
        int m2077getParentbLpG9ms;
        while (!Node.m2101equalsimpl0(target, this.root) && m2072getColor330cO7A(target) == 1) {
            if (Node.m2101equalsimpl0(target, m2074getLeftbLpG9ms(targetParent))) {
                int m2078getRightbLpG9ms = m2078getRightbLpG9ms(targetParent);
                if (m2072getColor330cO7A(m2078getRightbLpG9ms) == 0) {
                    m2086setColor9hnwElY(m2078getRightbLpG9ms, 1);
                    m2086setColor9hnwElY(targetParent, 0);
                    m2067rotateLeft330cO7A(targetParent);
                    m2078getRightbLpG9ms = m2078getRightbLpG9ms(targetParent);
                }
                if (m2072getColor330cO7A(m2074getLeftbLpG9ms(m2078getRightbLpG9ms)) == 1 && m2072getColor330cO7A(m2078getRightbLpG9ms(m2078getRightbLpG9ms)) == 1) {
                    m2086setColor9hnwElY(m2078getRightbLpG9ms, 0);
                    m2077getParentbLpG9ms = m2077getParentbLpG9ms(targetParent);
                    int i = targetParent;
                    targetParent = m2077getParentbLpG9ms;
                    target = i;
                } else {
                    if (m2072getColor330cO7A(m2078getRightbLpG9ms(m2078getRightbLpG9ms)) == 1) {
                        m2086setColor9hnwElY(m2074getLeftbLpG9ms(m2078getRightbLpG9ms), 1);
                        m2086setColor9hnwElY(m2078getRightbLpG9ms, 0);
                        m2068rotateRight330cO7A(m2078getRightbLpG9ms);
                        m2078getRightbLpG9ms = m2078getRightbLpG9ms(targetParent);
                    }
                    m2086setColor9hnwElY(m2078getRightbLpG9ms, m2072getColor330cO7A(targetParent));
                    m2086setColor9hnwElY(targetParent, 1);
                    m2086setColor9hnwElY(m2078getRightbLpG9ms(m2078getRightbLpG9ms), 1);
                    m2067rotateLeft330cO7A(targetParent);
                    target = this.root;
                }
            } else {
                int m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(targetParent);
                if (m2072getColor330cO7A(m2074getLeftbLpG9ms) == 0) {
                    m2086setColor9hnwElY(m2074getLeftbLpG9ms, 1);
                    m2086setColor9hnwElY(targetParent, 0);
                    m2068rotateRight330cO7A(targetParent);
                    m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(targetParent);
                }
                if (m2072getColor330cO7A(m2078getRightbLpG9ms(m2074getLeftbLpG9ms)) == 1 && m2072getColor330cO7A(m2074getLeftbLpG9ms(m2074getLeftbLpG9ms)) == 1) {
                    m2086setColor9hnwElY(m2074getLeftbLpG9ms, 0);
                    m2077getParentbLpG9ms = m2077getParentbLpG9ms(targetParent);
                    int i2 = targetParent;
                    targetParent = m2077getParentbLpG9ms;
                    target = i2;
                } else {
                    if (m2072getColor330cO7A(m2074getLeftbLpG9ms(m2074getLeftbLpG9ms)) == 1) {
                        m2086setColor9hnwElY(m2078getRightbLpG9ms(m2074getLeftbLpG9ms), 1);
                        m2086setColor9hnwElY(m2074getLeftbLpG9ms, 0);
                        m2067rotateLeft330cO7A(m2074getLeftbLpG9ms);
                        m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(targetParent);
                    }
                    m2086setColor9hnwElY(m2074getLeftbLpG9ms, m2072getColor330cO7A(targetParent));
                    m2086setColor9hnwElY(targetParent, 1);
                    m2086setColor9hnwElY(m2074getLeftbLpG9ms(m2074getLeftbLpG9ms), 1);
                    m2068rotateRight330cO7A(targetParent);
                    target = this.root;
                }
            }
        }
        m2086setColor9hnwElY(target, 1);
    }

    /* renamed from: rebalanceAfterInsertion-330cO7A, reason: not valid java name */
    private final void m2064rebalanceAfterInsertion330cO7A(int target) {
        while (!Node.m2101equalsimpl0(target, this.root) && m2072getColor330cO7A(m2077getParentbLpG9ms(target)) == 0) {
            int m2077getParentbLpG9ms = m2077getParentbLpG9ms(m2077getParentbLpG9ms(target));
            if (Node.m2101equalsimpl0(m2077getParentbLpG9ms(target), m2074getLeftbLpG9ms(m2077getParentbLpG9ms))) {
                int m2078getRightbLpG9ms = m2078getRightbLpG9ms(m2077getParentbLpG9ms);
                if (m2072getColor330cO7A(m2078getRightbLpG9ms) == 0) {
                    m2086setColor9hnwElY(m2078getRightbLpG9ms, 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms(target), 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms, 0);
                    target = m2077getParentbLpG9ms;
                } else {
                    if (Node.m2101equalsimpl0(target, m2078getRightbLpG9ms(m2077getParentbLpG9ms(target)))) {
                        target = m2077getParentbLpG9ms(target);
                        m2067rotateLeft330cO7A(target);
                    }
                    m2086setColor9hnwElY(m2077getParentbLpG9ms(target), 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms, 0);
                    m2068rotateRight330cO7A(m2077getParentbLpG9ms);
                }
            } else {
                int m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(m2077getParentbLpG9ms);
                if (m2072getColor330cO7A(m2074getLeftbLpG9ms) == 0) {
                    m2086setColor9hnwElY(m2074getLeftbLpG9ms, 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms(target), 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms, 0);
                    target = m2077getParentbLpG9ms;
                } else {
                    if (Node.m2101equalsimpl0(target, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(target)))) {
                        target = m2077getParentbLpG9ms(target);
                        m2068rotateRight330cO7A(target);
                    }
                    m2086setColor9hnwElY(m2077getParentbLpG9ms(target), 1);
                    m2086setColor9hnwElY(m2077getParentbLpG9ms, 0);
                    m2067rotateLeft330cO7A(m2077getParentbLpG9ms);
                }
            }
        }
        m2086setColor9hnwElY(this.root, 1);
    }

    /* renamed from: rotateLeft-330cO7A, reason: not valid java name */
    private final void m2067rotateLeft330cO7A(int node) {
        int m2078getRightbLpG9ms = m2078getRightbLpG9ms(node);
        m2092setRightcfX_BQo(node, m2074getLeftbLpG9ms(m2078getRightbLpG9ms));
        if (!Node.m2101equalsimpl0(m2074getLeftbLpG9ms(m2078getRightbLpG9ms), this.terminator)) {
            m2091setParentcfX_BQo(m2074getLeftbLpG9ms(m2078getRightbLpG9ms), node);
        }
        m2091setParentcfX_BQo(m2078getRightbLpG9ms, m2077getParentbLpG9ms(node));
        if (Node.m2101equalsimpl0(m2077getParentbLpG9ms(node), this.terminator)) {
            this.root = m2078getRightbLpG9ms;
        } else if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(m2077getParentbLpG9ms(node)), node)) {
            m2088setLeftcfX_BQo(m2077getParentbLpG9ms(node), m2078getRightbLpG9ms);
        } else {
            m2092setRightcfX_BQo(m2077getParentbLpG9ms(node), m2078getRightbLpG9ms);
        }
        m2088setLeftcfX_BQo(m2078getRightbLpG9ms, node);
        m2091setParentcfX_BQo(node, m2078getRightbLpG9ms);
        m2070updateNodeMinMax330cO7A(node);
    }

    /* renamed from: rotateRight-330cO7A, reason: not valid java name */
    private final void m2068rotateRight330cO7A(int node) {
        int m2074getLeftbLpG9ms = m2074getLeftbLpG9ms(node);
        m2088setLeftcfX_BQo(node, m2078getRightbLpG9ms(m2074getLeftbLpG9ms));
        if (!Node.m2101equalsimpl0(m2078getRightbLpG9ms(m2074getLeftbLpG9ms), this.terminator)) {
            m2091setParentcfX_BQo(m2078getRightbLpG9ms(m2074getLeftbLpG9ms), node);
        }
        m2091setParentcfX_BQo(m2074getLeftbLpG9ms, m2077getParentbLpG9ms(node));
        if (Node.m2101equalsimpl0(m2077getParentbLpG9ms(node), this.terminator)) {
            this.root = m2074getLeftbLpG9ms;
        } else if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(m2077getParentbLpG9ms(node)), node)) {
            m2092setRightcfX_BQo(m2077getParentbLpG9ms(node), m2074getLeftbLpG9ms);
        } else {
            m2088setLeftcfX_BQo(m2077getParentbLpG9ms(node), m2074getLeftbLpG9ms);
        }
        m2092setRightcfX_BQo(m2074getLeftbLpG9ms, node);
        m2091setParentcfX_BQo(node, m2074getLeftbLpG9ms);
        m2070updateNodeMinMax330cO7A(node);
    }

    /* renamed from: updateNodeMinMax-330cO7A, reason: not valid java name */
    private final void m2070updateNodeMinMax330cO7A(int node) {
        while (!Node.m2101equalsimpl0(node, this.terminator)) {
            m2090setMin9hnwElY(node, Math.min(m2080getStart330cO7A(node), Math.min(m2076getMin330cO7A(m2074getLeftbLpG9ms(node)), m2076getMin330cO7A(m2078getRightbLpG9ms(node)))));
            m2089setMax9hnwElY(node, Math.max(m2073getEnd330cO7A(node), Math.max(m2075getMax330cO7A(m2074getLeftbLpG9ms(node)), m2075getMax330cO7A(m2078getRightbLpG9ms(node)))));
            node = m2077getParentbLpG9ms(node);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntIntervalTree)) {
            return false;
        }
        IntIntervalTree intIntervalTree = (IntIntervalTree) other;
        if (this.nodeInfo.get(this.root + 3) != intIntervalTree.nodeInfo.get(intIntervalTree.root + 3) || getTotalNodeCount() - this.deletedNodeCount != intIntervalTree.getTotalNodeCount() - intIntervalTree.deletedNodeCount) {
            return false;
        }
        int i = 4;
        int i2 = 4;
        while (i < this.nodeInfo._size && i2 < intIntervalTree.nodeInfo._size) {
            if (((int) (this.nodeInfo.get(i) >> 32)) == 2) {
                i += 4;
            } else {
                if (((int) (intIntervalTree.nodeInfo.get(i2) >> 32)) != 2) {
                    if (this.nodeInfo.get(i + 2) != intIntervalTree.nodeInfo.get(i2 + 2) || !Intrinsics.areEqual(this.items.get(i / 4), intIntervalTree.items.get(i2 / 4))) {
                        return false;
                    }
                    i += 4;
                }
                i2 += 4;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 4; i2 < this.nodeInfo._size; i2 += 4) {
            int m2099constructorimpl = Node.m2099constructorimpl(i2);
            if (m2072getColor330cO7A(m2099constructorimpl) != 2) {
                int m2080getStart330cO7A = ((((i * 31) + m2080getStart330cO7A(m2099constructorimpl)) * 31) + m2073getEnd330cO7A(m2099constructorimpl)) * 31;
                T m2062getItem330cO7A = m2062getItem330cO7A(m2099constructorimpl);
                i = m2080getStart330cO7A + (m2062getItem330cO7A != null ? m2062getItem330cO7A.hashCode() : 0);
            }
        }
        return i;
    }

    public final IntIntervalTree<T> copy() {
        cleanDeletedNodes();
        return new IntIntervalTree<>(this);
    }

    public final boolean isEmpty() {
        return Node.m2101equalsimpl0(this.root, this.terminator);
    }

    /* renamed from: add-ZlWbn38, reason: not valid java name */
    public final void m2071addZlWbn38(MutableIntList mutableIntList, int i) {
        mutableIntList.add(i);
    }

    /* renamed from: pop-2SV_EgM, reason: not valid java name */
    public final int m2085pop2SV_EgM(MutableIntList mutableIntList) {
        return Node.m2099constructorimpl(mutableIntList.removeAt(mutableIntList._size - 1));
    }

    private final void forEachNodeInRange(int start, int end, Function1<? super Integer, Unit> block) {
        if (Node.m2101equalsimpl0(getRoot(), getTerminator()) || m2075getMax330cO7A(getRoot()) < start || m2076getMin330cO7A(getRoot()) > end) {
            return;
        }
        int root = getRoot();
        while (true) {
            char c = 0;
            while (!Node.m2101equalsimpl0(root, getTerminator())) {
                if (c != 0) {
                    if (c == 1) {
                        int m2099constructorimpl = Node.m2099constructorimpl(root);
                        if (m2084overlapsXzpGiIY(m2099constructorimpl, start, end)) {
                            block.invoke(Integer.valueOf(m2099constructorimpl));
                        }
                        if (Node.m2101equalsimpl0(m2078getRightbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2078getRightbLpG9ms(root)) < start || m2076getMin330cO7A(m2078getRightbLpG9ms(root)) > end) {
                            c = 2;
                        } else {
                            root = m2078getRightbLpG9ms(root);
                        }
                    } else if (c == 2) {
                        if (!Node.m2101equalsimpl0(m2077getParentbLpG9ms(root), getTerminator())) {
                            c = Node.m2101equalsimpl0(root, m2074getLeftbLpG9ms(m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                        }
                        root = m2077getParentbLpG9ms(root);
                    }
                } else if (Node.m2101equalsimpl0(m2074getLeftbLpG9ms(root), getTerminator()) || m2075getMax330cO7A(m2074getLeftbLpG9ms(root)) < start) {
                    c = 1;
                } else {
                    root = m2074getLeftbLpG9ms(root);
                }
            }
            return;
        }
    }

    static /* synthetic */ void forEachNodeInRange$default(IntIntervalTree intIntervalTree, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        if (Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) < i || intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) > i2) {
            return;
        }
        int root = intIntervalTree.getRoot();
        while (true) {
            char c = 0;
            while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                if (c != 0) {
                    if (c == 1) {
                        int m2099constructorimpl = Node.m2099constructorimpl(root);
                        if (intIntervalTree.m2084overlapsXzpGiIY(m2099constructorimpl, i, i2)) {
                            function1.invoke(Integer.valueOf(m2099constructorimpl));
                        }
                        if (Node.m2101equalsimpl0(intIntervalTree.m2078getRightbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) < i || intIntervalTree.m2076getMin330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) > i2) {
                            c = 2;
                        } else {
                            root = intIntervalTree.m2078getRightbLpG9ms(root);
                        }
                    } else if (c == 2) {
                        if (!Node.m2101equalsimpl0(intIntervalTree.m2077getParentbLpG9ms(root), intIntervalTree.getTerminator())) {
                            c = Node.m2101equalsimpl0(root, intIntervalTree.m2074getLeftbLpG9ms(intIntervalTree.m2077getParentbLpG9ms(root))) ? (char) 1 : (char) 2;
                        }
                        root = intIntervalTree.m2077getParentbLpG9ms(root);
                    }
                } else if (Node.m2101equalsimpl0(intIntervalTree.m2074getLeftbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2074getLeftbLpG9ms(root)) < i) {
                    c = 1;
                } else {
                    root = intIntervalTree.m2074getLeftbLpG9ms(root);
                }
            }
            return;
        }
    }
}
