package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class u6b extends c {
    private static final u6b DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile m7k PARSER;
    private mn3 encryptedKeyset_ = mn3.b;
    private rcf keysetInfo_;

    static {
        u6b u6bVar = new u6b();
        DEFAULT_INSTANCE = u6bVar;
        c.l(u6b.class, u6bVar);
    }

    public static void m(u6b u6bVar, jn3 jn3Var) {
        u6bVar.getClass();
        u6bVar.encryptedKeyset_ = jn3Var;
    }

    public static void n(u6b u6bVar, rcf rcfVar) {
        u6bVar.getClass();
        u6bVar.keysetInfo_ = rcfVar;
    }

    public static t6b p() {
        return (t6b) DEFAULT_INSTANCE.e();
    }

    public static u6b q(byte[] bArr, y0c y0cVar) {
        return (u6b) c.k(DEFAULT_INSTANCE, bArr, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new u6b();
            case 4:
                return new t6b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (u6b.class) {
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

    public final mn3 o() {
        return this.encryptedKeyset_;
    }
}
