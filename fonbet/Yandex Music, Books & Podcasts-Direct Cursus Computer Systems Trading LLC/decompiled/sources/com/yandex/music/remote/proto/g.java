package com.yandex.music.remote.proto;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class g extends o3d implements xzh {
    public static final g i;
    public static volatile j3d j;
    public int a;
    public boolean b;
    public int d;
    public boolean e;
    public int f;
    public f g;
    public String c = "";
    public String h = "";

    static {
        g gVar = new g();
        i = gVar;
        o3d.registerDefaultInstance(g.class, gVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(i, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဉ\u0005\u0006ለ\u0006\u0007ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "h", "f"});
        }
        if (ordinal == 3) {
            return new g();
        }
        if (ordinal == 4) {
            return new g3d(i);
        }
        if (ordinal == 5) {
            return i;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = j;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (g.class) {
            try {
                j3dVar = j;
                if (j3dVar == null) {
                    j3dVar = new j3d(i);
                    j = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
