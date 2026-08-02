package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.ohl;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class s extends o3d implements xzh {
    private static final s DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private String sessionId_ = "";

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        o3d.registerDefaultInstance(s.class, sVar);
    }

    public static void f(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.sessionId_ = str;
    }

    public static s g() {
        return DEFAULT_INSTANCE;
    }

    public static ohl i() {
        return (ohl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"sessionId_"});
        }
        if (ordinal == 3) {
            return new s();
        }
        if (ordinal == 4) {
            return new ohl(DEFAULT_INSTANCE);
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
        synchronized (s.class) {
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
        return this.sessionId_;
    }
}
