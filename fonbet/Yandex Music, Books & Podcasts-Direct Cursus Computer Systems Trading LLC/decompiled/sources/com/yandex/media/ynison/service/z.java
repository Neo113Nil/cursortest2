package com.yandex.media.ynison.service;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class z extends o3d implements xzh {
    private static final z DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 2;
    public static final int PLAYING_STATUS_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private y playable_;
    private c0 playingStatus_;
    private s0 version_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        o3d.registerDefaultInstance(z.class, zVar);
    }

    public static z f() {
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
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "playingStatus_", "playable_", "version_"});
        }
        if (ordinal == 3) {
            return new z();
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
        synchronized (z.class) {
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

    public final c0 g() {
        c0 c0Var = this.playingStatus_;
        return c0Var == null ? c0.k() : c0Var;
    }
}
