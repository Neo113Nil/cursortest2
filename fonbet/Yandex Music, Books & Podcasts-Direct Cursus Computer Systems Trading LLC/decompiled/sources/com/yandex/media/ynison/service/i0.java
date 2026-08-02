package com.yandex.media.ynison.service;

import defpackage.c8;
import defpackage.j3d;
import defpackage.meq;
import defpackage.mse;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.u8;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class i0 extends o3d implements xzh {
    private static final i0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYABLE_INDICES_FIELD_NUMBER = 1;
    private int playableIndicesMemoizedSerializedSize = -1;
    private mse playableIndices_ = o3d.emptyIntList();

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        o3d.registerDefaultInstance(i0.class, i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(i0 i0Var, Iterable iterable) {
        mse mseVar = i0Var.playableIndices_;
        if (!((u8) mseVar).a) {
            i0Var.playableIndices_ = o3d.mutableCopy(mseVar);
        }
        c8.addAll(iterable, i0Var.playableIndices_);
    }

    public static void g(i0 i0Var) {
        i0Var.getClass();
        i0Var.playableIndices_ = o3d.emptyIntList();
    }

    public static i0 h() {
        return DEFAULT_INSTANCE;
    }

    public static meq k() {
        return (meq) DEFAULT_INSTANCE.createBuilder();
    }

    public static meq l(i0 i0Var) {
        return (meq) DEFAULT_INSTANCE.createBuilder(i0Var);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001+", new Object[]{"playableIndices_"});
        }
        if (ordinal == 3) {
            return new i0();
        }
        if (ordinal == 4) {
            return new meq(DEFAULT_INSTANCE);
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
        synchronized (i0.class) {
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
        return this.playableIndices_.size();
    }

    public final mse j() {
        return this.playableIndices_;
    }
}
