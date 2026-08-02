package kotlinx.serialization.json;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.mdx;
import defpackage.p0u;
import defpackage.xfx;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@gsq0(with = mdx.class)
/* loaded from: classes9.dex */
public final class c extends b implements Map<String, b>, xfx {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();
    public final Map a;

    public c(Map map) {
        this.a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b compute(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfAbsent(String str, Function<? super String, ? extends b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfPresent(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.containsValue((b) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, b>> entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return jl40.l(this.a, obj);
    }

    @Override // java.util.Map
    public final b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (b) this.a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b merge(String str, b bVar, BiFunction<? super b, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b put(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b putIfAbsent(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b replace(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return kotlin.collections.a.X(this.a.entrySet(), ",", "{", "}", new p0u(10), 24);
    }

    @Override // java.util.Map
    public final Collection<b> values() {
        return this.a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, b bVar, b bVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
