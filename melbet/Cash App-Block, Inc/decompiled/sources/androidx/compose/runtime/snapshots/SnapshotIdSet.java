package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import coil3.memory.MemoryCacheService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;

/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable, KMappedMarker {
    public static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    public final long[] belowBound;
    public final long lowerBound;
    public final long lowerSet;
    public final long upperSet;

    public SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        SnapshotIdSet snapshotIdSet2 = this;
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (snapshotIdSet == snapshotIdSet3) {
            return snapshotIdSet2;
        }
        if (snapshotIdSet2 == snapshotIdSet3) {
            return snapshotIdSet3;
        }
        long j = snapshotIdSet.lowerBound;
        long j2 = snapshotIdSet.lowerBound;
        long[] jArr2 = snapshotIdSet.belowBound;
        long j3 = snapshotIdSet.lowerSet;
        long j4 = snapshotIdSet.upperSet;
        long j5 = snapshotIdSet2.lowerBound;
        if (j == j5 && jArr2 == (jArr = snapshotIdSet2.belowBound)) {
            return new SnapshotIdSet(snapshotIdSet2.upperSet & (~j4), snapshotIdSet2.lowerSet & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                snapshotIdSet2 = snapshotIdSet2.clear(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.clear(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.clear(i2 + j2 + 64);
                }
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet clear(long j) {
        long[] jArr;
        int binarySearch;
        long[] jArr2;
        long j2 = j - this.lowerBound;
        if (Intrinsics.compare(j2, 0L) >= 0 && Intrinsics.compare(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.lowerSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(this.upperSet, j4 & (~j3), this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j2, 64L) >= 0 && Intrinsics.compare(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.upperSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(j6 & (~j5), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j2, 0L) < 0 && (jArr = this.belowBound) != null && (binarySearch = SnapshotId_jvmKt.binarySearch(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (binarySearch > 0) {
                    ArraysKt___ArraysJvmKt.copyInto(0, jArr, 0, jArr3, binarySearch);
                }
                if (binarySearch < i) {
                    ArraysKt___ArraysJvmKt.copyInto(binarySearch, jArr, binarySearch + 1, jArr3, length);
                }
                jArr2 = jArr3;
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, jArr2);
        }
        return this;
    }

    public final boolean get(long j) {
        long[] jArr;
        long j2 = j - this.lowerBound;
        return (Intrinsics.compare(j2, 0L) < 0 || Intrinsics.compare(j2, 64L) >= 0) ? (Intrinsics.compare(j2, 64L) < 0 || Intrinsics.compare(j2, 128L) >= 0) ? Intrinsics.compare(j2, 0L) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j2)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new SnapshotIdSet$iterator$1(this, null));
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3 = this;
        SnapshotIdSet snapshotIdSet4 = EMPTY;
        if (snapshotIdSet == snapshotIdSet4) {
            return snapshotIdSet3;
        }
        if (snapshotIdSet3 == snapshotIdSet4) {
            return snapshotIdSet;
        }
        long j = snapshotIdSet.lowerBound;
        long j2 = snapshotIdSet.lowerBound;
        long[] jArr2 = snapshotIdSet.belowBound;
        long j3 = snapshotIdSet.lowerSet;
        long j4 = snapshotIdSet.upperSet;
        long j5 = snapshotIdSet3.lowerBound;
        long j6 = snapshotIdSet3.lowerSet;
        long j7 = snapshotIdSet3.upperSet;
        if (j == j5 && jArr2 == (jArr = snapshotIdSet3.belowBound)) {
            return new SnapshotIdSet(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = snapshotIdSet3.belowBound;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    snapshotIdSet3 = snapshotIdSet3.set(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        snapshotIdSet3 = snapshotIdSet3.set(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        snapshotIdSet3 = snapshotIdSet3.set(i + j2 + 64);
                    }
                    i++;
                }
            }
            return snapshotIdSet3;
        }
        if (jArr3 != null) {
            snapshotIdSet2 = snapshotIdSet;
            for (long j9 : jArr3) {
                snapshotIdSet2 = snapshotIdSet2.set(j9);
            }
        } else {
            snapshotIdSet2 = snapshotIdSet;
        }
        long j10 = snapshotIdSet3.lowerBound;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(i + j10 + 64);
                }
                i++;
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet set(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.lowerBound;
        long j6 = j - j5;
        long j7 = 0;
        int compare = Intrinsics.compare(j6, 0L);
        long j8 = this.lowerSet;
        if (compare < 0 || Intrinsics.compare(j6, 64L) >= 0) {
            int compare2 = Intrinsics.compare(j6, 64L);
            long j9 = this.upperSet;
            int i2 = 64;
            if (compare2 < 0 || Intrinsics.compare(j6, 128L) >= 0) {
                int compare3 = Intrinsics.compare(j6, 128L);
                long[] jArr3 = this.belowBound;
                if (compare3 < 0) {
                    if (jArr3 == null) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{j});
                    }
                    int binarySearch = SnapshotId_jvmKt.binarySearch(jArr3, j);
                    if (binarySearch < 0) {
                        int i3 = -(binarySearch + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        ArraysKt___ArraysJvmKt.copyInto(0, jArr3, 0, jArr4, i3);
                        ArraysKt___ArraysJvmKt.copyInto(i3 + 1, jArr3, i3, jArr4, length);
                        jArr4[i3] = j;
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, jArr4);
                    }
                } else if (!get(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (Intrinsics.compare(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    MemoryCacheService memoryCacheService = null;
                    while (true) {
                        if (Intrinsics.compare(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (memoryCacheService == null) {
                                memoryCacheService = new MemoryCacheService(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((MutableLongList) memoryCacheService.imageLoader).add(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (memoryCacheService != null) {
                        MutableLongList mutableLongList = (MutableLongList) memoryCacheService.imageLoader;
                        int i5 = mutableLongList._size;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = mutableLongList.content;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new SnapshotIdSet(j11, j3, j2, jArr).set(j);
                        }
                    }
                    jArr = jArr3;
                    return new SnapshotIdSet(j11, j3, j2, jArr).set(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new SnapshotIdSet(j9 | j13, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new SnapshotIdSet(this.upperSet, j8 | j14, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
