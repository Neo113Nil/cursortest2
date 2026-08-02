package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class w6w extends c {
    private static final w6w DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private int version_;

    static {
        w6w w6wVar = new w6w();
        DEFAULT_INSTANCE = w6wVar;
        c.l(w6w.class, w6wVar);
    }

    public static void m(w6w w6wVar) {
        w6wVar.version_ = 0;
    }

    public static void n(w6w w6wVar, jn3 jn3Var) {
        w6wVar.getClass();
        w6wVar.keyValue_ = jn3Var;
    }

    public static v6w q() {
        return (v6w) DEFAULT_INSTANCE.e();
    }

    public static w6w r(mn3 mn3Var, y0c y0cVar) {
        return (w6w) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c
    public final Object f(int i) {
        m7k m7kVar;
        switch (ouj.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new w6w();
            case 4:
                return new v6w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (w6w.class) {
                    try {
                        m7kVar = PARSER;
                        if (m7kVar == null) {
                            m7kVar = new i3d();
                            PARSER = m7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return m7kVar;
            default:
                q.i();
                return null;
        }
    }

    public final mn3 o() {
        return this.keyValue_;
    }

    public final int p() {
        return this.version_;
    }
}
