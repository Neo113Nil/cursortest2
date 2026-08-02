package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.wnl;
import defpackage.xq0;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class b0 extends o3d implements xzh {
    private static final b0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int REPEAT_MODE_FIELD_NUMBER = 1;
    private int repeatMode_;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        o3d.registerDefaultInstance(b0.class, b0Var);
    }

    public static void f(b0 b0Var, int i) {
        int i2;
        b0Var.getClass();
        if (i != 5) {
            i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                    if (i == 3) {
                        i2 = 2;
                    } else if (i != 4) {
                        if (i != 5) {
                            throw null;
                        }
                        i2 = -1;
                    }
                }
                b0Var.repeatMode_ = i2;
            }
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
        i2 = 0;
        b0Var.repeatMode_ = i2;
    }

    public static b0 g() {
        return DEFAULT_INSTANCE;
    }

    public static wnl i() {
        return (wnl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"repeatMode_"});
        }
        if (ordinal == 3) {
            return new b0();
        }
        if (ordinal == 4) {
            return new wnl(DEFAULT_INSTANCE);
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
        synchronized (b0.class) {
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
        int i = this.repeatMode_;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i2 = i != 3 ? 0 : 4;
                }
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 5;
        }
        return i2;
    }
}
