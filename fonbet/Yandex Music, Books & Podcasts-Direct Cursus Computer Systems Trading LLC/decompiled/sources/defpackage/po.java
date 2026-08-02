package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class po extends c {
    private static final po DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private ro params_;
    private int version_;

    static {
        po poVar = new po();
        DEFAULT_INSTANCE = poVar;
        c.l(po.class, poVar);
    }

    public static void m(po poVar) {
        poVar.version_ = 0;
    }

    public static void n(po poVar, ro roVar) {
        poVar.getClass();
        roVar.getClass();
        poVar.params_ = roVar;
    }

    public static void o(po poVar, jn3 jn3Var) {
        poVar.getClass();
        poVar.keyValue_ = jn3Var;
    }

    public static po p() {
        return DEFAULT_INSTANCE;
    }

    public static oo t() {
        return (oo) DEFAULT_INSTANCE.e();
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
                return new po();
            case 4:
                return new oo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (po.class) {
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

    public final ro r() {
        ro roVar = this.params_;
        return roVar == null ? ro.m() : roVar;
    }

    public final int s() {
        return this.version_;
    }
}
