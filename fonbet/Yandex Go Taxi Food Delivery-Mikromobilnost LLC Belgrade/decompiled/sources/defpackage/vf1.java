package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class vf1 extends GeneratedMessageLite implements yt10 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final vf1 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private jg1 aesCtrKey_;
    private mou hmacKey_;
    private int version_;

    static {
        vf1 vf1Var = new vf1();
        DEFAULT_INSTANCE = vf1Var;
        GeneratedMessageLite.t(vf1.class, vf1Var);
    }

    public static uf1 D() {
        return (uf1) DEFAULT_INSTANCE.h();
    }

    public static vf1 E(ByteString byteString, oyo oyoVar) {
        return (vf1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(vf1 vf1Var) {
        vf1Var.version_ = 0;
    }

    public static void y(vf1 vf1Var, jg1 jg1Var) {
        vf1Var.getClass();
        jg1Var.getClass();
        vf1Var.aesCtrKey_ = jg1Var;
    }

    public static void z(vf1 vf1Var, mou mouVar) {
        vf1Var.getClass();
        mouVar.getClass();
        vf1Var.hmacKey_ = mouVar;
    }

    public final jg1 A() {
        jg1 jg1Var = this.aesCtrKey_;
        return jg1Var == null ? jg1.A() : jg1Var;
    }

    public final mou B() {
        mou mouVar = this.hmacKey_;
        return mouVar == null ? mou.A() : mouVar;
    }

    public final int C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (tf1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new vf1();
            case 2:
                return new uf1(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (vf1.class) {
                    try {
                        nf90Var = PARSER;
                        if (nf90Var == null) {
                            nf90Var = new nxs(DEFAULT_INSTANCE);
                            PARSER = nf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.vt10
    public final /* bridge */ /* synthetic */ k newBuilderForType() {
        return newBuilderForType();
    }
}
