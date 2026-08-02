package androidx.datastore.migrations;

import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SharedPreferencesView {
    public final Set keySet;
    public final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences sharedPreferences, Set set) {
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.keySet = set;
    }

    public final void checkKey(String str) {
        Set set = this.keySet;
        if (set == null || set.contains(str)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("Can't access key outside migration: ", str));
    }

    public final LinkedHashMap getAll() {
        Map<String, ?> all = this.prefs.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final LinkedHashSet getStringSet(String str, EmptySet emptySet) {
        str.getClass();
        checkKey(str);
        Set<String> stringSet = this.prefs.getStringSet(str, emptySet);
        if (stringSet != null) {
            return CollectionsKt.toMutableSet(stringSet);
        }
        return null;
    }
}
