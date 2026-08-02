package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.qrl;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class c0 extends o3d implements xzh {
    private static final c0 DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 2;
    private static volatile n7k PARSER = null;
    public static final int PAUSED_FIELD_NUMBER = 3;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 4;
    public static final int PROGRESS_MS_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 5;
    private int bitField0_;
    private long durationMs_;
    private boolean paused_;
    private double playbackSpeed_;
    private long progressMs_;
    private s0 version_;

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        o3d.registerDefaultInstance(c0.class, c0Var);
    }

    public static void f(c0 c0Var, long j) {
        c0Var.durationMs_ = j;
    }

    public static void g(c0 c0Var, boolean z) {
        c0Var.paused_ = z;
    }

    public static void h(c0 c0Var, double d) {
        c0Var.playbackSpeed_ = d;
    }

    public static void i(c0 c0Var, long j) {
        c0Var.progressMs_ = j;
    }

    public static void j(c0 c0Var, s0 s0Var) {
        c0Var.getClass();
        s0Var.getClass();
        c0Var.version_ = s0Var;
        c0Var.bitField0_ |= 1;
    }

    public static c0 k() {
        return DEFAULT_INSTANCE;
    }

    public static qrl q() {
        return (qrl) DEFAULT_INSTANCE.createBuilder();
    }

    public static qrl r(c0 c0Var) {
        return (qrl) DEFAULT_INSTANCE.createBuilder(c0Var);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004\u0000\u0005ဉ\u0000", new Object[]{"bitField0_", "progressMs_", "durationMs_", "paused_", "playbackSpeed_", "version_"});
        }
        if (ordinal == 3) {
            return new c0();
        }
        if (ordinal == 4) {
            return new qrl(DEFAULT_INSTANCE);
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
        synchronized (c0.class) {
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

    public final long l() {
        return this.durationMs_;
    }

    public final boolean m() {
        return this.paused_;
    }

    public final double n() {
        return this.playbackSpeed_;
    }

    public final long o() {
        return this.progressMs_;
    }

    public final s0 p() {
        s0 s0Var = this.version_;
        return s0Var == null ? s0.i() : s0Var;
    }
}
