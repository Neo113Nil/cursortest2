package com.yandex.music.shared.relay.common.proto;

import defpackage.j3d;
import defpackage.ltn;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class i extends o3d implements xzh {
    public static final i d;
    public static volatile j3d e;
    public int a;
    public c b;
    public w c;

    static {
        i iVar = new i();
        d = iVar;
        o3d.registerDefaultInstance(i.class, iVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        }
        if (ordinal == 3) {
            return new i();
        }
        if (ordinal == 4) {
            return new ltn(d);
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
        synchronized (i.class) {
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
