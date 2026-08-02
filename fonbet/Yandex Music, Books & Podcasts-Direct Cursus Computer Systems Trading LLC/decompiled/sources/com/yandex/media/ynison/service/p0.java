package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nnt;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class p0 extends o3d implements xzh {
    private static final p0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYER_STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private a0 playerState_;

    static {
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        o3d.registerDefaultInstance(p0.class, p0Var);
    }

    public static void f(p0 p0Var, a0 a0Var) {
        p0Var.getClass();
        p0Var.playerState_ = a0Var;
        p0Var.bitField0_ |= 1;
    }

    public static p0 g() {
        return DEFAULT_INSTANCE;
    }

    public static nnt i() {
        return (nnt) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "playerState_"});
        }
        if (ordinal == 3) {
            return new p0();
        }
        if (ordinal == 4) {
            return new nnt(DEFAULT_INSTANCE);
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
        synchronized (p0.class) {
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

    public final a0 h() {
        a0 a0Var = this.playerState_;
        return a0Var == null ? a0.i() : a0Var;
    }
}
