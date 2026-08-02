package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.jot;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class u0 extends o3d implements xzh {
    private static final u0 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int VOLUME_INFO_FIELD_NUMBER = 2;
    private int bitField0_;
    private String deviceId_ = "";
    private d volumeInfo_;

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        o3d.registerDefaultInstance(u0.class, u0Var);
    }

    public static void f(u0 u0Var, String str) {
        u0Var.getClass();
        u0Var.deviceId_ = str;
    }

    public static void g(u0 u0Var, d dVar) {
        u0Var.getClass();
        u0Var.volumeInfo_ = dVar;
        u0Var.bitField0_ |= 1;
    }

    public static u0 h() {
        return DEFAULT_INSTANCE;
    }

    public static jot j() {
        return (jot) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "deviceId_", "volumeInfo_"});
        }
        if (ordinal == 3) {
            return new u0();
        }
        if (ordinal == 4) {
            return new jot(DEFAULT_INSTANCE);
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
        synchronized (u0.class) {
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

    public final d i() {
        d dVar = this.volumeInfo_;
        return dVar == null ? d.h() : dVar;
    }
}
