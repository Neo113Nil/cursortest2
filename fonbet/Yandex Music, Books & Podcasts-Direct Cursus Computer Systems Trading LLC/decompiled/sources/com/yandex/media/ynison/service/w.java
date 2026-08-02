package com.yandex.media.ynison.service;

import defpackage.dhl;
import defpackage.fhl;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class w extends o3d implements xzh {
    private static final w DEFAULT_INSTANCE;
    public static final int FM_RADIO_QUEUE_FIELD_NUMBER = 3;
    public static final int GENERATIVE_QUEUE_FIELD_NUMBER = 2;
    public static final int LOCAL_TRACKS_QUEUE_FIELD_NUMBER = 5;
    private static volatile n7k PARSER = null;
    public static final int VIDEO_WAVE_QUEUE_FIELD_NUMBER = 4;
    public static final int WAVE_QUEUE_FIELD_NUMBER = 1;
    private int typeCase_ = 0;
    private Object type_;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        o3d.registerDefaultInstance(w.class, wVar);
    }

    public static void f(w wVar, k kVar) {
        wVar.getClass();
        wVar.type_ = kVar;
        wVar.typeCase_ = 2;
    }

    public static void g(w wVar, m mVar) {
        wVar.getClass();
        wVar.type_ = mVar;
        wVar.typeCase_ = 4;
    }

    public static void h(w wVar, v vVar) {
        wVar.getClass();
        wVar.type_ = vVar;
        wVar.typeCase_ = 1;
    }

    public static w i() {
        return DEFAULT_INSTANCE;
    }

    public static dhl t() {
        return (dhl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"type_", "typeCase_", v.class, k.class, j.class, m.class, l.class});
        }
        if (ordinal == 3) {
            return new w();
        }
        if (ordinal == 4) {
            return new dhl(DEFAULT_INSTANCE);
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
        synchronized (w.class) {
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

    public final j j() {
        return this.typeCase_ == 3 ? (j) this.type_ : j.f();
    }

    public final k k() {
        return this.typeCase_ == 2 ? (k) this.type_ : k.g();
    }

    public final fhl l() {
        int i = this.typeCase_;
        if (i == 0) {
            return fhl.f;
        }
        if (i == 1) {
            return fhl.a;
        }
        if (i == 2) {
            return fhl.b;
        }
        if (i == 3) {
            return fhl.c;
        }
        if (i == 4) {
            return fhl.d;
        }
        if (i != 5) {
            return null;
        }
        return fhl.e;
    }

    public final m m() {
        return this.typeCase_ == 4 ? (m) this.type_ : m.g();
    }

    public final v n() {
        return this.typeCase_ == 1 ? (v) this.type_ : v.k();
    }

    public final boolean o() {
        return this.typeCase_ == 3;
    }

    public final boolean p() {
        return this.typeCase_ == 2;
    }

    public final boolean q() {
        return this.typeCase_ == 5;
    }

    public final boolean r() {
        return this.typeCase_ == 4;
    }

    public final boolean s() {
        return this.typeCase_ == 1;
    }
}
