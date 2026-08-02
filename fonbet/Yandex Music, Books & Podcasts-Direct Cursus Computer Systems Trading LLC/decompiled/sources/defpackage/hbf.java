package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class hbf extends c {
    private static final hbf DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile m7k PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private mn3 value_ = mn3.b;

    static {
        hbf hbfVar = new hbf();
        DEFAULT_INSTANCE = hbfVar;
        c.l(hbf.class, hbfVar);
    }

    public static void m(hbf hbfVar, String str) {
        hbfVar.getClass();
        hbfVar.typeUrl_ = str;
    }

    public static void n(hbf hbfVar, jn3 jn3Var) {
        hbfVar.getClass();
        hbfVar.value_ = jn3Var;
    }

    public static void o(hbf hbfVar, oyj oyjVar) {
        hbfVar.getClass();
        hbfVar.outputPrefixType_ = oyjVar.b();
    }

    public static hbf p() {
        return DEFAULT_INSTANCE;
    }

    public static gbf t() {
        return (gbf) DEFAULT_INSTANCE.e();
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new hbf();
            case 4:
                return new gbf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (hbf.class) {
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

    public final oyj q() {
        oyj a = oyj.a(this.outputPrefixType_);
        return a == null ? oyj.UNRECOGNIZED : a;
    }

    public final String r() {
        return this.typeUrl_;
    }

    public final mn3 s() {
        return this.value_;
    }
}
