package f8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class y extends l implements Map<String, l>, J7.a {
    public static final x Companion = new x();

    /* renamed from: n, reason: collision with root package name */
    public final Map f37545n;

    public y(Map content) {
        kotlin.jvm.internal.h.e(content, "content");
        this.f37545n = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l compute(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l computeIfAbsent(String str, Function<? super String, ? extends l> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l computeIfPresent(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.h.e(key, "key");
        return this.f37545n.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l value = (l) obj;
        kotlin.jvm.internal.h.e(value, "value");
        return this.f37545n.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, l>> entrySet() {
        return this.f37545n.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.h.a(this.f37545n, obj);
    }

    @Override // java.util.Map
    public final l get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.h.e(key, "key");
        return (l) this.f37545n.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f37545n.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f37545n.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f37545n.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l merge(String str, l lVar, BiFunction<? super l, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l put(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends l> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l putIfAbsent(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final l remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l replace(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f37545n.size();
    }

    public final String toString() {
        return AbstractC5119j.C(this.f37545n.entrySet(), ",", "{", "}", o.f37533v, 24);
    }

    @Override // java.util.Map
    public final Collection<l> values() {
        return this.f37545n.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, l lVar, l lVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
