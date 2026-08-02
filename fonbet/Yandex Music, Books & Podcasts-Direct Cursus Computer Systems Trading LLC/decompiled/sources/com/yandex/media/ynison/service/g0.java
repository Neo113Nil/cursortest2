package com.yandex.media.ynison.service;

import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class g0 extends o3d implements xzh {
    private static final g0 DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 1;
    public static final int KEEP_ALIVE_PARAMS_FIELD_NUMBER = 4;
    private static volatile n7k PARSER = null;
    public static final int REDIRECT_TICKET_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private e keepAliveParams_;
    private long sessionId_;
    private String host_ = "";
    private String redirectTicket_ = "";

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        o3d.registerDefaultInstance(g0.class, g0Var);
    }

    public static g0 f() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004ဉ\u0000", new Object[]{"bitField0_", "host_", "redirectTicket_", "sessionId_", "keepAliveParams_"});
        }
        if (ordinal == 3) {
            return new g0();
        }
        if (ordinal == 4) {
            return new g3d(DEFAULT_INSTANCE);
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
        synchronized (g0.class) {
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

    public final String g() {
        return this.host_;
    }

    public final e h() {
        e eVar = this.keepAliveParams_;
        return eVar == null ? e.f() : eVar;
    }

    public final String i() {
        return this.redirectTicket_;
    }

    public final long j() {
        return this.sessionId_;
    }

    public final boolean k() {
        return (this.bitField0_ & 1) != 0;
    }
}
