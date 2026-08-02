package com.yandex.media.ynison.service;

import defpackage.dlr;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xmt;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class l0 extends o3d implements xzh {
    private static final l0 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_OPTIONAL_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private int bitField0_;
    private dlr deviceIdOptional_;

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        o3d.registerDefaultInstance(l0.class, l0Var);
    }

    public static void f(l0 l0Var, dlr dlrVar) {
        l0Var.getClass();
        l0Var.deviceIdOptional_ = dlrVar;
        l0Var.bitField0_ |= 1;
    }

    public static l0 g() {
        return DEFAULT_INSTANCE;
    }

    public static xmt i() {
        return (xmt) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "deviceIdOptional_"});
        }
        if (ordinal == 3) {
            return new l0();
        }
        if (ordinal == 4) {
            return new xmt(DEFAULT_INSTANCE);
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
        synchronized (l0.class) {
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

    public final dlr h() {
        dlr dlrVar = this.deviceIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }
}
