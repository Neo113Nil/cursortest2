package com.yandex.media.ynison.service;

import defpackage.b5n;
import defpackage.dlr;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.rse;
import defpackage.u8;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class e0 extends o3d implements xzh {
    public static final int ACTIVE_DEVICE_ID_OPTIONAL_FIELD_NUMBER = 3;
    private static final e0 DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 2;
    private static volatile n7k PARSER = null;
    public static final int PLAYER_STATE_FIELD_NUMBER = 1;
    public static final int RID_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 4;
    private dlr activeDeviceIdOptional_;
    private int bitField0_;
    private a0 playerState_;
    private long timestampMs_;
    private rse devices_ = o3d.emptyProtobufList();
    private String rid_ = "";

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        o3d.registerDefaultInstance(e0.class, e0Var);
    }

    public static void f(e0 e0Var, a aVar) {
        e0Var.getClass();
        rse rseVar = e0Var.devices_;
        if (!((u8) rseVar).a) {
            e0Var.devices_ = o3d.mutableCopy(rseVar);
        }
        e0Var.devices_.add(aVar);
    }

    public static void g(e0 e0Var, dlr dlrVar) {
        e0Var.getClass();
        e0Var.activeDeviceIdOptional_ = dlrVar;
        e0Var.bitField0_ |= 2;
    }

    public static void h(e0 e0Var, a0 a0Var) {
        e0Var.getClass();
        a0Var.getClass();
        e0Var.playerState_ = a0Var;
        e0Var.bitField0_ |= 1;
    }

    public static void i(e0 e0Var, long j) {
        e0Var.timestampMs_ = j;
    }

    public static e0 k() {
        return DEFAULT_INSTANCE;
    }

    public static b5n r() {
        return (b5n) DEFAULT_INSTANCE.createBuilder();
    }

    public static b5n s(e0 e0Var) {
        return (b5n) DEFAULT_INSTANCE.createBuilder(e0Var);
    }

    public static e0 t(byte[] bArr) {
        return (e0) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "playerState_", "devices_", a.class, "activeDeviceIdOptional_", "timestampMs_", "rid_"});
        }
        if (ordinal == 3) {
            return new e0();
        }
        if (ordinal == 4) {
            return new b5n(DEFAULT_INSTANCE);
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
        synchronized (e0.class) {
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

    public final dlr j() {
        dlr dlrVar = this.activeDeviceIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final int l() {
        return this.devices_.size();
    }

    public final rse m() {
        return this.devices_;
    }

    public final a0 n() {
        a0 a0Var = this.playerState_;
        return a0Var == null ? a0.i() : a0Var;
    }

    public final String o() {
        return this.rid_;
    }

    public final long p() {
        return this.timestampMs_;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }
}
