package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class ko extends c {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final ko DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private po aesCtrKey_;
    private x0e hmacKey_;
    private int version_;

    static {
        ko koVar = new ko();
        DEFAULT_INSTANCE = koVar;
        c.l(ko.class, koVar);
    }

    public static void m(ko koVar) {
        koVar.version_ = 0;
    }

    public static void n(ko koVar, po poVar) {
        koVar.getClass();
        poVar.getClass();
        koVar.aesCtrKey_ = poVar;
    }

    public static void o(ko koVar, x0e x0eVar) {
        koVar.getClass();
        x0eVar.getClass();
        koVar.hmacKey_ = x0eVar;
    }

    public static jo s() {
        return (jo) DEFAULT_INSTANCE.e();
    }

    public static ko t(mn3 mn3Var, y0c y0cVar) {
        return (ko) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new ko();
            case 4:
                return new jo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (ko.class) {
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

    public final po p() {
        po poVar = this.aesCtrKey_;
        return poVar == null ? po.p() : poVar;
    }

    public final x0e q() {
        x0e x0eVar = this.hmacKey_;
        return x0eVar == null ? x0e.p() : x0eVar;
    }

    public final int r() {
        return this.version_;
    }
}
