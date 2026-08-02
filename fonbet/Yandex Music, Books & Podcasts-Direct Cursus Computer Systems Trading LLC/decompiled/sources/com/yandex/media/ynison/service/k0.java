package com.yandex.media.ynison.service;

import defpackage.aws;
import defpackage.dlr;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class k0 extends o3d implements xzh {
    public static final int BATCH_ID_OPTIONAL_FIELD_NUMBER = 2;
    private static final k0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int TRACK_SOURCE_KEY_FIELD_NUMBER = 1;
    private dlr batchIdOptional_;
    private int bitField0_;
    private int trackSourceKey_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        o3d.registerDefaultInstance(k0.class, k0Var);
    }

    public static void f(k0 k0Var, dlr dlrVar) {
        k0Var.getClass();
        k0Var.batchIdOptional_ = dlrVar;
        k0Var.bitField0_ |= 1;
    }

    public static void g(k0 k0Var, int i) {
        k0Var.trackSourceKey_ = i;
    }

    public static k0 i() {
        return DEFAULT_INSTANCE;
    }

    public static aws l() {
        return (aws) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "trackSourceKey_", "batchIdOptional_"});
        }
        if (ordinal == 3) {
            return new k0();
        }
        if (ordinal == 4) {
            return new aws(DEFAULT_INSTANCE);
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
        synchronized (k0.class) {
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
        dlr dlrVar = this.batchIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final int j() {
        return this.trackSourceKey_;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
