package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.unt;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class r0 extends o3d implements xzh {
    private static final r0 DEFAULT_INSTANCE;
    public static final int MUTE_EVENTS_IF_PASSIVE_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private boolean muteEventsIfPassive_;

    static {
        r0 r0Var = new r0();
        DEFAULT_INSTANCE = r0Var;
        o3d.registerDefaultInstance(r0.class, r0Var);
    }

    public static void f(r0 r0Var) {
        r0Var.muteEventsIfPassive_ = false;
    }

    public static void g(r0 r0Var) {
        r0Var.muteEventsIfPassive_ = true;
    }

    public static r0 h() {
        return DEFAULT_INSTANCE;
    }

    public static unt i() {
        return (unt) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"muteEventsIfPassive_"});
        }
        if (ordinal == 3) {
            return new r0();
        }
        if (ordinal == 4) {
            return new unt(DEFAULT_INSTANCE);
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
        synchronized (r0.class) {
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
