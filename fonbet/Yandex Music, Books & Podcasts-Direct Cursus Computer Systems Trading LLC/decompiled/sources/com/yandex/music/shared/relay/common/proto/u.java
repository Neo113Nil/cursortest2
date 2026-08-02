package com.yandex.music.shared.relay.common.proto;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;
import defpackage.zzu;

/* loaded from: classes4.dex */
public final class u extends o3d implements xzh {
    public static final u d;
    public static volatile j3d e;
    public int a;
    public rse b = o3d.emptyProtobufList();
    public String c = "";

    static {
        u uVar = new u();
        d = uVar;
        o3d.registerDefaultInstance(u.class, uVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000", new Object[]{"a", "b", "c"});
        }
        if (ordinal == 3) {
            return new u();
        }
        if (ordinal == 4) {
            return new zzu(d);
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
        synchronized (u.class) {
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
