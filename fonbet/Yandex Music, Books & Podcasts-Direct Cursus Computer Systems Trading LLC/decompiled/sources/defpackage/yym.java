package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class yym {
    public static final yym c = new yym();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final bnd a = new bnd(1);

    public final wto a(Class cls) {
        c1c c1cVar;
        wto B;
        Class cls2;
        use.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        wto wtoVar = (wto) concurrentHashMap.get(cls);
        if (wtoVar != null) {
            return wtoVar;
        }
        bnd bndVar = this.a;
        bndVar.getClass();
        Class cls3 = auo.a;
        if (!o3d.class.isAssignableFrom(cls) && (cls2 = auo.a) != null && !cls2.isAssignableFrom(cls)) {
            xq0.x("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        djn a = ((x8h) bndVar.b).a(cls);
        int i = a.d;
        vzh vzhVar = a.a;
        if ((i & 2) == 2) {
            if (o3d.class.isAssignableFrom(cls)) {
                B = new a0i(auo.c, f1c.a, vzhVar);
            } else {
                nkt nktVar = auo.b;
                c1c c1cVar2 = f1c.b;
                if (c1cVar2 == null) {
                    xq0.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                B = new a0i(nktVar, c1cVar2, vzhVar);
            }
        } else if (o3d.class.isAssignableFrom(cls)) {
            b4j b4jVar = e4j.b;
            v8g v8gVar = x8g.b;
            nkt nktVar2 = auo.c;
            c1c c1cVar3 = ouj.D(a.a()) != 1 ? f1c.a : null;
            u9h u9hVar = x9h.b;
            if (!(a instanceof djn)) {
                int[] iArr = zzh.n;
                a.getClass();
                l1j.f();
                return null;
            }
            B = zzh.B(a, b4jVar, v8gVar, nktVar2, c1cVar3, u9hVar);
        } else {
            b4j b4jVar2 = e4j.a;
            v8g v8gVar2 = x8g.a;
            nkt nktVar3 = auo.b;
            if (ouj.D(a.a()) != 1) {
                c1c c1cVar4 = f1c.b;
                if (c1cVar4 == null) {
                    xq0.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c1cVar = c1cVar4;
            } else {
                c1cVar = null;
            }
            u9h u9hVar2 = x9h.a;
            if (!(a instanceof djn)) {
                int[] iArr2 = zzh.n;
                a.getClass();
                l1j.f();
                return null;
            }
            B = zzh.B(a, b4jVar2, v8gVar2, nktVar3, c1cVar, u9hVar2);
        }
        wto wtoVar2 = (wto) concurrentHashMap.putIfAbsent(cls, B);
        return wtoVar2 != null ? wtoVar2 : B;
    }
}
