package com.yandex.media.ynison.service;

import defpackage.ghl;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class m extends o3d implements xzh {
    private static final m DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private String id_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        o3d.registerDefaultInstance(m.class, mVar);
    }

    public static void f(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.id_ = str;
    }

    public static m g() {
        return DEFAULT_INSTANCE;
    }

    public static ghl i() {
        return (ghl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"id_"});
        }
        if (ordinal == 3) {
            return new m();
        }
        if (ordinal == 4) {
            return new ghl(DEFAULT_INSTANCE);
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
        synchronized (m.class) {
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

    public final String h() {
        return this.id_;
    }
}
