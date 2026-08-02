package com.yandex.media.ynison.service;

import defpackage.dlr;
import defpackage.j3d;
import defpackage.jwk;
import defpackage.lwk;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class f extends o3d implements xzh {
    public static final int ALBUM_ID_OPTIONAL_FIELD_NUMBER = 2;
    public static final int COVER_URL_OPTIONAL_FIELD_NUMBER = 6;
    private static final f DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 4;
    public static final int NAVIGATION_ID_OPTIONAL_FIELD_NUMBER = 9;
    private static volatile n7k PARSER = null;
    public static final int PLAYABLE_ID_FIELD_NUMBER = 1;
    public static final int PLAYABLE_TYPE_FIELD_NUMBER = 3;
    public static final int PLAYBACK_ACTION_ID_OPTIONAL_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 5;
    public static final int TRACK_INFO_FIELD_NUMBER = 8;
    public static final int VIDEO_CLIP_INFO_FIELD_NUMBER = 7;
    private Object additionalInfoOptional_;
    private dlr albumIdOptional_;
    private int bitField0_;
    private dlr coverUrlOptional_;
    private dlr navigationIdOptional_;
    private int playableType_;
    private dlr playbackActionIdOptional_;
    private int additionalInfoOptionalCase_ = 0;
    private String playableId_ = "";
    private String from_ = "";
    private String title_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        o3d.registerDefaultInstance(f.class, fVar);
    }

    public static jwk D() {
        return (jwk) DEFAULT_INSTANCE.createBuilder();
    }

    public static void f(f fVar, dlr dlrVar) {
        fVar.getClass();
        fVar.albumIdOptional_ = dlrVar;
        fVar.bitField0_ |= 1;
    }

    public static void g(f fVar, dlr dlrVar) {
        fVar.getClass();
        fVar.coverUrlOptional_ = dlrVar;
        fVar.bitField0_ |= 2;
    }

    public static void h(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.from_ = str;
    }

    public static void i(f fVar, dlr dlrVar) {
        fVar.getClass();
        fVar.navigationIdOptional_ = dlrVar;
        fVar.bitField0_ |= 4;
    }

    public static void j(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.playableId_ = str;
    }

    public static void k(f fVar, lwk lwkVar) {
        fVar.getClass();
        fVar.playableType_ = lwkVar.a();
    }

    public static void l(f fVar, dlr dlrVar) {
        fVar.getClass();
        fVar.playbackActionIdOptional_ = dlrVar;
        fVar.bitField0_ |= 8;
    }

    public static void m(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.title_ = str;
    }

    public static void n(f fVar, k0 k0Var) {
        fVar.getClass();
        fVar.additionalInfoOptional_ = k0Var;
        fVar.additionalInfoOptionalCase_ = 8;
    }

    public static void o(f fVar, v0 v0Var) {
        fVar.getClass();
        fVar.additionalInfoOptional_ = v0Var;
        fVar.additionalInfoOptionalCase_ = 7;
    }

    public final boolean A() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean B() {
        return this.additionalInfoOptionalCase_ == 8;
    }

    public final boolean C() {
        return this.additionalInfoOptionalCase_ == 7;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004Ȉ\u0005Ȉ\u0006ဉ\u0001\u0007<\u0000\b<\u0000\tဉ\u0002\nဉ\u0003", new Object[]{"additionalInfoOptional_", "additionalInfoOptionalCase_", "bitField0_", "playableId_", "albumIdOptional_", "playableType_", "from_", "title_", "coverUrlOptional_", v0.class, k0.class, "navigationIdOptional_", "playbackActionIdOptional_"});
        }
        if (ordinal == 3) {
            return new f();
        }
        if (ordinal == 4) {
            return new jwk(DEFAULT_INSTANCE);
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
        synchronized (f.class) {
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

    public final dlr p() {
        dlr dlrVar = this.albumIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final dlr q() {
        dlr dlrVar = this.coverUrlOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final String r() {
        return this.from_;
    }

    public final dlr s() {
        dlr dlrVar = this.navigationIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final String t() {
        return this.playableId_;
    }

    public final lwk u() {
        int i = this.playableType_;
        lwk lwkVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : lwk.VIDEO_CLIP : lwk.INFINITE : lwk.LOCAL_TRACK : lwk.TRACK : lwk.UNSPECIFIED;
        return lwkVar == null ? lwk.UNRECOGNIZED : lwkVar;
    }

    public final dlr v() {
        dlr dlrVar = this.playbackActionIdOptional_;
        return dlrVar == null ? dlr.f() : dlrVar;
    }

    public final String w() {
        return this.title_;
    }

    public final k0 x() {
        return this.additionalInfoOptionalCase_ == 8 ? (k0) this.additionalInfoOptional_ : k0.i();
    }

    public final v0 y() {
        return this.additionalInfoOptionalCase_ == 7 ? (v0) this.additionalInfoOptional_ : v0.g();
    }

    public final boolean z() {
        return (this.bitField0_ & 4) != 0;
    }
}
