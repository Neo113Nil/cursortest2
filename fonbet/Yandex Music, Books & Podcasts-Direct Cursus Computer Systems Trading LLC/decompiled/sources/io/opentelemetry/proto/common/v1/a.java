package io.opentelemetry.proto.common.v1;

import androidx.core.app.q;
import defpackage.co0;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class a extends o3d implements xzh {
    public static final a c;
    public static volatile j3d d;
    public int a = 0;
    public Object b;

    static {
        a aVar = new a();
        c = aVar;
        o3d.registerDefaultInstance(a.class, aVar);
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
                return o3d.newMessageInfo(c, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000\u0005<\u0000\u0006<\u0000\u0007=\u0000", new Object[]{"b", "a", b.class, e.class});
            case 3:
                return new a();
            case 4:
                return new co0(c);
            case 5:
                return c;
            case 6:
                j3d j3dVar2 = d;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (a.class) {
                    try {
                        j3dVar = d;
                        if (j3dVar == null) {
                            j3dVar = new j3d(c);
                            d = j3dVar;
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
