package com.yandex.media.ynison.service;

import defpackage.iot;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class s0 extends o3d implements xzh {
    private static final s0 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String deviceId_ = "";
    private long timestampMs_;
    private long version_;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        o3d.registerDefaultInstance(s0.class, s0Var);
    }

    public static void f(s0 s0Var, String str) {
        s0Var.getClass();
        str.getClass();
        s0Var.deviceId_ = str;
    }

    public static void g(s0 s0Var, long j) {
        s0Var.timestampMs_ = j;
    }

    public static void h(s0 s0Var, long j) {
        s0Var.version_ = j;
    }

    public static s0 i() {
        return DEFAULT_INSTANCE;
    }

    public static iot m() {
        return (iot) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"deviceId_", "version_", "timestampMs_"});
        }
        if (ordinal == 3) {
            return new s0();
        }
        if (ordinal == 4) {
            return new iot(DEFAULT_INSTANCE);
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
        synchronized (s0.class) {
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

    public final String j() {
        return this.deviceId_;
    }

    public final long k() {
        return this.timestampMs_;
    }

    public final long l() {
        return this.version_;
    }
}
