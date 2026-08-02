package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class ip extends c {
    private static final ip DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private int version_;

    static {
        ip ipVar = new ip();
        DEFAULT_INSTANCE = ipVar;
        c.l(ip.class, ipVar);
    }

    public static void m(ip ipVar) {
        ipVar.version_ = 0;
    }

    public static void n(ip ipVar, jn3 jn3Var) {
        ipVar.getClass();
        ipVar.keyValue_ = jn3Var;
    }

    public static hp q() {
        return (hp) DEFAULT_INSTANCE.e();
    }

    public static ip r(mn3 mn3Var, y0c y0cVar) {
        return (ip) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new ip();
            case 4:
                return new hp(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (ip.class) {
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
