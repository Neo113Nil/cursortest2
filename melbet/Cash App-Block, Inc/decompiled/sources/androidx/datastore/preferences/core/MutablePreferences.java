package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MutablePreferences extends Preferences {
    public final Extras.Key frozen;
    public final LinkedHashMap preferencesMap;

    public MutablePreferences(LinkedHashMap linkedHashMap, boolean z) {
        this.preferencesMap = linkedHashMap;
        Extras.Key key = new Extras.Key();
        key.f61default = new AtomicBoolean(z);
        this.frozen = key;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Map asMap() {
        Pair pair;
        Set<Map.Entry> entrySet = this.preferencesMap.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.first, pair.second);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (((AtomicBoolean) this.frozen.f61default).get()) {
            a$$ExternalSyntheticBUOutline0.m$1("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof MutablePreferences) {
            LinkedHashMap linkedHashMap = ((MutablePreferences) obj).preferencesMap;
            LinkedHashMap linkedHashMap2 = this.preferencesMap;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = Intrinsics.areEqual(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Object get(Preferences.Key key) {
        key.getClass();
        Object obj = this.preferencesMap.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int hashCode() {
        Iterator it = this.preferencesMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final void remove(Preferences.Key key) {
        key.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.remove(key);
    }

    public final void set(Preferences.Key key, Object obj) {
        key.getClass();
        setUnchecked$datastore_preferences_core_release(key, obj);
    }

    public final void setUnchecked$datastore_preferences_core_release(Preferences.Key key, Object obj) {
        key.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        if (obj == null) {
            remove(key);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.preferencesMap;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(key, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(key, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, MutablePreferences$toString$1.INSTANCE, 24);
    }

    public /* synthetic */ MutablePreferences(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
