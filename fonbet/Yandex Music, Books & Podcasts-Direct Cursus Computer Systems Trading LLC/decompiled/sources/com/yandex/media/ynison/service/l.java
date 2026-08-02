package com.yandex.media.ynison.service;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class l extends o3d implements xzh {
    private static final l DEFAULT_INSTANCE;
    private static volatile n7k PARSER;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        o3d.registerDefaultInstance(l.class, lVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", new Object[0]);
        }
        if (ordinal == 3) {
            return new l();
        }
        if (ordinal == 4) {
            return new g3d(DEFAULT_INSTANCE);
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        n7k n7kVar2 = PARSER;
        if (n7kVar2 != null) {
            return n7kVar2;
        }
        synchronized (l.class) {
            try {
                n7kVar = PARSER;
                if (n7kVar == null) {
                    n7kVar = new j3d(DEFAULT_INSTANCE);
                    PARSER = n7kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n7kVar;
    }
}
