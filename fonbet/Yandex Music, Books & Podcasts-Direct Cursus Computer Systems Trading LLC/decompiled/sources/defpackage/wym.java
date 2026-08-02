package defpackage;

import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.g;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class wym {
    public static final wym c = new wym();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final sld a = new sld(1);

    public final vto a(Class cls) {
        vto x;
        Class cls2;
        tse.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        vto vtoVar = (vto) concurrentHashMap.get(cls);
        if (vtoVar != null) {
            return vtoVar;
        }
        sld sldVar = this.a;
        sldVar.getClass();
        Class cls3 = g.a;
        if (!c.class.isAssignableFrom(cls) && (cls2 = g.a) != null && !cls2.isAssignableFrom(cls)) {
            xq0.x("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        cjn a = ((w8h) sldVar.b).a(cls);
        int i = a.d;
        d8 d8Var = a.a;
        if ((i & 2) == 2) {
            if (c.class.isAssignableFrom(cls)) {
                x = new f(g.d, e1c.a, d8Var);
            } else {
                okt oktVar = g.b;
                b1c b1cVar = e1c.b;
                if (b1cVar == null) {
                    xq0.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                x = new f(oktVar, b1cVar, d8Var);
            }
        } else if (c.class.isAssignableFrom(cls)) {
            x = (a.d & 1) == 1 ? e.x(a, d4j.b, u8g.b, g.d, e1c.a, w9h.b) : e.x(a, d4j.b, u8g.b, g.d, null, w9h.b);
        } else if ((a.d & 1) == 1) {
            a4j a4jVar = d4j.a;
            s8g s8gVar = u8g.a;
            okt oktVar2 = g.b;
            b1c b1cVar2 = e1c.b;
            if (b1cVar2 == null) {
                xq0.q("Protobuf runtime is not correctly loaded.");
                return null;
            }
            x = e.x(a, a4jVar, s8gVar, oktVar2, b1cVar2, w9h.a);
        } else {
            x = e.x(a, d4j.a, u8g.a, g.c, null, w9h.a);
        }
        vto vtoVar2 = (vto) concurrentHashMap.putIfAbsent(cls, x);
        return vtoVar2 != null ? vtoVar2 : x;
    }
}
