package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class bp extends c {
    private static final bp DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        c.l(bp.class, bpVar);
    }

    public static void m(bp bpVar) {
        bpVar.keySize_ = 32;
    }

    public static ap o() {
        return (ap) DEFAULT_INSTANCE.e();
    }

    public static bp p(mn3 mn3Var, y0c y0cVar) {
        return (bp) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new bp();
            case 4:
                return new ap(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (bp.class) {
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
}
