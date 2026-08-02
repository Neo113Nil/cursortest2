package com.yandex.media.ynison.service;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.c8;
import defpackage.chl;
import defpackage.dlr;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.rse;
import defpackage.u8;
import defpackage.xzh;
import java.util.List;

/* loaded from: classes3.dex */
public final class x extends o3d implements xzh {
    public static final int ADDING_OPTIONS_OPTIONAL_FIELD_NUMBER = 11;
    public static final int CURRENT_PLAYABLE_INDEX_FIELD_NUMBER = 3;
    private static final x DEFAULT_INSTANCE;
    public static final int ENTITY_CONTEXT_FIELD_NUMBER = 8;
    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
    public static final int FILTER_OPTIONAL_FIELD_NUMBER = 14;
    public static final int FROM_OPTIONAL_FIELD_NUMBER = 9;
    public static final int INITIAL_ENTITY_OPTIONAL_FIELD_NUMBER = 10;
    public static final int NAVIGATION_ID_OPTIONAL_FIELD_NUMBER = 13;
    public static final int OPTIONS_FIELD_NUMBER = 5;
    private static volatile n7k PARSER = null;
    public static final int PLAYABLE_LIST_FIELD_NUMBER = 4;
    public static final int PLAYBACK_ACTION_ID_OPTIONAL_FIELD_NUMBER = 15;
    public static final int QUEUE_FIELD_NUMBER = 12;
    public static final int SHUFFLE_OPTIONAL_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 6;
    private i addingOptionsOptional_;
    private int bitField0_;
    private int currentPlayableIndex_;
    private int entityContext_;
    private int entityType_;
    private dlr filterOptional_;
    private dlr fromOptional_;
    private g initialEntityOptional_;
    private dlr navigationIdOptional_;
    private b0 options_;
    private dlr playbackActionIdOptional_;
    private w queue_;
    private i0 shuffleOptional_;
    private s0 version_;
    private String entityId_ = "";
    private rse playableList_ = o3d.emptyProtobufList();

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        o3d.registerDefaultInstance(x.class, xVar);
    }

    public static chl H() {
        return (chl) DEFAULT_INSTANCE.createBuilder();
    }

    public static chl I(x xVar) {
        return (chl) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static void f(x xVar, Iterable iterable) {
        rse rseVar = xVar.playableList_;
        if (!((u8) rseVar).a) {
            xVar.playableList_ = o3d.mutableCopy(rseVar);
        }
        c8.addAll(iterable, xVar.playableList_);
    }

    public static void g(x xVar) {
        xVar.getClass();
        xVar.playableList_ = o3d.emptyProtobufList();
    }

    public static void h(x xVar) {
        xVar.shuffleOptional_ = null;
        xVar.bitField0_ &= -9;
    }

    public static void i(x xVar, int i) {
        xVar.currentPlayableIndex_ = i;
    }

    public static void j(x xVar, String str) {
        xVar.getClass();
        str.getClass();
        xVar.entityId_ = str;
    }

    public static void k(x xVar, dlr dlrVar) {
        xVar.getClass();
        xVar.fromOptional_ = dlrVar;
        xVar.bitField0_ |= 16;
    }

    public static void l(x xVar, dlr dlrVar) {
        xVar.getClass();
        xVar.navigationIdOptional_ = dlrVar;
        xVar.bitField0_ |= 128;
    }

    public static void m(x xVar, b0 b0Var) {
        xVar.getClass();
        xVar.options_ = b0Var;
        xVar.bitField0_ |= 2;
    }

    public static void n(x xVar, dlr dlrVar) {
        xVar.getClass();
        xVar.playbackActionIdOptional_ = dlrVar;
        xVar.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
    }

    public static void o(x xVar, w wVar) {
        xVar.getClass();
        wVar.getClass();
        xVar.queue_ = wVar;
        xVar.bitField0_ |= 1;
    }

    public static void p(x xVar, i0 i0Var) {
        xVar.getClass();
        i0Var.getClass();
        xVar.shuffleOptional_ = i0Var;
        xVar.bitField0_ |= 8;
    }

    public static void q(x xVar, s0 s0Var) {
        xVar.getClass();
        s0Var.getClass();
        xVar.version_ = s0Var;
        xVar.bitField0_ |= 4;
    }

    public static x s() {
        return DEFAULT_INSTANCE;
    }

    public final List A() {
        return this.playableList_;
    }

    public final dlr B() {
        dlr dlrVar = this.playbackActionIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final w C() {
        w wVar = this.queue_;
        return wVar == null ? w.i() : wVar;
    }

    public final i0 D() {
        i0 i0Var = this.shuffleOptional_;
        return i0Var == null ? i0.h() : i0Var;
    }

    public final s0 E() {
        s0 s0Var = this.version_;
        return s0Var == null ? s0.i() : s0Var;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u001b\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\b\f\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fဉ\u0000\rဉ\u0007\u000eဉ\b\u000fဉ\t", new Object[]{"bitField0_", "entityId_", "entityType_", "currentPlayableIndex_", "playableList_", f.class, "options_", "version_", "shuffleOptional_", "entityContext_", "fromOptional_", "initialEntityOptional_", "addingOptionsOptional_", "queue_", "navigationIdOptional_", "filterOptional_", "playbackActionIdOptional_"});
        }
        if (ordinal == 3) {
            return new x();
        }
        if (ordinal == 4) {
            return new chl(DEFAULT_INSTANCE);
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
        synchronized (x.class) {
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

    public final int r() {
        return this.currentPlayableIndex_;
    }

    public final int t() {
        int i;
        switch (this.entityContext_) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 9;
        }
        return i;
    }

    public final String u() {
        return this.entityId_;
    }

    public final int v() {
        int i;
        switch (this.entityType_) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 11;
        }
        return i;
    }

    public final dlr w() {
        dlr dlrVar = this.fromOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final dlr x() {
        dlr dlrVar = this.navigationIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final b0 y() {
        b0 b0Var = this.options_;
        return b0Var == null ? b0.g() : b0Var;
    }

    public final int z() {
        return this.playableList_.size();
    }
}
