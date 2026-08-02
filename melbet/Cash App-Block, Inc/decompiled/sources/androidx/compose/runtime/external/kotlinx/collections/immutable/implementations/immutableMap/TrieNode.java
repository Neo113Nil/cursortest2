package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import coil3.size.SizeKt;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import okio.PriorityQueue;

/* loaded from: classes.dex */
public final class TrieNode {
    public static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0], null);
    public Object[] buffer;
    public int dataMap;
    public int nodeMap;
    public final EndOfChain ownedBy;

    public TrieNode(int i, int i2, Object[] objArr, EndOfChain endOfChain) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = endOfChain;
        this.buffer = objArr;
    }

    public static TrieNode makeNode(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, EndOfChain endOfChain) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, endOfChain);
        }
        int indexSegment = SizeKt.indexSegment(i, i3);
        int indexSegment2 = SizeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, endOfChain);
        }
        return new TrieNode(0, 1 << indexSegment, new Object[]{makeNode(i, obj, obj2, i2, obj3, obj4, i3 + 5, endOfChain)}, endOfChain);
    }

    public final Object[] bufferMoveEntryToNode(int i, int i2, int i3, Object obj, Object obj2, int i4, EndOfChain endOfChain) {
        Object obj3 = this.buffer[i];
        TrieNode makeNode = makeNode(obj3 != null ? obj3.hashCode() : 0, obj3, valueAtKeyIndex(i), i3, obj, obj2, i4 + 5, endOfChain);
        int nodeIndex$runtime = nodeIndex$runtime(i2);
        int i5 = nodeIndex$runtime + 1;
        Object[] objArr = this.buffer;
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 2, i5, objArr, objArr2);
        objArr2[nodeIndex$runtime - 1] = makeNode;
        ArraysKt___ArraysJvmKt.copyInto(nodeIndex$runtime, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime(i).calculateSize();
        }
        return bitCount;
    }

    public final boolean collisionContainsKey(Object obj) {
        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, this.buffer.length));
        int i = step.first;
        int i2 = step.last;
        int i3 = step.step;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.areEqual(obj, this.buffer[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsKey(int i, int i2, Object obj) {
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            return Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime(indexSegment)]);
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        return i2 == 30 ? nodeAtIndex$runtime.collisionContainsKey(obj) : nodeAtIndex$runtime.containsKey(i, i2 + 5, obj);
    }

    public final boolean elementsIdentityEquals(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap == trieNode.nodeMap && this.dataMap == trieNode.dataMap) {
            int length = this.buffer.length;
            for (int i = 0; i < length; i++) {
                if (this.buffer[i] == trieNode.buffer[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int entryKeyIndex$runtime(int i) {
        return Integer.bitCount(this.dataMap & (i - 1)) * 2;
    }

    public final Object get(int i, int i2, Object obj) {
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime])) {
                return valueAtKeyIndex(entryKeyIndex$runtime);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        if (i2 != 30) {
            return nodeAtIndex$runtime.get(i, i2 + 5, obj);
        }
        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
        int i3 = step.first;
        int i4 = step.last;
        int i5 = step.step;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return nodeAtIndex$runtime.valueAtKeyIndex(i3);
    }

    public final boolean hasEntryAt$runtime(int i) {
        return (this.dataMap & i) != 0;
    }

    public final boolean hasNodeAt(int i) {
        return (this.nodeMap & i) != 0;
    }

    public final TrieNode mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size - 1);
        persistentHashMapBuilder.operationResult = valueAtKeyIndex(i);
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.ownership) {
            return new TrieNode(0, 0, SizeKt.access$removeEntryAtIndex(i, objArr), persistentHashMapBuilder.ownership);
        }
        this.buffer = SizeKt.access$removeEntryAtIndex(i, objArr);
        return this;
    }

    public final TrieNode mutablePut(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        TrieNode mutablePut;
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        boolean hasEntryAt$runtime = hasEntryAt$runtime(indexSegment);
        EndOfChain endOfChain = this.ownedBy;
        if (hasEntryAt$runtime) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (!Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime])) {
                persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
                EndOfChain endOfChain2 = persistentHashMapBuilder.ownership;
                if (endOfChain != endOfChain2) {
                    return new TrieNode(this.dataMap ^ indexSegment, this.nodeMap | indexSegment, bufferMoveEntryToNode(entryKeyIndex$runtime, indexSegment, i, obj, obj2, i2, endOfChain2), endOfChain2);
                }
                this.buffer = bufferMoveEntryToNode(entryKeyIndex$runtime, indexSegment, i, obj, obj2, i2, endOfChain2);
                this.dataMap ^= indexSegment;
                this.nodeMap |= indexSegment;
                return this;
            }
            persistentHashMapBuilder.operationResult = valueAtKeyIndex(entryKeyIndex$runtime);
            if (valueAtKeyIndex(entryKeyIndex$runtime) == obj2) {
                return this;
            }
            if (endOfChain == persistentHashMapBuilder.ownership) {
                this.buffer[entryKeyIndex$runtime + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.modCount++;
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[entryKeyIndex$runtime + 1] = obj2;
            return new TrieNode(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.ownership);
        }
        if (!hasNodeAt(indexSegment)) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
            EndOfChain endOfChain3 = persistentHashMapBuilder.ownership;
            int entryKeyIndex$runtime2 = entryKeyIndex$runtime(indexSegment);
            Object[] objArr2 = this.buffer;
            if (endOfChain != endOfChain3) {
                return new TrieNode(this.dataMap | indexSegment, this.nodeMap, SizeKt.access$insertEntryAtIndex(objArr2, entryKeyIndex$runtime2, obj, obj2), endOfChain3);
            }
            this.buffer = SizeKt.access$insertEntryAtIndex(objArr2, entryKeyIndex$runtime2, obj, obj2);
            this.dataMap |= indexSegment;
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (i2 == 30) {
            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
            int i3 = step.first;
            int i4 = step.last;
            int i5 = step.step;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                persistentHashMapBuilder.operationResult = nodeAtIndex$runtime.valueAtKeyIndex(i3);
                if (nodeAtIndex$runtime.ownedBy == persistentHashMapBuilder.ownership) {
                    nodeAtIndex$runtime.buffer[i3 + 1] = obj2;
                    mutablePut = nodeAtIndex$runtime;
                } else {
                    persistentHashMapBuilder.modCount++;
                    Object[] objArr3 = nodeAtIndex$runtime.buffer;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    mutablePut = new TrieNode(0, 0, copyOf2, persistentHashMapBuilder.ownership);
                }
                persistentHashMapBuilder2 = persistentHashMapBuilder;
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size + 1);
            mutablePut = new TrieNode(0, 0, SizeKt.access$insertEntryAtIndex(nodeAtIndex$runtime.buffer, 0, obj, obj2), persistentHashMapBuilder.ownership);
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            mutablePut = nodeAtIndex$runtime.mutablePut(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
        }
        return nodeAtIndex$runtime == mutablePut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime, mutablePut, persistentHashMapBuilder2.ownership);
    }

    public final TrieNode mutablePutAll(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] objArr;
        TrieNode makeNode;
        if (this == trieNode) {
            deltaCounter.count += calculateSize();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            EndOfChain endOfChain = persistentHashMapBuilder.ownership;
            int i3 = trieNode.nodeMap;
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + trieNode.buffer.length);
            int length = this.buffer.length;
            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, trieNode.buffer.length));
            int i4 = step.first;
            int i5 = step.last;
            int i6 = step.step;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (collisionContainsKey(trieNode.buffer[i4])) {
                        deltaCounter.count++;
                    } else {
                        Object[] objArr3 = trieNode.buffer;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.buffer.length) {
                return length == trieNode.buffer.length ? trieNode : length == copyOf.length ? new TrieNode(0, 0, copyOf, endOfChain) : new TrieNode(0, 0, Arrays.copyOf(copyOf, length), endOfChain);
            }
        } else {
            int i7 = this.nodeMap | trieNode.nodeMap;
            int i8 = this.dataMap;
            int i9 = trieNode.dataMap;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.areEqual(this.buffer[entryKeyIndex$runtime(lowestOneBit)], trieNode.buffer[trieNode.entryKeyIndex$runtime(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            TrieNode trieNode2 = (Intrinsics.areEqual(this.ownedBy, persistentHashMapBuilder.ownership) && this.dataMap == i12 && this.nodeMap == i7) ? this : new TrieNode(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = trieNode2.buffer;
                int length2 = (objArr4.length - 1) - i14;
                if (hasNodeAt(lowestOneBit2)) {
                    makeNode = nodeAtIndex$runtime(nodeIndex$runtime(lowestOneBit2));
                    if (trieNode.hasNodeAt(lowestOneBit2)) {
                        makeNode = makeNode.mutablePutAll(trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(lowestOneBit2)), i + 5, deltaCounter, persistentHashMapBuilder);
                        objArr = objArr4;
                    } else if (trieNode.hasEntryAt$runtime(lowestOneBit2)) {
                        int entryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(lowestOneBit2);
                        Object obj = trieNode.buffer[entryKeyIndex$runtime];
                        Object valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime);
                        int i15 = persistentHashMapBuilder.size;
                        objArr = objArr4;
                        makeNode = makeNode.mutablePut(obj != null ? obj.hashCode() : i2, obj, valueAtKeyIndex, i + 5, persistentHashMapBuilder);
                        if (persistentHashMapBuilder.size == i15) {
                            deltaCounter.count++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (trieNode.hasNodeAt(lowestOneBit2)) {
                        TrieNode nodeAtIndex$runtime = trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(lowestOneBit2));
                        if (hasEntryAt$runtime(lowestOneBit2)) {
                            int entryKeyIndex$runtime2 = entryKeyIndex$runtime(lowestOneBit2);
                            Object obj2 = this.buffer[entryKeyIndex$runtime2];
                            int i16 = i + 5;
                            if (nodeAtIndex$runtime.containsKey(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                deltaCounter.count++;
                            } else {
                                makeNode = nodeAtIndex$runtime.mutablePut(obj2 != null ? obj2.hashCode() : 0, obj2, valueAtKeyIndex(entryKeyIndex$runtime2), i16, persistentHashMapBuilder);
                            }
                        }
                        makeNode = nodeAtIndex$runtime;
                    } else {
                        int entryKeyIndex$runtime3 = entryKeyIndex$runtime(lowestOneBit2);
                        Object obj3 = this.buffer[entryKeyIndex$runtime3];
                        Object valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime3);
                        int entryKeyIndex$runtime4 = trieNode.entryKeyIndex$runtime(lowestOneBit2);
                        Object obj4 = trieNode.buffer[entryKeyIndex$runtime4];
                        makeNode = makeNode(obj3 != null ? obj3.hashCode() : 0, obj3, valueAtKeyIndex2, obj4 != null ? obj4.hashCode() : 0, obj4, trieNode.valueAtKeyIndex(entryKeyIndex$runtime4), i + 5, persistentHashMapBuilder.ownership);
                    }
                }
                objArr[length2] = makeNode;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (trieNode.hasEntryAt$runtime(lowestOneBit3)) {
                    int entryKeyIndex$runtime5 = trieNode.entryKeyIndex$runtime(lowestOneBit3);
                    Object[] objArr5 = trieNode2.buffer;
                    objArr5[i18] = trieNode.buffer[entryKeyIndex$runtime5];
                    objArr5[i18 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime5);
                    if (hasEntryAt$runtime(lowestOneBit3)) {
                        deltaCounter.count++;
                    }
                } else {
                    int entryKeyIndex$runtime6 = entryKeyIndex$runtime(lowestOneBit3);
                    Object[] objArr6 = trieNode2.buffer;
                    objArr6[i18] = this.buffer[entryKeyIndex$runtime6];
                    objArr6[i18 + 1] = valueAtKeyIndex(entryKeyIndex$runtime6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!elementsIdentityEquals(trieNode2)) {
                return trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
            }
        }
        return this;
    }

    public final TrieNode mutableRemove(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        TrieNode mutableRemove;
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime]) && Intrinsics.areEqual(obj2, valueAtKeyIndex(entryKeyIndex$runtime))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (i2 == 30) {
            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
            int i3 = step.first;
            int i4 = step.last;
            int i5 = step.step;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3]) || !Intrinsics.areEqual(obj2, nodeAtIndex$runtime.valueAtKeyIndex(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        mutableRemove = nodeAtIndex$runtime.mutableCollisionRemoveEntryAtIndex(i3, persistentHashMapBuilder);
                        break;
                    }
                }
                persistentHashMapBuilder2 = persistentHashMapBuilder;
            }
            mutableRemove = nodeAtIndex$runtime;
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            mutableRemove = nodeAtIndex$runtime.mutableRemove(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
        }
        return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, persistentHashMapBuilder2.ownership);
    }

    public final TrieNode mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size - 1);
        persistentHashMapBuilder.operationResult = valueAtKeyIndex(i);
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.ownership) {
            return new TrieNode(i2 ^ this.dataMap, this.nodeMap, SizeKt.access$removeEntryAtIndex(i, objArr), persistentHashMapBuilder.ownership);
        }
        this.buffer = SizeKt.access$removeEntryAtIndex(i, objArr);
        this.dataMap ^= i2;
        return this;
    }

    public final TrieNode mutableReplaceNode(TrieNode trieNode, TrieNode trieNode2, int i, int i2, EndOfChain endOfChain) {
        EndOfChain endOfChain2 = this.ownedBy;
        if (trieNode2 != null) {
            return (endOfChain2 == endOfChain || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i, trieNode2, endOfChain) : this;
        }
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (endOfChain2 != endOfChain) {
            return new TrieNode(this.dataMap, this.nodeMap ^ i2, SizeKt.access$removeNodeAtIndex(i, objArr), endOfChain);
        }
        this.buffer = SizeKt.access$removeNodeAtIndex(i, objArr);
        this.nodeMap ^= i2;
        return this;
    }

    public final TrieNode mutableUpdateNodeAtIndex(int i, TrieNode trieNode, EndOfChain endOfChain) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == endOfChain) {
            objArr[i] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = trieNode;
        return new TrieNode(this.dataMap, this.nodeMap, copyOf, endOfChain);
    }

    public final TrieNode nodeAtIndex$runtime(int i) {
        Object obj = this.buffer[i];
        obj.getClass();
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime(int i) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.f1547array = updateNodeAtIndex(r11, r4, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode) r13.f1547array);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PriorityQueue put(int i, Object obj, Object obj2, int i2) {
        PriorityQueue put;
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (!Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime])) {
                return new PriorityQueue(new TrieNode(this.dataMap ^ indexSegment, this.nodeMap | indexSegment, bufferMoveEntryToNode(entryKeyIndex$runtime, indexSegment, i, obj, obj2, i2, null), null), 1);
            }
            if (valueAtKeyIndex(entryKeyIndex$runtime) != obj2) {
                Object[] objArr = this.buffer;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[entryKeyIndex$runtime + 1] = obj2;
                return new PriorityQueue(new TrieNode(this.dataMap, this.nodeMap, copyOf, null), 0);
            }
        } else {
            if (!hasNodeAt(indexSegment)) {
                return new PriorityQueue(new TrieNode(this.dataMap | indexSegment, this.nodeMap, SizeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(indexSegment), obj, obj2), null), 1);
            }
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (i2 == 30) {
                IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
                int i3 = step.first;
                int i4 = step.last;
                int i5 = step.step;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == nodeAtIndex$runtime.valueAtKeyIndex(i3)) {
                        put = null;
                    } else {
                        Object[] objArr2 = nodeAtIndex$runtime.buffer;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        put = new PriorityQueue(new TrieNode(0, 0, copyOf2, null), 0);
                    }
                }
                put = new PriorityQueue(new TrieNode(0, 0, SizeKt.access$insertEntryAtIndex(nodeAtIndex$runtime.buffer, 0, obj, obj2), null), 1);
                break;
            }
            put = nodeAtIndex$runtime.put(i, obj, obj2, i2 + 5);
        }
        return null;
    }

    public final TrieNode remove(int i, int i2, Object obj) {
        TrieNode remove;
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (!Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime])) {
                return this;
            }
            Object[] objArr = this.buffer;
            if (objArr.length != 2) {
                return new TrieNode(this.dataMap ^ indexSegment, this.nodeMap, SizeKt.access$removeEntryAtIndex(entryKeyIndex$runtime, objArr), null);
            }
        } else {
            if (!hasNodeAt(indexSegment)) {
                return this;
            }
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (i2 == 30) {
                IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
                int i3 = step.first;
                int i4 = step.last;
                int i5 = step.step;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = nodeAtIndex$runtime.buffer;
                    remove = objArr2.length == 2 ? null : new TrieNode(0, 0, SizeKt.access$removeEntryAtIndex(i3, objArr2), null);
                }
                remove = nodeAtIndex$runtime;
                break;
            }
            remove = nodeAtIndex$runtime.remove(i, i2 + 5, obj);
            if (remove != null) {
                return nodeAtIndex$runtime != remove ? updateNodeAtIndex(nodeIndex$runtime, indexSegment, remove) : this;
            }
            Object[] objArr3 = this.buffer;
            if (objArr3.length != 1) {
                return new TrieNode(this.dataMap, this.nodeMap ^ indexSegment, SizeKt.access$removeNodeAtIndex(nodeIndex$runtime, objArr3), null);
            }
        }
        return null;
    }

    public final TrieNode updateNodeAtIndex(int i, int i2, TrieNode trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = trieNode;
            return new TrieNode(this.dataMap, this.nodeMap, copyOf, null);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        int entryKeyIndex$runtime = entryKeyIndex$runtime(i2);
        Object[] objArr3 = this.buffer;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        ArraysKt___ArraysJvmKt.copyInto(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        ArraysKt___ArraysJvmKt.copyInto(entryKeyIndex$runtime + 2, entryKeyIndex$runtime, i, copyOf2, copyOf2);
        copyOf2[entryKeyIndex$runtime] = obj;
        copyOf2[entryKeyIndex$runtime + 1] = obj2;
        return new TrieNode(this.dataMap ^ i2, this.nodeMap ^ i2, copyOf2, null);
    }

    public final Object valueAtKeyIndex(int i) {
        return this.buffer[i + 1];
    }

    public final TrieNode mutableRemove(int i, Object obj, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode mutableRemove;
        int indexSegment = 1 << SizeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(obj, this.buffer[entryKeyIndex$runtime])) {
                return mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (i2 == 30) {
                IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, nodeAtIndex$runtime.buffer.length));
                int i3 = step.first;
                int i4 = step.last;
                int i5 = step.step;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!Intrinsics.areEqual(obj, nodeAtIndex$runtime.buffer[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    mutableRemove = nodeAtIndex$runtime.mutableCollisionRemoveEntryAtIndex(i3, persistentHashMapBuilder);
                }
                mutableRemove = nodeAtIndex$runtime;
                break;
            }
            mutableRemove = nodeAtIndex$runtime.mutableRemove(i, obj, i2 + 5, persistentHashMapBuilder);
            return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, persistentHashMapBuilder.ownership);
        }
        return this;
    }
}
