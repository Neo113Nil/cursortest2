package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.pnl;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class a0 extends o3d implements xzh {
    private static final a0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYER_QUEUE_FIELD_NUMBER = 2;
    public static final int PLAYER_QUEUE_INJECT_OPTIONAL_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private z playerQueueInjectOptional_;
    private x playerQueue_;
    private c0 status_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        o3d.registerDefaultInstance(a0.class, a0Var);
    }

    public static void f(a0 a0Var) {
        a0Var.playerQueueInjectOptional_ = null;
        a0Var.bitField0_ &= -5;
    }

    public static void g(a0 a0Var, x xVar) {
        a0Var.getClass();
        a0Var.playerQueue_ = xVar;
        a0Var.bitField0_ |= 2;
    }

    public static void h(a0 a0Var, c0 c0Var) {
        a0Var.getClass();
        a0Var.status_ = c0Var;
        a0Var.bitField0_ |= 1;
    }

    public static a0 i() {
        return DEFAULT_INSTANCE;
    }

    public static pnl n() {
        return (pnl) DEFAULT_INSTANCE.createBuilder();
    }

    public static pnl o(a0 a0Var) {
        return (pnl) DEFAULT_INSTANCE.createBuilder(a0Var);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "status_", "playerQueue_", "playerQueueInjectOptional_"});
        }
        if (ordinal == 3) {
            return new a0();
        }
        if (ordinal == 4) {
            return new pnl(DEFAULT_INSTANCE);
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
        synchronized (a0.class) {
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

    public final x j() {
        x xVar = this.playerQueue_;
        return xVar == null ? x.s() : xVar;
    }

    public final c0 k() {
        c0 c0Var = this.status_;
        return c0Var == null ? c0.k() : c0Var;
    }

    public final boolean l() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean m() {
        return (this.bitField0_ & 1) != 0;
    }
}
