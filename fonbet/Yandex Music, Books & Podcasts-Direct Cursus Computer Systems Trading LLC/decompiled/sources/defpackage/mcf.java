package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class mcf extends c {
    private static final mcf DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile m7k PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private oaf keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        mcf mcfVar = new mcf();
        DEFAULT_INSTANCE = mcfVar;
        c.l(mcf.class, mcfVar);
    }

    public static void m(mcf mcfVar, oaf oafVar) {
        mcfVar.getClass();
        mcfVar.keyData_ = oafVar;
    }

    public static void n(mcf mcfVar, oyj oyjVar) {
        mcfVar.getClass();
        mcfVar.outputPrefixType_ = oyjVar.b();
    }

    public static void o(mcf mcfVar) {
        mcfVar.getClass();
        mcfVar.status_ = fbf.ENABLED.a();
    }

    public static void p(mcf mcfVar, int i) {
        mcfVar.keyId_ = i;
    }

    public static lcf v() {
        return (lcf) DEFAULT_INSTANCE.e();
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new mcf();
            case 4:
                return new lcf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (mcf.class) {
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

    public final oaf q() {
        oaf oafVar = this.keyData_;
        return oafVar == null ? oaf.p() : oafVar;
    }

    public final int r() {
        return this.keyId_;
    }

    public final oyj s() {
        oyj a = oyj.a(this.outputPrefixType_);
        return a == null ? oyj.UNRECOGNIZED : a;
    }

    public final fbf t() {
        int i = this.status_;
        fbf fbfVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : fbf.DESTROYED : fbf.DISABLED : fbf.ENABLED : fbf.UNKNOWN_STATUS;
        return fbfVar == null ? fbf.UNRECOGNIZED : fbfVar;
    }

    public final boolean u() {
        return this.keyData_ != null;
    }
}
