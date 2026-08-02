package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class si10 implements IKeyStorage {
    public final HashMap a = new HashMap();

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean getBoolean(String str, boolean z) {
        Object obj = this.a.get(str);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final float getFloat(String str, float f) {
        Object obj = this.a.get(str);
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final int getInt(String str, int i) {
        Object obj = this.a.get(str);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        return num != null ? num.intValue() : i;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final long getLong(String str, long j) {
        Object obj = this.a.get(str);
        Long l = obj instanceof Long ? (Long) obj : null;
        return l != null ? l.longValue() : j;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final String getString(String str, String str2) {
        Object obj = this.a.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final Set getStringSet(String str, Set set) {
        Object obj = this.a.get(str);
        if (obj == null) {
            obj = set;
        }
        return obj instanceof Set ? ym11.d(obj) : set;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean hasKey(String str) {
        return this.a.containsKey(str);
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean initialize() {
        return true;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putBoolean(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putFloat(String str, float f) {
        this.a.put(str, Float.valueOf(f));
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putInt(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putLong(String str, long j) {
        this.a.put(str, Long.valueOf(j));
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putString(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putStringSet(String str, Set set) {
        this.a.put(str, set);
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean release() {
        removeAll();
        return true;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage remove(String str) {
        this.a.remove(str);
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage removeAll() {
        this.a.clear();
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage removeAllWith(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (evu0.y((CharSequence) entry.getKey(), str, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashMap.remove((String) it2.next());
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage save() {
        return this;
    }
}
