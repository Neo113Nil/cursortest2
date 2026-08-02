package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class uo extends c {
    private static final uo DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private wo params_;
    private int version_;

    static {
        uo uoVar = new uo();
        DEFAULT_INSTANCE = uoVar;
        c.l(uo.class, uoVar);
    }

    public static void m(uo uoVar) {
        uoVar.version_ = 0;
    }

    public static void n(uo uoVar, wo woVar) {
        uoVar.getClass();
        woVar.getClass();
        uoVar.params_ = woVar;
    }

    public static void o(uo uoVar, jn3 jn3Var) {
        uoVar.getClass();
        uoVar.keyValue_ = jn3Var;
    }

    public static to s() {
        return (to) DEFAULT_INSTANCE.e();
    }

    public static uo t(mn3 mn3Var, y0c y0cVar) {
        return (uo) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new uo();
            case 4:
                return new to(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (uo.class) {
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

    public final mn3 p() {
        return this.keyValue_;
    }

    public final wo q() {
        wo woVar = this.params_;
        return woVar == null ? wo.m() : woVar;
    }

    public final int r() {
        return this.version_;
    }
}
