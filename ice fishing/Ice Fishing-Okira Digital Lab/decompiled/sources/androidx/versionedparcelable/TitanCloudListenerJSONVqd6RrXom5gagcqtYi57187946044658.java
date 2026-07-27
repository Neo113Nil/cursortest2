package androidx.versionedparcelable;

import java.util.ListIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class TitanCloudListenerJSONVqd6RrXom5gagcqtYi57187946044658 implements ListIterator, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public TitanCloudListenerJSONVqd6RrXom5gagcqtYi57187946044658(int i, int i2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 < this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
