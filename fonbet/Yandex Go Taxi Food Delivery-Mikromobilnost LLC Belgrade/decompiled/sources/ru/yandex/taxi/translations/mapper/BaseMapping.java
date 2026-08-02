package ru.yandex.taxi.translations.mapper;

import defpackage.dz01;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/translations/mapper/BaseMapping;", "Ljava/util/HashMap;", "", "Ldz01;", "Lkotlin/collections/HashMap;", "", "keySetName", "Ljava/lang/String;", "translations"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class BaseMapping extends HashMap<Integer, dz01> {
    private final String keySetName;

    public BaseMapping(String str) {
        this.keySetName = str;
    }

    public final void a(int i, String str) {
        put(Integer.valueOf(i), new dz01(this.keySetName, str));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Integer) {
            return super.containsKey((Integer) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof dz01) {
            return super.containsValue((dz01) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof Integer) {
            return (dz01) super.get((Integer) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Integer) ? obj2 : (dz01) super.getOrDefault((Integer) obj, (dz01) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof Integer) && (obj2 instanceof dz01)) {
            return super.remove((Integer) obj, (dz01) obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof Integer) {
            return (dz01) super.remove((Integer) obj);
        }
        return null;
    }
}
