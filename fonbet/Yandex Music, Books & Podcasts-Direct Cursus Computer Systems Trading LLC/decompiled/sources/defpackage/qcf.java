package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class qcf extends c {
    private static final qcf DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile m7k PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        qcf qcfVar = new qcf();
        DEFAULT_INSTANCE = qcfVar;
        c.l(qcf.class, qcfVar);
    }

    public static void m(qcf qcfVar, String str) {
        qcfVar.getClass();
        str.getClass();
        qcfVar.typeUrl_ = str;
    }

    public static void n(qcf qcfVar, oyj oyjVar) {
        qcfVar.getClass();
        qcfVar.outputPrefixType_ = oyjVar.b();
    }

    public static void o(qcf qcfVar, fbf fbfVar) {
        qcfVar.getClass();
        qcfVar.status_ = fbfVar.a();
    }

    public static void p(qcf qcfVar, int i) {
        qcfVar.keyId_ = i;
    }

    public static pcf r() {
        return (pcf) DEFAULT_INSTANCE.e();
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new qcf();
            case 4:
                return new pcf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (qcf.class) {
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

    public final int q() {
        return this.keyId_;
    }
}
