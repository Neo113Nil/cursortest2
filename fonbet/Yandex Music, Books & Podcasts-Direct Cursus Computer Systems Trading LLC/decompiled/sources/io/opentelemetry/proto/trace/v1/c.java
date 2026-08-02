package io.opentelemetry.proto.trace.v1;

import androidx.core.app.q;
import defpackage.j3d;
import defpackage.kn3;
import defpackage.n3d;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.rse;
import defpackage.w3r;
import defpackage.xzh;

/* loaded from: classes5.dex */
public final class c extends o3d implements xzh {
    public static final c i;
    public static volatile j3d j;
    public nn3 a;
    public nn3 b;
    public nn3 c;
    public String d;
    public int e;
    public long f;
    public long g;
    public rse h;

    static {
        c cVar = new c();
        i = cVar;
        o3d.registerDefaultInstance(c.class, cVar);
    }

    public c() {
        kn3 kn3Var = nn3.b;
        this.a = kn3Var;
        this.b = kn3Var;
        this.c = kn3Var;
        this.d = "";
        this.h = o3d.emptyProtobufList();
        o3d.emptyProtobufList();
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
                return o3d.newMessageInfo(i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001\n\u0002\n\u0004\n\u0005Ȉ\u0006\f\u0007\u0005\b\u0005\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", io.opentelemetry.proto.common.v1.d.class});
            case 3:
                return new c();
            case 4:
                return new w3r(i);
            case 5:
                return i;
            case 6:
                j3d j3dVar2 = j;
                if (j3dVar2 != null) {
                    return j3dVar2;
                }
                synchronized (c.class) {
                    try {
                        j3dVar = j;
                        if (j3dVar == null) {
                            j3dVar = new j3d(i);
                            j = j3dVar;
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
