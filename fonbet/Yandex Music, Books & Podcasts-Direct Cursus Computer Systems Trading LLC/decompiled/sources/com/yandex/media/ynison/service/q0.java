package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.ont;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class q0 extends o3d implements xzh {
    private static final q0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYING_STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private c0 playingStatus_;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        o3d.registerDefaultInstance(q0.class, q0Var);
    }

    public static void f(q0 q0Var, c0 c0Var) {
        q0Var.getClass();
        q0Var.playingStatus_ = c0Var;
        q0Var.bitField0_ |= 1;
    }

    public static q0 g() {
        return DEFAULT_INSTANCE;
    }

    public static ont i() {
        return (ont) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "playingStatus_"});
        }
        if (ordinal == 3) {
            return new q0();
        }
        if (ordinal == 4) {
            return new ont(DEFAULT_INSTANCE);
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
        synchronized (q0.class) {
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

    public final c0 h() {
        c0 c0Var = this.playingStatus_;
        return c0Var == null ? c0.k() : c0Var;
    }
}
