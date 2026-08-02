package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;
import java.util.List;

/* loaded from: classes3.dex */
public final class ncf extends c {
    private static final ncf DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private qse key_ = azm.d;
    private int primaryKeyId_;

    static {
        ncf ncfVar = new ncf();
        DEFAULT_INSTANCE = ncfVar;
        c.l(ncf.class, ncfVar);
    }

    public static void m(ncf ncfVar, int i) {
        ncfVar.primaryKeyId_ = i;
    }

    public static void n(ncf ncfVar, mcf mcfVar) {
        ncfVar.getClass();
        qse qseVar = ncfVar.key_;
        if (!((t8) qseVar).a) {
            int size = qseVar.size();
            ncfVar.key_ = qseVar.b(size == 0 ? 10 : size * 2);
        }
        ncfVar.key_.add(mcfVar);
    }

    public static kcf s() {
        return (kcf) DEFAULT_INSTANCE.e();
    }

    public static ncf t(byte[] bArr, y0c y0cVar) {
        return (ncf) c.k(DEFAULT_INSTANCE, bArr, y0cVar);
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
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", mcf.class});
            case 3:
                return new ncf();
            case 4:
                return new kcf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (ncf.class) {
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

    public final mcf o(int i) {
        return (mcf) this.key_.get(i);
    }

    public final int p() {
        return this.key_.size();
    }

    public final List q() {
        return this.key_;
    }

    public final int r() {
        return this.primaryKeyId_;
    }
}
