package com.yandex.music.shared.relay.common.proto;

import defpackage.j3d;
import defpackage.mtn;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class j extends o3d implements xzh {
    public static final j e;
    public static volatile j3d f;
    public int a;
    public boolean b;
    public i c;
    public h d;

    static {
        j jVar = new j();
        e = jVar;
        o3d.registerDefaultInstance(j.class, jVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new j();
        }
        if (ordinal == 4) {
            return new mtn(e);
        }
        if (ordinal == 5) {
            return e;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = f;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (j.class) {
            try {
                j3dVar = f;
                if (j3dVar == null) {
                    j3dVar = new j3d(e);
                    f = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
