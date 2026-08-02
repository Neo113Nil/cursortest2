package com.yandex.media.ynison.service;

import defpackage.bgw;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.su4;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class w0 extends o3d implements xzh {
    public static final int APP_NAME_FIELD_NUMBER = 2;
    public static final int APP_VERSION_FIELD_NUMBER = 3;
    private static final w0 DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String appName_ = "";
    private String appVersion_ = "";
    private int type_;

    static {
        w0 w0Var = new w0();
        DEFAULT_INSTANCE = w0Var;
        o3d.registerDefaultInstance(w0.class, w0Var);
    }

    public static void f(w0 w0Var, String str) {
        w0Var.getClass();
        w0Var.appName_ = str;
    }

    public static void g(w0 w0Var, String str) {
        w0Var.getClass();
        w0Var.appVersion_ = str;
    }

    public static void h(w0 w0Var, int i) {
        w0Var.getClass();
        w0Var.type_ = su4.b(i);
    }

    public static bgw k() {
        return (bgw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "appName_", "appVersion_"});
        }
        if (ordinal == 3) {
            return new w0();
        }
        if (ordinal == 4) {
            return new bgw(DEFAULT_INSTANCE);
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
        synchronized (w0.class) {
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

    public final String getAppVersion() {
        return this.appVersion_;
    }

    public final String i() {
        return this.appName_;
    }

    public final int j() {
        int a = su4.a(this.type_);
        if (a == 0) {
            return 11;
        }
        return a;
    }
}
