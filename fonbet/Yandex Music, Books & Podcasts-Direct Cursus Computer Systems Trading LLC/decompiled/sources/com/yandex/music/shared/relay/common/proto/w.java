package com.yandex.music.shared.relay.common.proto;

import defpackage.a0v;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.r9h;
import defpackage.rse;
import defpackage.tzu;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class w extends o3d implements xzh {
    public static final w i;
    public static volatile j3d j;
    public int a;
    public int b;
    public int c;
    public int d;
    public o g;
    public r9h h = r9h.b;
    public rse e = o3d.emptyProtobufList();
    public rse f = o3d.emptyProtobufList();

    static {
        w wVar = new w();
        i = wVar;
        o3d.registerDefaultInstance(w.class, wVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(i, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0002\u0000\u0001ဌ\u0000\u00022\u0003င\u0001\u0004င\u0002\u0005\u001b\u0006\u001b\u0007ဉ\u0003", new Object[]{"a", "b", "h", a0v.a, "c", "d", "e", g.class, "f", g.class, "g"});
        }
        if (ordinal == 3) {
            return new w();
        }
        if (ordinal == 4) {
            return new tzu(i);
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
        synchronized (w.class) {
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
