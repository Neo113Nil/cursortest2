package com.yandex.music.shared.relay.common.proto;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.m4b;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class d extends o3d implements xzh {
    public static final d c;
    public static volatile j3d d;
    public int a = 0;
    public Object b;

    static {
        d dVar = new d();
        c = dVar;
        o3d.registerDefaultInstance(d.class, dVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(c, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"b", "a", b.class, k.class, m4b.class, e.class, l.class, m.class, n.class, com.yandex.music.remote.proto.g.class, m4b.class, m4b.class});
        }
        if (ordinal == 3) {
            return new d();
        }
        if (ordinal == 4) {
            return new g3d(c);
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
        synchronized (d.class) {
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
