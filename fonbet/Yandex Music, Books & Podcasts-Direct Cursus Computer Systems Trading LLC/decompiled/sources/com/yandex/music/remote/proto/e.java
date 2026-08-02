package com.yandex.music.remote.proto;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class e extends o3d implements xzh {
    public static final e b;
    public static volatile j3d c;
    public rse a = o3d.emptyProtobufList();

    static {
        e eVar = new e();
        b = eVar;
        o3d.registerDefaultInstance(e.class, eVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        }
        if (ordinal == 3) {
            return new e();
        }
        if (ordinal == 4) {
            return new g3d(b);
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
        synchronized (e.class) {
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
