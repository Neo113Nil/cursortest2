package com.yandex.media.ynison.service;

import defpackage.a5n;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;
import defpackage.z4n;

/* loaded from: classes3.dex */
public final class d0 extends o3d implements xzh {
    public static final int ACTIVITY_INTERCEPTION_TYPE_FIELD_NUMBER = 10;
    private static final d0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYER_ACTION_TIMESTAMP_MS_FIELD_NUMBER = 7;
    public static final int RID_FIELD_NUMBER = 8;
    public static final int SYNC_STATE_FROM_EOV_FIELD_NUMBER = 12;
    public static final int UPDATE_ACTIVE_DEVICE_FIELD_NUMBER = 2;
    public static final int UPDATE_FULL_STATE_FIELD_NUMBER = 1;
    public static final int UPDATE_PLAYER_QUEUE_INJECT_FIELD_NUMBER = 6;
    public static final int UPDATE_PLAYER_STATE_FIELD_NUMBER = 4;
    public static final int UPDATE_PLAYING_STATUS_FIELD_NUMBER = 3;
    public static final int UPDATE_SESSION_PARAMS_FIELD_NUMBER = 9;
    public static final int UPDATE_VOLUME_FIELD_NUMBER = 5;
    public static final int UPDATE_VOLUME_INFO_FIELD_NUMBER = 11;
    private int activityInterceptionType_;
    private Object parameters_;
    private long playerActionTimestampMs_;
    private int parametersCase_ = 0;
    private String rid_ = "";

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        o3d.registerDefaultInstance(d0.class, d0Var);
    }

    public static a5n I() {
        return (a5n) DEFAULT_INSTANCE.createBuilder();
    }

    public static void f(d0 d0Var, z4n z4nVar) {
        d0Var.getClass();
        d0Var.activityInterceptionType_ = z4nVar.a();
    }

    public static void g(d0 d0Var, long j) {
        d0Var.playerActionTimestampMs_ = j;
    }

    public static void h(d0 d0Var, String str) {
        d0Var.getClass();
        d0Var.rid_ = str;
    }

    public static void i(d0 d0Var, l0 l0Var) {
        d0Var.getClass();
        d0Var.parameters_ = l0Var;
        d0Var.parametersCase_ = 2;
    }

    public static void j(d0 d0Var, n0 n0Var) {
        d0Var.getClass();
        d0Var.parameters_ = n0Var;
        d0Var.parametersCase_ = 1;
    }

    public static void k(d0 d0Var, p0 p0Var) {
        d0Var.getClass();
        d0Var.parameters_ = p0Var;
        d0Var.parametersCase_ = 4;
    }

    public static void l(d0 d0Var, q0 q0Var) {
        d0Var.getClass();
        d0Var.parameters_ = q0Var;
        d0Var.parametersCase_ = 3;
    }

    public static void m(d0 d0Var, r0 r0Var) {
        d0Var.getClass();
        d0Var.parameters_ = r0Var;
        d0Var.parametersCase_ = 9;
    }

    public static void n(d0 d0Var, u0 u0Var) {
        d0Var.getClass();
        d0Var.parameters_ = u0Var;
        d0Var.parametersCase_ = 11;
    }

    public static d0 o() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.parametersCase_ == 2;
    }

    public final boolean B() {
        return this.parametersCase_ == 1;
    }

    public final boolean C() {
        return this.parametersCase_ == 6;
    }

    public final boolean D() {
        return this.parametersCase_ == 4;
    }

    public final boolean E() {
        return this.parametersCase_ == 3;
    }

    public final boolean F() {
        return this.parametersCase_ == 9;
    }

    public final boolean G() {
        return this.parametersCase_ == 5;
    }

    public final boolean H() {
        return this.parametersCase_ == 11;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007\u0002\bȈ\t<\u0000\n\f\u000b<\u0000\f<\u0000", new Object[]{"parameters_", "parametersCase_", n0.class, l0.class, q0.class, p0.class, t0.class, o0.class, "playerActionTimestampMs_", "rid_", r0.class, "activityInterceptionType_", u0.class, j0.class});
        }
        if (ordinal == 3) {
            return new d0();
        }
        if (ordinal == 4) {
            return new a5n(DEFAULT_INSTANCE);
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
        synchronized (d0.class) {
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

    public final String p() {
        return this.rid_;
    }

    public final j0 q() {
        return this.parametersCase_ == 12 ? (j0) this.parameters_ : j0.g();
    }

    public final l0 r() {
        return this.parametersCase_ == 2 ? (l0) this.parameters_ : l0.g();
    }

    public final n0 s() {
        return this.parametersCase_ == 1 ? (n0) this.parameters_ : n0.i();
    }

    public final o0 t() {
        return this.parametersCase_ == 6 ? (o0) this.parameters_ : o0.f();
    }

    public final p0 u() {
        return this.parametersCase_ == 4 ? (p0) this.parameters_ : p0.g();
    }

    public final q0 v() {
        return this.parametersCase_ == 3 ? (q0) this.parameters_ : q0.g();
    }

    public final r0 w() {
        return this.parametersCase_ == 9 ? (r0) this.parameters_ : r0.h();
    }

    public final t0 x() {
        return this.parametersCase_ == 5 ? (t0) this.parameters_ : t0.f();
    }

    public final u0 y() {
        return this.parametersCase_ == 11 ? (u0) this.parameters_ : u0.h();
    }

    public final boolean z() {
        return this.parametersCase_ == 12;
    }
}
