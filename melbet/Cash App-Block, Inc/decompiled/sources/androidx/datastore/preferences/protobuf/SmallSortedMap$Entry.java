package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes3.dex */
public final class SmallSortedMap$Entry implements Map.Entry, Comparable {
    public final Comparable key;
    public final /* synthetic */ SmallSortedMap$1 this$0;
    public Object value;

    public SmallSortedMap$Entry(SmallSortedMap$1 smallSortedMap$1, Map.Entry entry) {
        this(smallSortedMap$1, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.key.compareTo(((SmallSortedMap$Entry) obj).key);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.key;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.value;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Comparable getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.key;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.this$0.checkMutable();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        return this.key + "=" + this.value;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.key;
    }

    public SmallSortedMap$Entry(SmallSortedMap$1 smallSortedMap$1, Comparable comparable, Object obj) {
        this.this$0 = smallSortedMap$1;
        this.key = comparable;
        this.value = obj;
    }
}
