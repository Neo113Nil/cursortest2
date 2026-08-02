package io.opentelemetry.proto.common.v1;

import androidx.core.app.q;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.nbf;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class d extends o3d implements xzh {
    public static final d d;
    public static volatile j3d e;
    public int a;
    public String b = "";
    public a c;

    static {
        d dVar = new d();
        d = dVar;
        o3d.registerDefaultInstance(d.class, dVar);
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        j3d j3dVar;
        switch (n3dVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return o3d.newMessageInfo(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new d();
            case 4:
                return new nbf(d);
            case 5:
                return d;
            case 6:
                j3d j3dVar2 = e;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (d.class) {
                    try {
                        j3dVar = e;
                        if (j3dVar == null) {
                            j3dVar = new j3d(d);
                            e = j3dVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j3dVar;
            default:
                q.i();
                return null;
        }
    }
}
