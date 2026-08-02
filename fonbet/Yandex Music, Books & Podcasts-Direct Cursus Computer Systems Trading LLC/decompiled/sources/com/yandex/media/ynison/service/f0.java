package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.vpn;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class f0 extends o3d implements xzh {
    private static final f0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER;

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        o3d.registerDefaultInstance(f0.class, f0Var);
    }

    public static f0 f() {
        return DEFAULT_INSTANCE;
    }

    public static vpn g() {
        return (vpn) DEFAULT_INSTANCE.createBuilder();
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
            return new f0();
        }
        if (ordinal == 4) {
            return new vpn(DEFAULT_INSTANCE);
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
        synchronized (f0.class) {
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
