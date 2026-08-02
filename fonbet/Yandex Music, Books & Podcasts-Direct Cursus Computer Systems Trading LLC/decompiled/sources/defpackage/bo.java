package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class bo extends c {
    private static final bo DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private io params_;
    private int version_;

    static {
        bo boVar = new bo();
        DEFAULT_INSTANCE = boVar;
        c.l(bo.class, boVar);
    }

    public static void m(bo boVar) {
        boVar.version_ = 0;
    }

    public static void n(bo boVar, jn3 jn3Var) {
        boVar.getClass();
        boVar.keyValue_ = jn3Var;
    }

    public static void o(bo boVar, io ioVar) {
        boVar.getClass();
        ioVar.getClass();
        boVar.params_ = ioVar;
    }

    public static ao s() {
        return (ao) DEFAULT_INSTANCE.e();
    }

    public static bo t(mn3 mn3Var, y0c y0cVar) {
        return (bo) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new bo();
            case 4:
                return new ao(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (bo.class) {
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

    public final io q() {
        io ioVar = this.params_;
        return ioVar == null ? io.m() : ioVar;
    }

    public final int r() {
        return this.version_;
    }
}
