package defpackage;

import androidx.glance.appwidget.protobuf.a;
import androidx.glance.appwidget.protobuf.b;
import androidx.glance.appwidget.protobuf.d;
import androidx.glance.appwidget.protobuf.e;
import androidx.glance.appwidget.protobuf.f;
import androidx.glance.appwidget.protobuf.g;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zym {
    public static final zym c = new zym();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final rp7 a = new rp7(1);

    public final xto a(Class cls) {
        d1c d1cVar;
        xto w;
        Class cls2;
        vse.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        xto xtoVar = (xto) concurrentHashMap.get(cls);
        if (xtoVar != null) {
            return xtoVar;
        }
        rp7 rp7Var = this.a;
        rp7Var.getClass();
        Class cls3 = f.a;
        if (!b.class.isAssignableFrom(cls) && (cls2 = f.a) != null && !cls2.isAssignableFrom(cls)) {
            xq0.x("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        ejn a = ((y8h) rp7Var.a).a(cls);
        int i = a.d;
        a aVar = a.a;
        if ((i & 2) == 2) {
            if (b.class.isAssignableFrom(cls)) {
                w = new e(f.c, g1c.a, aVar);
            } else {
                g gVar = f.b;
                d1c d1cVar2 = g1c.b;
                if (d1cVar2 == null) {
                    xq0.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new e(gVar, d1cVar2, aVar);
            }
        } else if (b.class.isAssignableFrom(cls)) {
            c4j c4jVar = f4j.b;
            w8g w8gVar = y8g.b;
            g gVar2 = f.c;
            d1c d1cVar3 = ouj.D(a.a()) != 1 ? g1c.a : null;
            v9h v9hVar = y9h.b;
            if (!(a instanceof ejn)) {
                int[] iArr = d.n;
                a.getClass();
                l1j.f();
                return null;
            }
            w = d.w(a, c4jVar, w8gVar, gVar2, d1cVar3, v9hVar);
        } else {
            c4j c4jVar2 = f4j.a;
            w8g w8gVar2 = y8g.a;
            g gVar3 = f.b;
            if (ouj.D(a.a()) != 1) {
                d1c d1cVar4 = g1c.b;
                if (d1cVar4 == null) {
                    xq0.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                d1cVar = d1cVar4;
            } else {
                d1cVar = null;
            }
            v9h v9hVar2 = y9h.a;
            if (!(a instanceof ejn)) {
                int[] iArr2 = d.n;
                a.getClass();
                l1j.f();
                return null;
            }
            w = d.w(a, c4jVar2, w8gVar2, gVar3, d1cVar, v9hVar2);
        }
        xto xtoVar2 = (xto) concurrentHashMap.putIfAbsent(cls, w);
        return xtoVar2 != null ? xtoVar2 : w;
    }
}
