package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class vhf extends c {
    private static final vhf DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile m7k PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private whf params_;
    private int version_;

    static {
        vhf vhfVar = new vhf();
        DEFAULT_INSTANCE = vhfVar;
        c.l(vhf.class, vhfVar);
    }

    public static void m(vhf vhfVar) {
        vhfVar.version_ = 0;
    }

    public static void n(vhf vhfVar, whf whfVar) {
        vhfVar.getClass();
        whfVar.getClass();
        vhfVar.params_ = whfVar;
    }

    public static uhf q() {
        return (uhf) DEFAULT_INSTANCE.e();
    }

    public static vhf r(mn3 mn3Var, y0c y0cVar) {
        return (vhf) c.j(DEFAULT_INSTANCE, mn3Var, y0cVar);
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
                return new vhf();
            case 4:
                return new uhf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (vhf.class) {
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

    public final whf o() {
        whf whfVar = this.params_;
        return whfVar == null ? whf.m() : whfVar;
    }

    public final int p() {
        return this.version_;
    }
}
