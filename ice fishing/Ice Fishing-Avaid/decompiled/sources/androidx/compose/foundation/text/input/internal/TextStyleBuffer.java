package androidx.compose.foundation.text.input.internal;

import androidx.collection.MutableIntList;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextStyleBuffer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tJ\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001aJ#\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0002\u0010\u0018J\u001e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\tH\u0002J\u0006\u0010,\u001a\u00020$J\u0013\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010/\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextStyleBuffer;", "T", "", "source", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextStyleBuffer;)V", "intervalTree", "Landroidx/compose/foundation/text/input/internal/IntIntervalTree;", "gapStart", "", "getGapStart", "()I", "setGapStart", "(I)V", "gapEnd", "getGapEnd", "setGapEnd", "gapLength", "getGapLength", "addStyle", "", "style", "start", "end", "(Ljava/lang/Object;II)Z", "getStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "getAllStyles", "removeStyle", "replaceText", "newLength", "originalIndexToGapBuffer", "index", "gapBufferToOriginalIndex", "deleteText", "", "moveGapLeft", "count", "moveGapRight", "deleteBeforeGap", "deleteAfterGap", "enlargeGapIfNeeded", "requiredSize", "clear", "equals", "other", "hashCode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextStyleBuffer<T> {
    public static final int $stable = 8;
    private int gapEnd;
    private int gapStart;
    private final IntIntervalTree<T> intervalTree;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStyleBuffer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextStyleBuffer(TextStyleBuffer<T> textStyleBuffer) {
        this.intervalTree = textStyleBuffer != null ? new IntIntervalTree<>(textStyleBuffer.intervalTree) : new IntIntervalTree<>(null, 1, null);
        if (textStyleBuffer != null) {
            this.gapStart = textStyleBuffer.gapStart;
            this.gapEnd = textStyleBuffer.gapEnd;
        } else {
            this.gapStart = 0;
            this.gapEnd = 1000;
        }
    }

    public /* synthetic */ TextStyleBuffer(TextStyleBuffer textStyleBuffer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textStyleBuffer);
    }

    public final int getGapStart() {
        return this.gapStart;
    }

    public final void setGapStart(int i) {
        this.gapStart = i;
    }

    public final int getGapEnd() {
        return this.gapEnd;
    }

    public final void setGapEnd(int i) {
        this.gapEnd = i;
    }

    private final int getGapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final boolean addStyle(T style, int start, int end) {
        return this.intervalTree.addInterval(style, originalIndexToGapBuffer(start), originalIndexToGapBuffer(end));
    }

    public final List<AnnotatedString.Range<T>> getStyles(int start, int end) {
        if (start > end) {
            return CollectionsKt.emptyList();
        }
        int originalIndexToGapBuffer = originalIndexToGapBuffer(start);
        int originalIndexToGapBuffer2 = originalIndexToGapBuffer(end);
        final ArrayList arrayList = new ArrayList();
        this.intervalTree.forEachIntervalInRange(originalIndexToGapBuffer, originalIndexToGapBuffer2, new Function3() { // from class: androidx.compose.foundation.text.input.internal.TextStyleBuffer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit styles$lambda$0;
                styles$lambda$0 = TextStyleBuffer.getStyles$lambda$0(arrayList, this, obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return styles$lambda$0;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStyles$lambda$0(List list, TextStyleBuffer textStyleBuffer, Object obj, int i, int i2) {
        list.add(new AnnotatedString.Range(obj, textStyleBuffer.gapBufferToOriginalIndex(i), textStyleBuffer.gapBufferToOriginalIndex(i2)));
        return Unit.INSTANCE;
    }

    public final List<AnnotatedString.Range<T>> getAllStyles() {
        final ArrayList arrayList = new ArrayList();
        this.intervalTree.forAllIntervals(new Function3() { // from class: androidx.compose.foundation.text.input.internal.TextStyleBuffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit allStyles$lambda$0;
                allStyles$lambda$0 = TextStyleBuffer.getAllStyles$lambda$0(arrayList, this, obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return allStyles$lambda$0;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllStyles$lambda$0(List list, TextStyleBuffer textStyleBuffer, Object obj, int i, int i2) {
        list.add(new AnnotatedString.Range(obj, textStyleBuffer.gapBufferToOriginalIndex(i), textStyleBuffer.gapBufferToOriginalIndex(i2)));
        return Unit.INSTANCE;
    }

    public final boolean removeStyle(T style, int start, int end) {
        return this.intervalTree.removeInterval(style, originalIndexToGapBuffer(start), originalIndexToGapBuffer(end));
    }

    public final boolean replaceText(int start, int end, int newLength) {
        if (this.intervalTree.isEmpty()) {
            return false;
        }
        enlargeGapIfNeeded(newLength - (end - start));
        deleteText(start, end);
        this.gapStart += newLength;
        return true;
    }

    private final int originalIndexToGapBuffer(int index) {
        return index < this.gapStart ? index : index + getGapLength();
    }

    private final int gapBufferToOriginalIndex(int index) {
        return index < this.gapStart ? index : index - getGapLength();
    }

    private final void deleteText(int start, int end) {
        int i = this.gapStart;
        if (start < i && end <= i) {
            moveGapLeft(i - end);
            deleteBeforeGap(end - start);
        } else if (start < i && end >= i) {
            deleteBeforeGap(i - start);
            deleteAfterGap(end - i);
        } else {
            moveGapRight(start - i);
            deleteAfterGap(end - start);
        }
    }

    private final void moveGapLeft(int count) {
        if (count == 0) {
            return;
        }
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        int i = this.gapStart;
        int i2 = i - count;
        MutableIntList tempArray = intIntervalTree.getTempArray();
        if (!Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) && intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) >= i2 && intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) <= i) {
            int root = intIntervalTree.getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            int m2080getStart330cO7A = intIntervalTree.m2080getStart330cO7A(m2099constructorimpl);
                            int i3 = this.gapStart;
                            int i4 = i3 - count;
                            if (m2080getStart330cO7A < i3 && i4 <= m2080getStart330cO7A) {
                                m2080getStart330cO7A += getGapLength();
                            }
                            intIntervalTree.m2094setStart9hnwElY(m2099constructorimpl, m2080getStart330cO7A);
                            int m2073getEnd330cO7A = intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl);
                            int i5 = this.gapStart;
                            int i6 = i5 - count;
                            if (m2073getEnd330cO7A < i5 && i6 <= m2073getEnd330cO7A) {
                                m2073getEnd330cO7A += getGapLength();
                            }
                            intIntervalTree.m2087setEnd9hnwElY(m2099constructorimpl, m2073getEnd330cO7A);
                            int m2076getMin330cO7A = intIntervalTree.m2076getMin330cO7A(m2099constructorimpl);
                            int i7 = this.gapStart;
                            int i8 = i7 - count;
                            if (m2076getMin330cO7A < i7 && i8 <= m2076getMin330cO7A) {
                                m2076getMin330cO7A += getGapLength();
                            }
                            intIntervalTree.m2090setMin9hnwElY(m2099constructorimpl, m2076getMin330cO7A);
                            int m2075getMax330cO7A = intIntervalTree.m2075getMax330cO7A(m2099constructorimpl);
                            int i9 = this.gapStart;
                            int i10 = i9 - count;
                            if (m2075getMax330cO7A < i9 && i10 <= m2075getMax330cO7A) {
                                m2075getMax330cO7A += getGapLength();
                            }
                            intIntervalTree.m2089setMax9hnwElY(m2099constructorimpl, m2075getMax330cO7A);
                            if (intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl) <= intIntervalTree.m2080getStart330cO7A(m2099constructorimpl)) {
                                intIntervalTree.m2071addZlWbn38(tempArray, m2099constructorimpl);
                            }
                            if (Node.m2101equalsimpl0(intIntervalTree.m2078getRightbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) < i2 || intIntervalTree.m2076getMin330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) > i) {
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
                    } else if (Node.m2101equalsimpl0(intIntervalTree.m2074getLeftbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2074getLeftbLpG9ms(root)) < i2) {
                        c = 1;
                    } else {
                        root = intIntervalTree.m2074getLeftbLpG9ms(root);
                    }
                }
                break loop0;
            }
        }
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i11 = mutableIntList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            intIntervalTree.m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i12]), false);
        }
        tempArray.clear();
        intIntervalTree.cleanDeletedNodesIfNeeded();
        this.gapStart -= count;
        this.gapEnd -= count;
    }

    private final void moveGapRight(int count) {
        if (count == 0) {
            return;
        }
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        int i = this.gapEnd;
        int i2 = i + count;
        MutableIntList tempArray = intIntervalTree.getTempArray();
        if (!Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) && intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) >= i && intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) <= i2) {
            int root = intIntervalTree.getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            int m2080getStart330cO7A = intIntervalTree.m2080getStart330cO7A(m2099constructorimpl);
                            int i3 = this.gapEnd;
                            if (m2080getStart330cO7A < i3 + count && i3 <= m2080getStart330cO7A) {
                                m2080getStart330cO7A -= getGapLength();
                            }
                            intIntervalTree.m2094setStart9hnwElY(m2099constructorimpl, m2080getStart330cO7A);
                            int m2073getEnd330cO7A = intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl);
                            int i4 = this.gapEnd;
                            if (m2073getEnd330cO7A < i4 + count && i4 <= m2073getEnd330cO7A) {
                                m2073getEnd330cO7A -= getGapLength();
                            }
                            intIntervalTree.m2087setEnd9hnwElY(m2099constructorimpl, m2073getEnd330cO7A);
                            int m2076getMin330cO7A = intIntervalTree.m2076getMin330cO7A(m2099constructorimpl);
                            int i5 = this.gapEnd;
                            if (m2076getMin330cO7A < i5 + count && i5 <= m2076getMin330cO7A) {
                                m2076getMin330cO7A -= getGapLength();
                            }
                            intIntervalTree.m2090setMin9hnwElY(m2099constructorimpl, m2076getMin330cO7A);
                            int m2075getMax330cO7A = intIntervalTree.m2075getMax330cO7A(m2099constructorimpl);
                            int i6 = this.gapEnd;
                            if (m2075getMax330cO7A < i6 + count && i6 <= m2075getMax330cO7A) {
                                m2075getMax330cO7A -= getGapLength();
                            }
                            intIntervalTree.m2089setMax9hnwElY(m2099constructorimpl, m2075getMax330cO7A);
                            if (intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl) <= intIntervalTree.m2080getStart330cO7A(m2099constructorimpl)) {
                                intIntervalTree.m2071addZlWbn38(tempArray, m2099constructorimpl);
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
                break loop0;
            }
        }
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i7 = mutableIntList._size;
        for (int i8 = 0; i8 < i7; i8++) {
            intIntervalTree.m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i8]), false);
        }
        tempArray.clear();
        intIntervalTree.cleanDeletedNodesIfNeeded();
        this.gapStart += count;
        this.gapEnd += count;
    }

    private final void deleteBeforeGap(int count) {
        if (count == 0) {
            return;
        }
        int i = this.gapStart;
        int i2 = i - count;
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        MutableIntList tempArray = intIntervalTree.getTempArray();
        if (!Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) && intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) >= i2 && intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) <= i) {
            int root = intIntervalTree.getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            int m2080getStart330cO7A = intIntervalTree.m2080getStart330cO7A(m2099constructorimpl);
                            if (i2 <= m2080getStart330cO7A && m2080getStart330cO7A < this.gapStart) {
                                m2080getStart330cO7A = this.gapEnd;
                            }
                            intIntervalTree.m2094setStart9hnwElY(m2099constructorimpl, m2080getStart330cO7A);
                            int m2073getEnd330cO7A = intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl);
                            if (i2 <= m2073getEnd330cO7A && m2073getEnd330cO7A < this.gapStart) {
                                m2073getEnd330cO7A = this.gapEnd;
                            }
                            intIntervalTree.m2087setEnd9hnwElY(m2099constructorimpl, m2073getEnd330cO7A);
                            int m2076getMin330cO7A = intIntervalTree.m2076getMin330cO7A(m2099constructorimpl);
                            if (i2 <= m2076getMin330cO7A && m2076getMin330cO7A < this.gapStart) {
                                m2076getMin330cO7A = this.gapEnd;
                            }
                            intIntervalTree.m2090setMin9hnwElY(m2099constructorimpl, m2076getMin330cO7A);
                            int m2075getMax330cO7A = intIntervalTree.m2075getMax330cO7A(m2099constructorimpl);
                            if (i2 <= m2075getMax330cO7A && m2075getMax330cO7A < this.gapStart) {
                                m2075getMax330cO7A = this.gapEnd;
                            }
                            intIntervalTree.m2089setMax9hnwElY(m2099constructorimpl, m2075getMax330cO7A);
                            if (intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl) <= intIntervalTree.m2080getStart330cO7A(m2099constructorimpl)) {
                                intIntervalTree.m2071addZlWbn38(tempArray, m2099constructorimpl);
                            }
                            if (Node.m2101equalsimpl0(intIntervalTree.m2078getRightbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) < i2 || intIntervalTree.m2076getMin330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) > i) {
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
                    } else if (Node.m2101equalsimpl0(intIntervalTree.m2074getLeftbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2074getLeftbLpG9ms(root)) < i2) {
                        c = 1;
                    } else {
                        root = intIntervalTree.m2074getLeftbLpG9ms(root);
                    }
                }
                break loop0;
            }
        }
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i3 = mutableIntList._size;
        for (int i4 = 0; i4 < i3; i4++) {
            intIntervalTree.m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i4]), false);
        }
        tempArray.clear();
        intIntervalTree.cleanDeletedNodesIfNeeded();
        this.gapStart -= count;
    }

    private final void deleteAfterGap(int count) {
        if (count == 0) {
            return;
        }
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        int i = this.gapEnd;
        int i2 = i + count;
        MutableIntList tempArray = intIntervalTree.getTempArray();
        if (!Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) && intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) >= i && intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) <= i2) {
            int root = intIntervalTree.getRoot();
            loop0: while (true) {
                char c = 0;
                while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                    if (c != 0) {
                        if (c == 1) {
                            int m2099constructorimpl = Node.m2099constructorimpl(root);
                            int m2080getStart330cO7A = intIntervalTree.m2080getStart330cO7A(m2099constructorimpl);
                            int i3 = this.gapEnd;
                            if (m2080getStart330cO7A < i3 + count && i3 <= m2080getStart330cO7A) {
                                m2080getStart330cO7A = i3 + count;
                            }
                            intIntervalTree.m2094setStart9hnwElY(m2099constructorimpl, m2080getStart330cO7A);
                            int m2073getEnd330cO7A = intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl);
                            int i4 = this.gapEnd;
                            if (m2073getEnd330cO7A < i4 + count && i4 <= m2073getEnd330cO7A) {
                                m2073getEnd330cO7A = i4 + count;
                            }
                            intIntervalTree.m2087setEnd9hnwElY(m2099constructorimpl, m2073getEnd330cO7A);
                            int m2076getMin330cO7A = intIntervalTree.m2076getMin330cO7A(m2099constructorimpl);
                            int i5 = this.gapEnd;
                            if (m2076getMin330cO7A < i5 + count && i5 <= m2076getMin330cO7A) {
                                m2076getMin330cO7A = i5 + count;
                            }
                            intIntervalTree.m2090setMin9hnwElY(m2099constructorimpl, m2076getMin330cO7A);
                            int m2075getMax330cO7A = intIntervalTree.m2075getMax330cO7A(m2099constructorimpl);
                            int i6 = this.gapEnd;
                            if (m2075getMax330cO7A < i6 + count && i6 <= m2075getMax330cO7A) {
                                m2075getMax330cO7A = i6 + count;
                            }
                            intIntervalTree.m2089setMax9hnwElY(m2099constructorimpl, m2075getMax330cO7A);
                            if (intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl) <= intIntervalTree.m2080getStart330cO7A(m2099constructorimpl)) {
                                intIntervalTree.m2071addZlWbn38(tempArray, m2099constructorimpl);
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
                break loop0;
            }
        }
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i7 = mutableIntList._size;
        for (int i8 = 0; i8 < i7; i8++) {
            intIntervalTree.m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i8]), false);
        }
        tempArray.clear();
        intIntervalTree.cleanDeletedNodesIfNeeded();
        this.gapEnd += count;
    }

    private final void enlargeGapIfNeeded(int requiredSize) {
        if (!this.intervalTree.isEmpty() && getGapLength() < requiredSize) {
            int gapLength = (getGapLength() - requiredSize) + 1000;
            IntIntervalTree<T> intIntervalTree = this.intervalTree;
            int i = this.gapStart;
            MutableIntList tempArray = intIntervalTree.getTempArray();
            if (!Node.m2101equalsimpl0(intIntervalTree.getRoot(), intIntervalTree.getTerminator()) && intIntervalTree.m2075getMax330cO7A(intIntervalTree.getRoot()) >= i && intIntervalTree.m2076getMin330cO7A(intIntervalTree.getRoot()) <= Integer.MAX_VALUE) {
                int root = intIntervalTree.getRoot();
                loop0: while (true) {
                    char c = 0;
                    while (!Node.m2101equalsimpl0(root, intIntervalTree.getTerminator())) {
                        if (c != 0) {
                            if (c == 1) {
                                int m2099constructorimpl = Node.m2099constructorimpl(root);
                                int m2080getStart330cO7A = intIntervalTree.m2080getStart330cO7A(m2099constructorimpl);
                                if (m2080getStart330cO7A >= this.gapStart) {
                                    m2080getStart330cO7A += gapLength;
                                }
                                intIntervalTree.m2094setStart9hnwElY(m2099constructorimpl, m2080getStart330cO7A);
                                int m2073getEnd330cO7A = intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl);
                                if (m2073getEnd330cO7A >= this.gapStart) {
                                    m2073getEnd330cO7A += gapLength;
                                }
                                intIntervalTree.m2087setEnd9hnwElY(m2099constructorimpl, m2073getEnd330cO7A);
                                int m2076getMin330cO7A = intIntervalTree.m2076getMin330cO7A(m2099constructorimpl);
                                if (m2076getMin330cO7A >= this.gapStart) {
                                    m2076getMin330cO7A += gapLength;
                                }
                                intIntervalTree.m2090setMin9hnwElY(m2099constructorimpl, m2076getMin330cO7A);
                                int m2075getMax330cO7A = intIntervalTree.m2075getMax330cO7A(m2099constructorimpl);
                                if (m2075getMax330cO7A >= this.gapStart) {
                                    m2075getMax330cO7A += gapLength;
                                }
                                intIntervalTree.m2089setMax9hnwElY(m2099constructorimpl, m2075getMax330cO7A);
                                if (intIntervalTree.m2073getEnd330cO7A(m2099constructorimpl) <= intIntervalTree.m2080getStart330cO7A(m2099constructorimpl)) {
                                    intIntervalTree.m2071addZlWbn38(tempArray, m2099constructorimpl);
                                }
                                if (Node.m2101equalsimpl0(intIntervalTree.m2078getRightbLpG9ms(root), intIntervalTree.getTerminator()) || intIntervalTree.m2075getMax330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) < i || intIntervalTree.m2076getMin330cO7A(intIntervalTree.m2078getRightbLpG9ms(root)) > Integer.MAX_VALUE) {
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
                    break loop0;
                }
            }
            MutableIntList mutableIntList = tempArray;
            int[] iArr = mutableIntList.content;
            int i2 = mutableIntList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                intIntervalTree.m2065removeNode9hnwElY(Node.m2099constructorimpl(iArr[i3]), false);
            }
            tempArray.clear();
            intIntervalTree.cleanDeletedNodesIfNeeded();
            this.gapEnd += gapLength;
        }
    }

    public final void clear() {
        this.intervalTree.clear();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TextStyleBuffer) {
            return Intrinsics.areEqual(this.intervalTree, ((TextStyleBuffer) other).intervalTree);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalTree.hashCode();
    }
}
