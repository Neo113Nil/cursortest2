package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class x0e extends c {
    private static final x0e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private z0e params_;
    private int version_;

    static {
        x0e x0eVar = new x0e();
        DEFAULT_INSTANCE = x0eVar;
        c.l(x0e.class, x0eVar);
    }

    public static void m(x0e x0eVar) {
        x0eVar.version_ = 0;
    }

    public static void n(x0e x0eVar, z0e z0eVar) {
        x0eVar.getClass();
        z0eVar.getClass();
        x0eVar.params_ = z0eVar;
    }

    public static void o(x0e x0eVar, jn3 jn3Var) {
        x0eVar.getClass();
        x0eVar.keyValue_ = jn3Var;
    }

    public static x0e p() {
        return DEFAULT_INSTANCE;
    }

    public static w0e t() {
        return (w0e) DEFAULT_INSTANCE.e();
    }

    public static x0e u(mn3 mn3Var, y0c y0cVar) {
        return (x0e) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new x0e();
            case 4:
                return new w0e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (x0e.class) {
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

    public final mn3 q() {
        return this.keyValue_;
    }

    public final z0e r() {
        z0e z0eVar = this.params_;
        return z0eVar == null ? z0e.m() : z0eVar;
    }

    public final int s() {
        return this.version_;
    }
}
