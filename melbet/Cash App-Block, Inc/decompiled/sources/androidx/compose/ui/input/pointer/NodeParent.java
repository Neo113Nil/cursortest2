package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.gms.tasks.zzr;

/* loaded from: classes.dex */
public class NodeParent {
    public final MutableVector children = new MutableVector(0, new Node[16]);
    public final MutableObjectList removeMatchingPointerInputModifierNodeList = new MutableObjectList(10);

    public boolean buildCache(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, zzr zzrVar, boolean z) {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((Node) objArr[i2]).buildCache(longSparseArray, layoutCoordinates, zzrVar, z) || z2;
        }
        return z2;
    }

    public void cleanUpHits(zzr zzrVar) {
        MutableVector mutableVector = this.children;
        int i = mutableVector.size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((Node) mutableVector.content[i]).pointerIds.isEmpty()) {
                mutableVector.removeAt(i);
            }
        }
    }
}
