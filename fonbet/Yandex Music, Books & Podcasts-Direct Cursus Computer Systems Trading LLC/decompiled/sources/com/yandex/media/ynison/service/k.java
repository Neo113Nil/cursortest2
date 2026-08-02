package com.yandex.media.ynison.service;

import defpackage.ehl;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class k extends o3d implements xzh {
    private static final k DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private String id_ = "";

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        o3d.registerDefaultInstance(k.class, kVar);
    }

    public static void f(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.id_ = str;
    }

    public static k g() {
        return DEFAULT_INSTANCE;
    }

    public static ehl i() {
        return (ehl) DEFAULT_INSTANCE.createBuilder();
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
            return new k();
        }
        if (ordinal == 4) {
            return new ehl(DEFAULT_INSTANCE);
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
        synchronized (k.class) {
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
