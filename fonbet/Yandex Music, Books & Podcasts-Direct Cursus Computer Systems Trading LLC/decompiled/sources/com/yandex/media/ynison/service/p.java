package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.lhl;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xq0;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class p extends o3d implements xzh {
    public static final int ALBUM_ID_FIELD_NUMBER = 4;
    public static final int ARTIST_ID_FIELD_NUMBER = 2;
    private static final p DEFAULT_INSTANCE;
    public static final int ENTITY_CONTEXT_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int PLAYLIST_ID_FIELD_NUMBER = 3;
    private int entityContext_;
    private int idCase_ = 0;
    private Object id_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        o3d.registerDefaultInstance(p.class, pVar);
    }

    public static void f(p pVar, n nVar) {
        pVar.getClass();
        pVar.id_ = nVar;
        pVar.idCase_ = 4;
    }

    public static void g(p pVar, o oVar) {
        pVar.getClass();
        pVar.id_ = oVar;
        pVar.idCase_ = 2;
    }

    public static void h(int i, p pVar) {
        int i2;
        pVar.getClass();
        if (i != 9) {
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
                    i2 = 7;
                    break;
                case 9:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
            pVar.entityContext_ = i2;
        }
        xq0.x("Can't get the number of an unknown enum value.");
        i2 = 0;
        pVar.entityContext_ = i2;
    }

    public static void i(p pVar, q qVar) {
        pVar.getClass();
        pVar.id_ = qVar;
        pVar.idCase_ = 3;
    }

    public static p l() {
        return DEFAULT_INSTANCE;
    }

    public static lhl s() {
        return (lhl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"id_", "idCase_", "entityContext_", o.class, q.class, n.class});
        }
        if (ordinal == 3) {
            return new p();
        }
        if (ordinal == 4) {
            return new lhl(DEFAULT_INSTANCE);
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
        synchronized (p.class) {
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

    public final n j() {
        return this.idCase_ == 4 ? (n) this.id_ : n.g();
    }

    public final o k() {
        return this.idCase_ == 2 ? (o) this.id_ : o.g();
    }

    public final int m() {
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

    public final int n() {
        int i = this.idCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public final q o() {
        return this.idCase_ == 3 ? (q) this.id_ : q.h();
    }

    public final boolean p() {
        return this.idCase_ == 4;
    }

    public final boolean q() {
        return this.idCase_ == 2;
    }

    public final boolean r() {
        return this.idCase_ == 3;
    }
}
