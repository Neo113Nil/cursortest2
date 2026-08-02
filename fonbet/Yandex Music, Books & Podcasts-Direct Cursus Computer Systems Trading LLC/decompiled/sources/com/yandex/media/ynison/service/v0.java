package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.k4u;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xq0;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class v0 extends o3d implements xzh {
    private static final v0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int RECOMMENDATION_TYPE_FIELD_NUMBER = 1;
    private int recommendationType_;

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        o3d.registerDefaultInstance(v0.class, v0Var);
    }

    public static void f(v0 v0Var, int i) {
        int i2;
        v0Var.getClass();
        if (i != 8) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = 5;
                    break;
                case 7:
                    i2 = 6;
                    break;
                case 8:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
            v0Var.recommendationType_ = i2;
        }
        xq0.x("Can't get the number of an unknown enum value.");
        i2 = 0;
        v0Var.recommendationType_ = i2;
    }

    public static v0 g() {
        return DEFAULT_INSTANCE;
    }

    public static k4u i() {
        return (k4u) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"recommendationType_"});
        }
        if (ordinal == 3) {
            return new v0();
        }
        if (ordinal == 4) {
            return new k4u(DEFAULT_INSTANCE);
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
        synchronized (v0.class) {
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
        int i;
        switch (this.recommendationType_) {
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
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 8;
        }
        return i;
    }
}
