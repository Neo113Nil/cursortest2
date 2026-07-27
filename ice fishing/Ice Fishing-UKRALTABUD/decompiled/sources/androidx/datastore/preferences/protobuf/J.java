package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class J {
    public static int a(int i2, Object obj, Object obj2) {
        I i3 = (I) obj;
        H h2 = (H) obj2;
        int i4 = 0;
        if (!i3.isEmpty()) {
            for (Map.Entry entry : i3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                h2.getClass();
                int k0 = C0083m.k0(i2);
                int a2 = H.a(h2.f1359a, key, value);
                i4 += C0083m.m0(a2) + a2 + k0;
            }
        }
        return i4;
    }

    public static I b(Object obj, Object obj2) {
        I i2 = (I) obj;
        I i3 = (I) obj2;
        if (!i3.isEmpty()) {
            if (!i2.f1361f) {
                i2 = i2.b();
            }
            i2.a();
            if (!i3.isEmpty()) {
                i2.putAll(i3);
            }
        }
        return i2;
    }

    public static void c(Object obj) {
        ((I) obj).f1361f = false;
    }
}
