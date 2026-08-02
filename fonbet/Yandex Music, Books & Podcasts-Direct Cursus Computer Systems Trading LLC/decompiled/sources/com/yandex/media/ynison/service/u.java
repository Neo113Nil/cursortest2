package com.yandex.media.ynison.service;

import defpackage.c8;
import defpackage.j3d;
import defpackage.khl;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.rse;
import defpackage.u8;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class u extends o3d implements xzh {
    private static final u DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int TRACK_SOURCES_FIELD_NUMBER = 2;
    public static final int WAVE_ENTITY_OPTIONAL_FIELD_NUMBER = 1;
    private int bitField0_;
    private rse trackSources_ = o3d.emptyProtobufList();
    private s waveEntityOptional_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        o3d.registerDefaultInstance(u.class, uVar);
    }

    public static void f(u uVar, Iterable iterable) {
        rse rseVar = uVar.trackSources_;
        if (!((u8) rseVar).a) {
            uVar.trackSources_ = o3d.mutableCopy(rseVar);
        }
        c8.addAll(iterable, uVar.trackSources_);
    }

    public static void g(u uVar, r rVar) {
        uVar.getClass();
        rse rseVar = uVar.trackSources_;
        if (!((u8) rseVar).a) {
            uVar.trackSources_ = o3d.mutableCopy(rseVar);
        }
        uVar.trackSources_.add(rVar);
    }

    public static void h(u uVar, s sVar) {
        uVar.getClass();
        uVar.waveEntityOptional_ = sVar;
        uVar.bitField0_ |= 1;
    }

    public static u i() {
        return DEFAULT_INSTANCE;
    }

    public static khl m() {
        return (khl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "waveEntityOptional_", "trackSources_", r.class});
        }
        if (ordinal == 3) {
            return new u();
        }
        if (ordinal == 4) {
            return new khl(DEFAULT_INSTANCE);
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
        synchronized (u.class) {
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

    public final rse j() {
        return this.trackSources_;
    }

    public final s k() {
        s sVar = this.waveEntityOptional_;
        return sVar == null ? s.g() : sVar;
    }

    public final boolean l() {
        return (this.bitField0_ & 1) != 0;
    }
}
