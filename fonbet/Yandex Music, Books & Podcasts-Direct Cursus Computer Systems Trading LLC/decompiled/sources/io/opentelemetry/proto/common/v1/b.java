package io.opentelemetry.proto.common.v1;

import androidx.core.app.q;
import defpackage.g3d;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class b extends o3d implements xzh {
    public static final b a;
    public static volatile j3d b;

    static {
        b bVar = new b();
        a = bVar;
        o3d.registerDefaultInstance(b.class, bVar);
    }

    public b() {
        o3d.emptyProtobufList();
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
                return o3d.newMessageInfo(a, "\u0000\u0000", new Object[0]);
            case 3:
                return new b();
            case 4:
                return new g3d(a);
            case 5:
                return a;
            case 6:
                j3d j3dVar2 = b;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (b.class) {
                    try {
                        j3dVar = b;
                        if (j3dVar == null) {
                            j3dVar = new j3d(a);
                            b = j3dVar;
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
