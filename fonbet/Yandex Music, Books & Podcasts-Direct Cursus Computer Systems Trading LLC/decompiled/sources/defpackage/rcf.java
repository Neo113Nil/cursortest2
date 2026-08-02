package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class rcf extends c {
    private static final rcf DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private qse keyInfo_ = azm.d;
    private int primaryKeyId_;

    static {
        rcf rcfVar = new rcf();
        DEFAULT_INSTANCE = rcfVar;
        c.l(rcf.class, rcfVar);
    }

    public static void m(rcf rcfVar, int i) {
        rcfVar.primaryKeyId_ = i;
    }

    public static void n(rcf rcfVar, qcf qcfVar) {
        rcfVar.getClass();
        qse qseVar = rcfVar.keyInfo_;
        if (!((t8) qseVar).a) {
            int size = qseVar.size();
            rcfVar.keyInfo_ = qseVar.b(size == 0 ? 10 : size * 2);
        }
        rcfVar.keyInfo_.add(qcfVar);
    }

    public static ocf p() {
        return (ocf) DEFAULT_INSTANCE.e();
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", qcf.class});
            case 3:
                return new rcf();
            case 4:
                return new ocf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (rcf.class) {
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

    public final qcf o() {
        return (qcf) this.keyInfo_.get(0);
    }
}
