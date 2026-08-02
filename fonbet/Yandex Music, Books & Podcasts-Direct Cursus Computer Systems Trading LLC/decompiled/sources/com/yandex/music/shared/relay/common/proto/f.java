package com.yandex.music.shared.relay.common.proto;

import defpackage.itn;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class f extends o3d implements xzh {
    public static final f d;
    public static volatile j3d e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        f fVar = new f();
        d = fVar;
        o3d.registerDefaultInstance(f.class, fVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", "c"});
        }
        if (ordinal == 3) {
            return new f();
        }
        if (ordinal == 4) {
            return new itn(d);
        }
        if (ordinal == 5) {
            return d;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = e;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (f.class) {
            try {
                j3dVar = e;
                if (j3dVar == null) {
                    j3dVar = new j3d(d);
                    e = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
