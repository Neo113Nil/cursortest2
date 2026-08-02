package com.yandex.music.remote.proto;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class a extends o3d implements xzh {
    public static final a c;
    public static volatile j3d d;
    public int a;
    public String b = "";

    static {
        a aVar = new a();
        c = aVar;
        o3d.registerDefaultInstance(a.class, aVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
        }
        if (ordinal == 3) {
            return new a();
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
        synchronized (a.class) {
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
