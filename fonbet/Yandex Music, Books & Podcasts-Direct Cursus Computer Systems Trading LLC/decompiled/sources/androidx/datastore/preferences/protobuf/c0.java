package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import defpackage.hrg;
import defpackage.s9h;
import java.util.Map;

/* loaded from: classes.dex */
class c0 implements b0 {
    public final int a(int i, Object obj, Object obj2) {
        s9h s9hVar = (s9h) obj;
        a0 a0Var = (a0) obj2;
        int i2 = 0;
        if (s9hVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : s9hVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            a0Var.getClass();
            int i3 = j.i(i);
            a0.a aVar = a0Var.a;
            int a = p.a(aVar.a, 1, key) + p.a(aVar.b, 2, value);
            i2 = hrg.h(a, a, i3, i2);
        }
        return i2;
    }

    public final s9h b(Object obj, Object obj2) {
        s9h s9hVar = (s9h) obj;
        s9h s9hVar2 = (s9h) obj2;
        if (!s9hVar2.isEmpty()) {
            if (!s9hVar.a) {
                s9hVar = s9hVar.c();
            }
            s9hVar.b();
            if (!s9hVar2.isEmpty()) {
                s9hVar.putAll(s9hVar2);
            }
        }
        return s9hVar;
    }
}
