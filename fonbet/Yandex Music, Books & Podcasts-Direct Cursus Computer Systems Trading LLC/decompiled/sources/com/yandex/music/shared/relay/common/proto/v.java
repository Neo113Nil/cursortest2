package com.yandex.music.shared.relay.common.proto;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.wzu;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class v extends o3d implements xzh {
    public static final v c;
    public static volatile j3d d;
    public int a = 0;
    public Object b;

    static {
        v vVar = new v();
        c = vVar;
        o3d.registerDefaultInstance(v.class, vVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(c, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", u.class, q.class, r.class, s.class, t.class});
        }
        if (ordinal == 3) {
            return new v();
        }
        if (ordinal == 4) {
            return new wzu(c);
        }
        if (ordinal == 5) {
            return c;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = d;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (v.class) {
            try {
                j3dVar = d;
                if (j3dVar == null) {
                    j3dVar = new j3d(c);
                    d = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
