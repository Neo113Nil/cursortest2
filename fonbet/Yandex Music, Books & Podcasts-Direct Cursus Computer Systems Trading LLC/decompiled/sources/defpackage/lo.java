package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class lo extends c {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final lo DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile m7k PARSER;
    private qo aesCtrKeyFormat_;
    private y0e hmacKeyFormat_;

    static {
        lo loVar = new lo();
        DEFAULT_INSTANCE = loVar;
        c.l(lo.class, loVar);
    }

    public static lo o(mn3 mn3Var, y0c y0cVar) {
        return (lo) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new lo();
            case 4:
                return new co(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (lo.class) {
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

    public final qo m() {
        qo qoVar = this.aesCtrKeyFormat_;
        return qoVar == null ? qo.m() : qoVar;
    }

    public final y0e n() {
        y0e y0eVar = this.hmacKeyFormat_;
        return y0eVar == null ? y0e.m() : y0eVar;
    }
}
