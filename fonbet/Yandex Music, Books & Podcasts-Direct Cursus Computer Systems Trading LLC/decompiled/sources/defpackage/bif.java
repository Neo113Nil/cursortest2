package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class bif extends c {
    private static final bif DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile m7k PARSER;
    private hbf dekTemplate_;
    private String kekUri_ = "";

    static {
        bif bifVar = new bif();
        DEFAULT_INSTANCE = bifVar;
        c.l(bif.class, bifVar);
    }

    public static bif m() {
        return DEFAULT_INSTANCE;
    }

    public static bif p(mn3 mn3Var, y0c y0cVar) {
        return (bif) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new bif();
            case 4:
                return new co(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (bif.class) {
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

    public final hbf n() {
        hbf hbfVar = this.dekTemplate_;
        return hbfVar == null ? hbf.p() : hbfVar;
    }

    public final String o() {
        return this.kekUri_;
    }
}
