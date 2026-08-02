package com.yandex.music.shared.auth.proto;

import com.yandex.metrica.push.common.CoreConstants;
import defpackage.fir;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;

/* loaded from: classes3.dex */
public final class a extends o3d implements xzh {
    public static final a l;
    public static volatile j3d m;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean j;
    public String a = "";
    public String c = "";
    public String g = "";
    public rse h = o3d.emptyProtobufList();
    public String i = "";
    public String k = "";

    static {
        a aVar = new a();
        l = aVar;
        o3d.registerDefaultInstance(a.class, aVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(l, "\u0000\u000b\u0000\u0000\u0001\u0017\u000b\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0007\u0007\t\u0007\u000b\u0007\rȈ\u0011Ț\u0013Ȉ\u0015\u0007\u0017Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", CoreConstants.PushMessage.SERVICE_TYPE, "j", "k"});
        }
        if (ordinal == 3) {
            return new a();
        }
        if (ordinal == 4) {
            return new fir(l);
        }
        if (ordinal == 5) {
            return l;
        }
        if (ordinal != 6) {
            throw null;
        }
        j3d j3dVar2 = m;
        if (j3dVar2 != null) {
            return j3dVar2;
        }
        synchronized (a.class) {
            try {
                j3dVar = m;
                if (j3dVar == null) {
                    j3dVar = new j3d(l);
                    m = j3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j3dVar;
    }
}
