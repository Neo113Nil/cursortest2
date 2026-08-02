package androidx.compose.runtime.snapshots;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes3.dex */
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry, KMutableMap.Entry {
    public final Object key;
    public final /* synthetic */ StateMapMutableKeysIterator this$0;
    public Object value;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableKeysIterator stateMapMutableKeysIterator) {
        this.this$0 = stateMapMutableKeysIterator;
        Map.Entry entry = stateMapMutableKeysIterator.current;
        entry.getClass();
        this.key = entry.getKey();
        Map.Entry entry2 = stateMapMutableKeysIterator.current;
        entry2.getClass();
        this.value = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        StateMapMutableKeysIterator stateMapMutableKeysIterator = this.this$0;
        SnapshotStateMap snapshotStateMap = stateMapMutableKeysIterator.map;
        if (snapshotStateMap.getReadable$runtime().modification != stateMapMutableKeysIterator.modification) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        Object obj2 = this.value;
        snapshotStateMap.put(this.key, obj);
        this.value = obj;
        return obj2;
    }
}
