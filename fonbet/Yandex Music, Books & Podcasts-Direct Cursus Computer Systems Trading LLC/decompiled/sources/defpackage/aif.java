package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class aif extends c {
    private static final aif DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private bif params_;
    private int version_;

    static {
        aif aifVar = new aif();
        DEFAULT_INSTANCE = aifVar;
        c.l(aif.class, aifVar);
    }

    public static void m(aif aifVar) {
        aifVar.version_ = 0;
    }

    public static void n(aif aifVar, bif bifVar) {
        aifVar.getClass();
        bifVar.getClass();
        aifVar.params_ = bifVar;
    }

    public static zhf q() {
        return (zhf) DEFAULT_INSTANCE.e();
    }

    public static aif r(mn3 mn3Var, y0c y0cVar) {
        return (aif) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new aif();
            case 4:
                return new zhf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (aif.class) {
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

    public final bif o() {
        bif bifVar = this.params_;
        return bifVar == null ? bif.m() : bifVar;
    }

    public final int p() {
        return this.version_;
    }
}
