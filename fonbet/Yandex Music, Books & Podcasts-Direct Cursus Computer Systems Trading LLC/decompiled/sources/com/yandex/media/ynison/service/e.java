package com.yandex.media.ynison.service;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class e extends o3d implements xzh {
    private static final e DEFAULT_INSTANCE;
    public static final int KEEP_ALIVE_TIMEOUT_SECONDS_FIELD_NUMBER = 2;
    public static final int KEEP_ALIVE_TIME_SECONDS_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private int keepAliveTimeSeconds_;
    private int keepAliveTimeoutSeconds_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        o3d.registerDefaultInstance(e.class, eVar);
    }

    public static e f() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"keepAliveTimeSeconds_", "keepAliveTimeoutSeconds_"});
        }
        if (ordinal == 3) {
            return new e();
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
        synchronized (e.class) {
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

    public final int g() {
        return this.keepAliveTimeSeconds_;
    }

    public final int h() {
        return this.keepAliveTimeoutSeconds_;
    }
}
