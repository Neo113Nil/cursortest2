package com.yandex.media.ynison.service;

import defpackage.dlr;
import defpackage.j3d;
import defpackage.mhl;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class q extends o3d implements xzh {
    private static final q DEFAULT_INSTANCE;
    public static final int FILTER_OPTIONAL_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private int bitField0_;
    private dlr filterOptional_;
    private String id_ = "";

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        o3d.registerDefaultInstance(q.class, qVar);
    }

    public static void f(q qVar, dlr dlrVar) {
        qVar.getClass();
        qVar.filterOptional_ = dlrVar;
        qVar.bitField0_ |= 1;
    }

    public static void g(q qVar, String str) {
        qVar.getClass();
        qVar.id_ = str;
    }

    public static q h() {
        return DEFAULT_INSTANCE;
    }

    public static mhl l() {
        return (mhl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "id_", "filterOptional_"});
        }
        if (ordinal == 3) {
            return new q();
        }
        if (ordinal == 4) {
            return new mhl(DEFAULT_INSTANCE);
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
        synchronized (q.class) {
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

    public final dlr i() {
        dlr dlrVar = this.filterOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final String j() {
        return this.id_;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
