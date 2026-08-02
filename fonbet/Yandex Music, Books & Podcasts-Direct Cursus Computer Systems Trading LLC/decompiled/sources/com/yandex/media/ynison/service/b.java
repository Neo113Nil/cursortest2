package com.yandex.media.ynison.service;

import defpackage.d08;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class b extends o3d implements xzh {
    public static final int CAN_BE_PLAYER_FIELD_NUMBER = 1;
    public static final int CAN_BE_REMOTE_CONTROLLER_FIELD_NUMBER = 2;
    private static final b DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int VOLUME_GRANULARITY_FIELD_NUMBER = 3;
    private boolean canBePlayer_;
    private boolean canBeRemoteController_;
    private int volumeGranularity_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        o3d.registerDefaultInstance(b.class, bVar);
    }

    public static void f(b bVar) {
        bVar.canBePlayer_ = true;
    }

    public static void g(b bVar) {
        bVar.canBeRemoteController_ = true;
    }

    public static void h(b bVar, int i) {
        bVar.volumeGranularity_ = i;
    }

    public static b k() {
        return DEFAULT_INSTANCE;
    }

    public static d08 m() {
        return (d08) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u000b", new Object[]{"canBePlayer_", "canBeRemoteController_", "volumeGranularity_"});
        }
        if (ordinal == 3) {
            return new b();
        }
        if (ordinal == 4) {
            return new d08(DEFAULT_INSTANCE);
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
        synchronized (b.class) {
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

    public final boolean i() {
        return this.canBePlayer_;
    }

    public final boolean j() {
        return this.canBeRemoteController_;
    }

    public final int l() {
        return this.volumeGranularity_;
    }
}
