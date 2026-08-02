package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.rz7;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class a extends o3d implements xzh {
    public static final int CAPABILITIES_FIELD_NUMBER = 3;
    private static final a DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    public static final int IS_OFFLINE_FIELD_NUMBER = 5;
    private static volatile n7k PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 4;
    public static final int VOLUME_FIELD_NUMBER = 2;
    public static final int VOLUME_INFO_FIELD_NUMBER = 6;
    private int bitField0_;
    private b capabilities_;
    private c info_;
    private boolean isOffline_;
    private h0 session_;
    private d volumeInfo_;
    private double volume_;

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        o3d.registerDefaultInstance(a.class, aVar);
    }

    public static void f(a aVar, b bVar) {
        aVar.getClass();
        aVar.capabilities_ = bVar;
        aVar.bitField0_ |= 2;
    }

    public static void g(a aVar, c cVar) {
        aVar.getClass();
        aVar.info_ = cVar;
        aVar.bitField0_ |= 1;
    }

    public static void h(a aVar) {
        aVar.volume_ = 0.0d;
    }

    public static void i(a aVar, d dVar) {
        aVar.getClass();
        dVar.getClass();
        aVar.volumeInfo_ = dVar;
        aVar.bitField0_ |= 8;
    }

    public static rz7 o() {
        return (rz7) DEFAULT_INSTANCE.createBuilder();
    }

    public static rz7 p(a aVar) {
        return (rz7) DEFAULT_INSTANCE.createBuilder(aVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"bitField0_", "info_", "volume_", "capabilities_", "session_", "isOffline_", "volumeInfo_"});
        }
        if (ordinal == 3) {
            return new a();
        }
        if (ordinal == 4) {
            return new rz7(DEFAULT_INSTANCE);
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
        synchronized (a.class) {
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

    public final b j() {
        b bVar = this.capabilities_;
        return bVar == null ? b.k() : bVar;
    }

    public final c k() {
        c cVar = this.info_;
        return cVar == null ? c.l() : cVar;
    }

    public final boolean l() {
        return this.isOffline_;
    }

    public final d m() {
        d dVar = this.volumeInfo_;
        return dVar == null ? d.h() : dVar;
    }

    public final boolean n() {
        return (this.bitField0_ & 1) != 0;
    }
}
