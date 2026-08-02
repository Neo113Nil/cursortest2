package com.yandex.music.shared.relay.common.proto;

import com.yandex.metrica.push.common.CoreConstants;
import defpackage.j3d;
import defpackage.jtn;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;

/* loaded from: classes4.dex */
public final class g extends o3d implements xzh {
    public static final g m;
    public static volatile j3d n;
    public int a;
    public long d;
    public int l;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public rse k = o3d.emptyProtobufList();

    static {
        g gVar = new g();
        m = gVar;
        o3d.registerDefaultInstance(g.class, gVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(m, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\n\u001b\u000bင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", CoreConstants.PushMessage.SERVICE_TYPE, "j", "k", f.class, "l"});
        }
        if (ordinal == 3) {
            return new g();
        }
        if (ordinal == 4) {
            return new jtn(m);
        }
        if (ordinal == 5) {
            return m;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = n;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (g.class) {
            try {
                j3dVar = n;
                if (j3dVar == null) {
                    j3dVar = new j3d(m);
                    n = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
