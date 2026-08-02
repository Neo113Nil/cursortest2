package com.google.crypto.tink.shaded.protobuf;

import defpackage.aye;
import defpackage.b6e;
import defpackage.cmt;
import defpackage.d8;
import defpackage.e7o;
import defpackage.f3d;
import defpackage.jn3;
import defpackage.kac;
import defpackage.kkt;
import defpackage.kr4;
import defpackage.mn3;
import defpackage.n8n;
import defpackage.pit;
import defpackage.vto;
import defpackage.wx0;
import defpackage.wym;
import defpackage.xq0;
import defpackage.y0c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class c extends d8 {
    private static Map<Object, c> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected kkt unknownFields;

    public c() {
        this.memoizedHashCode = 0;
        this.unknownFields = kkt.f;
        this.memoizedSerializedSize = -1;
    }

    public static c g(Class cls) {
        c cVar = defaultInstanceMap.get(cls);
        if (cVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                cVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = (c) ((c) cmt.a(cls)).f(6);
        if (cVar2 != null) {
            defaultInstanceMap.put(cls, cVar2);
            return cVar2;
        }
        e7o.n();
        return null;
    }

    public static Object h(Method method, c cVar, Object... objArr) {
        try {
            return method.invoke(cVar, objArr);
        } catch (IllegalAccessException e) {
            kac.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            kac.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static c j(c cVar, mn3 mn3Var, y0c y0cVar) {
        jn3 jn3Var = (jn3) mn3Var;
        byte[] bArr = jn3Var.d;
        int s = jn3Var.s();
        int size = jn3Var.size();
        kr4 kr4Var = new kr4(bArr, s, size, true);
        try {
            kr4Var.e(size);
            c cVar2 = (c) cVar.f(4);
            try {
                wym wymVar = wym.c;
                wymVar.getClass();
                vto a = wymVar.a(cVar2.getClass());
                n8n n8nVar = kr4Var.b;
                if (n8nVar == null) {
                    n8nVar = new n8n(kr4Var);
                }
                a.d(cVar2, n8nVar, y0cVar);
                a.a(cVar2);
                if (kr4Var.h != 0) {
                    throw new aye("Protocol message end-group tag did not match expected tag.");
                }
                if (cVar2.i()) {
                    return cVar2;
                }
                throw new aye(new pit().getMessage());
            } catch (IOException e) {
                if (e.getCause() instanceof aye) {
                    throw ((aye) e.getCause());
                }
                throw new aye(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof aye) {
                    throw ((aye) e2.getCause());
                }
                throw e2;
            }
        } catch (aye e3) {
            xq0.t(e3);
            return null;
        }
    }

    public static c k(c cVar, byte[] bArr, y0c y0cVar) {
        int length = bArr.length;
        c cVar2 = (c) cVar.f(4);
        try {
            wym wymVar = wym.c;
            wymVar.getClass();
            vto a = wymVar.a(cVar2.getClass());
            wx0 wx0Var = new wx0();
            y0cVar.getClass();
            a.i(cVar2, bArr, 0, length, wx0Var);
            a.a(cVar2);
            if (cVar2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (cVar2.i()) {
                return cVar2;
            }
            throw new aye(new pit().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof aye) {
                throw ((aye) e.getCause());
            }
            throw new aye(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw aye.e();
        }
    }

    public static void l(Class cls, c cVar) {
        defaultInstanceMap.put(cls, cVar);
    }

    @Override // defpackage.d8
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            wym wymVar = wym.c;
            wymVar.getClass();
            this.memoizedSerializedSize = wymVar.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.d8
    public final void d(a aVar) {
        wym wymVar = wym.c;
        wymVar.getClass();
        vto a = wymVar.a(getClass());
        b bVar = aVar.a;
        if (bVar == null) {
            bVar = new b(aVar);
        }
        a.e(this, bVar);
    }

    public final f3d e() {
        return (f3d) f(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((c) f(6)).getClass().isInstance(obj)) {
            return false;
        }
        wym wymVar = wym.c;
        wymVar.getClass();
        return wymVar.a(getClass()).g(this, (c) obj);
    }

    public abstract Object f(int i);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        wym wymVar = wym.c;
        wymVar.getClass();
        int h = wymVar.a(getClass()).h(this);
        this.memoizedHashCode = h;
        return h;
    }

    public final boolean i() {
        byte byteValue = ((Byte) f(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        wym wymVar = wym.c;
        wymVar.getClass();
        boolean b = wymVar.a(getClass()).b(this);
        f(2);
        return b;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        d.c(this, sb, 0);
        return sb.toString();
    }
}
