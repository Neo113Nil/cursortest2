package androidx.work;

import J0.g;
import J0.j;
import i1.C4585b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends j {
    @Override // J0.j
    public final g a(ArrayList arrayList) {
        Object newArray;
        C4585b c4585b = new C4585b(9);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f1419a);
            h.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                h.d(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        h.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        h.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        h.d(newArray2, "newArray");
                        value = newArray2;
                        h.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        if (!h.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        h.d(newArray, "newArray");
                        value = newArray;
                        h.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else if (cls.isArray()) {
                    h.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    h.d(newArray, "newArray");
                    value = newArray;
                    h.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(key, value);
                }
            }
        }
        c4585b.s(hashMap);
        g gVar = new g((HashMap) c4585b.f38152u);
        g.c(gVar);
        return gVar;
    }
}
