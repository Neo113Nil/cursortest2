package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.xfx;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;
import ru.yandex.video.m3.data.dto.PlaybackOptions;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0096\u0001J\u0011\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0004H\u0096\u0001J\u0013\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u0003H\u0096\u0003J\t\u0010$\u001a\u00020\u001fH\u0096\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/LoadSourceData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "", "", "", "playbackOptions", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "properties", "", "details", "(Lru/yandex/video/m3/data/dto/PlaybackOptions;Ljava/util/Map;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", CSPDirectoryConstants.SUBDIRECTORY_KEYS, "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "get", "isEmpty", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadSourceData extends DefaultEventData implements Map<String, Object>, xfx {
    public static final int $stable = 8;
    private String details;
    private final Map<String, Object> properties;

    public LoadSourceData(PlaybackOptions playbackOptions, Map<String, Object> map, String str) {
        super(null, 1, null);
        this.properties = map;
        this.details = str;
        map.put("autoPlay", Boolean.valueOf(playbackOptions.getAutoPlay()));
        Long startPosition = playbackOptions.getStartPosition();
        if (startPosition != null) {
            map.put("startPosition", Long.valueOf(startPosition.longValue()));
        }
        String details = getDetails();
        if (details != null) {
            map.put("details", details);
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        return this.properties.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData
    public String getDetails() {
        return this.details;
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        return this.properties.entrySet();
    }

    public Set<String> getKeys() {
        return this.properties.keySet();
    }

    public int getSize() {
        return this.properties.size();
    }

    public Collection<Object> getValues() {
        return this.properties.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.properties.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData
    public void setDetails(String str) {
        this.details = str;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public Object compute2(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public Object computeIfAbsent2(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public Object computeIfPresent2(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public Object merge2(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public Object put2(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public Object putIfAbsent2(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public Object replace2(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(String key) {
        return this.properties.containsKey(key);
    }

    public Object get(String key) {
        return this.properties.get(key);
    }

    public /* synthetic */ LoadSourceData(PlaybackOptions playbackOptions, Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(playbackOptions, map, (i & 4) != 0 ? null : str);
    }
}
