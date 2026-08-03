package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m7.g;
import o4.e;
import o4.h;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends h {
    @Override // o4.h
    public final e a(ArrayList arrayList) {
        Object newInstance;
        g gVar = new g(2);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Map unmodifiableMap = Collections.unmodifiableMap(((e) obj).f5206a);
            j.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj2 = hashMap.get(str);
                j.d(str, "key");
                if (obj2 != null) {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        j.d(value, "value");
                        int length = Array.getLength(obj2);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj2.getClass().getComponentType();
                        j.b(componentType);
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj2, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        j.d(newInstance2, "newArray");
                        value = newInstance2;
                        j.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    } else {
                        if (!j.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj2);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj2, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        j.d(newInstance, "newArray");
                        value = newInstance;
                        j.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    }
                } else if (cls.isArray()) {
                    j.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(cls, 1);
                    Array.set(newInstance, 0, value);
                    j.d(newInstance, "newArray");
                    value = newInstance;
                    j.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        gVar.t(hashMap);
        e eVar = new e((HashMap) gVar.f4957h);
        e.c(eVar);
        return eVar;
    }
}
