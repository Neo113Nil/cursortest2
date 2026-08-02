package io.opentelemetry.proto.trace.v1;

import androidx.core.app.q;
import defpackage.cqs;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.rse;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class d extends o3d implements xzh {
    public static final d b;
    public static volatile j3d c;
    public rse a = o3d.emptyProtobufList();

    static {
        d dVar = new d();
        b = dVar;
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
                return o3d.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", a.class});
            case 3:
                return new d();
            case 4:
                return new cqs(b);
            case 5:
                return b;
            case 6:
                j3d j3dVar2 = c;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (d.class) {
                    try {
                        j3dVar = c;
                        if (j3dVar == null) {
                            j3dVar = new j3d(b);
                            c = j3dVar;
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
