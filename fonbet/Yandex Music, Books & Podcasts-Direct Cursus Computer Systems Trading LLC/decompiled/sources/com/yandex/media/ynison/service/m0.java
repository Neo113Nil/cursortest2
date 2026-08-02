package com.yandex.media.ynison.service;

import defpackage.ent;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class m0 extends o3d implements xzh {
    public static final int CAPABILITIES_FIELD_NUMBER = 3;
    private static final m0 DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int VOLUME_FIELD_NUMBER = 2;
    public static final int VOLUME_INFO_FIELD_NUMBER = 4;
    private int bitField0_;
    private b capabilities_;
    private c info_;
    private d volumeInfo_;
    private double volume_;

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        o3d.registerDefaultInstance(m0.class, m0Var);
    }

    public static void f(m0 m0Var, b bVar) {
        m0Var.getClass();
        bVar.getClass();
        m0Var.capabilities_ = bVar;
        m0Var.bitField0_ |= 2;
    }

    public static void g(m0 m0Var, c cVar) {
        m0Var.getClass();
        cVar.getClass();
        m0Var.info_ = cVar;
        m0Var.bitField0_ |= 1;
    }

    public static void h(m0 m0Var, double d) {
        m0Var.volume_ = d;
    }

    public static void i(m0 m0Var, d dVar) {
        m0Var.getClass();
        dVar.getClass();
        m0Var.volumeInfo_ = dVar;
        m0Var.bitField0_ |= 4;
    }

    public static ent j() {
        return (ent) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "info_", "volume_", "capabilities_", "volumeInfo_"});
        }
        if (ordinal == 3) {
            return new m0();
        }
        if (ordinal == 4) {
            return new ent(DEFAULT_INSTANCE);
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
        synchronized (m0.class) {
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
}
