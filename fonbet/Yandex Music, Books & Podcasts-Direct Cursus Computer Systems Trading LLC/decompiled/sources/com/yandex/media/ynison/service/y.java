package com.yandex.media.ynison.service;

import defpackage.dlr;
import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class y extends o3d implements xzh {
    public static final int COVER_URL_FIELD_NUMBER = 4;
    private static final y DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int PLAYABLE_ID_FIELD_NUMBER = 1;
    public static final int PLAYABLE_TYPE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private dlr coverUrl_;
    private int playableType_;
    private String playableId_ = "";
    private String title_ = "";

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        o3d.registerDefaultInstance(y.class, yVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "playableId_", "playableType_", "title_", "coverUrl_"});
        }
        if (ordinal == 3) {
            return new y();
        }
        if (ordinal == 4) {
            return new g3d(DEFAULT_INSTANCE);
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
        synchronized (y.class) {
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
}
