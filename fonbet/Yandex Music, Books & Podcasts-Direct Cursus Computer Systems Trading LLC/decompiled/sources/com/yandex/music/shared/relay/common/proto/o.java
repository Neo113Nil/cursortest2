package com.yandex.music.shared.relay.common.proto;

import defpackage.j3d;
import defpackage.mse;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.veq;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class o extends o3d implements xzh {
    public static final o b;
    public static volatile j3d c;
    public mse a = o3d.emptyIntList();

    static {
        o oVar = new o();
        b = oVar;
        o3d.registerDefaultInstance(o.class, oVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001+", new Object[]{"a"});
        }
        if (ordinal == 3) {
            return new o();
        }
        if (ordinal == 4) {
            return new veq(b);
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = c;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (o.class) {
            try {
                j3dVar = c;
                if (j3dVar == null) {
                    j3dVar = new j3d(b);
                    c = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
