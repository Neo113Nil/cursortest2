package com.yandex.media.ynison.service;

import defpackage.c8;
import defpackage.dlr;
import defpackage.hhl;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.rse;
import defpackage.u8;
import defpackage.xzh;
import java.util.List;

/* loaded from: classes3.dex */
public final class v extends o3d implements xzh {
    private static final v DEFAULT_INSTANCE;
    public static final int ENTITY_OPTIONS_FIELD_NUMBER = 3;
    public static final int LIVE_PLAYABLE_INDEX_FIELD_NUMBER = 2;
    public static final int NAVIGATION_ID_OPTIONAL_FIELD_NUMBER = 4;
    private static volatile n7k PARSER = null;
    public static final int PLAYBACK_ACTION_ID_OPTIONAL_FIELD_NUMBER = 5;
    public static final int RECOMMENDED_PLAYABLE_LIST_FIELD_NUMBER = 1;
    private int bitField0_;
    private u entityOptions_;
    private int livePlayableIndex_;
    private dlr navigationIdOptional_;
    private dlr playbackActionIdOptional_;
    private rse recommendedPlayableList_ = o3d.emptyProtobufList();

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        o3d.registerDefaultInstance(v.class, vVar);
    }

    public static void f(v vVar, List list) {
        rse rseVar = vVar.recommendedPlayableList_;
        if (!((u8) rseVar).a) {
            vVar.recommendedPlayableList_ = o3d.mutableCopy(rseVar);
        }
        c8.addAll(list, vVar.recommendedPlayableList_);
    }

    public static void g(v vVar, u uVar) {
        vVar.getClass();
        vVar.entityOptions_ = uVar;
        vVar.bitField0_ |= 1;
    }

    public static void h(v vVar, int i) {
        vVar.livePlayableIndex_ = i;
    }

    public static void i(v vVar, dlr dlrVar) {
        vVar.getClass();
        vVar.navigationIdOptional_ = dlrVar;
        vVar.bitField0_ |= 2;
    }

    public static void j(v vVar, dlr dlrVar) {
        vVar.getClass();
        vVar.playbackActionIdOptional_ = dlrVar;
        vVar.bitField0_ |= 4;
    }

    public static v k() {
        return DEFAULT_INSTANCE;
    }

    public static hhl q() {
        return (hhl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "recommendedPlayableList_", f.class, "livePlayableIndex_", "entityOptions_", "navigationIdOptional_", "playbackActionIdOptional_"});
        }
        if (ordinal == 3) {
            return new v();
        }
        if (ordinal == 4) {
            return new hhl(DEFAULT_INSTANCE);
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
        synchronized (v.class) {
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

    public final u l() {
        u uVar = this.entityOptions_;
        return uVar == null ? u.i() : uVar;
    }

    public final int m() {
        return this.livePlayableIndex_;
    }

    public final dlr n() {
        dlr dlrVar = this.navigationIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final dlr o() {
        dlr dlrVar = this.playbackActionIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final rse p() {
        return this.recommendedPlayableList_;
    }
}
