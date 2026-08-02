package io.opentelemetry.proto.trace.v1;

import androidx.core.app.q;
import defpackage.iuo;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class b extends o3d implements xzh {
    public static final b d;
    public static volatile j3d e;
    public int a;
    public io.opentelemetry.proto.common.v1.c b;
    public rse c = o3d.emptyProtobufList();

    static {
        b bVar = new b();
        d = bVar;
        o3d.registerDefaultInstance(b.class, bVar);
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
                return o3d.newMessageInfo(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", c.class});
            case 3:
                return new b();
            case 4:
                return new iuo(d);
            case 5:
                return d;
            case 6:
                j3d j3dVar2 = e;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (b.class) {
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
