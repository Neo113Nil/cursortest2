package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.k18;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class d extends o3d implements xzh {
    private static final d DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int VOLUME_FIELD_NUMBER = 1;
    private int bitField0_;
    private s0 version_;
    private double volume_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        o3d.registerDefaultInstance(d.class, dVar);
    }

    public static void f(d dVar, s0 s0Var) {
        dVar.getClass();
        dVar.version_ = s0Var;
        dVar.bitField0_ |= 1;
    }

    public static void g(d dVar, double d) {
        dVar.volume_ = d;
    }

    public static d h() {
        return DEFAULT_INSTANCE;
    }

    public static k18 k() {
        return (k18) DEFAULT_INSTANCE.createBuilder();
    }

    public static k18 l(d dVar) {
        return (k18) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "volume_", "version_"});
        }
        if (ordinal == 3) {
            return new d();
        }
        if (ordinal == 4) {
            return new k18(DEFAULT_INSTANCE);
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
        synchronized (d.class) {
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

    public final boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public final s0 i() {
        s0 s0Var = this.version_;
        return s0Var == null ? s0.i() : s0Var;
    }

    public final double j() {
        return this.volume_;
    }
}
