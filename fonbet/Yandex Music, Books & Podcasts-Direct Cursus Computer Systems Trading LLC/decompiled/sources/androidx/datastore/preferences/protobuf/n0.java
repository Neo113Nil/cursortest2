package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import defpackage.uym;
import defpackage.wzh;
import defpackage.xq0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class n0 {
    public static final n0 c = new n0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final z a = new z();

    public final r0 a(Class cls) {
        r0 w;
        Class cls2;
        u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        r0 r0Var = (r0) concurrentHashMap.get(cls);
        if (r0Var != null) {
            return r0Var;
        }
        z zVar = this.a;
        zVar.getClass();
        Class cls3 = s0.a;
        if (!s.class.isAssignableFrom(cls) && (cls2 = s0.a) != null && !cls2.isAssignableFrom(cls)) {
            xq0.x("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        e0 a = zVar.a.a(cls);
        p0 p0Var = (p0) a;
        int i = p0Var.d;
        wzh wzhVar = p0Var.a;
        if ((i & 2) != 2) {
            boolean isAssignableFrom = s.class.isAssignableFrom(cls);
            uym uymVar = uym.b;
            uym uymVar2 = uym.a;
            if (isAssignableFrom) {
                if ((p0Var.d & 1) == 1) {
                    uymVar = uymVar2;
                }
                w = uymVar == uymVar2 ? h0.w(a, l0.b, x.b, s0.d, o.a, d0.b) : h0.w(a, l0.b, x.b, s0.d, null, d0.b);
            } else {
                if ((p0Var.d & 1) == 1) {
                    uymVar = uymVar2;
                }
                if (uymVar == uymVar2) {
                    j0 j0Var = l0.a;
                    x.a aVar = x.a;
                    x0 x0Var = s0.b;
                    m mVar = o.b;
                    if (mVar == null) {
                        xq0.q("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    w = h0.w(a, j0Var, aVar, x0Var, mVar, d0.a);
                } else {
                    w = h0.w(a, l0.a, x.a, s0.c, null, d0.a);
                }
            }
        } else if (s.class.isAssignableFrom(cls)) {
            w = new i0(s0.d, o.a, wzhVar);
        } else {
            x0 x0Var2 = s0.b;
            m mVar2 = o.b;
            if (mVar2 == null) {
                xq0.q("Protobuf runtime is not correctly loaded.");
                return null;
            }
            w = new i0(x0Var2, mVar2, wzhVar);
        }
        r0 r0Var2 = (r0) concurrentHashMap.putIfAbsent(cls, w);
        return r0Var2 != null ? r0Var2 : w;
    }
}
