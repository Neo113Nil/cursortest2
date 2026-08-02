package com.yandex.media.ynison.service;

import defpackage.j3d;
import defpackage.l08;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.su4;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class c extends o3d implements xzh {
    public static final int APP_NAME_FIELD_NUMBER = 4;
    public static final int APP_VERSION_FIELD_NUMBER = 5;
    private static final c DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    private String deviceId_ = "";
    private String title_ = "";
    private String appName_ = "";
    private String appVersion_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        o3d.registerDefaultInstance(c.class, cVar);
    }

    public static void f(c cVar, String str) {
        cVar.getClass();
        cVar.appName_ = str;
    }

    public static void g(c cVar, String str) {
        cVar.getClass();
        cVar.appVersion_ = str;
    }

    public static void h(c cVar, String str) {
        cVar.getClass();
        cVar.deviceId_ = str;
    }

    public static void i(c cVar, String str) {
        cVar.getClass();
        cVar.title_ = str;
    }

    public static void j(c cVar, int i) {
        cVar.getClass();
        cVar.type_ = su4.b(i);
    }

    public static c l() {
        return DEFAULT_INSTANCE;
    }

    public static l08 p() {
        return (l08) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ", new Object[]{"deviceId_", "title_", "type_", "appName_", "appVersion_"});
        }
        if (ordinal == 3) {
            return new c();
        }
        if (ordinal == 4) {
            return new l08(DEFAULT_INSTANCE);
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
        synchronized (c.class) {
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

    public final String k() {
        return this.appName_;
    }

    public final String m() {
        return this.deviceId_;
    }

    public final String n() {
        return this.title_;
    }

    public final int o() {
        int a = su4.a(this.type_);
        if (a == 0) {
            return 11;
        }
        return a;
    }
}
