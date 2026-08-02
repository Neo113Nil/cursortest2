package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class zf1 extends GeneratedMessageLite implements yt10 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final zf1 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER;
    private mg1 aesCtrKeyFormat_;
    private qou hmacKeyFormat_;

    static {
        zf1 zf1Var = new zf1();
        DEFAULT_INSTANCE = zf1Var;
        GeneratedMessageLite.t(zf1.class, zf1Var);
    }

    public static yf1 B() {
        return (yf1) DEFAULT_INSTANCE.h();
    }

    public static zf1 C(ByteString byteString, oyo oyoVar) {
        return (zf1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(zf1 zf1Var, mg1 mg1Var) {
        zf1Var.getClass();
        zf1Var.aesCtrKeyFormat_ = mg1Var;
    }

    public static void y(zf1 zf1Var, qou qouVar) {
        zf1Var.getClass();
        zf1Var.hmacKeyFormat_ = qouVar;
    }

    public final qou A() {
        qou qouVar = this.hmacKeyFormat_;
        return qouVar == null ? qou.z() : qouVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (xf1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new zf1();
            case 2:
                return new yf1(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (zf1.class) {
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

    public final mg1 z() {
        mg1 mg1Var = this.aesCtrKeyFormat_;
        return mg1Var == null ? mg1.z() : mg1Var;
    }
}
