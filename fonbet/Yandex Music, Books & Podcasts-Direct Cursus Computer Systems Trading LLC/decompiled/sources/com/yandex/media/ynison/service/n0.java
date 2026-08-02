package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.mnt;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class n0 extends o3d implements xzh {
    private static final n0 DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int IS_CURRENTLY_ACTIVE_FIELD_NUMBER = 2;
    private static volatile n7k PARSER = null;
    public static final int PLAYER_STATE_FIELD_NUMBER = 1;
    public static final int SYNC_STATE_FROM_EOV_OPTIONAL_FIELD_NUMBER = 4;
    private int bitField0_;
    private m0 device_;
    private boolean isCurrentlyActive_;
    private a0 playerState_;
    private j0 syncStateFromEovOptional_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        o3d.registerDefaultInstance(n0.class, n0Var);
    }

    public static void f(n0 n0Var, m0 m0Var) {
        n0Var.getClass();
        m0Var.getClass();
        n0Var.device_ = m0Var;
        n0Var.bitField0_ |= 2;
    }

    public static void g(n0 n0Var, boolean z) {
        n0Var.isCurrentlyActive_ = z;
    }

    public static void h(n0 n0Var, a0 a0Var) {
        n0Var.getClass();
        n0Var.playerState_ = a0Var;
        n0Var.bitField0_ |= 1;
    }

    public static n0 i() {
        return DEFAULT_INSTANCE;
    }

    public static mnt k() {
        return (mnt) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "playerState_", "isCurrentlyActive_", "device_", "syncStateFromEovOptional_"});
        }
        if (ordinal == 3) {
            return new n0();
        }
        if (ordinal == 4) {
            return new mnt(DEFAULT_INSTANCE);
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
        synchronized (n0.class) {
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

    public final a0 j() {
        a0 a0Var = this.playerState_;
        return a0Var == null ? a0.i() : a0Var;
    }
}
