package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class y0e extends c {
    private static final y0e DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private z0e params_;
    private int version_;

    static {
        y0e y0eVar = new y0e();
        DEFAULT_INSTANCE = y0eVar;
        c.l(y0e.class, y0eVar);
    }

    public static y0e m() {
        return DEFAULT_INSTANCE;
    }

    public static y0e p(mn3 mn3Var, y0c y0cVar) {
        return (y0e) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new y0e();
            case 4:
                return new co(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (y0e.class) {
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

    public final int n() {
        return this.keySize_;
    }

    public final z0e o() {
        z0e z0eVar = this.params_;
        return z0eVar == null ? z0e.m() : z0eVar;
    }
}
