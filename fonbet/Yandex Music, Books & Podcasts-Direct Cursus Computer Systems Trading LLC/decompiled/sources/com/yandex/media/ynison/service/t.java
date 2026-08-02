package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.phl;
import defpackage.xq0;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class t extends o3d implements xzh {
    private static final t DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
    private int sourceType_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        o3d.registerDefaultInstance(t.class, tVar);
    }

    public static void f(t tVar, int i) {
        int i2;
        tVar.getClass();
        if (i != 3) {
            i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw null;
                    }
                    i2 = -1;
                }
                tVar.sourceType_ = i2;
            }
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
        i2 = 0;
        tVar.sourceType_ = i2;
    }

    public static t g() {
        return DEFAULT_INSTANCE;
    }

    public static phl i() {
        return (phl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"sourceType_"});
        }
        if (ordinal == 3) {
            return new t();
        }
        if (ordinal == 4) {
            return new phl(DEFAULT_INSTANCE);
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
        synchronized (t.class) {
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

    public final int h() {
        int i = this.sourceType_;
        int i2 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i2 == 0) {
            return 3;
        }
        return i2;
    }
}
