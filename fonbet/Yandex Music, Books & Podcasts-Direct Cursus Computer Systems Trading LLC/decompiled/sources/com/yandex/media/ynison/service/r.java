package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nhl;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class r extends o3d implements xzh {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int PHONOTEKA_SOURCE_FIELD_NUMBER = 3;
    public static final int WAVE_SOURCE_FIELD_NUMBER = 2;
    private int key_;
    private int trackSourceCase_ = 0;
    private Object trackSource_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        o3d.registerDefaultInstance(r.class, rVar);
    }

    public static void f(r rVar, int i) {
        rVar.key_ = i;
    }

    public static void g(r rVar, p pVar) {
        rVar.getClass();
        rVar.trackSource_ = pVar;
        rVar.trackSourceCase_ = 3;
    }

    public static void h(r rVar, t tVar) {
        rVar.getClass();
        tVar.getClass();
        rVar.trackSource_ = tVar;
        rVar.trackSourceCase_ = 2;
    }

    public static nhl n() {
        return (nhl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000", new Object[]{"trackSource_", "trackSourceCase_", "key_", t.class, p.class});
        }
        if (ordinal == 3) {
            return new r();
        }
        if (ordinal == 4) {
            return new nhl(DEFAULT_INSTANCE);
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
        synchronized (r.class) {
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

    public final int i() {
        return this.key_;
    }

    public final p j() {
        return this.trackSourceCase_ == 3 ? (p) this.trackSource_ : p.l();
    }

    public final int k() {
        int i = this.trackSourceCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final t l() {
        return this.trackSourceCase_ == 2 ? (t) this.trackSource_ : t.g();
    }

    public final boolean m() {
        return this.trackSourceCase_ == 2;
    }
}
