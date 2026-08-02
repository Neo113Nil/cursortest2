package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.composer.GroupInfo;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class GapPending {
    public int groupIndex;
    public final MutableIntObjectMap groupInfos;
    public final ArrayList keyInfos;
    public final Lazy keyMap$delegate;
    public final int startIndex;
    public final ArrayList usedKeys;

    public GapPending(int i, ArrayList arrayList) {
        this.keyInfos = arrayList;
        this.startIndex = i;
        if (i < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = (KeyInfo) this.keyInfos.get(i3);
            int i4 = keyInfo.location;
            int i5 = keyInfo.nodes;
            mutableIntObjectMap.set(i4, new GroupInfo(i3, i2, i5));
            i2 += i5;
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap$delegate = LazyKt.lazy(new GapPending$keyMap$2(this, 0));
    }

    public final boolean updateNodeCount(int i, int i2) {
        GroupInfo groupInfo;
        int i3;
        int i4;
        MutableIntObjectMap mutableIntObjectMap = this.groupInfos;
        GroupInfo groupInfo2 = (GroupInfo) mutableIntObjectMap.get(i);
        if (groupInfo2 == null) {
            return false;
        }
        int i5 = groupInfo2.nodeIndex;
        int i6 = i2 - groupInfo2.nodeCount;
        groupInfo2.nodeCount = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (groupInfo = (GroupInfo) objArr[(i7 << 3) + i9]).nodeIndex) >= i5 && groupInfo != groupInfo2 && (i4 = i3 + i6) >= 0) {
                        groupInfo.nodeIndex = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
