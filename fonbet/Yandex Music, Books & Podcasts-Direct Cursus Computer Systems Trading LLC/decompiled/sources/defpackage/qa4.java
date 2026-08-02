package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class qa4 extends c {
    private static final qa4 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private mn3 keyValue_ = mn3.b;
    private int version_;

    static {
        qa4 qa4Var = new qa4();
        DEFAULT_INSTANCE = qa4Var;
        c.l(qa4.class, qa4Var);
    }

    public static void m(qa4 qa4Var) {
        qa4Var.version_ = 0;
    }

    public static void n(qa4 qa4Var, jn3 jn3Var) {
        qa4Var.getClass();
        qa4Var.keyValue_ = jn3Var;
    }

    public static pa4 q() {
        return (pa4) DEFAULT_INSTANCE.e();
    }

    public static qa4 r(mn3 mn3Var, y0c y0cVar) {
        return (qa4) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new qa4();
            case 4:
                return new pa4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (qa4.class) {
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
